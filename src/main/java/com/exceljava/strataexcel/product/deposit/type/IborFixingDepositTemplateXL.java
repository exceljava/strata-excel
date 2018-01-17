/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.product.deposit.type;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.product.deposit.type.IborFixingDepositConvention;
import com.opengamma.strata.product.deposit.type.IborFixingDepositTemplate;
import java.time.Period;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class IborFixingDepositTemplateXL {
    private final ExcelAddIn xl;

    public IborFixingDepositTemplateXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.IborFixingDepositTemplate.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public IborFixingDepositTemplate builder(String[] keys, Object[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        IborFixingDepositTemplate.Builder builder = IborFixingDepositTemplate.builder();
        
        Object depositPeriod = args.get("depositperiod");
        if (null != depositPeriod) {
            Period value;
            try {
                value = xl.convertArgument(depositPeriod, Period.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("depositPeriod could not be converted to Period", e);
            }
            builder = builder.depositPeriod(value);
            usedArgs.add("depositperiod");
        }
        
        Object convention = args.get("convention");
        if (null != convention) {
            IborFixingDepositConvention value;
            try {
                value = xl.convertArgument(convention, IborFixingDepositConvention.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("convention could not be converted to IborFixingDepositConvention", e);
            }
            builder = builder.convention(value);
            usedArgs.add("convention");
        }
        
        return builder.build();
    }
        
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.IborFixingDepositTemplate.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("index")
    })
    public IborFixingDepositTemplate of(IborIndex index) {
        return IborFixingDepositTemplate.of(index);
    }

    @ExcelFunction(
        value = "og.IborFixingDepositTemplate.ofPeriod",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("depositPeriod"),
        @ExcelArgument("convention")
    })
    public IborFixingDepositTemplate of(Period depositPeriod, IborFixingDepositConvention convention) {
        return IborFixingDepositTemplate.of(depositPeriod, convention);
    }

    @ExcelFunction(
        value = "og.IborFixingDepositTemplate.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("iborFixingDepositTemplate")
    })
    public String toString(IborFixingDepositTemplate iborFixingDepositTemplate) {
        return iborFixingDepositTemplate.toString();
    }
}
