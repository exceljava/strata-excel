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
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.FxRateProvider;
import com.opengamma.strata.market.sensitivity.PointSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivity;
import java.util.Arrays;
import java.util.List;
    

public class PointSensitivitiesXL {
    private final ExcelAddIn xl;

    public PointSensitivitiesXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.PointSensitivities.combinedWith",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("pointSensitivities"),
        @ExcelArgument("other")
    })
    public PointSensitivities combinedWith(PointSensitivities pointSensitivities, PointSensitivities other) {
        return pointSensitivities.combinedWith(other);
    }

    @ExcelFunction(
        value = "og.PointSensitivities.convertedTo",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("pointSensitivities"),
        @ExcelArgument("resultCurrency"),
        @ExcelArgument("rateProvider")
    })
    public PointSensitivities convertedTo(PointSensitivities pointSensitivities, Currency resultCurrency, FxRateProvider rateProvider) {
        return pointSensitivities.convertedTo(resultCurrency, rateProvider);
    }

    @ExcelFunction(
        value = "og.PointSensitivities.empty",
        category = "Strata",
        isThreadSafe = true
    )
    public PointSensitivities empty() {
        return PointSensitivities.empty();
    }

    @ExcelFunction(
        value = "og.PointSensitivities.equalWithTolerance",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("pointSensitivities"),
        @ExcelArgument("other"),
        @ExcelArgument("tolerance")
    })
    public boolean equalWithTolerance(PointSensitivities pointSensitivities, PointSensitivities other, double tolerance) {
        return pointSensitivities.equalWithTolerance(other, tolerance);
    }

    @ExcelFunction(
        value = "og.PointSensitivities.getSensitivities",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("pointSensitivities")
    })
    public ImmutableList<PointSensitivity> getSensitivities(PointSensitivities pointSensitivities) {
        return pointSensitivities.getSensitivities();
    }

    @ExcelFunction(
        value = "og.PointSensitivities.multipliedBy",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("pointSensitivities"),
        @ExcelArgument("factor")
    })
    public PointSensitivities multipliedBy(PointSensitivities pointSensitivities, double factor) {
        return pointSensitivities.multipliedBy(factor);
    }

    @ExcelFunction(
        value = "og.PointSensitivities.normalized",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("pointSensitivities")
    })
    public PointSensitivities normalized(PointSensitivities pointSensitivities) {
        return pointSensitivities.normalized();
    }

    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.PointSensitivities.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("sensitivities")
    })
    public PointSensitivities of(PointSensitivity[] sensitivities) {
        List<PointSensitivity> sensitivities_List = Arrays.asList(sensitivities);
        return PointSensitivities.of(sensitivities_List);
    }

    @ExcelFunction(
        value = "og.PointSensitivities.size",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("pointSensitivities")
    })
    public int size(PointSensitivities pointSensitivities) {
        return pointSensitivities.size();
    }
}
