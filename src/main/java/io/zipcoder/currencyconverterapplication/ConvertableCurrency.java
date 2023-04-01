package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    //CurrencyType type = CurrencyType.UNIVERSAL_CURRENCY;
    default Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/getRate();
    }
    Double getRate();
}
