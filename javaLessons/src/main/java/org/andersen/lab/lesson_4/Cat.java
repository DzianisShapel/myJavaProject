package org.andersen.lab.lesson_4;

public class Cat extends Animal {

    private int appetite;

    private Boolean satiety;
    private static int count;

    public Cat(String name, int appetite, Boolean satiety) {
        super(name);
        this.appetite = appetite;
        this.satiety = satiety;
        count++;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(Boolean satiety) {
        this.satiety = satiety;
    }

    @Override
    public void run(int length) {
        if (length <= 200) {
            System.out.println(super.name + " has run " + length + " m.");
        } else {
            System.out.println(super.name + " can run no more than " + length + " m.");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println(super.name + " can not swim.");
    }

    public void eat(Plate plate) {
        plate.decreaseFood(getAppetite());
    }

    public static int getCount() {
        return count;
    }
}
