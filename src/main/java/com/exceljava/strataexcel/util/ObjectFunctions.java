/*
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.util;

import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;

public class ObjectFunctions {
    /**
     * Call toString on an Object
     *
     * @param object Object to call toString on
     * @return Object's string representation
     */
    @ExcelFunction(
        value = "og.Object.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("object")
    })
    public static String toString(Object object) {
        return object.toString();
    }
}
