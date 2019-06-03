package com.example.ratnabarot.motivationalquotes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Life extends AppCompatActivity {


    ListView llistView;

    int[] limages = {R.mipmap.li, R.mipmap.lii, R.mipmap.liii, R.mipmap.liv, R.mipmap.lv, R.mipmap.lvi, R.mipmap.lvii, R.mipmap.lviii, R.mipmap.lix, R.mipmap.lx,
            R.mipmap.lxi, R.mipmap.lxii, R.mipmap.lxiii, R.mipmap.lxiv, R.mipmap.lxv, R.mipmap.lxvi, R.mipmap.lxvii, R.mipmap.lxviii, R.mipmap.lix, R.mipmap.lxx};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);

        llistView = findViewById(R.id.listView);

        Life.CustomAdaptor customAdaptor = new Life.CustomAdaptor();
        llistView.setAdapter(customAdaptor);
    }

    class CustomAdaptor extends BaseAdapter {

        @Override
        public int getCount() {
            return limages.length;
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

            sImageView.setImageResource(limages[position]);

            return view;
        }
    }
}
