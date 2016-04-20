package com.example.yuriramocan.internlists;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class ListActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<String> interns = getIntent().getStringArrayListExtra("interns");

        Log.d("this is my array", "arr: " + Arrays.toString(interns));

        ListView internListView = (ListView) findViewById(R.id.internList);

        ArrayAdapter<String> internsAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                interns
                );

        internListView.setAdapter(internsAdapter);
    }
}
