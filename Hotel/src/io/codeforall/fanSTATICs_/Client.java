package io.codeforall.fanSTATICs_;

public class Client {
    public Hotel clientHotel;

    public Client(Hotel clientHotel){
        this.clientHotel= clientHotel;
    }

    public void checkIn(int room){
    clientHotel.verifyRoom(room);
    }

    }
    public void checkOut(){

    }
}
