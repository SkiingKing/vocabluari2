package com.example.user.vocabluari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private static int RESULT = 0 ;
    private Button answer_one,answer_two,answer_three;
    private TextView right_word,result;
    public ArrayList<String> value;
    private ArrayList transete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer_one = findViewById(R.id.answer_one);
        answer_two = findViewById(R.id.answer_two);
        answer_three = findViewById(R.id.answer_three);
        right_word = findViewById(R.id.right_word);
        result = findViewById(R.id .test_result);




        Vocabluari group_one = new Vocabluari();

        value = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.word_value)));
        transete = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.word_translete)));

        group_one.work(value,transete,right_word,answer_one,answer_two,answer_three);

        answer_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RESULT++;

            }
        });
        String r = Integer.toString(RESULT);
        result.setText(r);


        if((answer_one.isPressed()) || (answer_two.isPressed()) || (answer_three.isPressed())){
          group_one.work(value,transete,right_word,answer_one,answer_two,answer_three);
          Log.d("Pizdez","Pizdez");
        }


    }
}



