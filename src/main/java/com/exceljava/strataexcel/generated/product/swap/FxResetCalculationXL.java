/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.product.swap;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.index.FxIndex;
import com.opengamma.strata.product.swap.FxResetCalculation;
import com.opengamma.strata.product.swap.FxResetFixingRelativeTo;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class FxResetCalculationXL {
    private final ExcelAddIn xl;

    public FxResetCalculationXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.FxResetCalculation.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public FxResetCalculation builder(String[] keys, Object[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        FxResetCalculation.Builder builder = FxResetCalculation.builder();
        
        Object index = args.get("index");
        if (null != index) {
            FxIndex value;
            try {
                value = xl.convertArgument(index, FxIndex.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("index could not be converted to FxIndex", e);
            }
            builder = builder.index(value);
            usedArgs.add("index");
        }
        
        Object referenceCurrency = args.get("referencecurrency");
        if (null != referenceCurrency) {
            Currency value;
            try {
                value = xl.convertArgument(referenceCurrency, Currency.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("referenceCurrency could not be converted to Currency", e);
            }
            builder = builder.referenceCurrency(value);
            usedArgs.add("referencecurrency");
        }
        
        Object fixingRelativeTo = args.get("fixingrelativeto");
        if (null != fixingRelativeTo) {
            FxResetFixingRelativeTo value;
            try {
                value = xl.convertArgument(fixingRelativeTo, FxResetFixingRelativeTo.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("fixingRelativeTo could not be converted to FxResetFixingRelativeTo", e);
            }
            builder = builder.fixingRelativeTo(value);
            usedArgs.add("fixingrelativeto");
        }
        
        Object fixingDateOffset = args.get("fixingdateoffset");
        if (null != fixingDateOffset) {
            DaysAdjustment value;
            try {
                value = xl.convertArgument(fixingDateOffset, DaysAdjustment.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("fixingDateOffset could not be converted to DaysAdjustment", e);
            }
            builder = builder.fixingDateOffset(value);
            usedArgs.add("fixingdateoffset");
        }
        
        Object initialNotionalValue = args.get("initialnotionalvalue");
        if (null != initialNotionalValue) {
            Double value;
            try {
                value = xl.convertArgument(initialNotionalValue, Double.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("initialNotionalValue could not be converted to Double", e);
            }
            builder = builder.initialNotionalValue(value);
            usedArgs.add("initialnotionalvalue");
        }
        
        return builder.build();
    }
}
