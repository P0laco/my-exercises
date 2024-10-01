package io.codeforall.fanSTATICs_;

public class Hotel {
    public Room[] hotelRoom;
    public int idForClient;


    public Hotel(int numberOfRooms,int idForClient) {
        this.hotelRoom = new Room[numberOfRooms];
        createRoom(numberOfRooms);
        this.idForClient = idForClient;
    }

    public void createRoom(int numberOfRooms){
          for (int i = 0; i < numberOfRooms; i++){
              hotelRoom[i] = new Room(i);
    }
}
    public int verifyRoom(){
       for(int i=0;i< hotelRoom.length; i++) {
            if(hotelRoom[i].isAvailable) {
                hotelRoom[i].isAvailable=false;
                return hotelRoom[i].id;

            }
        }
       return -1;
    }
}
