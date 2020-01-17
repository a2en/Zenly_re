package com.android.volley;

public class VolleyError extends Exception {

    /* renamed from: e */
    public final C8715f f22427e;

    public VolleyError() {
        this.f22427e = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23563a(long j) {
    }

    public VolleyError(C8715f fVar) {
        this.f22427e = fVar;
    }

    public VolleyError(Throwable th) {
        super(th);
        this.f22427e = null;
    }
}
