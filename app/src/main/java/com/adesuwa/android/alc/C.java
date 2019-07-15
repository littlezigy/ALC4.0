package com.adesuwa.android.alc;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.ViewGroup.LayoutParams;
import android.view.View;

public class C extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        for(int i = 0; i<5; i++) {

            LinearLayout parent = (LinearLayout) findViewById(R.id.deets);

            LinearLayout layout = new LinearLayout(this);

            TextView title = new TextView(this);
            TextView value = new TextView(this);

            layout.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
            layout.setOrientation(LinearLayout.HORIZONTAL);

            /*title.setText("@string/C_f"+i+"_title");
            value.setText("@string/C_f"+i+"_value");*/

            LayoutParams tparams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
            title.setLayoutParams(tparams);
            title.setText("Bish bosh!");
            value.setText("Posh! HE declared");

            title.setId(i);
            value.setId(i);

            layout.addView(title);
            layout.addView(value);

            parent.addView(layout);
        }
    }
}
