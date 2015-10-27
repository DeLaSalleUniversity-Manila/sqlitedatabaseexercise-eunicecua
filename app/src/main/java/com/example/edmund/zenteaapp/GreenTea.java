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

public class GreenTea extends Activity {
    String[] main_menu = {
            "Strawberry",
            "GreenApple",
            "Rapsberry",
            "Lychee",
            "Blueberry"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_green_tea);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, main_menu);
        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent goToStrawberry = new Intent(GreenTea.this, Strawberry.class);
                        startActivity(goToStrawberry);
                        break;
                    case 1:
                        Intent goToGreenApple = new Intent(GreenTea.this, GreenApple.class);
                        startActivity(goToGreenApple);
                        break;
                    case 2:
                        Intent goToRaspberry = new Intent(GreenTea.this, Raspberry.class);
                        startActivity(goToRaspberry);
                        break;
                    case 3:
                        Intent goToLychee = new Intent(GreenTea.this, Lychee.class);
                        startActivity(goToLychee);
                        break;
                    case 4:
                        Intent goToBlueberry = new Intent(GreenTea.this, Lychee.class);
                        startActivity(goToBlueberry);
                        break;
                }

            }
        });
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