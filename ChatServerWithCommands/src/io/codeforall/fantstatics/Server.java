package io.codeforall.fantstatics;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.LinkedList;

public class Server {

    private static final int PORT = 6734;
    public static LinkedList<ServerWorker> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        System.out.println("Chat server started!");

        try(ServerSocket serverSocket = new ServerSocket(PORT);) {

            while(true){
                new Thread(new ServerWorker(serverSocket.accept())).start();
            }
        } catch (IOException e) {
           e.getMessage();
        }
    }

    public void addClientHandler(ServerWorker handler) {
        synchronized (linkedList) {
            linkedList.add(handler);
        }
    }

    public void sendMessageToAllClients(String message , ServerWorker sender) {
        synchronized (linkedList) {
            for (ServerWorker handler : linkedList) {
                if (handler != sender) {
                    handler.SendMessage(message);
                }
            }
        }
    }



}
