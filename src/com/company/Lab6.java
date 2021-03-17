package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = in.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 10 + (int) (Math.random() * 90);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("--------------------");
        for(int i = 0; i < n; i++) {
            Arrays.sort(array[i]);
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
