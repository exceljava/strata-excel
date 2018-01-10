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
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.value.ValueAdjustment;
    

public class ValueAdjustmentXL {
    private final ExcelAddIn xl;

    public ValueAdjustmentXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.ValueAdjustment.NONE",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueAdjustment NONE() {
        return ValueAdjustment.NONE;
    }
    
    @ExcelFunction(
        value = "og.ValueAdjustment.adjust",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("valueAdjustment"),
        @ExcelArgument("baseValue")
    })
    public double adjust(ValueAdjustment valueAdjustment, double baseValue) {
        return valueAdjustment.adjust(baseValue);
    }

    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.ValueAdjustment.get",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fieldName")
    })
    public ValueAdjustment getStaticField(String fieldName) {
        if (null == fieldName) {
            throw new IllegalArgumentException("fieldName is null");
        }
        if (fieldName.equals("NONE")) {
            return ValueAdjustment.NONE;
        }
        throw new IllegalArgumentException(String.format("%s is invalid", fieldName));
    }
    @ExcelFunction(
        value = "og.ValueAdjustment.ofDeltaAmount",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("deltaAmount")
    })
    public ValueAdjustment ofDeltaAmount(double deltaAmount) {
        return ValueAdjustment.ofDeltaAmount(deltaAmount);
    }

    @ExcelFunction(
        value = "og.ValueAdjustment.ofDeltaMultiplier",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("deltaMultiplier")
    })
    public ValueAdjustment ofDeltaMultiplier(double deltaMultiplier) {
        return ValueAdjustment.ofDeltaMultiplier(deltaMultiplier);
    }

    @ExcelFunction(
        value = "og.ValueAdjustment.ofMultiplier",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("multiplier")
    })
    public ValueAdjustment ofMultiplier(double multiplier) {
        return ValueAdjustment.ofMultiplier(multiplier);
    }

    @ExcelFunction(
        value = "og.ValueAdjustment.ofReplace",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("replacementValue")
    })
    public ValueAdjustment ofReplace(double replacementValue) {
        return ValueAdjustment.ofReplace(replacementValue);
    }

    @ExcelFunction(
        value = "og.ValueAdjustment.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("valueAdjustment")
    })
    public String toString(ValueAdjustment valueAdjustment) {
        return valueAdjustment.toString();
    }
}
