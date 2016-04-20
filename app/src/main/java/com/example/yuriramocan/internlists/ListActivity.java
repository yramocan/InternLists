package com.example.yuriramocan.internlists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Get data passed from MainActivity
        String[] interns = getIntent().getStringArrayExtra("interns");

        // Find ListView to attach array data
        ListView internListView = (ListView) findViewById(R.id.internList);

        // Create array adapter internsAdapter to map array data to list
        ArrayAdapter<String> internsAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                interns
                );

        // Set array adapter to appropriate list view
        internListView.setAdapter(internsAdapter);
    }
}
