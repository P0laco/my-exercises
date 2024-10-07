package io.codeforall.fanSTATICs_.enemies;

public class ArmouredEnemy extends Enemy {
    private String message;

    public ArmouredEnemy(String message){
        this.message = message;
    }
    @Override
    public String getMessage(){
        return message;
    }
    @Override
    public String toString() {
        return "Armoured Enemy";
    }
}
