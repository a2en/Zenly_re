package p214e.p228e;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: e.e.g */
public class C7584g<K, V> {

    /* renamed from: h */
    static Object[] f19034h;

    /* renamed from: i */
    static int f19035i;

    /* renamed from: j */
    static Object[] f19036j;

    /* renamed from: k */
    static int f19037k;

    /* renamed from: e */
    int[] f19038e;

    /* renamed from: f */
    Object[] f19039f;

    /* renamed from: g */
    int f19040g;

    public C7584g() {
        this.f19038e = C7575c.f19003a;
        this.f19039f = C7575c.f19005c;
        this.f19040g = 0;
    }

    /* renamed from: a */
    private static int m18325a(int[] iArr, int i, int i2) {
        try {
            return C7575c.m18279a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    private void m18327e(int i) {
        Class<C7584g> cls = C7584g.class;
        if (i == 8) {
            synchronized (cls) {
                if (f19036j != null) {
                    Object[] objArr = f19036j;
                    this.f19039f = objArr;
                    f19036j = (Object[]) objArr[0];
                    this.f19038e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f19037k--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                if (f19034h != null) {
                    Object[] objArr2 = f19034h;
                    this.f19039f = objArr2;
                    f19034h = (Object[]) objArr2[0];
                    this.f19038e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f19035i--;
                    return;
                }
            }
        }
        this.f19038e = new int[i];
        this.f19039f = new Object[(i << 1)];
    }

    /* renamed from: b */
    public int mo19594b(Object obj) {
        return obj == null ? mo19589a() : mo19590a(obj, obj.hashCode());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo19596c(Object obj) {
        int i = this.f19040g * 2;
        Object[] objArr = this.f19039f;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
        } else {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (obj.equals(objArr[i3])) {
                    return i3 >> 1;
                }
            }
        }
        return -1;
    }

    public void clear() {
        int i = this.f19040g;
        if (i > 0) {
            int[] iArr = this.f19038e;
            Object[] objArr = this.f19039f;
            this.f19038e = C7575c.f19003a;
            this.f19039f = C7575c.f19005c;
            this.f19040g = 0;
            m18326a(iArr, objArr, i);
        }
        if (this.f19040g > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo19594b(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo19596c(obj) >= 0;
    }

    /* renamed from: d */
    public V mo19601d(int i) {
        return this.f19039f[(i << 1) + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7584g) {
            C7584g gVar = (C7584g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f19040g) {
                try {
                    Object b = mo19595b(i);
                    Object d = mo19601d(i);
                    Object obj2 = gVar.get(b);
                    if (d == null) {
                        if (obj2 != null || !gVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!d.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f19040g) {
                try {
                    Object b2 = mo19595b(i2);
                    Object d2 = mo19601d(i2);
                    Object obj3 = map.get(b2);
                    if (d2 == null) {
                        if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                    } else if (!d2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int b = mo19594b(obj);
        return b >= 0 ? this.f19039f[(b << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f19038e;
        Object[] objArr = this.f19039f;
        int i = this.f19040g;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            Object obj = objArr[i4];
            i3 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i2];
            i2++;
            i4 += 2;
        }
        return i3;
    }

    public boolean isEmpty() {
        return this.f19040g <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f19040g;
        if (k == null) {
            i2 = mo19589a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo19590a((Object) k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f19039f;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        if (i3 >= this.f19038e.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f19038e;
            Object[] objArr = this.f19039f;
            m18327e(i6);
            if (i3 == this.f19040g) {
                int[] iArr2 = this.f19038e;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f19039f, 0, objArr.length);
                }
                m18326a(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f19038e;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f19039f;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f19040g - i5) << 1);
        }
        int i8 = this.f19040g;
        if (i3 == i8) {
            int[] iArr4 = this.f19038e;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f19039f;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f19040g = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int b = mo19594b(obj);
        if (b >= 0) {
            return mo19597c(b);
        }
        return null;
    }

    public V replace(K k, V v) {
        int b = mo19594b((Object) k);
        if (b >= 0) {
            return mo19591a(b, v);
        }
        return null;
    }

    public int size() {
        return this.f19040g;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f19040g * 28);
        sb.append('{');
        for (int i = 0; i < this.f19040g; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo19595b(i);
            String str = "(this Map)";
            if (b != this) {
                sb.append(b);
            } else {
                sb.append(str);
            }
            sb.append('=');
            Object d = mo19601d(i);
            if (d != this) {
                sb.append(d);
            } else {
                sb.append(str);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    public K mo19595b(int i) {
        return this.f19039f[i << 1];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo19590a(Object obj, int i) {
        int i2 = this.f19040g;
        if (i2 == 0) {
            return -1;
        }
        int a = m18325a(this.f19038e, i2, i);
        if (a < 0 || obj.equals(this.f19039f[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f19038e[i3] == i) {
            if (obj.equals(this.f19039f[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f19038e[i4] == i) {
            if (obj.equals(this.f19039f[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public boolean remove(Object obj, Object obj2) {
        int b = mo19594b(obj);
        if (b >= 0) {
            Object d = mo19601d(b);
            if (obj2 == d || (obj2 != null && obj2.equals(d))) {
                mo19597c(b);
                return true;
            }
        }
        return false;
    }

    public boolean replace(K k, V v, V v2) {
        int b = mo19594b((Object) k);
        if (b >= 0) {
            V d = mo19601d(b);
            if (d == v || (v != null && v.equals(d))) {
                mo19591a(b, v2);
                return true;
            }
        }
        return false;
    }

    public C7584g(int i) {
        if (i == 0) {
            this.f19038e = C7575c.f19003a;
            this.f19039f = C7575c.f19005c;
        } else {
            m18327e(i);
        }
        this.f19040g = 0;
    }

    /* renamed from: c */
    public V mo19597c(int i) {
        int i2;
        V[] vArr = this.f19039f;
        int i3 = i << 1;
        V v = vArr[i3 + 1];
        int i4 = this.f19040g;
        if (i4 <= 1) {
            m18326a(this.f19038e, (Object[]) vArr, i4);
            this.f19038e = C7575c.f19003a;
            this.f19039f = C7575c.f19005c;
            i2 = 0;
        } else {
            i2 = i4 - 1;
            int[] iArr = this.f19038e;
            int i5 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i < i2) {
                    int[] iArr2 = this.f19038e;
                    int i6 = i + 1;
                    int i7 = i2 - i;
                    System.arraycopy(iArr2, i6, iArr2, i, i7);
                    Object[] objArr = this.f19039f;
                    System.arraycopy(objArr, i6 << 1, objArr, i3, i7 << 1);
                }
                Object[] objArr2 = this.f19039f;
                int i8 = i2 << 1;
                objArr2[i8] = null;
                objArr2[i8 + 1] = null;
            } else {
                if (i4 > 8) {
                    i5 = i4 + (i4 >> 1);
                }
                int[] iArr3 = this.f19038e;
                Object[] objArr3 = this.f19039f;
                m18327e(i5);
                if (i4 == this.f19040g) {
                    if (i > 0) {
                        System.arraycopy(iArr3, 0, this.f19038e, 0, i);
                        System.arraycopy(objArr3, 0, this.f19039f, 0, i3);
                    }
                    if (i < i2) {
                        int i9 = i + 1;
                        int i10 = i2 - i;
                        System.arraycopy(iArr3, i9, this.f19038e, i, i10);
                        System.arraycopy(objArr3, i9 << 1, this.f19039f, i3, i10 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
        }
        if (i4 == this.f19040g) {
            this.f19040g = i2;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public C7584g(C7584g<K, V> gVar) {
        this();
        if (gVar != null) {
            mo19593a(gVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo19589a() {
        int i = this.f19040g;
        if (i == 0) {
            return -1;
        }
        int a = m18325a(this.f19038e, i, 0);
        if (a < 0 || this.f19039f[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f19038e[i2] == 0) {
            if (this.f19039f[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f19038e[i3] == 0) {
            if (this.f19039f[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: a */
    private static void m18326a(int[] iArr, Object[] objArr, int i) {
        Class<C7584g> cls = C7584g.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f19037k < 10) {
                    objArr[0] = f19036j;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f19036j = objArr;
                    f19037k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f19035i < 10) {
                    objArr[0] = f19034h;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f19034h = objArr;
                    f19035i++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo19592a(int i) {
        int i2 = this.f19040g;
        int[] iArr = this.f19038e;
        if (iArr.length < i) {
            Object[] objArr = this.f19039f;
            m18327e(i);
            if (this.f19040g > 0) {
                System.arraycopy(iArr, 0, this.f19038e, 0, i2);
                System.arraycopy(objArr, 0, this.f19039f, 0, i2 << 1);
            }
            m18326a(iArr, objArr, i2);
        }
        if (this.f19040g != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public V mo19591a(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f19039f;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: a */
    public void mo19593a(C7584g<? extends K, ? extends V> gVar) {
        int i = gVar.f19040g;
        mo19592a(this.f19040g + i);
        if (this.f19040g != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(gVar.mo19595b(i2), gVar.mo19601d(i2));
            }
        } else if (i > 0) {
            System.arraycopy(gVar.f19038e, 0, this.f19038e, 0, i);
            System.arraycopy(gVar.f19039f, 0, this.f19039f, 0, i << 1);
            this.f19040g = i;
        }
    }
}
