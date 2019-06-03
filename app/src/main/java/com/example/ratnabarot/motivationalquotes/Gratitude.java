package com.example.ratnabarot.motivationalquotes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Gratitude  extends AppCompatActivity {


    ListView glistView;

    int[] gimages = {R.mipmap.gi, R.mipmap.gii, R.mipmap.giii, R.mipmap.giv, R.mipmap.gv, R.mipmap.gvi, R.mipmap.gvii, R.mipmap.gviii, R.mipmap.gix, R.mipmap.gxxi,
            R.mipmap.gxi, R.mipmap.gxii, R.mipmap.gxiii, R.mipmap.gxiv, R.mipmap.gxv, R.mipmap.gxvi, R.mipmap.gxvii, R.mipmap.gxviii, R.mipmap.gix, R.mipmap.gxx};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gratitude);

        glistView = findViewById(R.id.listView);

        Gratitude.CustomAdaptor customAdaptor = new Gratitude.CustomAdaptor();
        glistView.setAdapter(customAdaptor);
    }

    class CustomAdaptor extends BaseAdapter {

        @Override
        public int getCount() {
            return gimages.length;
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

            sImageView.setImageResource(gimages[position]);

            return view;
        }
    }
}
