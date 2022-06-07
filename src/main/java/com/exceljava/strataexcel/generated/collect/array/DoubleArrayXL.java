/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.collect.array;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.collect.array.DoubleArray;
    

public class DoubleArrayXL {
    private final ExcelAddIn xl;

    public DoubleArrayXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.DoubleArray.EMPTY",
        category = "Strata",
        isThreadSafe = true
    )
    public DoubleArray EMPTY() {
        return DoubleArray.EMPTY;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.DoubleArray.get",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fieldName")
    })
    public DoubleArray getStaticField(String fieldName) {
        if (null == fieldName) {
            throw new IllegalArgumentException("fieldName is null");
        }
        if (fieldName.equals("EMPTY")) {
            return DoubleArray.EMPTY;
        }
        throw new IllegalArgumentException(String.format("%s is invalid", fieldName));
    }
    @ExcelFunction(
        value = "og.DoubleArray.toArray",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("doubleArray")
    })
    public double[] toArray(DoubleArray doubleArray) {
        return doubleArray.toArray();
    }
}
