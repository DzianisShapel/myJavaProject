package org.andersen.lab.lesson_2;

/**
 * Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно),
 * если да – вернуть true, в противном случае – false.
 */


public class Task_1 {

    public static void main(String[] args) {
        System.out.println(sumIsBetweenTenAndTwenty(10,19));
    }

    public static Boolean sumIsBetweenTenAndTwenty(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}
