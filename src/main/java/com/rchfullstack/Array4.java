package com.rchfullstack;

public class Array4 {
    public void exerFour(){
        int[] firstArray = {1, 20, 30};
        int[] secondArray = new int[firstArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];
        }
        System.out.print("Elements from first array: ");
        for (int num : firstArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Elements from second array: ");
        for (int num : secondArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}