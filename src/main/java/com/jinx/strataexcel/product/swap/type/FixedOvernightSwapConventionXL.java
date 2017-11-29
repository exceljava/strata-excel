/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.jinx.strataexcel.product.swap.type;

import com.jinx.ExcelAddIn;
import com.jinx.ExcelArgument;
import com.jinx.ExcelArgumentConverter;
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
import com.opengamma.strata.product.swap.type.FixedOvernightSwapConvention;
    

public class FixedOvernightSwapConventionXL {
    private final ExcelAddIn xl;

    public FixedOvernightSwapConventionXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.FixedOvernightSwapConvention.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("uniqueName")
    })
    public FixedOvernightSwapConvention of(String uniqueName) {
        return FixedOvernightSwapConvention.of(uniqueName);
    }
}
