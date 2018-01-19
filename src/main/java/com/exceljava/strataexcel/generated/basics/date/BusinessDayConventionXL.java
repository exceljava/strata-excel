/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.basics.date;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.exceljava.jinx.ExcelReturnConverter;
import com.opengamma.strata.basics.date.BusinessDayConvention;
    

public class BusinessDayConventionXL {
    private final ExcelAddIn xl;

    public BusinessDayConventionXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelReturnConverter
    @ExcelFunction(
        value = "og.BusinessDayConvention.getName",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("businessDayConvention")
    })
    public String getName(BusinessDayConvention businessDayConvention) {
        return businessDayConvention.getName();
    }

    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.BusinessDayConvention.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("uniqueName")
    })
    public BusinessDayConvention of(String uniqueName) {
        return BusinessDayConvention.of(uniqueName);
    }
}
