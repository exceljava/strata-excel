/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.product.common;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.product.common.BuySell;
    

public class BuySellXL {
    private final ExcelAddIn xl;

    public BuySellXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.BuySell.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("name")
    })
    public BuySell of(String name) {
        return BuySell.of(name);
    }

    @ExcelFunction(
        value = "og.BuySell.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("buySell")
    })
    public String toString(BuySell buySell) {
        return buySell.toString();
    }
}
