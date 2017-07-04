package com.example.brenda.compound;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.brenda.compound.R.id.raaRoms;
import static com.example.brenda.compound.R.id.radBios;
import static com.example.brenda.compound.R.id.radCd;
import static com.example.brenda.compound.R.id.radCpu;
import static com.example.brenda.compound.R.id.radFlash;
import static com.example.brenda.compound.R.id.radJoystick;
import static com.example.brenda.compound.R.id.radKeyboard;
import static com.example.brenda.compound.R.id.radMemories;
import static com.example.brenda.compound.R.id.radMemory;
import static com.example.brenda.compound.R.id.radMotherboard;
import static com.example.brenda.compound.R.id.radMouse;
import static com.example.brenda.compound.R.id.radPC;
import static com.example.brenda.compound.R.id.radPowerSupply;
import static com.example.brenda.compound.R.id.radRam;
import static com.example.brenda.compound.R.id.radRechargeable;
import static com.example.brenda.compound.R.id.radRems;
import static com.example.brenda.compound.R.id.radmonitors;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    IntrotopcClass objClass = new IntrotopcClass();

    public RadioGroup group1, group2, group3, group4, group5, group6, group7, group8, group9;
    public RadioButton radKeyBoards, radMouses, radRams, raaRomss, radMotherboards, radPowerSupplys, radBatterys, radCuss, radCables;
    public Button btnScore;
    public int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        group1 = (RadioGroup) findViewById(R.id.RadGroupOne);
        group2 = (RadioGroup) findViewById(R.id.RadGroupTwo);
        group3 = (RadioGroup) findViewById(R.id.RadGroupThree);
        group4 = (RadioGroup) findViewById(R.id.RadGroupFour);
        group5 = (RadioGroup) findViewById(R.id.RadGroupFive);
        group6 = (RadioGroup) findViewById(R.id.RadGroupSix);
        group7 = (RadioGroup) findViewById(R.id.RadGroupSeven);
        group8 = (RadioGroup) findViewById(R.id.RadGroupEight);
        group9 = (RadioGroup) findViewById(R.id.RadGroupNine);

        btnScore = (Button) findViewById(R.id.Score);
        btnScore.setOnClickListener(this);

        radKeyBoards = (RadioButton) findViewById(R.id.radKeyboard);
        radMouses = (RadioButton) findViewById(radMouse);
        radRams = (RadioButton) findViewById(radRam);
        raaRomss = (RadioButton) findViewById(raaRoms);
        radMotherboards = (RadioButton) findViewById(radMotherboard);
        radPowerSupplys = (RadioButton) findViewById(radPowerSupply);
        radBatterys = (RadioButton) findViewById(R.id.radBattery);
        radCuss = (RadioButton) findViewById(R.id.radCus);
        radCables = (RadioButton) findViewById(R.id.radCable);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.Score:
                int score1 = 0;//store values of RadioGroup one
                int score2 = 0;//store values of RadioGroup Two
                int score3 = 0;//store values of RadioGroup Three
                int score4=0;
                int score5=0;
                int score6=0;
                int score7=0;
                int score8=0;
                int score9=0;

                objClass.setRadOne(0);
                objClass.setRadTwo(0);
                objClass.setRadThree(1);

                //group 1

                if (group1.getCheckedRadioButtonId() == R.id.radKeyboard) {
                    score1 = objClass.getRadThree();

                } else if (group1.getCheckedRadioButtonId() == radJoystick) {
                    score1 = objClass.getRadOne();

                }else if (group1.getCheckedRadioButtonId() == R.id.radModems) {
                    score1 = objClass.getRadThree();
                }

                    //group 2

                if (group2.getCheckedRadioButtonId() == R.id.radKeyboards) {
                    score2 = objClass.getRadOne();

                } else if (group2.getCheckedRadioButtonId() == radMouse) {
                    score2 = objClass.getRadThree() ;

                }else if (group2.getCheckedRadioButtonId() == R.id.radMonitor) {
                    score2 = objClass.getRadTwo();
                }

                    //group 3

                if (group3.getCheckedRadioButtonId() == R.id.radRom) {
                    score3 = objClass.getRadOne();

                } else if (group3.getCheckedRadioButtonId() == radRam) {
                    score3 = objClass.getRadThree() ;

                }else if (group3.getCheckedRadioButtonId() == R.id.radRem) {
                    score3 = objClass.getRadTwo();
                }

                //group 4

                if (group4.getCheckedRadioButtonId() == R.id.raaRoms) {
                    score4 = objClass.getRadThree();

                } else if (group4.getCheckedRadioButtonId() == radRems) {
                    score4 = objClass.getRadOne() ;

                }else if (group4.getCheckedRadioButtonId() == raaRoms) {
                    score = objClass.getRadTwo();
                }

                //group 5

                if (group5.getCheckedRadioButtonId() == R.id.radMotherboard) {
                    score5 = objClass.getRadThree();

                } else if (group5.getCheckedRadioButtonId() == radRems) {
                    score5 = objClass.getRadOne() ;

                }else if (group5.getCheckedRadioButtonId() == raaRoms) {
                    score5 = objClass.getRadTwo();
                }

                    //group 6

                if (group6.getCheckedRadioButtonId() == R.id.radCpu) {
                    score6 = objClass.getRadOne();

                } else if (group6.getCheckedRadioButtonId() == radPowerSupply) {
                    score6 = objClass.getRadThree() ;

                }else if (group6.getCheckedRadioButtonId() == radmonitors) {
                    score6 = objClass.getRadTwo();
                }


                //group 7

                if (group7.getCheckedRadioButtonId() == R.id.radBattery) {
                    score7 = objClass.getRadThree();

                } else if (group7.getCheckedRadioButtonId() == radBios) {
                    score7 = objClass.getRadOne() ;

                }else if (group7.getCheckedRadioButtonId() == radRechargeable) {
                    score7 = objClass.getRadTwo();
                }

                    //group 8
                if (group8.getCheckedRadioButtonId() == R.id.radCus) {
                    score8 = objClass.getRadThree();

                } else if (group8.getCheckedRadioButtonId() == radCd) {
                    score8 = objClass.getRadOne() ;

                }else if (group8.getCheckedRadioButtonId() == radFlash) {
                    score8 = objClass.getRadTwo();
                }

                // group 9

                if (group9.getCheckedRadioButtonId() == R.id.radCable) {
                    score9 = objClass.getRadThree();

                } else if (group9.getCheckedRadioButtonId() == radMemories) {
                    score9 = objClass.getRadOne() ;

                }else if (group9.getCheckedRadioButtonId() == radPC) {
                    score9 = objClass.getRadTwo();
                }



                score = score1+score2+score3+score4+score5+score6+score7+score8+score9;


                if (score < 4) {
                    Toast.makeText(Main3Activity.this, "You have Scored Less than the required pass mark " +(score)  +" please try again ", Toast.LENGTH_LONG).show();
                } else
                    Toast.makeText(Main3Activity.this, "Congrats you have passed with score :" + " " + score, Toast.LENGTH_LONG).show();

        }
    }
}