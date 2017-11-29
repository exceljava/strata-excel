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
import com.jinx.ExcelArgumentConverter;
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
import com.opengamma.strata.product.swap.CompoundingMethod;
    

public class CompoundingMethodXL {
    private final ExcelAddIn xl;

    public CompoundingMethodXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.CompoundingMethod.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("name")
    })
    public CompoundingMethod of(String name) {
        return CompoundingMethod.of(name);
    }

    @ExcelFunction(
        value = "og.CompoundingMethod.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("compoundingMethod")
    })
    public String toString(CompoundingMethod compoundingMethod) {
        return compoundingMethod.toString();
    }
}
