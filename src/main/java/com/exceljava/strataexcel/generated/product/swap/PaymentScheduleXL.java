/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.product.swap;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.schedule.Frequency;
import com.opengamma.strata.product.swap.CompoundingMethod;
import com.opengamma.strata.product.swap.PaymentRelativeTo;
import com.opengamma.strata.product.swap.PaymentSchedule;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class PaymentScheduleXL {
    private final ExcelAddIn xl;

    public PaymentScheduleXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.PaymentSchedule.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public PaymentSchedule builder(String[] keys, Object[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        PaymentSchedule.Builder builder = PaymentSchedule.builder();
        
        Object paymentFrequency = args.get("paymentfrequency");
        if (null != paymentFrequency) {
            Frequency value;
            try {
                value = xl.convertArgument(paymentFrequency, Frequency.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("paymentFrequency could not be converted to Frequency", e);
            }
            builder = builder.paymentFrequency(value);
            usedArgs.add("paymentfrequency");
        }
        
        Object businessDayAdjustment = args.get("businessdayadjustment");
        if (null != businessDayAdjustment) {
            BusinessDayAdjustment value;
            try {
                value = xl.convertArgument(businessDayAdjustment, BusinessDayAdjustment.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("businessDayAdjustment could not be converted to BusinessDayAdjustment", e);
            }
            builder = builder.businessDayAdjustment(value);
            usedArgs.add("businessdayadjustment");
        }
        
        Object paymentRelativeTo = args.get("paymentrelativeto");
        if (null != paymentRelativeTo) {
            PaymentRelativeTo value;
            try {
                value = xl.convertArgument(paymentRelativeTo, PaymentRelativeTo.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("paymentRelativeTo could not be converted to PaymentRelativeTo", e);
            }
            builder = builder.paymentRelativeTo(value);
            usedArgs.add("paymentrelativeto");
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
        
        Object compoundingMethod = args.get("compoundingmethod");
        if (null != compoundingMethod) {
            CompoundingMethod value;
            try {
                value = xl.convertArgument(compoundingMethod, CompoundingMethod.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("compoundingMethod could not be converted to CompoundingMethod", e);
            }
            builder = builder.compoundingMethod(value);
            usedArgs.add("compoundingmethod");
        }
        
        Object firstRegularStartDate = args.get("firstregularstartdate");
        if (null != firstRegularStartDate) {
            LocalDate value;
            try {
                value = xl.convertArgument(firstRegularStartDate, LocalDate.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("firstRegularStartDate could not be converted to LocalDate", e);
            }
            builder = builder.firstRegularStartDate(value);
            usedArgs.add("firstregularstartdate");
        }
        
        Object lastRegularEndDate = args.get("lastregularenddate");
        if (null != lastRegularEndDate) {
            LocalDate value;
            try {
                value = xl.convertArgument(lastRegularEndDate, LocalDate.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("lastRegularEndDate could not be converted to LocalDate", e);
            }
            builder = builder.lastRegularEndDate(value);
            usedArgs.add("lastregularenddate");
        }
        
        return builder.build();
    }
}
