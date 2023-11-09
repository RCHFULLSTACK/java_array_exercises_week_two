package com.rchfullstack;

import java.util.Arrays;
public class Array1 {
    public void exerOne() {
        int[] numbers = {11, 23, 39};
        System.out.println(Arrays.toString(numbers).replaceAll("[\\[\\],]","") + " etc.");
    }
}

