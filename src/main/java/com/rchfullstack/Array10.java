package com.rchfullstack;

public class Array10 {
    public void exerTen(){
        int[][] multiplicationTable = new int[10][10];

        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= 10; column++) {
                multiplicationTable[row -1 ][column -1] = row * column;
            }
        }

        for (int[] row : multiplicationTable) {
            for (int cell : row) {
                System.out.printf("%4d | ", cell);
            }
            System.out.println();
        }
    }
}
