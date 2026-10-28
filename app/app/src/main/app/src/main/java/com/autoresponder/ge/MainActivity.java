package com.autoresponder.ge;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText(
            "ავტომოპასუხე\n\n" +
            "AutoResponderGE\n\n" +
            "მიზანი: 4 ზარის შემდეგ შეტყობინება\n" +
            "Goal: Answer after 4 rings"
        );
        text.setGravity(Gravity.CENTER);
        text.setTextSize(20);

        setContentView(text);
    }
}
