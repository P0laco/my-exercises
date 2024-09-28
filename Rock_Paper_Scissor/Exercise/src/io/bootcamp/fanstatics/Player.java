package io.bootcamp.fanstatics;

public class Player {

    private String name;

    public Player(String name){
        this.name = name;
    }
    public Player(){

    }

    public ConstList hand(){
        return ConstList.ShowOption();
    }



}
