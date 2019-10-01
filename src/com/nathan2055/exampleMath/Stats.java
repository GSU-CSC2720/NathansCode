package com.nathan2055.exampleMath;

public class Stats {
    private int min = 0, max = 0, avg = 0;

    public void giveValue(int value) {
        if (value < min) {
            min = value;
        } else if (value > max) {
            max = value;
        }
        avg = (avg + value) / 2;

        System.out.println("Minimum: " + min + ", maximum: " + max + ", average: " + avg);
    }
}
