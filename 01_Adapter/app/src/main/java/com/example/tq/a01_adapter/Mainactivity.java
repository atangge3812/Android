package com.example.tq.a01_adapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Mainactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        ListView listView = (ListView) findViewById(R.id.list_item_1);
        String[] strs = getResources().getStringArray(R.array.mainadapter);
        listView.setAdapter(
                new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,strs));


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.v("rrrr","============"+i);
                Intent intent = new Intent();
                switch (i){
                    case 0:
                        intent.setClass(Mainactivity.this,ArrayAdapterActivity.class);
                        break;
                    case 1:
                        intent.setClass(Mainactivity.this,SimpleAdapterActivity.class);
                        break;
                    case 2:
                        intent.setClass(Mainactivity.this,BaseAdapterActivity.class);
                        break;
                    case 3:
                        intent.setClass(Mainactivity.this,BaseAdapter2Activity.class);
                        break;
                    case 4:
                        intent.setClass(Mainactivity.this,Mainactivity.class);
                        break;
                    case 5:
                        intent.setClass(Mainactivity.this,Mainactivity.class);
                        break;
                }
                startActivity(intent);
            }
        });



    }
}
