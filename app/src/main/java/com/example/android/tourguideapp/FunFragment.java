package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of restaurants.
 */
public class FunFragment extends Fragment {

    public FunFragment() {
        // Required empty public constructor.
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of restaurant locations.
        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(
                R.string.fun_name_xd_dark_ride_experience,
                R.string.fun_hours_xd_dark_ride_experience,
                R.string.fun_phone_number_xd_dark_ride_experience,
                R.drawable.fun_xd_dark_ride_experience
        ));

        locations.add(new Location(
                R.string.fun_name_coconut_creek,
                R.string.fun_hours_coconut_creek,
                R.string.fun_phone_number_coconut_creek,
                R.drawable.fun_coconut_creek
        ));

        locations.add(new Location(
                R.string.fun_name_dave_and_busters,
                R.string.fun_hours_dave_and_busters,
                R.string.fun_phone_number_dave_and_busters,
                R.drawable.fun_dave_and_busters
        ));

        locations.add(new Location(
                R.string.fun_name_ripleys,
                R.string.fun_hours_ripleys,
                R.string.fun_phone_number_ripleys,
                R.drawable.fun_ripleys
        ));

        locations.add(new Location(
                R.string.fun_name_mirror_maze,
                R.string.fun_hours_mirror_maze,
                R.string.fun_phone_number_mirror_maze,
                R.drawable.fun_mirror_maze
        ));

        locations.add(new Location(
                R.string.fun_name_the_grand,
                R.string.fun_hours_the_grand,
                R.string.fun_phone_number_the_grand,
                R.drawable.fun_the_grand
        ));

        locations.add(new Location(
                R.string.fun_name_race_city,
                R.string.fun_hours_race_city,
                R.string.fun_phone_number_race_city,
                R.drawable.fun_race_city
        ));

        locations.add(new Location(
                R.string.fun_name_wonderworks,
                R.string.fun_hours_wonderworks,
                R.string.fun_phone_number_wonderworks,
                R.drawable.fun_wonder_works
        ));

        locations.add(new Location(
                R.string.fun_name_slingshot,
                R.string.fun_hours_slingshot,
                R.string.fun_phone_number_slingshot,
                R.drawable.fun_slingshot
        ));

        locations.add(new Location(
                R.string.fun_name_zoo_world,
                R.string.fun_hours_zoo_world,
                R.string.fun_phone_number_zoo_world,
                R.drawable.fun_zoo_world
        ));

        // Create a {@Link LocationAdapter}, whose data source is a list of {@Link Location}s.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_fun_color);

        // Find the {@Link ListView} object in the view hierarchy of the {@Link Activity}.
        // There should be a {@Link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@Link ListView} use the {@Link LocationAdapter} we created above, so that the
        // {@Link ListView} will display list items for each {@Link Location} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
