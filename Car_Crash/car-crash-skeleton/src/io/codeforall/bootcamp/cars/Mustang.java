package io.codeforall.bootcamp.cars;

public class Mustang extends Car{

    public String name;
    public int speed;
    public Mustang(){
        this.name = "M";
        this.speed = super.speed + 1;
    }

    @Override
    public String toString(){
        return "M";
    }

}
