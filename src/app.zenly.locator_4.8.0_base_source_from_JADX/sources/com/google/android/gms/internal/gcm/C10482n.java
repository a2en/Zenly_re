package com.google.android.gms.internal.gcm;

/* renamed from: com.google.android.gms.internal.gcm.n */
final class C10482n extends C10479k {

    /* renamed from: a */
    private final C10480l f27395a = new C10480l();

    C10482n() {
    }

    /* renamed from: a */
    public final void mo28305a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f27395a.mo28306a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
