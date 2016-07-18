package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int question1 = 0;
    int question2 = 0;
    int question3 = 0;
    int question4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked1(View view) {

        boolean checked = ((RadioButton) view).isChecked();


        switch (view.getId()) {
            case R.id.question1_yes:
                if (checked)
                    question1 = 0;
                break;
            case R.id.question1_no:
                if (checked)
                    question1 = 1;
                break;
        }
    }

    private void scoreQuestion2() {
        EditText answerField = (EditText) findViewById(R.id.question2_answer);
        String answer = answerField.getText().toString();
        if (answer.equals("instance")) {
            question2 = 1;
        }
        else {
            question2 =0;
        }
    }

    public void onRadioButtonClicked3(View view) {

        boolean checked = ((RadioButton) view).isChecked();


        switch (view.getId()) {
            case R.id.question3_procedural:
                if (checked)
                    question3 = 0;
                break;
            case R.id.question3_declarative:
                if (checked)
                    question3 = 1;
                break;
        }
    }

    private void scoreQuestion4() {
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkbox3);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkbox4);

        if (checkBox3.isChecked()) {
            question4 += 1;
        }
        if (checkBox4.isChecked()) {
            question4 += 1;
        }
        if (checkBox1.isChecked() && question4 > 0) {
            question4 -= 1;
        }
        if (checkBox2.isChecked() && question4 > 0) {
            question4 -= 1;
        }
    }

    private void resetScores() {
        question2 = 0;
        question4 = 0;
    }

    public void submitAnswers(View view) {

        scoreQuestion2();
        scoreQuestion4();
        int total = 0;
        total = question1 + question2 + question3 + question4;
        String message = "Your total score is " + total;
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        resetScores();
    }
}
