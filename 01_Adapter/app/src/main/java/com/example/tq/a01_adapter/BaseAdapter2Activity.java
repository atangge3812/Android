package com.example.tq.a01_adapter;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class BaseAdapter2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_adapter2_activity);

        ArrayList<ItemUnit> itemUnitsarrayList =new ArrayList<>();

        ListView listView = (ListView) findViewById(R.id.list_item_4);

        ItemUnit itemUnit;

        itemUnit = new ItemUnit("title"+1,"context"+1,R.mipmap.head_icon1);
        itemUnitsarrayList.add(itemUnit);

        itemUnit = new ItemUnit("title"+2,"context"+2,R.mipmap.head_icon2);
        itemUnitsarrayList.add(itemUnit);

        itemUnit = new ItemUnit("title"+3,"context"+3,R.mipmap.head_icon3);
        itemUnitsarrayList.add(itemUnit);

        itemUnit = new ItemUnit("title"+4,"context"+4,R.mipmap.head_icon4);
        itemUnitsarrayList.add(itemUnit);

        itemUnit = new ItemUnit("title"+5,"context"+5,R.mipmap.head_icon5);
        itemUnitsarrayList.add(itemUnit);


        listView.setAdapter(new MyAdapter(itemUnitsarrayList,BaseAdapter2Activity.this));


    }



    class MyAdapter extends BaseAdapter
    {
        class ViewHolder{
            TextView title;
            TextView context;
            ImageView image;
        }

        private Context mContext = null;
        ArrayList<ItemUnit> itemUnitList;


        public MyAdapter(ArrayList<ItemUnit> itemUnit, Context mContext) {
            this.itemUnitList = itemUnit;
            this.mContext = mContext;
        }

        @Override
        public int getCount() {
            return itemUnitList.size();
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
            ViewHolder viewHolder ;
            if(convertView == null) {
                viewHolder = new ViewHolder();
                convertView = LayoutInflater.from(mContext).inflate(R.layout.simple_adapter_unit, viewGroup, false);

                TextView title = (TextView) convertView.findViewById(R.id.title);
                TextView context = (TextView) convertView.findViewById(R.id.context);
                ImageView image = (ImageView) convertView.findViewById(R.id.image);
                viewHolder.context=context;
                viewHolder.image = image;
                viewHolder.title = title;

                convertView.setTag(viewHolder);
            }else {
                viewHolder = (ViewHolder) convertView.getTag();
            }
            viewHolder.title.setText(itemUnitList.get(i).getTitle());
            viewHolder.context.setText(itemUnitList.get(i).getContext());
            viewHolder.image.setImageResource(itemUnitList.get(i).getImageid());

            return convertView;
        }
    }

}
