package com.andrecode.guessmynumber;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.Collections;


public class FourthActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        Utils.LIST = loadList();
        Utils.GRIDVIEW = (GridView)findViewById(R.id.gridView);
        Utils.ADAPTER = new ArrayAdapter<Integer>(this,android.R.layout.simple_dropdown_item_1line,Utils.LIST);
        Utils.GRIDVIEW.setAdapter(Utils.ADAPTER);
        Utils.PROGRESS = (ProgressBar) findViewById(R.id.progressBar);
        Utils.PROGRESS.setProgress(49);
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
        Utils.RESULT += 8;
        this.nextIntent(view);
    }

    public void nextIntent(View view) {
        Intent intent = new Intent(this,FifthActivity.class);
        startActivity(intent);
    }

    private ArrayList<Integer> loadList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,8,9,10,11,12,13,14,15,24,25,26,27,28,29,30,31,40,41,42,43,44,45,46,47,56,57,58,59,60,61,62,63);
        return list;
    }
}
