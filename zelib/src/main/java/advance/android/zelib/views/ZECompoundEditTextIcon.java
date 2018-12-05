package advance.android.zelib.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import advance.android.zelib.R;
import advance.android.zelib.utils.PublicMethods;

public class ZECompoundEditTextIcon extends RelativeLayout {


    ZEEditText editText;
    ZEImageView img;
    TypedArray typedArray;
    Context mContext;

    public ZECompoundEditTextIcon(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;

        bind();

        setAttrsValues(attrs);
        setFontList(typedArray);
    }

    public String getText() {
        return editText.text();
    }

    public void setText(String txt) {
        editText.setText(txt);
    }

    public void setUrlIcon(String url) {
        img.load(url);

    }

    public enum ValidationType {
        EMAIL, MOBILE, WEBSITE
    }

    public boolean isValid(ValidationType validationType) {
        String txt = editText.getText().toString();
        if (txt.length() > 0) {
            if (validationType == ValidationType.EMAIL) {
                return isEmailValid(txt);
            } else if (validationType == ValidationType.MOBILE) {

            } else if (validationType == ValidationType.WEBSITE) {

            }

        }
        return false;
    }

    boolean isEmailValid(String email) {
        String emailFormat = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(emailFormat);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public void setFont(String fontPath) {
        Typeface typeface = Typeface.createFromAsset(mContext.getAssets(), fontPath);
        editText.setTypeface(typeface);

    }


    void bind() {
        View view = LayoutInflater.from(mContext).inflate(R.layout.compound_edittext_icon, this, true);
        img = view.findViewById(R.id.img);
        editText = view.findViewById(R.id.editText);
    }

    void setFontList(TypedArray typedArray) {
        int typeFaceNumber = 1;
        //font
        if (typedArray.hasValue(R.styleable.ZECompoundEditTextIcon_fontList)) {
            typeFaceNumber = typedArray.getInt(R.styleable.ZECompoundEditTextIcon_fontList, 1);
        }

        Typeface BNazanin = Typeface.createFromAsset(mContext.getAssets(), "fonts/BNazanin.ttf");
        Typeface Nastaliq = Typeface.createFromAsset(mContext.getAssets(), "fonts/IranNastaliq.ttf");
        Typeface Vazir = Typeface.createFromAsset(mContext.getAssets(), "fonts/Vazir.ttf");
        Typeface TimesNewRoman = Typeface.createFromAsset(mContext.getAssets(), "fonts/times.ttf");

        if (typeFaceNumber == 1)
            editText.setTypeface(BNazanin);
        else if (typeFaceNumber == 2)
            editText.setTypeface(Nastaliq);
        else if (typeFaceNumber == 3)
            editText.setTypeface(Vazir);
        else if (typeFaceNumber == 4)
            editText.setTypeface(TimesNewRoman);
    }

    void setAttrsValues(AttributeSet attrs) {
        typedArray = mContext.obtainStyledAttributes(attrs, R.styleable.ZECompoundEditTextIcon);
        String hintText = typedArray.getString(R.styleable.ZECompoundEditTextIcon_hintText);
        String textValue = typedArray.getString(R.styleable.ZECompoundEditTextIcon_textValue);

        Integer iconDrawable = typedArray.getResourceId(R.styleable.ZECompoundEditTextIcon_iconDrawable, 0);
        String iconUrl = typedArray.getString(R.styleable.ZECompoundEditTextIcon_iconUrl);

        //  String txtFont = typedArray.getString(R.styleable.ZECompoundEditTextIcon_txtFont);

        if (hintText != null) {
            editText.setHint(hintText);
        }

        if (iconDrawable != 0) {
            img.setImageResource(iconDrawable);
        }
        if (iconUrl != null) {
            img.load(iconUrl);
        }
        if (textValue != null) {

            editText.setText(textValue);
        }
//        if (txtFont != null) {
//            Toast.makeText(context, txtFont, Toast.LENGTH_SHORT).show();
//    //        editText.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/BNazanin.ttf"), "fonts/txtFont");
//          //  editText.setTypeface(Typeface.createFromAsset(context.getAssets(), txtFont));
//            Typeface Nastaliq = Typeface.createFromAsset(context.getAssets(), "fonts/IranNastaliq.ttf");
//
//            editText.setTypeface(Nastaliq);
//     //       editText.setTypeface(Typeface.create(txtFont ,Typeface.NORMAL ));
//        }
    }

}
