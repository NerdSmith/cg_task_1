package ru.vsu.cs.draw_object;

import java.awt.*;

import static ru.vsu.cs.util.DrawUtil.drawWithColor;

public class Sky extends DrawingObject {
    public Sky(Graphics2D gr2d, int posX, int posY, int sizeX, int sizeY, Color color) {
        super(gr2d, posX, posY, sizeX, sizeY, color);
    }

    public void draw() {
        drawWithColor(this.gr2d, this.color, () -> {
           this.gr2d.fillRect(posX, posY, sizeX, sizeY);
        });
    }
}
