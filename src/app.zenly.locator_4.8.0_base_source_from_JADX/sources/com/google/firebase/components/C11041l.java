package com.google.firebase.components;

import com.google.firebase.events.C11046a;
import com.google.firebase.events.EventHandler;
import java.util.Map.Entry;

/* renamed from: com.google.firebase.components.l */
final /* synthetic */ class C11041l implements Runnable {

    /* renamed from: e */
    private final Entry f28645e;

    /* renamed from: f */
    private final C11046a f28646f;

    private C11041l(Entry entry, C11046a aVar) {
        this.f28645e = entry;
        this.f28646f = aVar;
    }

    /* renamed from: a */
    public static Runnable m28447a(Entry entry, C11046a aVar) {
        return new C11041l(entry, aVar);
    }

    public void run() {
        ((EventHandler) this.f28645e.getKey()).handle(this.f28646f);
    }
}
