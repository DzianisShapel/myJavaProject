package org.andersen.lab.lesson_4;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Food amount: " + food);
    }

    public void increaseFood(int amount) {
        food += amount;
    }

    public void decreaseFood(int amount) {
        if ((food -= amount) < 0) throw new RuntimeException("Cat cannot eat more food than it has in a plate");
    }


}
