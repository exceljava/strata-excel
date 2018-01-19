/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.basics.index;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.date.Tenor;
import com.opengamma.strata.basics.index.FloatingRateIndex;
    

public class FloatingRateIndexXL {
    private final ExcelAddIn xl;

    public FloatingRateIndexXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.FloatingRateIndex.parse",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("indexStr")
    })
    public FloatingRateIndex parse(String indexStr) {
        return FloatingRateIndex.parse(indexStr);
    }

    @ExcelFunction(
        value = "og.FloatingRateIndex.parseWithTenor",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("indexStr"),
        @ExcelArgument("defaultIborTenor")
    })
    public FloatingRateIndex parse(String indexStr, Tenor defaultIborTenor) {
        return FloatingRateIndex.parse(indexStr, defaultIborTenor);
    }
}
