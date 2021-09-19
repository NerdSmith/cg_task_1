package ru.vsu.cs.draw_object.plane;

import ru.vsu.cs.draw_object.DrawingObject;

import java.awt.*;

import static ru.vsu.cs.util.DrawUtil.drawWithColor;

public class Cabin extends DrawingObject {

    public Cabin(Graphics2D gr2d, int posX, int posY, int sizeX, int sizeY, Color color) {
        super(gr2d, posX, posY, sizeX, sizeY, color);
    }

    @Override
    public void draw() {
        drawWithColor(this.gr2d, this.color, () -> {
            this.gr2d.fillOval(this.posX - sizeX / 2, this.posY - sizeY / 2, this.sizeX, this.sizeY);
        });
    }
}
