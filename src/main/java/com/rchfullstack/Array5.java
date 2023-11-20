package com.rchfullstack;

public class Array5 {
    public void exerFive(){
        String[][] countries = {
                {"France", "Paris"},
                {"Sweden", "Stockholm"}
        };
        for (String[] country : countries) {
            for (String info : country) {
                System.out.print(info + " ");
            }
            System.out.println();
        }
    }
}
