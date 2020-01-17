package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.C10693c;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;

public interface zzcp {
    void zza(C10693c<FindAutocompletePredictionsResponse> cVar, long j, long j2);

    void zza(FetchPhotoRequest fetchPhotoRequest);

    void zza(FetchPlaceRequest fetchPlaceRequest);

    void zza(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest);

    void zza(FindCurrentPlaceRequest findCurrentPlaceRequest, C10693c<FindCurrentPlaceResponse> cVar, long j, long j2);

    void zzb(C10693c<FetchPlaceResponse> cVar, long j, long j2);

    void zzc(C10693c<FindCurrentPlaceResponse> cVar, long j, long j2);

    void zzd(C10693c<FetchPhotoResponse> cVar, long j, long j2);
}
