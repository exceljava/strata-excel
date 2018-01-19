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
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.schedule.Frequency;
import com.opengamma.strata.product.swap.type.FixedRateSwapLegConvention;
    

public class FixedRateSwapLegConventionXL {
    private final ExcelAddIn xl;

    public FixedRateSwapLegConventionXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.FixedRateSwapLegConvention.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("currency"),
        @ExcelArgument("dayCount"),
        @ExcelArgument("accrualFrequency"),
        @ExcelArgument("accrualBusinessDayAdjustment")
    })
    public FixedRateSwapLegConvention of(Currency currency, DayCount dayCount, Frequency accrualFrequency, BusinessDayAdjustment accrualBusinessDayAdjustment) {
        return FixedRateSwapLegConvention.of(currency, dayCount, accrualFrequency, accrualBusinessDayAdjustment);
    }
}
