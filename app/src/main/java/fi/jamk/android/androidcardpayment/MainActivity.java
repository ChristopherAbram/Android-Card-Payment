package fi.jamk.android.androidcardpayment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ShopItems shopItems;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shopItems = new ShopItems();

        listview = (ListView) findViewById(R.id.listView);
        ProductListAdapter adapter = new ProductListAdapter(this, shopItems);
        listview.setAdapter(adapter);
    }

    public void sendIntent(View view) {
        Intent cardIntent = new Intent(this, CardFormActivity.class);
        cardIntent.putExtra("itemId", (Integer.parseInt(view.getTag().toString())));
        startActivity(cardIntent);
    }
}
