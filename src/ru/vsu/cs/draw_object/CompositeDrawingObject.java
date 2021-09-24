package ru.vsu.cs.draw_object;

import java.awt.*;
import java.util.ArrayList;

public abstract class CompositeDrawingObject extends DrawingObject {
    private ArrayList<DrawingObject> drawingObjects = new ArrayList<>();

    public CompositeDrawingObject(double posCofX, double posCofY, double sizeCofX, double sizeCofY, Color color) {
        super(posCofX, posCofY, sizeCofX, sizeCofY, color);
    }

    public void addDrawingObjects(ArrayList<DrawingObject> drawingObjects) {
        this.drawingObjects.addAll(drawingObjects);
    }

    public void addDrawingObject(DrawingObject drawingObjects) {
        this.drawingObjects.add(drawingObjects);
    }

    @Override
    public void draw(Graphics2D gr2d, int windowCurrWidth, int windowCurrHeight) {
        if (drawingObjects != null) {
            this.drawingObjects.forEach(drawingObject -> drawingObject.draw(gr2d, windowCurrWidth, windowCurrHeight));
        }
    }
}
