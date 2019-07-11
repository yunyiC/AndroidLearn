package com.chenjiayao.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "main activity";
    public static MainActivity main;
    public TextView txtShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtShow = findViewById(R.id.txtShow);

        ArrayList<Button> buttons = new ArrayList<>();

        Button btn0 = findViewById(R.id.btn0);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btnBack = findViewById(R.id.btnBack);
        Button btnJia = findViewById(R.id.btnJia);
        Button btnJian = findViewById(R.id.btnJian);
        Button btnChen = findViewById(R.id.btnChen);
        Button btnChu = findViewById(R.id.btnChu);
        Button btnDengyu = findViewById(R.id.btnDenyu);
        Button btnJin = findViewById(R.id.btnJin);
        Button btnXin = findViewById(R.id.btnXin);

        buttons.add(btn0);
        buttons.add(btn1);
        buttons.add(btn2);
        buttons.add(btn3);
        buttons.add(btn4);
        buttons.add(btn5);
        buttons.add(btn6);
        buttons.add(btn7);
        buttons.add(btn8);
        buttons.add(btn9);
        buttons.add(btnBack);
        buttons.add(btnJia);
        buttons.add(btnJian);
        buttons.add(btnChen);
        buttons.add(btnChu);
        buttons.add(btnDengyu);
        buttons.add(btnJin);
        buttons.add(btnXin);

        ButtonOnClickListener listenerT = new ButtonOnClickListener();

        for (Button btnT:buttons
             ) {
            btnT.setOnClickListener(listenerT);
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence strT = txtShow.getText();
                if(strT.length() > 1){
                    strT = strT.subSequence(0, strT.length() - 1);
                }
                else
                {
                    strT = "";
                }
                txtShow.setText(strT);
            }
        });

        btnJin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtShow.setText(txtShow.getText() + "88888888888888888888888888888888888888888888888888888888888888888888888888");
            }
        });

        btnXin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence strT = txtShow.getText();
                if (strT.length() > 8)
                {
                    strT = strT.subSequence(0, strT.length() - 8);
                }
                else
                {
                    strT = "";
                }
                txtShow.setText(strT);
            }
        });

        main = this;
    }
}
