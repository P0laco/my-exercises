package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Position;

abstract  public class Car {

    /** The position of the car on the grid */
    private Position pos;
     public int speed;
    public Car(){
      this.pos = new Position();
      this.speed = 1;

    }
    public Position getPos() {
        return pos;
    }

    public void moveCar() {
        int moves = (int) (Math.random() * 2);
        if (isCrashed()) {
            if (moves == 1) {
                int horizontalMoves = (int) (Math.random() * 2);
                if (horizontalMoves == 1) {
                    pos.setX(pos.getCol() + speed);
                } else {
                    pos.setX(pos.getCol() - speed);
                }
            } else {
                int verticalMoves = (int) (Math.random() * 2);
                if (verticalMoves == 1) {
                    pos.setY(pos.getRow() + speed);
                } else {
                    pos.setY(pos.getRow() - speed);
                }
            }
        }
    }
    public boolean isCrashed() {
        return false;
    }
}
