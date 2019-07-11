package com.chenjiayao.myapplication;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonOnClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        TextView txtShow = MainActivity.main.txtShow;
        Button btnNow = (Button)v;
        String strBtn = btnNow.getText().toString();
        txtShow.setText(txtShow.getText().toString() + strBtn);
        Log.d(strBtn, "onClick: " + strBtn);
    }
}
