package com.example.android.basiclistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // the layout to inflate is the main one; contains the "list view"
        // reminder: the actual displayable fields are in the "list_items" layout
        setContentView(R.layout.main_activity);

        // Create the list of objects... this example fills the object with dummy data
        //
        // TODO REFACTOR BaseObject to the more appropiate name for the app being developed
        // TODO Refactor baseObjects as the array list name
        ArrayList<BaseObject> baseObjects = new ArrayList<>();
        baseObjects.add(new BaseObject("7,5","San Francisco","Feb 2,2016"));
        baseObjects.add(new BaseObject("6,1","London","July 20,2016"));
        baseObjects.add(new BaseObject("3,9","Tokyo","Nov 10,2016"));
        baseObjects.add(new BaseObject("5,4","Mexico City","May 3,2016"));
        baseObjects.add(new BaseObject("2,8","Moscow","Jan 31,2016"));
        baseObjects.add(new BaseObject("4,9","Rio de Janeiro","Aug 2,2016"));
        baseObjects.add(new BaseObject("1,6","Paris","Oct 2,2016"));
        baseObjects.add(new BaseObject("1,3","Barcelona","Oct 2,2016"));
        baseObjects.add(new BaseObject("3,6","Valencia","Oct 2,2016"));
        baseObjects.add(new BaseObject("5,5","Berlin","Oct 2,2016"));
        baseObjects.add(new BaseObject("6,9","Monaco","Oct 2,2016"));
        baseObjects.add(new BaseObject("7,6","Madrid","Nov 2,2016"));


        // Create an Adaptor view The adapter knows how to create list item views for each item
        // in the list.
        // TODO refactor the name of the adapted (based on the Object)
        BaseObjectAdapter baseObjectAdapter = new BaseObjectAdapter(this, baseObjects);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(baseObjectAdapter);

        // Set and define the listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                // Item Clicked is a BaseObject
                BaseObject itemClicked = (BaseObject) adapterView.getItemAtPosition(i);

                // TODO do what is needed with the clicked object....
            }
        });
    }
}
