/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.product.fx;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.product.fx.FxSingle;
import com.opengamma.strata.product.fx.ResolvedFxSingle;
import java.time.LocalDate;
    

public class FxSingleXL {
    private final ExcelAddIn xl;

    public FxSingleXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.FxSingle.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("amount1"),
        @ExcelArgument("amount2"),
        @ExcelArgument("paymentDate")
    })
    public FxSingle of(CurrencyAmount amount1, CurrencyAmount amount2, LocalDate paymentDate) {
        return FxSingle.of(amount1, amount2, paymentDate);
    }

    @ExcelFunction(
        value = "og.FxSingle.resolve",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fxSingle"),
        @ExcelArgument("refData")
    })
    public ResolvedFxSingle resolve(FxSingle fxSingle, ReferenceData refData) {
        return fxSingle.resolve(refData);
    }
}
