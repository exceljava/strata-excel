/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.product.fra;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.product.fra.FraDiscountingMethod;
    

public class FraDiscountingMethodXL {
    private final ExcelAddIn xl;

    public FraDiscountingMethodXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.FraDiscountingMethod.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("name")
    })
    public FraDiscountingMethod of(String name) {
        return FraDiscountingMethod.of(name);
    }

    @ExcelFunction(
        value = "og.FraDiscountingMethod.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fraDiscountingMethod")
    })
    public String toString(FraDiscountingMethod fraDiscountingMethod) {
        return fraDiscountingMethod.toString();
    }
}
