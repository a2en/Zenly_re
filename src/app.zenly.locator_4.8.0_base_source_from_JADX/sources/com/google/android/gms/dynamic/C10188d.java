package com.google.android.gms.dynamic;

import android.os.Bundle;

/* renamed from: com.google.android.gms.dynamic.d */
final class C10188d implements C10185a {

    /* renamed from: a */
    private final /* synthetic */ Bundle f26745a;

    /* renamed from: b */
    private final /* synthetic */ C10184a f26746b;

    C10188d(C10184a aVar, Bundle bundle) {
        this.f26746b = aVar;
        this.f26745a = bundle;
    }

    /* renamed from: a */
    public final void mo27649a(LifecycleDelegate lifecycleDelegate) {
        this.f26746b.f26739a.onCreate(this.f26745a);
    }

    public final int getState() {
        return 1;
    }
}
