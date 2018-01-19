/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.basics.currency;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.FxRateProvider;
    

public class FxRateProviderXL {
    private final ExcelAddIn xl;

    public FxRateProviderXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.FxRateProvider.convert",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fxRateProvider"),
        @ExcelArgument("amount"),
        @ExcelArgument("fromCurrency"),
        @ExcelArgument("toCurrency")
    })
    public double convert(FxRateProvider fxRateProvider, double amount, Currency fromCurrency, Currency toCurrency) {
        return fxRateProvider.convert(amount, fromCurrency, toCurrency);
    }

    @ExcelFunction(
        value = "og.FxRateProvider.fxRate",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fxRateProvider"),
        @ExcelArgument("baseCurrency"),
        @ExcelArgument("counterCurrency")
    })
    public double fxRate(FxRateProvider fxRateProvider, Currency baseCurrency, Currency counterCurrency) {
        return fxRateProvider.fxRate(baseCurrency, counterCurrency);
    }
}
