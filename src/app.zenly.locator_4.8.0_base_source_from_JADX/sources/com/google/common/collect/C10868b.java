package com.google.common.collect;

import com.google.common.base.C10850i;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.b */
public abstract class C10868b<T> extends C10897l0<T> {

    /* renamed from: e */
    private C10870b f28406e = C10870b.NOT_READY;

    /* renamed from: f */
    private T f28407f;

    /* renamed from: com.google.common.collect.b$a */
    static /* synthetic */ class C10869a {

        /* renamed from: a */
        static final /* synthetic */ int[] f28408a = new int[C10870b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.google.common.collect.b$b[] r0 = com.google.common.collect.C10868b.C10870b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28408a = r0
                int[] r0 = f28408a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.common.collect.b$b r1 = com.google.common.collect.C10868b.C10870b.DONE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f28408a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.common.collect.b$b r1 = com.google.common.collect.C10868b.C10870b.READY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C10868b.C10869a.<clinit>():void");
        }
    }

    /* renamed from: com.google.common.collect.b$b */
    private enum C10870b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected C10868b() {
    }

    /* renamed from: c */
    private boolean m28034c() {
        this.f28406e = C10870b.FAILED;
        this.f28407f = mo31656a();
        if (this.f28406e == C10870b.DONE) {
            return false;
        }
        this.f28406e = C10870b.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo31656a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final T mo31657b() {
        this.f28406e = C10870b.DONE;
        return null;
    }

    public final boolean hasNext() {
        C10850i.m28016b(this.f28406e != C10870b.FAILED);
        int i = C10869a.f28408a[this.f28406e.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m28034c();
        }
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.f28406e = C10870b.NOT_READY;
            T t = this.f28407f;
            this.f28407f = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}
