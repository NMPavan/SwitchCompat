package com.manikyapavan.switchcompat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBox extends AppCompatActivity
{
    AppCompatCheckBox c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        c=(AppCompatCheckBox)findViewById(R.id.c1);
        c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true){
                    Toast.makeText(getApplicationContext(),"Checked",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"unChecked",Toast.LENGTH_SHORT).show();


                }
            }
        });
    }
}
