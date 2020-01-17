package kotlin.coroutines;

import java.io.Serializable;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.coroutines.CoroutineContext.C12866a;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12944v;

/* renamed from: kotlin.coroutines.b */
public final class C12869b implements CoroutineContext, Serializable {

    /* renamed from: e */
    private final CoroutineContext f33438e;

    /* renamed from: f */
    private final Element f33439f;

    /* renamed from: kotlin.coroutines.b$a */
    private static final class C12870a implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: e */
        private final CoroutineContext[] f33440e;

        /* renamed from: kotlin.coroutines.b$a$a */
        public static final class C12871a {
            private C12871a() {
            }

            public /* synthetic */ C12871a(C12928f fVar) {
                this();
            }
        }

        static {
            new C12871a(null);
        }

        public C12870a(CoroutineContext[] coroutineContextArr) {
            C12932j.m33818b(coroutineContextArr, "elements");
            this.f33440e = coroutineContextArr;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.f33440e;
            CoroutineContext coroutineContext = C12874c.f33444e;
            for (CoroutineContext plus : coroutineContextArr) {
                coroutineContext = coroutineContext.plus(plus);
            }
            return coroutineContext;
        }
    }

    /* renamed from: kotlin.coroutines.b$b */
    static final class C12872b extends C12933k implements Function2<String, Element, String> {

        /* renamed from: f */
        public static final C12872b f33441f = new C12872b();

        C12872b() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String str, Element element) {
            C12932j.m33818b(str, "acc");
            C12932j.m33818b(element, "element");
            if (str.length() == 0) {
                return element.toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", ");
            sb.append(element);
            return sb.toString();
        }
    }

    /* renamed from: kotlin.coroutines.b$c */
    static final class C12873c extends C12933k implements Function2<C12956q, Element, C12956q> {

        /* renamed from: f */
        final /* synthetic */ CoroutineContext[] f33442f;

        /* renamed from: g */
        final /* synthetic */ C12944v f33443g;

        C12873c(CoroutineContext[] coroutineContextArr, C12944v vVar) {
            this.f33442f = coroutineContextArr;
            this.f33443g = vVar;
            super(2);
        }

        /* renamed from: a */
        public final void mo37173a(C12956q qVar, Element element) {
            C12932j.m33818b(qVar, "<anonymous parameter 0>");
            C12932j.m33818b(element, "element");
            CoroutineContext[] coroutineContextArr = this.f33442f;
            C12944v vVar = this.f33443g;
            int i = vVar.f33527e;
            vVar.f33527e = i + 1;
            coroutineContextArr[i] = element;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo37173a((C12956q) obj, (Element) obj2);
            return C12956q.f33541a;
        }
    }

    public C12869b(CoroutineContext coroutineContext, Element element) {
        C12932j.m33818b(coroutineContext, "left");
        C12932j.m33818b(element, "element");
        this.f33438e = coroutineContext;
        this.f33439f = element;
    }

    /* renamed from: a */
    private final int m33710a() {
        int i = 2;
        C12869b bVar = this;
        while (true) {
            CoroutineContext coroutineContext = bVar.f33438e;
            if (!(coroutineContext instanceof C12869b)) {
                coroutineContext = null;
            }
            bVar = (C12869b) coroutineContext;
            if (bVar == null) {
                return i;
            }
            i++;
        }
    }

    private final Object writeReplace() {
        int a = m33710a();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[a];
        C12944v vVar = new C12944v();
        boolean z = false;
        vVar.f33527e = 0;
        fold(C12956q.f33541a, new C12873c(coroutineContextArr, vVar));
        if (vVar.f33527e == a) {
            z = true;
        }
        if (z) {
            return new C12870a(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r3.m33712a(r2) != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001b
            boolean r0 = r3 instanceof kotlin.coroutines.C12869b
            if (r0 == 0) goto L_0x0019
            kotlin.coroutines.b r3 = (kotlin.coroutines.C12869b) r3
            int r0 = r3.m33710a()
            int r1 = r2.m33710a()
            if (r0 != r1) goto L_0x0019
            boolean r3 = r3.m33712a(r2)
            if (r3 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r3 = 0
            goto L_0x001c
        L_0x001b:
            r3 = 1
        L_0x001c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.C12869b.equals(java.lang.Object):boolean");
    }

    public <R> R fold(R r, Function2<? super R, ? super Element, ? extends R> function2) {
        C12932j.m33818b(function2, "operation");
        return function2.invoke(this.f33438e.fold(r, function2), this.f33439f);
    }

    public <E extends Element> E get(Key<E> key) {
        C12932j.m33818b(key, "key");
        C12869b bVar = this;
        while (true) {
            E e = bVar.f33439f.get(key);
            if (e != null) {
                return e;
            }
            CoroutineContext coroutineContext = bVar.f33438e;
            if (!(coroutineContext instanceof C12869b)) {
                return coroutineContext.get(key);
            }
            bVar = (C12869b) coroutineContext;
        }
    }

    public int hashCode() {
        return this.f33438e.hashCode() + this.f33439f.hashCode();
    }

    public CoroutineContext minusKey(Key<?> key) {
        CoroutineContext coroutineContext;
        C12932j.m33818b(key, "key");
        if (this.f33439f.get(key) != null) {
            return this.f33438e;
        }
        CoroutineContext minusKey = this.f33438e.minusKey(key);
        if (minusKey == this.f33438e) {
            coroutineContext = this;
        } else if (minusKey == C12874c.f33444e) {
            coroutineContext = this.f33439f;
        } else {
            coroutineContext = new C12869b(minusKey, this.f33439f);
        }
        return coroutineContext;
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        C12932j.m33818b(coroutineContext, "context");
        return C12866a.m33708a(this, coroutineContext);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append((String) fold("", C12872b.f33441f));
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    private final boolean m33711a(Element element) {
        return C12932j.m33817a((Object) get(element.getKey()), (Object) element);
    }

    /* renamed from: a */
    private final boolean m33712a(C12869b bVar) {
        while (m33711a(bVar.f33439f)) {
            CoroutineContext coroutineContext = bVar.f33438e;
            if (coroutineContext instanceof C12869b) {
                bVar = (C12869b) coroutineContext;
            } else if (coroutineContext != null) {
                return m33711a((Element) coroutineContext);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
            }
        }
        return false;
    }
}
