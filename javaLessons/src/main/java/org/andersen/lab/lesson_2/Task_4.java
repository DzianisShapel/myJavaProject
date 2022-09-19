package org.andersen.lab.lesson_2;

/**
 * Написать метод, которому в качестве аргументов передается строка и число,
 * метод должен отпечатать в консоль указанную строку, указанное количество раз;
 */

public class Task_4 {

    public static void main(String[] args) {
        printString("Automation testing", 5);
    }

    public static void printString(String string, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(string);
        }
    }
}
