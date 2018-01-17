/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.product.fra.type;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.product.fra.type.FraConvention;
    

public class FraConventionXL {
    private final ExcelAddIn xl;

    public FraConventionXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.FraConvention.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("uniqueName")
    })
    public FraConvention of(String uniqueName) {
        return FraConvention.of(uniqueName);
    }

    @ExcelFunction(
        value = "og.FraConvention.ofIndex",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("index")
    })
    public FraConvention of(IborIndex index) {
        return FraConvention.of(index);
    }
}
