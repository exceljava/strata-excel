/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.jinx.strataexcel.basics;

import com.jinx.ExcelAddIn;
import com.jinx.ExcelArgument;
import com.jinx.ExcelArgumentConverter;
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
import com.opengamma.strata.basics.StandardId;
    

public class StandardIdXL {
    private final ExcelAddIn xl;

    public StandardIdXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.StandardId.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("scheme"),
        @ExcelArgument("value")
    })
    public StandardId of(String scheme, String value) {
        return StandardId.of(scheme, value);
    }

    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.StandardId.parse",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("str")
    })
    public StandardId parse(String str) {
        return StandardId.parse(str);
    }

    @ExcelFunction(
        value = "og.StandardId.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("standardId")
    })
    public String toString(StandardId standardId) {
        return standardId.toString();
    }
}
