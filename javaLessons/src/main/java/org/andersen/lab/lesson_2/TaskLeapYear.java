package org.andersen.lab.lesson_2;
/*
*Написать метод, который определяет, является ли год високосным,
* и возвращает boolean (високосный - true, не високосный - false).
* Каждый 4-й год является високосным, кроме каждого 100-го,
* при этом каждый 400-й – високосный.
* */


public class TaskLeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(1204));
    }

    public static Boolean isLeapYear(int year){
       return year % 400 == 0 || (year % 4 == 0 && year % 100 !=0);
    }
}
