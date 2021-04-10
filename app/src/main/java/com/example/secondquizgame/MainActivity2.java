package com.example.secondquizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {
    RadioGroup myRadiogroup;
    RadioButton selectedRadiobutton;
    String selectedValue;
    public static String quizmarks2="I'm from BD";
    int marks2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        myRadiogroup=findViewById(R.id.radioGroupID);
    }

    public void submitFunction(View view) {
        int radioButtonid=myRadiogroup.getCheckedRadioButtonId();
        selectedRadiobutton=findViewById(radioButtonid);
        selectedValue=selectedRadiobutton.getText().toString();
        if(selectedValue.equals("Google")){
            marks2=5;
        }
        else
        {
            marks2=0;
        }
        Intent myIntent=new Intent(MainActivity2.this,MainActivity3.class );
        myIntent.putExtra(quizmarks2,marks2);
        startActivity(myIntent);
    }
}