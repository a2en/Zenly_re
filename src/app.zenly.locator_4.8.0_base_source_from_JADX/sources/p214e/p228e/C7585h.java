package p214e.p228e;

/* renamed from: e.e.h */
public class C7585h<E> implements Cloneable {

    /* renamed from: i */
    private static final Object f19041i = new Object();

    /* renamed from: e */
    private boolean f19042e;

    /* renamed from: f */
    private int[] f19043f;

    /* renamed from: g */
    private Object[] f19044g;

    /* renamed from: h */
    private int f19045h;

    public C7585h() {
        this(10);
    }

    /* renamed from: a */
    public E mo19617a(int i) {
        return mo19620b(i, null);
    }

    /* renamed from: b */
    public E mo19620b(int i, E e) {
        int a = C7575c.m18279a(this.f19043f, this.f19045h, i);
        if (a >= 0) {
            E[] eArr = this.f19044g;
            if (eArr[a] != f19041i) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: c */
    public void mo19622c(int i, E e) {
        int a = C7575c.m18279a(this.f19043f, this.f19045h, i);
        if (a >= 0) {
            this.f19044g[a] = e;
        } else {
            int i2 = ~a;
            if (i2 < this.f19045h) {
                Object[] objArr = this.f19044g;
                if (objArr[i2] == f19041i) {
                    this.f19043f[i2] = i;
                    objArr[i2] = e;
                    return;
                }
            }
            if (this.f19042e && this.f19045h >= this.f19043f.length) {
                m18338b();
                i2 = ~C7575c.m18279a(this.f19043f, this.f19045h, i);
            }
            int i3 = this.f19045h;
            if (i3 >= this.f19043f.length) {
                int b = C7575c.m18282b(i3 + 1);
                int[] iArr = new int[b];
                Object[] objArr2 = new Object[b];
                int[] iArr2 = this.f19043f;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr3 = this.f19044g;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.f19043f = iArr;
                this.f19044g = objArr2;
            }
            int i4 = this.f19045h;
            if (i4 - i2 != 0) {
                int[] iArr3 = this.f19043f;
                int i5 = i2 + 1;
                System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
                Object[] objArr4 = this.f19044g;
                System.arraycopy(objArr4, i2, objArr4, i5, this.f19045h - i2);
            }
            this.f19043f[i2] = i;
            this.f19044g[i2] = e;
            this.f19045h++;
        }
    }

    public void clear() {
        int i = this.f19045h;
        Object[] objArr = this.f19044g;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f19045h = 0;
        this.f19042e = false;
    }

    /* renamed from: d */
    public void mo19625d(int i) {
        int a = C7575c.m18279a(this.f19043f, this.f19045h, i);
        if (a >= 0) {
            Object[] objArr = this.f19044g;
            Object obj = objArr[a];
            Object obj2 = f19041i;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.f19042e = true;
            }
        }
    }

    /* renamed from: e */
    public void mo19626e(int i) {
        Object[] objArr = this.f19044g;
        Object obj = objArr[i];
        Object obj2 = f19041i;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f19042e = true;
        }
    }

    /* renamed from: f */
    public E mo19627f(int i) {
        if (this.f19042e) {
            m18338b();
        }
        return this.f19044g[i];
    }

    public String toString() {
        if (mo19615a() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f19045h * 28);
        sb.append('{');
        for (int i = 0; i < this.f19045h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo19621c(i));
            sb.append('=');
            Object f = mo19627f(i);
            if (f != this) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C7585h(int i) {
        this.f19042e = false;
        if (i == 0) {
            this.f19043f = C7575c.f19003a;
            this.f19044g = C7575c.f19005c;
            return;
        }
        int b = C7575c.m18282b(i);
        this.f19043f = new int[b];
        this.f19044g = new Object[b];
    }

    /* renamed from: a */
    public int mo19615a() {
        if (this.f19042e) {
            m18338b();
        }
        return this.f19045h;
    }

    public C7585h<E> clone() {
        try {
            C7585h<E> hVar = (C7585h) super.clone();
            hVar.f19043f = (int[]) this.f19043f.clone();
            hVar.f19044g = (Object[]) this.f19044g.clone();
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    private void m18338b() {
        int i = this.f19045h;
        int[] iArr = this.f19043f;
        Object[] objArr = this.f19044g;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f19041i) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f19042e = false;
        this.f19045h = i2;
    }

    /* renamed from: a */
    public int mo19616a(E e) {
        if (this.f19042e) {
            m18338b();
        }
        for (int i = 0; i < this.f19045h; i++) {
            if (this.f19044g[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo19618a(int i, E e) {
        int i2 = this.f19045h;
        if (i2 == 0 || i > this.f19043f[i2 - 1]) {
            if (this.f19042e && this.f19045h >= this.f19043f.length) {
                m18338b();
            }
            int i3 = this.f19045h;
            if (i3 >= this.f19043f.length) {
                int b = C7575c.m18282b(i3 + 1);
                int[] iArr = new int[b];
                Object[] objArr = new Object[b];
                int[] iArr2 = this.f19043f;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f19044g;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f19043f = iArr;
                this.f19044g = objArr;
            }
            this.f19043f[i3] = i;
            this.f19044g[i3] = e;
            this.f19045h = i3 + 1;
            return;
        }
        mo19622c(i, e);
    }

    /* renamed from: b */
    public int mo19619b(int i) {
        if (this.f19042e) {
            m18338b();
        }
        return C7575c.m18279a(this.f19043f, this.f19045h, i);
    }

    /* renamed from: c */
    public int mo19621c(int i) {
        if (this.f19042e) {
            m18338b();
        }
        return this.f19043f[i];
    }
}
