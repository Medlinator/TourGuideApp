package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link LocationAdapter} is an {@link ArrayAdapter} that provides the layout for each list item.
 */
public class LocationAdapter extends ArrayAdapter<Location> {

    /**
     * Resource ID of the background color for this list of locations.
     */
    private int mColorResourceId;

    /**
     * Create a new {@link LocationAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is created in.
     * @param locations       is the list of {@link Location}s to be displayed.
     * @param colorResourceId is the resource ID for the list background color.
     */
    public LocationAdapter(Context context, ArrayList<Location> locations, int colorResourceId) {
        super(context, 0, locations);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list.
        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_text_view.
        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
        // Get the name from the currentLocation object and set this text on the nameTextView.
        nameTextView.setText(currentLocation.getNameId());

        // Find the TextView in the list_item.xml layout with the ID phone_number_text_view.
        TextView numberTextView = listItemView.findViewById(R.id.phone_number_text_view);
        // Get the number from the currentLocation object and set this text on the numberTextView.
        numberTextView.setText(currentLocation.getPhoneNumberId());

        // Find the TextView in the list_item.xml layout with the ID hours_text_view.
        TextView hoursTextView = listItemView.findViewById(R.id.hours_text_view);
        // Get the hours from the currentLocation object and set this text on the hoursTextView.
        hoursTextView.setText(currentLocation.getHoursId());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = listItemView.findViewById(R.id.image);
        // Get the image from the currentLocation object and set this image on the imageView.
        imageView.setImageResource(currentLocation.getImageResouceId());

        // Set the theme color for the list item.
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to.
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View.
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout so that it can be shown in the ListView.
        return listItemView;
    }
}
