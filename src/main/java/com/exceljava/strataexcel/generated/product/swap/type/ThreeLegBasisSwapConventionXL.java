/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.product.swap.type;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.product.swap.type.ThreeLegBasisSwapConvention;
    

public class ThreeLegBasisSwapConventionXL {
    private final ExcelAddIn xl;

    public ThreeLegBasisSwapConventionXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.ThreeLegBasisSwapConvention.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("uniqueName")
    })
    public ThreeLegBasisSwapConvention of(String uniqueName) {
        return ThreeLegBasisSwapConvention.of(uniqueName);
    }
}
