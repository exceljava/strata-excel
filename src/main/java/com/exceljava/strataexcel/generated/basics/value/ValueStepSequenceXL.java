/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.basics.value;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
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
}
