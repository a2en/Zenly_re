package p214e.p228e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: e.e.b */
public final class C7573b<E> implements Collection<E>, Set<E> {

    /* renamed from: i */
    private static final int[] f18992i = new int[0];

    /* renamed from: j */
    private static final Object[] f18993j = new Object[0];

    /* renamed from: k */
    private static Object[] f18994k;

    /* renamed from: l */
    private static int f18995l;

    /* renamed from: m */
    private static Object[] f18996m;

    /* renamed from: n */
    private static int f18997n;

    /* renamed from: e */
    private int[] f18998e;

    /* renamed from: f */
    Object[] f18999f;

    /* renamed from: g */
    int f19000g;

    /* renamed from: h */
    private C7578f<E, E> f19001h;

    /* renamed from: e.e.b$a */
    class C7574a extends C7578f<E, E> {
        C7574a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo19476a(int i, int i2) {
            return C7573b.this.f18999f[i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo19481b(Object obj) {
            return C7573b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo19483c() {
            return C7573b.this.f19000g;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo19475a(Object obj) {
            return C7573b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map<E, E> mo19482b() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo19480a(E e, E e2) {
            C7573b.this.add(e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public E mo19477a(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo19479a(int i) {
            C7573b.this.mo19487b(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo19478a() {
            C7573b.this.clear();
        }
    }

    public C7573b() {
        this(0);
    }

    /* renamed from: a */
    private int m18261a(Object obj, int i) {
        int i2 = this.f19000g;
        if (i2 == 0) {
            return -1;
        }
        int a = C7575c.m18279a(this.f18998e, i2, i);
        if (a < 0 || obj.equals(this.f18999f[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f18998e[i3] == i) {
            if (obj.equals(this.f18999f[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f18998e[i4] == i) {
            if (obj.equals(this.f18999f[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: b */
    private int m18264b() {
        int i = this.f19000g;
        if (i == 0) {
            return -1;
        }
        int a = C7575c.m18279a(this.f18998e, i, 0);
        if (a < 0 || this.f18999f[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f18998e[i2] == 0) {
            if (this.f18999f[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f18998e[i3] == 0) {
            if (this.f18999f[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: d */
    private void m18265d(int i) {
        if (i == 8) {
            synchronized (C7573b.class) {
                if (f18996m != null) {
                    Object[] objArr = f18996m;
                    this.f18999f = objArr;
                    f18996m = (Object[]) objArr[0];
                    this.f18998e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f18997n--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C7573b.class) {
                if (f18994k != null) {
                    Object[] objArr2 = f18994k;
                    this.f18999f = objArr2;
                    f18994k = (Object[]) objArr2[0];
                    this.f18998e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f18995l--;
                    return;
                }
            }
        }
        this.f18998e = new int[i];
        this.f18999f = new Object[i];
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m18264b();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m18261a(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f19000g;
        if (i4 >= this.f18998e.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f18998e;
            Object[] objArr = this.f18999f;
            m18265d(i5);
            int[] iArr2 = this.f18998e;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f18999f, 0, objArr.length);
            }
            m18263a(iArr, objArr, this.f19000g);
        }
        int i6 = this.f19000g;
        if (i3 < i6) {
            int[] iArr3 = this.f18998e;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f18999f;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f19000g - i3);
        }
        this.f18998e[i3] = i;
        this.f18999f[i3] = e;
        this.f19000g++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo19484a(this.f19000g + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    /* renamed from: c */
    public E mo19488c(int i) {
        return this.f18999f[i];
    }

    public void clear() {
        int i = this.f19000g;
        if (i != 0) {
            m18263a(this.f18998e, this.f18999f, i);
            this.f18998e = f18992i;
            this.f18999f = f18993j;
            this.f19000g = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f19000g) {
                try {
                    if (!set.contains(mo19488c(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f18998e;
        int i = 0;
        for (int i2 = 0; i2 < this.f19000g; i2++) {
            i += iArr[i2];
        }
        return i;
    }

    public int indexOf(Object obj) {
        return obj == null ? m18264b() : m18261a(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f19000g <= 0;
    }

    public Iterator<E> iterator() {
        return m18262a().mo19531e().iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo19487b(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f19000g - 1; i >= 0; i--) {
            if (!collection.contains(this.f18999f[i])) {
                mo19487b(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f19000g;
    }

    public Object[] toArray() {
        int i = this.f19000g;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f18999f, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f19000g * 14);
        sb.append('{');
        for (int i = 0; i < this.f19000g; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object c = mo19488c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C7573b(int i) {
        if (i == 0) {
            this.f18998e = f18992i;
            this.f18999f = f18993j;
        } else {
            m18265d(i);
        }
        this.f19000g = 0;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f19000g) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f19000g);
        }
        System.arraycopy(this.f18999f, 0, tArr, 0, this.f19000g);
        int length = tArr.length;
        int i = this.f19000g;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    /* renamed from: a */
    private static void m18263a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C7573b.class) {
                if (f18997n < 10) {
                    objArr[0] = f18996m;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f18996m = objArr;
                    f18997n++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C7573b.class) {
                if (f18995l < 10) {
                    objArr[0] = f18994k;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f18994k = objArr;
                    f18995l++;
                }
            }
        }
    }

    /* renamed from: b */
    public E mo19487b(int i) {
        E[] eArr = this.f18999f;
        E e = eArr[i];
        int i2 = this.f19000g;
        if (i2 <= 1) {
            m18263a(this.f18998e, eArr, i2);
            this.f18998e = f18992i;
            this.f18999f = f18993j;
            this.f19000g = 0;
        } else {
            int[] iArr = this.f18998e;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                this.f19000g--;
                int i4 = this.f19000g;
                if (i < i4) {
                    int[] iArr2 = this.f18998e;
                    int i5 = i + 1;
                    System.arraycopy(iArr2, i5, iArr2, i, i4 - i);
                    Object[] objArr = this.f18999f;
                    System.arraycopy(objArr, i5, objArr, i, this.f19000g - i);
                }
                this.f18999f[this.f19000g] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                int[] iArr3 = this.f18998e;
                Object[] objArr2 = this.f18999f;
                m18265d(i3);
                this.f19000g--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f18998e, 0, i);
                    System.arraycopy(objArr2, 0, this.f18999f, 0, i);
                }
                int i6 = this.f19000g;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.f18998e, i, i6 - i);
                    System.arraycopy(objArr2, i7, this.f18999f, i, this.f19000g - i);
                }
            }
        }
        return e;
    }

    /* renamed from: a */
    public void mo19484a(int i) {
        int[] iArr = this.f18998e;
        if (iArr.length < i) {
            Object[] objArr = this.f18999f;
            m18265d(i);
            int i2 = this.f19000g;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f18998e, 0, i2);
                System.arraycopy(objArr, 0, this.f18999f, 0, this.f19000g);
            }
            m18263a(iArr, objArr, this.f19000g);
        }
    }

    /* renamed from: a */
    private C7578f<E, E> m18262a() {
        if (this.f19001h == null) {
            this.f19001h = new C7574a();
        }
        return this.f19001h;
    }
}
