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
public class NightlifeFragment extends Fragment {

    public NightlifeFragment() {
        // Required empty public constructor.
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of restaurant locations.
        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(
                R.string.nightlife_name_club_la_vela,
                R.string.nightlife_hours_club_la_vela,
                R.string.nightlife_phone_number_club_la_vela,
                R.drawable.nightlife_club_la_vela
        ));

        locations.add(new Location(
                R.string.nightlife_name_tootsies,
                R.string.nightlife_hours_tootsies,
                R.string.nightlife_phone_number_tootsies,
                R.drawable.nightlife_tootsies
        ));

        locations.add(new Location(
                R.string.nightlife_name_the_brass_tap,
                R.string.nightlife_hours_the_brass_tap,
                R.string.nightlife_phone_number_the_brass_tap,
                R.drawable.nightlife_the_brass_tap
        ));

        locations.add(new Location(
                R.string.nightlife_name_spinnaker,
                R.string.nightlife_hours_spinnaker,
                R.string.nightlife_phone_number_spinnaker,
                R.drawable.nightlife_spinnaker
        ));

        locations.add(new Location(
                R.string.nightlife_name_coyote_ugly,
                R.string.nightlife_hours_coyote_ugly,
                R.string.nightlife_phone_number_coyote_ugly,
                R.drawable.nightlife_coyote_ugly
        ));

        locations.add(new Location(
                R.string.nightlife_name_sharkys,
                R.string.nightlife_hours_sharkys,
                R.string.nightlife_phone_number_sharkys,
                R.drawable.nightlife_sharkys
        ));

        locations.add(new Location(
                R.string.nightlife_name_the_craft_bar,
                R.string.nightlife_hours_the_craft_bar,
                R.string.nightlife_phone_number_the_craft_bar,
                R.drawable.nightlife_the_craft_bar
        ));

        locations.add(new Location(
                R.string.nightlife_name_runaway_island,
                R.string.nightlife_hours_runaway_island,
                R.string.nightlife_phone_number_runaway_island,
                R.drawable.nightlife_runaway_island
        ));

        locations.add(new Location(
                R.string.nightlife_name_fishale,
                R.string.nightlife_hours_fishale,
                R.string.nightlife_phone_number_fishale,
                R.drawable.nightlife_fishale
        ));

        locations.add(new Location(
                R.string.nightlife_name_harpoon_harrys,
                R.string.nightlife_hours_harpoon_harrys,
                R.string.nightlife_phone_number_harpoon_harrys,
                R.drawable.nightlife_harpoon_harrys
        ));

        // Create a {@Link LocationAdapter}, whose data source is a list of {@Link Location}s.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_nightlife_color);

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
