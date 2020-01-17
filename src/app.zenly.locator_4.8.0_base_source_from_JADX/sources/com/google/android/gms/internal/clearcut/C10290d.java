package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.clearcut.d */
final class C10290d extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ C10283c f26948a;

    C10290d(C10283c cVar, Handler handler) {
        this.f26948a = cVar;
        super(null);
    }

    public final void onChange(boolean z) {
        this.f26948a.mo27842b();
        this.f26948a.m25986d();
    }
}
