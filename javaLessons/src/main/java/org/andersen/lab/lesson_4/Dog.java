package org.andersen.lab.lesson_4;

public class Dog extends Animal{

    private String color;
    private static int count;
    public Dog(String name, String color) {
        super(name);
        this.color = color;
        count++;
    }

    @Override
    public void run(int length) {
        if (length <= 500) {
            System.out.println(super.name + " has run " + length + " m.");
        } else {
            System.out.println(super.name + " can run no more than" + length + " m.");
        }
    }

    @Override
    public void swim(int length) {
        if (length <= 10) {
            System.out.println(super.name + " has run " + length + " m.");
        } else {
            System.out.println(super.name + " can run no more than " + length + " m.");
        }
    }

    public static int getCount() {
        return count;
    }
}
