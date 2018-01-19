/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.basics;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.exceljava.jinx.ExcelReturnConverter;
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

    @ExcelReturnConverter
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
