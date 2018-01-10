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
import com.opengamma.strata.data.FieldName;
    

public class FieldNameXL {
    private final ExcelAddIn xl;

    public FieldNameXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.FieldName.MARKET_VALUE",
        category = "Strata",
        isThreadSafe = true
    )
    public FieldName MARKET_VALUE() {
        return FieldName.MARKET_VALUE;
    }
    
    @ExcelFunction(
        value = "og.FieldName.SETTLEMENT_PRICE",
        category = "Strata",
        isThreadSafe = true
    )
    public FieldName SETTLEMENT_PRICE() {
        return FieldName.SETTLEMENT_PRICE;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.FieldName.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("name")
    })
    public FieldName of(String name) {
        return FieldName.of(name);
    }
}
