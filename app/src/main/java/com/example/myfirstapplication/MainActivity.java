package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btnMain;
    TextView tvMain;
    EditText etMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMain= findViewById(R.id.btnMain);
        tvMain= findViewById(R.id.tvMain);
        etMain= findViewById(R.id.etMain);
    }


    public void onClick(View view) {
        if (view == btnMain){
            tvMain.setText(etMain.getText().toString());
        }
    }
}