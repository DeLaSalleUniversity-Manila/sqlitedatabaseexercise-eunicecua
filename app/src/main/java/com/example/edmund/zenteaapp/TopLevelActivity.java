package com.example.edmund.zenteaapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class TopLevelActivity extends Activity {
    String[] main_menu = {
            "Green Tea",
            "Personalitea",
            "Milk Tea",
            "Add-Ons/Extras"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, main_menu);
        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent goToGreenTea= new Intent(TopLevelActivity.this, GreenTea.class);
                        startActivity(goToGreenTea);
                        break;
                    case 1:
                        Intent goToPersonalitea = new Intent(TopLevelActivity.this, Personalitea.class);
                        startActivity(goToPersonalitea);
                        break;
                    case 2:
                        Intent goToMilkTea = new Intent(TopLevelActivity.this, MilkTea.class);
                        startActivity(goToMilkTea);
                        break;
                    case 3:
                        Intent gotoExtras = new Intent(TopLevelActivity.this, Extras.class);
                        startActivity(gotoExtras);
                        break;

                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_top_level, menu);
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
}