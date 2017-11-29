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
import com.opengamma.strata.product.swap.FxResetFixingRelativeTo;
    

public class FxResetFixingRelativeToXL {
    private final ExcelAddIn xl;

    public FxResetFixingRelativeToXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.FxResetFixingRelativeTo.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("name")
    })
    public FxResetFixingRelativeTo of(String name) {
        return FxResetFixingRelativeTo.of(name);
    }

    @ExcelFunction(
        value = "og.FxResetFixingRelativeTo.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fxResetFixingRelativeTo")
    })
    public String toString(FxResetFixingRelativeTo fxResetFixingRelativeTo) {
        return fxResetFixingRelativeTo.toString();
    }
}
