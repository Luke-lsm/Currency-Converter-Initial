package com.meir.currencyconverter;

import java.math.BigDecimal;

public class CurrencyConverterApplication {

    // Argument 1 contains the base pair, Argument 2 contains the rate pair and
    // Argument three contains the quantity to exchange

    public static void main(String[] args) {
        if (args.length < 3) {
            throw new IllegalArgumentException("There must be three arguments passed to this application");
        }
        System.out.println(run(args));
    }

    public static BigDecimal run(String[] args){

        // Load in the currency rates

        // Find the correct pair from the list or throw an error

        // Perform the calculation and return the value

        throw new  RuntimeException("Not yet implemented");
    }
}
