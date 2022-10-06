package org.andersen.lab.lesson_7;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppData {
    private String[] header;

    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    public void save() throws IOException {

        FileWriter csvWriter = new FileWriter("homework7.csv");

        for (int i = 0; i < getHeader().length; i++) {
            csvWriter.append(getHeader()[i]);
            if (i == getHeader().length - 1) break;
            csvWriter.append(";");
        }
        csvWriter.append("\n");

        for (int i = 0; i < getData().length; i++) {
            for (int j = 0; j < getData()[i].length; j++) {
                csvWriter.append(String.valueOf(getData()[i][j]));
                if (j == getData()[i].length - 1) break;
                csvWriter.append(";");
            }
            csvWriter.append("\n");
        }

        csvWriter.flush();
        csvWriter.close();
    }

    //method for reading 1
    public void readCSVFile() {
        List<List<String>> records = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("homework7.csv"));) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(records.toString());
    }

    private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(",");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }

    //method for reading 2
    public void read() throws IOException {
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("homework7.csv"));
            String row;
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(",");
                System.out.println(Arrays.toString(data));
            }
            csvReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


}

