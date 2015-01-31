package edu.washington.prathh.secretproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class BuyingTabContents extends ActionBarActivity {
    private ListView listView;
    private ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buying_tab_contents);
        listView = (ListView) findViewById(R.id.listView);
        List<ListItem> buyingList = new ArrayList<ListItem>();
        buyingList.add(new ListItem("Something nice for Hillary", ";)"));
        buyingList.add(new ListItem("Sandwich fixins", "Doesn't have to be fancy! PB+J would be great."));
        buyingList.add(new ListItem("Bag of salad", "I like Caesar, but it's up to you"));
        buyingList.add(new ListItem("Snacks"));
        buyingList.add(new ListItem("Dessert"));
        buyingList.add(new ListItem("Beer"));
        listView.setAdapter(new ListItemAdapter(this, R.layout.list_item, buyingList));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_buying_tab_contents, menu);
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
