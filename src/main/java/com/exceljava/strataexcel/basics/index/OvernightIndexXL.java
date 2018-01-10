/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.basics.index;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.index.OvernightIndex;
    

public class OvernightIndexXL {
    private final ExcelAddIn xl;

    public OvernightIndexXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.OvernightIndex.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("uniqueName")
    })
    public OvernightIndex of(String uniqueName) {
        return OvernightIndex.of(uniqueName);
    }
}
