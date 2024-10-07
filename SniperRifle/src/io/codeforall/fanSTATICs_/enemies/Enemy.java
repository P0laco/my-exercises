package io.codeforall.fanSTATICs_.enemies;

import io.codeforall.fanSTATICs_.GameObjects;

public abstract class Enemy extends GameObjects {
    private String message;

    public Enemy(){
        this.message = "Created Enemy";
        super.armor = 100;
        super.health = 100;

    }

    @Override
    public String getMessage(){
        return message;
    }
}
