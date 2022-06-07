/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.product.swap.type;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.index.PriceIndex;
import com.opengamma.strata.product.swap.PriceIndexCalculationMethod;
import com.opengamma.strata.product.swap.type.InflationRateSwapLegConvention;
import java.time.Period;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class InflationRateSwapLegConventionXL {
    private final ExcelAddIn xl;

    public InflationRateSwapLegConventionXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.InflationRateSwapLegConvention.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public InflationRateSwapLegConvention builder(String[] keys, Object[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        InflationRateSwapLegConvention.Builder builder = InflationRateSwapLegConvention.builder();
        
        Object index = args.get("index");
        if (null != index) {
            PriceIndex value;
            try {
                value = xl.convertArgument(index, PriceIndex.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("index could not be converted to PriceIndex", e);
            }
            builder = builder.index(value);
            usedArgs.add("index");
        }
        
        Object lag = args.get("lag");
        if (null != lag) {
            Period value;
            try {
                value = xl.convertArgument(lag, Period.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("lag could not be converted to Period", e);
            }
            builder = builder.lag(value);
            usedArgs.add("lag");
        }
        
        Object indexCalculationMethod = args.get("indexcalculationmethod");
        if (null != indexCalculationMethod) {
            PriceIndexCalculationMethod value;
            try {
                value = xl.convertArgument(indexCalculationMethod, PriceIndexCalculationMethod.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("indexCalculationMethod could not be converted to PriceIndexCalculationMethod", e);
            }
            builder = builder.indexCalculationMethod(value);
            usedArgs.add("indexcalculationmethod");
        }
        
        Object notionalExchange = args.get("notionalexchange");
        if (null != notionalExchange) {
            Boolean value;
            try {
                value = xl.convertArgument(notionalExchange, Boolean.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("notionalExchange could not be converted to Boolean", e);
            }
            builder = builder.notionalExchange(value);
            usedArgs.add("notionalexchange");
        }
        
        Object paymentDateOffset = args.get("paymentdateoffset");
        if (null != paymentDateOffset) {
            DaysAdjustment value;
            try {
                value = xl.convertArgument(paymentDateOffset, DaysAdjustment.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("paymentDateOffset could not be converted to DaysAdjustment", e);
            }
            builder = builder.paymentDateOffset(value);
            usedArgs.add("paymentdateoffset");
        }
        
        Object accrualBusinessDayAdjustment = args.get("accrualbusinessdayadjustment");
        if (null != accrualBusinessDayAdjustment) {
            BusinessDayAdjustment value;
            try {
                value = xl.convertArgument(accrualBusinessDayAdjustment, BusinessDayAdjustment.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("accrualBusinessDayAdjustment could not be converted to BusinessDayAdjustment", e);
            }
            builder = builder.accrualBusinessDayAdjustment(value);
            usedArgs.add("accrualbusinessdayadjustment");
        }
        
        return builder.build();
    }
}
