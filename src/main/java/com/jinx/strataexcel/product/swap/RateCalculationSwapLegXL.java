/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.jinx.strataexcel.product.swap;

import com.jinx.ExcelAddIn;
import com.jinx.ExcelArgument;
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
import com.opengamma.strata.basics.schedule.PeriodicSchedule;
import com.opengamma.strata.product.common.PayReceive;
import com.opengamma.strata.product.swap.NotionalSchedule;
import com.opengamma.strata.product.swap.PaymentSchedule;
import com.opengamma.strata.product.swap.RateCalculation;
import com.opengamma.strata.product.swap.RateCalculationSwapLeg;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class RateCalculationSwapLegXL {
    private final ExcelAddIn xl;

    public RateCalculationSwapLegXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.RateCalculationSwapLeg.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public RateCalculationSwapLeg builder(String[] keys, Object[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        RateCalculationSwapLeg.Builder builder = RateCalculationSwapLeg.builder();
        
        Object payReceive = args.get("payreceive");
        if (null != payReceive) {
            PayReceive value;
            try {
                value = xl.convertArgument(payReceive, PayReceive.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("payReceive could not be converted to PayReceive", e);
            }
            builder = builder.payReceive(value);
            usedArgs.add("payreceive");
        }
        
        Object accrualSchedule = args.get("accrualschedule");
        if (null != accrualSchedule) {
            PeriodicSchedule value;
            try {
                value = xl.convertArgument(accrualSchedule, PeriodicSchedule.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("accrualSchedule could not be converted to PeriodicSchedule", e);
            }
            builder = builder.accrualSchedule(value);
            usedArgs.add("accrualschedule");
        }
        
        Object paymentSchedule = args.get("paymentschedule");
        if (null != paymentSchedule) {
            PaymentSchedule value;
            try {
                value = xl.convertArgument(paymentSchedule, PaymentSchedule.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("paymentSchedule could not be converted to PaymentSchedule", e);
            }
            builder = builder.paymentSchedule(value);
            usedArgs.add("paymentschedule");
        }
        
        Object notionalSchedule = args.get("notionalschedule");
        if (null != notionalSchedule) {
            NotionalSchedule value;
            try {
                value = xl.convertArgument(notionalSchedule, NotionalSchedule.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("notionalSchedule could not be converted to NotionalSchedule", e);
            }
            builder = builder.notionalSchedule(value);
            usedArgs.add("notionalschedule");
        }
        
        Object calculation = args.get("calculation");
        if (null != calculation) {
            RateCalculation value;
            try {
                value = xl.convertArgument(calculation, RateCalculation.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("calculation could not be converted to RateCalculation", e);
            }
            builder = builder.calculation(value);
            usedArgs.add("calculation");
        }
        
        return builder.build();
    }
        
    @ExcelFunction(
        value = "og.RateCalculationSwapLeg.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("rateCalculationSwapLeg")
    })
    public String toString(RateCalculationSwapLeg rateCalculationSwapLeg) {
        return rateCalculationSwapLeg.toString();
    }
}
