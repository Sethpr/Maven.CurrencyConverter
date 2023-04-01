package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Yen implements ConvertableCurrency {
    CurrencyType type = CurrencyType.YEN;

    @Override
    public Double getRate() {
        return type.getRate();
    }

}
