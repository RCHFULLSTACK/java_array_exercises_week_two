package com.rchfullstack;
public class Array2 {
    public static int indexOf(int array[], int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }
public void exerTwo() {
        int[] numbers = {3, 4, 5, 6, 7};
    System.out.println("Index position of number 5 is: " + indexOf(numbers, 5) + ".");
    }
}
