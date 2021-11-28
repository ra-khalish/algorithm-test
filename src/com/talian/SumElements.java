package com.talian;

import java.util.Scanner;

public class SumElements {
    /*
    1. Given an array of integers, find the sum of its elements.
    For example, if the array ar=[1+2+3] then 1+2+3 = 6, so return 6

    Sample input: 6
    Element: 1 2 3 4 10 11
    Sample Output: 31
     */
    public static void main(String[] args) {
        // Create length elements from input
        Scanner in = new Scanner(System.in);
        System.out.println("Length of elements:");
        int lengthElements = in.nextInt();
        // Sum of elements variable
        int sumElements = 0;

        // Loop every input elements until input length
        System.out.println("Elements:");
        for (int i = 0; i < lengthElements; i++) {
            sumElements += in.nextInt();
        }
        System.out.println(sumElements);
        in.close();
    }
}
