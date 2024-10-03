package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.Game;

public class CarFactory {

    public CarFactory(){

    }
    public static  Car getNewCar() {
        int numberCar = (int) (Math.random() * 4);
        if (numberCar <= 1){
            return new Fiat("F");
        }
        return new Mustang();
    }
}
