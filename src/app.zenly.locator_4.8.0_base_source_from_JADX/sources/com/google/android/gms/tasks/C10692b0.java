package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.tasks.b0 */
final class C10692b0 implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ C10690a0 f27788e;

    /* renamed from: f */
    private final /* synthetic */ Callable f27789f;

    C10692b0(C10690a0 a0Var, Callable callable) {
        this.f27788e = a0Var;
        this.f27789f = callable;
    }

    public final void run() {
        try {
            this.f27788e.mo29312a(this.f27789f.call());
        } catch (Exception e) {
            this.f27788e.mo29311a(e);
        }
    }
}
