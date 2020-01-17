package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.j */
final class C10703j implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ C10693c f27800e;

    /* renamed from: f */
    private final /* synthetic */ C10702i f27801f;

    C10703j(C10702i iVar, C10693c cVar) {
        this.f27801f = iVar;
        this.f27800e = cVar;
    }

    public final void run() {
        if (this.f27800e.mo29318c()) {
            this.f27801f.f27799c.mo29321f();
            return;
        }
        try {
            this.f27801f.f27799c.mo29312a(this.f27801f.f27798b.then(this.f27800e));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f27801f.f27799c.mo29311a((Exception) e.getCause());
            } else {
                this.f27801f.f27799c.mo29311a((Exception) e);
            }
        } catch (Exception e2) {
            this.f27801f.f27799c.mo29311a(e2);
        }
    }
}
