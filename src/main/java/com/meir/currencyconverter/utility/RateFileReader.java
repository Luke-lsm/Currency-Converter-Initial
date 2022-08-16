package com.meir.currencyconverter.utility;
import com.meir.currencyconverter.model.CurrencyPair;

import java.util.ArrayList;
import java.util.List;


public class RateFileReader {
    private String fileName;

    public RateFileReader(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<CurrencyPair> readFile(){
        List<String> csvStrings =  TextFileReader.getStrings(this.fileName);
        return csvStrings.stream().map(CurrencyPair::fromString).toList();
    }
}
