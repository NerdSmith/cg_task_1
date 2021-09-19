package ru.vsu.cs.util;

import java.util.Random;

public class RandomUtil {
    public static int randInt(int i1, int i2) {
        Random rnd = new Random();
        return rnd.nextInt(i2 - i1) + i1;
    }
}
