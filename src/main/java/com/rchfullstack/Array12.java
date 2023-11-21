package com.rchfullstack;

public class Array12 {
    public void exerTwelve(){
        int[][] matrix = {
                {1, 0, 0},
                {0, 4, 0},
                {0, 0, 9}
        };

        System.out.print(" ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
    }
}
