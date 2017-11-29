/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.jinx.strataexcel.basics.date;

import com.jinx.ExcelAddIn;
import com.jinx.ExcelArgument;
import com.jinx.ExcelArgumentConverter;
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
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

    @ExcelFunction(
        value = "og.AdjustableDate.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("adjustableDate")
    })
    public String toString(AdjustableDate adjustableDate) {
        return adjustableDate.toString();
    }
}
