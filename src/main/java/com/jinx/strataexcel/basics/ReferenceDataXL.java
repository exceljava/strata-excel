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
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
import com.opengamma.strata.basics.ReferenceData;
    

public class ReferenceDataXL {
    private final ExcelAddIn xl;

    public ReferenceDataXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.ReferenceData.combinedWith",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("referenceData"),
        @ExcelArgument("other")
    })
    public ReferenceData combinedWith(ReferenceData referenceData, ReferenceData other) {
        return referenceData.combinedWith(other);
    }

    @ExcelFunction(
        value = "og.ReferenceData.empty",
        category = "Strata",
        isThreadSafe = true
    )
    public ReferenceData empty() {
        return ReferenceData.empty();
    }

    @ExcelFunction(
        value = "og.ReferenceData.minimal",
        category = "Strata",
        isThreadSafe = true
    )
    public ReferenceData minimal() {
        return ReferenceData.minimal();
    }

    @ExcelFunction(
        value = "og.ReferenceData.standard",
        category = "Strata",
        isThreadSafe = true
    )
    public ReferenceData standard() {
        return ReferenceData.standard();
    }
}
