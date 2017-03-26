package com.example.tq.a01_adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ArrayAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.array_adapter_activity);

        ListView listView = (ListView) findViewById(R.id.list_item_2);
        String[] strs = getResources().getStringArray(R.array.arrayadapter);
        listView.setAdapter(
                new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,strs));

    }
}
