package p389io.reactivex.disposables;

import java.util.ArrayList;
import java.util.List;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.exceptions.CompositeException;
import p389io.reactivex.internal.disposables.DisposableContainer;
import p389io.reactivex.internal.util.C12757g;
import p389io.reactivex.internal.util.C12764j;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.disposables.b */
public final class C12275b implements Disposable, DisposableContainer {

    /* renamed from: e */
    C12764j<Disposable> f31943e;

    /* renamed from: f */
    volatile boolean f31944f;

    public C12275b() {
    }

    /* renamed from: a */
    public boolean mo36403a(Disposable... disposableArr) {
        C12324b.m32836a(disposableArr, "disposables is null");
        if (!this.f31944f) {
            synchronized (this) {
                if (!this.f31944f) {
                    C12764j<Disposable> jVar = this.f31943e;
                    if (jVar == null) {
                        jVar = new C12764j<>(disposableArr.length + 1);
                        this.f31943e = jVar;
                    }
                    for (Disposable disposable : disposableArr) {
                        C12324b.m32836a(disposable, "A Disposable in the disposables array is null");
                        jVar.mo36939a(disposable);
                    }
                    return true;
                }
            }
        }
        for (Disposable dispose : disposableArr) {
            dispose.dispose();
        }
        return false;
    }

    public boolean add(Disposable disposable) {
        C12324b.m32836a(disposable, "disposable is null");
        if (!this.f31944f) {
            synchronized (this) {
                if (!this.f31944f) {
                    C12764j<Disposable> jVar = this.f31943e;
                    if (jVar == null) {
                        jVar = new C12764j<>();
                        this.f31943e = jVar;
                    }
                    jVar.mo36939a(disposable);
                    return true;
                }
            }
        }
        disposable.dispose();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0021, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean delete(p389io.reactivex.disposables.Disposable r3) {
        /*
            r2 = this;
            java.lang.String r0 = "disposables is null"
            p389io.reactivex.p393i.p394a.C12324b.m32836a(r3, r0)
            boolean r0 = r2.f31944f
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f31944f     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            io.reactivex.internal.util.j<io.reactivex.disposables.Disposable> r0 = r2.f31943e     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.mo36942b(r3)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r3 = 1
            return r3
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.disposables.C12275b.delete(io.reactivex.disposables.Disposable):boolean");
    }

    public void dispose() {
        if (!this.f31944f) {
            synchronized (this) {
                if (!this.f31944f) {
                    this.f31944f = true;
                    C12764j<Disposable> jVar = this.f31943e;
                    this.f31943e = null;
                    mo36402a(jVar);
                }
            }
        }
    }

    public boolean isDisposed() {
        return this.f31944f;
    }

    public boolean remove(Disposable disposable) {
        if (!delete(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
    }

    public C12275b(Disposable... disposableArr) {
        C12324b.m32836a(disposableArr, "disposables is null");
        this.f31943e = new C12764j<>(disposableArr.length + 1);
        for (Disposable disposable : disposableArr) {
            C12324b.m32836a(disposable, "A Disposable in the disposables array is null");
            this.f31943e.mo36939a(disposable);
        }
    }

    /* renamed from: a */
    public void mo36401a() {
        if (!this.f31944f) {
            synchronized (this) {
                if (!this.f31944f) {
                    C12764j<Disposable> jVar = this.f31943e;
                    this.f31943e = null;
                    mo36402a(jVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36402a(C12764j<Disposable> jVar) {
        Object[] a;
        if (jVar != null) {
            List list = null;
            for (Object obj : jVar.mo36940a()) {
                if (obj instanceof Disposable) {
                    try {
                        ((Disposable) obj).dispose();
                    } catch (Throwable th) {
                        C12285a.m32748b(th);
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(th);
                    }
                }
            }
            if (list == null) {
                return;
            }
            if (list.size() == 1) {
                throw C12757g.m33354b((Throwable) list.get(0));
            }
            throw new CompositeException((Iterable<? extends Throwable>) list);
        }
    }
}
