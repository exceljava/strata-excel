/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.market.curve;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.market.curve.CurveNodeClashAction;
    

public class CurveNodeClashActionXL {
    private final ExcelAddIn xl;

    public CurveNodeClashActionXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.CurveNodeClashAction.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("name")
    })
    public CurveNodeClashAction of(String name) {
        return CurveNodeClashAction.of(name);
    }

    @ExcelFunction(
        value = "og.CurveNodeClashAction.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("curveNodeClashAction")
    })
    public String toString(CurveNodeClashAction curveNodeClashAction) {
        return curveNodeClashAction.toString();
    }
}
