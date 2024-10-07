package io.codeforall.fanSTATICs_;

import io.codeforall.fanSTATICs_.enemies.Enemy;

public class SniperRifle {
    private int bulletDamage;
    public GameObjects gameObjects;
    public SniperRifle(int bulletDamage){
        this.bulletDamage = bulletDamage;
    }
    public void shoot(GameObjects enemy){
        if (enemy.armor > 0) {
            enemy.armor = enemy.armor - bulletDamage;
            System.out.println(enemy.armor);
            return;
        }
        enemy.health = enemy.health - bulletDamage;
        System.out.println(enemy.health);
    }
}
