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
public class DiningFragment extends Fragment {

    public DiningFragment() {
        // Required empty public constructor.
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of restaurant locations.
        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(
                R.string.dining_name_dicks,
                R.string.dining_hours_dicks,
                R.string.dining_phone_number_dicks,
                R.drawable.dining_dicks
        ));

        locations.add(new Location(
                R.string.dining_name_dickeys,
                R.string.dining_hours_dickeys,
                R.string.dining_phone_number_dickeys,
                R.drawable.dining_dickeys
        ));

        locations.add(new Location(
                R.string.dining_name_hofbrau,
                R.string.dining_hours_hofbrau,
                R.string.dining_phone_number_hofbrau,
                R.drawable.dining_hofbrau
        ));

        locations.add(new Location(
                R.string.dining_name_margaritaville,
                R.string.dining_hours_margaritaville,
                R.string.dining_phone_number_margaritaville,
                R.drawable.dining_margaritaville
        ));

        locations.add(new Location(
                R.string.dining_name_nathans_famous,
                R.string.dining_hours_nathans_famous,
                R.string.dining_phone_number_nathans_famous,
                R.drawable.dining_nathans_famous
        ));

        locations.add(new Location(
                R.string.dining_name_pompano_joes,
                R.string.dining_hours_pompano_joes,
                R.string.dining_phone_number_pompano_joes,
                R.drawable.dining_pompano_joes
        ));

        locations.add(new Location(
                R.string.dining_name_red_robin,
                R.string.dining_hours_red_robin,
                R.string.dining_phone_number_red_robin,
                R.drawable.dining_red_robin
        ));

        locations.add(new Location(
                R.string.dining_name_auntie_annes,
                R.string.dining_hours_auntie_annes,
                R.string.dining_phone_number_auntie_annes,
                R.drawable.dining_auntie_annes
        ));

        locations.add(new Location(
                R.string.dining_name_hana_japan,
                R.string.dining_hours_hana_japan,
                R.string.dining_phone_number_hana_japan,
                R.drawable.dining_hana_japan
        ));

        locations.add(new Location(
                R.string.dining_name_pineapple_willys,
                R.string.dining_hours_pineapple_willys,
                R.string.dining_phone_number_pineapple_willys,
                R.drawable.dining_pineapple_willys
        ));

        // Create a {@Link LocationAdapter}, whose data source is a list of {@Link Location}s.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_dining_color);

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
