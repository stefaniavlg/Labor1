package com.company;

import java.util.Scanner;

/**Sum and differece of 2 arrays
 * AUFGABE 3: 1,2
 */
public class ArraySummationDifference {
    public static void main(String[] args) {

        int n=4;
        int number1[] = new int[n];

        int number2[] = new int[n];
        int sum[] = new int[n];
        int diff[]= new int[n];
        Scanner s = new Scanner(System.in);


        for(int k=0;k<n;k++){
            System.out.println("a:");
            number1[k] = s.nextInt();
        }


        for(int l=0;l<n;l++){
            System.out.println("b:");
            number2[l] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum[i] = number1[i] + number2[i];
        }

        System.out.println("SUM OF TWO ARRAYs");

        for (int j = 0; j < n; j++) {
            System.out.println(sum[j]);
        }

        System.out.println("DIFFERENCE OF TWO ARRAYs");

        for (int i = 0; i < n; i++) {
            diff[i] = number1[i] - number2[i];
        }

        for (int j = 0; j < n; j++) {
            System.out.println(diff[j]);
        }
    }

}
