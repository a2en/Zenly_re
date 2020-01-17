package kotlin.coroutines.p408d;

import kotlin.C12949k;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.coroutines.C12874c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C12884a;
import kotlin.coroutines.jvm.internal.C12886c;
import kotlin.coroutines.jvm.internal.C12889f;
import kotlin.coroutines.jvm.internal.C12892h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12922a0;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.coroutines.d.c */
class C12877c {

    /* renamed from: kotlin.coroutines.d.c$a */
    public static final class C12878a extends C12892h {

        /* renamed from: f */
        private int f33447f;

        /* renamed from: g */
        final /* synthetic */ Function1 f33448g;

        public C12878a(Continuation continuation, Continuation continuation2, Function1 function1) {
            this.f33448g = function1;
            super(continuation2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo37176a(Object obj) {
            int i = this.f33447f;
            if (i == 0) {
                this.f33447f = 1;
                C12949k.m33849a(obj);
                Function1 function1 = this.f33448g;
                if (function1 != null) {
                    C12922a0.m33789a((Object) function1, 1);
                    return function1.invoke(this);
                }
                throw new TypeCastException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i == 1) {
                this.f33447f = 2;
                C12949k.m33849a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: kotlin.coroutines.d.c$b */
    public static final class C12879b extends C12886c {

        /* renamed from: h */
        private int f33449h;

        /* renamed from: i */
        final /* synthetic */ Function1 f33450i;

        public C12879b(Continuation continuation, CoroutineContext coroutineContext, Continuation continuation2, CoroutineContext coroutineContext2, Function1 function1) {
            this.f33450i = function1;
            super(continuation2, coroutineContext2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo37176a(Object obj) {
            int i = this.f33449h;
            if (i == 0) {
                this.f33449h = 1;
                C12949k.m33849a(obj);
                Function1 function1 = this.f33450i;
                if (function1 != null) {
                    C12922a0.m33789a((Object) function1, 1);
                    return function1.invoke(this);
                }
                throw new TypeCastException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i == 1) {
                this.f33449h = 2;
                C12949k.m33849a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: kotlin.coroutines.d.c$c */
    public static final class C12880c extends C12892h {

        /* renamed from: f */
        private int f33451f;

        /* renamed from: g */
        final /* synthetic */ Function2 f33452g;

        /* renamed from: h */
        final /* synthetic */ Object f33453h;

        public C12880c(Continuation continuation, Continuation continuation2, Function2 function2, Object obj) {
            this.f33452g = function2;
            this.f33453h = obj;
            super(continuation2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo37176a(Object obj) {
            int i = this.f33451f;
            if (i == 0) {
                this.f33451f = 1;
                C12949k.m33849a(obj);
                Function2 function2 = this.f33452g;
                if (function2 != null) {
                    C12922a0.m33789a((Object) function2, 2);
                    return function2.invoke(this.f33453h, this);
                }
                throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i == 1) {
                this.f33451f = 2;
                C12949k.m33849a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: kotlin.coroutines.d.c$d */
    public static final class C12881d extends C12886c {

        /* renamed from: h */
        private int f33454h;

        /* renamed from: i */
        final /* synthetic */ Function2 f33455i;

        /* renamed from: j */
        final /* synthetic */ Object f33456j;

        public C12881d(Continuation continuation, CoroutineContext coroutineContext, Continuation continuation2, CoroutineContext coroutineContext2, Function2 function2, Object obj) {
            this.f33455i = function2;
            this.f33456j = obj;
            super(continuation2, coroutineContext2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo37176a(Object obj) {
            int i = this.f33454h;
            if (i == 0) {
                this.f33454h = 1;
                C12949k.m33849a(obj);
                Function2 function2 = this.f33455i;
                if (function2 != null) {
                    C12922a0.m33789a((Object) function2, 2);
                    return function2.invoke(this.f33456j, this);
                }
                throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i == 1) {
                this.f33454h = 2;
                C12949k.m33849a(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [kotlin.coroutines.Continuation<kotlin.q>] */
    /* JADX WARNING: type inference failed for: r0v6, types: [kotlin.coroutines.d.c$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> kotlin.coroutines.Continuation<kotlin.C12956q> m33720a(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super T> r8) {
        /*
            java.lang.String r0 = "$this$createCoroutineUnintercepted"
            kotlin.jvm.internal.C12932j.m33818b(r7, r0)
            java.lang.String r0 = "completion"
            kotlin.jvm.internal.C12932j.m33818b(r8, r0)
            kotlin.coroutines.jvm.internal.C12889f.m33743a(r8)
            boolean r0 = r7 instanceof kotlin.coroutines.jvm.internal.C12884a
            if (r0 != 0) goto L_0x003c
            kotlin.coroutines.CoroutineContext r5 = r8.getContext()
            kotlin.coroutines.c r0 = kotlin.coroutines.C12874c.f33444e
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"
            if (r5 != r0) goto L_0x0029
            kotlin.coroutines.d.c$a r0 = new kotlin.coroutines.d.c$a
            if (r8 == 0) goto L_0x0023
            r0.<init>(r8, r8, r7)
            goto L_0x0035
        L_0x0023:
            kotlin.TypeCastException r7 = new kotlin.TypeCastException
            r7.<init>(r1)
            throw r7
        L_0x0029:
            kotlin.coroutines.d.c$b r0 = new kotlin.coroutines.d.c$b
            if (r8 == 0) goto L_0x0036
            r1 = r0
            r2 = r8
            r3 = r5
            r4 = r8
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x0035:
            return r0
        L_0x0036:
            kotlin.TypeCastException r7 = new kotlin.TypeCastException
            r7.<init>(r1)
            throw r7
        L_0x003c:
            kotlin.coroutines.jvm.internal.a r7 = (kotlin.coroutines.jvm.internal.C12884a) r7
            r7.mo37190a(r8)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.p408d.C12877c.m33720a(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):kotlin.coroutines.Continuation");
    }

    /* renamed from: a */
    public static <R, T> Continuation<C12956q> m33721a(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation) {
        C12932j.m33818b(function2, "$this$createCoroutineUnintercepted");
        C12932j.m33818b(continuation, "completion");
        C12889f.m33743a(continuation);
        if (function2 instanceof C12884a) {
            return ((C12884a) function2).mo37189a(r, continuation);
        }
        CoroutineContext context = continuation.getContext();
        String str = "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>";
        if (context == C12874c.f33444e) {
            if (continuation != null) {
                return new C12880c(continuation, continuation, function2, r);
            }
            throw new TypeCastException(str);
        } else if (continuation != null) {
            C12881d dVar = new C12881d(continuation, context, continuation, context, function2, r);
            return dVar;
        } else {
            throw new TypeCastException(str);
        }
    }

    /* renamed from: a */
    public static <T> Continuation<T> m33719a(Continuation<? super T> continuation) {
        C12932j.m33818b(continuation, "$this$intercepted");
        C12886c cVar = (C12886c) (!(continuation instanceof C12886c) ? null : continuation);
        if (cVar == null) {
            return continuation;
        }
        Continuation c = cVar.mo37194c();
        return c != null ? c : continuation;
    }
}
