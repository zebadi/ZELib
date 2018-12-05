package advance.android.zelib.views;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.bumptech.glide.Glide;

public class ZEImageView extends AppCompatImageView {

    Context mContext;

    public ZEImageView(Context context) {
        super(context);

        mContext = context;
    }

    public ZEImageView(Context context, AttributeSet attrs) {
        super(context, attrs);

        mContext = context;
    }

    public void load(String url) {

        Glide.with(mContext).load(url).into(this);
    }
}
