package p389io.reactivex.internal.util;

/* renamed from: io.reactivex.internal.util.j */
public final class C12764j<T> {

    /* renamed from: a */
    final float f33276a;

    /* renamed from: b */
    int f33277b;

    /* renamed from: c */
    int f33278c;

    /* renamed from: d */
    int f33279d;

    /* renamed from: e */
    T[] f33280e;

    public C12764j() {
        this(16, 0.75f);
    }

    /* renamed from: a */
    static int m33373a(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    /* renamed from: a */
    public boolean mo36939a(T t) {
        T t2;
        T[] tArr = this.f33280e;
        int i = this.f33277b;
        int a = m33373a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                a = (a + 1) & i;
                t2 = tArr[a];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[a] = t;
        int i2 = this.f33278c + 1;
        this.f33278c = i2;
        if (i2 >= this.f33279d) {
            mo36941b();
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo36942b(T t) {
        T t2;
        T[] tArr = this.f33280e;
        int i = this.f33277b;
        int a = m33373a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return mo36938a(a, tArr, i);
        }
        do {
            a = (a + 1) & i;
            t2 = tArr[a];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return mo36938a(a, tArr, i);
    }

    public C12764j(int i) {
        this(i, 0.75f);
    }

    public C12764j(int i, float f) {
        this.f33276a = f;
        int a = C12765k.m33379a(i);
        this.f33277b = a - 1;
        this.f33279d = (int) (f * ((float) a));
        this.f33280e = new Object[a];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo36941b() {
        T[] tArr = this.f33280e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = new Object[i];
        int i3 = this.f33278c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int a = m33373a(tArr[length].hashCode()) & i2;
                if (tArr2[a] != null) {
                    do {
                        a = (a + 1) & i2;
                    } while (tArr2[a] != null);
                }
                tArr2[a] = tArr[length];
                i3 = i4;
            } else {
                this.f33277b = i2;
                this.f33279d = (int) (((float) i) * this.f33276a);
                this.f33280e = tArr2;
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo36938a(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f33278c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int a = m33373a(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= a || a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    /* renamed from: a */
    public Object[] mo36940a() {
        return this.f33280e;
    }
}
