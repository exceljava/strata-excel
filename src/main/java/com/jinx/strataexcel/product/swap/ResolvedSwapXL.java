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
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
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
