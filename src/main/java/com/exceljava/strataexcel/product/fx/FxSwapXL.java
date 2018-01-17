/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.product.fx;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.basics.currency.FxRate;
import com.opengamma.strata.product.fx.FxSwap;
import com.opengamma.strata.product.fx.ResolvedFxSwap;
import java.time.LocalDate;
    

public class FxSwapXL {
    private final ExcelAddIn xl;

    public FxSwapXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.FxSwap.ofForwardPoints",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("amount"),
        @ExcelArgument("nearRate"),
        @ExcelArgument("forwardPoints"),
        @ExcelArgument("nearDate"),
        @ExcelArgument("farDate")
    })
    public FxSwap ofForwardPoints(CurrencyAmount amount, FxRate nearRate, double forwardPoints, LocalDate nearDate, LocalDate farDate) {
        return FxSwap.ofForwardPoints(amount, nearRate, forwardPoints, nearDate, farDate);
    }

    @ExcelFunction(
        value = "og.FxSwap.resolve",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fxSwap"),
        @ExcelArgument("refData")
    })
    public ResolvedFxSwap resolve(FxSwap fxSwap, ReferenceData refData) {
        return fxSwap.resolve(refData);
    }

    @ExcelFunction(
        value = "og.FxSwap.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fxSwap")
    })
    public String toString(FxSwap fxSwap) {
        return fxSwap.toString();
    }
}
