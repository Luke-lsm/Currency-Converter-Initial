package com.meir.currencyconverter.model;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.assertj.core.api.Assertions.*;

class CurrencyPairTest {

    final CurrencyPair testPair =  new CurrencyPair("GBP", "USD", new BigDecimal("1.12"));

    @Test
    void convertAmountOfBaseCurrency() {
        assertThat(testPair.convertAmountOfBaseCurrency(new BigDecimal("1")))
                .isEqualTo(new BigDecimal("1.12"));
    }
}