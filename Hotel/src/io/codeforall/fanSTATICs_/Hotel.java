package io.codeforall.fanSTATICs_;

public class Hotel {

    public Room[] hotelRoom;

    public Hotel(int numberOfRooms) {
        this.hotelRoom = new Room[numberOfRooms];
        createRoom(numberOfRooms);
    }

    public void createRoom(int numberOfRooms){
          for (int i = 0; i < numberOfRooms; i++){
              hotelRoom[i] = new Room(i);
    }
}

    public int verifyRoom(){
       for(int i = 0; i < hotelRoom.length; i++) {
           if (hotelRoom[i].isAvailable){
               return i;
           }
           hotelRoom[i].isAvailable = false;
       }
       return -1;
    }
}

