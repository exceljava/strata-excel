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
import java.util.List;

public class ListFunctions {
    /**
     * Explode a Java list as an Excel array function.
     *
     * @param list List of objects
     * @param transpose If true return as a row in Excel
     * @return Range of values returned to Excel
     */
    @ExcelFunction(
        value = "og.List.explode",
        category = "Strata",
        isThreadSafe = true,
        autoResize = true
    )
    @ExcelArguments({
        @ExcelArgument("list"),
        @ExcelArgument("transpose")
    })
    public static Object[][] explode(List<?> list, boolean transpose) {
        Object[][] result;
        int length = list.size();
        int i = 0;

        if (transpose)
        {
            result = new Object[1][length];
            for (Object x: list) {
                result[0][i++] = x;
            }
        }
        else
        {
            result = new Object[length][1];
            for (Object x: list) {
                result[i++][0] = x;
            }
        }

        return result;
    }

    /**
     * Get the length of list.
     *
     * @param list List of objects
     * @return Number of items in the list.
     */
    @ExcelFunction(
            value = "og.List.size",
            category = "Strata",
            isThreadSafe = true
    )
    @ExcelArguments({
            @ExcelArgument("list"),
            @ExcelArgument("transpose")
    })
    public static int size(List<?> list) {
        return list.size();
    }

    /**
     * Get an item from a list.
     *
     * @param list List of objects
     * @param index Index of item to get, starting from zero
     * @return Item from the list at the index specified
     */
    @ExcelFunction(
            value = "og.List.get",
            category = "Strata",
            isThreadSafe = true
    )
    @ExcelArguments({
            @ExcelArgument("list"),
            @ExcelArgument("index")
    })
    public static Object get(List<?> list, int index) {
        return list.get(index);
    }
}
