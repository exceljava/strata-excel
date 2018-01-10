/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.basics.value;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.value.ValueAdjustment;
import com.opengamma.strata.basics.value.ValueStep;
import java.time.LocalDate;
    

public class ValueStepXL {
    private final ExcelAddIn xl;

    public ValueStepXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.ValueStep.atDate",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("date"),
        @ExcelArgument("value")
    })
    public ValueStep of(LocalDate date, ValueAdjustment value) {
        return ValueStep.of(date, value);
    }

    @ExcelFunction(
        value = "og.ValueStep.atPeriod",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("periodIndex"),
        @ExcelArgument("value")
    })
    public ValueStep of(int periodIndex, ValueAdjustment value) {
        return ValueStep.of(periodIndex, value);
    }

    @ExcelFunction(
        value = "og.ValueStep.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("valueStep")
    })
    public String toString(ValueStep valueStep) {
        return valueStep.toString();
    }
}
