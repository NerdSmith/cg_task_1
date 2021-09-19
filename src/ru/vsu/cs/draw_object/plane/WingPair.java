package ru.vsu.cs.draw_object.plane;

import ru.vsu.cs.draw_object.DrawingObject;

import java.awt.*;

import static ru.vsu.cs.util.DrawUtil.drawWithColor;

public class WingPair extends DrawingObject {
    public WingPair(Graphics2D gr2d, int posX, int posY, int sizeX, int sizeY, Color color) {
        super(gr2d, posX, posY, sizeX, sizeY, color);
    }

    @Override
    public void draw() {
        int[] x = {posX - sizeX / 2, posX - sizeX / 4, posX, posX - sizeX / 2};
        int[] y = {posY - sizeY / 2, posY - sizeY / 2, posY + sizeY / 2, posY + sizeY / 2};
        drawWithColor(this.gr2d, this.color, () -> {
            drawWing(x, y);
            for (int i = 0; i < y.length; i++) {
                y[i] = posY - y[i] + posY + sizeY;
            }
            drawWing(x, y);
        });
    }

    private void drawWing(int[] x, int[] y) {
        this.gr2d.fillPolygon(x, y, x.length);
    }
}
