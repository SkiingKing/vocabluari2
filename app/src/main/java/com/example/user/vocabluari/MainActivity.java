package com.example.user.vocabluari;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {

    private static int RESULT = 0 ;
    private Button answer_one,answer_two,answer_three,next;
    private TextView right_word,result;
    public ArrayList<String> value;
    private ArrayList transete;
    private String rightWord;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer_one = findViewById(R.id.answer_one);
        answer_two = findViewById(R.id.answer_two);
        answer_three = findViewById(R.id.answer_three);
        right_word = findViewById(R.id.right_word);
        result = findViewById(R.id.test_result);
        next = findViewById(R.id.next);

        Vocabluari group_one = new Vocabluari();

        value = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.word_value)));
        transete = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.word_translete)));

        group_one.work(value, transete, right_word, answer_one, answer_two, answer_three);






        rightWord = group_one.work(value, transete, right_word, answer_one, answer_two, answer_three);

        answer_one.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                if(rightWord == answer_one.getText()){
                    RESULT++;
                    answer_one.setBackgroundColor(Color.GREEN);
                    String r = Integer.toString(RESULT);
                    result.setText(r);
                }else answer_one.setBackgroundColor(Color.RED);
            }
        });

        answer_two.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                if(rightWord == answer_two.getText()){
                    RESULT++;
                    answer_two.setBackgroundColor(Color.GREEN);
                    String r = Integer.toString(RESULT);
                    result.setText(r);
                }else answer_two.setBackgroundColor(Color.RED);
            }
        });

        answer_three.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                if(rightWord == answer_three.getText()){
                    RESULT++;
                    answer_three.setBackgroundColor(Color.GREEN);
                    String r = Integer.toString(RESULT);
                    result.setText(r);
                }else answer_three.setBackgroundColor(Color.RED);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Vocabluari next_vob = new  Vocabluari();
                next_vob.work(value, transete, right_word, answer_one, answer_two, answer_three);
            }
        });

    }

    }





