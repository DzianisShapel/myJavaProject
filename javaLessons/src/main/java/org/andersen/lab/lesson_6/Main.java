package org.andersen.lab.lesson_6;

public class Main {
    public static void main(String[] args) {

        String[][] arr = {{"1", "2", "3", "5"}, {"6", "2", "2", "3"}, {"1", "2", "2", "2"}, {"5", "5", "5", "5"}};
        try {
            try {
                int result = method(arr);
                System.out.println("Array's values amount is: " + result);
            } catch (MyArraySizeException e) {
                System.out.println("Array size exceeded!");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Wrong value in the array!");
            System.out.println("Error in the cell: " + e.getI() + "x" + e.getJ());
        }

    }


    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int amount = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    amount += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return amount;
    }

}
