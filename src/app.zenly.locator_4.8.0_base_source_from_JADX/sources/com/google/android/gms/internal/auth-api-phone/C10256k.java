package com.google.android.gms.internal.auth-api-phone;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.C10694d;

/* renamed from: com.google.android.gms.internal.auth-api-phone.k */
final /* synthetic */ class C10256k implements RemoteCall {

    /* renamed from: a */
    private final C10253h f26870a;

    /* renamed from: b */
    private final String f26871b;

    C10256k(C10253h hVar, String str) {
        this.f26870a = hVar;
        this.f26871b = str;
    }

    public final void accept(Object obj, Object obj2) {
        C10253h hVar = this.f26870a;
        ((zzj) ((C10254i) obj).mo27380i()).zza(this.f26871b, (zzl) new C10257l(hVar, (C10694d) obj2));
    }
}
