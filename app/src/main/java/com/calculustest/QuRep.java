package com.calculustest;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuRep extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qu_rep);
        Button b = findViewById(R.id.tr1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(QuRep.this,"Bravo!",Toast.LENGTH_LONG).show();
                changeActivity();
            }
        });

    }

    private void changeActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}