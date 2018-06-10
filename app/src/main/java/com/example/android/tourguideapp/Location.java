package com.example.android.tourguideapp;

/**
 * {@link Location} represents a location that the user wants information about.
 * It contains resource IDs for the location's name, hours, phone number, and image file.
 */
public class Location {

    /**
     * String resource ID for the name of the location.
     */
    private int mNameId;

    /**
     * String resource ID for the hours of the location.
     */
    private int mHoursId;

    /**
     * String resource ID for the phone number of the location.
     */
    private int mPhoneNumberId;

    /**
     * Image resource ID for the location
     */
    private int mImageResouceId;

    /**
     * Constructor to create a new Location object
     *
     * @param nameId          is the string resource ID for the location's name.
     * @param hoursId         is the string resource ID for the location's hours of operation.
     * @param phoneNumberId   is the string resource ID for the location's phone number.
     * @param imageResourceId is the drawable resource ID for the image associated with the
     *                        location.
     */
    public Location(int nameId, int hoursId, int phoneNumberId, int imageResourceId) {
        mNameId = nameId;
        mHoursId = hoursId;
        mPhoneNumberId = phoneNumberId;
        mImageResouceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the name of the location.
     */
    public int getNameId() {
        return mNameId;
    }

    /**
     * Get the string resource ID for the location's hours of operation.
     */
    public int getHoursId() {
        return mHoursId;
    }

    /**
     * Get the string resource ID for the location's phone number.
     */
    public int getPhoneNumberId() {
        return mPhoneNumberId;
    }

    /**
     * Get the image resource ID for the image associated with the location.
     */
    public int getImageResouceId() {
        return mImageResouceId;
    }
}
