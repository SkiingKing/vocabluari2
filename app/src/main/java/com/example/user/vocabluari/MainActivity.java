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


    private Button answer_one,answer_two,answer_three,next;
    private TextView right_word,text_count,size,text_result_b;
    public ArrayList<String> value;
    private ArrayList<String> transete;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer_one = findViewById(R.id.answer_one);
        answer_two = findViewById(R.id.answer_two);
        answer_three = findViewById(R.id.answer_three);
        right_word = findViewById(R.id.right_word);
        next = findViewById(R.id.next);
        text_result_b = findViewById(R.id.text_result_b);
        text_count = findViewById(R.id.count_text);
        size = findViewById(R.id.size);

        final Vocabluari group_one = new Vocabluari();

        value = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.word_value)));
        transete = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.word_translete)));


        group_one.work(value, transete, right_word, answer_one, answer_two, answer_three,next,text_result_b,text_count,size);



    }

    }





