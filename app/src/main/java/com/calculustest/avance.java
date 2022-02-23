package com.calculustest;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class avance extends AppCompatActivity {

    TextView txt16;
    TextView txt6;
    TextView f3;
    TextView f2;
    TextView tr3;
    TextView f1;
    Button btn;
//
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//
        txt16 = findViewById(R.id.textView16);
        txt6 = findViewById(R.id.textView6);
        f3 = findViewById(R.id.fal3);
        f2 = findViewById(R.id.fal2);
        tr3 = findViewById(R.id.tr3);
        f1 = findViewById(R.id.fal1);
        btn = findViewById(R.id.generate2);
//
//
        setContentView(R.layout.activity_avance);
        Button b = findViewById(R.id.tr3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(avance.this,"Ressayez",Toast.LENGTH_LONG).show();

            }
        });
        Button d = findViewById(R.id.exit1);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(avance.this,"Vous avez quitté",Toast.LENGTH_LONG).show();
//                changeActivity();
            }
        });
        Button e = findViewById(R.id.fal1);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(avance.this,"Bravo!",Toast.LENGTH_LONG).show();
//                changeActivity();
            }
        });
        Button f = findViewById(R.id.fal2);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(avance.this,"Ressayez",Toast.LENGTH_LONG).show();
            }
        });
        Button g = findViewById(R.id.fal3);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(avance.this,"Ressayez",Toast.LENGTH_LONG).show();

            }
        });
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Random random = new Random();
//                int val = random.nextInt(1000);
//                txt16.setText(Integer.toString(val));
//
//                Random random2 = new Random();
//                int val2 = random2.nextInt(1000);
//                txt6.setText(Integer.toString(val2));
//
//                Random random3 = new Random();
//                int val3 = val+val2;
//                f1.setText(Integer.toString(val3));
//
//                Random random4 = new Random();
//                int val6 = random2.nextInt(1000);
//                f2.setText(Integer.toString(val6));
//
//                Random random5 = new Random();
//                int val4 = random5.nextInt(1000);
//                tr3.setText(Integer.toString(val4));
//
//                Random random6 = new Random();
//                int val5 = random6.nextInt(1000);
//                f3.setText(Integer.toString(val5));
//
//
//            }
//        });
//    }
//
//    private void changeActivity(){
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
    }

}