package com.michelle.finalexamex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BuyActivity extends AppCompatActivity {

     TextView apnum;
     TextView banum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        Intent intent = getIntent();
        int apNum = intent.getIntExtra("AP",0);
        int baNum = intent.getIntExtra("BA",0);
        apnum = findViewById(R.id.ap);
        banum = findViewById(R.id.ba);
        apnum.setText("蘋果：" + apNum + "");
        banum.setText("香蕉：" + baNum + "");
    }
    public void Return (View view){
        Intent intent2 = new Intent(this,MainActivity.class);
        startActivity(intent2);
    }
}
