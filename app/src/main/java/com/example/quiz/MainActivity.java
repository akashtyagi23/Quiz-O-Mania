package com.example.quiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;

    TextView score, question;

    private questions mQuestions=new questions();

    private String mAnswer;
    private int mScore=0;
    private int mQuestionLength=mQuestions.mQuestions.length;

    Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r=new Random();
        answer1=(Button) findViewById(R.id.a1);
        answer2=(Button) findViewById(R.id.a2);
        answer3=(Button) findViewById(R.id.a3);
        answer4=(Button) findViewById(R.id.a4);

        score= (TextView) findViewById(R.id.s1);
        question= (TextView) findViewById(R.id.s2);

        updateQuestion(r.nextInt(mQuestionLength));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer1.getText()==mAnswer)
                {
                    mScore++;
                    score.setText("Score: "+ mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }else{
                    gameOver();
                }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer2.getText()==mAnswer)
                {
                    mScore++;
                    score.setText("Score: "+ mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }else{
                    gameOver();
                }

            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer3.getText()==mAnswer)
                {
                    mScore++;
                    score.setText("Score: "+ mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }else{
                    gameOver();
                }

            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer4.getText()==mAnswer)
                {
                    mScore++;
                    score.setText("Score: "+ mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }else{
                    gameOver();
                }

            }
        });

    }

    private void updateQuestion(int num)
    {
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswer=mQuestions.getCorrectAnswer(num);
    }

    private void gameOver()
    {
        AlertDialog.Builder alertDialogBuilder= new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setMessage("Game Over! Your Score is "+ mScore +" points.")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));

                            }
                        })
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();

                            }
                        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

}