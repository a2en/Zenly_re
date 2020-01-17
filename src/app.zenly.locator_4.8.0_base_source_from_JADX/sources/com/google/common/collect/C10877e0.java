package com.google.common.collect;

import com.google.common.base.C10850i;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;

/* renamed from: com.google.common.collect.e0 */
final class C10877e0<K, V> extends C10909q<K, V> {

    /* renamed from: k */
    static final C10909q<Object, Object> f28425k = new C10877e0(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: h */
    private final transient int[] f28426h;

    /* renamed from: i */
    final transient Object[] f28427i;

    /* renamed from: j */
    private final transient int f28428j;

    /* renamed from: com.google.common.collect.e0$a */
    static class C10878a<K, V> extends C10912r<Entry<K, V>> {

        /* renamed from: g */
        private final transient C10909q<K, V> f28429g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final transient Object[] f28430h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public final transient int f28431i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public final transient int f28432j;

        /* renamed from: com.google.common.collect.e0$a$a */
        class C10879a extends C10904p<Entry<K, V>> {
            C10879a() {
            }

            public int size() {
                return C10878a.this.f28432j;
            }

            public Entry<K, V> get(int i) {
                C10850i.m28003a(i, C10878a.this.f28432j);
                int i2 = i * 2;
                return new SimpleImmutableEntry(C10878a.this.f28430h[C10878a.this.f28431i + i2], C10878a.this.f28430h[i2 + (C10878a.this.f28431i ^ 1)]);
            }
        }

        C10878a(C10909q<K, V> qVar, Object[] objArr, int i, int i2) {
            this.f28429g = qVar;
            this.f28430h = objArr;
            this.f28431i = i;
            this.f28432j = i2;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f28429g.get(key))) {
                return false;
            }
            return true;
        }

        public int size() {
            return this.f28432j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo31668a(Object[] objArr, int i) {
            return mo31686a().mo31668a(objArr, i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C10904p<Entry<K, V>> mo31680b() {
            return new C10879a();
        }

        public C10897l0<Entry<K, V>> iterator() {
            return mo31686a().iterator();
        }
    }

    /* renamed from: com.google.common.collect.e0$b */
    static final class C10880b<K> extends C10912r<K> {

        /* renamed from: g */
        private final transient C10909q<K, ?> f28434g;

        /* renamed from: h */
        private final transient C10904p<K> f28435h;

        C10880b(C10909q<K, ?> qVar, C10904p<K> pVar) {
            this.f28434g = qVar;
            this.f28435h = pVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo31668a(Object[] objArr, int i) {
            return mo31686a().mo31668a(objArr, i);
        }

        public boolean contains(Object obj) {
            return this.f28434g.get(obj) != null;
        }

        public int size() {
            return this.f28434g.size();
        }

        /* renamed from: a */
        public C10904p<K> mo31686a() {
            return this.f28435h;
        }

        public C10897l0<K> iterator() {
            return mo31686a().iterator();
        }
    }

    /* renamed from: com.google.common.collect.e0$c */
    static final class C10881c extends C10904p<Object> {

        /* renamed from: g */
        private final transient Object[] f28436g;

        /* renamed from: h */
        private final transient int f28437h;

        /* renamed from: i */
        private final transient int f28438i;

        C10881c(Object[] objArr, int i, int i2) {
            this.f28436g = objArr;
            this.f28437h = i;
            this.f28438i = i2;
        }

        public Object get(int i) {
            C10850i.m28003a(i, this.f28438i);
            return this.f28436g[(i * 2) + this.f28437h];
        }

        public int size() {
            return this.f28438i;
        }
    }

    private C10877e0(int[] iArr, Object[] objArr, int i) {
        this.f28426h = iArr;
        this.f28427i = objArr;
        this.f28428j = i;
    }

    /* renamed from: a */
    static <K, V> C10877e0<K, V> m28043a(int i, Object[] objArr) {
        if (i == 0) {
            return (C10877e0) f28425k;
        }
        if (i == 1) {
            C10882f.m28057a(objArr[0], objArr[1]);
            return new C10877e0<>(null, objArr, 1);
        }
        C10850i.m28013b(i, objArr.length >> 1);
        return new C10877e0<>(m28045a(objArr, i, C10912r.m28117a(i), 0), objArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C10912r<K> mo31676b() {
        return new C10880b(this, new C10881c(this.f28427i, 0, this.f28428j));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C10901o<V> mo31677c() {
        return new C10881c(this.f28427i, 1, this.f28428j);
    }

    public V get(Object obj) {
        return m28044a(this.f28426h, this.f28427i, this.f28428j, 0, obj);
    }

    public int size() {
        return this.f28428j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        r12[r7] = r5;
        r3 = r3 + 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int[] m28045a(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            r0 = 1
            if (r11 != r0) goto L_0x000e
            r11 = r10[r13]
            r12 = r13 ^ 1
            r10 = r10[r12]
            com.google.common.collect.C10882f.m28057a(r11, r10)
            r10 = 0
            return r10
        L_0x000e:
            int r1 = r12 + -1
            int[] r12 = new int[r12]
            r2 = -1
            java.util.Arrays.fill(r12, r2)
            r3 = 0
        L_0x0017:
            if (r3 >= r11) goto L_0x0077
            int r4 = r3 * 2
            int r5 = r4 + r13
            r6 = r10[r5]
            r7 = r13 ^ 1
            int r4 = r4 + r7
            r4 = r10[r4]
            com.google.common.collect.C10882f.m28057a(r6, r4)
            int r7 = r6.hashCode()
            int r7 = com.google.common.collect.C10900n.m28089a(r7)
        L_0x002f:
            r7 = r7 & r1
            r8 = r12[r7]
            if (r8 != r2) goto L_0x0039
            r12[r7] = r5
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0039:
            r9 = r10[r8]
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L_0x0044
            int r7 = r7 + 1
            goto L_0x002f
        L_0x0044:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Multiple entries with same key: "
            r12.append(r13)
            r12.append(r6)
            java.lang.String r13 = "="
            r12.append(r13)
            r12.append(r4)
            java.lang.String r1 = " and "
            r12.append(r1)
            r1 = r10[r8]
            r12.append(r1)
            r12.append(r13)
            r13 = r8 ^ 1
            r10 = r10[r13]
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L_0x0077:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C10877e0.m28045a(java.lang.Object[], int, int, int):int[]");
    }

    /* renamed from: a */
    static Object m28044a(int[] iArr, Object[] objArr, int i, int i2, Object obj) {
        Object obj2 = null;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[i2].equals(obj)) {
                obj2 = objArr[i2 ^ 1];
            }
            return obj2;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int a = C10900n.m28089a(obj.hashCode());
            while (true) {
                int i3 = a & length;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    return null;
                }
                if (objArr[i4].equals(obj)) {
                    return objArr[i4 ^ 1];
                }
                a = i3 + 1;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C10912r<Entry<K, V>> mo31675a() {
        return new C10878a(this, this.f28427i, 0, this.f28428j);
    }
}
