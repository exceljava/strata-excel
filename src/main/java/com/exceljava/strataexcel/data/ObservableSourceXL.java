/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.data;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.data.ObservableSource;
    

public class ObservableSourceXL {
    private final ExcelAddIn xl;

    public ObservableSourceXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.ObservableSource.NONE",
        category = "Strata",
        isThreadSafe = true
    )
    public ObservableSource NONE() {
        return ObservableSource.NONE;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.ObservableSource.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("name")
    })
    public ObservableSource of(String name) {
        return ObservableSource.of(name);
    }
}
