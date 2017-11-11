package fi.jamk.android.androidcardpayment;

/**
 * Created by Krzysztof on 11.11.2017.
 */

import lombok.Data;

public @Data class ShopItem {
    private int id;
    private float price;
    private String name;
    private Currency currency;
    private int quantity;

    public String convertToWalletPrice(){
        int p = (int)(price * 100);
        return Integer.toString(p);
    }

    public static String priceToString(float price){
        return Float.toString(price);
    }

    public String priceToString(){
        return priceToString(price);
    }

    public float getTotalPrice(){
        return quantity * price;
    }
}
