package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap.OnCameraIdleListener;
import com.google.android.gms.maps.internal.C10627p;

/* renamed from: com.google.android.gms.maps.j */
final class C10630j extends C10627p {

    /* renamed from: a */
    private final /* synthetic */ OnCameraIdleListener f27611a;

    C10630j(GoogleMap googleMap, OnCameraIdleListener onCameraIdleListener) {
        this.f27611a = onCameraIdleListener;
    }

    public final void onCameraIdle() {
        this.f27611a.onCameraIdle();
    }
}
