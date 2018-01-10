/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.basics.schedule;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.date.AdjustableDate;
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import com.opengamma.strata.basics.schedule.Frequency;
import com.opengamma.strata.basics.schedule.PeriodicSchedule;
import com.opengamma.strata.basics.schedule.RollConvention;
import com.opengamma.strata.basics.schedule.StubConvention;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class PeriodicScheduleXL {
    private final ExcelAddIn xl;

    public PeriodicScheduleXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.PeriodicSchedule.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public PeriodicSchedule builder(String[] keys, Object[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        PeriodicSchedule.Builder builder = PeriodicSchedule.builder();
        
        Object startDate = args.get("startdate");
        if (null != startDate) {
            LocalDate value;
            try {
                value = xl.convertArgument(startDate, LocalDate.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("startDate could not be converted to LocalDate", e);
            }
            builder = builder.startDate(value);
            usedArgs.add("startdate");
        }
        
        Object endDate = args.get("enddate");
        if (null != endDate) {
            LocalDate value;
            try {
                value = xl.convertArgument(endDate, LocalDate.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("endDate could not be converted to LocalDate", e);
            }
            builder = builder.endDate(value);
            usedArgs.add("enddate");
        }
        
        Object frequency = args.get("frequency");
        if (null != frequency) {
            Frequency value;
            try {
                value = xl.convertArgument(frequency, Frequency.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("frequency could not be converted to Frequency", e);
            }
            builder = builder.frequency(value);
            usedArgs.add("frequency");
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
        
        Object startDateBusinessDayAdjustment = args.get("startdatebusinessdayadjustment");
        if (null != startDateBusinessDayAdjustment) {
            BusinessDayAdjustment value;
            try {
                value = xl.convertArgument(startDateBusinessDayAdjustment, BusinessDayAdjustment.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("startDateBusinessDayAdjustment could not be converted to BusinessDayAdjustment", e);
            }
            builder = builder.startDateBusinessDayAdjustment(value);
            usedArgs.add("startdatebusinessdayadjustment");
        }
        
        Object endDateBusinessDayAdjustment = args.get("enddatebusinessdayadjustment");
        if (null != endDateBusinessDayAdjustment) {
            BusinessDayAdjustment value;
            try {
                value = xl.convertArgument(endDateBusinessDayAdjustment, BusinessDayAdjustment.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("endDateBusinessDayAdjustment could not be converted to BusinessDayAdjustment", e);
            }
            builder = builder.endDateBusinessDayAdjustment(value);
            usedArgs.add("enddatebusinessdayadjustment");
        }
        
        Object stubConvention = args.get("stubconvention");
        if (null != stubConvention) {
            StubConvention value;
            try {
                value = xl.convertArgument(stubConvention, StubConvention.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("stubConvention could not be converted to StubConvention", e);
            }
            builder = builder.stubConvention(value);
            usedArgs.add("stubconvention");
        }
        
        Object rollConvention = args.get("rollconvention");
        if (null != rollConvention) {
            RollConvention value;
            try {
                value = xl.convertArgument(rollConvention, RollConvention.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("rollConvention could not be converted to RollConvention", e);
            }
            builder = builder.rollConvention(value);
            usedArgs.add("rollconvention");
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
        
        Object overrideStartDate = args.get("overridestartdate");
        if (null != overrideStartDate) {
            AdjustableDate value;
            try {
                value = xl.convertArgument(overrideStartDate, AdjustableDate.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("overrideStartDate could not be converted to AdjustableDate", e);
            }
            builder = builder.overrideStartDate(value);
            usedArgs.add("overridestartdate");
        }
        
        return builder.build();
    }
        
    @ExcelFunction(
        value = "og.PeriodicSchedule.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("periodicSchedule")
    })
    public String toString(PeriodicSchedule periodicSchedule) {
        return periodicSchedule.toString();
    }
}
