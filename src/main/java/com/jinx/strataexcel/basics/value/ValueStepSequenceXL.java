/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.jinx.strataexcel.basics.value;

import com.jinx.ExcelAddIn;
import com.jinx.ExcelArgument;
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
import com.opengamma.strata.basics.schedule.Frequency;
import com.opengamma.strata.basics.value.ValueAdjustment;
import com.opengamma.strata.basics.value.ValueStepSequence;
import java.time.LocalDate;
    

public class ValueStepSequenceXL {
    private final ExcelAddIn xl;

    public ValueStepSequenceXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.ValueStepSequence.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("firstStepDate"),
        @ExcelArgument("lastStepDate"),
        @ExcelArgument("frequency"),
        @ExcelArgument("adjustment")
    })
    public ValueStepSequence of(LocalDate firstStepDate, LocalDate lastStepDate, Frequency frequency, ValueAdjustment adjustment) {
        return ValueStepSequence.of(firstStepDate, lastStepDate, frequency, adjustment);
    }

    @ExcelFunction(
        value = "og.ValueStepSequence.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("valueStepSequence")
    })
    public String toString(ValueStepSequence valueStepSequence) {
        return valueStepSequence.toString();
    }
}
