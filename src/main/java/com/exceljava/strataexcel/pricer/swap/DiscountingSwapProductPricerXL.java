/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.pricer.swap;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.basics.currency.MultiCurrencyAmount;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.pricer.swap.DiscountingSwapProductPricer;
import com.opengamma.strata.product.swap.ResolvedSwap;
    

public class DiscountingSwapProductPricerXL {
    private final ExcelAddIn xl;

    public DiscountingSwapProductPricerXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.DiscountingSwapProductPricer.DEFAULT",
        category = "Strata",
        isThreadSafe = true
    )
    public DiscountingSwapProductPricer DEFAULT() {
        return DiscountingSwapProductPricer.DEFAULT;
    }
    
    @ExcelFunction(
        value = "og.DiscountingSwapProductPricer.forecastValue",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("discountingSwapProductPricer"),
        @ExcelArgument("swap"),
        @ExcelArgument("provider")
    })
    public MultiCurrencyAmount forecastValue(DiscountingSwapProductPricer discountingSwapProductPricer, ResolvedSwap swap, RatesProvider provider) {
        return discountingSwapProductPricer.forecastValue(swap, provider);
    }

    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.DiscountingSwapProductPricer.get",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fieldName")
    })
    public DiscountingSwapProductPricer getStaticField(String fieldName) {
        if (null == fieldName) {
            throw new IllegalArgumentException("fieldName is null");
        }
        if (fieldName.equals("DEFAULT")) {
            return DiscountingSwapProductPricer.DEFAULT;
        }
        throw new IllegalArgumentException(String.format("%s is invalid", fieldName));
    }
    @ExcelFunction(
        value = "og.DiscountingSwapProductPricer.presentValue",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("discountingSwapProductPricer"),
        @ExcelArgument("swap"),
        @ExcelArgument("currency"),
        @ExcelArgument("provider")
    })
    public CurrencyAmount presentValue(DiscountingSwapProductPricer discountingSwapProductPricer, ResolvedSwap swap, Currency currency, RatesProvider provider) {
        return discountingSwapProductPricer.presentValue(swap, currency, provider);
    }

    @ExcelFunction(
        value = "og.DiscountingSwapProductPricer.presentValueMultiCurrency",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("discountingSwapProductPricer"),
        @ExcelArgument("swap"),
        @ExcelArgument("provider")
    })
    public MultiCurrencyAmount presentValue(DiscountingSwapProductPricer discountingSwapProductPricer, ResolvedSwap swap, RatesProvider provider) {
        return discountingSwapProductPricer.presentValue(swap, provider);
    }
}
