/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.market.curve;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.index.Index;
import com.opengamma.strata.market.curve.CurveName;
import com.opengamma.strata.market.curve.RatesCurveGroupEntry;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
    

public class RatesCurveGroupEntryXL {
    private final ExcelAddIn xl;

    public RatesCurveGroupEntryXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.RatesCurveGroupEntry.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("curveName"),
        @ExcelArgument("discountCurrencies"),
        @ExcelArgument("indices")
    })
    public RatesCurveGroupEntry of(CurveName curveName, Currency[] discountCurrencies, Index[] indices) {
        RatesCurveGroupEntry.Builder builder = RatesCurveGroupEntry.builder();
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
}
