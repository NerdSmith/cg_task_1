package ru.vsu.cs.draw_object;

import java.awt.*;

import static ru.vsu.cs.util.DrawUtil.drawWithColor;
import static ru.vsu.cs.util.RandomUtil.randInt;

public class Cloud extends DrawingObject {


    public Cloud(Graphics2D gr2d, int posX, int posY, int sizeX, int sizeY, Color color) {
        super(gr2d, posX, posY, sizeX, sizeY, color);
    }

    @Override
    public void draw() {
        drawWithColor(this.gr2d, this.color, () -> {
            int minX = this.posX - this.sizeX / 4;
            int maxX = this.posX + this.sizeX / 4;

            int minY = this.posY - this.sizeY / 4;
            int maxY = this.posY + this.sizeY / 4;

            int minSizeX = this.sizeX / 3;
            int minSizeY = this.sizeY / 3;
            int maxSizeX = this.sizeX / 2;
            int maxSizeY = this.sizeY / 2;

            for (int i = 0; i < randInt(5, 15); i++) {
                drawCloudPart(minX, maxX, minY, maxY, minSizeX, minSizeY, maxSizeX, maxSizeY);
            }
        });
    }

    private void drawCloudPart(int minX,
                               int maxX,
                               int minY,
                               int maxY,
                               int minSizeX,
                               int minSizeY,
                               int maxSizeX,
                               int maxSizeY
    ) {
        int centerX = randInt(minX, maxX);
        int centerY = randInt(minY, maxY);

        int actualSizeX = randInt(minSizeX, maxSizeX);
        int actualSizeY = randInt(minSizeY, maxSizeY);

        this.gr2d.fillOval(centerX - actualSizeX / 2, centerY - actualSizeY / 2, actualSizeX, actualSizeY);
    }
}
