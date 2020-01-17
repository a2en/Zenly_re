package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.coroutines.jvm.internal.c */
public abstract class C12886c extends C12884a {

    /* renamed from: f */
    private transient Continuation<Object> f33460f;

    /* renamed from: g */
    private final CoroutineContext f33461g;

    public C12886c(Continuation<Object> continuation, CoroutineContext coroutineContext) {
        super(continuation);
        this.f33461g = coroutineContext;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo37191b() {
        Continuation<Object> continuation = this.f33460f;
        if (!(continuation == null || continuation == this)) {
            Element element = getContext().get(ContinuationInterceptor.f33435b);
            if (element != null) {
                ((ContinuationInterceptor) element).releaseInterceptedContinuation(continuation);
            } else {
                C12932j.m33814a();
                throw null;
            }
        }
        this.f33460f = C12885b.f33459e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r0 != 0) goto L_0x001b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.coroutines.Continuation<java.lang.Object> mo37194c() {
        /*
            r2 = this;
            kotlin.coroutines.Continuation<java.lang.Object> r0 = r2.f33460f
            if (r0 == 0) goto L_0x0005
            goto L_0x001d
        L_0x0005:
            kotlin.coroutines.CoroutineContext r0 = r2.getContext()
            kotlin.coroutines.ContinuationInterceptor$b r1 = kotlin.coroutines.ContinuationInterceptor.f33435b
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            kotlin.coroutines.ContinuationInterceptor r0 = (kotlin.coroutines.ContinuationInterceptor) r0
            if (r0 == 0) goto L_0x001a
            kotlin.coroutines.Continuation r0 = r0.interceptContinuation(r2)
            if (r0 == 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r0 = r2
        L_0x001b:
            r2.f33460f = r0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.C12886c.mo37194c():kotlin.coroutines.Continuation");
    }

    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f33461g;
        if (coroutineContext != null) {
            return coroutineContext;
        }
        C12932j.m33814a();
        throw null;
    }
}
