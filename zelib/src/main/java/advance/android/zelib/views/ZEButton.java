package advance.android.zelib.views;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import advance.android.zelib.utils.BaseApplication;
import advance.android.zelib.utils.LibMethods;

public class ZEButton extends AppCompatButton {
    public ZEButton(Context context) {
        super(context);
    //    this.setTypeface(LibMethods.setTypeface(context));

    }

    public ZEButton(Context context, AttributeSet attrs) {
        super(context, attrs);
//        this.setTypeface(LibMethods.setTypeface(context));

    }
}
