package io.codeforall.fanSTATICs_;

public class Sandbox {
    public static void main(String[] args) {

        Hotel hotel1 = new Hotel(4);

        Client client1 = new Client(hotel1);
        Client client2 = new Client(hotel1);
        Client client3 = new Client(hotel1);
        Client client4 = new Client(hotel1);

        client1.checkIn();
        client2.checkIn();
        //client3.checkIn();
        //client4.checkIn();
    }
}
