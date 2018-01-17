/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.product.deposit.type;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.product.deposit.type.IborFixingDepositConvention;
    

public class IborFixingDepositConventionXL {
    private final ExcelAddIn xl;

    public IborFixingDepositConventionXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.IborFixingDepositConvention.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("uniqueName")
    })
    public IborFixingDepositConvention of(String uniqueName) {
        return IborFixingDepositConvention.of(uniqueName);
    }

    @ExcelFunction(
        value = "og.IborFixingDepositConvention.ofIndex",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("index")
    })
    public IborFixingDepositConvention of(IborIndex index) {
        return IborFixingDepositConvention.of(index);
    }
}
