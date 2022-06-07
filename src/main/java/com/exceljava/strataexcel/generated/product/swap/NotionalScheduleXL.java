/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.product.swap;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.value.ValueSchedule;
import com.opengamma.strata.product.swap.FxResetCalculation;
import com.opengamma.strata.product.swap.NotionalSchedule;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class NotionalScheduleXL {
    private final ExcelAddIn xl;

    public NotionalScheduleXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.NotionalSchedule.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public NotionalSchedule builder(String[] keys, Object[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        NotionalSchedule.Builder builder = NotionalSchedule.builder();
        
        Object currency = args.get("currency");
        if (null != currency) {
            Currency value;
            try {
                value = xl.convertArgument(currency, Currency.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("currency could not be converted to Currency", e);
            }
            builder = builder.currency(value);
            usedArgs.add("currency");
        }
        
        Object fxReset = args.get("fxreset");
        if (null != fxReset) {
            FxResetCalculation value;
            try {
                value = xl.convertArgument(fxReset, FxResetCalculation.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("fxReset could not be converted to FxResetCalculation", e);
            }
            builder = builder.fxReset(value);
            usedArgs.add("fxreset");
        }
        
        Object amount = args.get("amount");
        if (null != amount) {
            ValueSchedule value;
            try {
                value = xl.convertArgument(amount, ValueSchedule.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("amount could not be converted to ValueSchedule", e);
            }
            builder = builder.amount(value);
            usedArgs.add("amount");
        }
        
        Object initialExchange = args.get("initialexchange");
        if (null != initialExchange) {
            Boolean value;
            try {
                value = xl.convertArgument(initialExchange, Boolean.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("initialExchange could not be converted to Boolean", e);
            }
            builder = builder.initialExchange(value);
            usedArgs.add("initialexchange");
        }
        
        Object intermediateExchange = args.get("intermediateexchange");
        if (null != intermediateExchange) {
            Boolean value;
            try {
                value = xl.convertArgument(intermediateExchange, Boolean.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("intermediateExchange could not be converted to Boolean", e);
            }
            builder = builder.intermediateExchange(value);
            usedArgs.add("intermediateexchange");
        }
        
        Object finalExchange = args.get("finalexchange");
        if (null != finalExchange) {
            Boolean value;
            try {
                value = xl.convertArgument(finalExchange, Boolean.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("finalExchange could not be converted to Boolean", e);
            }
            builder = builder.finalExchange(value);
            usedArgs.add("finalexchange");
        }
        
        return builder.build();
    }
        
    @ExcelFunction(
        value = "og.NotionalSchedule.fixed",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("currency"),
        @ExcelArgument("amount")
    })
    public NotionalSchedule of(Currency currency, double amount) {
        return NotionalSchedule.of(currency, amount);
    }

    @ExcelFunction(
        value = "og.NotionalSchedule.of",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("currency"),
        @ExcelArgument("amountSchedule")
    })
    public NotionalSchedule of(Currency currency, ValueSchedule amountSchedule) {
        return NotionalSchedule.of(currency, amountSchedule);
    }
}
