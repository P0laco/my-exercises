package io.codeforall.fanSTATICs_;

public class Client {

    public Hotel clientHotel;

    public Client(Hotel clientHotel){
        this.clientHotel= clientHotel;
    }

    public void checkIn(){
        if (clientHotel.verifyRoom() != -1){
            System.out.println("Your room is room number " + clientHotel.verifyRoom());
        } else if (clientHotel.verifyRoom() == -1) {
            System.out.println("There are no rooms available");
        }

    }

    public void checkOut(){
    }
}
