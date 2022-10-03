package org.andersen.lab.lesson_6;

public class MyArrayDataException extends Exception {
    private int i;
    private int j;

    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

}
