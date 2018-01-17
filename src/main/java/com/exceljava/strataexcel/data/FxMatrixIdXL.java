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
import com.opengamma.strata.data.FxMatrixId;
import com.opengamma.strata.data.ObservableSource;
    

public class FxMatrixIdXL {
    private final ExcelAddIn xl;

    public FxMatrixIdXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.FxMatrixId.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("observableSource")
    })
    public FxMatrixId of(ObservableSource observableSource) {
        return FxMatrixId.of(observableSource);
    }

    @ExcelFunction(
        value = "og.FxMatrixId.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fxMatrixId")
    })
    public String toString(FxMatrixId fxMatrixId) {
        return fxMatrixId.toString();
    }
}
