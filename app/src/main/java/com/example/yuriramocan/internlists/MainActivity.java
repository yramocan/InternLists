package com.example.yuriramocan.internlists;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String[] interns = {
            "Kate Owens",
            "George Royce",
            "TJ Chhabra",
            "Yuri Ramocan",
            "Tijana Milovanovic"
    };

    public void openListActivity(View view) {
        // Initialize list activity.
        Intent intentListActivity = new Intent(MainActivity.this, ListActivity.class);

//        Bundle b = new Bundle();
//        b.putStringArray();

        intentListActivity.putExtra("interns", interns);

        // Start new activity.
        startActivity(intentListActivity);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
