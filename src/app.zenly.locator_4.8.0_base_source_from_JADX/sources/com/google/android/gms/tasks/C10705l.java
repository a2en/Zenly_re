package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.l */
final class C10705l implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ C10693c f27805e;

    /* renamed from: f */
    private final /* synthetic */ C10704k f27806f;

    C10705l(C10704k kVar, C10693c cVar) {
        this.f27806f = kVar;
        this.f27805e = cVar;
    }

    public final void run() {
        try {
            C10693c cVar = (C10693c) this.f27806f.f27803b.then(this.f27805e);
            if (cVar == null) {
                this.f27806f.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            cVar.mo29307a(C10695e.f27792b, (OnSuccessListener<? super TResult>) this.f27806f);
            cVar.mo29306a(C10695e.f27792b, (OnFailureListener) this.f27806f);
            cVar.mo29304a(C10695e.f27792b, (OnCanceledListener) this.f27806f);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f27806f.f27804c.mo29311a((Exception) e.getCause());
            } else {
                this.f27806f.f27804c.mo29311a((Exception) e);
            }
        } catch (Exception e2) {
            this.f27806f.f27804c.mo29311a(e2);
        }
    }
}
