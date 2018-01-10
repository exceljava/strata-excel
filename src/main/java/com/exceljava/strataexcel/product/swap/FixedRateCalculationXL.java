/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.product.swap;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.product.swap.FixedRateCalculation;
    

public class FixedRateCalculationXL {
    private final ExcelAddIn xl;

    public FixedRateCalculationXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.FixedRateCalculation.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("rate"),
        @ExcelArgument("dayCount")
    })
    public FixedRateCalculation of(double rate, DayCount dayCount) {
        return FixedRateCalculation.of(rate, dayCount);
    }

    @ExcelFunction(
        value = "og.FixedRateCalculation.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fixedRateCalculation")
    })
    public String toString(FixedRateCalculation fixedRateCalculation) {
        return fixedRateCalculation.toString();
    }
}
