package com.example.secondquizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup myRadiogroup;
    RadioButton selectedRadiobutton;
    String selectedValue;
    public static String quizmarks="I'm from BD";
    int marks=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRadiogroup=findViewById(R.id.radioGroupID);
    }

    public void nextfunction(View view) {
        int radioButtonid=myRadiogroup.getCheckedRadioButtonId();
        selectedRadiobutton=findViewById(radioButtonid);
        selectedValue=selectedRadiobutton.getText().toString();
        if(selectedValue.equals("Coxs Bazar")){
            marks=5;
        }
        else
        {
            marks=0;
        }
        Intent myIntent=new Intent(MainActivity.this,MainActivity2.class );
        myIntent.putExtra(quizmarks,marks);
        startActivity(myIntent);
    }

}