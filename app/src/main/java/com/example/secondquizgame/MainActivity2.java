package com.example.secondquizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    RadioGroup myRadiogroup;
    RadioButton selectedRadiobutton;
    String selectedValue;
    public static String quizmarks="icc";
    int marks=0;


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
        if(selectedValue.equals("Virat Kohli")){
            marks=5;
        }
        else
        {
            marks=0;
        }
        Intent myIntent=new Intent(MainActivity2.this,MainActivity3.class );
        myIntent.putExtra(quizmarks,marks);
        startActivity(myIntent);
    }
}