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
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/*
  Created by Antonella on 25-04-18 on Udacity ABND Miwok app example .
 */

/*
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each location list item based on a data source which is a list of {@link Location} objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * create mCategory as array of string to contain the tab name of the app
     */
    private String[] mCategory;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param fm      is the fragment manager that will keep each fragment's
     *                state in the adapter across category swipes.
     * @param context is the context of the app
     */

    CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        mCategory = context.getResources().getStringArray(R.array.category);
    }

    /**
     * Return the {@link Fragment} that should be displayed for the
     * name category at given position.
     */
    @Override
    public Fragment getItem(int position) {
        return LocationFragment.newInstance(mCategory[position]);
    }

    /**
     * Return the total number of pages as result of array lenght.
     */
    @Override
    public int getCount() {
        return mCategory.length;
    }

    /**
     * Return the page title at given position in category array.
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return mCategory[position];
    }

}
