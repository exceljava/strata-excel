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
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.product.swap.ResolvedSwap;
import com.opengamma.strata.product.swap.Swap;
import com.opengamma.strata.product.swap.SwapLeg;
import java.util.Arrays;
import java.util.List;
    

public class SwapXL {
    private final ExcelAddIn xl;

    public SwapXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.Swap.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("legs")
    })
    public Swap of(SwapLeg[] legs) {
        List<SwapLeg> legs_List = Arrays.asList(legs);
        return Swap.of(legs_List);
    }

    @ExcelFunction(
        value = "og.Swap.resolve",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("swap"),
        @ExcelArgument("refData")
    })
    public ResolvedSwap resolve(Swap swap, ReferenceData refData) {
        return swap.resolve(refData);
    }

    @ExcelFunction(
        value = "og.Swap.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("swap")
    })
    public String toString(Swap swap) {
        return swap.toString();
    }
}
