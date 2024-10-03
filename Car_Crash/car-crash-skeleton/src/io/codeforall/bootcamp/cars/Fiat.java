package io.codeforall.bootcamp.cars;

public class Fiat extends Car{
    public String name;
    public Fiat(String name){
        this.name = name;

    }
    @Override
    public String toString(){
        return "F";
    }
}
