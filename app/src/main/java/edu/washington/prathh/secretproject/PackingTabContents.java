package edu.washington.prathh.secretproject;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class PackingTabContents extends ActionBarActivity {
    private ListView listView;
    private ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_packing_tab_contents);

        listView = (ListView) findViewById(R.id.listView);
        List<ListItem> packingList = new ArrayList<ListItem>();
        packingList.add(new ListItem("Pajamas"));
        packingList.add(new ListItem("Warm jacket and/or rain jacket"));
        packingList.add(new ListItem("Outfit for Sunday"));
        packingList.add(new ListItem("Sturdy shoes"));
        packingList.add(new ListItem("Slip-on shoes", "Like sandals or slippers"));
        packingList.add(new ListItem("Flashlight"));
        packingList.add(new ListItem("Phone charger"));
        listView.setAdapter(new ListItemAdapter(this, R.layout.list_item, packingList));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_packing_tab_contents, menu);
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
