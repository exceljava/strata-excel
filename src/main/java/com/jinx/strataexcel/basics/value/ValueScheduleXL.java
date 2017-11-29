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
import com.jinx.ExcelArgumentConverter;
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
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

    @ExcelFunction(
        value = "og.ValueSchedule.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("valueSchedule")
    })
    public String toString(ValueSchedule valueSchedule) {
        return valueSchedule.toString();
    }
}
