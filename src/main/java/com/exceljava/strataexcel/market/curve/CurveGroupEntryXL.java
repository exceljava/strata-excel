/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.market.curve;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.index.Index;
import com.opengamma.strata.market.curve.CurveGroupEntry;
import com.opengamma.strata.market.curve.CurveName;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
    

public class CurveGroupEntryXL {
    private final ExcelAddIn xl;

    public CurveGroupEntryXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.CurveGroupEntry.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("curveName"),
        @ExcelArgument("discountCurrencies"),
        @ExcelArgument("indices")
    })
    public CurveGroupEntry of(CurveName curveName, Currency[] discountCurrencies, Index[] indices) {
        CurveGroupEntry.Builder builder = CurveGroupEntry.builder();
        builder.curveName(curveName);
        if (null != discountCurrencies) {
            Set<Currency> ccys = new HashSet<Currency>(Arrays.asList(discountCurrencies));
            builder.discountCurrencies(ccys);
        }
        if (null != indices) {
            Set<Index> idx = new HashSet<Index>(Arrays.asList(indices));
            builder.indices(idx);
        }
        return builder.build();
    }

    @ExcelFunction(
        value = "og.CurveGroupEntry.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("curveGroupEntry")
    })
    public String toString(CurveGroupEntry curveGroupEntry) {
        return curveGroupEntry.toString();
    }
}
