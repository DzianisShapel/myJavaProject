package org.andersen.lab.lesson_5;

public class BoxRunner {
    public static void main(String[] args) {

        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        System.out.println("Weight of the box 1 with orange: " + orangeBox1.getWeight());
        System.out.println("Weight of the box 2 with orange: " + orangeBox2.getWeight());
        System.out.println("Weight of the box with apples: " + appleBox.getWeight());

        System.out.println("orangeBox1 is heavier than appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("orangeBox2 is heavier than appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }
}
