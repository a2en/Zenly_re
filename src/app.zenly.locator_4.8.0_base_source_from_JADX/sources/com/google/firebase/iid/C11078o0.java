package com.google.firebase.iid;

import com.google.firebase.events.C11046a;
import com.google.firebase.events.EventHandler;

/* renamed from: com.google.firebase.iid.o0 */
final /* synthetic */ class C11078o0 implements EventHandler {

    /* renamed from: a */
    private final C11047a f28737a;

    C11078o0(C11047a aVar) {
        this.f28737a = aVar;
    }

    public final void handle(C11046a aVar) {
        C11047a aVar2 = this.f28737a;
        synchronized (aVar2) {
            if (aVar2.mo32243a()) {
                FirebaseInstanceId.this.zzh();
            }
        }
    }
}
