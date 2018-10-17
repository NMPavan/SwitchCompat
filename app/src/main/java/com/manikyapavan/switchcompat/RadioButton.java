package com.manikyapavan.switchcompat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatRadioButton;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButton extends AppCompatActivity {
    RadioGroup r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        r=(RadioGroup)findViewById(R.id.r1);
        r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.b1:
                        Toast.makeText(getApplicationContext(),"RadioButton",Toast.LENGTH_LONG).show();

                        break;
                    case R.id.b3:
                        Toast.makeText(getApplicationContext(),"RadioButton1",Toast.LENGTH_LONG).show();

                        break;
                }
            }
        });
          }
}
