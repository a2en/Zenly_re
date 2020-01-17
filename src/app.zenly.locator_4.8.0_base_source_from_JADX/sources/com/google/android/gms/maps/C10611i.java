package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener;
import com.google.android.gms.maps.internal.C10628q;

/* renamed from: com.google.android.gms.maps.i */
final class C10611i extends C10628q {

    /* renamed from: a */
    private final /* synthetic */ OnCameraMoveCanceledListener f27607a;

    C10611i(GoogleMap googleMap, OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        this.f27607a = onCameraMoveCanceledListener;
    }

    public final void onCameraMoveCanceled() {
        this.f27607a.onCameraMoveCanceled();
    }
}
