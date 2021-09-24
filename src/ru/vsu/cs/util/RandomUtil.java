package ru.vsu.cs.util;

import java.util.Random;

public class RandomUtil {
    private static final Random rnd = new Random();

    public static int randInt(int i1, int i2) {
        return rnd.nextInt(i2 - i1) + i1;
    }

    public static double randDouble(double i1, double i2) {
        return i1 + (i2 - i1) * rnd.nextDouble();
    }
}
