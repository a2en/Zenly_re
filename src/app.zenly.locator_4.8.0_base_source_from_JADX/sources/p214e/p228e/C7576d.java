package p214e.p228e;

/* renamed from: e.e.d */
public class C7576d<E> implements Cloneable {

    /* renamed from: i */
    private static final Object f19006i = new Object();

    /* renamed from: e */
    private boolean f19007e;

    /* renamed from: f */
    private long[] f19008f;

    /* renamed from: g */
    private Object[] f19009g;

    /* renamed from: h */
    private int f19010h;

    public C7576d() {
        this(10);
    }

    /* renamed from: a */
    public int mo19504a() {
        if (this.f19007e) {
            m18284b();
        }
        return this.f19010h;
    }

    /* renamed from: b */
    public E mo19509b(long j, E e) {
        int a = C7575c.m18280a(this.f19008f, this.f19010h, j);
        if (a >= 0) {
            E[] eArr = this.f19009g;
            if (eArr[a] != f19006i) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: c */
    public E mo19513c(long j) {
        return mo19509b(j, null);
    }

    public void clear() {
        int i = this.f19010h;
        Object[] objArr = this.f19009g;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f19010h = 0;
        this.f19007e = false;
    }

    /* renamed from: d */
    public int mo19517d(long j) {
        if (this.f19007e) {
            m18284b();
        }
        return C7575c.m18280a(this.f19008f, this.f19010h, j);
    }

    /* renamed from: e */
    public void mo19518e(long j) {
        int a = C7575c.m18280a(this.f19008f, this.f19010h, j);
        if (a >= 0) {
            Object[] objArr = this.f19009g;
            Object obj = objArr[a];
            Object obj2 = f19006i;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.f19007e = true;
            }
        }
    }

    public String toString() {
        if (mo19504a() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f19010h * 28);
        sb.append('{');
        for (int i = 0; i < this.f19010h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo19505a(i));
            sb.append('=');
            Object c = mo19512c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C7576d(int i) {
        this.f19007e = false;
        if (i == 0) {
            this.f19008f = C7575c.f19004b;
            this.f19009g = C7575c.f19005c;
            return;
        }
        int c = C7575c.m18283c(i);
        this.f19008f = new long[c];
        this.f19009g = new Object[c];
    }

    /* renamed from: c */
    public void mo19514c(long j, E e) {
        int a = C7575c.m18280a(this.f19008f, this.f19010h, j);
        if (a >= 0) {
            this.f19009g[a] = e;
        } else {
            int i = ~a;
            if (i < this.f19010h) {
                Object[] objArr = this.f19009g;
                if (objArr[i] == f19006i) {
                    this.f19008f[i] = j;
                    objArr[i] = e;
                    return;
                }
            }
            if (this.f19007e && this.f19010h >= this.f19008f.length) {
                m18284b();
                i = ~C7575c.m18280a(this.f19008f, this.f19010h, j);
            }
            int i2 = this.f19010h;
            if (i2 >= this.f19008f.length) {
                int c = C7575c.m18283c(i2 + 1);
                long[] jArr = new long[c];
                Object[] objArr2 = new Object[c];
                long[] jArr2 = this.f19008f;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr3 = this.f19009g;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.f19008f = jArr;
                this.f19009g = objArr2;
            }
            int i3 = this.f19010h;
            if (i3 - i != 0) {
                long[] jArr3 = this.f19008f;
                int i4 = i + 1;
                System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
                Object[] objArr4 = this.f19009g;
                System.arraycopy(objArr4, i, objArr4, i4, this.f19010h - i);
            }
            this.f19008f[i] = j;
            this.f19009g[i] = e;
            this.f19010h++;
        }
    }

    public C7576d<E> clone() {
        try {
            C7576d<E> dVar = (C7576d) super.clone();
            dVar.f19008f = (long[]) this.f19008f.clone();
            dVar.f19009g = (Object[]) this.f19009g.clone();
            return dVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public long mo19505a(int i) {
        if (this.f19007e) {
            m18284b();
        }
        return this.f19008f[i];
    }

    @Deprecated
    /* renamed from: b */
    public void mo19511b(long j) {
        mo19518e(j);
    }

    /* renamed from: b */
    public void mo19510b(int i) {
        Object[] objArr = this.f19009g;
        Object obj = objArr[i];
        Object obj2 = f19006i;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f19007e = true;
        }
    }

    /* renamed from: a */
    public void mo19506a(int i, E e) {
        if (this.f19007e) {
            m18284b();
        }
        this.f19009g[i] = e;
    }

    /* renamed from: b */
    private void m18284b() {
        int i = this.f19010h;
        long[] jArr = this.f19008f;
        Object[] objArr = this.f19009g;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f19006i) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f19007e = false;
        this.f19010h = i2;
    }

    /* renamed from: a */
    public boolean mo19508a(long j) {
        return mo19517d(j) >= 0;
    }

    /* renamed from: a */
    public void mo19507a(long j, E e) {
        int i = this.f19010h;
        if (i == 0 || j > this.f19008f[i - 1]) {
            if (this.f19007e && this.f19010h >= this.f19008f.length) {
                m18284b();
            }
            int i2 = this.f19010h;
            if (i2 >= this.f19008f.length) {
                int c = C7575c.m18283c(i2 + 1);
                long[] jArr = new long[c];
                Object[] objArr = new Object[c];
                long[] jArr2 = this.f19008f;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f19009g;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f19008f = jArr;
                this.f19009g = objArr;
            }
            this.f19008f[i2] = j;
            this.f19009g[i2] = e;
            this.f19010h = i2 + 1;
            return;
        }
        mo19514c(j, e);
    }

    /* renamed from: c */
    public E mo19512c(int i) {
        if (this.f19007e) {
            m18284b();
        }
        return this.f19009g[i];
    }
}
