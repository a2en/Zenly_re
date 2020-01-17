package com.snap.p327ui.seeking;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: com.snap.ui.seeking.f */
public final class C11751f {

    /* renamed from: a */
    private static final C11748c<Object> f30435a = new C11748c<>();

    static {
        new C11751f();
    }

    private C11751f() {
    }

    /* renamed from: a */
    public static final <T> Seekable<T> m30859a() {
        C11748c<Object> cVar = f30435a;
        if (cVar != null) {
            return cVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.snap.ui.seeking.Seekable<T>");
    }

    /* renamed from: b */
    public static final <T> Seekable<T> m30863b(List<? extends T> list) {
        C12932j.m33818b(list, "list");
        return new C11749d(C12857w.m33689j(list));
    }

    /* renamed from: a */
    public static final <T> Seekable<T> m30861a(T t) {
        return new C11749d(C12846n.m33635a(t));
    }

    /* renamed from: a */
    public static final <T> Seekable<T> m30860a(Seekable<T> seekable, Seekable<T> seekable2) {
        C12932j.m33818b(seekable, "head");
        C12932j.m33818b(seekable2, "tail");
        return new C11746a(seekable, seekable2);
    }

    /* renamed from: a */
    public static final <T> Seekable<T> m30862a(List<? extends Seekable<T>> list) {
        C12932j.m33818b(list, "seekables");
        return new C11747b(list);
    }
}
