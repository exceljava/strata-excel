/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.market.observable;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.data.FieldName;
import com.opengamma.strata.market.observable.QuoteId;
    

public class QuoteIdXL {
    private final ExcelAddIn xl;

    public QuoteIdXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.QuoteId.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("standardId")
    })
    public QuoteId of(StandardId standardId) {
        return QuoteId.of(standardId);
    }

    @ExcelFunction(
        value = "og.QuoteId.ofIdAndFieldName",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("standardId"),
        @ExcelArgument("fieldName")
    })
    public QuoteId of(StandardId standardId, FieldName fieldName) {
        return QuoteId.of(standardId, fieldName);
    }

    @ExcelFunction(
        value = "og.QuoteId.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("quoteId")
    })
    public String toString(QuoteId quoteId) {
        return quoteId.toString();
    }
}
