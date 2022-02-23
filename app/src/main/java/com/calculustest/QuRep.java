package com.calculustest;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;

import java.util.Random;

public class QuRep extends AppCompatActivity {
    TextView txt;
    TextView txt1;
    TextView f7;
    TextView f8;
    TextView f9;
    Button btn;
    Button trr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qu_rep);
        txt = findViewById(R.id.textView3);
        txt1 = findViewById(R.id.textView8);
        btn = findViewById(R.id.generate);
        trr=findViewById(R.id.tr1);
        f7 = findViewById(R.id.fa7);
        f8 = findViewById(R.id.fa8);
        f9 = findViewById(R.id.fa9);


        Button b = findViewById(R.id.tr1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(QuRep.this,"Bravo!",Toast.LENGTH_LONG).show();
                changeActivity();
            }
        });
        Button c = findViewById(R.id.exit3);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(QuRep.this,"quit",Toast.LENGTH_LONG).show();
                changeActivity();
            }
        });
        Button d = findViewById(R.id.fa7);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(QuRep.this,"Ressayez",Toast.LENGTH_LONG).show();

            }
        });
        Button e = findViewById(R.id.fa8);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(QuRep.this,"Ressayez",Toast.LENGTH_LONG).show();

            }
        });
        Button f = findViewById(R.id.fa9);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(QuRep.this,"Ressayez",Toast.LENGTH_LONG).show();

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int val = random.nextInt(10);
                txt.setText(Integer.toString(val));

                Random random2 = new Random();
                int val2 = random2.nextInt(10);
                txt1.setText(Integer.toString(val2));

                Random random3 = new Random();
                int val3 = val+val2;
                trr.setText(Integer.toString(val3));

                Random random4 = new Random();
                int val6 = random2.nextInt(10);
                f7.setText(Integer.toString(val6));

                Random random5 = new Random();
                int val4 = random5.nextInt(10);
                f8.setText(Integer.toString(val4));

                Random random6 = new Random();
                int val5 = random6.nextInt(10);
                f9.setText(Integer.toString(val5));


            }
    });
    }
    private void changeActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
