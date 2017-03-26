package com.example.tq.a01_adapter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class BaseAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_adapter_activity);

        ListView listView = (ListView) findViewById(R.id.list_item_4);
        listView.setAdapter(new MyAdapter(BaseAdapterActivity.this));

    }






    class MyAdapter extends BaseAdapter
    {
        String[] st1 = new String[]{"1111111","2222222","3333333"};
        String[] st2 = new String[]{"aaaaaaa","bbbbbbb","ccccccc"};

        private Context mContext = null;

        public MyAdapter( Context mContext) {
            this.mContext = mContext;
        }

        @Override
        public int getCount() {
            return st1.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup viewGroup) {

            convertView = LayoutInflater.from(mContext).inflate(R.layout.base_adapter_unit,viewGroup,false);

            TextView t1 = (TextView) convertView.findViewById(R.id.t1);
            TextView t2 = (TextView) convertView.findViewById(R.id.t2);
            t1.setText(st1[i]);
            t1.setText(st2[i]);
            return convertView;
        }
    }
}
