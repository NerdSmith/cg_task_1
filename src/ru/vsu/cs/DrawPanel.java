package ru.vsu.cs;

import ru.vsu.cs.draw_object.Cloud;
import ru.vsu.cs.draw_object.DrawingObject;
import ru.vsu.cs.draw_object.Sky;
import ru.vsu.cs.draw_object.plane.Plane;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

import static ru.vsu.cs.util.RandomUtil.randInt;

public class DrawPanel extends JPanel {

    public DrawPanel() {
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
//        Graphics2D gr2d = (Graphics2D) g;
//
//        Queue<DrawingObject> drawingObjects = new LinkedList<>();
//
//        drawingObjects.add(new Sky(gr2d, 0, 0 , this.getWidth(), this.getHeight(), new Color(19, 162, 253)));
//        for (int i = 0; i < 5; i++) {
//            drawingObjects.add(new Cloud(gr2d,
//                    randInt(0, this.getWidth()),
//                    randInt(0, this.getHeight()),
//                    randInt(this.getWidth() / 3, this.getWidth()) / 2,
//                    randInt(this.getHeight() / 3, this.getHeight()) / 2,
//                    new Color(255, 255, 255, randInt(0, 255))));
//        }
//        drawingObjects.add(new Plane(gr2d, this.getWidth() / 2, this.getHeight() / 2, this.getWidth() / 6 * 5, this.getHeight() / 7 * 6,  new Color(0x64696E)));
//
//        drawingObjects.forEach(DrawingObject::draw);
    }
}
