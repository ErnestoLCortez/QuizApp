package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    int question1;
    int question3;
    int question4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void question1True() {
        question1 = 1;
    }

    private void question1False() {
        question1 = 0;
    }

    private boolean question2() {
        EditText answerField = (EditText) findViewById(R.id.question2_answer);
        String answer = answerField.getText().toString();
        return answer == "table";
    }

    private void question3True() {
        question3 = 1;
    }

    private void question3False() {
        question3 = 0;
    }

    private void question4() {
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkbox3);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkbox4);


    }

}
