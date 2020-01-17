package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.gms.tasks.v */
final class C10715v implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ C10693c f27829e;

    /* renamed from: f */
    private final /* synthetic */ C10714u f27830f;

    C10715v(C10714u uVar, C10693c cVar) {
        this.f27830f = uVar;
        this.f27829e = cVar;
    }

    public final void run() {
        try {
            C10693c then = this.f27830f.f27827b.then(this.f27829e.mo29315b());
            if (then == null) {
                this.f27830f.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            then.mo29307a(C10695e.f27792b, (OnSuccessListener<? super TResult>) this.f27830f);
            then.mo29306a(C10695e.f27792b, (OnFailureListener) this.f27830f);
            then.mo29304a(C10695e.f27792b, (OnCanceledListener) this.f27830f);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f27830f.onFailure((Exception) e.getCause());
            } else {
                this.f27830f.onFailure(e);
            }
        } catch (CancellationException unused) {
            this.f27830f.onCanceled();
        } catch (Exception e2) {
            this.f27830f.onFailure(e2);
        }
    }
}
