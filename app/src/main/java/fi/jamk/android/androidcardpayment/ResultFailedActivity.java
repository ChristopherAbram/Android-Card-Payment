package fi.jamk.android.androidcardpayment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ResultFailedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_failed);

        getSupportActionBar().hide();
    }

    public void onBackPressed(View view) {
        super.onBackPressed();
    }
}
