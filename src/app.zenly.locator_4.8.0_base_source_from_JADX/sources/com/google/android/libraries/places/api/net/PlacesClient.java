package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.C10693c;

public interface PlacesClient {
    C10693c<FetchPhotoResponse> fetchPhoto(FetchPhotoRequest fetchPhotoRequest);

    C10693c<FetchPlaceResponse> fetchPlace(FetchPlaceRequest fetchPlaceRequest);

    C10693c<FindAutocompletePredictionsResponse> findAutocompletePredictions(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest);

    C10693c<FindCurrentPlaceResponse> findCurrentPlace(FindCurrentPlaceRequest findCurrentPlaceRequest);
}
