package io.codeforall.fanSTATICs;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Player implements KeyboardHandler {
    private MyGrid grid;
    private Rectangle player;
    private Keyboard keyboard;

    public Player(MyGrid grid) {
        this.player = new Rectangle(MyGrid.PADDING, MyGrid.PADDING, MyGrid.CELL_SIZE, MyGrid.CELL_SIZE);
        player.fill();
        player.setColor(Color.GREEN);
        this.grid = grid;

        initKeyboard();
    }

    private void initKeyboard() {
        this.keyboard = new Keyboard(this);

        KeyboardEvent moveRight = new KeyboardEvent();
        KeyboardEvent moveDown = new KeyboardEvent();
        KeyboardEvent moveUp = new KeyboardEvent();
        KeyboardEvent moveLeft = new KeyboardEvent();
        KeyboardEvent fillCell = new KeyboardEvent();
        KeyboardEvent clearCell = new KeyboardEvent();
        clearCell.setKey(KeyboardEvent.KEY_SPACE);
        clearCell.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        fillCell.setKey(KeyboardEvent.KEY_SPACE);
        fillCell.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        moveRight.setKey(KeyboardEvent.KEY_D);
        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        moveLeft.setKey(KeyboardEvent.KEY_A);
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        moveDown.setKey(KeyboardEvent.KEY_S);
        moveDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        moveUp.setKey(KeyboardEvent.KEY_W);
        moveUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        keyboard.addEventListener(moveRight);
        keyboard.addEventListener(moveUp);
        keyboard.addEventListener(moveLeft);
        keyboard.addEventListener(moveDown);
        keyboard.addEventListener(fillCell);
        keyboard.addEventListener(clearCell);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_D:
                if (this.player.getX() < this.grid.getWidth() - MyGrid.CELL_SIZE) {
                    this.player.translate(MyGrid.CELL_SIZE, 0);
                }
                break;
            case KeyboardEvent.KEY_A:
                if (this.player.getX() > MyGrid.PADDING) {
                    this.player.translate(-MyGrid.CELL_SIZE, 0);
                }
                break;
            case KeyboardEvent.KEY_W:
                if (this.player.getY() > MyGrid.PADDING) {
                    this.player.translate(0, -MyGrid.CELL_SIZE);
                }
                break;
            case KeyboardEvent.KEY_S:
                if (player.getY() < (this.grid.getHeight() - MyGrid.CELL_SIZE)) {
                    this.player.translate(0, MyGrid.CELL_SIZE);
                }
                break;
            /*case KeyboardEvent.KEY_SPACE:
                fillCell();
                break;*/
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_SPACE:
                break;
        }
    }


        }
    }
}
