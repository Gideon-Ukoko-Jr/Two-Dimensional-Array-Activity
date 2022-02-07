package com.gideon;

import java.util.ArrayList;

//Write a function that takes in a two-dimensional array of ints (or a List<? extends List<? extends Number>>
// or equivalent) and finds the smallest number in each row,
// and returns the sum of those per-row smallest values.


public class Main {


    final static int MAX = 100;

    public static void main(String[] args) {


        int rows = 3, columns = 3;

        int[][] test = {{1, 4, 5}, {2, 6, 4}, {6, 5, 9}};

        System.out.print("Minimum element of each row is: " + "\n");
        returnSmallestValuesAndSum(test, rows, columns);

    }

    // Function to take in two-dimensional array of int

    public static void returnSmallestValuesAndSum(int[][] val, int r, int c) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            //Initialize the minimum element as the first element
            int minimum = val[i][0];

            for (int j = 1; j < c; j++) {

                //Checking if any element is smaller than the min element of the row and replacing it
                if (val[i][j] < minimum) {
                    minimum = val[i][j];
                }
            }


            System.out.println("Smallest element in row " + i + " : " + minimum);
            arrayList.add(minimum);

            System.out.println(arrayList);
            double sum = 0;
            for (int a = 0; a < arrayList.size(); a++){
                sum += arrayList.get(a);
            }
            System.out.println("Sum of the smallest element in each row is: " + sum);
        }
    }


}