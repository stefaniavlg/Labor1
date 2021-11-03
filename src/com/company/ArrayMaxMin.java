package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
/**
 * AUFGABE 2: 1,2,3,4
 */
public class ArrayMaxMin {


    public static void main(String[] args) {

        //max
        Integer a[] = {4, 8, 3, 10, 17};
        int max = Collections.max(Arrays.asList(a));

        //min
        int min = Collections.min(Arrays.asList(a));

        //maxS n-1
        Arrays.sort(a);

        int maxS=0;
        String sorted = Arrays.toString(a);
        System.out.println("sorted array: " + sorted);

        for (int i=1;i<a.length;i++){
            maxS=maxS+a[i];
            //System.out.println(i);
        }
        //System.out.println(maxS);

        //minS n-1
        int minS=0;
        for (int j = 0;j<a.length-1;j++){
            minS=minS+a[j];
            //System.out.println(j);
        }


        System.out.println("Maximale Zahl: " + max);
        System.out.println("Minimale Zahl: " + min);
        System.out.println("Maximale Summe: " + maxS);
        System.out.println("Minimale Summe: " + minS);
    }
    }

