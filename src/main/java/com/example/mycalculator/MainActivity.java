package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usernam;
    EditText password;
    TextView hi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernam = (EditText) findViewById(R.id.editTextscreen);
        password = (EditText) findViewById(R.id.editText2);
        hi = (TextView) findViewById(R.id.textViewhi);
    }

    public void loginn(View v) {
        String psw = password.getText().toString();
        String namepl = usernam.getText().toString();
        int pp=Integer.parseInt(psw);
        Intent intenn=new Intent(MainActivity.this,mycalculator.class);
        if(pp == 0) {
            intenn.putExtra("name",namepl);
            startActivity(intenn);
            Toast.makeText(MainActivity.this,"Logged In "+namepl,Toast.LENGTH_SHORT).show();
            String welcome=" Hello Mr. " + namepl;
            hi.setText(welcome);

        }else {
            String sry="Sorry Wrong Passoword try again";
            hi.setText(sry);
            //Toast.makeText(Login.this, "Sorry Wrong Passoword try again", Toast.LENGTH_SHORT).show();
            password.setText("");
            usernam.setText("");
        }
    }
}
