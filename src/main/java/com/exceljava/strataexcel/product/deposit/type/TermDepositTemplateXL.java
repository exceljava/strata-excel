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
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.product.deposit.type.TermDepositConvention;
import com.opengamma.strata.product.deposit.type.TermDepositTemplate;
import java.time.Period;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class TermDepositTemplateXL {
    private final ExcelAddIn xl;

    public TermDepositTemplateXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.TermDepositTemplate.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public TermDepositTemplate builder(String[] keys, Object[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        TermDepositTemplate.Builder builder = TermDepositTemplate.builder();
        
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
            TermDepositConvention value;
            try {
                value = xl.convertArgument(convention, TermDepositConvention.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("convention could not be converted to TermDepositConvention", e);
            }
            builder = builder.convention(value);
            usedArgs.add("convention");
        }
        
        return builder.build();
    }
        
    @ExcelFunction(
        value = "og.TermDepositTemplate.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("depositPeriod"),
        @ExcelArgument("convention")
    })
    public TermDepositTemplate of(Period depositPeriod, TermDepositConvention convention) {
        return TermDepositTemplate.of(depositPeriod, convention);
    }

    @ExcelFunction(
        value = "og.TermDepositTemplate.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("termDepositTemplate")
    })
    public String toString(TermDepositTemplate termDepositTemplate) {
        return termDepositTemplate.toString();
    }
}
