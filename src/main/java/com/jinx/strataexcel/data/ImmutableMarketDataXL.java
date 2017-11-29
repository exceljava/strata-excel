/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.jinx.strataexcel.data;

import com.jinx.ExcelAddIn;
import com.jinx.ExcelArgument;
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
import com.opengamma.strata.data.ImmutableMarketData;
import com.opengamma.strata.data.MarketDataId;
import java.time.LocalDate;
import java.util.Map;
    

public class ImmutableMarketDataXL {
    private final ExcelAddIn xl;

    public ImmutableMarketDataXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.ImmutableMarketData.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("valuationDate"),
        @ExcelArgument("values")
    })
    public ImmutableMarketData of(LocalDate valuationDate, Map<MarketDataId<?>, ?> values) {
        return ImmutableMarketData.of(valuationDate, values);
    }

    @ExcelFunction(
        value = "og.ImmutableMarketData.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("immutableMarketData")
    })
    public String toString(ImmutableMarketData immutableMarketData) {
        return immutableMarketData.toString();
    }
}
