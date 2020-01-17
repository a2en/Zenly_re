package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.Continuation;
import java.io.IOException;

/* renamed from: com.google.firebase.iid.t0 */
final class C11088t0 implements Continuation<Bundle, String> {

    /* renamed from: a */
    private final /* synthetic */ C11080p0 f28759a;

    C11088t0(C11080p0 p0Var) {
        this.f28759a = p0Var;
    }

    public final /* synthetic */ Object then(C10693c cVar) throws Exception {
        return C11080p0.m28518a((Bundle) cVar.mo29310a(IOException.class));
    }
}
