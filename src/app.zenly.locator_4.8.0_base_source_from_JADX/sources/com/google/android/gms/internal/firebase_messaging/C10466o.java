package com.google.android.gms.internal.firebase_messaging;

/* renamed from: com.google.android.gms.internal.firebase_messaging.o */
final class C10466o extends C10461k {

    /* renamed from: a */
    private final C10465n f27383a = new C10465n();

    C10466o() {
    }

    /* renamed from: a */
    public final void mo28291a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f27383a.mo28294a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
