package com.example.ratnabarot.motivationalquotes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Dreams extends AppCompatActivity {

    ListView dlistView;

    int[] dimages = {R.mipmap.di, R.mipmap.dii, R.mipmap.diii, R.mipmap.div, R.mipmap.dv, R.mipmap.dvi, R.mipmap.dvii, R.mipmap.dviii, R.mipmap.dix, R.mipmap.dx,
            R.mipmap.dxi, R.mipmap.dxii, R.mipmap.dxiii, R.mipmap.dxiv, R.mipmap.dxv, R.mipmap.dxvi, R.mipmap.dxvii, R.mipmap.dxviii, R.mipmap.dix, R.mipmap.dxx};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dreams);

        dlistView = findViewById(R.id.listView);

        Dreams.CustomAdaptor customAdaptor = new Dreams.CustomAdaptor();
        dlistView.setAdapter(customAdaptor);
    }

    class CustomAdaptor extends BaseAdapter {

        @Override
        public int getCount() {
            return dimages.length;
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

            sImageView.setImageResource(dimages[position]);

            return view;
        }
    }
}
