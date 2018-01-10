/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.basics.currency;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.basics.currency.MultiCurrencyAmount;
import java.util.Arrays;
    

public class MultiCurrencyAmountXL {
    private final ExcelAddIn xl;

    public MultiCurrencyAmountXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.MultiCurrencyAmount.getAmountOrZero",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("multiCurrencyAmount"),
        @ExcelArgument("currency")
    })
    public CurrencyAmount getAmountOrZero(MultiCurrencyAmount multiCurrencyAmount, Currency currency) {
        return multiCurrencyAmount.getAmountOrZero(currency);
    }

    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.MultiCurrencyAmount.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("amounts")
    })
    public MultiCurrencyAmount of(CurrencyAmount[] amounts) {
        Iterable<CurrencyAmount> amounts_Iterable = Arrays.asList(amounts);
        return MultiCurrencyAmount.of(amounts_Iterable);
    }

    @ExcelFunction(
        value = "og.MultiCurrencyAmount.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("multiCurrencyAmount")
    })
    public String toString(MultiCurrencyAmount multiCurrencyAmount) {
        return multiCurrencyAmount.toString();
    }
}
