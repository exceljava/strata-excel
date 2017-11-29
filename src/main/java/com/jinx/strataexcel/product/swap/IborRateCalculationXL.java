/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.jinx.strataexcel.product.swap;

import com.jinx.ExcelAddIn;
import com.jinx.ExcelArgument;
import com.jinx.ExcelArgumentConverter;
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.product.swap.IborRateCalculation;
    

public class IborRateCalculationXL {
    private final ExcelAddIn xl;

    public IborRateCalculationXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.IborRateCalculation.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("index")
    })
    public IborRateCalculation of(IborIndex index) {
        return IborRateCalculation.of(index);
    }

    @ExcelFunction(
        value = "og.IborRateCalculation.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("iborRateCalculation")
    })
    public String toString(IborRateCalculation iborRateCalculation) {
        return iborRateCalculation.toString();
    }
}
