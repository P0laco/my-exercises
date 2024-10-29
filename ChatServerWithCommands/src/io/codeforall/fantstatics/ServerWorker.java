package io.codeforall.fantstatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.logging.Logger;

public class ServerWorker implements Runnable {

    private Socket clientSocket;
    private BufferedReader inputReader;
    private PrintWriter outputWriter;
    private Server server = new Server();
    private String username;

    public ServerWorker(Socket clientSocket) {
        this.clientSocket = clientSocket;
        server.addClientHandler(this);
    }

    @Override
    public void run() {
        try {
            inputReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            outputWriter = new PrintWriter(clientSocket.getOutputStream(), true);

            outputWriter.println("Set your username:");
            username = inputReader.readLine();

            String message;
            while ((message = inputReader.readLine()) != null) {
                System.out.println("Received " + message);
                if (message.startsWith("/whisper")) {
                    String[] parts = message.split(" ", 3);
                    if (parts.length < 3){
                        SendMessage("Cant use this method!");
                        continue;
                    }
                    String receivingUser = parts[1];
                    String receivingMessage = parts[2];
                    sendWhisper(receivingUser, receivingMessage);
                }else {
                    server.sendMessageToAllClients(message, this);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            inputReader.close();
            outputWriter.close();
            clientSocket.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    private void sendWhisper(String receivingUserName, String message) {
        boolean clientFound = true;
        synchronized (Server.linkedList) {
            for (ServerWorker handler : Server.linkedList) {
                if (handler.username.equals(receivingUserName)) {
                    handler.SendMessage("Message from: " + username + ": " + message);
                    clientFound = false;
                    break;
                }
            }
        }
    }
    public void SendMessage(String message) {
        outputWriter.println(message);
    }
}
