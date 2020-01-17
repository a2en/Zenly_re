package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.o1 */
final class C10370o1 extends C10352l1 {
    private C10370o1() {
        super();
    }

    /* renamed from: b */
    private static <E> zzcn<E> m26361b(Object obj, long j) {
        return (zzcn) C10341k3.m26225f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28049a(Object obj, long j) {
        m26361b(obj, j).zzv();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo28050a(Object obj, Object obj2, long j) {
        zzcn b = m26361b(obj, j);
        zzcn b2 = m26361b(obj2, j);
        int size = b.size();
        int size2 = b2.size();
        if (size > 0 && size2 > 0) {
            if (!b.zzu()) {
                b = b.zzi(size2 + size);
            }
            b.addAll(b2);
        }
        if (size > 0) {
            b2 = b;
        }
        C10341k3.m26202a(obj, j, (Object) b2);
    }
}
