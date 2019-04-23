package com.example.user.vocabluari;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Vocabluari {

    private static int RESULT = 0;
    private static int count;
    private static String result_ball;

    public String work(final ArrayList value, final ArrayList translete, final TextView right_word,
                       final Button FalseWordOne, final Button FalseWordTwo, final Button FalseWordThree,
                       final Button Next , final TextView text_result,final TextView count_text,final TextView size) {

        ArrayList false_word = new ArrayList();

        Random random = new Random();
        int item = random.nextInt(value.size());
        final int word_index = value.indexOf(value.get(item)); //отримали індекс нашого рандомного слова

        false_word.add(0, translete.get(word_index));

        int r = random.nextInt(translete.size());
        int d = random.nextInt(translete.size());


        Log.d("Fab", String.valueOf(r));
        Log.d("Fab", String.valueOf(d));


        if (translete.get(r) != translete.get(word_index) && translete.get(d) != translete.get(word_index)) {
            false_word.add(1, translete.get(r));
            false_word.add(2, translete.get(d));

        }


        Collections.shuffle(false_word);

        right_word.setText((CharSequence) value.get(word_index));
        try {
            FalseWordOne.setText((CharSequence) false_word.get(0));
            FalseWordTwo.setText((CharSequence) false_word.get(1));
            FalseWordThree.setText((CharSequence) false_word.get(2));
        } catch (IndexOutOfBoundsException e) {
            r = random.nextInt(translete.size());
            d = random.nextInt(translete.size());

            if (translete.get(r) != translete.get(word_index) && translete.get(d) != translete.get(word_index)) {
                false_word.add(1, translete.get(r));
                false_word.add(2, translete.get(d));

                FalseWordOne.setText((CharSequence) false_word.get(0));
                FalseWordTwo.setText((CharSequence) false_word.get(1));
                FalseWordThree.setText((CharSequence) false_word.get(2));
            }


        }
        final String rightWord = (String) translete.get(word_index);


        FalseWordOne.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                count++;
                if (translete.get(word_index) == FalseWordOne.getText()) {

                        //TODO написати проверку щоб не можна було нажимати декілька результатів
                    FalseWordOne.setBackgroundColor(Color.GREEN);
                    // String r = Integer.toString(RESULT);
                    //result.setText(r);

                } else FalseWordOne.setBackgroundColor(Color.RED);
            }
        });

        FalseWordTwo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                count++;
                if (translete.get(word_index) == FalseWordTwo.getText()) {

                    RESULT++;

                    FalseWordTwo.setBackgroundColor(Color.GREEN);

                    //FalseWordTwo.setBackground(getResources().getDrawable(R.drawable.button_states));




                } else FalseWordTwo.setBackgroundColor(Color.RED);
            }
        });

        FalseWordThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (translete.get(word_index) == FalseWordThree.getText()) {
                    RESULT++;

                    FalseWordThree.setBackgroundColor(Color.GREEN);

                    // String r = Integer.toString(RESULT);
                    //result.setText(r);

                } else FalseWordThree.setBackgroundColor(Color.RED);
            }
        });

        Next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                FalseWordOne.setBackgroundColor(Color.YELLOW);
                FalseWordTwo.setBackgroundColor(Color.YELLOW);
                FalseWordThree.setBackgroundColor(Color.YELLOW);

                Vocabluari next_vob = new Vocabluari();
                next_vob.work(value, translete, right_word, FalseWordOne, FalseWordTwo, FalseWordThree, Next, text_result,count_text,size);





            }
        });

      count_text.setText(String.valueOf(count));
      size.setText(String.valueOf(value.size()));

        if (count == value.size()) {


            right_word.setText((R.string.result));
            text_result.setText(String.valueOf(RESULT));

            FalseWordOne.setVisibility(View.GONE);
            FalseWordTwo.setVisibility(View.GONE);
            FalseWordThree.setVisibility(View.GONE);
            Next.setVisibility(View.GONE);

        }

        return String.valueOf(RESULT);


    }


}



