package org.andersen.lab.lesson_2;

/**
 * Написать метод, которому в качестве параметра передается целое число.
 * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
 * Замечание: ноль считаем положительным числом.
 */

public class Task_3 {

    public static void main(String[] args) {
        System.out.println(isNegative(-10));
    }

    public static Boolean isNegative(int a) {
        return a < 0;
    }
}
