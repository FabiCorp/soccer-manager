package com.manager.soccer.model;

public class Scheduler {

    public static void scheduler(int number) {
        int[] numbers = new int[number];
        for(int i = 0; i < number; i++) {
            numbers[i] = i;
        }
        for(int k = 0; k < number -1; k++) {
            System.out.println("Spieltag" + k);
            for (int i = 1; i < number / 2; i++) {
                int first = (i + k) % (number - 1);
                if (first < 0) {
                    first = first + (number - 1);
                }
                int second = (-i + k) % (number - 1);
                if (second < 0) {
                    second = second + (number - 1);
                }
                System.out.println(first + "," + second);
            }
            int firstLeft = k;
            int secondLeft = number - 1;
            System.out.println(firstLeft + "," + secondLeft);
        }
    }
}
