package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C12932j;
import kotlinx.coroutines.C13149u;

/* renamed from: kotlinx.coroutines.internal.j */
public final class C13101j<E> {

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater f33688e;

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f33689f;

    /* renamed from: g */
    public static final C13107n f33690g = new C13107n("REMOVE_FROZEN");

    /* renamed from: h */
    public static final C13102a f33691h = new C13102a(null);
    private volatile Object _next = null;
    public volatile /* synthetic */ long _state$internal = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f33692a;

    /* renamed from: b */
    public /* synthetic */ AtomicReferenceArray f33693b;

    /* renamed from: c */
    private final int f33694c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final boolean f33695d;

    /* renamed from: kotlinx.coroutines.internal.j$a */
    public static final class C13102a {
        private C13102a() {
        }

        /* renamed from: a */
        public final int mo37606a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: a */
        public final long mo37607a(long j, int i) {
            return mo37608a(j, 1073741823) | (((long) i) << 0);
        }

        /* renamed from: a */
        public final long mo37608a(long j, long j2) {
            return j & (~j2);
        }

        /* renamed from: b */
        public final long mo37609b(long j, int i) {
            return mo37608a(j, 1152921503533105152L) | (((long) i) << 30);
        }

        public /* synthetic */ C13102a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.internal.j$b */
    public static final class C13103b {

        /* renamed from: a */
        public final int f33696a;

        public C13103b(int i) {
            this.f33696a = i;
        }
    }

    static {
        Class<C13101j> cls = C13101j.class;
        f33688e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f33689f = AtomicLongFieldUpdater.newUpdater(cls, "_state$internal");
    }

    public C13101j(int i, boolean z) {
        this.f33694c = i;
        this.f33695d = z;
        int i2 = this.f33694c;
        this.f33692a = i2 - 1;
        this.f33693b = new AtomicReferenceArray(i2);
        boolean z2 = false;
        String str = "Check failed.";
        if (this.f33692a <= 1073741823) {
            if ((this.f33694c & this.f33692a) == 0) {
                z2 = true;
            }
            if (!z2) {
                throw new IllegalStateException(str.toString());
            }
            return;
        }
        throw new IllegalStateException(str.toString());
    }

    /* renamed from: e */
    private final long m34194e() {
        long j;
        long j2;
        do {
            j = this._state$internal;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f33689f.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: c */
    public final C13101j<E> mo37604c() {
        return m34192b(m34194e());
    }

    /* renamed from: d */
    public final Object mo37605d() {
        Object obj;
        while (true) {
            long j = this._state$internal;
            if ((1152921504606846976L & j) == 0) {
                int i = (int) ((1073741823 & j) >> 0);
                if ((this.f33692a & ((int) ((1152921503533105152L & j) >> 30))) != (this.f33692a & i)) {
                    obj = this.f33693b.get(this.f33692a & i);
                    if (obj != null) {
                        if (!(obj instanceof C13103b)) {
                            int i2 = (i + 1) & 1073741823;
                            if (!f33689f.compareAndSet(this, j, f33691h.mo37607a(j, i2))) {
                                if (this.f33695d) {
                                    C13101j jVar = this;
                                    do {
                                        jVar = jVar.m34188a(i, i2);
                                    } while (jVar != null);
                                    break;
                                }
                            } else {
                                this.f33693b.set(this.f33692a & i, null);
                                break;
                            }
                        } else {
                            return null;
                        }
                    } else if (this.f33695d) {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                return f33690g;
            }
        }
        return obj;
    }

    /* renamed from: b */
    public final boolean mo37603b() {
        long j = this._state$internal;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* renamed from: a */
    private final C13101j<E> m34189a(int i, E e) {
        Object obj = this.f33693b.get(this.f33692a & i);
        if (!(obj instanceof C13103b) || ((C13103b) obj).f33696a != i) {
            return null;
        }
        this.f33693b.set(i & this.f33692a, e);
        return this;
    }

    /* renamed from: b */
    private final C13101j<E> m34192b(long j) {
        while (true) {
            C13101j<E> jVar = (C13101j) this._next;
            if (jVar != null) {
                return jVar;
            }
            f33688e.compareAndSet(this, null, m34190a(j));
        }
    }

    /* renamed from: a */
    private final C13101j<E> m34190a(long j) {
        C13101j<E> jVar = new C13101j<>(this.f33694c * 2, this.f33695d);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f33692a;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f33693b.get(i3 & i);
                if (obj == null) {
                    obj = new C13103b(i);
                }
                jVar.f33693b.set(jVar.f33692a & i, obj);
                i++;
            } else {
                jVar._state$internal = f33691h.mo37608a(j, 1152921504606846976L);
                return jVar;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo37602a() {
        long j;
        do {
            j = this._state$internal;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f33689f.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: a */
    public final int mo37601a(E e) {
        C12932j.m33818b(e, "element");
        while (true) {
            long j = this._state$internal;
            if ((3458764513820540928L & j) != 0) {
                return f33691h.mo37606a(j);
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f33692a;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (this.f33695d || this.f33693b.get(i2 & i3) == null) {
                int i4 = (i2 + 1) & 1073741823;
                if (f33689f.compareAndSet(this, j, f33691h.mo37609b(j, i4))) {
                    this.f33693b.set(i2 & i3, e);
                    C13101j jVar = this;
                    while ((jVar._state$internal & 1152921504606846976L) != 0) {
                        jVar = jVar.mo37604c().m34189a(i2, e);
                        if (jVar == null) {
                            break;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.f33694c;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
        return 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C13101j<E> m34188a(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state$internal;
            boolean z = false;
            i3 = (int) ((1073741823 & j) >> 0);
            if (C13149u.m34325a()) {
                if (i3 == i) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j) != 0) {
                return mo37604c();
            }
        } while (!f33689f.compareAndSet(this, j, f33691h.mo37607a(j, i2)));
        this.f33693b.set(this.f33692a & i3, null);
        return null;
    }
}
