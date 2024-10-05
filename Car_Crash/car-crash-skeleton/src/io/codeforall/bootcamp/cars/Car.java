package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Field;
import io.codeforall.bootcamp.field.Position;

abstract public class Car {

    /**
     * The position of the car on the grid
     */
    private Position pos;
    public int speed;

    public Car() {
        this.pos = new Position();
        this.speed = 1;

    }

    public Position getPos() {
        return pos;
    }

    public void moveCar() {
        int moves = (int) (Math.random() * 2);
        if (!isCrashed()) {
            if (moves == 1/* && pos.getCol() < Field.getWidth() && pos.getCol() >= 0*/) {
                int horizontalMoves = (int) (Math.random() * 2);
                if (horizontalMoves == 1 && pos.getCol() < Field.getWidth() && pos.getCol() >= 0) {
                    pos.setX(pos.getCol() + speed);
                } else if (horizontalMoves == 0 && pos.getCol() <= Field.getWidth() && pos.getCol() != 0){
                    pos.setX(pos.getCol() - speed);
                }
            } else if (moves == 0 /*&& Field.getHeight() > pos.getRow() && pos.getRow() >= 0*/) {
                int verticalMoves = (int) (Math.random() * 2);
                if (verticalMoves == 1 && pos.getRow() < Field.getHeight() && pos.getRow() >= 0) {
                    pos.setY(pos.getRow() + speed);
                } else if (verticalMoves == 0  && pos.getRow() <= Field.getHeight() && pos.getRow() != 0){
                    pos.setY(pos.getRow() - speed);
                }
            }
        }
    }

    public boolean isCrashed() {

        return false;
    }
}
