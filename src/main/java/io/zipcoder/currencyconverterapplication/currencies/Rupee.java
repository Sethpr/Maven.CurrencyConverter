package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee implements ConvertableCurrency {
    CurrencyType type = CurrencyType.RUPEE;

    @Override
    public Double getRate() {
        return type.getRate();
    }

    @Override
    public CurrencyType getType() {
        return type;
    }
}
