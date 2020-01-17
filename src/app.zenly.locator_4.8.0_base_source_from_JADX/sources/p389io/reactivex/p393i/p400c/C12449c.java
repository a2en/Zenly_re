package p389io.reactivex.p393i.p400c;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p389io.reactivex.internal.fuseable.SimplePlainQueue;
import p389io.reactivex.internal.util.C12765k;

/* renamed from: io.reactivex.i.c.c */
public final class C12449c<T> implements SimplePlainQueue<T> {

    /* renamed from: m */
    static final int f32287m = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: n */
    private static final Object f32288n = new Object();

    /* renamed from: e */
    final AtomicLong f32289e = new AtomicLong();

    /* renamed from: f */
    int f32290f;

    /* renamed from: g */
    long f32291g;

    /* renamed from: h */
    final int f32292h;

    /* renamed from: i */
    AtomicReferenceArray<Object> f32293i;

    /* renamed from: j */
    final int f32294j;

    /* renamed from: k */
    AtomicReferenceArray<Object> f32295k;

    /* renamed from: l */
    final AtomicLong f32296l = new AtomicLong();

    public C12449c(int i) {
        int a = C12765k.m33379a(Math.max(8, i));
        int i2 = a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a + 1);
        this.f32293i = atomicReferenceArray;
        this.f32292h = i2;
        m32945a(a);
        this.f32295k = atomicReferenceArray;
        this.f32294j = i2;
        this.f32291g = (long) (i2 - 1);
        m32954b(0);
    }

    /* renamed from: a */
    private boolean m32950a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m32947a(atomicReferenceArray, i, (Object) t);
        m32954b(j + 1);
        return true;
    }

    /* renamed from: b */
    private static int m32951b(int i) {
        return i;
    }

    /* renamed from: b */
    private AtomicReferenceArray<Object> m32953b(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        m32951b(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) m32943a(atomicReferenceArray, i);
        m32947a(atomicReferenceArray, i, (Object) null);
        return atomicReferenceArray2;
    }

    /* renamed from: c */
    private long m32955c() {
        return this.f32296l.get();
    }

    /* renamed from: d */
    private long m32956d() {
        return this.f32289e.get();
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return m32956d() == m32955c();
    }

    public boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f32293i;
            long b = m32952b();
            int i = this.f32292h;
            int a = m32941a(b, i);
            if (b < this.f32291g) {
                return m32950a(atomicReferenceArray, t, b, a);
            }
            long j = ((long) this.f32290f) + b;
            if (m32943a(atomicReferenceArray, m32941a(j, i)) == null) {
                this.f32291g = j - 1;
                return m32950a(atomicReferenceArray, t, b, a);
            } else if (m32943a(atomicReferenceArray, m32941a(1 + b, i)) == null) {
                return m32950a(atomicReferenceArray, t, b, a);
            } else {
                m32948a(atomicReferenceArray, b, a, t, (long) i);
                return true;
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f32295k;
        long a = m32942a();
        int i = this.f32294j;
        int a2 = m32941a(a, i);
        T a3 = m32943a(atomicReferenceArray, a2);
        boolean z = a3 == f32288n;
        if (a3 != null && !z) {
            m32947a(atomicReferenceArray, a2, (Object) null);
            m32946a(a + 1);
            return a3;
        } else if (z) {
            return m32944a(m32953b(atomicReferenceArray, i + 1), a, i);
        } else {
            return null;
        }
    }

    /* renamed from: a */
    private void m32948a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f32293i = atomicReferenceArray2;
        this.f32291g = (j2 + j) - 1;
        m32947a(atomicReferenceArray2, i, (Object) t);
        m32949a(atomicReferenceArray, atomicReferenceArray2);
        m32947a(atomicReferenceArray, i, f32288n);
        m32954b(j + 1);
    }

    /* renamed from: b */
    private long m32952b() {
        return this.f32289e.get();
    }

    /* renamed from: b */
    private void m32954b(long j) {
        this.f32289e.lazySet(j);
    }

    /* renamed from: a */
    private void m32949a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        int length = atomicReferenceArray.length() - 1;
        m32951b(length);
        m32947a(atomicReferenceArray, length, (Object) atomicReferenceArray2);
    }

    /* renamed from: a */
    private T m32944a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f32295k = atomicReferenceArray;
        int a = m32941a(j, i);
        T a2 = m32943a(atomicReferenceArray, a);
        if (a2 != null) {
            m32947a(atomicReferenceArray, a, (Object) null);
            m32946a(j + 1);
        }
        return a2;
    }

    public boolean offer(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f32293i;
        long d = m32956d();
        int i = this.f32292h;
        long j = 2 + d;
        if (m32943a(atomicReferenceArray, m32941a(j, i)) == null) {
            int a = m32941a(d, i);
            m32947a(atomicReferenceArray, a + 1, (Object) t2);
            m32947a(atomicReferenceArray, a, (Object) t);
            m32954b(j);
        } else {
            AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
            this.f32293i = atomicReferenceArray2;
            int a2 = m32941a(d, i);
            m32947a(atomicReferenceArray2, a2 + 1, (Object) t2);
            m32947a(atomicReferenceArray2, a2, (Object) t);
            m32949a(atomicReferenceArray, atomicReferenceArray2);
            m32947a(atomicReferenceArray, a2, f32288n);
            m32954b(j);
        }
        return true;
    }

    /* renamed from: a */
    private void m32945a(int i) {
        this.f32290f = Math.min(i / 4, f32287m);
    }

    /* renamed from: a */
    private long m32942a() {
        return this.f32296l.get();
    }

    /* renamed from: a */
    private void m32946a(long j) {
        this.f32296l.lazySet(j);
    }

    /* renamed from: a */
    private static int m32941a(long j, int i) {
        int i2 = ((int) j) & i;
        m32951b(i2);
        return i2;
    }

    /* renamed from: a */
    private static void m32947a(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    private static <E> Object m32943a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }
}
