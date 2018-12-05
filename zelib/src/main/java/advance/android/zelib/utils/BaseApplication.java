package advance.android.zelib.utils;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;

import advance.android.zelib.R;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class BaseApplication extends Application {

    public static BaseApplication baseApp;

    @Override
    public void onCreate() {
        super.onCreate();

        baseApp = this;


    }

}
