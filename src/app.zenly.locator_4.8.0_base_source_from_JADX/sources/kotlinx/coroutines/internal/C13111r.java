package kotlinx.coroutines.internal;

import kotlin.TypeCastException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlinx.coroutines.ThreadContextElement;

/* renamed from: kotlinx.coroutines.internal.r */
public final class C13111r {

    /* renamed from: a */
    private static final C13107n f33700a = new C13107n("ZERO");

    /* renamed from: b */
    private static final Function2<Object, Element, Object> f33701b = C13112a.f33705f;

    /* renamed from: c */
    private static final Function2<ThreadContextElement<?>, Element, ThreadContextElement<?>> f33702c = C13113b.f33706f;

    /* renamed from: d */
    private static final Function2<C13117t, Element, C13117t> f33703d = C13115d.f33708f;

    /* renamed from: e */
    private static final Function2<C13117t, Element, C13117t> f33704e = C13114c.f33707f;

    /* renamed from: kotlinx.coroutines.internal.r$a */
    static final class C13112a extends C12933k implements Function2<Object, Element, Object> {

        /* renamed from: f */
        public static final C13112a f33705f = new C13112a();

        C13112a() {
            super(2);
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.coroutines.CoroutineContext$Element, code=java.lang.Object, for r3v0, types: [kotlin.coroutines.CoroutineContext$Element, java.lang.Object] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            /*
                r1 = this;
                java.lang.String r0 = "element"
                kotlin.jvm.internal.C12932j.m33818b(r3, r0)
                boolean r0 = r3 instanceof kotlinx.coroutines.ThreadContextElement
                if (r0 == 0) goto L_0x0022
                boolean r0 = r2 instanceof java.lang.Integer
                if (r0 != 0) goto L_0x000e
                r2 = 0
            L_0x000e:
                java.lang.Integer r2 = (java.lang.Integer) r2
                r0 = 1
                if (r2 == 0) goto L_0x0018
                int r2 = r2.intValue()
                goto L_0x0019
            L_0x0018:
                r2 = 1
            L_0x0019:
                if (r2 != 0) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                int r2 = r2 + r0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            L_0x0021:
                return r3
            L_0x0022:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C13111r.C13112a.invoke(java.lang.Object, kotlin.coroutines.CoroutineContext$Element):java.lang.Object");
        }
    }

    /* renamed from: kotlinx.coroutines.internal.r$b */
    static final class C13113b extends C12933k implements Function2<ThreadContextElement<?>, Element, ThreadContextElement<?>> {

        /* renamed from: f */
        public static final C13113b f33706f = new C13113b();

        C13113b() {
            super(2);
        }

        /* renamed from: a */
        public final ThreadContextElement<?> invoke(ThreadContextElement<?> threadContextElement, Element element) {
            C12932j.m33818b(element, "element");
            if (threadContextElement != null) {
                return threadContextElement;
            }
            if (!(element instanceof ThreadContextElement)) {
                element = null;
            }
            return (ThreadContextElement) element;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.r$c */
    static final class C13114c extends C12933k implements Function2<C13117t, Element, C13117t> {

        /* renamed from: f */
        public static final C13114c f33707f = new C13114c();

        C13114c() {
            super(2);
        }

        /* renamed from: a */
        public final C13117t mo37614a(C13117t tVar, Element element) {
            C12932j.m33818b(tVar, "state");
            C12932j.m33818b(element, "element");
            if (element instanceof ThreadContextElement) {
                ((ThreadContextElement) element).restoreThreadContext(tVar.mo37624a(), tVar.mo37627c());
            }
            return tVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            C13117t tVar = (C13117t) obj;
            mo37614a(tVar, (Element) obj2);
            return tVar;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.r$d */
    static final class C13115d extends C12933k implements Function2<C13117t, Element, C13117t> {

        /* renamed from: f */
        public static final C13115d f33708f = new C13115d();

        C13115d() {
            super(2);
        }

        /* renamed from: a */
        public final C13117t mo37615a(C13117t tVar, Element element) {
            C12932j.m33818b(tVar, "state");
            C12932j.m33818b(element, "element");
            if (element instanceof ThreadContextElement) {
                tVar.mo37625a(((ThreadContextElement) element).updateThreadContext(tVar.mo37624a()));
            }
            return tVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            C13117t tVar = (C13117t) obj;
            mo37615a(tVar, (Element) obj2);
            return tVar;
        }
    }

    /* renamed from: a */
    public static final Object m34224a(CoroutineContext coroutineContext) {
        C12932j.m33818b(coroutineContext, "context");
        Object fold = coroutineContext.fold(Integer.valueOf(0), f33701b);
        if (fold != null) {
            return fold;
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: b */
    public static final Object m34226b(CoroutineContext coroutineContext, Object obj) {
        C12932j.m33818b(coroutineContext, "context");
        if (obj == null) {
            obj = m34224a(coroutineContext);
        }
        if (obj == Integer.valueOf(0)) {
            return f33700a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new C13117t(coroutineContext, ((Number) obj).intValue()), f33703d);
        }
        if (obj != null) {
            return ((ThreadContextElement) obj).updateThreadContext(coroutineContext);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }

    /* renamed from: a */
    public static final void m34225a(CoroutineContext coroutineContext, Object obj) {
        C12932j.m33818b(coroutineContext, "context");
        if (obj != f33700a) {
            if (obj instanceof C13117t) {
                ((C13117t) obj).mo37626b();
                coroutineContext.fold(obj, f33704e);
            } else {
                Object fold = coroutineContext.fold(null, f33702c);
                if (fold != null) {
                    ((ThreadContextElement) fold).restoreThreadContext(coroutineContext, obj);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                }
            }
        }
    }
}
