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


public class FirstActivity extends ActionBarActivity {

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
        Utils.RESULT += 1;
        this.nextIntent(view);
    }

    public void nextIntent(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

    private ArrayList<Integer> loadList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<32; i++){
            list.add(i*2+1);
        }
        return list;
    }
}
