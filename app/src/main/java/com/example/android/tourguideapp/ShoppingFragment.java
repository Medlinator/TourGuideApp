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
public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor.
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of restaurant locations.
        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(
                R.string.shopping_name_ron_jon,
                R.string.shopping_hours_ron_jon,
                R.string.shopping_phone_number_ron_jon,
                R.drawable.shopping_ron_jon_surf_shop
        ));

        locations.add(new Location(
                R.string.shopping_name_shimmering_seas,
                R.string.shopping_hours_shimmering_seas,
                R.string.shopping_phone_number_shimmering_seas,
                R.drawable.shopping_shimmering_seas
        ));

        locations.add(new Location(
                R.string.shopping_name_sunglass_hut,
                R.string.shopping_hours_sunglass_hut,
                R.string.shopping_phone_number_sunglass_hut,
                R.drawable.shopping_sunglass_hut
        ));

        locations.add(new Location(
                R.string.shopping_name_bath_and_body_works,
                R.string.shopping_hours_bath_and_body_works,
                R.string.nightlife_phone_number_the_craft_bar,
                R.drawable.shopping_bath_and_body_works
        ));

        locations.add(new Location(
                R.string.shopping_name_american_eagle,
                R.string.shopping_hours_american_eagle,
                R.string.shopping_phone_number_american_eagle,
                R.drawable.shopping_american_eagle
        ));

        locations.add(new Location(
                R.string.shopping_name_toy_kingdom,
                R.string.shopping_hours_toy_kingdom,
                R.string.nightlife_phone_number_tootsies,
                R.drawable.shopping_toy_kingdom
        ));

        locations.add(new Location(
                R.string.shopping_name_tillys,
                R.string.shopping_hours_tillys,
                R.string.shopping_phone_number_tillys,
                R.drawable.shopping_tillys
        ));

        locations.add(new Location(
                R.string.shopping_name_target,
                R.string.shopping_hours_target,
                R.string.shopping_phone_number_target,
                R.drawable.shopping_target
        ));

        locations.add(new Location(
                R.string.shopping_name_nike,
                R.string.shopping_hours_nike,
                R.string.shopping_phone_number_nike,
                R.drawable.shopping_nike
        ));

        locations.add(new Location(
                R.string.shopping_name_old_navy,
                R.string.shopping_hours_old_navy,
                R.string.shopping_phone_number_old_navy,
                R.drawable.shopping_old_navy
        ));

        // Create a {@Link LocationAdapter}, whose data source is a list of {@Link Location}s.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_shopping_color);

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
