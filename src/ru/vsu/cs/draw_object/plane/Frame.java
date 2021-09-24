package ru.vsu.cs.draw_object.plane;

import ru.vsu.cs.draw_object.DrawingObject;

import java.awt.*;
import java.util.Arrays;

import static ru.vsu.cs.util.ArrayUtil.multiplyArrayBy;
import static ru.vsu.cs.util.ArrayUtil.toIntArray;
import static ru.vsu.cs.util.DrawUtil.drawWithColor;

public class Frame extends DrawingObject {
    private final double[] xCofDots;
    private final double[] yCofDots;
    private final double[] yReversedDots;

    public Frame(double posCofX, double posCofY, double sizeCofX, double sizeCofY, Color color) {
        super(posCofX, posCofY, sizeCofX, sizeCofY, color);

        this.xCofDots = new double[]{
                posCofX + sizeCofX / 2,
                posCofX + sizeCofX / 3,
                posCofX + sizeCofX / 6,
                posCofX - sizeCofX / 6,
                posCofX - sizeCofX / 5,
                posCofX - sizeCofX / 2 + sizeCofX / 20,
                posCofX - sizeCofX / 2
        };

        this.yCofDots = new double[]{
                posCofY,
                posCofY - sizeCofY / 6,
                posCofY - sizeCofY / 2,
                posCofY - sizeCofY / 2,
                posCofY - sizeCofY / 6,
                posCofY - sizeCofY / 6,
                posCofY
        };

        this.yReversedDots = Arrays.stream(this.yCofDots).map(element -> 2 * posCofY - element).toArray();
    }


    private void drawHalf(Graphics2D gr2d, int[] x, int[] y) {
        gr2d.fillPolygon(x, y, x.length);
    }

    @Override
    public void draw(Graphics2D gr2d, int windowCurrWidth, int windowCurrHeight) {

        drawWithColor(gr2d, this.color, () -> {
            drawHalf(gr2d,
                    toIntArray(multiplyArrayBy(xCofDots, windowCurrWidth)),
                    toIntArray(multiplyArrayBy(yCofDots, windowCurrHeight))
            );
            drawHalf(gr2d,
                    toIntArray(multiplyArrayBy(xCofDots, windowCurrWidth)),
                    toIntArray(multiplyArrayBy(yReversedDots, windowCurrHeight))
            );
        });
    }
}
