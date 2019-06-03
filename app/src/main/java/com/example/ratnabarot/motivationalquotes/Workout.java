package com.example.ratnabarot.motivationalquotes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Workout extends AppCompatActivity {


    ListView wlistView;

    int[] wimages = {R.mipmap.wi, R.mipmap.wii, R.mipmap.wiii, R.mipmap.wiv, R.mipmap.wv, R.mipmap.wvi, R.mipmap.wvii, R.mipmap.wviii, R.mipmap.wix, R.mipmap.wx,
            R.mipmap.wxi, R.mipmap.wxii, R.mipmap.wxiii, R.mipmap.wxiv, R.mipmap.wxv, R.mipmap.wxvi, R.mipmap.wxvii, R.mipmap.wxviii, R.mipmap.wix, R.mipmap.wxx};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        wlistView = findViewById(R.id.listView);

        Workout.CustomAdaptor customAdaptor = new Workout.CustomAdaptor();
        wlistView.setAdapter(customAdaptor);
    }

    class CustomAdaptor extends BaseAdapter {

        @Override
        public int getCount() {
            return wimages.length;
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

            sImageView.setImageResource(wimages[position]);

            return view;
        }
    }
}
