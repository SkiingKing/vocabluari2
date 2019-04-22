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
    private ArrayList<String> transete;
    private String rightWord;
    private String result_bal;

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

        final Vocabluari group_one = new Vocabluari();

        value = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.word_value)));
        transete = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.word_translete)));

        group_one.work(value, transete, right_word, answer_one, answer_two, answer_three);


        //rightWord = group_one.work(value, transete, right_word, answer_one, answer_two, answer_three);






            next.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    answer_one.setBackground(getResources().getDrawable(R.drawable.button_states));
                    answer_two.setBackground(getResources().getDrawable(R.drawable.button_states));
                    answer_three.setBackground(getResources().getDrawable(R.drawable.button_states));

                    Vocabluari next_vob = new Vocabluari();
                    next_vob.work(value, transete, right_word, answer_one, answer_two, answer_three);

                    result_bal = group_one.work(value, transete, right_word, answer_one, answer_two, answer_three);
                    result.setText(result_bal);



                }
            });



    }

    }





