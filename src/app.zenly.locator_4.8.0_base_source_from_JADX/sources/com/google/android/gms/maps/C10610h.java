package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap.OnCameraMoveListener;
import com.google.android.gms.maps.internal.C10629r;

/* renamed from: com.google.android.gms.maps.h */
final class C10610h extends C10629r {

    /* renamed from: a */
    private final /* synthetic */ OnCameraMoveListener f27606a;

    C10610h(GoogleMap googleMap, OnCameraMoveListener onCameraMoveListener) {
        this.f27606a = onCameraMoveListener;
    }

    public final void onCameraMove() {
        this.f27606a.onCameraMove();
    }
}
