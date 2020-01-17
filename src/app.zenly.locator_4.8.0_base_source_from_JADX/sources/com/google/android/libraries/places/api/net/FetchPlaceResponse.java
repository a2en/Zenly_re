package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;

public abstract class FetchPlaceResponse {
    public static FetchPlaceResponse newInstance(Place place) {
        return new zzi(place);
    }

    public abstract Place getPlace();
}
