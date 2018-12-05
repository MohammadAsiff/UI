package com.example.utsav.uilayout;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Switch s=findViewById(R.id.s1);
        RadioGroup rg=findViewById(R.id.r1);
       rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               switch (checkedId){
                   case R.id.red:
                       getWindow().getDecorView().setBackgroundColor(Color.parseColor("#e70707"));
                       break;
              case R.id.black:
                       getWindow().getDecorView().setBackgroundColor(Color.parseColor("#0b0b0b"));
                       break;
               }
           }
       });
      s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( s.isChecked())
                    Toast.makeText(Main2Activity.this,"Toggle is ON" ,Toast.LENGTH_SHORT ).show();
                else
                    Toast.makeText(Main2Activity.this,"Toggle is OFF" ,Toast.LENGTH_SHORT ).show();


            }
        });
      findViewById(R.id.rb).setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(Main2Activity.this,Main3Activity.class));
          }
      });
        final CheckBox c1=findViewById(R.id.c1);
       final CheckBox c2=findViewById(R.id.c2);
        findViewById(R.id.cb).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c1.isChecked()==true)
                {
                    getWindow().getDecorView().setBackgroundColor(Color.parseColor("#f5e904"));

                }
                else if (c2.isChecked()==true)
                {
                    getWindow().getDecorView().setBackgroundColor(Color.parseColor("#34ef0a"));

                }
            }
        });

    }
}
