package com.google.firebase.iid;

import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.Continuation;

/* renamed from: com.google.firebase.iid.m0 */
final /* synthetic */ class C11074m0 implements Continuation {

    /* renamed from: a */
    private final FirebaseInstanceId f28729a;

    /* renamed from: b */
    private final String f28730b;

    /* renamed from: c */
    private final String f28731c;

    C11074m0(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.f28729a = firebaseInstanceId;
        this.f28730b = str;
        this.f28731c = str2;
    }

    public final Object then(C10693c cVar) {
        return this.f28729a.zza(this.f28730b, this.f28731c, cVar);
    }
}
