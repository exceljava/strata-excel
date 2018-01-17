/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.product.swap.type;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.date.Tenor;
import com.opengamma.strata.product.swap.type.XCcyIborIborSwapConvention;
import com.opengamma.strata.product.swap.type.XCcyIborIborSwapTemplate;
import java.time.Period;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class XCcyIborIborSwapTemplateXL {
    private final ExcelAddIn xl;

    public XCcyIborIborSwapTemplateXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.XCcyIborIborSwapTemplate.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public XCcyIborIborSwapTemplate builder(String[] keys, Object[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        XCcyIborIborSwapTemplate.Builder builder = XCcyIborIborSwapTemplate.builder();
        
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
        
        Object tenor = args.get("tenor");
        if (null != tenor) {
            Tenor value;
            try {
                value = xl.convertArgument(tenor, Tenor.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("tenor could not be converted to Tenor", e);
            }
            builder = builder.tenor(value);
            usedArgs.add("tenor");
        }
        
        Object convention = args.get("convention");
        if (null != convention) {
            XCcyIborIborSwapConvention value;
            try {
                value = xl.convertArgument(convention, XCcyIborIborSwapConvention.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("convention could not be converted to XCcyIborIborSwapConvention", e);
            }
            builder = builder.convention(value);
            usedArgs.add("convention");
        }
        
        return builder.build();
    }
        
    @ExcelFunction(
        value = "og.XCcyIborIborSwapTemplate.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("tenor"),
        @ExcelArgument("convention")
    })
    public XCcyIborIborSwapTemplate of(Tenor tenor, XCcyIborIborSwapConvention convention) {
        return XCcyIborIborSwapTemplate.of(tenor, convention);
    }

    @ExcelFunction(
        value = "og.XCcyIborIborSwapTemplate.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("xCcyIborIborSwapTemplate")
    })
    public String toString(XCcyIborIborSwapTemplate xCcyIborIborSwapTemplate) {
        return xCcyIborIborSwapTemplate.toString();
    }
}
