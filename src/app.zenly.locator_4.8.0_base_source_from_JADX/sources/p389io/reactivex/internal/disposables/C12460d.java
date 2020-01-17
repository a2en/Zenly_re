package p389io.reactivex.internal.disposables;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.exceptions.CompositeException;
import p389io.reactivex.internal.util.C12757g;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.internal.disposables.d */
public final class C12460d implements Disposable, DisposableContainer {

    /* renamed from: e */
    List<Disposable> f32318e;

    /* renamed from: f */
    volatile boolean f32319f;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36652a(List<Disposable> list) {
        if (list != null) {
            ArrayList arrayList = null;
            for (Disposable dispose : list) {
                try {
                    dispose.dispose();
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw C12757g.m33354b((Throwable) arrayList.get(0));
            }
            throw new CompositeException((Iterable<? extends Throwable>) arrayList);
        }
    }

    public boolean add(Disposable disposable) {
        C12324b.m32836a(disposable, "d is null");
        if (!this.f32319f) {
            synchronized (this) {
                if (!this.f32319f) {
                    List list = this.f32318e;
                    if (list == null) {
                        list = new LinkedList();
                        this.f32318e = list;
                    }
                    list.add(disposable);
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
            java.lang.String r0 = "Disposable item is null"
            p389io.reactivex.p393i.p394a.C12324b.m32836a(r3, r0)
            boolean r0 = r2.f32319f
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f32319f     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            java.util.List<io.reactivex.disposables.Disposable> r0 = r2.f32318e     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0022 }
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
        throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.internal.disposables.C12460d.delete(io.reactivex.disposables.Disposable):boolean");
    }

    public void dispose() {
        if (!this.f32319f) {
            synchronized (this) {
                if (!this.f32319f) {
                    this.f32319f = true;
                    List<Disposable> list = this.f32318e;
                    this.f32318e = null;
                    mo36652a(list);
                }
            }
        }
    }

    public boolean isDisposed() {
        return this.f32319f;
    }

    public boolean remove(Disposable disposable) {
        if (!delete(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
    }
}
