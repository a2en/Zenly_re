package com.google.firebase.iid;

import android.util.Pair;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.Continuation;

/* renamed from: com.google.firebase.iid.q */
final /* synthetic */ class C11081q implements Continuation {

    /* renamed from: a */
    private final C11083r f28744a;

    /* renamed from: b */
    private final Pair f28745b;

    C11081q(C11083r rVar, Pair pair) {
        this.f28744a = rVar;
        this.f28745b = pair;
    }

    public final Object then(C10693c cVar) {
        this.f28744a.mo32306a(this.f28745b, cVar);
        return cVar;
    }
}
