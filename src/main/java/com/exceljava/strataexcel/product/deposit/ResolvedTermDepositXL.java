/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.product.deposit;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
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
