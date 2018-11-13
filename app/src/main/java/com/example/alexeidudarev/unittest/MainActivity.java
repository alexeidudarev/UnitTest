package com.example.alexeidudarev.unittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnSet;
    EditText tvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSet = findViewById(R.id.setBTN);
        tvMain = findViewById(R.id.helloTV);
    }
    public void clickMe(View view){
        tvMain.setText(getString(R.string.clickIsdetected));
    }
}
