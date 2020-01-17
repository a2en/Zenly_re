package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.common.internal.C9536j;
import com.facebook.common.internal.C9537k;
import com.facebook.common.logging.C9543a;
import com.facebook.common.memory.C9545a;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.memory.Pool;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class BasePool<V> implements Pool<V> {

    /* renamed from: a */
    private final Class<?> f25578a = getClass();

    /* renamed from: b */
    final MemoryTrimmableRegistry f25579b;

    /* renamed from: c */
    final C9745c0 f25580c;

    /* renamed from: d */
    final SparseArray<C9746d<V>> f25581d;

    /* renamed from: e */
    final Set<V> f25582e;

    /* renamed from: f */
    private boolean f25583f;

    /* renamed from: g */
    final C9736a f25584g;

    /* renamed from: h */
    final C9736a f25585h;

    /* renamed from: i */
    private final PoolStatsTracker f25586i;

    public static class InvalidSizeException extends RuntimeException {
        public InvalidSizeException(Object obj) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid size: ");
            sb.append(obj.toString());
            super(sb.toString());
        }
    }

    public static class InvalidValueException extends RuntimeException {
    }

    public static class PoolSizeViolationException extends RuntimeException {
        public PoolSizeViolationException(int i, int i2, int i3, int i4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Pool hard cap violation? Hard cap = ");
            sb.append(i);
            sb.append(" Used size = ");
            sb.append(i2);
            sb.append(" Free size = ");
            sb.append(i3);
            sb.append(" Request size = ");
            sb.append(i4);
            super(sb.toString());
        }
    }

    public static class SizeTooLargeException extends InvalidSizeException {
    }

    /* renamed from: com.facebook.imagepipeline.memory.BasePool$a */
    static class C9736a {

        /* renamed from: a */
        int f25587a;

        /* renamed from: b */
        int f25588b;

        C9736a() {
        }

        /* renamed from: a */
        public void mo26467a(int i) {
            int i2 = this.f25588b;
            if (i2 >= i) {
                int i3 = this.f25587a;
                if (i3 > 0) {
                    this.f25587a = i3 - 1;
                    this.f25588b = i2 - i;
                    return;
                }
            }
            C9543a.m23325d("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.f25588b), Integer.valueOf(this.f25587a));
        }

        /* renamed from: b */
        public void mo26468b(int i) {
            this.f25587a++;
            this.f25588b += i;
        }

        /* renamed from: a */
        public void mo26466a() {
            this.f25587a = 0;
            this.f25588b = 0;
        }
    }

    public BasePool(MemoryTrimmableRegistry memoryTrimmableRegistry, C9745c0 c0Var, PoolStatsTracker poolStatsTracker) {
        C9536j.m23271a(memoryTrimmableRegistry);
        this.f25579b = memoryTrimmableRegistry;
        C9536j.m23271a(c0Var);
        this.f25580c = c0Var;
        C9536j.m23271a(poolStatsTracker);
        this.f25586i = poolStatsTracker;
        this.f25581d = new SparseArray<>();
        if (this.f25580c.f25639d) {
            m24105g();
        } else {
            m24103b(new SparseIntArray(0));
        }
        this.f25582e = C9537k.m23283b();
        this.f25585h = new C9736a();
        this.f25584g = new C9736a();
    }

    /* renamed from: b */
    private synchronized void m24103b(SparseIntArray sparseIntArray) {
        C9536j.m23271a(sparseIntArray);
        this.f25581d.clear();
        SparseIntArray sparseIntArray2 = this.f25580c.f25638c;
        if (sparseIntArray2 != null) {
            for (int i = 0; i < sparseIntArray2.size(); i++) {
                int keyAt = sparseIntArray2.keyAt(i);
                this.f25581d.put(keyAt, new C9746d(mo26462e(keyAt), sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0), this.f25580c.f25639d));
            }
            this.f25583f = false;
        } else {
            this.f25583f = true;
        }
    }

    /* renamed from: f */
    private synchronized void mo26554f() {
        boolean z;
        if (mo26455b()) {
            if (this.f25585h.f25588b != 0) {
                z = false;
                C9536j.m23279b(z);
            }
        }
        z = true;
        C9536j.m23279b(z);
    }

    /* renamed from: g */
    private synchronized void m24105g() {
        SparseIntArray sparseIntArray = this.f25580c.f25638c;
        if (sparseIntArray != null) {
            m24102a(sparseIntArray);
            this.f25583f = false;
        } else {
            this.f25583f = true;
        }
    }

    /* renamed from: h */
    private synchronized C9746d<V> m24106h(int i) {
        return (C9746d) this.f25581d.get(i);
    }

    /* renamed from: i */
    private List<C9746d<V>> m24108i() {
        ArrayList arrayList = new ArrayList(this.f25581d.size());
        int size = this.f25581d.size();
        for (int i = 0; i < size; i++) {
            C9746d dVar = (C9746d) this.f25581d.valueAt(i);
            int i2 = dVar.f25641a;
            int i3 = dVar.f25642b;
            int d = dVar.mo26531d();
            if (dVar.mo26530c() > 0) {
                arrayList.add(dVar);
            }
            this.f25581d.setValueAt(i, new C9746d(mo26462e(i2), i3, d, this.f25580c.f25639d));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo26450a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26452a() {
        this.f25579b.registerMemoryTrimmable(this);
        this.f25586i.setBasePool(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26453a(V v);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo26454b(V v);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo26458c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo26459c(V v) {
        C9536j.m23271a(v);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo26460d(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo26461d() {
        int i;
        List list;
        synchronized (this) {
            if (this.f25580c.f25639d) {
                list = m24108i();
            } else {
                list = new ArrayList(this.f25581d.size());
                SparseIntArray sparseIntArray = new SparseIntArray();
                for (int i2 = 0; i2 < this.f25581d.size(); i2++) {
                    C9746d dVar = (C9746d) this.f25581d.valueAt(i2);
                    if (dVar.mo26530c() > 0) {
                        list.add(dVar);
                    }
                    sparseIntArray.put(this.f25581d.keyAt(i2), dVar.mo26531d());
                }
                m24103b(sparseIntArray);
            }
            this.f25585h.mo26466a();
            m24107h();
        }
        mo26458c();
        for (i = 0; i < list.size(); i++) {
            C9746d dVar2 = (C9746d) list.get(i);
            while (true) {
                Object g = dVar2.mo26534g();
                if (g == null) {
                    break;
                }
                mo26453a((V) g);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo26462e(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public synchronized void mo26463e() {
        if (mo26455b()) {
            mo26465g(this.f25580c.f25637b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0052, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0 = mo26450a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006f, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r5.f25584g.mo26467a(r2);
        r4 = mo26457c(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        if (r4 != null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        r4.mo26526a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        com.facebook.common.internal.C9542m.m23287b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        com.facebook.common.internal.C9536j.m23279b(r5.f25582e.add(r0));
        mo26463e();
        r5.f25586i.onAlloc(r2);
        m24107h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        if (com.facebook.common.logging.C9543a.m23311a(2) == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        com.facebook.common.logging.C9543a.m23302a(r5.f25578a, "get (alloc) (object, size) = (%x, %s)", (java.lang.Object) java.lang.Integer.valueOf(java.lang.System.identityHashCode(r0)), (java.lang.Object) java.lang.Integer.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b1, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V get(int r6) {
        /*
            r5 = this;
            r5.mo26554f()
            int r6 = r5.mo26460d(r6)
            monitor-enter(r5)
            com.facebook.imagepipeline.memory.d r0 = r5.mo26457c(r6)     // Catch:{ all -> 0x00ca }
            r1 = 2
            if (r0 == 0) goto L_0x0053
            java.lang.Object r2 = r5.mo26451a(r0)     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x0053
            java.util.Set<V> r6 = r5.f25582e     // Catch:{ all -> 0x00ca }
            boolean r6 = r6.add(r2)     // Catch:{ all -> 0x00ca }
            com.facebook.common.internal.C9536j.m23279b(r6)     // Catch:{ all -> 0x00ca }
            int r6 = r5.mo26454b((V) r2)     // Catch:{ all -> 0x00ca }
            int r0 = r5.mo26462e(r6)     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.BasePool$a r3 = r5.f25584g     // Catch:{ all -> 0x00ca }
            r3.mo26468b(r0)     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.BasePool$a r3 = r5.f25585h     // Catch:{ all -> 0x00ca }
            r3.mo26467a(r0)     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.PoolStatsTracker r3 = r5.f25586i     // Catch:{ all -> 0x00ca }
            r3.onValueReuse(r0)     // Catch:{ all -> 0x00ca }
            r5.m24107h()     // Catch:{ all -> 0x00ca }
            boolean r0 = com.facebook.common.logging.C9543a.m23311a(r1)     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x0051
            java.lang.Class<?> r0 = r5.f25578a     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "get (reuse) (object, size) = (%x, %s)"
            int r3 = java.lang.System.identityHashCode(r2)     // Catch:{ all -> 0x00ca }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00ca }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00ca }
            com.facebook.common.logging.C9543a.m23302a(r0, r1, r3, r6)     // Catch:{ all -> 0x00ca }
        L_0x0051:
            monitor-exit(r5)     // Catch:{ all -> 0x00ca }
            return r2
        L_0x0053:
            int r2 = r5.mo26462e(r6)     // Catch:{ all -> 0x00ca }
            boolean r3 = r5.mo26456b(r2)     // Catch:{ all -> 0x00ca }
            if (r3 == 0) goto L_0x00b8
            com.facebook.imagepipeline.memory.BasePool$a r3 = r5.f25584g     // Catch:{ all -> 0x00ca }
            r3.mo26468b(r2)     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x0067
            r0.mo26532e()     // Catch:{ all -> 0x00ca }
        L_0x0067:
            monitor-exit(r5)     // Catch:{ all -> 0x00ca }
            r0 = 0
            java.lang.Object r0 = r5.mo26450a(r6)     // Catch:{ all -> 0x006e }
            goto L_0x0082
        L_0x006e:
            r3 = move-exception
            monitor-enter(r5)
            com.facebook.imagepipeline.memory.BasePool$a r4 = r5.f25584g     // Catch:{ all -> 0x00b5 }
            r4.mo26467a(r2)     // Catch:{ all -> 0x00b5 }
            com.facebook.imagepipeline.memory.d r4 = r5.mo26457c(r6)     // Catch:{ all -> 0x00b5 }
            if (r4 == 0) goto L_0x007e
            r4.mo26526a()     // Catch:{ all -> 0x00b5 }
        L_0x007e:
            monitor-exit(r5)     // Catch:{ all -> 0x00b5 }
            com.facebook.common.internal.C9542m.m23287b(r3)
        L_0x0082:
            monitor-enter(r5)
            java.util.Set<V> r3 = r5.f25582e     // Catch:{ all -> 0x00b2 }
            boolean r3 = r3.add(r0)     // Catch:{ all -> 0x00b2 }
            com.facebook.common.internal.C9536j.m23279b(r3)     // Catch:{ all -> 0x00b2 }
            r5.mo26463e()     // Catch:{ all -> 0x00b2 }
            com.facebook.imagepipeline.memory.PoolStatsTracker r3 = r5.f25586i     // Catch:{ all -> 0x00b2 }
            r3.onAlloc(r2)     // Catch:{ all -> 0x00b2 }
            r5.m24107h()     // Catch:{ all -> 0x00b2 }
            boolean r1 = com.facebook.common.logging.C9543a.m23311a(r1)     // Catch:{ all -> 0x00b2 }
            if (r1 == 0) goto L_0x00b0
            java.lang.Class<?> r1 = r5.f25578a     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = "get (alloc) (object, size) = (%x, %s)"
            int r3 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00b2 }
            com.facebook.common.logging.C9543a.m23302a(r1, r2, r3, r6)     // Catch:{ all -> 0x00b2 }
        L_0x00b0:
            monitor-exit(r5)     // Catch:{ all -> 0x00b2 }
            return r0
        L_0x00b2:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b2 }
            throw r6
        L_0x00b5:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b5 }
            throw r6
        L_0x00b8:
            com.facebook.imagepipeline.memory.BasePool$PoolSizeViolationException r6 = new com.facebook.imagepipeline.memory.BasePool$PoolSizeViolationException     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.c0 r0 = r5.f25580c     // Catch:{ all -> 0x00ca }
            int r0 = r0.f25636a     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.BasePool$a r1 = r5.f25584g     // Catch:{ all -> 0x00ca }
            int r1 = r1.f25588b     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.BasePool$a r3 = r5.f25585h     // Catch:{ all -> 0x00ca }
            int r3 = r3.f25588b     // Catch:{ all -> 0x00ca }
            r6.<init>(r0, r1, r3, r2)     // Catch:{ all -> 0x00ca }
            throw r6     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ca }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.BasePool.get(int):java.lang.Object");
    }

    public void release(V v) {
        C9536j.m23271a(v);
        int b = mo26454b(v);
        int e = mo26462e(b);
        synchronized (this) {
            C9746d h = m24106h(b);
            if (!this.f25582e.remove(v)) {
                C9543a.m23306a(this.f25578a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(b));
                mo26453a(v);
                this.f25586i.onFree(e);
            } else {
                if (h != null && !h.mo26533f() && !mo26455b()) {
                    if (mo26459c(v)) {
                        h.mo26529b(v);
                        this.f25585h.mo26468b(e);
                        this.f25584g.mo26467a(e);
                        this.f25586i.onValueRelease(e);
                        if (C9543a.m23311a(2)) {
                            C9543a.m23302a(this.f25578a, "release (reuse) (object, size) = (%x, %s)", (Object) Integer.valueOf(System.identityHashCode(v)), (Object) Integer.valueOf(b));
                        }
                    }
                }
                if (h != null) {
                    h.mo26526a();
                }
                if (C9543a.m23311a(2)) {
                    C9543a.m23302a(this.f25578a, "release (free) (object, size) = (%x, %s)", (Object) Integer.valueOf(System.identityHashCode(v)), (Object) Integer.valueOf(b));
                }
                mo26453a(v);
                this.f25584g.mo26467a(e);
                this.f25586i.onFree(e);
            }
            m24107h();
        }
    }

    public void trim(C9545a aVar) {
        mo26461d();
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    /* renamed from: h */
    private void m24107h() {
        if (C9543a.m23311a(2)) {
            C9543a.m23304a(this.f25578a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f25584g.f25587a), Integer.valueOf(this.f25584g.f25588b), Integer.valueOf(this.f25585h.f25587a), Integer.valueOf(this.f25585h.f25588b));
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.facebook.imagepipeline.memory.C9746d<V> mo26457c(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.util.SparseArray<com.facebook.imagepipeline.memory.d<V>> r0 = r3.f25581d     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002f }
            com.facebook.imagepipeline.memory.d r0 = (com.facebook.imagepipeline.memory.C9746d) r0     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x002d
            boolean r1 = r3.f25583f     // Catch:{ all -> 0x002f }
            if (r1 != 0) goto L_0x0010
            goto L_0x002d
        L_0x0010:
            r0 = 2
            boolean r0 = com.facebook.common.logging.C9543a.m23311a(r0)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0022
            java.lang.Class<?> r0 = r3.f25578a     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "creating new bucket %s"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x002f }
            com.facebook.common.logging.C9543a.m23313b(r0, r1, r2)     // Catch:{ all -> 0x002f }
        L_0x0022:
            com.facebook.imagepipeline.memory.d r0 = r3.mo26464f(r4)     // Catch:{ all -> 0x002f }
            android.util.SparseArray<com.facebook.imagepipeline.memory.d<V>> r1 = r3.f25581d     // Catch:{ all -> 0x002f }
            r1.put(r4, r0)     // Catch:{ all -> 0x002f }
            monitor-exit(r3)
            return r0
        L_0x002d:
            monitor-exit(r3)
            return r0
        L_0x002f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.BasePool.mo26457c(int):com.facebook.imagepipeline.memory.d");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized V mo26451a(C9746d<V> dVar) {
        return dVar.mo26528b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C9746d<V> mo26464f(int i) {
        return new C9746d<>(mo26462e(i), Integer.MAX_VALUE, 0, this.f25580c.f25639d);
    }

    /* renamed from: a */
    private void m24102a(SparseIntArray sparseIntArray) {
        this.f25581d.clear();
        for (int i = 0; i < sparseIntArray.size(); i++) {
            int keyAt = sparseIntArray.keyAt(i);
            this.f25581d.put(keyAt, new C9746d(mo26462e(keyAt), sparseIntArray.valueAt(i), 0, this.f25580c.f25639d));
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo26465g(int r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.facebook.imagepipeline.memory.BasePool$a r0 = r7.f25584g     // Catch:{ all -> 0x008e }
            int r0 = r0.f25588b     // Catch:{ all -> 0x008e }
            com.facebook.imagepipeline.memory.BasePool$a r1 = r7.f25585h     // Catch:{ all -> 0x008e }
            int r1 = r1.f25588b     // Catch:{ all -> 0x008e }
            int r0 = r0 + r1
            int r0 = r0 - r8
            com.facebook.imagepipeline.memory.BasePool$a r1 = r7.f25585h     // Catch:{ all -> 0x008e }
            int r1 = r1.f25588b     // Catch:{ all -> 0x008e }
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x008e }
            if (r0 > 0) goto L_0x0017
            monitor-exit(r7)
            return
        L_0x0017:
            r1 = 2
            boolean r2 = com.facebook.common.logging.C9543a.m23311a(r1)     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x003a
            java.lang.Class<?> r2 = r7.f25578a     // Catch:{ all -> 0x008e }
            java.lang.String r3 = "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x008e }
            com.facebook.imagepipeline.memory.BasePool$a r5 = r7.f25584g     // Catch:{ all -> 0x008e }
            int r5 = r5.f25588b     // Catch:{ all -> 0x008e }
            com.facebook.imagepipeline.memory.BasePool$a r6 = r7.f25585h     // Catch:{ all -> 0x008e }
            int r6 = r6.f25588b     // Catch:{ all -> 0x008e }
            int r5 = r5 + r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x008e }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x008e }
            com.facebook.common.logging.C9543a.m23303a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x008e }
        L_0x003a:
            r7.m24107h()     // Catch:{ all -> 0x008e }
            r2 = 0
        L_0x003e:
            android.util.SparseArray<com.facebook.imagepipeline.memory.d<V>> r3 = r7.f25581d     // Catch:{ all -> 0x008e }
            int r3 = r3.size()     // Catch:{ all -> 0x008e }
            if (r2 >= r3) goto L_0x006b
            if (r0 > 0) goto L_0x0049
            goto L_0x006b
        L_0x0049:
            android.util.SparseArray<com.facebook.imagepipeline.memory.d<V>> r3 = r7.f25581d     // Catch:{ all -> 0x008e }
            java.lang.Object r3 = r3.valueAt(r2)     // Catch:{ all -> 0x008e }
            com.facebook.imagepipeline.memory.d r3 = (com.facebook.imagepipeline.memory.C9746d) r3     // Catch:{ all -> 0x008e }
        L_0x0051:
            if (r0 <= 0) goto L_0x0068
            java.lang.Object r4 = r3.mo26534g()     // Catch:{ all -> 0x008e }
            if (r4 != 0) goto L_0x005a
            goto L_0x0068
        L_0x005a:
            r7.mo26453a((V) r4)     // Catch:{ all -> 0x008e }
            int r4 = r3.f25641a     // Catch:{ all -> 0x008e }
            int r0 = r0 - r4
            com.facebook.imagepipeline.memory.BasePool$a r4 = r7.f25585h     // Catch:{ all -> 0x008e }
            int r5 = r3.f25641a     // Catch:{ all -> 0x008e }
            r4.mo26467a(r5)     // Catch:{ all -> 0x008e }
            goto L_0x0051
        L_0x0068:
            int r2 = r2 + 1
            goto L_0x003e
        L_0x006b:
            r7.m24107h()     // Catch:{ all -> 0x008e }
            boolean r0 = com.facebook.common.logging.C9543a.m23311a(r1)     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x008c
            java.lang.Class<?> r0 = r7.f25578a     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "trimToSize: TargetSize = %d; Final Size = %d"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x008e }
            com.facebook.imagepipeline.memory.BasePool$a r2 = r7.f25584g     // Catch:{ all -> 0x008e }
            int r2 = r2.f25588b     // Catch:{ all -> 0x008e }
            com.facebook.imagepipeline.memory.BasePool$a r3 = r7.f25585h     // Catch:{ all -> 0x008e }
            int r3 = r3.f25588b     // Catch:{ all -> 0x008e }
            int r2 = r2 + r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x008e }
            com.facebook.common.logging.C9543a.m23302a(r0, r1, r8, r2)     // Catch:{ all -> 0x008e }
        L_0x008c:
            monitor-exit(r7)
            return
        L_0x008e:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.BasePool.mo26465g(int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized boolean mo26455b() {
        boolean z;
        z = this.f25584g.f25588b + this.f25585h.f25588b > this.f25580c.f25637b;
        if (z) {
            this.f25586i.onSoftCapReached();
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized boolean mo26456b(int i) {
        int i2 = this.f25580c.f25636a;
        if (i > i2 - this.f25584g.f25588b) {
            this.f25586i.onHardCapReached();
            return false;
        }
        int i3 = this.f25580c.f25637b;
        if (i > i3 - (this.f25584g.f25588b + this.f25585h.f25588b)) {
            mo26465g(i3 - i);
        }
        if (i <= i2 - (this.f25584g.f25588b + this.f25585h.f25588b)) {
            return true;
        }
        this.f25586i.onHardCapReached();
        return false;
    }
}
