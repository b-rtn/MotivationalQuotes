package com.example.ratnabarot.motivationalquotes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Success extends AppCompatActivity {

    ListView slistView;

    int[] simages = {R.mipmap.si, R.mipmap.sii, R.mipmap.siii, R.mipmap.siv, R.mipmap.sv, R.mipmap.svi, R.mipmap.svii, R.mipmap.sviii, R.mipmap.six, R.mipmap.sx,
                     R.mipmap.sxi, R.mipmap.sxii, R.mipmap.sxiii, R.mipmap.sxiv, R.mipmap.sxv, R.mipmap.sxvi, R.mipmap.sxvii, R.mipmap.sxviii, R.mipmap.six, R.mipmap.sxx};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        slistView = findViewById(R.id.listView);

        CustomAdaptor customAdaptor = new CustomAdaptor();
        slistView.setAdapter(customAdaptor);
    }

    class CustomAdaptor extends BaseAdapter{

        @Override
        public int getCount() {
            return simages.length;
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

            sImageView.setImageResource(simages[position]);

            return view;
        }
    }
}