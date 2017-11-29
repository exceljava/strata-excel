/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.jinx.strataexcel.pricer.rate;

import com.jinx.ExcelAddIn;
import com.jinx.ExcelArgument;
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
import com.opengamma.strata.pricer.rate.ImmutableRatesProvider;
    

public class ImmutableRatesProviderXL {
    private final ExcelAddIn xl;

    public ImmutableRatesProviderXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.ImmutableRatesProvider.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("immutableRatesProvider")
    })
    public String toString(ImmutableRatesProvider immutableRatesProvider) {
        return immutableRatesProvider.toString();
    }
}
