package org.andersen.lab.lesson_2;

/**
 * Написать метод, которому в качестве параметра передается целое число,
 * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
 * Замечание: ноль считаем положительным числом.
 */
public class Task_2 {

    public static void main(String[] args) {
        checkNumber(-10);
    }

    public static void checkNumber(int a) {
        if (a >= 0) {
            System.out.println("The number: " + a + "is positive");
        } else {
            System.out.println("The number: " + a + " is negative");
        }
    }

}
