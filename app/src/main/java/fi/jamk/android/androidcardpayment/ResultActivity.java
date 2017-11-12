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
        int itemId =  extras.getInt("itemId");
        String result = extras.getString("result");
        String customerName = extras.getString("customerName");
        String time = extras.getString("time");

        String[] results = result.split("\"");

        ShopItem shopItem = new ShopItems().get(itemId);

        TextView resultText = (TextView) findViewById(R.id.result_text);
        resultText.setText(results[7]);

        TextView timeText = (TextView) findViewById(R.id.time);
        timeText.setText(time);

        TextView refId = (TextView) findViewById(R.id.ref_id);
        refId.setText("Ref ID: "+ results[3]);

        TextView customerNameText = (TextView) findViewById(R.id.customer_name);
        customerNameText.setText(customerName);

        TextView shopItemText = (TextView) findViewById(R.id.shop_item);
        shopItemText.setText(shopItem.getName());

        TextView quantity = (TextView) findViewById(R.id.quantity);
        quantity.setText("Quantity: "+shopItem.getQuantity());

        TextView totalPrice = (TextView) findViewById(R.id.total_price);
        totalPrice.setText(shopItem.getTotalPrice()+" "+shopItem.getCurrency());
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    public void confirmButton(View view) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
