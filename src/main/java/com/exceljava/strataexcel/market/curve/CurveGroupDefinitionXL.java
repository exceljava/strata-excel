/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.market.curve;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.market.curve.CurveDefinition;
import com.opengamma.strata.market.curve.CurveGroupDefinition;
import com.opengamma.strata.market.curve.CurveGroupDefinitionBuilder;
import com.opengamma.strata.market.curve.CurveGroupEntry;
import com.opengamma.strata.market.curve.CurveGroupName;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class CurveGroupDefinitionXL {
    private final ExcelAddIn xl;

    public CurveGroupDefinitionXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.CurveGroupDefinition.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public CurveGroupDefinition builder(String[] keys, Object[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        CurveGroupDefinitionBuilder builder = CurveGroupDefinition.builder();
        
        Object name = args.get("name");
        if (null != name) {
            CurveGroupName value;
            try {
                value = xl.convertArgument(name, CurveGroupName.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("name could not be converted to CurveGroupName", e);
            }
            builder = builder.name(value);
            usedArgs.add("name");
        }
        
        Object computeJacobian = args.get("computejacobian");
        if (null != computeJacobian) {
            boolean value;
            try {
                value = xl.convertArgument(computeJacobian, boolean.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("computeJacobian could not be converted to boolean", e);
            }
            builder = builder.computeJacobian(value);
            usedArgs.add("computejacobian");
        }
        
        Object computePvSensitivityToMarketQuote = args.get("computepvsensitivitytomarketquote");
        if (null != computePvSensitivityToMarketQuote) {
            boolean value;
            try {
                value = xl.convertArgument(computePvSensitivityToMarketQuote, boolean.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("computePvSensitivityToMarketQuote could not be converted to boolean", e);
            }
            builder = builder.computePvSensitivityToMarketQuote(value);
            usedArgs.add("computepvsensitivitytomarketquote");
        }
        
        return builder.build();
    }
        
    @ExcelFunction(
        value = "og.CurveGroupDefinition.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("name"),
        @ExcelArgument("entries"),
        @ExcelArgument("curveDefinitions")
    })
    public CurveGroupDefinition of(CurveGroupName name, CurveGroupEntry[] entries, CurveDefinition[] curveDefinitions) {
        Collection<CurveGroupEntry> entries_Collection = Arrays.asList(entries);
        Collection<CurveDefinition> curveDefinitions_Collection = Arrays.asList(curveDefinitions);
        return CurveGroupDefinition.of(name, entries_Collection, curveDefinitions_Collection);
    }

    @ExcelFunction(
        value = "og.CurveGroupDefinition.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("curveGroupDefinition")
    })
    public String toString(CurveGroupDefinition curveGroupDefinition) {
        return curveGroupDefinition.toString();
    }
}
