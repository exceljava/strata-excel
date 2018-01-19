/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.market.sensitivity;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.FxRateProvider;
import com.opengamma.strata.market.sensitivity.PointSensitivity;
    

public class PointSensitivityXL {
    private final ExcelAddIn xl;

    public PointSensitivityXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.PointSensitivity.compareKey",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("pointSensitivity"),
        @ExcelArgument("other")
    })
    public int compareKey(PointSensitivity pointSensitivity, PointSensitivity other) {
        return pointSensitivity.compareKey(other);
    }

    @ExcelFunction(
        value = "og.PointSensitivity.convertedTo",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("pointSensitivity"),
        @ExcelArgument("resultCurrency"),
        @ExcelArgument("rateProvider")
    })
    public PointSensitivity convertedTo(PointSensitivity pointSensitivity, Currency resultCurrency, FxRateProvider rateProvider) {
        return pointSensitivity.convertedTo(resultCurrency, rateProvider);
    }

    @ExcelFunction(
        value = "og.PointSensitivity.getCurrency",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("pointSensitivity")
    })
    public Currency getCurrency(PointSensitivity pointSensitivity) {
        return pointSensitivity.getCurrency();
    }

    @ExcelFunction(
        value = "og.PointSensitivity.getSensitivity",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("pointSensitivity")
    })
    public double getSensitivity(PointSensitivity pointSensitivity) {
        return pointSensitivity.getSensitivity();
    }

    @ExcelFunction(
        value = "og.PointSensitivity.withCurrency",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("pointSensitivity"),
        @ExcelArgument("currency")
    })
    public PointSensitivity withCurrency(PointSensitivity pointSensitivity, Currency currency) {
        return pointSensitivity.withCurrency(currency);
    }

    @ExcelFunction(
        value = "og.PointSensitivity.withSensitivity",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("pointSensitivity"),
        @ExcelArgument("sensitivity")
    })
    public PointSensitivity withSensitivity(PointSensitivity pointSensitivity, double sensitivity) {
        return pointSensitivity.withSensitivity(sensitivity);
    }
}
