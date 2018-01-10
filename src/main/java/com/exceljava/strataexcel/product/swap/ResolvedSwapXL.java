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
import com.opengamma.strata.product.swap.ResolvedSwap;
    

public class ResolvedSwapXL {
    private final ExcelAddIn xl;

    public ResolvedSwapXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.ResolvedSwap.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("resolvedSwap")
    })
    public String toString(ResolvedSwap resolvedSwap) {
        return resolvedSwap.toString();
    }
}
