package advance.android.zelib.views;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

import advance.android.zelib.utils.BaseApplication;
import advance.android.zelib.utils.LibMethods;
import advance.android.zelib.utils.PublicMethods;

public class ZEEditText extends AppCompatEditText {
    public ZEEditText(Context context) {
        super(context);
  //      this.setTypeface(LibMethods.setTypeface(context));

    }

    public ZEEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
 //       this.setTypeface(LibMethods.setTypeface(context));

    }

    public String text(){
        return this.getText().toString();
    }

}
