/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.basics.schedule;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.exceljava.jinx.ExcelReturnConverter;
import com.opengamma.strata.basics.schedule.RollConvention;
    

public class RollConventionXL {
    private final ExcelAddIn xl;

    public RollConventionXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelReturnConverter
    @ExcelFunction(
        value = "og.RollConvention.getName",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("rollConvention")
    })
    public String getName(RollConvention rollConvention) {
        return rollConvention.getName();
    }

    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.RollConvention.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("uniqueName")
    })
    public RollConvention of(String uniqueName) {
        return RollConvention.of(uniqueName);
    }
}
