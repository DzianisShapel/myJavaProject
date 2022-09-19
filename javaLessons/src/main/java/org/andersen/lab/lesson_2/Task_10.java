package org.andersen.lab.lesson_2;

import java.util.Arrays;

/**
 * Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
 * при этом метод должен сместить все элементы массива на n позиций.
 * Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
 * [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
 * При каком n в какую сторону сдвиг можете выбирать сами.
 */

public class Task_10 {

    public static void main(String[] args) {
        int[] testArray = {3, 5, 6, 1};
        System.out.println(Arrays.toString(shiftArray(testArray, -2)));
    }

    public static int[] shiftArray(int[] array, int shift) {
        if (shift > 0) {
            for (int s = 1; s <= shift; s++) {
                int elemshift = array[array.length - 1];
                for (int i = array.length - 2; i >= 0; i--) {
                    array[i + 1] = array[i];
                }
                array[0] = elemshift;
            }
        } else if (shift < 0) {
            for (int s = shift; s <= -1; s++) {
                int elemshift = array[0];
                for (int i = 1; i < array.length; i++) {
                    array[i - 1] = array[i];
                }
                array[array.length - 1] = elemshift;
            }
        }
        return array;
    }

}
