/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.basics.index;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.index.OvernightIndex;
import com.opengamma.strata.basics.index.OvernightIndices;
    

public class OvernightIndicesXL {
    private final ExcelAddIn xl;

    public OvernightIndicesXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.OvernightIndices.AUD_AONIA",
        category = "Strata",
        isThreadSafe = true
    )
    public OvernightIndex AUD_AONIA() {
        return OvernightIndices.AUD_AONIA;
    }
    
    @ExcelFunction(
        value = "og.OvernightIndices.BRL_CDI",
        category = "Strata",
        isThreadSafe = true
    )
    public OvernightIndex BRL_CDI() {
        return OvernightIndices.BRL_CDI;
    }
    
    @ExcelFunction(
        value = "og.OvernightIndices.CAD_CORRA",
        category = "Strata",
        isThreadSafe = true
    )
    public OvernightIndex CAD_CORRA() {
        return OvernightIndices.CAD_CORRA;
    }
    
    @ExcelFunction(
        value = "og.OvernightIndices.CHF_SARON",
        category = "Strata",
        isThreadSafe = true
    )
    public OvernightIndex CHF_SARON() {
        return OvernightIndices.CHF_SARON;
    }
    
    @ExcelFunction(
        value = "og.OvernightIndices.CHF_TOIS",
        category = "Strata",
        isThreadSafe = true
    )
    public OvernightIndex CHF_TOIS() {
        return OvernightIndices.CHF_TOIS;
    }
    
    @ExcelFunction(
        value = "og.OvernightIndices.DKK_TNR",
        category = "Strata",
        isThreadSafe = true
    )
    public OvernightIndex DKK_TNR() {
        return OvernightIndices.DKK_TNR;
    }
    
    @ExcelFunction(
        value = "og.OvernightIndices.EUR_EONIA",
        category = "Strata",
        isThreadSafe = true
    )
    public OvernightIndex EUR_EONIA() {
        return OvernightIndices.EUR_EONIA;
    }
    
    @ExcelFunction(
        value = "og.OvernightIndices.EUR_ESTER",
        category = "Strata",
        isThreadSafe = true
    )
    public OvernightIndex EUR_ESTER() {
        return OvernightIndices.EUR_ESTER;
    }
    
    @ExcelFunction(
        value = "og.OvernightIndices.EUR_ESTR",
        category = "Strata",
        isThreadSafe = true
    )
    public OvernightIndex EUR_ESTR() {
        return OvernightIndices.EUR_ESTR;
    }
    
    @ExcelFunction(
        value = "og.OvernightIndices.GBP_SONIA",
        category = "Strata",
        isThreadSafe = true
    )
    public OvernightIndex GBP_SONIA() {
        return OvernightIndices.GBP_SONIA;
    }
    
    @ExcelFunction(
        value = "og.OvernightIndices.JPY_TONAR",
        category = "Strata",
        isThreadSafe = true
    )
    public OvernightIndex JPY_TONAR() {
        return OvernightIndices.JPY_TONAR;
    }
    
    @ExcelFunction(
        value = "og.OvernightIndices.NOK_NOWA",
        category = "Strata",
        isThreadSafe = true
    )
    public OvernightIndex NOK_NOWA() {
        return OvernightIndices.NOK_NOWA;
    }
    
    @ExcelFunction(
        value = "og.OvernightIndices.NZD_NZIONA",
        category = "Strata",
        isThreadSafe = true
    )
    public OvernightIndex NZD_NZIONA() {
        return OvernightIndices.NZD_NZIONA;
    }
    
    @ExcelFunction(
        value = "og.OvernightIndices.PLN_POLONIA",
        category = "Strata",
        isThreadSafe = true
    )
    public OvernightIndex PLN_POLONIA() {
        return OvernightIndices.PLN_POLONIA;
    }
    
    @ExcelFunction(
        value = "og.OvernightIndices.SEK_SIOR",
        category = "Strata",
        isThreadSafe = true
    )
    public OvernightIndex SEK_SIOR() {
        return OvernightIndices.SEK_SIOR;
    }
    
    @ExcelFunction(
        value = "og.OvernightIndices.THB_THOR",
        category = "Strata",
        isThreadSafe = true
    )
    public OvernightIndex THB_THOR() {
        return OvernightIndices.THB_THOR;
    }
    
    @ExcelFunction(
        value = "og.OvernightIndices.USD_AMERIBOR",
        category = "Strata",
        isThreadSafe = true
    )
    public OvernightIndex USD_AMERIBOR() {
        return OvernightIndices.USD_AMERIBOR;
    }
    
    @ExcelFunction(
        value = "og.OvernightIndices.USD_FED_FUND",
        category = "Strata",
        isThreadSafe = true
    )
    public OvernightIndex USD_FED_FUND() {
        return OvernightIndices.USD_FED_FUND;
    }
    
    @ExcelFunction(
        value = "og.OvernightIndices.USD_SOFR",
        category = "Strata",
        isThreadSafe = true
    )
    public OvernightIndex USD_SOFR() {
        return OvernightIndices.USD_SOFR;
    }
    
    @ExcelFunction(
        value = "og.OvernightIndices.ZAR_SABOR",
        category = "Strata",
        isThreadSafe = true
    )
    public OvernightIndex ZAR_SABOR() {
        return OvernightIndices.ZAR_SABOR;
    }
}
