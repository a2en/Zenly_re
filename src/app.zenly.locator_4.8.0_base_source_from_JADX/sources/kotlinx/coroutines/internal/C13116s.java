package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.C12932j;
import kotlinx.coroutines.C13149u;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* renamed from: kotlinx.coroutines.internal.s */
public class C13116s<T extends ThreadSafeHeapNode & Comparable<? super T>> {
    private volatile int _size = 0;

    /* renamed from: a */
    private T[] f33709a;

    static {
        AtomicIntegerFieldUpdater.newUpdater(C13116s.class, "_size");
    }

    /* renamed from: d */
    private final void m34234d(int i) {
        while (i > 0) {
            T[] tArr = this.f33709a;
            if (tArr != null) {
                int i2 = (i - 1) / 2;
                T t = tArr[i2];
                if (t != null) {
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i];
                    if (t2 == null) {
                        C12932j.m33814a();
                        throw null;
                    } else if (comparable.compareTo(t2) > 0) {
                        m34231a(i, i2);
                        i = i2;
                    } else {
                        return;
                    }
                } else {
                    C12932j.m33814a();
                    throw null;
                }
            } else {
                C12932j.m33814a();
                throw null;
            }
        }
    }

    /* renamed from: f */
    private final T[] m34235f() {
        T[] tArr = this.f33709a;
        if (tArr == null) {
            T[] tArr2 = new ThreadSafeHeapNode[4];
            this.f33709a = tArr2;
            return tArr2;
        } else if (mo37619b() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, mo37619b() * 2);
            C12932j.m33815a((Object) copyOf, "java.util.Arrays.copyOf(this, newSize)");
            T[] tArr3 = (ThreadSafeHeapNode[]) copyOf;
            this.f33709a = tArr3;
            return tArr3;
        }
    }

    /* renamed from: a */
    public final T mo37616a() {
        T[] tArr = this.f33709a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: b */
    public final int mo37619b() {
        return this._size;
    }

    /* renamed from: c */
    public final boolean mo37621c() {
        return mo37619b() == 0;
    }

    /* renamed from: e */
    public final T mo37623e() {
        T a;
        synchronized (this) {
            a = mo37619b() > 0 ? mo37617a(0) : null;
        }
        return a;
    }

    /* renamed from: b */
    private final void m34232b(int i) {
        this._size = i;
    }

    /* renamed from: c */
    private final void m34233c(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < mo37619b()) {
                T[] tArr = this.f33709a;
                if (tArr != null) {
                    int i3 = i2 + 1;
                    if (i3 < mo37619b()) {
                        T t = tArr[i3];
                        if (t != null) {
                            Comparable comparable = (Comparable) t;
                            T t2 = tArr[i2];
                            if (t2 == null) {
                                C12932j.m33814a();
                                throw null;
                            } else if (comparable.compareTo(t2) < 0) {
                                i2 = i3;
                            }
                        } else {
                            C12932j.m33814a();
                            throw null;
                        }
                    }
                    T t3 = tArr[i];
                    if (t3 != null) {
                        Comparable comparable2 = (Comparable) t3;
                        T t4 = tArr[i2];
                        if (t4 == null) {
                            C12932j.m33814a();
                            throw null;
                        } else if (comparable2.compareTo(t4) > 0) {
                            m34231a(i, i2);
                            i = i2;
                        } else {
                            return;
                        }
                    } else {
                        C12932j.m33814a();
                        throw null;
                    }
                } else {
                    C12932j.m33814a();
                    throw null;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final T mo37617a(int i) {
        boolean z = false;
        if (C13149u.m34325a()) {
            if (!(mo37619b() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f33709a;
        if (tArr != null) {
            m34232b(mo37619b() - 1);
            if (i < mo37619b()) {
                m34231a(i, mo37619b());
                int i2 = (i - 1) / 2;
                if (i > 0) {
                    T t = tArr[i];
                    if (t != null) {
                        Comparable comparable = (Comparable) t;
                        T t2 = tArr[i2];
                        if (t2 == null) {
                            C12932j.m33814a();
                            throw null;
                        } else if (comparable.compareTo(t2) < 0) {
                            m34231a(i, i2);
                            m34234d(i2);
                        }
                    } else {
                        C12932j.m33814a();
                        throw null;
                    }
                }
                m34233c(i);
            }
            T t3 = tArr[mo37619b()];
            if (t3 != null) {
                if (C13149u.m34325a()) {
                    if (t3.getHeap() == this) {
                        z = true;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                t3.setHeap(null);
                t3.setIndex(-1);
                tArr[mo37619b()] = null;
                return t3;
            }
            C12932j.m33814a();
            throw null;
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: b */
    public final boolean mo37620b(T t) {
        boolean z;
        C12932j.m33818b(t, "node");
        synchronized (this) {
            z = true;
            boolean z2 = false;
            if (t.getHeap() == null) {
                z = false;
            } else {
                int index = t.getIndex();
                if (C13149u.m34325a()) {
                    if (index >= 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new AssertionError();
                    }
                }
                mo37617a(index);
            }
        }
        return z;
    }

    /* renamed from: d */
    public final T mo37622d() {
        T a;
        synchronized (this) {
            a = mo37616a();
        }
        return a;
    }

    /* renamed from: a */
    public final void mo37618a(T t) {
        C12932j.m33818b(t, "node");
        if (C13149u.m34325a()) {
            if (!(t.getHeap() == null)) {
                throw new AssertionError();
            }
        }
        t.setHeap(this);
        ThreadSafeHeapNode[] f = m34235f();
        int b = mo37619b();
        m34232b(b + 1);
        f[b] = t;
        t.setIndex(b);
        m34234d(b);
    }

    /* renamed from: a */
    private final void m34231a(int i, int i2) {
        T[] tArr = this.f33709a;
        if (tArr != null) {
            T t = tArr[i2];
            if (t != null) {
                T t2 = tArr[i];
                if (t2 != null) {
                    tArr[i] = t;
                    tArr[i2] = t2;
                    t.setIndex(i);
                    t2.setIndex(i2);
                    return;
                }
                C12932j.m33814a();
                throw null;
            }
            C12932j.m33814a();
            throw null;
        }
        C12932j.m33814a();
        throw null;
    }
}
