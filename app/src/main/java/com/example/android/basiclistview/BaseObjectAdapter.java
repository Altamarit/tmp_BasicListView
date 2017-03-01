package com.example.android.basiclistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Alex on 01/03/2017.
 */

/* TODO BaseObject and BaseObjectAdapter to be refactorized to the names/objects used in the
    app being written
*/
public class BaseObjectAdapter extends ArrayAdapter<BaseObject> {
    /**
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context    The current context. Used to inflate the layout file.
     * @param BaseObject A List of BaseObjects objects to display in a list
     */
    // TODO Base Object must be refactorized to the object used in the app being written
    public BaseObjectAdapter(Activity context, ArrayList<BaseObject> BaseObject) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, BaseObject);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    // TODO the layout to be inflated is the detailed lsit the item list... the list that contains
    // TODO     the fields to be displayed
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        // Get the object located at this position in the list
        // TODO use a better name for the current object.
        BaseObject currentObject = getItem(position);

        //  Find the objects to display by ID
        // TODO use the names as defined in the actual screen
        TextView magnitud = (TextView) listItemView.findViewById(R.id.txt_magnitud);
        TextView location = (TextView) listItemView.findViewById(R.id.txt_location);
        TextView date = (TextView) listItemView.findViewById(R.id.txt_date);

        // TODO "fill" the values into each field in the item view
        magnitud.setText(currentObject.getParam1());
        location.setText(currentObject.getParam2());
        date.setText(currentObject.getParam3());

        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;

    } //    End of the @Overrido of Get View
    }
