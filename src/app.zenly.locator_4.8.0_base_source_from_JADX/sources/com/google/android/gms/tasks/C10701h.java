package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.h */
final class C10701h implements OnSuccessListener<Void> {

    /* renamed from: a */
    private final /* synthetic */ OnTokenCanceledListener f27796a;

    C10701h(C10700g gVar, OnTokenCanceledListener onTokenCanceledListener) {
        this.f27796a = onTokenCanceledListener;
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.f27796a.onCanceled();
    }
}
