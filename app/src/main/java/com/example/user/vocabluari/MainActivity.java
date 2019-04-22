package com.example.user.vocabluari;

import android.annotation.SuppressLint;
import android.content.Context;
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
    private TextView right_word,result,counted,text_result_b;
    public ArrayList<String> value;
    private ArrayList<String> transete;
    private String rightWord;
    private String result_bal;
    private int count = 0;
    private Context context;


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
        counted = findViewById(R.id.count);
        text_result_b = findViewById(R.id.text_result_b);


        final Vocabluari group_one = new Vocabluari();

        value = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.word_value)));
        transete = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.word_translete)));


        group_one.work(value, transete, right_word, answer_one, answer_two, answer_three,next,text_result_b);



    }

    }





