package com.rchfullstack;

public class Array3 {
    public void exerThree() {
        String[] cities = {"London", "New york", "Paris", "Stockholm"};

        cities[0] = "Paris";
        cities[1] = "London";
        cities[2] = "New York";
        cities[3] = "Stockholm";

        System.out.print("String array: [");
        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i]);
            if (i < cities.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}