package fi.jamk.android.androidcardpayment;

import lombok.Getter;

/**
 * Created by Krzysztof on 11.11.2017.
 */

public class Currency {

    public class Code {
        public static final String USD = "USD";
        public static final String EUR = "EUR";
        public static final String PLN = "PLN";
        // and so on...
    }

    public class Mark {
        public static final String USD = "$";
        public static final String EUR = "€";
        public static final String PLN = "PLN";
        // and so on...
    }

    @Getter
    private String currency = Currency.Code.USD;

    public Currency(){}

    public Currency(String currency){
        this.currency = currency;
    }

    @Override
    public String toString() {
        return currency;
    }
}
