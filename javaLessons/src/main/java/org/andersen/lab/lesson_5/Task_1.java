package org.andersen.lab.lesson_5;

import java.util.Arrays;

/**
 * *Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
 */


public class Task_1 {

    public static void main(String[] args) {

        String[] arr = {"asd", "ds", "ret", "123"};
        changeOrderOfElements(arr, 0, 3);
        System.out.println(Arrays.toString(arr));
    }

    private static <T> void changeOrderOfElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
