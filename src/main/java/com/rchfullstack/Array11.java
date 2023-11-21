package com.rchfullstack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Array11 {
    public void exerEleven(){
        ArrayList<Integer> integerList = new ArrayList<>();

        int stopValue = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter an Integer (or enter " + stopValue + " to stop):");
            int userInput = scanner.nextInt();
            if (userInput == stopValue) {
                break;
            }
            integerList.add(userInput);
        }
        scanner.close();
        System.out.println("Original List: " + integerList);
        Collections.reverse(integerList);
        System.out.println("Reversed List " + integerList);
    }
}
