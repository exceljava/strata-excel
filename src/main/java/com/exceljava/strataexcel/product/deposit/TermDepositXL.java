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
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.product.common.BuySell;
import com.opengamma.strata.product.deposit.ResolvedTermDeposit;
import com.opengamma.strata.product.deposit.TermDeposit;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class TermDepositXL {
    private final ExcelAddIn xl;

    public TermDepositXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.TermDeposit.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public TermDeposit builder(String[] keys, Object[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        TermDeposit.Builder builder = TermDeposit.builder();
        
        Object buySell = args.get("buysell");
        if (null != buySell) {
            BuySell value;
            try {
                value = xl.convertArgument(buySell, BuySell.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("buySell could not be converted to BuySell", e);
            }
            builder = builder.buySell(value);
            usedArgs.add("buysell");
        }
        
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
        
        Object notional = args.get("notional");
        if (null != notional) {
            double value;
            try {
                value = xl.convertArgument(notional, double.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("notional could not be converted to double", e);
            }
            builder = builder.notional(value);
            usedArgs.add("notional");
        }
        
        Object startDate = args.get("startdate");
        if (null != startDate) {
            LocalDate value;
            try {
                value = xl.convertArgument(startDate, LocalDate.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("startDate could not be converted to LocalDate", e);
            }
            builder = builder.startDate(value);
            usedArgs.add("startdate");
        }
        
        Object endDate = args.get("enddate");
        if (null != endDate) {
            LocalDate value;
            try {
                value = xl.convertArgument(endDate, LocalDate.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("endDate could not be converted to LocalDate", e);
            }
            builder = builder.endDate(value);
            usedArgs.add("enddate");
        }
        
        Object businessDayAdjustment = args.get("businessdayadjustment");
        if (null != businessDayAdjustment) {
            BusinessDayAdjustment value;
            try {
                value = xl.convertArgument(businessDayAdjustment, BusinessDayAdjustment.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("businessDayAdjustment could not be converted to BusinessDayAdjustment", e);
            }
            builder = builder.businessDayAdjustment(value);
            usedArgs.add("businessdayadjustment");
        }
        
        Object dayCount = args.get("daycount");
        if (null != dayCount) {
            DayCount value;
            try {
                value = xl.convertArgument(dayCount, DayCount.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("dayCount could not be converted to DayCount", e);
            }
            builder = builder.dayCount(value);
            usedArgs.add("daycount");
        }
        
        Object rate = args.get("rate");
        if (null != rate) {
            double value;
            try {
                value = xl.convertArgument(rate, double.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("rate could not be converted to double", e);
            }
            builder = builder.rate(value);
            usedArgs.add("rate");
        }
        
        return builder.build();
    }
        
    @ExcelFunction(
        value = "og.TermDeposit.resolve",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("termDeposit"),
        @ExcelArgument("refData")
    })
    public ResolvedTermDeposit resolve(TermDeposit termDeposit, ReferenceData refData) {
        return termDeposit.resolve(refData);
    }

    @ExcelFunction(
        value = "og.TermDeposit.toString",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("termDeposit")
    })
    public String toString(TermDeposit termDeposit) {
        return termDeposit.toString();
    }
}
