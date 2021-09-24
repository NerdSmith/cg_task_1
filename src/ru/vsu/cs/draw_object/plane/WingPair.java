package ru.vsu.cs.draw_object.plane;

import ru.vsu.cs.draw_object.DrawingObject;

import java.awt.*;
import java.util.Arrays;

import static ru.vsu.cs.util.ArrayUtil.multiplyArrayBy;
import static ru.vsu.cs.util.ArrayUtil.toIntArray;
import static ru.vsu.cs.util.DrawUtil.drawWithColor;

public class WingPair extends DrawingObject {
    private final double[] xCofDots;
    private final double[] yCofDots;
    private final double[] yReversedDots;

    public WingPair(double posCofX, double posCofY, double sizeCofX, double sizeCofY, Color color) {
        super(posCofX, posCofY, sizeCofX, sizeCofY, color);
        this.xCofDots = new double[]{
                posCofX,
                posCofX - sizeCofX / 4 + sizeCofX / 2,
                posCofX + sizeCofX / 2,
                posCofX
        };
        this.yCofDots = new double[]{
                posCofY,
                posCofY,
                posCofY + sizeCofY,
                posCofY + sizeCofY
        };
        this.yReversedDots = Arrays.stream(this.yCofDots).map(element -> 2 * posCofY - element + 2 * sizeCofY).toArray();
    }

    private void drawWing(Graphics2D gr2d, int[] x, int[] y) {
        gr2d.fillPolygon(x, y, x.length);
    }

    @Override
    public void draw(Graphics2D gr2d, int windowCurrWidth, int windowCurrHeight) {
        drawWithColor(gr2d, this.color, () -> {
            drawWing(gr2d,
                    toIntArray(multiplyArrayBy(xCofDots, windowCurrWidth)),
                    toIntArray(multiplyArrayBy(yCofDots, windowCurrHeight))
            );
            drawWing(gr2d,
                    toIntArray(multiplyArrayBy(xCofDots, windowCurrWidth)),
                    toIntArray(multiplyArrayBy(yReversedDots, windowCurrHeight))
            );
        });
    }
}
