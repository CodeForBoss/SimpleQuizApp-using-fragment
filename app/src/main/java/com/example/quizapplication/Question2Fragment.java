package com.example.quizapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.fragment.app.Fragment;


public class Question2Fragment extends Fragment {

    RadioButton r1,r2,r3,r4;
    RadioGroup rb;
    String answer = "2";
    public static int t2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_question2, container, false);
        perform(view);
        return view;
    }

    private void perform(View view) {
        rb = view.findViewById(R.id.radiogroup1);
        r1 = view.findViewById(R.id.answer1RB2);
        r2 = view.findViewById(R.id.answer2RB2);
        r3 = view.findViewById(R.id.answer3RB2);
        r4 = view.findViewById(R.id.answer4RB2);
        r1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                if(r1.getText().toString().equals(answer)){
                    t2 = 5;
                }
                else{
                    t2 = 0;
                }
            }
        });
        r2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                if(r2.getText().toString().equals(answer)){
                    t2 = 5;
                }
                else{
                    t2 = 0;
                }
            }
        });
        r3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                if(r3.getText().toString().equals(answer)){
                    t2 = 5;
                }
                else{
                    t2 = 0;
                }
            }
        });
        r4.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                if(r4.getText().toString().equals(answer)){
                    t2 = 5;
                }
                else{
                    t2 = 0;
                }
            }
        });

    }

}
