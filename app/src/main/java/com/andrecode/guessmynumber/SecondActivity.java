package com.andrecode.guessmynumber;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Collections;


public class SecondActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        Utils.LIST = loadList();
        Utils.GRIDVIEW = (GridView)findViewById(R.id.gridView);
        Utils.ADAPTER = new ArrayAdapter<Integer>(this,android.R.layout.simple_dropdown_item_1line,Utils.LIST);
        Utils.GRIDVIEW.setAdapter(Utils.ADAPTER);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {}

    public void incrementResult(View view) {
        Utils.RESULT += 2;
        this.nextIntent(view);
    }

    public void nextIntent(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        startActivity(intent);
    }

    private ArrayList<Integer> loadList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,2,3,6,7,10,11,14,15,18,19,22,23,26,27,30,31,34,35,38,39,42,43,46,47,50,51,54,55,58,59,62,63);
        return list;
    }
}
