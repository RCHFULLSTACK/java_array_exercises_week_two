package com.rchfullstack;

import java.util.Arrays;
public class Array9 {
    public void exerNine(){
        int[] originalNumbers = {1, 2, 3, 4, 5};
        int[] elementsToAdd = {6, 7, 8};
        originalNumbers = addElements(originalNumbers, elementsToAdd);
        System.out.println("Updated Array: " + Arrays.toString(originalNumbers));
    }

    public static int[] addElements(int[] oldNumbers, int[] elementToAdd) {
        int newSize = oldNumbers.length + elementToAdd.length;
        int[] newNumbers = new int[newSize];
        System.arraycopy(oldNumbers, 0, newNumbers, 0, oldNumbers.length);
        System.arraycopy(elementToAdd, 0, newNumbers, oldNumbers.length, elementToAdd.length);
        return newNumbers;
    }
}
