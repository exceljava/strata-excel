/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.market.curve.node;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.data.FxRateId;
import com.opengamma.strata.data.ObservableId;
import com.opengamma.strata.market.curve.CurveNodeDate;
import com.opengamma.strata.market.curve.CurveNodeDateOrder;
import com.opengamma.strata.market.curve.node.XCcyIborIborSwapCurveNode;
import com.opengamma.strata.product.swap.type.XCcyIborIborSwapTemplate;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class XCcyIborIborSwapCurveNodeXL {
    private final ExcelAddIn xl;

    public XCcyIborIborSwapCurveNodeXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.XCcyIborIborSwapCurveNode.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public XCcyIborIborSwapCurveNode builder(String[] keys, Object[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        XCcyIborIborSwapCurveNode.Builder builder = XCcyIborIborSwapCurveNode.builder();
        
        Object template = args.get("template");
        if (null != template) {
            XCcyIborIborSwapTemplate value;
            try {
                value = xl.convertArgument(template, XCcyIborIborSwapTemplate.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("template could not be converted to XCcyIborIborSwapTemplate", e);
            }
            builder = builder.template(value);
            usedArgs.add("template");
        }
        
        Object fxRateId = args.get("fxrateid");
        if (null != fxRateId) {
            FxRateId value;
            try {
                value = xl.convertArgument(fxRateId, FxRateId.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("fxRateId could not be converted to FxRateId", e);
            }
            builder = builder.fxRateId(value);
            usedArgs.add("fxrateid");
        }
        
        Object spreadId = args.get("spreadid");
        if (null != spreadId) {
            ObservableId value;
            try {
                value = xl.convertArgument(spreadId, ObservableId.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("spreadId could not be converted to ObservableId", e);
            }
            builder = builder.spreadId(value);
            usedArgs.add("spreadid");
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
        value = "og.XCcyIborIborSwapCurveNode.ofRate",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("template"),
        @ExcelArgument("spreadId")
    })
    public XCcyIborIborSwapCurveNode of(XCcyIborIborSwapTemplate template, ObservableId spreadId) {
        return XCcyIborIborSwapCurveNode.of(template, spreadId);
    }

    @ExcelFunction(
        value = "og.XCcyIborIborSwapCurveNode.ofSpread",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("template"),
        @ExcelArgument("spreadId"),
        @ExcelArgument("additionalSpread")
    })
    public XCcyIborIborSwapCurveNode of(XCcyIborIborSwapTemplate template, ObservableId spreadId, double additionalSpread) {
        return XCcyIborIborSwapCurveNode.of(template, spreadId, additionalSpread);
    }
}
