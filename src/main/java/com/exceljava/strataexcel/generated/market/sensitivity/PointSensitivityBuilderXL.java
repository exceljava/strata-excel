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
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.market.sensitivity.PointSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivity;
import com.opengamma.strata.market.sensitivity.PointSensitivityBuilder;
import java.util.Arrays;
import java.util.List;
    

public class PointSensitivityBuilderXL {
    private final ExcelAddIn xl;

    public PointSensitivityBuilderXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.PointSensitivityBuilder.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("pointSensitivityBuilder")
    })
    public PointSensitivities build(PointSensitivityBuilder pointSensitivityBuilder) {
        return pointSensitivityBuilder.build();
    }

    @ExcelFunction(
        value = "og.PointSensitivityBuilder.cloned",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("pointSensitivityBuilder")
    })
    public PointSensitivityBuilder cloned(PointSensitivityBuilder pointSensitivityBuilder) {
        return pointSensitivityBuilder.cloned();
    }

    @ExcelFunction(
        value = "og.PointSensitivityBuilder.combinedWith",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("pointSensitivityBuilder"),
        @ExcelArgument("other")
    })
    public PointSensitivityBuilder combinedWith(PointSensitivityBuilder pointSensitivityBuilder, PointSensitivityBuilder other) {
        return pointSensitivityBuilder.combinedWith(other);
    }

    @ExcelFunction(
        value = "og.PointSensitivityBuilder.multipliedBy",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("pointSensitivityBuilder"),
        @ExcelArgument("factor")
    })
    public PointSensitivityBuilder multipliedBy(PointSensitivityBuilder pointSensitivityBuilder, double factor) {
        return pointSensitivityBuilder.multipliedBy(factor);
    }

    @ExcelFunction(
        value = "og.PointSensitivityBuilder.none",
        category = "Strata",
        isThreadSafe = true
    )
    public PointSensitivityBuilder none() {
        return PointSensitivityBuilder.none();
    }

    @ExcelFunction(
        value = "og.PointSensitivityBuilder.normalize",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("pointSensitivityBuilder")
    })
    public PointSensitivityBuilder normalize(PointSensitivityBuilder pointSensitivityBuilder) {
        return pointSensitivityBuilder.normalize();
    }

    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.PointSensitivityBuilder.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("sensitivities")
    })
    public PointSensitivityBuilder of(PointSensitivity[] sensitivities) {
        List<PointSensitivity> sensitivities_List = Arrays.asList(sensitivities);
        return PointSensitivityBuilder.of(sensitivities_List);
    }

    @ExcelFunction(
        value = "og.PointSensitivityBuilder.withCurrency",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("pointSensitivityBuilder"),
        @ExcelArgument("currency")
    })
    public PointSensitivityBuilder withCurrency(PointSensitivityBuilder pointSensitivityBuilder, Currency currency) {
        return pointSensitivityBuilder.withCurrency(currency);
    }
}
