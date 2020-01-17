package com.google.android.gms.iid;

import android.content.Intent;

/* renamed from: com.google.android.gms.iid.h */
final class C10232h implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ Intent f26839e;

    /* renamed from: f */
    private final /* synthetic */ Intent f26840f;

    /* renamed from: g */
    private final /* synthetic */ zze f26841g;

    C10232h(zze zze, Intent intent, Intent intent2) {
        this.f26841g = zze;
        this.f26839e = intent;
        this.f26840f = intent2;
    }

    public final void run() {
        this.f26841g.handleIntent(this.f26839e);
        this.f26841g.m25872a(this.f26840f);
    }
}
