package com.google.common.collect;

import com.google.common.base.C10850i;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.common.collect.r */
public abstract class C10912r<E> extends C10901o<E> implements Set<E> {

    /* renamed from: f */
    private transient C10904p<E> f28472f;

    /* renamed from: com.google.common.collect.r$a */
    private static class C10913a implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: e */
        final Object[] f28473e;

        C10913a(Object[] objArr) {
            this.f28473e = objArr;
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return C10912r.m28121a((E[]) this.f28473e);
        }
    }

    C10912r() {
    }

    /* renamed from: a */
    public static <E> C10912r<E> m28119a(E e) {
        return new C10887h0(e);
    }

    /* renamed from: a */
    private static boolean m28122a(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* renamed from: d */
    public static <E> C10912r<E> m28123d() {
        return C10883f0.f28439l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C10904p<E> mo31680b() {
        return C10904p.m28097a(toArray());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo31690c() {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10912r) || !mo31690c() || !((C10912r) obj).mo31690c() || hashCode() == obj.hashCode()) {
            return C10885g0.m28064a(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return C10885g0.m28063a(this);
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C10913a(toArray());
    }

    /* renamed from: a */
    public static <E> C10912r<E> m28120a(E e, E e2, E e3) {
        return m28118a(3, e, e2, e3);
    }

    /* renamed from: a */
    private static <E> C10912r<E> m28118a(int i, Object... objArr) {
        if (i == 0) {
            return m28123d();
        }
        if (i == 1) {
            return m28119a((E) objArr[0]);
        }
        int a = m28117a(i);
        Object[] objArr2 = new Object[a];
        int i2 = a - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[i5];
            C10962y.m28302a(obj, i5);
            int hashCode = obj.hashCode();
            int a2 = C10900n.m28089a(hashCode);
            while (true) {
                int i6 = a2 & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    int i7 = i4 + 1;
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += hashCode;
                    i4 = i7;
                    break;
                } else if (obj2.equals(obj)) {
                    break;
                } else {
                    a2++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, null);
        if (i4 == 1) {
            return new C10887h0(objArr[0], i3);
        }
        if (m28117a(i4) < a / 2) {
            return m28118a(i4, objArr);
        }
        if (m28122a(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        C10883f0 f0Var = new C10883f0(objArr, i3, objArr2, i2, i4);
        return f0Var;
    }

    /* renamed from: a */
    static int m28117a(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        C10850i.m28009a(z, (Object) "collection too large");
        return 1073741824;
    }

    /* renamed from: a */
    public static <E> C10912r<E> m28121a(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return m28123d();
        }
        if (length != 1) {
            return m28118a(eArr.length, (Object[]) eArr.clone());
        }
        return m28119a(eArr[0]);
    }

    /* renamed from: a */
    public C10904p<E> mo31686a() {
        C10904p<E> pVar = this.f28472f;
        if (pVar != null) {
            return pVar;
        }
        C10904p<E> b = mo31680b();
        this.f28472f = b;
        return b;
    }
}
