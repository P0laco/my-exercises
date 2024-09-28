package io.codeforall.bootcamp.exercise;

public class Ai {
    private String creationDate;
    private String name;

    public Ai(String creationDate, String name){
        this.creationDate = creationDate;
        this.name = name;
    }

    public String getCreationDate(){
        return this.creationDate;
    }

    public String getName(){
        return this.name;
    }

    public void setCreationDate(String CreationDate){
        this.creationDate = CreationDate;
    }

    public void setName(String name){
        this.name = name;
    }

    public int[] doubleArray(int[] array) {
        int[] arrays2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrays2[i] = array[i] * 2;
        }
        return  arrays2;
    }
    public int factorialIterative(int fatorial){

    }

}

