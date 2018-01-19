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
import com.opengamma.strata.market.curve.CurveNodeClashAction;
import com.opengamma.strata.market.curve.CurveNodeDateOrder;
    

public class CurveNodeDateOrderXL {
    private final ExcelAddIn xl;

    public CurveNodeDateOrderXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.CurveNodeDateOrder.DEFAULT",
        category = "Strata",
        isThreadSafe = true
    )
    public CurveNodeDateOrder DEFAULT() {
        return CurveNodeDateOrder.DEFAULT;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.CurveNodeDateOrder.get",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fieldName")
    })
    public CurveNodeDateOrder getStaticField(String fieldName) {
        if (null == fieldName) {
            throw new IllegalArgumentException("fieldName is null");
        }
        if (fieldName.equals("DEFAULT")) {
            return CurveNodeDateOrder.DEFAULT;
        }
        throw new IllegalArgumentException(String.format("%s is invalid", fieldName));
    }
    @ExcelFunction(
        value = "og.CurveNodeDateOrder.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("minGapInDays"),
        @ExcelArgument("action")
    })
    public CurveNodeDateOrder of(int minGapInDays, CurveNodeClashAction action) {
        return CurveNodeDateOrder.of(minGapInDays, action);
    }
}
