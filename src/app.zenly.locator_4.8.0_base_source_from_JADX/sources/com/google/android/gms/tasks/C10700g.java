package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.g */
final class C10700g extends C10689a {

    /* renamed from: a */
    private final C10690a0<Void> f27795a = new C10690a0<>();

    C10700g() {
    }

    /* renamed from: a */
    public final C10689a mo29297a(OnTokenCanceledListener onTokenCanceledListener) {
        this.f27795a.mo29301a((OnSuccessListener<? super TResult>) new C10701h<Object>(this, onTokenCanceledListener));
        return this;
    }

    /* renamed from: a */
    public final void mo29333a() {
        this.f27795a.mo29317b(null);
    }
}
