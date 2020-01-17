package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10694d;
import com.google.android.gms.tasks.OnCompleteListener;

/* renamed from: com.google.android.gms.common.api.internal.l */
final class C10036l implements OnCompleteListener<TResult> {

    /* renamed from: a */
    private final /* synthetic */ C10694d f26400a;

    /* renamed from: b */
    private final /* synthetic */ C10061x0 f26401b;

    C10036l(C10061x0 x0Var, C10694d dVar) {
        this.f26401b = x0Var;
        this.f26400a = dVar;
    }

    public final void onComplete(C10693c<TResult> cVar) {
        this.f26401b.f26440b.remove(this.f26400a);
    }
}
