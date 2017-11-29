/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.jinx.strataexcel.data;

import com.jinx.ExcelAddIn;
import com.jinx.ExcelArgument;
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeries;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.ObservableId;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;;
    

public class MarketDataXL {
    private final ExcelAddIn xl;

    public MarketDataXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.MarketData.combinedWith",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("marketData"),
        @ExcelArgument("other")
    })
    public MarketData combinedWith(MarketData marketData, MarketData other) {
        return marketData.combinedWith(other);
    }

    @ExcelFunction(
        value = "og.MarketData.empty",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("valuationDate")
    })
    public MarketData empty(LocalDate valuationDate) {
        return MarketData.empty(valuationDate);
    }

    @ExcelFunction(
        value = "og.MarketData.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("valuationDate"),
        @ExcelArgument("keys"),
        @ExcelArgument("values"),
        @ExcelArgument("tsKeys"),
        @ExcelArgument("tsValues")
    })
    public MarketData of(LocalDate valuationDate,
                  ObservableId[] keys, Double[] values,
                  ObservableId[] tsKeys, LocalDateDoubleTimeSeries[] tsValues) {
        if (keys.length != values.length) {{
            throw new IllegalArgumentException("Keys and values must be the same length");
        }}
    
        Map<ObservableId, Double> valuesMap = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> keys[i] != null && values[i] != null)
                .collect(toMap(i -> keys[i], i -> values[i]));
    
        if (null != tsKeys && null != tsValues) {
            Map<ObservableId, LocalDateDoubleTimeSeries> tsValuesMap = IntStream
                  .range(0, tsKeys.length)
                  .boxed()
                  .filter(i -> tsKeys[i] != null && tsValues[i] != null)
                  .collect(toMap(i -> tsKeys[i], i -> tsValues[i]));
    
            return MarketData.of(valuationDate, valuesMap, tsValuesMap);
        }
    
        return MarketData.of(valuationDate, valuesMap);
    }
}
