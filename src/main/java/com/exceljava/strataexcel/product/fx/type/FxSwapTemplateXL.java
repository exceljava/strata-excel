/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.product.fx.type;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.product.fx.type.FxSwapConvention;
import com.opengamma.strata.product.fx.type.FxSwapTemplate;
import java.time.Period;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class FxSwapTemplateXL {
    private final ExcelAddIn xl;

    public FxSwapTemplateXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.FxSwapTemplate.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public FxSwapTemplate builder(String[] keys, Object[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        FxSwapTemplate.Builder builder = FxSwapTemplate.builder();
        
        Object periodToNear = args.get("periodtonear");
        if (null != periodToNear) {
            Period value;
            try {
                value = xl.convertArgument(periodToNear, Period.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("periodToNear could not be converted to Period", e);
            }
            builder = builder.periodToNear(value);
            usedArgs.add("periodtonear");
        }
        
        Object periodToFar = args.get("periodtofar");
        if (null != periodToFar) {
            Period value;
            try {
                value = xl.convertArgument(periodToFar, Period.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("periodToFar could not be converted to Period", e);
            }
            builder = builder.periodToFar(value);
            usedArgs.add("periodtofar");
        }
        
        Object convention = args.get("convention");
        if (null != convention) {
            FxSwapConvention value;
            try {
                value = xl.convertArgument(convention, FxSwapConvention.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("convention could not be converted to FxSwapConvention", e);
            }
            builder = builder.convention(value);
            usedArgs.add("convention");
        }
        
        return builder.build();
    }
        
    @ExcelFunction(
        value = "og.FxSwapTemplate.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("periodToFar"),
        @ExcelArgument("convention")
    })
    public FxSwapTemplate of(Period periodToFar, FxSwapConvention convention) {
        return FxSwapTemplate.of(periodToFar, convention);
    }

    @ExcelFunction(
        value = "og.FxSwapTemplate.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fxSwapTemplate")
    })
    public String toString(FxSwapTemplate fxSwapTemplate) {
        return fxSwapTemplate.toString();
    }
}
