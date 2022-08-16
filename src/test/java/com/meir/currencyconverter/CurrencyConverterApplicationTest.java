package com.meir.currencyconverter;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import static org.assertj.core.api.Assertions.*;

class CurrencyConverterApplicationTest {

    @Test
    void applicationTest() {
        String[] args = new String[]{"GBP", "10", "USD"};
        BigDecimal result = CurrencyConverterApplication.run(args);

        assertThat(result).isEqualTo(new BigDecimal("12"));
    }

}