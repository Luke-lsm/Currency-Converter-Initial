package com.meir.currencyconverter.utility;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFileReader {

    public static List<String> getStrings(String fileName) {
        List<String> values = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                values.add(line);
            }
        } catch (IOException e) {
            return new ArrayList<>();
        }
        return values;
    }
}