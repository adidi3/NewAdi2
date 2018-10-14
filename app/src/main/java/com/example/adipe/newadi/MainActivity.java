package com.example.adipe.newadi;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

        LinearLayout bg;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            bg=(LinearLayout)findViewById(R.id.background);
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.main, menu);
            return super.onCreateOptionsMenu(menu);
        }

        public boolean onOptionsItemSelected(MenuItem item){
            int id=item.getItemId();
            if (id==R.id.menuye){
                bg.setBackgroundColor(Color.YELLOW);
            }
            if (id==R.id.menure){
                bg.setBackgroundColor(Color.RED);
            }
            if (id==R.id.menubl){
                bg.setBackgroundColor(Color.BLUE);
            }
            return super.onOptionsItemSelected(item);
        }

        public void goo(View view) {
            Intent t= new Intent(this, Main2Activity.class);
            startActivity(t);
        }
    }

