package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.SettingsApi;

/* renamed from: com.google.android.gms.internal.location.d0 */
public final class C10491d0 implements SettingsApi {
    public final PendingResult<LocationSettingsResult> checkLocationSettings(GoogleApiClient googleApiClient, LocationSettingsRequest locationSettingsRequest) {
        return googleApiClient.mo27044a(new C10493e0(this, googleApiClient, locationSettingsRequest, null));
    }
}
