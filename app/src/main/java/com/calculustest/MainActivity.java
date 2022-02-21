package com.calculustest;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button changeActivityBTN = findViewById(R.id.play);
        changeActivityBTN.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                changeActivityD();
            }
        });

        Button changeActivityBTNI = findViewById(R.id.intermediaire);
        changeActivityBTNI.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                changeActivityI();
            }
        });

        Button changeActivityBTNA = findViewById(R.id.avance);
        changeActivityBTNA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                changeActivityA();
            }
        });




    }
    private void changeActivityD(){
        Intent intent = new Intent(this, QuRep.class);
        startActivity(intent);
    }
    private void changeActivityI(){
        Intent intent = new Intent(this, intermediaire.class);
        startActivity(intent);
    }
    private void changeActivityA(){
        Intent intent = new Intent(this, avance.class);
        startActivity(intent);
    }
}