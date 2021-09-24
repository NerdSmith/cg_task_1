package ru.vsu.cs.draw_object;

import java.awt.*;

public class World extends CompositeDrawingObject {

    public World(int posCofX, int posCofY, int sizeCofX, int sizeCofY, Color color) {
        super(posCofX, posCofY, sizeCofX, sizeCofY, color);
    }

    @Override
    public void draw(Graphics2D gr2d, int windowCurrWidth, int windowCurrHeight) {

    }
}
