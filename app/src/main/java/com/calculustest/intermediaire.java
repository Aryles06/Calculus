package com.calculustest;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;

import java.util.Random;


public class intermediaire extends AppCompatActivity {
    TextView txt12;
    TextView txt14;
    TextView tr;
    TextView f6;
    TextView f4;
    TextView f5;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediaire);

        txt12 = findViewById(R.id.textView12);
        txt14 = findViewById(R.id.textView14);
        tr = findViewById(R.id.tr);
        f6 = findViewById(R.id.fa6);
        f4 = findViewById(R.id.fa4);
        f5 = findViewById(R.id.fa5);
        btn = findViewById(R.id.generate3);






        Button f = findViewById(R.id.fa5);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(intermediaire.this,"Ressayez",Toast.LENGTH_LONG).show();

            }
        });
        Button b = findViewById(R.id.exit2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(intermediaire.this,"Vous avez quitté",Toast.LENGTH_LONG).show();
                changeActivity();
            }
        });
        Button c = findViewById(R.id.fa4);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(intermediaire.this,"Ressayez",Toast.LENGTH_LONG).show();

            }
        });
        Button d = findViewById(R.id.fa5);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(intermediaire.this,"Ressayez",Toast.LENGTH_LONG).show();

            }
        });
        Button e = findViewById(R.id.fa6);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(intermediaire.this,"Bravo!",Toast.LENGTH_LONG).show();
                changeActivity();
            }

        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int val = random.nextInt(100);
                txt12.setText(Integer.toString(val));

                Random random2 = new Random();
                int val2 = random2.nextInt(100);
                txt14.setText(Integer.toString(val2));

                Random random3 = new Random();
                int val3 = val+val2;
                f6.setText(Integer.toString(val3));

                Random random4 = new Random();
                int val6 = random2.nextInt(100);
                f4.setText(Integer.toString(val6));

                Random random5 = new Random();
                int val4 = random5.nextInt(100);
                tr.setText(Integer.toString(val4));

                Random random6 = new Random();
                int val5 = random6.nextInt(100);
                f5.setText(Integer.toString(val5));


            }
        });




    }

    private void changeActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
