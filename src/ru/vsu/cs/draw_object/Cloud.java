package ru.vsu.cs.draw_object;

import java.awt.*;

import static ru.vsu.cs.util.DrawUtil.drawWithColor;
import static ru.vsu.cs.util.RandomUtil.randDouble;
import static ru.vsu.cs.util.RandomUtil.randInt;

public class Cloud extends DrawingObject {
    private final double minCofX;
    private final double maxCofX;
    private final double minCofY;
    private final double maxCofY;

    private final double minCofSizeX;
    private final double minCofSizeY;
    private final double maxCofSizeX;
    private final double maxCofSizeY;

    private final double centerCofX;
    private final double centerCofY;

    private final double actualCofSizeX;
    private final double actualCofSizeY;

    public Cloud(double posCofX, double posCofY, double sizeCofX, double sizeCofY, Color color) {
        super(posCofX, posCofY, sizeCofX, sizeCofY, color);
        this.minCofX = (this.posCofX - this.sizeCofX / 4);
        this.maxCofX = (this.posCofX + this.sizeCofX / 4);

        this.minCofY = (this.posCofY - this.sizeCofY / 4);
        this.maxCofY = (this.posCofY + this.sizeCofY / 4);

        this.minCofSizeX = this.sizeCofX / 3;
        this.minCofSizeY = this.sizeCofY / 3;
        this.maxCofSizeX = this.sizeCofX / 2;
        this.maxCofSizeY = this.sizeCofY / 2;

        this.centerCofX = randDouble(minCofX, maxCofX);
        this.centerCofY = randDouble(minCofY, maxCofY);

        this.actualCofSizeX = randDouble(minCofSizeX, maxCofSizeX);
        this.actualCofSizeY = randDouble(minCofSizeY, maxCofSizeY);
    }

    @Override
    public void draw(Graphics2D gr2d, int windowCurrWidth, int windowCurrHeight) {
        drawWithColor(gr2d, this.color, () -> {
            for (int i = 0; i < randInt(5, 15); i++) {
                drawCloudPart(gr2d, windowCurrWidth, windowCurrHeight);
            }
        });
    }

    private void drawCloudPart(Graphics2D gr2d, int windowCurrWidth, int windowCurrHeight) {

        gr2d.fillOval(
                (int) ((centerCofX - actualCofSizeX / 2) * windowCurrWidth),
                (int) ((centerCofY - actualCofSizeY / 2) * windowCurrHeight),
                (int) (actualCofSizeX * windowCurrWidth),
                (int) (actualCofSizeY * windowCurrHeight)
        );
    }
}
