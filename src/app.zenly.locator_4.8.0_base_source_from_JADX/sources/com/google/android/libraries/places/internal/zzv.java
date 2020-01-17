package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.gms.tasks.C10693c;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;

public interface zzv {
    C10693c<FetchPhotoResponse> zza(FetchPhotoRequest fetchPhotoRequest);

    C10693c<FetchPlaceResponse> zza(FetchPlaceRequest fetchPlaceRequest);

    C10693c<FindAutocompletePredictionsResponse> zza(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest);

    C10693c<FindCurrentPlaceResponse> zza(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location, zzgv<zzq> zzgv);
}
