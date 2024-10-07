package io.codeforall.fanSTATICs_;

import io.codeforall.fanSTATICs_.enemies.ArmouredEnemy;

public class Game {
    public GameObjects[] gameObjects;
    private int numberObjects;
    public SniperRifle sniperRifle = new SniperRifle(10);
    public int shotsFired;

    public Game(int numberObjects) {
        createGameObjects();
        this.numberObjects = numberObjects;
    }

    public void createGameObjects() {
        gameObjects = new GameObjects[numberObjects];
        for (int i = 0; i < numberObjects; i++) {
            gameObjects[i] = GameObjects.typeCreated();
            System.out.println(gameObjects[i] + " " + gameObjects[i].health + " " + gameObjects[i].armor);
            for (GameObjects g : gameObjects) {
                System.out.println(g);
                //sniperRifle.shoot(g);
            }
        }


    }
        /*for (GameObjects g : gameObjects){;
            //System.out.println(g.getMessage());
            System.out.println(g);
        }*/
}

