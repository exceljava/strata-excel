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
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.value.ValueSchedule;
import com.opengamma.strata.basics.value.ValueStep;
import com.opengamma.strata.basics.value.ValueStepSequence;
import java.util.Arrays;
import java.util.List;
    

public class ValueScheduleXL {
    private final ExcelAddIn xl;

    public ValueScheduleXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.ValueSchedule.ALWAYS_0",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueSchedule ALWAYS_0() {
        return ValueSchedule.ALWAYS_0;
    }
    
    @ExcelFunction(
        value = "og.ValueSchedule.ALWAYS_1",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueSchedule ALWAYS_1() {
        return ValueSchedule.ALWAYS_1;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.ValueSchedule.fixed",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("value")
    })
    public ValueSchedule of(double value) {
        return ValueSchedule.of(value);
    }

    @ExcelFunction(
        value = "og.ValueSchedule.ofSequence",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("initialValue"),
        @ExcelArgument("stepSequence")
    })
    public ValueSchedule of(double initialValue, ValueStepSequence stepSequence) {
        return ValueSchedule.of(initialValue, stepSequence);
    }

    @ExcelFunction(
        value = "og.ValueSchedule.ofSteps",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("initialValue"),
        @ExcelArgument("steps")
    })
    public ValueSchedule of(double initialValue, ValueStep[] steps) {
        List<ValueStep> steps_List = Arrays.asList(steps);
        return ValueSchedule.of(initialValue, steps_List);
    }
}
