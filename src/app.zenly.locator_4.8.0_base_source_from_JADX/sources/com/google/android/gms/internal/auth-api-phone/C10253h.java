package com.google.android.gms.internal.auth-api-phone;

import android.app.Activity;
import com.google.android.gms.auth.api.phone.C9974b;
import com.google.android.gms.common.api.internal.C10029i;
import com.google.android.gms.common.api.internal.C10029i.C10030a;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10694d;

/* renamed from: com.google.android.gms.internal.auth-api-phone.h */
public final class C10253h extends C9974b {
    public C10253h(Activity activity) {
        super(activity);
    }

    public final C10693c<Void> startSmsRetriever() {
        return mo27079b((C10029i<A, TResult>) new C10255j<A,TResult>(this));
    }

    public final C10693c<Void> startSmsUserConsent(String str) {
        C10030a c = C10029i.m25210c();
        c.mo27209a((RemoteCall<A, C10694d<ResultT>>) new C10256k<A,C10694d<ResultT>>(this, str));
        c.mo27210a(C10247b.f26865b);
        return mo27079b(c.mo27211a());
    }
}
