package ru.job4j.pingpong;

import javafx.scene.shape.Rectangle;

public class RectangleMove implements Runnable {
    // Квадратик
    private final Rectangle rect;
    // V = 1 pix/ms, скорость перемещения
    int i = 1;

    public RectangleMove(Rectangle rect) {
        this.rect = rect;
    }

    @Override
    public void run() {
        while (true) {
            // выбор направления перемещения
            this.rect.setX(this.rect.getX() + this.i);
            // ограничения значения направления по площади
            if(this.rect.getX()>300||this.rect.getX()<0)
            {
                this.i=-this.i;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}