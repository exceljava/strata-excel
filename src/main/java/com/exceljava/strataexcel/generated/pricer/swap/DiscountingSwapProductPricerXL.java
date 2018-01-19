/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.pricer.swap;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.basics.currency.MultiCurrencyAmount;
import com.opengamma.strata.market.explain.ExplainMap;
import com.opengamma.strata.market.sensitivity.PointSensitivityBuilder;
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
        value = "og.DiscountingSwapProductPricer.accruedInterest",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("discountingSwapProductPricer"),
        @ExcelArgument("swap"),
        @ExcelArgument("provider")
    })
    public MultiCurrencyAmount accruedInterest(DiscountingSwapProductPricer discountingSwapProductPricer, ResolvedSwap swap, RatesProvider provider) {
        return discountingSwapProductPricer.accruedInterest(swap, provider);
    }

    @ExcelFunction(
        value = "og.DiscountingSwapProductPricer.currencyExposure",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("discountingSwapProductPricer"),
        @ExcelArgument("swap"),
        @ExcelArgument("provider")
    })
    public MultiCurrencyAmount currencyExposure(DiscountingSwapProductPricer discountingSwapProductPricer, ResolvedSwap swap, RatesProvider provider) {
        return discountingSwapProductPricer.currencyExposure(swap, provider);
    }

    @ExcelFunction(
        value = "og.DiscountingSwapProductPricer.currentCash",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("discountingSwapProductPricer"),
        @ExcelArgument("swap"),
        @ExcelArgument("provider")
    })
    public MultiCurrencyAmount currentCash(DiscountingSwapProductPricer discountingSwapProductPricer, ResolvedSwap swap, RatesProvider provider) {
        return discountingSwapProductPricer.currentCash(swap, provider);
    }

    @ExcelFunction(
        value = "og.DiscountingSwapProductPricer.explainPresentValue",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("discountingSwapProductPricer"),
        @ExcelArgument("swap"),
        @ExcelArgument("provider")
    })
    public ExplainMap explainPresentValue(DiscountingSwapProductPricer discountingSwapProductPricer, ResolvedSwap swap, RatesProvider provider) {
        return discountingSwapProductPricer.explainPresentValue(swap, provider);
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

    @ExcelFunction(
        value = "og.DiscountingSwapProductPricer.forecastValueSensitivity",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("discountingSwapProductPricer"),
        @ExcelArgument("swap"),
        @ExcelArgument("provider")
    })
    public PointSensitivityBuilder forecastValueSensitivity(DiscountingSwapProductPricer discountingSwapProductPricer, ResolvedSwap swap, RatesProvider provider) {
        return discountingSwapProductPricer.forecastValueSensitivity(swap, provider);
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
        value = "og.DiscountingSwapProductPricer.parRate",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("discountingSwapProductPricer"),
        @ExcelArgument("swap"),
        @ExcelArgument("provider")
    })
    public double parRate(DiscountingSwapProductPricer discountingSwapProductPricer, ResolvedSwap swap, RatesProvider provider) {
        return discountingSwapProductPricer.parRate(swap, provider);
    }

    @ExcelFunction(
        value = "og.DiscountingSwapProductPricer.parRateSensitivity",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("discountingSwapProductPricer"),
        @ExcelArgument("swap"),
        @ExcelArgument("provider")
    })
    public PointSensitivityBuilder parRateSensitivity(DiscountingSwapProductPricer discountingSwapProductPricer, ResolvedSwap swap, RatesProvider provider) {
        return discountingSwapProductPricer.parRateSensitivity(swap, provider);
    }

    @ExcelFunction(
        value = "og.DiscountingSwapProductPricer.parSpread",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("discountingSwapProductPricer"),
        @ExcelArgument("swap"),
        @ExcelArgument("provider")
    })
    public double parSpread(DiscountingSwapProductPricer discountingSwapProductPricer, ResolvedSwap swap, RatesProvider provider) {
        return discountingSwapProductPricer.parSpread(swap, provider);
    }

    @ExcelFunction(
        value = "og.DiscountingSwapProductPricer.parSpreadSensitivity",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("discountingSwapProductPricer"),
        @ExcelArgument("swap"),
        @ExcelArgument("provider")
    })
    public PointSensitivityBuilder parSpreadSensitivity(DiscountingSwapProductPricer discountingSwapProductPricer, ResolvedSwap swap, RatesProvider provider) {
        return discountingSwapProductPricer.parSpreadSensitivity(swap, provider);
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

    @ExcelFunction(
        value = "og.DiscountingSwapProductPricer.presentValueSensitivity",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("discountingSwapProductPricer"),
        @ExcelArgument("swap"),
        @ExcelArgument("provider")
    })
    public PointSensitivityBuilder presentValueSensitivity(DiscountingSwapProductPricer discountingSwapProductPricer, ResolvedSwap swap, RatesProvider provider) {
        return discountingSwapProductPricer.presentValueSensitivity(swap, provider);
    }
}
