package com.example.brenda.compound;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static com.example.brenda.compound.R.id.chkbag;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    public CheckBox chk1, chk2, chk3;
    TextView question;
    private int score = 0;
    private Button btnfinish;

    CompundClass compundClass = new CompundClass();
    int qlength = compundClass.question.length;
    String correct1, correct2;
    int questionNum = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        chk1 = (CheckBox)findViewById(R.id.chkbag);
        chk2 = (CheckBox)findViewById(R.id.chkkeeper) ;
        chk3 = (CheckBox)findViewById(R.id.chkpaperbag);

        question = (TextView)findViewById(R.id.txtPaper);

        btnfinish = (Button) findViewById(R.id.btnDone);
        btnfinish.setOnClickListener(this);

        updateQuestion(questionNum);

    }

    void updateQuestion(int x){
        question.setText(compundClass.getQuestion(x));

        chk1.setText(compundClass.getPossibleAnswer1(x));
        chk2.setText(compundClass.getPossibleAnswer2(x));
        chk3.setText(compundClass.getPossibleAnswer3(x));

        correct1 = compundClass.getCorrectAnswer1(x);
        correct2 = compundClass.getCorrectAnswer2(x);
    }

    void getScore(){
        questionNum++;
        if(questionNum < qlength){
            if(chk1.isChecked() && chk2.isChecked()){
                if(correct1 == chk1.getText().toString() && correct2 == chk2.getText().toString()){
                    score++;
                }
                updateQuestion(questionNum);
            }
            if(chk1.isChecked() && chk3.isChecked()){
                if(correct1 == chk1.getText().toString() && correct2 == chk3.getText().toString()){
                    score++;
                }
                updateQuestion(questionNum);
            }
            if(chk2.isChecked() && chk3.isChecked()){
                if(correct1 == chk2.getText().toString() && correct2 == chk3.getText().toString()){
                    score++;
                }
                updateQuestion(questionNum);
            }
        }
        Toast.makeText(getApplicationContext(), "Score: " + score, Toast.LENGTH_LONG).show();

        chk1.setChecked(false);
        chk2.setChecked(false);
        chk3.setChecked(false);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnDone:
                getScore();
                break;
        }
    }
}
