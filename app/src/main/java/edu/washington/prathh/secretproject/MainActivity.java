package edu.washington.prathh.secretproject;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.format.Time;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends ActionBarActivity {
    public static final String ACTIVITY = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            TextView mainText = (TextView) findViewById(R.id.title);
            Button button = (Button) findViewById(R.id.clickMe);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Calendar c = Calendar.getInstance();
            Date date1 = c.getTime();

            String str2 = "14/02/2015";
            Date date2 = formatter.parse(str2);
            if (date1.compareTo(date2) < 0) {
                long diff = date2.getTime() - date1.getTime();
                long hours = diff / (60 * 60 * 1000 * 24);
                mainText.setText(hours + " days until Valentine's Day!");
                button.setText("Be patient...");
                button.setClickable(false);
            } else {
                mainText.setText("Happy Valentine's Day!");
            }
        } catch (Exception e) {
            Log.e(ACTIVITY, "Parse exception " + e.toString());
        }
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sendMessage(View view) {
        Log.i(ACTIVITY, "Button clicked");
        Intent intent = new Intent(this, Content.class);
        startActivity(intent);
    }
}
