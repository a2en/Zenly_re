package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C12918j;
import kotlin.C12918j.C12919a;
import kotlin.C12949k;
import kotlin.C12956q;
import kotlin.coroutines.C12874c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C12889f;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: kotlin.sequences.c */
final class C12981c<T> extends C12982d<T> implements Iterator<T>, Continuation<C12956q>, KMappedMarker {

    /* renamed from: e */
    private int f33579e;

    /* renamed from: f */
    private T f33580f;

    /* renamed from: g */
    private Iterator<? extends T> f33581g;

    /* renamed from: h */
    private Continuation<? super C12956q> f33582h;

    /* renamed from: b */
    private final T m33900b() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    public final void mo37381a(Continuation<? super C12956q> continuation) {
        this.f33582h = continuation;
    }

    public CoroutineContext getContext() {
        return C12874c.f33444e;
    }

    public boolean hasNext() {
        while (true) {
            int i = this.f33579e;
            if (i != 0) {
                if (i == 1) {
                    Iterator<? extends T> it = this.f33581g;
                    if (it == null) {
                        C12932j.m33814a();
                        throw null;
                    } else if (it.hasNext()) {
                        this.f33579e = 2;
                        return true;
                    } else {
                        this.f33581g = null;
                    }
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw m33899a();
                }
            }
            this.f33579e = 5;
            Continuation<? super C12956q> continuation = this.f33582h;
            if (continuation != null) {
                this.f33582h = null;
                C12956q qVar = C12956q.f33541a;
                C12919a aVar = C12918j.f33499e;
                C12918j.m33783a(qVar);
                continuation.resumeWith(qVar);
            } else {
                C12932j.m33814a();
                throw null;
            }
        }
    }

    public T next() {
        int i = this.f33579e;
        if (i == 0 || i == 1) {
            return m33900b();
        }
        if (i == 2) {
            this.f33579e = 1;
            Iterator<? extends T> it = this.f33581g;
            if (it != null) {
                return it.next();
            }
            C12932j.m33814a();
            throw null;
        } else if (i == 3) {
            this.f33579e = 0;
            T t = this.f33580f;
            this.f33580f = null;
            return t;
        } else {
            throw m33899a();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void resumeWith(Object obj) {
        C12949k.m33849a(obj);
        this.f33579e = 4;
    }

    /* renamed from: a */
    private final Throwable m33899a() {
        int i = this.f33579e;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected state of the iterator: ");
        sb.append(this.f33579e);
        return new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public Object mo37380a(T t, Continuation<? super C12956q> continuation) {
        this.f33580f = t;
        this.f33579e = 3;
        mo37381a(continuation);
        Object a = C12882d.m33726a();
        if (a == C12882d.m33726a()) {
            C12889f.m33745c(continuation);
        }
        return a;
    }
}
