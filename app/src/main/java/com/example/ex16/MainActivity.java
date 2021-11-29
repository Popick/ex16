package com.example.ex16;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder adb;
    ConstraintLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cl = (ConstraintLayout) findViewById(R.id.cl);
    }

    public void random_bg_color(){
        cl.setBackgroundColor(Color.rgb((int)(Math.random()*(255-2)+1),(int)(Math.random()*(255-2)+1),(int)(Math.random()*(255-2)+1)));
    }


    public void run1(View view) {
        adb = new AlertDialog.Builder(this);

        adb.setTitle("Ouch!!");
        adb.setMessage("Don't do it again! that hurts 😖.");

        adb.create().show();
    }

    public void run2(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("You said I can troll.");
        adb.setMessage("The GIF doesn't move, so imagine he is dancing 🤷‍...");

        adb.setIcon(R.drawable.troll);
        adb.create().show();
    }

    public void run3(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Don't click CANCEL!");
        adb.setIcon(android.R.drawable.ic_delete);
        adb.setPositiveButton("Cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        adb.create().show();

    }

    public void run4(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("FREE GIFT!");
        adb.setTitle("Press 'Free gift' for a free gift.");
        adb.setIcon(R.drawable.gift);
        adb.setPositiveButton("Cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        adb.setNegativeButton("Free gift",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        random_bg_color();
                    }
                });

        adb.create().show();
    }

    public void run5(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Button Number Five!!!!");
        adb.setMessage("You did it!!!! you pressed BUTTON NUMBER FIVE!");
        adb.setIcon(R.drawable.gift);
        adb.setPositiveButton("Cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        adb.setNegativeButton("Expensive gift",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                random_bg_color();
            }
        });
        adb.setNeutralButton("Click me (don't)",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                cl.setBackgroundColor(Color.rgb(255,255,255));
            }
        });

        adb.create().show();
    }
}