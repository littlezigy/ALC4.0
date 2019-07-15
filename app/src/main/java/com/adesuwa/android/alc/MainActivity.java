package com.adesuwa.android.alc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void screenB(View view) {
        Intent intent = new Intent(this, B.class);
        startActivity(intent);
    }
    public void screenC(View view) {
        Intent intent = new Intent(this, C.class);
        startActivity(intent);
    }
}
