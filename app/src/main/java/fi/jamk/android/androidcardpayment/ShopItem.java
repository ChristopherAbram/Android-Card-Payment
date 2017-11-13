package fi.jamk.android.androidcardpayment;

/**
 * Created by Krzysztof on 11.11.2017.
 */

import lombok.Data;

public @Data class ShopItem {
    private int id;
    private String name;
    private String detail;
    private float price;
    private Currency currency;
    private int quantity;
    private String type;
    private float rating;

    public ShopItem() {

    }

    public ShopItem(int id, String name, String detail, float price,Currency currency, int quantity, String type, float rating) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.type = type;
        this.rating = rating;
    }

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
