/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.market.curve.node;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.data.ObservableId;
import com.opengamma.strata.market.curve.CurveNodeDate;
import com.opengamma.strata.market.curve.CurveNodeDateOrder;
import com.opengamma.strata.market.curve.node.FraCurveNode;
import com.opengamma.strata.product.fra.type.FraTemplate;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class FraCurveNodeXL {
    private final ExcelAddIn xl;

    public FraCurveNodeXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.FraCurveNode.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public FraCurveNode builder(String[] keys, Object[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        FraCurveNode.Builder builder = FraCurveNode.builder();
        
        Object template = args.get("template");
        if (null != template) {
            FraTemplate value;
            try {
                value = xl.convertArgument(template, FraTemplate.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("template could not be converted to FraTemplate", e);
            }
            builder = builder.template(value);
            usedArgs.add("template");
        }
        
        Object rateId = args.get("rateid");
        if (null != rateId) {
            ObservableId value;
            try {
                value = xl.convertArgument(rateId, ObservableId.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("rateId could not be converted to ObservableId", e);
            }
            builder = builder.rateId(value);
            usedArgs.add("rateid");
        }
        
        Object additionalSpread = args.get("additionalspread");
        if (null != additionalSpread) {
            double value;
            try {
                value = xl.convertArgument(additionalSpread, double.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("additionalSpread could not be converted to double", e);
            }
            builder = builder.additionalSpread(value);
            usedArgs.add("additionalspread");
        }
        
        Object label = args.get("label");
        if (null != label) {
            String value;
            try {
                value = xl.convertArgument(label, String.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("label could not be converted to String", e);
            }
            builder = builder.label(value);
            usedArgs.add("label");
        }
        
        Object date = args.get("date");
        if (null != date) {
            CurveNodeDate value;
            try {
                value = xl.convertArgument(date, CurveNodeDate.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("date could not be converted to CurveNodeDate", e);
            }
            builder = builder.date(value);
            usedArgs.add("date");
        }
        
        Object dateOrder = args.get("dateorder");
        if (null != dateOrder) {
            CurveNodeDateOrder value;
            try {
                value = xl.convertArgument(dateOrder, CurveNodeDateOrder.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("dateOrder could not be converted to CurveNodeDateOrder", e);
            }
            builder = builder.dateOrder(value);
            usedArgs.add("dateorder");
        }
        
        return builder.build();
    }
        
    @ExcelFunction(
        value = "og.FraCurveNode.ofRate",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("template"),
        @ExcelArgument("rateId")
    })
    public FraCurveNode of(FraTemplate template, ObservableId rateId) {
        return FraCurveNode.of(template, rateId);
    }

    @ExcelFunction(
        value = "og.FraCurveNode.ofSpread",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("template"),
        @ExcelArgument("rateId"),
        @ExcelArgument("additionalSpread")
    })
    public FraCurveNode of(FraTemplate template, ObservableId rateId, double additionalSpread) {
        return FraCurveNode.of(template, rateId, additionalSpread);
    }

    @ExcelFunction(
        value = "og.FraCurveNode.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fraCurveNode")
    })
    public String toString(FraCurveNode fraCurveNode) {
        return fraCurveNode.toString();
    }
}
