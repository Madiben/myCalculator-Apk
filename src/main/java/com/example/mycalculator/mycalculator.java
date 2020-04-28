package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mycalculator extends AppCompatActivity {
    EditText editText;
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonpls, buttonSub, buttonDiv,
            buttonMul, buttonpoin, buttonequ;
    float mval1, mval2;
    boolean add, mul, div, sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycalculator);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonpls = (Button) findViewById(R.id.buttonplus);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonSub = (Button) findViewById(R.id.buttonmin);
        buttonDiv = (Button) findViewById(R.id.buttondiv);
        buttonpoin = (Button) findViewById(R.id.buttonpnt);
        buttonequ = (Button) findViewById(R.id.buttonrsltt);

        editText = (EditText) findViewById(R.id.editTextscreen);
    }

    public void btn0(View v) {
        editText.setText(editText.getText() + "0");
    }

    public void btn1(View v) {
        editText.setText(editText.getText() + "1");
    }

    public void btn2(View v) {
        editText.setText(editText.getText() + "2");
    }

    public void btn3(View v) {
        editText.setText(editText.getText() + "3");
    }

    public void btn4(View v) {
        editText.setText(editText.getText() + "4");
    }

    public void btn5(View v) {
        editText.setText(editText.getText() + "5");
    }

    public void btn6(View v) {
        editText.setText(editText.getText() + "6");
    }

    public void btn7(View v) {
        editText.setText(editText.getText() + "7");
    }

    public void btn8(View v) {
        editText.setText(editText.getText() + "8");
    }

    public void btn9(View v) {
        editText.setText(editText.getText() + "9");
    }

    public void btnp(View v) {
        editText.setText(editText.getText() + ".");
    }

    public void btnadd(View v) {
        if (editText == null) {
            editText.setText("");
        } else {
            mval1 = Float.parseFloat(editText.getText() + "");
            add = true;
            editText.setText(null);
        }
    }

    public void btnsub(View v) {
        mval1 = Float.parseFloat(editText.getText() + "");
        sub = true;
        editText.setText(null);
    }

    public void btnmul(View v) {
        mval1 = Float.parseFloat(editText.getText() + "");
        mul = true;
        editText.setText(null);
    }

    public void btnddiv(View v) {
        mval1 = Float.parseFloat(editText.getText() + "");
        div = true;
        editText.setText(null);
    }

    public void btnequ(View v) {
        Intent intnn = new Intent(this, result.class);
        mval2 = Float.parseFloat(editText.getText() + "");

        if (add == true) {
            editText.setText(mval1 + mval2 + "");
            add = false;
            intnn.putExtra("result", editText.getText().toString());
            startActivity(intnn);
        }

        if (sub == true) {
            editText.setText(mval1 - mval2 + "");
            sub = false;
            intnn.putExtra("result", editText.getText().toString());
            startActivity(intnn);
        }

        if (mul == true) {
            editText.setText(mval1 * mval2 + "");
            mul = false;
            intnn.putExtra("result", editText.getText().toString());
            startActivity(intnn);
        }

        if (div == true) {
            if (mval2 == 0) {
                intnn.putExtra("result", "Error try again div sur 0 est faut");
                startActivity(intnn);
            } else {

                editText.setText(mval1 / mval2 + "");
                div = false;

                intnn.putExtra("result", editText.getText().toString());
                startActivity(intnn);
            }
        }
    }
}


