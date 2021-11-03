package com.company;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * Main fur Aufgabe 1
 */
public class Main {
    public static void main(String[] Args) {

        int[] arr = new int[]{0, 40, 41, 42, 43, 44, 25, 32, 33, 34, 90, 94, 100};
        int[] arr2 = new int[]{0, 40, 41, 42, 43, 44, 25, 32, 33, 34, 90, 94, 100};

        DecimalFormat df2 = new DecimalFormat("#.##");
        Note note = new Note();
        note.setNote(arr);


        System.out.println("Regeln: " + Arrays.toString(note.getNote()));
        note.roundNotes();
        System.out.println("nicht ausreichende aufgabe1.Note" + Arrays.toString(note.badNotes()));
        System.out.println("Durchschnittswert:" + df2.format(note.averageNote()));
        note.setNote(arr2);
        System.out.println(Arrays.toString(note.getNote()));
        System.out.println("abgerundete aufgabe1.Note:" + Arrays.toString(note.abgerundeteNote()));
        System.out.println("maximale abgerundete aufgabe1.Note:" + note.maxNote(note.abgerundeteNote()));

    }
}
