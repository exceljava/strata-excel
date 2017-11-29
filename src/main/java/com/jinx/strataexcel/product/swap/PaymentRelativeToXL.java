/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.jinx.strataexcel.product.swap;

import com.jinx.ExcelAddIn;
import com.jinx.ExcelArgument;
import com.jinx.ExcelArgumentConverter;
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
import com.opengamma.strata.product.swap.PaymentRelativeTo;
    

public class PaymentRelativeToXL {
    private final ExcelAddIn xl;

    public PaymentRelativeToXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.PaymentRelativeTo.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("name")
    })
    public PaymentRelativeTo of(String name) {
        return PaymentRelativeTo.of(name);
    }

    @ExcelFunction(
        value = "og.PaymentRelativeTo.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("paymentRelativeTo")
    })
    public String toString(PaymentRelativeTo paymentRelativeTo) {
        return paymentRelativeTo.toString();
    }
}
