package ru.vsu.cs.draw_object.plane;

import ru.vsu.cs.draw_object.DrawingObject;
import ru.vsu.cs.draw_object.CompositeDrawingObject;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

public class Plane extends CompositeDrawingObject {

    public Plane(double posCofX, double posCofY, double sizeCofX, double sizeCofY, Color color) {
        super(posCofX, posCofY, sizeCofX, sizeCofY, color);
    }

//    @Override
//    public void draw() {
//        Queue<DrawingObject> drawingObjects = new LinkedList<>();
//
//        drawingObjects.add(new Frame(gr2d, posCofX, posCofY, sizeCofX, sizeCofY / 4, new Color(0x64696E)));
//
//        double cabinSizeX = sizeCofX / 6;
//        double cabinSizeY = sizeCofY / 8;
//        drawingObjects.add(new Cabin(gr2d, posCofX + sizeCofX / 4, posCofY, cabinSizeX,  cabinSizeY, Color.BLACK));
//
//        drawingObjects.add(new WingPair(gr2d, posCofX, posCofY - sizeCofY / 4, sizeCofX / 6, sizeCofY / 2, new Color(0x64696E)));
//        drawingObjects.add(new WingPair(gr2d, posCofX - sizeCofX / 3, posCofY - sizeCofY / 8, sizeCofX / 6, sizeCofY / 4, new Color(0x64696E)));
//
//        drawingObjects.forEach(DrawingObject::draw);
//    }
}
