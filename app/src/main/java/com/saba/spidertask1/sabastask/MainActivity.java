package com.saba.spidertask1.sabastask;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    public static final String Total_value = "Total_value";
    Button button1;
    Button button2;
    TextView value;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        value = (TextView) findViewById(R.id.value);
        x = 0;

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
                x++;
                value.setText(x+"");}});
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=0;
                value.setText(x+"");}});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.done_by) {
            return true;
        }

        if (id == R.id.exit_button) {
            finish();
            System.exit(0);
        }

        return super.onOptionsItemSelected(item);
    }
}
