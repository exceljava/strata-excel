/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.market.curve;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.market.curve.CurveNodeDate;
import java.time.LocalDate;
    

public class CurveNodeDateXL {
    private final ExcelAddIn xl;

    public CurveNodeDateXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.CurveNodeDate.END",
        category = "Strata",
        isThreadSafe = true
    )
    public CurveNodeDate END() {
        return CurveNodeDate.END;
    }
    
    @ExcelFunction(
        value = "og.CurveNodeDate.LAST_FIXING",
        category = "Strata",
        isThreadSafe = true
    )
    public CurveNodeDate LAST_FIXING() {
        return CurveNodeDate.LAST_FIXING;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.CurveNodeDate.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("date")
    })
    public CurveNodeDate of(LocalDate date) {
        return CurveNodeDate.of(date);
    }
}
