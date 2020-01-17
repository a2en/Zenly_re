package com.crashlytics.android.answers;

import android.app.Activity;
import android.os.Bundle;
import p389io.fabric.sdk.android.C12149a.C12152b;

/* renamed from: com.crashlytics.android.answers.h */
class C9275h extends C12152b {

    /* renamed from: a */
    private final C9298z f24102a;

    /* renamed from: b */
    private final BackgroundManager f24103b;

    public C9275h(C9298z zVar, BackgroundManager backgroundManager) {
        this.f24102a = zVar;
        this.f24103b = backgroundManager;
    }

    /* renamed from: a */
    public void mo24999a(Activity activity) {
    }

    /* renamed from: a */
    public void mo25000a(Activity activity, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo25001b(Activity activity) {
        this.f24102a.mo25035a(activity, C9260c.PAUSE);
        this.f24103b.mo24946a();
    }

    /* renamed from: b */
    public void mo25002b(Activity activity, Bundle bundle) {
    }

    /* renamed from: c */
    public void mo25003c(Activity activity) {
        this.f24102a.mo25035a(activity, C9260c.RESUME);
        this.f24103b.mo24949b();
    }

    /* renamed from: d */
    public void mo25004d(Activity activity) {
        this.f24102a.mo25035a(activity, C9260c.START);
    }

    /* renamed from: e */
    public void mo25005e(Activity activity) {
        this.f24102a.mo25035a(activity, C9260c.STOP);
    }
}
