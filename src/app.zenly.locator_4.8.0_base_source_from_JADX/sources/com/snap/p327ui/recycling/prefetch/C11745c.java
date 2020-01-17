package com.snap.p327ui.recycling.prefetch;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.C0143b;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C12932j;

/* renamed from: com.snap.ui.recycling.prefetch.c */
public final class C11745c {

    /* renamed from: a */
    private final ConcurrentHashMap<Thread, LayoutInflater> f30427a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final LayoutInflater f30428b;

    public C11745c(LayoutInflater layoutInflater) {
        C12932j.m33818b(layoutInflater, "layoutInflater");
        this.f30428b = layoutInflater;
    }

    /* renamed from: b */
    private final LayoutInflater m30857b() {
        Context context = this.f30428b.getContext();
        C12932j.m33815a((Object) context, "oldContext");
        LayoutInflater cloneInContext = this.f30428b.cloneInContext(new C0143b(context, context.getTheme()));
        C12932j.m33815a((Object) cloneInContext, "layoutInflater.cloneInContext(newContext)");
        return cloneInContext;
    }

    /* renamed from: a */
    public final LayoutInflater mo34560a() {
        Thread currentThread = Thread.currentThread();
        C12932j.m33815a((Object) currentThread, "Thread.currentThread()");
        LayoutInflater layoutInflater = (LayoutInflater) this.f30427a.get(currentThread);
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater b = m30857b();
        this.f30427a.put(currentThread, b);
        return b;
    }
}
