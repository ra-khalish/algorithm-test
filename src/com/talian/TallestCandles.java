package com.talian;

import java.util.Arrays;
import java.util.Scanner;

public class TallestCandles {
    /*
    3. Number of tallest candles
    For example, if the array of candle, candles=[3,2,1,3]
    then tallest candle are number 3, and there are 2 of them.
    Sample input: 4
    3 2 1 3
    Sample output: 2
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Number of candles");
        // Membuat variabel numCandles untuk menyimpan jumlah lilin
        int numCandles = in.nextInt();

        // Membuat array sebanyak jumlah lilin
        int[] candles = new int[numCandles];

        // Menyiapkan variabel untuk menyimpan lilin tertinggi
        int tallestCandles = 0;
        // Membuat variabel untuk jumlah lilin tertinggi
        int sumTallest = 0;

        for (int i = 0; i < numCandles; i++) {
            candles[i] = in.nextInt();

            // jika nilai array index i lebih besar dari tallestCandles,
            // ubah nilai tallestCandles nya jadi array index i dari candles
            if (candles[i] > tallestCandles) {
                tallestCandles = candles[i];
                sumTallest = 1;
            }
            // jika nilai array index i candles sama dengan nilai tallestCandles
            else if (candles[i] == tallestCandles) {
                //  Tambah nilai jumlah lilin yang ketinggian sama atau maksimum
                sumTallest += 1;
            }
        }
        System.out.printf("Input: %d\n", numCandles);
        System.out.printf("Candles: %s\n", Arrays.toString(candles));
        System.out.printf("Total tallest candles: %d", sumTallest);
    }
}
