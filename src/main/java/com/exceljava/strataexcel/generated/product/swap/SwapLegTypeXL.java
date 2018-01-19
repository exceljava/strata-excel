/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.product.swap;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.exceljava.jinx.ExcelReturnConverter;
import com.opengamma.strata.product.swap.SwapLegType;
    

public class SwapLegTypeXL {
    private final ExcelAddIn xl;

    public SwapLegTypeXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.SwapLegType.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("name")
    })
    public SwapLegType of(String name) {
        return SwapLegType.of(name);
    }

    @ExcelReturnConverter
    @ExcelFunction(
        value = "og.SwapLegType.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("swapLegType")
    })
    public String toString(SwapLegType swapLegType) {
        return swapLegType.toString();
    }
}
