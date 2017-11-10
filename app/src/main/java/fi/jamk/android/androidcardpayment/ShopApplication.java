package fi.jamk.android.androidcardpayment;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.simplify.android.sdk.Simplify;

/**
 * Created by Krzysztof on 10.11.2017.
 */

public class ShopApplication extends Application {

    Simplify simplify;

    @Override
    public void onCreate() {
        super.onCreate();

        simplify = new Simplify();

        // init Simplify SDK with public api key stored in metadata
        try {
            Bundle bundle = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA).metaData;

            // init simplify api key
            String apiKey = bundle.getString("fi.jamk.android.apiKey", null);
            if (apiKey != null) {
                simplify.setApiKey(apiKey);
            }

            // init android pay public key
            String androidPayPublicKey = bundle.getString("fi.jamk.android.androidPayPublicKey", null);
            if (androidPayPublicKey != null) {
                simplify.setAndroidPayPublicKey(androidPayPublicKey);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Simplify getSimplify() {
        return simplify;
    }
}
