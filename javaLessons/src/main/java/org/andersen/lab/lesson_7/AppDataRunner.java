package org.andersen.lab.lesson_7;

import java.io.IOException;

public class AppDataRunner {
    public static void main(String[] args) throws IOException {
        String[] header = {"value1", "value2", "value3"};
        int[][] values = {{111,200,123},{100,200,300},{444,555,666}};
        AppData appData = new AppData(header,values);
        appData.save();
        appData.readCSVFile();
        appData.read();
    }
}
