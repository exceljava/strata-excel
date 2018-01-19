/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.basics.date;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.exceljava.jinx.ExcelReturnConverter;
import com.opengamma.strata.basics.date.DayCount;
    

public class DayCountXL {
    private final ExcelAddIn xl;

    public DayCountXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelReturnConverter
    @ExcelFunction(
        value = "og.DayCount.getName",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("dayCount")
    })
    public String getName(DayCount dayCount) {
        return dayCount.getName();
    }

    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.DayCount.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("uniqueName")
    })
    public DayCount of(String uniqueName) {
        return DayCount.of(uniqueName);
    }
}
