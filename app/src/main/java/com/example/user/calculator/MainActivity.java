package com.example.user.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    private Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0;
    private Button btn_plus, btn_min, btn_mult, btn_div, btn_eq, btn_sin, btn_cos, btn_tan, btn_r_over, btn_sq, btn_inv;
    private EditText edt_text;
    String temp, input_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeWidgets();
        input();
    }

    private void initializeWidgets() {
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);

        btn_plus = (Button) findViewById(R.id.btn_9);
        btn_min = (Button) findViewById(R.id.btn_9);
        btn_mult = (Button) findViewById(R.id.btn_9);
        btn_div = (Button) findViewById(R.id.btn_9);
        btn_eq = (Button) findViewById(R.id.btn_9);
        btn_sin = (Button) findViewById(R.id.btn_9);
        btn_cos = (Button) findViewById(R.id.btn_9);
        btn_tan = (Button) findViewById(R.id.btn_9);
        btn_r_over = (Button) findViewById(R.id.btn_9);
        btn_sq = (Button) findViewById(R.id.btn_9);
        btn_inv = (Button) findViewById(R.id.btn_9);

        edt_text = (EditText) findViewById(R.id.text_input);

    }

    @Override
    protected void onResume() {
        super.onResume();
        btnListener();
    }

    private void input()
    {
        try
        {
            input_text = edt_text.getText().toString();
        }
        catch (Exception e)
        {
            input_text = "0";
            temp ="0";
        }
    }

    private void btnListener()
    {
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt_text.setText("0");
                temp = "0";
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt_text.setText("1");
                temp = "1";
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt_text.setText("2");
                temp = "2";
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt_text.setText("3");
                temp = "3";
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt_text.setText("4");
                temp = "4";
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt_text.setText("5");
                temp = "5";
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt_text.setText("6");
                temp = "6";
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt_text.setText("7");
                temp = "7";
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt_text.setText("8");
                temp = "8";
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt_text.setText("9");
                temp = "9";
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // edt_text.setText("+");
                //TODO: ADD ADDITION METHOD
            }
        });
        btn_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //edt_text.setText("-");
                //TODO: ADD SUBTRACTION METHOD
            }
        });
        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //edt_text.setText("X");
                //TODO: ADD MULTIPLY METHOD
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //edt_text.setText("\u00F7");
                //TODO: ADD DIVIDE METHOD
            }
        });
        btn_eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //edt_text.setText("=");
                //TODO: ADD EQUALITY METHOD
            }
        });
        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //edt_text.setText("SIN");
                //TODO: ADD SIN METHOD
            }
        });
        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //edt_text.setText("COS");
                //TODO: ADD COS METHOD
            }
        });
        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //edt_text.setText("TAN");
                //TODO: ADD TAN METHOD
            }
        });
        btn_r_over.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //edt_text.setText("\u221a");
                //TODO: ADD ROOT OVER METHOD
            }
        });
        btn_sq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //edt_text.setText("x^2");
                //TODO: ADD SQUARE ROOT METHOD
            }
        });
        btn_inv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //edt_text.setText("x^-1");
                //TODO: ADD INVERSE METHOD
            }
        });
    }

}
