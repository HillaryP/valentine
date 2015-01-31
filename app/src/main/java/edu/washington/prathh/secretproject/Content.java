package edu.washington.prathh.secretproject;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;
import java.util.List;


public class Content extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);

        TabHost.TabSpec packingTab = tabHost.newTabSpec("Pack");
        packingTab.setIndicator("Get Packing");
        packingTab.setContent(new Intent(this, PackingTabContents.class));
        TabHost.TabSpec buyingTab = tabHost.newTabSpec("Buy");
        buyingTab.setIndicator("Get Shopping");
        buyingTab.setContent(new Intent(this, BuyingTabContents.class));
        TabHost.TabSpec navTab = tabHost.newTabSpec("Go");
        navTab.setIndicator("Get Going!");
        navTab.setContent(new Intent(this, MapsActivity.class));

        tabHost.addTab(packingTab);
        tabHost.addTab(buyingTab);
        tabHost.addTab(navTab);
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
