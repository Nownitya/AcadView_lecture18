package com.example.nowni.login_register_sharedpref;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Successfully_Regs_Activity extends AppCompatActivity {

    TextView savedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successfully__regs_);

        SharedPreferences sharedPreferences=getSharedPreferences("MySharedPrefs",MODE_PRIVATE);

        String displayText=sharedPreferences.getString("display","");
        savedText = findViewById(R.id.textView);

        savedText.setText(displayText);

    }
}
