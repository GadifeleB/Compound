package com.example.brenda.compound;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

   public ImageView myImage;
public ImageView mgeImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImage = (ImageView)findViewById(R.id.image);
        mgeImage = (ImageView)findViewById(R.id.end);



        //onclick Method
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    //Dialog
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("How To play");
                    dialog.setMessage("Compound words are made when two smaller words are put together.....e.g Lady + Bird = Ladybird" + "\n"  + " " +"To play you have to Read the question carefully and Select boxes that you think make up that words!!"+"\n"+" "+"" +
                            " Answer all the questions when your done click finish to get the results of your game...GOOD LUCK");


                    dialog.setPositiveButton("Start Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent myForm = new Intent(MainActivity.this,Main2Activity.class);
                            startActivity(myForm);

                        }
                    });

                    dialog.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            dialog.dismiss();
                        }
                    });

                    dialog.show();

                }
            }
        });
        //End onclick Method

        mgeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    //Dialog
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("How To play");
                    dialog.setMessage("To play this game "+"\n "+ "you have to select one answer from the options given that you think is the correct answer to the question that has been asked");


                    dialog.setPositiveButton("Start Game", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(MainActivity.this,Main3Activity.class);
                            startActivity(i);

                        }
                    });

                    dialog.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            dialog.dismiss();
                        }
                    });

                    dialog.show();

                }
            }
        });

    }
}
