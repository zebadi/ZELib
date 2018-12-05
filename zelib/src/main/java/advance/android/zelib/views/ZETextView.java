package advance.android.zelib.views;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import advance.android.zelib.utils.BaseApplication;
import advance.android.zelib.utils.LibMethods;
import advance.android.zelib.utils.PublicMethods;

public class ZETextView extends AppCompatTextView {
    public ZETextView(Context context) {
        super(context);

        this.setTypeface(LibMethods.setTypeface(context));


    }

    public ZETextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.setTypeface(LibMethods.setTypeface(context));


    }


}
