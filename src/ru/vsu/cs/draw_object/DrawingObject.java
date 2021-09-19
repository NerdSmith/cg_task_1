package ru.vsu.cs.draw_object;

import java.awt.*;

public abstract class DrawingObject {
    protected final Graphics2D gr2d;
    protected final int posX;
    protected final int posY;
    protected final int sizeX;
    protected final int sizeY;
    protected final Color color;

    public DrawingObject(Graphics2D gr2d, int posX, int posY, int sizeX, int sizeY, Color color) {
        this.gr2d = gr2d;
        this.posX = posX;
        this.posY = posY;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.color = color;
    }
    public abstract void draw();
}
