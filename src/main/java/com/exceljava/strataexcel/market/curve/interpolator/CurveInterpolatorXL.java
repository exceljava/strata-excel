/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.market.curve.interpolator;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.market.curve.interpolator.CurveInterpolator;
    

public class CurveInterpolatorXL {
    private final ExcelAddIn xl;

    public CurveInterpolatorXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.CurveInterpolator.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("uniqueName")
    })
    public CurveInterpolator of(String uniqueName) {
        return CurveInterpolator.of(uniqueName);
    }
}
