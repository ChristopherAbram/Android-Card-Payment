package fi.jamk.android.androidcardpayment;

import java.util.ArrayList;

/**
 * Created by r9_bl on November 12 2017.
 */

public class ShopItems extends ArrayList<ShopItem> {

    public ShopItems() {
        populateSample();
    }

    public void populateSample() {
        add(new ShopItem(0, "The Last Wish", "Andrzej Sapkowski", 14.95f, new Currency(Currency.Code.USD), 1, "Book", 4.5f));
        add(new ShopItem(1, "The Eye of the World", "Robert Jordan", 8.69f, new Currency(Currency.Code.USD), 1, "Book", 4.0f));
    }

}
