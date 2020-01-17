package p389io.reactivex.p393i.p400c;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p389io.reactivex.internal.fuseable.SimplePlainQueue;
import p389io.reactivex.internal.util.C12765k;

/* renamed from: io.reactivex.i.c.b */
public final class C12448b<E> extends AtomicReferenceArray<E> implements SimplePlainQueue<E> {

    /* renamed from: j */
    private static final Integer f32281j = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;

    /* renamed from: e */
    final int f32282e = (length() - 1);

    /* renamed from: f */
    final AtomicLong f32283f = new AtomicLong();

    /* renamed from: g */
    long f32284g;

    /* renamed from: h */
    final AtomicLong f32285h = new AtomicLong();

    /* renamed from: i */
    final int f32286i;

    public C12448b(int i) {
        super(C12765k.m33379a(i));
        this.f32286i = Math.min(i / 4, f32281j.intValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo36638a(long j) {
        return this.f32282e & ((int) j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo36639a(long j, int i) {
        return ((int) j) & i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo36642b(long j) {
        this.f32285h.lazySet(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo36643c(long j) {
        this.f32283f.lazySet(j);
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return this.f32283f.get() == this.f32285h.get();
    }

    public boolean offer(E e) {
        if (e != null) {
            int i = this.f32282e;
            long j = this.f32283f.get();
            int a = mo36639a(j, i);
            if (j >= this.f32284g) {
                long j2 = ((long) this.f32286i) + j;
                if (mo36640a(mo36639a(j2, i)) == null) {
                    this.f32284g = j2;
                } else if (mo36640a(a) != null) {
                    return false;
                }
            }
            mo36641a(a, e);
            mo36643c(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public E poll() {
        long j = this.f32285h.get();
        int a = mo36638a(j);
        E a2 = mo36640a(a);
        if (a2 == null) {
            return null;
        }
        mo36642b(j + 1);
        mo36641a(a, (E) null);
        return a2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36641a(int i, E e) {
        lazySet(i, e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public E mo36640a(int i) {
        return get(i);
    }

    public boolean offer(E e, E e2) {
        return offer(e) && offer(e2);
    }
}
