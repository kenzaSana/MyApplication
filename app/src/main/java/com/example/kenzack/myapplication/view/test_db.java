package com.example.kenzack.myapplication.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.kenzack.myapplication.R;

public class test_db extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_db);
    }
    public void userReg(View view){
        startActivity(new Intent(this,Register.class));

    }
}
