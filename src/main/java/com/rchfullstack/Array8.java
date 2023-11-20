package com.rchfullstack;

import java.util.ArrayList;
import java.util.List;
public class Array8 {
    public void exerEight(){
        int[] numbers = {20, 20, 40, 20, 30, 40, 50 , 60 , 50};

        List<Integer> list = new ArrayList<>();
        for (int element : numbers){
            list.add(element);
        }
        List<Integer> uniqueList = new ArrayList<>();

        for (Integer element : list) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }

        int[] uniqueArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArray[i] = uniqueList.get(i);
        }

        System.out.print("Array: ");
        for (int element : numbers) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Array without duplicate values: ");
        for (int element : uniqueArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
