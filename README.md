# TourGuide
Tour Guide Udacity ABND project 5
# description
This app shows four list of relevant attractions for tourists:<br>
ART, HOTELS, FOOD and EVENTS.<br>
Each row has an image, a name and a description of location<br>
You can tab on each category or swipe left-right to change list.<br>
Each list can be scrolled up-down also.
# model 
Location is a custom class used to model the row information that we show to the user.<br>
It contains resource ID for the image, the string name and the string description.<br>
#adapters
 . LocationAdapter is an ArrayAdapter that  provides the layout for each list item <br>
 based on a list of Location objects<br>
 . CategoryAdapter is a FragmentPagerAdapter that provides the layout for <br>
  each location list tab, based on a data source which is a list of Category names.
 # fragment
 LocationFragment displays a list of location according the category name.<br>
 only one is used because we have four equals structures.
 # stored information
 LocationByCategory creates ArrayList location for each category <br>
 and stores image, name and description for each location
 # main activity
 On create, set the content of the activity to use the activity_main.xml layout file. <br>
 Find the view pager that will allow the user to swipe between fragments.<br>
 Create an adapter, using CategoryAdapter, to know which category should be shown on each<br>
 page and set the it onto the view pager.<br>
 It also connects the tab layout with the view pager.<br>
 This will: <br>
        1. Update the tab layout when the view pager is swiped<br>
        2. Update the view pager when a tab is selected<br>
        3. Set the tab layout's tab names with the view pager's adapter's title by calling onPageTitle()<br>
 # layouts
 . activity_main<br>
 Linear Layout with TabLayout and ViewPager<br>
 . location_list<br>
 ListView<br>
 . location_list_item<br>
 Relative layout with an ImageView and a nested RelativeLayout with two TextView inside it<br>
#Test

The code runs without errors on my phone Android 7.0 Api <br>
 Gradle dependencies<br> 
 {
    implementation fileTree(dir: 'libs', include: ['*.jar'])<br>
    implementation 'com.android.support:appcompat-v7:27.1.1'<br>
    implementation 'com.android.support.constraint:constraint-layout:1.1.0'<br>
    implementation 'com.android.support:support-v4:27.1.1'<br>
    implementation 'com.android.support:design:27.1.1'<br>
    testImplementation 'junit:junit:4.12'<br>
    androidTestImplementation 'com.android.support.test:runner:1.0.1'<br>
    androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.1'<br>
}

# Licence

Copyright 2017 The Android Open Source Project 

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0 

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

