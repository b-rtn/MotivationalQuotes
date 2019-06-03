package com.example.ratnabarot.motivationalquotes;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {


        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void success(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openSuccess = new Intent(MainActivity.this, Success.class);
        startActivity(openSuccess);
    }

    public void courage(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openCourage = new Intent(MainActivity.this, Courage.class);
        startActivity(openCourage);
    }

    public void dreams(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openDreams = new Intent(MainActivity.this, Dreams.class);
        startActivity(openDreams);
    }

    public void workout(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openWorkout = new Intent(MainActivity.this, Workout.class);
        startActivity(openWorkout);
    }

    public void life(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openLife = new Intent(MainActivity.this, Life.class);
        startActivity(openLife);
    }

    public void gratitude(View view){
        //Takes to a second activity(options in smoothies & their ingredients) when the button is clicked.
        Intent openGratitude = new Intent(MainActivity.this, Gratitude.class);
        startActivity(openGratitude);
    }
}
