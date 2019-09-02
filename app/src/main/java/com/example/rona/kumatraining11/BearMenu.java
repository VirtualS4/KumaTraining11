package com.example.rona.kumatraining11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BearMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bear_menu);
        initbtn((Button)findViewById(R.id.btn_lat1),Beartivity2.class);
        initbtn((Button)findViewById(R.id.btn_lat2),Beartivity.class);
    }

    private void initbtn(Button btn, final Class bearclass){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bearsense = new Intent(BearMenu.this,bearclass);
                startActivity(Bearsense);
            }
        });
    }
}
