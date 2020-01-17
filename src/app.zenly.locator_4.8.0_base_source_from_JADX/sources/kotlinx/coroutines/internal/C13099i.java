package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import kotlinx.coroutines.C13149u;

/* renamed from: kotlinx.coroutines.internal.i */
public class C13099i {

    /* renamed from: e */
    static final AtomicReferenceFieldUpdater f33683e;

    /* renamed from: f */
    static final AtomicReferenceFieldUpdater f33684f;

    /* renamed from: g */
    private static final AtomicReferenceFieldUpdater f33685g;
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef = null;

    /* renamed from: kotlinx.coroutines.internal.i$a */
    public static abstract class C13100a extends C13087d<C13099i> {

        /* renamed from: b */
        public C13099i f33686b;

        /* renamed from: c */
        public final C13099i f33687c;

        public C13100a(C13099i iVar) {
            C12932j.m33818b(iVar, "newNode");
            this.f33687c = iVar;
        }

        /* renamed from: a */
        public void mo37581a(C13099i iVar, Object obj) {
            C12932j.m33818b(iVar, "affected");
            boolean z = obj == null;
            C13099i iVar2 = z ? this.f33687c : this.f33686b;
            if (iVar2 != null && C13099i.f33683e.compareAndSet(iVar, this, iVar2) && z) {
                C13099i iVar3 = this.f33687c;
                C13099i iVar4 = this.f33686b;
                if (iVar4 != null) {
                    iVar3.m34171b(iVar4);
                } else {
                    C12932j.m33814a();
                    throw null;
                }
            }
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C13099i> cls2 = C13099i.class;
        f33683e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f33684f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f33685g = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* renamed from: c */
    private final void m34172c(C13099i iVar) {
        mo37597e();
        iVar.m34169a(C13098h.m34168a(this._prev), (C13104k) null);
    }

    /* renamed from: h */
    private final C13099i m34173h() {
        C13099i iVar = this;
        while (!(iVar instanceof C13097g)) {
            iVar = iVar.mo37594b();
            if (C13149u.m34325a()) {
                if (!(iVar != this)) {
                    throw new AssertionError();
                }
            }
        }
        return iVar;
    }

    /* renamed from: i */
    private final C13099i m34174i() {
        Object obj;
        C13099i iVar;
        do {
            obj = this._prev;
            if (obj instanceof C13105l) {
                return ((C13105l) obj).f33697a;
            }
            if (obj == this) {
                iVar = m34173h();
            } else if (obj != null) {
                iVar = (C13099i) obj;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f33684f.compareAndSet(this, obj, iVar.m34175j()));
        return (C13099i) obj;
    }

    /* renamed from: j */
    private final C13105l m34175j() {
        C13105l lVar = (C13105l) this._removedRef;
        if (lVar != null) {
            return lVar;
        }
        C13105l lVar2 = new C13105l(this);
        f33685g.lazySet(this, lVar2);
        return lVar2;
    }

    /* renamed from: b */
    public final C13099i mo37594b() {
        return C13098h.m34168a(mo37592a());
    }

    /* renamed from: d */
    public final C13099i mo37596d() {
        return C13098h.m34168a(mo37595c());
    }

    /* renamed from: e */
    public final void mo37597e() {
        Object a;
        C13099i i = m34174i();
        Object obj = this._next;
        if (obj != null) {
            C13099i iVar = ((C13105l) obj).f33697a;
            while (true) {
                C13099i iVar2 = null;
                while (true) {
                    Object a2 = iVar.mo37592a();
                    if (a2 instanceof C13105l) {
                        iVar.m34174i();
                        iVar = ((C13105l) a2).f33697a;
                    } else {
                        a = i.mo37592a();
                        if (a instanceof C13105l) {
                            if (iVar2 != null) {
                                break;
                            }
                            i = C13098h.m34168a(i._prev);
                        } else if (a != this) {
                            if (a != null) {
                                C13099i iVar3 = (C13099i) a;
                                if (iVar3 != iVar) {
                                    C13099i iVar4 = iVar3;
                                    iVar2 = i;
                                    i = iVar4;
                                } else {
                                    return;
                                }
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                            }
                        } else if (f33683e.compareAndSet(i, this, iVar)) {
                            return;
                        }
                    }
                }
                i.m34174i();
                f33683e.compareAndSet(iVar2, i, ((C13105l) a).f33697a);
                i = iVar2;
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
        }
    }

    /* renamed from: f */
    public final boolean mo37598f() {
        return mo37592a() instanceof C13105l;
    }

    /* renamed from: g */
    public boolean mo37599g() {
        Object a;
        C13099i iVar;
        do {
            a = mo37592a();
            if ((a instanceof C13105l) || a == this) {
                return false;
            }
            if (a != null) {
                iVar = (C13099i) a;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f33683e.compareAndSet(this, a, iVar.m34175j()));
        m34172c(iVar);
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m34171b(C13099i iVar) {
        Object obj;
        do {
            obj = iVar._prev;
            if ((obj instanceof C13105l) || mo37592a() != iVar) {
                return;
            }
        } while (!f33684f.compareAndSet(iVar, obj, this));
        if (!(mo37592a() instanceof C13105l)) {
            return;
        }
        if (obj != null) {
            iVar.m34169a((C13099i) obj, (C13104k) null);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: a */
    public final boolean mo37593a(C13099i iVar) {
        C12932j.m33818b(iVar, "node");
        f33684f.lazySet(iVar, this);
        f33683e.lazySet(iVar, this);
        while (mo37592a() == this) {
            if (f33683e.compareAndSet(this, this, iVar)) {
                iVar.m34171b(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final Object mo37595c() {
        while (true) {
            Object obj = this._prev;
            if (obj instanceof C13105l) {
                return obj;
            }
            if (obj != null) {
                C13099i iVar = (C13099i) obj;
                if (iVar.mo37592a() == this) {
                    return obj;
                }
                m34169a(iVar, (C13104k) null);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
    }

    /* renamed from: a */
    public final int mo37591a(C13099i iVar, C13099i iVar2, C13100a aVar) {
        C12932j.m33818b(iVar, "node");
        C12932j.m33818b(iVar2, "next");
        C12932j.m33818b(aVar, "condAdd");
        f33684f.lazySet(iVar, this);
        f33683e.lazySet(iVar, iVar2);
        aVar.f33686b = iVar2;
        if (!f33683e.compareAndSet(this, iVar2, aVar)) {
            return 0;
        }
        return aVar.mo37580a(this) == null ? 1 : 2;
    }

    /* renamed from: a */
    private final C13099i m34169a(C13099i iVar, C13104k kVar) {
        Object obj;
        while (true) {
            C13099i iVar2 = null;
            while (true) {
                obj = iVar._next;
                if (obj == kVar) {
                    return iVar;
                }
                if (obj instanceof C13104k) {
                    ((C13104k) obj).mo37580a(iVar);
                } else if (!(obj instanceof C13105l)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof C13105l) {
                        return null;
                    }
                    if (obj != this) {
                        if (obj != null) {
                            iVar2 = iVar;
                            iVar = (C13099i) obj;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        }
                    } else if (obj2 == iVar) {
                        return null;
                    } else {
                        if (f33684f.compareAndSet(this, obj2, iVar) && !(iVar._prev instanceof C13105l)) {
                            return null;
                        }
                    }
                } else if (iVar2 != null) {
                    break;
                } else {
                    iVar = C13098h.m34168a(iVar._prev);
                }
            }
            iVar.m34174i();
            f33683e.compareAndSet(iVar2, iVar, ((C13105l) obj).f33697a);
            iVar = iVar2;
        }
    }

    /* renamed from: a */
    public final Object mo37592a() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C13104k)) {
                return obj;
            }
            ((C13104k) obj).mo37580a(this);
        }
    }
}
