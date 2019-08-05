package com.example.chongjiayi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button OLevel1;
    private Button SPM1;
    private Button UEC1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SPM1 = findViewById(R.id.SPM);
        OLevel1 = findViewById(R.id.O_Level);
        UEC1 = findViewById(R.id.UEC);

        SPM1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LaunchSPM();
            }
        });
        OLevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LaunchOLevel();
            }
        });

        UEC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LaunchUEC();
            }
        });
    }

    private void LaunchSPM() {
        Intent intent = new Intent(this, SPM.class);
        startActivity(intent);
    }

    private void LaunchOLevel() {
        Intent intent = new Intent(this, OLevel.class);
        startActivity(intent);
    }

    private void LaunchUEC() {
        Intent intent = new Intent(this, UEC.class);
        startActivity(intent);
    }
}
