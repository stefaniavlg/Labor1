package com.company;

public class Note {

    private int[] note;
    private int[] badNotes;
    private int[] abgerundeteNote;

    //Getter
    public int[] getNote() {
        return this.note;
    }

    //Setter
    public void setNote(int[] note) {
        this.note = note;
    }

    //Round aufgabe1.Note
    public int roundNote(int note) {
        if(note >=38) {
            if (((int) (note / 5)*5 + 5) - note < 3) {
                note = ((int) (note / 5)*5 + 5);
            }
        }
        return note;
    }

    //Round all notes
    public void roundNotes(){
        for(int i = 0; i < this.note.length; i++){
            this.note[i]= roundNote(this.note[i]);
        }
    }

    //Return all bad notes
    public int[] badNotes(){
        int j = 0;
        for(int i = 0; i < this.note.length; i++){
            this.note[i]= roundNote(this.note[i]);
        }
        for(int i = 0; i < this.note.length; i++){
            if(this.note[i] < 40){
                j++;
            }
        }
        this.badNotes = new int[j];
        j=0;
        for(int i = 0; i < this.note.length; i++){
            if(this.note[i] < 40){
                this.badNotes[j]=this.note[i];
                j++;
            }
        }
        return this.badNotes;
    }

    //Average aufgabe1.Note
    public double averageNote(){
        double avg=0;
        for(int i =0; i < this.note.length; i++){
            avg = avg + this.note[i];
        }
        return avg/this.note.length;
    }

    //Abgerundete aufgabe1.Note Array
    public int[] abgerundeteNote(){
        int j = 0;
        for(int i = 0; i < this.note.length; i++){
            if(this.note[i] != roundNote(this.note[i])){
                j++;
            }
        }
        this.abgerundeteNote = new int[j];
        j = 0;
        for(int i = 0; i < this.note.length;i++){
            if(this.note[i] != roundNote(this.note[i])){
                this.abgerundeteNote[j] = roundNote(this.note[i]);
                j++;
            }
        }
        return this.abgerundeteNote;
    }

    //Max aufgabe1.Note
    public int maxNote(int[] arr){
        int max = 0;
        for( int i = 0; i < arr.length; i++){
            if ( max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
