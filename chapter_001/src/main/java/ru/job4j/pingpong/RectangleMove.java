package ru.job4j.pingpong;

import javafx.scene.shape.Rectangle;

public class RectangleMove implements Runnable {
    private final Rectangle rect;
    int x = 300;
    public RectangleMove(Rectangle rect) {
        this.rect = rect;
    }

    @Override
    public void run() {
        while(true) { // for(;;) // ещё один вариант

            for (int i = 0; i < x; i++) {
                this.rect.setX(i);
                //  this.rect.setY(i); // если нужно с y

                try {
                    Thread.sleep(38);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = x; i > 0; i--) {
                this.rect.setX(i);
                //  this.rect.setY(i); // если нужно с y
                try {
                    Thread.sleep(38);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}