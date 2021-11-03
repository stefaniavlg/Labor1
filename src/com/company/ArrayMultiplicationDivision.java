package com.company;
import java.util.Scanner;

/**
 * AUFGABE 3: 3,4
 */
public class ArrayMultiplicationDivision {

    public static void main(String[] args) {

        int n=4;
        int a[] = new int[n];
        int b;
        Scanner s = new Scanner(System.in);

        System.out.println("Number:");
        b = s.nextInt();

        int rez[] = new int[n];
        int rez1[] = new int[n];



        //initializam a
        for(int k=0;k<n;k++){
            System.out.println("a:");
            a[k] = s.nextInt();
        }



        for (int i = 0; i < n; i++) {
            rez[i] = a[i] * b;
            rez1[i] = a[i] / b;
        }

        System.out.println("Result Multiplication: ");

        for (int j = 0; j < n; j++) {
            System.out.println(rez[j]);
        }

        System.out.println("Result Division: ");

        for (int j = 0; j < n; j++) {
            System.out.println(rez1[j]);
        }



    }
}
