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
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.CurveName;
import com.opengamma.strata.market.curve.CurveNode;
import com.opengamma.strata.market.curve.InterpolatedNodalCurveDefinition;
import com.opengamma.strata.market.curve.interpolator.CurveExtrapolator;
import com.opengamma.strata.market.curve.interpolator.CurveInterpolator;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class InterpolatedNodalCurveDefinitionXL {
    private final ExcelAddIn xl;

    public InterpolatedNodalCurveDefinitionXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.InterpolatedNodalCurveDefinition.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public InterpolatedNodalCurveDefinition builder(String[] keys, Object[] values, CurveNode[] nodes) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        InterpolatedNodalCurveDefinition.Builder builder = InterpolatedNodalCurveDefinition.builder();
        
        Object name = args.get("name");
        if (null != name) {
            CurveName value;
            try {
                value = xl.convertArgument(name, CurveName.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("name could not be converted to CurveName", e);
            }
            builder = builder.name(value);
            usedArgs.add("name");
        }
        
        Object xValueType = args.get("xvaluetype");
        if (null != xValueType) {
            ValueType value;
            try {
                value = xl.convertArgument(xValueType, ValueType.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("xValueType could not be converted to ValueType", e);
            }
            builder = builder.xValueType(value);
            usedArgs.add("xvaluetype");
        }
        
        Object yValueType = args.get("yvaluetype");
        if (null != yValueType) {
            ValueType value;
            try {
                value = xl.convertArgument(yValueType, ValueType.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("yValueType could not be converted to ValueType", e);
            }
            builder = builder.yValueType(value);
            usedArgs.add("yvaluetype");
        }
        
        Object dayCount = args.get("daycount");
        if (null != dayCount) {
            DayCount value;
            try {
                value = xl.convertArgument(dayCount, DayCount.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("dayCount could not be converted to DayCount", e);
            }
            builder = builder.dayCount(value);
            usedArgs.add("daycount");
        }
        
        if (null != nodes) {
            List<CurveNode> value = Arrays.asList(nodes);
            builder = builder.nodes(value);
        }
        
        Object interpolator = args.get("interpolator");
        if (null != interpolator) {
            CurveInterpolator value;
            try {
                value = xl.convertArgument(interpolator, CurveInterpolator.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("interpolator could not be converted to CurveInterpolator", e);
            }
            builder = builder.interpolator(value);
            usedArgs.add("interpolator");
        }
        
        Object extrapolatorLeft = args.get("extrapolatorleft");
        if (null != extrapolatorLeft) {
            CurveExtrapolator value;
            try {
                value = xl.convertArgument(extrapolatorLeft, CurveExtrapolator.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("extrapolatorLeft could not be converted to CurveExtrapolator", e);
            }
            builder = builder.extrapolatorLeft(value);
            usedArgs.add("extrapolatorleft");
        }
        
        Object extrapolatorRight = args.get("extrapolatorright");
        if (null != extrapolatorRight) {
            CurveExtrapolator value;
            try {
                value = xl.convertArgument(extrapolatorRight, CurveExtrapolator.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("extrapolatorRight could not be converted to CurveExtrapolator", e);
            }
            builder = builder.extrapolatorRight(value);
            usedArgs.add("extrapolatorright");
        }
        
        return builder.build();
    }
        
    @ExcelFunction(
        value = "og.InterpolatedNodalCurveDefinition.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("interpolatedNodalCurveDefinition")
    })
    public String toString(InterpolatedNodalCurveDefinition interpolatedNodalCurveDefinition) {
        return interpolatedNodalCurveDefinition.toString();
    }
}
