package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C12932j;
import kotlinx.coroutines.Delay.C13047a;
import kotlinx.coroutines.internal.C13101j;
import kotlinx.coroutines.internal.C13116s;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* renamed from: kotlinx.coroutines.e0 */
public abstract class C13071e0 extends C13077f0 implements Delay {

    /* renamed from: h */
    private static final AtomicReferenceFieldUpdater f33653h;

    /* renamed from: i */
    private static final AtomicReferenceFieldUpdater f33654i;
    private volatile Object _delayed = null;
    private volatile Object _queue = null;
    /* access modifiers changed from: private */
    public volatile boolean isCompleted;

    /* renamed from: kotlinx.coroutines.e0$a */
    private final class C13072a extends C13074c {

        /* renamed from: h */
        private final CancellableContinuation<C12956q> f33655h;

        /* renamed from: i */
        final /* synthetic */ C13071e0 f33656i;

        public C13072a(C13071e0 e0Var, long j, CancellableContinuation<? super C12956q> cancellableContinuation) {
            C12932j.m33818b(cancellableContinuation, "cont");
            this.f33656i = e0Var;
            super(j);
            this.f33655h = cancellableContinuation;
        }

        public void run() {
            this.f33655h.resumeUndispatched(this.f33656i, C12956q.f33541a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(this.f33655h.toString());
            return sb.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.e0$b */
    private static final class C13073b extends C13074c {

        /* renamed from: h */
        private final Runnable f33657h;

        public C13073b(long j, Runnable runnable) {
            C12932j.m33818b(runnable, "block");
            super(j);
            this.f33657h = runnable;
        }

        public void run() {
            this.f33657h.run();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(this.f33657h.toString());
            return sb.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.e0$c */
    public static abstract class C13074c implements Runnable, Comparable<C13074c>, DisposableHandle, ThreadSafeHeapNode {

        /* renamed from: e */
        private Object f33658e;

        /* renamed from: f */
        private int f33659f = -1;

        /* renamed from: g */
        public long f33660g;

        public C13074c(long j) {
            this.f33660g = j;
        }

        /* renamed from: a */
        public int compareTo(C13074c cVar) {
            C12932j.m33818b(cVar, "other");
            int i = ((this.f33660g - cVar.f33660g) > 0 ? 1 : ((this.f33660g - cVar.f33660g) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        public final synchronized void dispose() {
            Object obj = this.f33658e;
            if (obj != C13081h0.f33664a) {
                if (!(obj instanceof C13075d)) {
                    obj = null;
                }
                C13075d dVar = (C13075d) obj;
                if (dVar != null) {
                    dVar.mo37620b(this);
                }
                this.f33658e = C13081h0.f33664a;
            }
        }

        public C13116s<?> getHeap() {
            Object obj = this.f33658e;
            if (!(obj instanceof C13116s)) {
                obj = null;
            }
            return (C13116s) obj;
        }

        public int getIndex() {
            return this.f33659f;
        }

        public void setHeap(C13116s<?> sVar) {
            if (this.f33658e != C13081h0.f33664a) {
                this.f33658e = sVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public void setIndex(int i) {
            this.f33659f = i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Delayed[nanos=");
            sb.append(this.f33660g);
            sb.append(']');
            return sb.toString();
        }

        /* renamed from: a */
        public final boolean mo37561a(long j) {
            return j - this.f33660g >= 0;
        }

        /* renamed from: a */
        public final synchronized int mo37559a(long j, C13075d dVar, C13071e0 e0Var) {
            C12932j.m33818b(dVar, "delayed");
            C12932j.m33818b(e0Var, "eventLoop");
            if (this.f33658e == C13081h0.f33664a) {
                return 2;
            }
            synchronized (dVar) {
                C13074c cVar = (C13074c) dVar.mo37616a();
                if (e0Var.isCompleted) {
                    return 1;
                }
                if (cVar == null) {
                    dVar.f33661b = j;
                } else {
                    long j2 = cVar.f33660g;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - dVar.f33661b > 0) {
                        dVar.f33661b = j;
                    }
                }
                if (this.f33660g - dVar.f33661b < 0) {
                    this.f33660g = dVar.f33661b;
                }
                dVar.mo37618a(this);
                return 0;
            }
        }
    }

    /* renamed from: kotlinx.coroutines.e0$d */
    public static final class C13075d extends C13116s<C13074c> {

        /* renamed from: b */
        public long f33661b;

        public C13075d(long j) {
            this.f33661b = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C13071e0> cls2 = C13071e0.class;
        f33653h = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f33654i = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* renamed from: c */
    private final int m34118c(long j, C13074c cVar) {
        if (this.isCompleted) {
            return 1;
        }
        C13075d dVar = (C13075d) this._delayed;
        if (dVar == null) {
            f33654i.compareAndSet(this, null, new C13075d(j));
            Object obj = this._delayed;
            if (obj != null) {
                dVar = (C13075d) obj;
            } else {
                C12932j.m33814a();
                throw null;
            }
        }
        return cVar.mo37559a(j, dVar, this);
    }

    /* renamed from: k */
    private final void m34119k() {
        if (!C13149u.m34325a() || this.isCompleted) {
            while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    if (f33653h.compareAndSet(this, null, C13081h0.f33665b)) {
                        return;
                    }
                } else if (obj instanceof C13101j) {
                    ((C13101j) obj).mo37602a();
                    return;
                } else if (obj != C13081h0.f33665b) {
                    C13101j jVar = new C13101j(8, true);
                    if (obj != null) {
                        jVar.mo37601a((Runnable) obj);
                        if (f33653h.compareAndSet(this, obj, jVar)) {
                            return;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: l */
    private final Runnable m34120l() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C13101j) {
                if (obj != null) {
                    C13101j jVar = (C13101j) obj;
                    Object d = jVar.mo37605d();
                    if (d != C13101j.f33690g) {
                        return (Runnable) d;
                    }
                    f33653h.compareAndSet(this, obj, jVar.mo37604c());
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == C13081h0.f33665b) {
                return null;
            } else {
                if (f33653h.compareAndSet(this, obj, null)) {
                    if (obj != null) {
                        return (Runnable) obj;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    /* renamed from: m */
    private final void m34121m() {
        TimeSource a = C13053a1.m34076a();
        long nanoTime = a != null ? a.nanoTime() : System.nanoTime();
        while (true) {
            C13075d dVar = (C13075d) this._delayed;
            if (dVar != null) {
                C13074c cVar = (C13074c) dVar.mo37623e();
                if (cVar != null) {
                    mo37567a(nanoTime, cVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo37552b(long j, C13074c cVar) {
        C12932j.m33818b(cVar, "delayedTask");
        int c = m34118c(j, cVar);
        if (c != 0) {
            if (c == 1) {
                mo37567a(j, cVar);
            } else if (c != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (m34115a(cVar)) {
            mo37568g();
        }
    }

    public Object delay(long j, Continuation<? super C12956q> continuation) {
        return C13047a.m34056a((Delay) this, j, continuation);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo37544e() {
        C13160z0.f33770b.mo37698b();
        this.isCompleted = true;
        m34119k();
        do {
        } while (mo37554i() <= 0);
        m34121m();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r0 == kotlinx.coroutines.C13081h0.m34142a()) goto L_0x001a;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo37553h() {
        /*
            r4 = this;
            boolean r0 = r4.mo37542c()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.Object r0 = r4._delayed
            kotlinx.coroutines.e0$d r0 = (kotlinx.coroutines.C13071e0.C13075d) r0
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.mo37621c()
            if (r0 != 0) goto L_0x0015
            return r1
        L_0x0015:
            java.lang.Object r0 = r4._queue
            r2 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001a:
            r1 = 1
            goto L_0x002e
        L_0x001c:
            boolean r3 = r0 instanceof kotlinx.coroutines.internal.C13101j
            if (r3 == 0) goto L_0x0027
            kotlinx.coroutines.internal.j r0 = (kotlinx.coroutines.internal.C13101j) r0
            boolean r1 = r0.mo37603b()
            goto L_0x002e
        L_0x0027:
            kotlinx.coroutines.internal.n r3 = kotlinx.coroutines.C13081h0.f33665b
            if (r0 != r3) goto L_0x002e
            goto L_0x001a
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13071e0.mo37553h():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0055  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo37554i() {
        /*
            r7 = this;
            boolean r0 = r7.mo37543d()
            if (r0 == 0) goto L_0x000b
            long r0 = r7.mo37537a()
            return r0
        L_0x000b:
            java.lang.Object r0 = r7._delayed
            kotlinx.coroutines.e0$d r0 = (kotlinx.coroutines.C13071e0.C13075d) r0
            if (r0 == 0) goto L_0x004f
            boolean r1 = r0.mo37621c()
            if (r1 != 0) goto L_0x004f
            kotlinx.coroutines.TimeSource r1 = kotlinx.coroutines.C13053a1.m34076a()
            if (r1 == 0) goto L_0x0022
            long r1 = r1.nanoTime()
            goto L_0x0026
        L_0x0022:
            long r1 = java.lang.System.nanoTime()
        L_0x0026:
            monitor-enter(r0)
            kotlinx.coroutines.internal.ThreadSafeHeapNode r3 = r0.mo37616a()     // Catch:{ all -> 0x004c }
            r4 = 0
            if (r3 == 0) goto L_0x0046
            kotlinx.coroutines.e0$c r3 = (kotlinx.coroutines.C13071e0.C13074c) r3     // Catch:{ all -> 0x004c }
            boolean r5 = r3.mo37561a(r1)     // Catch:{ all -> 0x004c }
            r6 = 0
            if (r5 == 0) goto L_0x003c
            boolean r3 = r7.m34117b(r3)     // Catch:{ all -> 0x004c }
            goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            if (r3 == 0) goto L_0x0044
            kotlinx.coroutines.internal.ThreadSafeHeapNode r3 = r0.mo37617a(r6)     // Catch:{ all -> 0x004c }
            r4 = r3
        L_0x0044:
            monitor-exit(r0)
            goto L_0x0047
        L_0x0046:
            monitor-exit(r0)
        L_0x0047:
            kotlinx.coroutines.e0$c r4 = (kotlinx.coroutines.C13071e0.C13074c) r4
            if (r4 == 0) goto L_0x004f
            goto L_0x0026
        L_0x004c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004f:
            java.lang.Runnable r0 = r7.m34120l()
            if (r0 == 0) goto L_0x0058
            r0.run()
        L_0x0058:
            long r0 = r7.mo37537a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13071e0.mo37554i():long");
    }

    public DisposableHandle invokeOnTimeout(long j, Runnable runnable) {
        C12932j.m33818b(runnable, "block");
        return C13047a.m34057a((Delay) this, j, runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo37555j() {
        this._queue = null;
        this._delayed = null;
    }

    public void scheduleResumeAfterDelay(long j, CancellableContinuation<? super C12956q> cancellableContinuation) {
        C12932j.m33818b(cancellableContinuation, "continuation");
        long a = C13081h0.m34141a(j);
        if (a < 4611686018427387903L) {
            TimeSource a2 = C13053a1.m34076a();
            long nanoTime = a2 != null ? a2.nanoTime() : System.nanoTime();
            C13072a aVar = new C13072a(this, a + nanoTime, cancellableContinuation);
            C13076f.m34134a(cancellableContinuation, aVar);
            mo37552b(nanoTime, aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo37537a() {
        if (super.mo37537a() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C13101j) {
                if (!((C13101j) obj).mo37603b()) {
                    return 0;
                }
            } else if (obj == C13081h0.f33665b) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        C13075d dVar = (C13075d) this._delayed;
        if (dVar != null) {
            C13074c cVar = (C13074c) dVar.mo37622d();
            if (cVar != null) {
                long j = cVar.f33660g;
                TimeSource a = C13053a1.m34076a();
                return C12973l.m33887a(j - (a != null ? a.nanoTime() : System.nanoTime()), 0);
            }
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: b */
    private final boolean m34117b(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this.isCompleted) {
                return false;
            }
            if (obj == null) {
                if (f33653h.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C13101j) {
                if (obj != null) {
                    C13101j jVar = (C13101j) obj;
                    int a = jVar.mo37601a(runnable);
                    if (a == 0) {
                        return true;
                    }
                    if (a == 1) {
                        f33653h.compareAndSet(this, obj, jVar.mo37604c());
                    } else if (a == 2) {
                        return false;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == C13081h0.f33665b) {
                return false;
            } else {
                C13101j jVar2 = new C13101j(8, true);
                if (obj != null) {
                    jVar2.mo37601a((Runnable) obj);
                    jVar2.mo37601a(runnable);
                    if (f33653h.compareAndSet(this, obj, jVar2)) {
                        return true;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final DisposableHandle mo37550a(long j, Runnable runnable) {
        C12932j.m33818b(runnable, "block");
        long a = C13081h0.m34141a(j);
        if (a >= 4611686018427387903L) {
            return C13152v0.f33756e;
        }
        TimeSource a2 = C13053a1.m34076a();
        long nanoTime = a2 != null ? a2.nanoTime() : System.nanoTime();
        C13073b bVar = new C13073b(a + nanoTime, runnable);
        mo37552b(nanoTime, bVar);
        return bVar;
    }

    /* renamed from: a */
    public final void mo37495a(CoroutineContext coroutineContext, Runnable runnable) {
        C12932j.m33818b(coroutineContext, "context");
        C12932j.m33818b(runnable, "block");
        mo37551a(runnable);
    }

    /* renamed from: a */
    public final void mo37551a(Runnable runnable) {
        C12932j.m33818b(runnable, "task");
        if (m34117b(runnable)) {
            mo37568g();
        } else {
            C13153w.f33758k.mo37551a(runnable);
        }
    }

    /* renamed from: a */
    private final boolean m34115a(C13074c cVar) {
        C13075d dVar = (C13075d) this._delayed;
        return (dVar != null ? (C13074c) dVar.mo37622d() : null) == cVar;
    }
}
