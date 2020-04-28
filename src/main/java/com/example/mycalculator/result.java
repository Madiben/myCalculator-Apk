package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class result extends AppCompatActivity {
    private TextView Win;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent= getIntent();
        String result = intent.getStringExtra("result");

        Win=(TextView) findViewById(R.id.tvrslt);
        Win.setText(result);
    }
    public void again(View V)
    {
        Intent inte=new Intent(this,mycalculator.class);
        startActivity(inte);
    }
}





