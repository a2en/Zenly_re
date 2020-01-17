package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C10016d.C10017a;
import com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks;

/* renamed from: com.google.android.gms.common.api.internal.w */
final class C10058w implements SignOutCallbacks {

    /* renamed from: a */
    final /* synthetic */ C10017a f26437a;

    C10058w(C10017a aVar) {
        this.f26437a = aVar;
    }

    public final void onSignOutComplete() {
        C10016d.this.f26355m.post(new C10056v(this));
    }
}
