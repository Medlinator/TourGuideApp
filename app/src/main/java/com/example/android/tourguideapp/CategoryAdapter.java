package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for each
 * {@link Location} list item.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app.
     */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app.
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter across
     *                swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * @param position is the position of the category screen.
     * @return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DiningFragment();
        } else if (position == 1) {
            return new ShoppingFragment();
        } else if (position == 2) {
            return new NightlifeFragment();
        } else {
            return new FunFragment();
        }
    }

    /**
     * @return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    /**
     * @param position is the position of the category screen.
     * @return the title of the requested position.
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.dining_page_title);
        } else if (position == 1) {
            return mContext.getString(R.string.shopping_page_title);
        } else if (position == 2) {
            return mContext.getString(R.string.nightlife_page_title);
        } else {
            return mContext.getString(R.string.fun_page_title);
        }
    }
}