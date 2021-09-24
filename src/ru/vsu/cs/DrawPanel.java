package ru.vsu.cs;

import ru.vsu.cs.draw_object.Cloud;
import ru.vsu.cs.draw_object.Sky;
import ru.vsu.cs.draw_object.World;
import ru.vsu.cs.draw_object.plane.Cabin;
import ru.vsu.cs.draw_object.plane.Frame;
import ru.vsu.cs.draw_object.plane.Plane;
import ru.vsu.cs.draw_object.plane.WingPair;

import javax.swing.*;
import java.awt.*;

import static ru.vsu.cs.util.RandomUtil.randDouble;
import static ru.vsu.cs.util.RandomUtil.randInt;

public class DrawPanel extends JPanel {
    private final World world;
    public DrawPanel() {
        world = new World(0, 0, 1, 1, Color.WHITE); // compiler is God // day 1

        world.addDrawingObject(new Sky(0, 0 ,1, 1,  new Color(19, 162, 253))); // day 2

        for (int i = 0; i < 5; i++) { // day 3
            world.addDrawingObject(
                    new Cloud(
                            randDouble(0, 1),
                            randDouble(0, 1),
                            randDouble(0.33, 1) / 2,
                            randDouble(0.33, 1) / 2,
                            new Color(255, 255, 255, randInt(0, 255))
                    )
            );
        }

        Plane plane = new Plane(0.1, 0.1, 0.8, 0.8,  new Color(0x64696E));
        plane.addDrawingObject(new Frame(0.1, 0.4, 0.8, 0.2, new Color(0x64696E))); // day 4
        plane.addDrawingObject(new Cabin(0.65, 0.45, 0.1,  0.1, Color.BLACK)); // day 5
        plane.addDrawingObject(new WingPair(0.4, 0.1, 0.2, 0.4, new Color(0x64696E))); // day 6
        plane.addDrawingObject(new WingPair(0.15, 0.3, 0.1, 0.2, new Color(0x64696E))); // day 6

        world.addDrawingObject(plane);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr2d = (Graphics2D) g;
        this.world.draw(gr2d, this.getWidth(), this.getHeight());
    }
}
