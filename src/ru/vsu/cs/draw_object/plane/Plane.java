package ru.vsu.cs.draw_object.plane;

import ru.vsu.cs.draw_object.DrawingObject;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

public class Plane extends DrawingObject {
    public Plane(Graphics2D gr2d, int posX, int posY, int sizeX, int sizeY, Color color) {
        super(gr2d, posX, posY, sizeX, sizeY, color);
    }

    @Override
    public void draw() {
        Queue<DrawingObject> drawingObjects = new LinkedList<>();

        drawingObjects.add(new Frame(gr2d, posX, posY, sizeX, sizeY / 4, new Color(0x64696E)));

        int cabinSizeX = sizeX / 6;
        int cabinSizeY = sizeY / 8;
        drawingObjects.add(new Cabin(gr2d, posX + sizeX / 4, posY, cabinSizeX,  cabinSizeY, Color.BLACK));

        drawingObjects.add(new WingPair(gr2d, posX, posY - sizeY / 4, sizeX / 6, sizeY / 2, new Color(0x64696E)));
        drawingObjects.add(new WingPair(gr2d, posX - sizeX / 3, posY - sizeY / 8, sizeX / 6, sizeY / 4, new Color(0x64696E)));

        drawingObjects.forEach(DrawingObject::draw);
    }
}
