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
import org.joda.beans.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class BeanFunctions {

    /**
     * Explode a Java Bean as an Excel array function.
     *
     * @param bean Bean to explode
     * @param transpose If true return as a row in Excel
     * @return Range of values returned to Excel
     */
    @ExcelFunction(
            value = "og.Bean.explode",
            category = "Strata",
            isThreadSafe = true,
            autoResize = true
    )
    @ExcelArguments({
        @ExcelArgument("bean"),
        @ExcelArgument("transpose")
    })
    public static Object[][] explode(Bean bean, boolean transpose) {
        List<String> propertyNames = new ArrayList<String>(bean.propertyNames());
        java.util.Collections.sort(propertyNames);

        Object[][] result;
        if (transpose)
        {
            result = new Object[2][propertyNames.size()];
            int i = 0;
            for (String propertyName: propertyNames)
            {
                result[0][i] = propertyName;
                result[1][i] = bean.property(propertyName).get();
                ++i;
            }
        }
        else
        {
            result = new Object[propertyNames.size()][2];
            int i = 0;
            for (String propertyName: propertyNames)
            {
                result[i][0] = propertyName;
                result[i][1] = bean.property(propertyName).get();
                ++i;
            }
        }

        return result;
    }

    /**
     * Get a property value from a Bean
     * @param bean Bean to get property of
     * @param propertyName Property name to fetch, or list properties separated by '.'
     * @param strict If true, return an error if the property doesn't exist
     * @return Value of property
     */
    @ExcelFunction(
        value = "og.Bean.property",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("bean"),
        @ExcelArgument("propertyName")
    })
    public static Object property(Bean bean, String propertyName, boolean strict) {
        String[] propertyNames = propertyName.split("\\.");
        if (propertyNames.length == 0)
            return null;

        Object value = bean;
        for (String currentPropertyName: propertyNames) {
            try {
                value = ((Bean)value).property(currentPropertyName).get();
            } catch (NoSuchElementException e) {
                if (!strict) {
                    return "";
                }
                throw e;
            } catch (ClassCastException e) {
                if (!strict) {
                    return "";
                }
                throw e;
            }
        }

        return value;
    }

    /**
     * Get a bean's property names.
     * @param bean Bean to get properties of
     * @param transpose Return values as a row
     * @return The bean's property names
     */
    @ExcelFunction(
        value = "og.Bean.propertyNames",
        category = "Strata",
        isThreadSafe = true,
        autoResize = true
    )
    @ExcelArguments({
        @ExcelArgument("bean"),
        @ExcelArgument("transpose")
    })
    public static String[][] propertyNames(Bean bean, boolean transpose) {
        ArrayList<String> propertyNames = new ArrayList<String>(bean.propertyNames());
        java.util.Collections.sort(propertyNames);
        String[][] result;

        if (transpose)
        {
            result = new String[1][propertyNames.size()];
            for (int i=0; i < propertyNames.size(); ++i) {
                result[0][i] = propertyNames.get(i);
            }
        }
        else
        {
            result = new String[propertyNames.size()][1];
            for (int i=0; i < propertyNames.size(); ++i) {
                result[i][0] = propertyNames.get(i);
            }
        }

        return result;
    }
}
