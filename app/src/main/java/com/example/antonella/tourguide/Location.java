
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

/**
 * {@link Location} represents the model for the row information that we show to the user.
 * It contains resource ID for the image, the string name and the string description
 */

public class Location {

    private int mImageResourceId;
    private String mName;
    private String mDescription;


    Location(int imageResourceId, String name, String description) {
        mImageResourceId = imageResourceId;
        mName = name;
        mDescription = description;

    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }


}

