package io.codeforall.bootcamp.field;

public class Position {

    private int x;
    private int y;

    public Position(){
        this.x = startColPos();
        this.y = startRowPos();
    }
    public int startColPos(){
        return (int) (Math.random() * 100);
    }

    public int startRowPos(){
        return (int) (Math.random() * 25);
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
    public int getCol() {
        return x;
    }

    public int getRow() {
        return y;
    }
}
