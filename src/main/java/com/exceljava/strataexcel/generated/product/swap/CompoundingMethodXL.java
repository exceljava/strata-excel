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

    @ExcelReturnConverter
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
