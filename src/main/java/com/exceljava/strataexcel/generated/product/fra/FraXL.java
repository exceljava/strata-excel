/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package com.exceljava.strataexcel.generated.product.fra;

import com.exceljava.jinx.ExcelAddIn;
import com.exceljava.jinx.ExcelArgument;
import com.exceljava.jinx.ExcelArguments;
import com.exceljava.jinx.ExcelFunction;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.date.AdjustableDate;
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.product.common.BuySell;
import com.opengamma.strata.product.fra.Fra;
import com.opengamma.strata.product.fra.FraDiscountingMethod;
import com.opengamma.strata.product.fra.ResolvedFra;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toMap;
    

public class FraXL {
    private final ExcelAddIn xl;

    public FraXL(ExcelAddIn xl) {
        this.xl = xl;
    }
    
    @ExcelFunction(
        value = "og.Fra.build",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    })
    public Fra builder(String[] keys, Object[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Keys and values must be the same length");
        }

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        Fra.Builder builder = Fra.builder();
        
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
            Double value;
            try {
                value = xl.convertArgument(notional, Double.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("notional could not be converted to Double", e);
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
        
        Object paymentDate = args.get("paymentdate");
        if (null != paymentDate) {
            AdjustableDate value;
            try {
                value = xl.convertArgument(paymentDate, AdjustableDate.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("paymentDate could not be converted to AdjustableDate", e);
            }
            builder = builder.paymentDate(value);
            usedArgs.add("paymentdate");
        }
        
        Object fixedRate = args.get("fixedrate");
        if (null != fixedRate) {
            Double value;
            try {
                value = xl.convertArgument(fixedRate, Double.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("fixedRate could not be converted to Double", e);
            }
            builder = builder.fixedRate(value);
            usedArgs.add("fixedrate");
        }
        
        Object index = args.get("index");
        if (null != index) {
            IborIndex value;
            try {
                value = xl.convertArgument(index, IborIndex.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("index could not be converted to IborIndex", e);
            }
            builder = builder.index(value);
            usedArgs.add("index");
        }
        
        Object indexInterpolated = args.get("indexinterpolated");
        if (null != indexInterpolated) {
            IborIndex value;
            try {
                value = xl.convertArgument(indexInterpolated, IborIndex.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("indexInterpolated could not be converted to IborIndex", e);
            }
            builder = builder.indexInterpolated(value);
            usedArgs.add("indexinterpolated");
        }
        
        Object fixingDateOffset = args.get("fixingdateoffset");
        if (null != fixingDateOffset) {
            DaysAdjustment value;
            try {
                value = xl.convertArgument(fixingDateOffset, DaysAdjustment.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("fixingDateOffset could not be converted to DaysAdjustment", e);
            }
            builder = builder.fixingDateOffset(value);
            usedArgs.add("fixingdateoffset");
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
        
        Object discounting = args.get("discounting");
        if (null != discounting) {
            FraDiscountingMethod value;
            try {
                value = xl.convertArgument(discounting, FraDiscountingMethod.class);
            } catch (Exception e) {
                throw new IllegalArgumentException("discounting could not be converted to FraDiscountingMethod", e);
            }
            builder = builder.discounting(value);
            usedArgs.add("discounting");
        }
        
        return builder.build();
    }
        
    @ExcelFunction(
        value = "og.Fra.resolve",
        category = "Strata",
        isThreadSafe = true
    )
    @ExcelArguments({
        @ExcelArgument("fra"),
        @ExcelArgument("refData")
    })
    public ResolvedFra resolve(Fra fra, ReferenceData refData) {
        return fra.resolve(refData);
    }
}
