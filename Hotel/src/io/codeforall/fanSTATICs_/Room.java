package io.codeforall.fanSTATICs_;

public class Room {

    public int id;
    public boolean isAvailable;

    public Room(int id) {
        if (id<0) {
            System.out.println("Error");
        }
        this.id = id ;
        this.isAvailable = true;
    }


}
