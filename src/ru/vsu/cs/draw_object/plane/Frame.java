package ru.vsu.cs.draw_object.plane;

import ru.vsu.cs.draw_object.DrawingObject;

import java.awt.*;

import static ru.vsu.cs.util.DrawUtil.drawWithColor;

public class Frame extends DrawingObject {
    public Frame(Graphics2D gr2d, int posX, int posY, int sizeX, int sizeY, Color color) {
        super(gr2d, posX, posY, sizeX, sizeY, color);
    }

    @Override
    public void draw() {
        int[] x = {posX + sizeX / 2, posX + sizeX / 3, posX + sizeX / 6, posX - sizeX / 6, posX - sizeX / 5, posX - sizeX / 2 + sizeX / 20, posX - sizeX / 2};
        int[] y = {posY, posY - sizeY / 6, posY - sizeY / 2, posY - sizeY / 2, posY - sizeY / 6, posY - sizeY / 6, posY};

        drawWithColor(this.gr2d, this.color, () -> {
            drawHalf(x, y);
            for (int i = 0; i < y.length; i++) {
                y[i] = posY - y[i] + posY;
            }
            drawHalf(x, y);
        });
    }

    private void drawHalf(int[] x, int[] y) {
        this.gr2d.fillPolygon(x, y, x.length);
    }
}
