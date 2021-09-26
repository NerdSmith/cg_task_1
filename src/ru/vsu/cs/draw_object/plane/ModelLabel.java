package ru.vsu.cs.draw_object.plane;

import ru.vsu.cs.draw_object.DrawingObject;

import java.awt.*;

import static ru.vsu.cs.util.DrawUtil.drawWithColor;
import static ru.vsu.cs.util.DrawUtil.drawWithFont;

public class ModelLabel extends DrawingObject {
    private String modelName = "default";

    public ModelLabel(double posCofX, double posCofY, double sizeCofX, double sizeCofY, Color color) {
        super(posCofX, posCofY, sizeCofX, sizeCofY, color);
    }

    @Override
    public void draw(Graphics2D gr2d, int windowCurrWidth, int windowCurrHeight) {
        drawWithColor(
                gr2d,
                this.color,
                () -> {
                    drawWithFont(
                            gr2d,
                            new Font(
                                    "Arial",
                                    Font.PLAIN,
                                    Math.min(
                                        (int) (0.1 * sizeCofX * windowCurrWidth),
                                        (int) (0.1 * sizeCofY * windowCurrHeight)
                                    )
                            ),
                            () -> {
                                gr2d.drawString(
                                        this.modelName,
                                        (int) (posCofX * windowCurrWidth),
                                        (int) (posCofY * windowCurrHeight)
                                );
                            }
                    );
                }
        );
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
