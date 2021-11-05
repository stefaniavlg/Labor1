package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
/**
 * AUFGABE 2: 1,2,3,4
 * Find min,max from array
 * Find min sum from n-1 numbers
 * Find max sum from n-1 numbers
 */
public class ArrayMaxMin {


    public static void main(String[] args) {


        Integer integers[] = {4, 8, 3, 10, 17};
        int max = Collections.max(Arrays.asList(integers));


        int min = Collections.min(Arrays.asList(integers));


        Arrays.sort(integers);

        int maxS=0;
        String sorted = Arrays.toString(integers);
        System.out.println("sorted array: " + sorted);

        for (int i=1;i<integers.length;i++){
            maxS=maxS+integers[i];

        }



        int minS=0;
        for (int j = 0;j<integers.length-1;j++){
            minS=minS+integers[j];

        }


        System.out.println("Maximale Zahl: " + max);
        System.out.println("Minimale Zahl: " + min);
        System.out.println("Maximale Summe: " + maxS);
        System.out.println("Minimale Summe: " + minS);
    }
    }

