package fi.jamk.android.androidcardpayment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.loopj.android.http.RequestParams;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        getSupportActionBar().hide();

        Bundle extras = getIntent().getExtras();

        if(extras != null) {
            int itemId = extras.getInt("itemId");
            String refId = extras.getString("refId");
            String customerName = extras.getString("customerName");
            String time = extras.getString("time");

            ShopItem shopItem = new ShopItems().get(itemId);

            //TextView resultText = (TextView) findViewById(R.id.result_text);
            //resultText.setText(results[7]);

            TextView timeText = (TextView) findViewById(R.id.time);
            timeText.setText(time);

            TextView refIdText = (TextView) findViewById(R.id.ref_id);
            refIdText.setText("Ref ID: " + refId);

            TextView customerNameText = (TextView) findViewById(R.id.customer_name);
            customerNameText.setText(customerName);

            TextView shopItemText = (TextView) findViewById(R.id.shop_item);
            shopItemText.setText(shopItem.getName());

            TextView quantity = (TextView) findViewById(R.id.quantity);
            quantity.setText("Quantity: " + shopItem.getQuantity());

            TextView totalPrice = (TextView) findViewById(R.id.total_price);
            totalPrice.setText(shopItem.getTotalPrice() + " " + shopItem.getCurrency());
        }else {
            super.onBackPressed();
        }
    }


    @Override
    public void onBackPressed() {
        finish();
    }

    public void confirmButton(View view) {
        finish();
    }
}
