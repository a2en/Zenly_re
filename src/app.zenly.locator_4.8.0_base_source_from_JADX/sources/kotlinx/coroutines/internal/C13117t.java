package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.internal.t */
final class C13117t {

    /* renamed from: a */
    private Object[] f33710a;

    /* renamed from: b */
    private int f33711b;

    /* renamed from: c */
    private final CoroutineContext f33712c;

    public C13117t(CoroutineContext coroutineContext, int i) {
        C12932j.m33818b(coroutineContext, "context");
        this.f33712c = coroutineContext;
        this.f33710a = new Object[i];
    }

    /* renamed from: a */
    public final CoroutineContext mo37624a() {
        return this.f33712c;
    }

    /* renamed from: b */
    public final void mo37626b() {
        this.f33711b = 0;
    }

    /* renamed from: c */
    public final Object mo37627c() {
        Object[] objArr = this.f33710a;
        int i = this.f33711b;
        this.f33711b = i + 1;
        return objArr[i];
    }

    /* renamed from: a */
    public final void mo37625a(Object obj) {
        Object[] objArr = this.f33710a;
        int i = this.f33711b;
        this.f33711b = i + 1;
        objArr[i] = obj;
    }
}
