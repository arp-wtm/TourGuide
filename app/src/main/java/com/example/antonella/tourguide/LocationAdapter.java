/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *Created by Antonella on 25-04-18 on Udacity ABND Miwok app example .
 */
package com.example.antonella.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link LocationAdapter} is an {@link ArrayAdapter} that can provide
 * the layout for each list item based on a data source,
 * which is a list of {@link Location} objects.
 */
public class LocationAdapter extends ArrayAdapter<Location> {

    // Resource ID for the background color for this list of locations */
    private int mColorResourceId;

    /**
     * Create a new {@link LocationAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param locations       is the list of {@link Location}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of locations
     */
    LocationAdapter(Context context, ArrayList<Location> locations, int colorResourceId) {
        super(context, 0, locations);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_list_item, parent, false);
        }

        // Get the {@link Location} object located at this position in the list of locations
        Location currentLocation = getItem(position);

        // Find the TextView in the location_list_item.xml layout with the ID location_name_text_view.
        TextView locationNameTextView = listItemView.findViewById(R.id.location_name_text_view);

        // Get the name from the currentLocation object and set this text on the location name TextView.
        if (currentLocation != null) {
            locationNameTextView.setText(currentLocation.getName());
        }

        // Find the TextView in the list_item.xml layout with the ID location_description_text_view.
        TextView locationDescriptionTextView = listItemView.findViewById(R.id.location_description_text_view);

        // Get the description from the currentLocation object and set this text on the location decsription TextView
        if (currentLocation != null) {
            locationDescriptionTextView.setText(currentLocation.getDescription());
        }

        // Find the ImageView in the location_list_item.xml layout with the ID location_image.
        ImageView locationImageView = listItemView.findViewById(R.id.location_image);

        if (currentLocation != null) {
            locationImageView.setImageResource(currentLocation.getImageResourceId());
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 1 image and 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}