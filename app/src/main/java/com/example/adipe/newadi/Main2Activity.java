package com.example.adipe.newadi;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {
    LinearLayout ll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ll = (LinearLayout) findViewById(R.id.ll1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0, 0, 15, "Magenta");
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String ring = item.getTitle().toString();
        if (ring.equals("Magenta")) {
            ll.setBackgroundColor(Color.MAGENTA);
        } else {
            int o = item.getItemId();
            if (o == R.id.menuye) {
                ll.setBackgroundColor(Color.YELLOW);
            }
            if (o == R.id.menubl) {
                ll.setBackgroundColor(Color.BLUE);
            }
            if (o == R.id.menure) {
                ll.setBackgroundColor(Color.RED);
            }}
            return super.onOptionsItemSelected(item);
        }

        public void d (View view){
            Intent h = new Intent(this, MainActivity.class);
            startActivity(h);



    }}