/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.jinx.strataexcel.collect.timeseries;

import com.jinx.ExcelAddIn;
import com.jinx.ExcelArgument;
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeries;
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeriesBuilder;
import java.time.LocalDate;
import java.util.Arrays;
    

public class LocalDateDoubleTimeSeriesXL {
    private final ExcelAddIn xl;

    public LocalDateDoubleTimeSeriesXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.LocalDateDoubleTimeSeries.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("dates"),
        @ExcelArgument("values")
    })
    public LocalDateDoubleTimeSeries of(LocalDate[] dates, Double[] values) {
       LocalDateDoubleTimeSeriesBuilder builder = LocalDateDoubleTimeSeries.builder();
       builder.putAll(Arrays.asList(dates), Arrays.asList(values));
       return builder.build();
    }
}
