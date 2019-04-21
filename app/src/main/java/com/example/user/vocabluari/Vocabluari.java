package com.example.user.vocabluari;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Vocabluari {

    private static int RESULT = 0;
    private ArrayList value ;
    private ArrayList translete ,RightWord;

    public String work(ArrayList value, ArrayList translete, TextView right_word, Button FalseWordOne, Button FalseWordTwo, Button FalseWordThree) {

        ArrayList false_word = new ArrayList();

        Random random = new Random();
        int item =  random.nextInt(value.size());
        int word_index = value.indexOf(value.get(item)); //отримали індекс нашого рандомного слова

        false_word.add(0, translete.get(word_index));

        for(int i = 0;i<value.size();i++){
            if(translete.get(i) != translete.get(word_index)){
                false_word.add(translete.get(i));

            }
        }
         //TODO пофіксити баг(перемішати елементи списка)


        right_word.setText((CharSequence) value.get(word_index));

        FalseWordOne.setText((CharSequence) false_word.get(0));
        FalseWordTwo.setText((CharSequence) false_word.get(1));
        FalseWordThree.setText((CharSequence) false_word.get(2));

         String rightWord = (String) translete.get(word_index);


         return  rightWord;



    }


}



