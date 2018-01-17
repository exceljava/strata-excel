/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.product.fx;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.basics.currency.FxRate;
import com.opengamma.strata.basics.index.FxIndex;
import com.opengamma.strata.product.fx.FxNdf;
import com.opengamma.strata.product.fx.ResolvedFxNdf;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class FxNdfXL {
    private final ExcelAddIn xl;

    public FxNdfXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.FxNdf.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public FxNdf builder(String[] keys, Object[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        FxNdf.Builder builder = FxNdf.builder();
        
        Object settlementCurrencyNotional = args.get("settlementcurrencynotional");
        if (null != settlementCurrencyNotional) {
            CurrencyAmount value;
            try {
                value = xl.convertArgument(settlementCurrencyNotional, CurrencyAmount.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("settlementCurrencyNotional could not be converted to CurrencyAmount", e);
            }
            builder = builder.settlementCurrencyNotional(value);
            usedArgs.add("settlementcurrencynotional");
        }
        
        Object agreedFxRate = args.get("agreedfxrate");
        if (null != agreedFxRate) {
            FxRate value;
            try {
                value = xl.convertArgument(agreedFxRate, FxRate.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("agreedFxRate could not be converted to FxRate", e);
            }
            builder = builder.agreedFxRate(value);
            usedArgs.add("agreedfxrate");
        }
        
        Object index = args.get("index");
        if (null != index) {
            FxIndex value;
            try {
                value = xl.convertArgument(index, FxIndex.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("index could not be converted to FxIndex", e);
            }
            builder = builder.index(value);
            usedArgs.add("index");
        }
        
        Object paymentDate = args.get("paymentdate");
        if (null != paymentDate) {
            LocalDate value;
            try {
                value = xl.convertArgument(paymentDate, LocalDate.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("paymentDate could not be converted to LocalDate", e);
            }
            builder = builder.paymentDate(value);
            usedArgs.add("paymentdate");
        }
        
        return builder.build();
    }
        
    @ExcelFunction(
        value = "og.FxNdf.resolve",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fxNdf"),
        @ExcelArgument("refData")
    })
    public ResolvedFxNdf resolve(FxNdf fxNdf, ReferenceData refData) {
        return fxNdf.resolve(refData);
    }

    @ExcelFunction(
        value = "og.FxNdf.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fxNdf")
    })
    public String toString(FxNdf fxNdf) {
        return fxNdf.toString();
    }
}
