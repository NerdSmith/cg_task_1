package ru.vsu.cs.draw_object;

import java.awt.*;

public abstract class DrawingObject {
    protected final double posCofX;
    protected final double posCofY;
    protected final double sizeCofX;
    protected final double sizeCofY;
    protected final Color color;

    public DrawingObject(double posCofX, double posCofY, double sizeCofX, double sizeCofY, Color color) {
        this.posCofX = posCofX;
        this.posCofY = posCofY;
        this.sizeCofX = sizeCofX;
        this.sizeCofY = sizeCofY;
        this.color = color;
    }
    public abstract void draw(Graphics2D gr2d, int windowCurrWidth, int windowCurrHeight);
}
