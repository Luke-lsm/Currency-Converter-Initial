package com.meir.currencyconverter.model;

import java.math.BigDecimal;

public class CurrencyPair {

    // 1 unit of the base currency is worth rate units of the rate currency
    private final String baseCurrency;
    private final String rateCurrency;
    private final BigDecimal rate;

    public CurrencyPair(String baseCurrency, String rateCurrency, BigDecimal rate) {
        this.baseCurrency = baseCurrency;
        this.rateCurrency = rateCurrency;
        this.rate = rate;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public String getRateCurrency() {
        return rateCurrency;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public BigDecimal convertAmountOfBaseCurrency(BigDecimal baseCurrencyAmount){
        return baseCurrencyAmount.multiply(rate);
    }

    public static CurrencyPair fromString(String csvString){
        String[] split = csvString.split(",");
        return new CurrencyPair(split[0], split[1], new BigDecimal(split[2]));
    }
}
