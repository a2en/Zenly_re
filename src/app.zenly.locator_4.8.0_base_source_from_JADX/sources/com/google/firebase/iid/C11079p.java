package com.google.firebase.iid;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* renamed from: com.google.firebase.iid.p */
final /* synthetic */ class C11079p implements ComponentFactory {

    /* renamed from: a */
    static final ComponentFactory f28738a = new C11079p();

    private C11079p() {
    }

    public final Object create(ComponentContainer componentContainer) {
        return new C11048a((FirebaseInstanceId) componentContainer.get(FirebaseInstanceId.class));
    }
}
