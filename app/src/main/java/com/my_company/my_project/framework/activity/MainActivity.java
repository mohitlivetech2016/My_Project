package com.my_company.my_project.framework.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.my_company.my_project.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
