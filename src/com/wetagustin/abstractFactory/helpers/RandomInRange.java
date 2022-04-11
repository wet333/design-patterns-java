package com.wetagustin.abstractFactory.helpers;

import java.util.Random;

public class RandomInRange {

    public static int getRandomInt(int max, int min) {
        Random r = new Random();
        return r.nextInt(max-min) + min;
    }

}
