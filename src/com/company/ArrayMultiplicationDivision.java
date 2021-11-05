package com.company;
import java.util.Scanner;

/**
 * AUFGABE 3: 3,4
 * Multiplication and division between 2 arrays
 */
public class ArrayMultiplicationDivision {

    public static void main(String[] args) {

        int n=4;
        int number1[] = new int[n];
        int number2;

        Scanner s = new Scanner(System.in);

        System.out.println("Number:");
        number2 = s.nextInt();

        int rez[] = new int[n];
        int rez1[] = new int[n];




        for(int k=0;k<n;k++){
            System.out.println("a:");
            number1[k] = s.nextInt();
        }



        for (int i = 0; i < n; i++) {
            rez[i] = number1[i] * number2;
            rez1[i] = number1[i] / number2;
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
