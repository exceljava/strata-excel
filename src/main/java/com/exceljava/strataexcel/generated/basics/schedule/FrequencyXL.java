/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.basics.schedule;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.schedule.Frequency;
    

public class FrequencyXL {
    private final ExcelAddIn xl;

    public FrequencyXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.Frequency.P12M",
        category = "Strata",
        isThreadSafe = true
    )
    public Frequency P12M() {
        return Frequency.P12M;
    }
    
    @ExcelFunction(
        value = "og.Frequency.P13W",
        category = "Strata",
        isThreadSafe = true
    )
    public Frequency P13W() {
        return Frequency.P13W;
    }
    
    @ExcelFunction(
        value = "og.Frequency.P1D",
        category = "Strata",
        isThreadSafe = true
    )
    public Frequency P1D() {
        return Frequency.P1D;
    }
    
    @ExcelFunction(
        value = "og.Frequency.P1M",
        category = "Strata",
        isThreadSafe = true
    )
    public Frequency P1M() {
        return Frequency.P1M;
    }
    
    @ExcelFunction(
        value = "og.Frequency.P1W",
        category = "Strata",
        isThreadSafe = true
    )
    public Frequency P1W() {
        return Frequency.P1W;
    }
    
    @ExcelFunction(
        value = "og.Frequency.P26W",
        category = "Strata",
        isThreadSafe = true
    )
    public Frequency P26W() {
        return Frequency.P26W;
    }
    
    @ExcelFunction(
        value = "og.Frequency.P2M",
        category = "Strata",
        isThreadSafe = true
    )
    public Frequency P2M() {
        return Frequency.P2M;
    }
    
    @ExcelFunction(
        value = "og.Frequency.P2W",
        category = "Strata",
        isThreadSafe = true
    )
    public Frequency P2W() {
        return Frequency.P2W;
    }
    
    @ExcelFunction(
        value = "og.Frequency.P3M",
        category = "Strata",
        isThreadSafe = true
    )
    public Frequency P3M() {
        return Frequency.P3M;
    }
    
    @ExcelFunction(
        value = "og.Frequency.P4M",
        category = "Strata",
        isThreadSafe = true
    )
    public Frequency P4M() {
        return Frequency.P4M;
    }
    
    @ExcelFunction(
        value = "og.Frequency.P4W",
        category = "Strata",
        isThreadSafe = true
    )
    public Frequency P4W() {
        return Frequency.P4W;
    }
    
    @ExcelFunction(
        value = "og.Frequency.P52W",
        category = "Strata",
        isThreadSafe = true
    )
    public Frequency P52W() {
        return Frequency.P52W;
    }
    
    @ExcelFunction(
        value = "og.Frequency.P6M",
        category = "Strata",
        isThreadSafe = true
    )
    public Frequency P6M() {
        return Frequency.P6M;
    }
    
    @ExcelFunction(
        value = "og.Frequency.TERM",
        category = "Strata",
        isThreadSafe = true
    )
    public Frequency TERM() {
        return Frequency.TERM;
    }
    
    @ExcelFunction(
        value = "og.Frequency.ofDays",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("days")
    })
    public Frequency ofDays(int days) {
        return Frequency.ofDays(days);
    }

    @ExcelFunction(
        value = "og.Frequency.ofMonths",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("months")
    })
    public Frequency ofMonths(int months) {
        return Frequency.ofMonths(months);
    }

    @ExcelFunction(
        value = "og.Frequency.ofWeeks",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("weeks")
    })
    public Frequency ofWeeks(int weeks) {
        return Frequency.ofWeeks(weeks);
    }

    @ExcelFunction(
        value = "og.Frequency.ofYears",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("years")
    })
    public Frequency ofYears(int years) {
        return Frequency.ofYears(years);
    }

    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.Frequency.parse",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("toParse")
    })
    public Frequency parse(String toParse) {
        return Frequency.parse(toParse);
    }
}
