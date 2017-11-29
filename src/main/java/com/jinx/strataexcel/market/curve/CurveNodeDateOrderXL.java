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

    @ExcelFunction(
        value = "og.CurveNodeDateOrder.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("curveNodeDateOrder")
    })
    public String toString(CurveNodeDateOrder curveNodeDateOrder) {
        return curveNodeDateOrder.toString();
    }
}
