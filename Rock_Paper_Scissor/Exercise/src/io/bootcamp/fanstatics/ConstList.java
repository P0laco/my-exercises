package io.bootcamp.fanstatics;

public enum ConstList {
    ROCK,
    PAPER,
    SCISSOR;

    public static ConstList ShowOption() {
        ConstList randomHand = ConstList.values()[(int) (Math.random() * 3)];
        return randomHand;
    }
}
