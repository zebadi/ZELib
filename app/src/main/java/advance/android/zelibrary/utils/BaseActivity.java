package advance.android.zelibrary.utils;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

//import advance.android.zelib.utils.LibConstants;
import advance.android.zelibrary.Constants;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        setLibVariables();
    }

    void setLibVariables() {
   //     LibConstants.appFontName = Constants.appFontName;

    }
}

