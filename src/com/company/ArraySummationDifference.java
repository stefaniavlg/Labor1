package com.company;

import java.util.Scanner;

/**
 * AUFGABE 3: 1,2
 */
public class ArraySummationDifference {
    public static void main(String[] args) {

        int n=4;
        int a[] = new int[n];

        int b[] = new int[n];
        int sum[] = new int[n];
        int diff[]= new int[n];
        Scanner s = new Scanner(System.in);

        //initializam a
        for(int k=0;k<n;k++){
            System.out.println("a:");
            a[k] = s.nextInt();
        }

        //initializam b
        for(int l=0;l<n;l++){
            System.out.println("b:");
            b[l] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum[i] = a[i] + b[i];
        }

        System.out.println("SUM OF TWO ARRAYs");

        for (int j = 0; j < n; j++) {
            System.out.println(sum[j]);
        }

        System.out.println("DIFFERENCE OF TWO ARRAYs");

        for (int i = 0; i < n; i++) {
            diff[i] = a[i] - b[i];
        }

        for (int j = 0; j < n; j++) {
            System.out.println(diff[j]);
        }
    }

}
