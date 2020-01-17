package com.google.firebase.iid;

import android.content.Intent;

/* renamed from: com.google.firebase.iid.a0 */
final class C11050a0 implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ Intent f28671e;

    /* renamed from: f */
    private final /* synthetic */ Intent f28672f;

    /* renamed from: g */
    private final /* synthetic */ zzc f28673g;

    C11050a0(zzc zzc, Intent intent, Intent intent2) {
        this.f28673g = zzc;
        this.f28671e = intent;
        this.f28672f = intent2;
    }

    public final void run() {
        this.f28673g.zzd(this.f28671e);
        this.f28673g.zza(this.f28672f);
    }
}
