/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.jinx.strataexcel.product.deposit;

import com.jinx.ExcelAddIn;
import com.jinx.ExcelArgument;
import com.jinx.ExcelArguments;
import com.jinx.ExcelFunction;
import com.opengamma.strata.product.deposit.ResolvedTermDeposit;
    

public class ResolvedTermDepositXL {
    private final ExcelAddIn xl;

    public ResolvedTermDepositXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.ResolvedTermDeposit.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("resolvedTermDeposit")
    })
    public String toString(ResolvedTermDeposit resolvedTermDeposit) {
        return resolvedTermDeposit.toString();
    }
}
