/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.jinx.strataexcel.market.curve;

import com.jinx.ExcelAddIn;
import com.jinx.ExcelArgument;
import com.jinx.ExcelArgumentConverter;
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
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

    @ExcelFunction(
        value = "og.CurveNodeDate.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("curveNodeDate")
    })
    public String toString(CurveNodeDate curveNodeDate) {
        return curveNodeDate.toString();
    }
}
