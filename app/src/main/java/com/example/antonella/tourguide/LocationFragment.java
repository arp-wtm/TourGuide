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

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link Fragment} that displays a list of location according the category name
 */
public class LocationFragment extends Fragment {

    private static final String CATEGORY = "CATEGORY";

    /**
     * Create a new instance of LocationFragment, initialized to
     * show the text at 'category'.
     */
    public static LocationFragment newInstance(String category) {
        // Supply category input as an argument
        Bundle args = new Bundle();
        args.putString(CATEGORY, category);
        LocationFragment locationFragment = new LocationFragment();
        locationFragment.setArguments(args);
        return locationFragment;
    }

    // creates and returns the location list associated with the fragment.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.location_list, container, false);

    }

    // decide which fragment you populate
    @Override
    public void onViewCreated(View rootView, Bundle savedInstanceState) {
        super.onViewCreated(rootView, savedInstanceState);

        // Get the list of locations for the selected category using the LocationByCategory getLocation() method.
        List<Location> locations = LocationByCategory.getLocation(getActivity(), getArguments().getString(CATEGORY));

        // Find a reference of the ListView and set it up with the LocationAdapter.
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(new LocationAdapter(getActivity(), (ArrayList<Location>) locations, R.color.colorPrimaryDark));
    }
}


