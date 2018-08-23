/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.pricer.curve;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.market.curve.RatesCurveGroupDefinition;
import com.opengamma.strata.pricer.curve.RatesCurveCalibrator;
import com.opengamma.strata.pricer.rate.ImmutableRatesProvider;
    

public class RatesCurveCalibratorXL {
    private final ExcelAddIn xl;

    public RatesCurveCalibratorXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.RatesCurveCalibrator.calibrate",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("ratesCurveCalibrator"),
        @ExcelArgument("curveGroupDefn"),
        @ExcelArgument("marketData"),
        @ExcelArgument("refData")
    })
    public ImmutableRatesProvider calibrate(RatesCurveCalibrator ratesCurveCalibrator, RatesCurveGroupDefinition curveGroupDefn, MarketData marketData, ReferenceData refData) {
        return ratesCurveCalibrator.calibrate(curveGroupDefn, marketData, refData);
    }

    @ExcelFunction(
        value = "og.RatesCurveCalibrator.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("toleranceAbs"),
        @ExcelArgument("toleranceRel"),
        @ExcelArgument("stepMaximum")
    })
    public RatesCurveCalibrator of(double toleranceAbs, double toleranceRel, int stepMaximum) {
        return RatesCurveCalibrator.of(toleranceAbs, toleranceRel, stepMaximum);
    }

    @ExcelFunction(
        value = "og.RatesCurveCalibrator.standard",
        category = "Strata",
        isThreadSafe = true
    )
    public RatesCurveCalibrator standard() {
        return RatesCurveCalibrator.standard();
    }
}
