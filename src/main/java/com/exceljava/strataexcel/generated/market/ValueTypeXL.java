/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.market;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArgumentConverter;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.market.ValueType;
    

public class ValueTypeXL {
    private final ExcelAddIn xl;

    public ValueTypeXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.ValueType.BLACK_VOLATILITY",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType BLACK_VOLATILITY() {
        return ValueType.BLACK_VOLATILITY;
    }
    
    @ExcelFunction(
        value = "og.ValueType.CORRELATION",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType CORRELATION() {
        return ValueType.CORRELATION;
    }
    
    @ExcelFunction(
        value = "og.ValueType.DISCOUNT_FACTOR",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType DISCOUNT_FACTOR() {
        return ValueType.DISCOUNT_FACTOR;
    }
    
    @ExcelFunction(
        value = "og.ValueType.DIVIDEND_YIELD",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType DIVIDEND_YIELD() {
        return ValueType.DIVIDEND_YIELD;
    }
    
    @ExcelFunction(
        value = "og.ValueType.FORWARD_RATE",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType FORWARD_RATE() {
        return ValueType.FORWARD_RATE;
    }
    
    @ExcelFunction(
        value = "og.ValueType.LOCAL_VOLATILITY",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType LOCAL_VOLATILITY() {
        return ValueType.LOCAL_VOLATILITY;
    }
    
    @ExcelFunction(
        value = "og.ValueType.LOG_MONEYNESS",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType LOG_MONEYNESS() {
        return ValueType.LOG_MONEYNESS;
    }
    
    @ExcelFunction(
        value = "og.ValueType.MONTHS",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType MONTHS() {
        return ValueType.MONTHS;
    }
    
    @ExcelFunction(
        value = "og.ValueType.NORMAL_VOLATILITY",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType NORMAL_VOLATILITY() {
        return ValueType.NORMAL_VOLATILITY;
    }
    
    @ExcelFunction(
        value = "og.ValueType.PRICE",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType PRICE() {
        return ValueType.PRICE;
    }
    
    @ExcelFunction(
        value = "og.ValueType.PRICE_INDEX",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType PRICE_INDEX() {
        return ValueType.PRICE_INDEX;
    }
    
    @ExcelFunction(
        value = "og.ValueType.RECOVERY_RATE",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType RECOVERY_RATE() {
        return ValueType.RECOVERY_RATE;
    }
    
    @ExcelFunction(
        value = "og.ValueType.RISK_REVERSAL",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType RISK_REVERSAL() {
        return ValueType.RISK_REVERSAL;
    }
    
    @ExcelFunction(
        value = "og.ValueType.SABR_ALPHA",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType SABR_ALPHA() {
        return ValueType.SABR_ALPHA;
    }
    
    @ExcelFunction(
        value = "og.ValueType.SABR_BETA",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType SABR_BETA() {
        return ValueType.SABR_BETA;
    }
    
    @ExcelFunction(
        value = "og.ValueType.SABR_NU",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType SABR_NU() {
        return ValueType.SABR_NU;
    }
    
    @ExcelFunction(
        value = "og.ValueType.SABR_RHO",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType SABR_RHO() {
        return ValueType.SABR_RHO;
    }
    
    @ExcelFunction(
        value = "og.ValueType.SABR_SHIFT",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType SABR_SHIFT() {
        return ValueType.SABR_SHIFT;
    }
    
    @ExcelFunction(
        value = "og.ValueType.SIMPLE_MONEYNESS",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType SIMPLE_MONEYNESS() {
        return ValueType.SIMPLE_MONEYNESS;
    }
    
    @ExcelFunction(
        value = "og.ValueType.STRANGLE",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType STRANGLE() {
        return ValueType.STRANGLE;
    }
    
    @ExcelFunction(
        value = "og.ValueType.STRIKE",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType STRIKE() {
        return ValueType.STRIKE;
    }
    
    @ExcelFunction(
        value = "og.ValueType.UNKNOWN",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType UNKNOWN() {
        return ValueType.UNKNOWN;
    }
    
    @ExcelFunction(
        value = "og.ValueType.YEAR_FRACTION",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType YEAR_FRACTION() {
        return ValueType.YEAR_FRACTION;
    }
    
    @ExcelFunction(
        value = "og.ValueType.ZERO_RATE",
        category = "Strata",
        isThreadSafe = true
    )
    public ValueType ZERO_RATE() {
        return ValueType.ZERO_RATE;
    }
    
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "og.ValueType.get",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fieldName")
    })
    public ValueType getStaticField(String fieldName) {
        if (null == fieldName) {
            throw new IllegalArgumentException("fieldName is null");
        }
        if (fieldName.equals("UNKNOWN")) {
            return ValueType.UNKNOWN;
        }
        if (fieldName.equals("YEAR_FRACTION")) {
            return ValueType.YEAR_FRACTION;
        }
        if (fieldName.equals("MONTHS")) {
            return ValueType.MONTHS;
        }
        if (fieldName.equals("ZERO_RATE")) {
            return ValueType.ZERO_RATE;
        }
        if (fieldName.equals("FORWARD_RATE")) {
            return ValueType.FORWARD_RATE;
        }
        if (fieldName.equals("DISCOUNT_FACTOR")) {
            return ValueType.DISCOUNT_FACTOR;
        }
        if (fieldName.equals("DIVIDEND_YIELD")) {
            return ValueType.DIVIDEND_YIELD;
        }
        if (fieldName.equals("PRICE_INDEX")) {
            return ValueType.PRICE_INDEX;
        }
        if (fieldName.equals("RECOVERY_RATE")) {
            return ValueType.RECOVERY_RATE;
        }
        if (fieldName.equals("BLACK_VOLATILITY")) {
            return ValueType.BLACK_VOLATILITY;
        }
        if (fieldName.equals("NORMAL_VOLATILITY")) {
            return ValueType.NORMAL_VOLATILITY;
        }
        if (fieldName.equals("LOCAL_VOLATILITY")) {
            return ValueType.LOCAL_VOLATILITY;
        }
        if (fieldName.equals("PRICE")) {
            return ValueType.PRICE;
        }
        if (fieldName.equals("STRIKE")) {
            return ValueType.STRIKE;
        }
        if (fieldName.equals("SIMPLE_MONEYNESS")) {
            return ValueType.SIMPLE_MONEYNESS;
        }
        if (fieldName.equals("LOG_MONEYNESS")) {
            return ValueType.LOG_MONEYNESS;
        }
        if (fieldName.equals("SABR_ALPHA")) {
            return ValueType.SABR_ALPHA;
        }
        if (fieldName.equals("SABR_BETA")) {
            return ValueType.SABR_BETA;
        }
        if (fieldName.equals("SABR_RHO")) {
            return ValueType.SABR_RHO;
        }
        if (fieldName.equals("SABR_NU")) {
            return ValueType.SABR_NU;
        }
        if (fieldName.equals("SABR_SHIFT")) {
            return ValueType.SABR_SHIFT;
        }
        if (fieldName.equals("RISK_REVERSAL")) {
            return ValueType.RISK_REVERSAL;
        }
        if (fieldName.equals("STRANGLE")) {
            return ValueType.STRANGLE;
        }
        if (fieldName.equals("CORRELATION")) {
            return ValueType.CORRELATION;
        }
        throw new IllegalArgumentException(String.format("%s is invalid", fieldName));
    }
}
