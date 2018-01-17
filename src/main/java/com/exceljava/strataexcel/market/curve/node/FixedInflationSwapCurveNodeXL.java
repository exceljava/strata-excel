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
import com.opengamma.strata.market.curve.node.FixedInflationSwapCurveNode;
    

public class FixedInflationSwapCurveNodeXL {
    private final ExcelAddIn xl;

    public FixedInflationSwapCurveNodeXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.FixedInflationSwapCurveNode.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fixedInflationSwapCurveNode")
    })
    public String toString(FixedInflationSwapCurveNode fixedInflationSwapCurveNode) {
        return fixedInflationSwapCurveNode.toString();
    }
}
