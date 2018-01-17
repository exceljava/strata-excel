/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.product.fra.type;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.product.fra.type.FraConvention;
import com.opengamma.strata.product.fra.type.FraTemplate;
import java.time.Period;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class FraTemplateXL {
    private final ExcelAddIn xl;

    public FraTemplateXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.FraTemplate.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public FraTemplate builder(String[] keys, Object[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        FraTemplate.Builder builder = FraTemplate.builder();
        
        Object periodToStart = args.get("periodtostart");
        if (null != periodToStart) {
            Period value;
            try {
                value = xl.convertArgument(periodToStart, Period.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("periodToStart could not be converted to Period", e);
            }
            builder = builder.periodToStart(value);
            usedArgs.add("periodtostart");
        }
        
        Object periodToEnd = args.get("periodtoend");
        if (null != periodToEnd) {
            Period value;
            try {
                value = xl.convertArgument(periodToEnd, Period.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("periodToEnd could not be converted to Period", e);
            }
            builder = builder.periodToEnd(value);
            usedArgs.add("periodtoend");
        }
        
        Object convention = args.get("convention");
        if (null != convention) {
            FraConvention value;
            try {
                value = xl.convertArgument(convention, FraConvention.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("convention could not be converted to FraConvention", e);
            }
            builder = builder.convention(value);
            usedArgs.add("convention");
        }
        
        return builder.build();
    }
        
    @ExcelFunction(
        value = "og.FraTemplate.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("periodToStart"),
        @ExcelArgument("periodToEnd"),
        @ExcelArgument("convention")
    })
    public FraTemplate of(Period periodToStart, Period periodToEnd, FraConvention convention) {
        return FraTemplate.of(periodToStart, periodToEnd, convention);
    }

    @ExcelFunction(
        value = "og.FraTemplate.ofIndex",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("periodToStart"),
        @ExcelArgument("index")
    })
    public FraTemplate of(Period periodToStart, IborIndex index) {
        return FraTemplate.of(periodToStart, index);
    }

    @ExcelFunction(
        value = "og.FraTemplate.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fraTemplate")
    })
    public String toString(FraTemplate fraTemplate) {
        return fraTemplate.toString();
    }
}
