package io.codeforall.fanSTATICs;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class MyGrid {
    private boolean filled = false;
    private Player player;
    private int col;
    private int row;
    private Rectangle rectangle;
    private Rectangle[][] rectangles;
    public final static int PADDING = 10;
    public final static int CELL_SIZE = 20;

    public MyGrid(int col, int row) {
        this.col = col;
        this.row = row;
        this.rectangle = new Rectangle(PADDING, PADDING, col * CELL_SIZE, row * CELL_SIZE);
        new Player(this);
    }

    public Rectangle[][] getRectangles() {
        return rectangles;
    }

    public int getWidth() {
        return col * CELL_SIZE;
    }

    public int getHeight() {
        return row * CELL_SIZE;
    }

    public void init() {
        rectangle.draw();
        innerGrid();
    }

    public void innerGrid() {
        this.rectangles = new Rectangle[this.col][this.row];
        for (int i = 0; i < this.col; i++) {
            for (int j = 0; j < this.row; j++) {
                Rectangle sRectangle = new Rectangle(PADDING + (CELL_SIZE * i), PADDING + (CELL_SIZE * j), CELL_SIZE, CELL_SIZE);
                this.rectangles[i][j] = sRectangle;
                sRectangle.draw();
            }
        }
    }
    /*public void fillCell() {
        for (int i = 0; i < this.getRectangles().length; i++) {
            for (int j = 0; j < this.getRectangles()[i].length; j++) {
                if (player. == this.getRectangles()[i][j].getX() && player.getY() == this.getRectangles()[i][j].getY()) {
                    grid.getRectangles()[i][j].fill();

                    //grid.getRectangles()[i][j].setColor(Color.BLACK);
                }
                *//*if (player.getX() == grid.getRectangles()[i][j].getX() && player.getY() == grid.getRectangles()[i][j].getY()) {
                    grid.getRectangles()[i][j].fill();
                    grid.getRectangles()[i][j].setColor(Color.WHITE);
                    return;*//*

            }*/



}
