/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.jinx.strataexcel.basics.date;

import com.jinx.ExcelAddIn;
import com.jinx.ExcelArgument;
import com.jinx.ExcelArgumentConverter;
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import com.opengamma.strata.basics.date.BusinessDayConvention;
import com.opengamma.strata.basics.date.HolidayCalendarId;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class BusinessDayAdjustmentXL {
    private final ExcelAddIn xl;

    public BusinessDayAdjustmentXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.BusinessDayAdjustment.NONE",
        category = "Strata",
        isThreadSafe = true
    )
    public BusinessDayAdjustment NONE() {
        return BusinessDayAdjustment.NONE;
    }
    
    @ExcelFunction(
        value = "og.BusinessDayAdjustment.adjust",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("businessDayAdjustment"),
        @ExcelArgument("date"),
        @ExcelArgument("refData")
    })
    public LocalDate adjust(BusinessDayAdjustment businessDayAdjustment, LocalDate date, ReferenceData refData) {
        return businessDayAdjustment.adjust(date, refData);
    }

    @ExcelFunction(
        value = "og.BusinessDayAdjustment.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public BusinessDayAdjustment builder(String[] keys, Object[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        BusinessDayAdjustment.Builder builder = BusinessDayAdjustment.builder();
        
        Object convention = args.get("convention");
        if (null != convention) {
            BusinessDayConvention value;
            try {
                value = xl.convertArgument(convention, BusinessDayConvention.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("convention could not be converted to BusinessDayConvention", e);
            }
            builder = builder.convention(value);
            usedArgs.add("convention");
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
        
        return builder.build();
    }
        
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.BusinessDayAdjustment.get",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fieldName")
    })
    public BusinessDayAdjustment getStaticField(String fieldName) {
        if (null == fieldName) {
            throw new IllegalArgumentException("fieldName is null");
        }
        if (fieldName.equals("NONE")) {
            return BusinessDayAdjustment.NONE;
        }
        throw new IllegalArgumentException(String.format("%s is invalid", fieldName));
    }
    @ExcelFunction(
        value = "og.BusinessDayAdjustment.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("convention"),
        @ExcelArgument("calendar")
    })
    public BusinessDayAdjustment of(BusinessDayConvention convention, HolidayCalendarId calendar) {
        return BusinessDayAdjustment.of(convention, calendar);
    }

    @ExcelFunction(
        value = "og.BusinessDayAdjustment.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("businessDayAdjustment")
    })
    public String toString(BusinessDayAdjustment businessDayAdjustment) {
        return businessDayAdjustment.toString();
    }
}
