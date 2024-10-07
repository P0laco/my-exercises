package io.codeforall.fanSTATICs_;

public class Tree extends GameObjects {
    private String message;

    public Tree(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
    @Override
    public String toString() {
        return "Tree";
    }
}
