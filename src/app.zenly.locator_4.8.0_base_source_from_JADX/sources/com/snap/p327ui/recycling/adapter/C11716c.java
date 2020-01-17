package com.snap.p327ui.recycling.adapter;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.functions.Consumer;

/* renamed from: com.snap.ui.recycling.adapter.c */
final class C11716c implements Consumer {

    /* renamed from: e */
    private final /* synthetic */ Function1 f30370e;

    C11716c(Function1 function1) {
        this.f30370e = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        C12932j.m33815a(this.f30370e.invoke(obj), "invoke(...)");
    }
}
