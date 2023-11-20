package com.rchfullstack;

import java.util.LinkedHashSet;
import java.util.Set;
public class Array7 {
    public void exerSeven(){
        int[] numbers = {1, 2, 4, 7, 9, 12, 1, 2, 4, 7};

        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        System.out.print("Array: ");
        for (int number : uniqueNumbers) {
            System.out.print(number + " ");
        }

        System.out.print("\nOdd Array: ");
        for (int number : uniqueNumbers) {
            if(number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    }
}
