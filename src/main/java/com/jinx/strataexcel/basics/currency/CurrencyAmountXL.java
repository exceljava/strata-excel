/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.jinx.strataexcel.basics.currency;

import com.jinx.ExcelAddIn;
import com.jinx.ExcelArgument;
import com.jinx.ExcelArgumentConverter;
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.CurrencyAmount;
    

public class CurrencyAmountXL {
    private final ExcelAddIn xl;

    public CurrencyAmountXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.CurrencyAmount.getAmount",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("currencyAmount")
    })
    public double getAmount(CurrencyAmount currencyAmount) {
        return currencyAmount.getAmount();
    }

    @ExcelFunction(
        value = "og.CurrencyAmount.getCurrency",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("currencyAmount")
    })
    public Currency getCurrency(CurrencyAmount currencyAmount) {
        return currencyAmount.getCurrency();
    }

    @ExcelFunction(
        value = "og.CurrencyAmount.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("currency"),
        @ExcelArgument("amount")
    })
    public CurrencyAmount of(Currency currency, double amount) {
        return CurrencyAmount.of(currency, amount);
    }

    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.CurrencyAmount.parse",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("amountStr")
    })
    public CurrencyAmount parse(String amountStr) {
        return CurrencyAmount.parse(amountStr);
    }

    @ExcelFunction(
        value = "og.CurrencyAmount.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("currencyAmount")
    })
    public String toString(CurrencyAmount currencyAmount) {
        return currencyAmount.toString();
    }

    @ExcelFunction(
        value = "og.CurrencyAmount.zero",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("currency")
    })
    public CurrencyAmount zero(Currency currency) {
        return CurrencyAmount.zero(currency);
    }
}
