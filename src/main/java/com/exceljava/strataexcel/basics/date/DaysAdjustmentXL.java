/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.basics.date;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.date.HolidayCalendarId;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class DaysAdjustmentXL {
    private final ExcelAddIn xl;

    public DaysAdjustmentXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.DaysAdjustment.NONE",
        category = "Strata",
        isThreadSafe = true
    )
    public DaysAdjustment NONE() {
        return DaysAdjustment.NONE;
    }
    
    @ExcelFunction(
        value = "og.DaysAdjustment.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public DaysAdjustment builder(String[] keys, Object[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        DaysAdjustment.Builder builder = DaysAdjustment.builder();
        
        Object days = args.get("days");
        if (null != days) {
            int value;
            try {
                value = xl.convertArgument(days, int.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("days could not be converted to int", e);
            }
            builder = builder.days(value);
            usedArgs.add("days");
        }
        
        Object calendar = args.get("calendar");
        if (null != calendar) {
            HolidayCalendarId value;
            try {
                value = xl.convertArgument(calendar, HolidayCalendarId.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("calendar could not be converted to HolidayCalendarId", e);
            }
            builder = builder.calendar(value);
            usedArgs.add("calendar");
        }
        
        Object adjustment = args.get("adjustment");
        if (null != adjustment) {
            BusinessDayAdjustment value;
            try {
                value = xl.convertArgument(adjustment, BusinessDayAdjustment.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("adjustment could not be converted to BusinessDayAdjustment", e);
            }
            builder = builder.adjustment(value);
            usedArgs.add("adjustment");
        }
        
        return builder.build();
    }
        
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.DaysAdjustment.get",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fieldName")
    })
    public DaysAdjustment getStaticField(String fieldName) {
        if (null == fieldName) {
            throw new IllegalArgumentException("fieldName is null");
        }
        if (fieldName.equals("NONE")) {
            return DaysAdjustment.NONE;
        }
        throw new IllegalArgumentException(String.format("%s is invalid", fieldName));
    }
    @ExcelFunction(
        value = "og.DaysAdjustment.ofBusinessDays",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("numberOfDays"),
        @ExcelArgument("holidayCalendar"),
        @ExcelArgument("adjustment")
    })
    public DaysAdjustment ofBusinessDays(int numberOfDays, HolidayCalendarId holidayCalendar, BusinessDayAdjustment adjustment) {
        return DaysAdjustment.ofBusinessDays(numberOfDays, holidayCalendar, adjustment);
    }

    @ExcelFunction(
        value = "og.DaysAdjustment.ofCalendarDays",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("numberOfDays"),
        @ExcelArgument("adjustment")
    })
    public DaysAdjustment ofCalendarDays(int numberOfDays, BusinessDayAdjustment adjustment) {
        return DaysAdjustment.ofCalendarDays(numberOfDays, adjustment);
    }

    @ExcelFunction(
        value = "og.DaysAdjustment.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("daysAdjustment")
    })
    public String toString(DaysAdjustment daysAdjustment) {
        return daysAdjustment.toString();
    }
}
