package com.example.secondquizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    int result,result2,finalResult;
    TextView outputTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent myGetIntent=getIntent();
        result=myGetIntent.getIntExtra(MainActivity2.quizmarks2,0);
        result2=myGetIntent.getIntExtra(MainActivity.quizmarks,0);
        finalResult=result+result2;
        outputTextview=findViewById(R.id.outputTextviewID);
        if (finalResult==10){
            outputTextview.setText("You got 10 out of 10");
        }
        else if(finalResult==5)
        {
            outputTextview.setText("You got 5 out of 10");
        }
        else{
            outputTextview.setText("Your answer is wrong ans mark is 0");
        }
    }
    public void TryagainFunction(View view){
        Intent myfirstIntent=new Intent(MainActivity3.this,MainActivity.class);
        startActivity(myfirstIntent);
    }
}
