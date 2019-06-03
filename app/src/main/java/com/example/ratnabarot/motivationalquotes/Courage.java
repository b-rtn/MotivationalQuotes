package com.example.ratnabarot.motivationalquotes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Courage extends AppCompatActivity {

    ListView clistView;

    int[] cimages = {R.mipmap.ci, R.mipmap.cii, R.mipmap.ciii, R.mipmap.civ, R.mipmap.cv, R.mipmap.cvi, R.mipmap.cvii, R.mipmap.cviii, R.mipmap.cix, R.mipmap.cx,
            R.mipmap.cxi, R.mipmap.cxii, R.mipmap.cxiii, R.mipmap.cxiv, R.mipmap.cxv, R.mipmap.cxvi, R.mipmap.cxvii, R.mipmap.cxviii, R.mipmap.cix, R.mipmap.cxx};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courage);

        clistView = findViewById(R.id.listView);

        Courage.CustomAdaptor customAdaptor = new Courage.CustomAdaptor();
        clistView.setAdapter(customAdaptor);
    }

    class CustomAdaptor extends BaseAdapter {

        @Override
        public int getCount() {
            return cimages.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view = getLayoutInflater().inflate(R.layout.categories_layout, null);

            ImageView sImageView = view.findViewById(R.id.imageView2);

            sImageView.setImageResource(cimages[position]);

            return view;
        }
    }
}
