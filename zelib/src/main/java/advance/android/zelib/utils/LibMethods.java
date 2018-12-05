package advance.android.zelib.utils;

import android.content.Context;
import android.graphics.Typeface;

public class LibMethods {

    public static Typeface setTypeface(Context mContext){

        return Typeface.createFromAsset(mContext.getAssets(), LibConstants.appFontName);

    }
}
