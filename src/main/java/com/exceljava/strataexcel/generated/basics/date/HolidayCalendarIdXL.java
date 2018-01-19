/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.basics.date;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.date.HolidayCalendarId;
    

public class HolidayCalendarIdXL {
    private final ExcelAddIn xl;

    public HolidayCalendarIdXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.HolidayCalendarId.combinedWith",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("holidayCalendarId"),
        @ExcelArgument("other")
    })
    public HolidayCalendarId combinedWith(HolidayCalendarId holidayCalendarId, HolidayCalendarId other) {
        return holidayCalendarId.combinedWith(other);
    }

    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.HolidayCalendarId.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("uniqueName")
    })
    public HolidayCalendarId of(String uniqueName) {
        return HolidayCalendarId.of(uniqueName);
    }
}
