package com.example.app01;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class menu extends Activity {

    private Button exp;
    private Button equ;
    private Button report;
    private Button notice;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        exp=findViewById(R.id.menu1);

    }
}
