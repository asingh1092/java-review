package com.singh.oop3.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIODelimitedCSVFileRead {
    public static void main(String[] args) {
        File fileIn = new File("SortedWolves.csv");
        Scanner fileScan = null;
        String[] tokens = null;
        double[] allWeights = new double[10];
        int index = 0;
        try {
            fileScan = new Scanner(fileIn);
            String line = null;
            while (fileScan.hasNextLine()) {
                line = fileScan.nextLine();
                tokens = line.split(",");
                allWeights[index] = Double.parseDouble(tokens[1]);
                index++;
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        finally {
            if (fileScan != null) {
                fileScan.close();
            }
        }
    }
}
