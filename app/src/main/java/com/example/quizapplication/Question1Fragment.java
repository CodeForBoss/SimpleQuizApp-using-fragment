package com.example.quizapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.fragment.app.Fragment;


public class Question1Fragment extends Fragment {
    RadioButton r1,r2,r3,r4;
    RadioGroup rb;
    String answer = "CPU";
    public static int t ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_question1, container, false);
        perform(view);

        return view;
}
    private void perform(View view) {
        rb = view.findViewById(R.id.radiogroup);
        r1 = view.findViewById(R.id.answer1RB);
        r2 = view.findViewById(R.id.answer2RB);
        r3 = view.findViewById(R.id.answer3RB);
        r4 = view.findViewById(R.id.answer4RB);
       r1.setOnCheckedChangeListener((buttonView, isChecked) -> {
          if(isChecked){
              if(r1.getText().toString().equals(answer)){
                  t = 5;
              }
              else{
                  t = 0;
              }
          }
       });
        r2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                if(r2.getText().toString().equals(answer)){
                    t = 5;
                }
                else{
                    t = 0;
                }
            }
        });
        r3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                if(r3.getText().toString().equals(answer)){
                    t = 5;
                }
                else{
                    t = 0;
                }
            }
        });
        r4.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                if(r4.getText().toString().equals(answer)){
                    t = 5;
                }
                else{
                    t = 0;
                }
            }
        });
    }

}
