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

import java.util.ArrayList;
import java.util.List;

/**
 * {@link LocationByCategory} creates ArrayList location for each category
 */
public class LocationByCategory {

    // control the name of the category and call the corresponding Location list creator
    public static List<Location> getLocation(Context context, String category) {
        if (category.equals(context.getString(R.string.art))) {
            return getArtLocation(context);
        } else if (category.equals(context.getString(R.string.hotels))) {
            return getHotelsLocation(context);
        } else if (category.equals(context.getString(R.string.food))) {
            return getFoodLocation(context);
        } else if (category.equals(context.getString(R.string.events))) {
            return getEventsLocation(context);
        }
        return new ArrayList<>();
    }

    // create array list of Art locations
    private static ArrayList<Location> getArtLocation(Context context) {
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.caravaggio, context.getString
                (R.string.caravaggio), context.getString(R.string.caravaggio_museo)));
        locations.add(new Location(R.drawable.catalani, context.getString
                (R.string.catalani), context.getString(R.string.catalani_church)));
        locations.add(new Location(R.drawable.cristo_re, context.getString
                (R.string.cristo), context.getString(R.string.cristore)));
        locations.add(new Location(R.drawable.nettuno, context.getString
                (R.string.nettuno), context.getString(R.string.nettuno_statue)));
        locations.add(new Location(R.drawable.taormina, context.getString
                (R.string.taormina), context.getString(R.string.taormina_theatre)));
        return locations;
    }

    // create array list of Hotels and B&B  locations
    private static ArrayList<Location> getHotelsLocation(Context context) {
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.sandomenicohotel, context.getString
                (R.string.sandomenico), context.getString(R.string.sandomenico_desc)));
        locations.add(new Location(R.drawable.capopelorohotel, context.getString
                (R.string.capopeloro), context.getString(R.string.capopeloro_desc)));
        locations.add(new Location(R.drawable.bordonarohotel, context.getString
                (R.string.bordonaro), context.getString(R.string.bordonaro_desc)));
        locations.add(new Location(R.drawable.brigahotel, context.getString
                (R.string.briga), context.getString(R.string.briga_desc)));
        return locations;
    }

    // create array list of Food and restaurants locations
    private static ArrayList<Location> getFoodLocation(Context context) {
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.cannoli, context.getString
                (R.string.cannoli), context.getString(R.string.cannoli_desc)));
        locations.add(new Location(R.drawable.ocuntre, context.getString
                (R.string.ocuntre), context.getString(R.string.ocuntre_desc)));
        locations.add(new Location(R.drawable.orso, context.getString
                (R.string.orso), context.getString(R.string.orso_desc)));
        locations.add(new Location(R.drawable.spaghetti, context.getString
                (R.string.spaghetti), context.getString(R.string.spaghetti_desc)));
        return locations;
    }

    // create array list of Events locations
    private static ArrayList<Location> getEventsLocation(Context context) {
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.campanile, context.getString
                (R.string.bell), context.getString(R.string.bell_show)));
        locations.add(new Location(R.drawable.aquiloni, context.getString
                (R.string.kites), context.getString(R.string.kites_fest)));
        locations.add(new Location(R.drawable.techday, context.getString
                (R.string.tech), context.getString(R.string.tech_day)));
        locations.add(new Location(R.drawable.vara, context.getString
                (R.string.vara), context.getString(R.string.vara_fest)));
        return locations;
    }

}