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
import com.opengamma.strata.basics.date.AdjustableDate;
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import java.time.LocalDate;
    

public class AdjustableDateXL {
    private final ExcelAddIn xl;

    public AdjustableDateXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.AdjustableDate.ofDate",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("date")
    })
    public AdjustableDate of(LocalDate date) {
        return AdjustableDate.of(date);
    }

    @ExcelFunction(
        value = "og.AdjustableDate.ofDateAndAdjustment",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("unadjusted"),
        @ExcelArgument("adjustment")
    })
    public AdjustableDate of(LocalDate unadjusted, BusinessDayAdjustment adjustment) {
        return AdjustableDate.of(unadjusted, adjustment);
    }
}
