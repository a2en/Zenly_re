package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener;

/* renamed from: com.google.android.gms.common.api.internal.r */
final class C10048r implements BackgroundStateChangeListener {

    /* renamed from: a */
    private final /* synthetic */ C10016d f26416a;

    C10048r(C10016d dVar) {
        this.f26416a = dVar;
    }

    public final void onBackgroundStateChanged(boolean z) {
        this.f26416a.f26355m.sendMessage(this.f26416a.f26355m.obtainMessage(1, Boolean.valueOf(z)));
    }
}
