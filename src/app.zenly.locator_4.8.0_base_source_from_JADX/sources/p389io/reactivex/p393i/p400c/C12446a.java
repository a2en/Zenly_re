package p389io.reactivex.p393i.p400c;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.internal.fuseable.SimplePlainQueue;

/* renamed from: io.reactivex.i.c.a */
public final class C12446a<T> implements SimplePlainQueue<T> {

    /* renamed from: e */
    private final AtomicReference<C12447a<T>> f32278e = new AtomicReference<>();

    /* renamed from: f */
    private final AtomicReference<C12447a<T>> f32279f = new AtomicReference<>();

    /* renamed from: io.reactivex.i.c.a$a */
    static final class C12447a<E> extends AtomicReference<C12447a<E>> {
        private static final long serialVersionUID = 2404266111789071508L;

        /* renamed from: e */
        private E f32280e;

        C12447a() {
        }

        /* renamed from: a */
        public E mo36633a() {
            E b = mo36636b();
            mo36635a((E) null);
            return b;
        }

        /* renamed from: b */
        public E mo36636b() {
            return this.f32280e;
        }

        /* renamed from: c */
        public C12447a<E> mo36637c() {
            return (C12447a) get();
        }

        C12447a(E e) {
            mo36635a(e);
        }

        /* renamed from: a */
        public void mo36635a(E e) {
            this.f32280e = e;
        }

        /* renamed from: a */
        public void mo36634a(C12447a<E> aVar) {
            lazySet(aVar);
        }
    }

    public C12446a() {
        C12447a aVar = new C12447a();
        mo36624a(aVar);
        mo36626b(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C12447a<T> mo36623a() {
        return (C12447a) this.f32279f.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C12447a<T> mo36626b(C12447a<T> aVar) {
        return (C12447a) this.f32278e.getAndSet(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C12447a<T> mo36627c() {
        return (C12447a) this.f32278e.get();
    }

    public void clear() {
        while (poll() != null) {
            if (isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return mo36625b() == mo36627c();
    }

    public boolean offer(T t) {
        if (t != null) {
            C12447a aVar = new C12447a(t);
            mo36626b(aVar).mo36634a(aVar);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public T poll() {
        C12447a c;
        C12447a a = mo36623a();
        C12447a c2 = a.mo36637c();
        if (c2 != null) {
            T a2 = c2.mo36633a();
            mo36624a(c2);
            return a2;
        } else if (a == mo36627c()) {
            return null;
        } else {
            do {
                c = a.mo36637c();
            } while (c == null);
            T a3 = c.mo36633a();
            mo36624a(c);
            return a3;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36624a(C12447a<T> aVar) {
        this.f32279f.lazySet(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C12447a<T> mo36625b() {
        return (C12447a) this.f32279f.get();
    }

    public boolean offer(T t, T t2) {
        offer(t);
        offer(t2);
        return true;
    }
}
