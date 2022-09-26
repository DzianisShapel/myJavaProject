package org.andersen.lab.lesson_4;

public class Animal {
    protected String name;
    private static int count;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
        count++;

    }

    public static int getCount() {
        return count;
    }

    public void run(int length) {}

    public void swim(int length) {}

}
