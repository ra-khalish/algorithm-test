package com.talian;

import java.util.Scanner;

public class Staircase {
    /*
    2. Staircase
    Sample input: 6
    Sample output:
         #
        ##
       ###
      ####
     #####
    ######
     */
    public static void main(String[] args) {
        // Membuat input panjang staircase
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        in.close();

        // Iterasi pertama untuk membuat baris
        for (int i = 0; i < length; i++) {
            // Iterasi kedua untuk print spasi
            for (int j = 0; j < length-i-1; j++) {
                /*
                Banyaknya spasi yang di print akan berkurang
                berdasarkan nilai baris (i) dan dikurang 1 untuk meletakkan #
                 */
                System.out.print(" ");
            }
            // Iterasi ketiga untuk print #
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            // Println untuk membuat baris baru di iterasi pertama
            System.out.println();
        }
    }
}
