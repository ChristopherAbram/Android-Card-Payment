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
        add(new ShopItem(0, "The Last Wish", "Andrzej Sapkowski", 14.95f, new Currency(Currency.Code.USD), 1, "Book", 4.3f));
        add(new ShopItem(1, "The Eye of the World", "Robert Jordan", 8.69f, new Currency(Currency.Code.USD), 1, "Book", 4.1f));
        add(new ShopItem(2, "DARK SOULS™ III", "From Software, Inc.", 59.99f, new Currency(Currency.Code.USD), 1, "Game", 4.7f));
        add(new ShopItem(3, "Spider-Man: Homecoming", "Marvel Studios", 12.99f, new Currency(Currency.Code.USD), 1, "Movie", 4.0f));
        add(new ShopItem(4, "IT", "Stephen King", 8.69f, new Currency(Currency.Code.USD), 1, "Book", 4.0f));
        add(new ShopItem(5, "The Black Parade", "My Chemical Romance", 9.99f, new Currency(Currency.Code.USD), 1, "Book", 5.0f));

    }

}
