package advance.android.zelibrary;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Toast;

//import advance.android.zelib.views.ZEImageView;
import advance.android.zelib.views.ZECompoundEditTextIcon;
import advance.android.zelibrary.utils.BaseActivity;

public class ActivityMain extends BaseActivity {

  ZECompoundEditTextIcon  name , lastname,  email;
// name Icon --> by app:iconUrl in .xml
// lastname Icon --> by app:iconDrawable in .xml
// email Icon --> by .setUrlIcon() in Activity


// fontList is by xml
// font by setter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bind();

    }

    void bind() {

        name = findViewById(R.id.name);
        lastname = findViewById(R.id.lastname);
        email = findViewById(R.id.email);

      //  name.setText("حسن");

// font by setter
        lastname.setFont("fonts/BFantezy.ttf");


        findViewById(R.id.okBTN).setOnClickListener(v->{
            if(name.getText().length()!=0)
            Toast.makeText(this, name.getText(), Toast.LENGTH_SHORT).show();
// validation
            boolean validation= email.isValid(ZECompoundEditTextIcon.ValidationType.EMAIL);
            Toast.makeText(this, validation?"Email format is valid":"Email format is not valid", Toast.LENGTH_SHORT).show();

        });

// Icon by Url and setter
        email.setUrlIcon("https://findicons.com/files/icons/2198/dark_glass/128/email.png");
    }


}
