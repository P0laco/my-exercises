package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Fan implements KeyboardHandler {

    private Keyboard keyboard;
    private Picture picture;

    public Fan(){
        picture = new Picture(20, 20, "rsc/fan.jpg");
        picture.draw();

        initKeyboard();
    }
    private void initKeyboard(){
        this.keyboard = new Keyboard(this);

        KeyboardEvent moveRight = new KeyboardEvent();
        KeyboardEvent moveLeft = new KeyboardEvent();
        KeyboardEvent moveUp = new KeyboardEvent();
        KeyboardEvent moveDown = new KeyboardEvent();
        moveRight.setKey(KeyboardEvent.KEY_RIGHT);
        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        moveLeft.setKey(KeyboardEvent.KEY_LEFT);
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        moveUp.setKey(KeyboardEvent.KEY_UP);
        moveUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        moveDown.setKey(KeyboardEvent.KEY_DOWN);
        moveDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(moveRight);
        keyboard.addEventListener(moveLeft);
        keyboard.addEventListener(moveUp);
        keyboard.addEventListener(moveDown);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()){
            case KeyboardEvent.KEY_RIGHT:
                picture.translate(100, 0);
                break;
            case KeyboardEvent.KEY_LEFT:
                picture.translate(-100, 0);
                break;
            case KeyboardEvent.KEY_UP:
                picture.translate(0,-100);
                break;
            case KeyboardEvent.KEY_DOWN:
                picture.translate(0,100);
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }
}
