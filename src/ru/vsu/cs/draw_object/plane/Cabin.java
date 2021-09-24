package ru.vsu.cs.draw_object.plane;

import ru.vsu.cs.draw_object.DrawingObject;

import java.awt.*;

import static ru.vsu.cs.util.DrawUtil.drawWithColor;

public class Cabin extends DrawingObject {
    public Cabin(double posCofX, double posCofY, double sizeCofX, double sizeCofY, Color color) {
        super(posCofX, posCofY, sizeCofX, sizeCofY, color);
    }

    @Override
    public void draw(Graphics2D gr2d, int windowCurrWidth, int windowCurrHeight) {
        drawWithColor(gr2d, this.color, () -> {
            gr2d.fillOval(
                    (int) (this.posCofX - sizeCofX / 2 * windowCurrWidth),
                    (int) (this.posCofY - sizeCofY / 2 * windowCurrHeight),
                    (int) (this.sizeCofX * windowCurrWidth),
                    (int) (this.sizeCofY * windowCurrHeight)
            );
        });
    }
}
