package com.rchfullstack;

import java.util.Random;

public class Array13 {
    public void exerThirteen(){
        int size = 10;
        int[] randomNumbers = new int[size];
        int[] rearrangedNumbers = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = random.nextInt(100);
        }

        int evenIndex = size - 1;
        int oddIndex = 0;

        for (int i = 0; i < size; i++) {
            if (randomNumbers[i] % 2 == 0) {
                rearrangedNumbers[evenIndex--] = randomNumbers[i];
            } else {
                rearrangedNumbers[oddIndex++] = randomNumbers[i];
            }
        }

        System.out.print("Orginal Array (Random Numbers): ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Rearranged Array (Even at Rear, Odd at Front): ");
        for (int num : rearrangedNumbers) {
            System.out.print(num + " ");
        }
    }
}
