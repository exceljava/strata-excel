/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.product.index.type;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.product.index.type.IborFutureConvention;
import com.opengamma.strata.product.index.type.IborFutureTemplate;
import java.time.Period;
import java.time.YearMonth;
    

public class IborFutureTemplateXL {
    private final ExcelAddIn xl;

    public IborFutureTemplateXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.IborFutureTemplate.absolute",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("yearMonth"),
        @ExcelArgument("convention")
    })
    public IborFutureTemplate of(YearMonth yearMonth, IborFutureConvention convention) {
        return IborFutureTemplate.of(yearMonth, convention);
    }

    @ExcelFunction(
        value = "og.IborFutureTemplate.relative",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("minimumPeriod"),
        @ExcelArgument("sequenceNumber"),
        @ExcelArgument("convention")
    })
    public IborFutureTemplate of(Period minimumPeriod, int sequenceNumber, IborFutureConvention convention) {
        return IborFutureTemplate.of(minimumPeriod, sequenceNumber, convention);
    }
}
