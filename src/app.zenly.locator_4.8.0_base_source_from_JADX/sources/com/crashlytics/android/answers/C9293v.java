package com.crashlytics.android.answers;

import p389io.fabric.sdk.android.services.concurrency.internal.C12226c;

/* renamed from: com.crashlytics.android.answers.v */
class C9293v {

    /* renamed from: a */
    long f24139a;

    /* renamed from: b */
    private C12226c f24140b;

    public C9293v(C12226c cVar) {
        if (cVar != null) {
            this.f24140b = cVar;
            return;
        }
        throw new NullPointerException("retryState must not be null");
    }

    /* renamed from: a */
    public boolean mo25027a(long j) {
        return j - this.f24139a >= this.f24140b.mo36154a() * 1000000;
    }

    /* renamed from: b */
    public void mo25028b(long j) {
        this.f24139a = j;
        this.f24140b = this.f24140b.mo36156c();
    }

    /* renamed from: a */
    public void mo25026a() {
        this.f24139a = 0;
        this.f24140b = this.f24140b.mo36155b();
    }
}
