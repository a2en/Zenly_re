package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.jvm.internal.C12887d;
import kotlin.coroutines.jvm.internal.C12889f;
import kotlin.coroutines.jvm.internal.C12893i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;
import kotlin.sequences.C12982d;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.Job.C13048a;
import kotlinx.coroutines.internal.C13088e;
import kotlinx.coroutines.internal.C13098h;
import kotlinx.coroutines.internal.C13099i;
import kotlinx.coroutines.internal.C13099i.C13100a;
import kotlinx.coroutines.internal.C13104k;
import kotlinx.coroutines.internal.C13106m;
import kotlinx.coroutines.p415c1.C13066b;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectInstance;

/* renamed from: kotlinx.coroutines.r0 */
public class C13136r0 implements Job, ChildJob, ParentJob, SelectClause0 {

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater f33727e = AtomicReferenceFieldUpdater.newUpdater(C13136r0.class, Object.class, "_state");
    private volatile Object _state;
    public volatile ChildHandle parentHandle;

    /* renamed from: kotlinx.coroutines.r0$a */
    private static final class C13137a extends C13133q0<Job> {

        /* renamed from: i */
        private final C13136r0 f33728i;

        /* renamed from: j */
        private final C13138b f33729j;

        /* renamed from: k */
        private final C13082i f33730k;

        /* renamed from: l */
        private final Object f33731l;

        public C13137a(C13136r0 r0Var, C13138b bVar, C13082i iVar, Object obj) {
            C12932j.m33818b(r0Var, "parent");
            C12932j.m33818b(bVar, "state");
            C12932j.m33818b(iVar, "child");
            super(iVar.f33666i);
            this.f33728i = r0Var;
            this.f33729j = bVar;
            this.f33730k = iVar;
            this.f33731l = obj;
        }

        /* renamed from: a */
        public void mo37574a(Throwable th) {
            this.f33728i.m34273a(this.f33729j, this.f33730k, this.f33731l);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37574a((Throwable) obj);
            return C12956q.f33541a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChildCompletion[");
            sb.append(this.f33730k);
            sb.append(", ");
            sb.append(this.f33731l);
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.r0$b */
    private static final class C13138b implements Incomplete {
        private volatile Object _exceptionsHolder;

        /* renamed from: e */
        private final C13150u0 f33732e;
        public volatile boolean isCompleting;
        public volatile Throwable rootCause;

        public C13138b(C13150u0 u0Var, boolean z, Throwable th) {
            C12932j.m33818b(u0Var, "list");
            this.f33732e = u0Var;
            this.isCompleting = z;
            this.rootCause = th;
        }

        /* renamed from: c */
        private final ArrayList<Throwable> m34312c() {
            return new ArrayList<>(4);
        }

        /* renamed from: a */
        public final boolean mo37658a() {
            return this.rootCause != null;
        }

        /* renamed from: b */
        public final boolean mo37660b() {
            return this._exceptionsHolder == C13143s0.f33746a;
        }

        public C13150u0 getList() {
            return this.f33732e;
        }

        public boolean isActive() {
            return this.rootCause == null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Finishing[cancelling=");
            sb.append(mo37658a());
            sb.append(", completing=");
            sb.append(this.isCompleting);
            sb.append(", rootCause=");
            sb.append(this.rootCause);
            sb.append(", exceptions=");
            sb.append(this._exceptionsHolder);
            sb.append(", list=");
            sb.append(getList());
            sb.append(']');
            return sb.toString();
        }

        /* renamed from: a */
        public final void mo37657a(Throwable th) {
            C12932j.m33818b(th, "exception");
            Throwable th2 = this.rootCause;
            if (th2 == null) {
                this.rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList c = m34312c();
                        c.add(obj);
                        c.add(th);
                        this._exceptionsHolder = c;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("State is ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
        }

        /* renamed from: b */
        public final List<Throwable> mo37659b(Throwable th) {
            ArrayList arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = m34312c();
            } else if (obj instanceof Throwable) {
                ArrayList c = m34312c();
                c.add(obj);
                arrayList = c;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("State is ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
            Throwable th2 = this.rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && (!C12932j.m33817a((Object) th, (Object) th2))) {
                arrayList.add(th);
            }
            this._exceptionsHolder = C13143s0.f33746a;
            return arrayList;
        }
    }

    /* renamed from: kotlinx.coroutines.r0$c */
    public static final class C13139c extends C13100a {

        /* renamed from: d */
        final /* synthetic */ C13136r0 f33733d;

        /* renamed from: e */
        final /* synthetic */ Object f33734e;

        public C13139c(C13099i iVar, C13099i iVar2, C13136r0 r0Var, Object obj) {
            this.f33733d = r0Var;
            this.f33734e = obj;
            super(iVar2);
        }

        /* renamed from: a */
        public Object mo37582b(C13099i iVar) {
            C12932j.m33818b(iVar, "affected");
            if (this.f33733d.mo37647c() == this.f33734e) {
                return null;
            }
            return C13098h.m34167a();
        }
    }

    @C12887d(mo37195c = "kotlinx.coroutines.JobSupport$children$1", mo37196f = "JobSupport.kt", mo37197l = {897, 899}, mo37198m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.r0$d */
    static final class C13140d extends C12893i implements Function2<C12982d<? super ChildJob>, Continuation<? super C12956q>, Object> {

        /* renamed from: g */
        private C12982d f33735g;

        /* renamed from: h */
        Object f33736h;

        /* renamed from: i */
        Object f33737i;

        /* renamed from: j */
        Object f33738j;

        /* renamed from: k */
        Object f33739k;

        /* renamed from: l */
        Object f33740l;

        /* renamed from: m */
        Object f33741m;

        /* renamed from: n */
        int f33742n;

        /* renamed from: o */
        final /* synthetic */ C13136r0 f33743o;

        C13140d(C13136r0 r0Var, Continuation continuation) {
            this.f33743o = r0Var;
            super(2, continuation);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo37176a(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.p408d.C12882d.m33726a()
                int r1 = r10.f33742n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x003b
                if (r1 == r3) goto L_0x0032
                if (r1 != r2) goto L_0x002a
                java.lang.Object r1 = r10.f33741m
                kotlinx.coroutines.i r1 = (kotlinx.coroutines.C13082i) r1
                java.lang.Object r1 = r10.f33740l
                kotlinx.coroutines.internal.i r1 = (kotlinx.coroutines.internal.C13099i) r1
                java.lang.Object r4 = r10.f33739k
                kotlinx.coroutines.u0 r4 = (kotlinx.coroutines.C13150u0) r4
                java.lang.Object r5 = r10.f33738j
                kotlinx.coroutines.u0 r5 = (kotlinx.coroutines.C13150u0) r5
                java.lang.Object r6 = r10.f33737i
                java.lang.Object r7 = r10.f33736h
                kotlin.sequences.d r7 = (kotlin.sequences.C12982d) r7
                kotlin.C12949k.m33849a(r11)
                r11 = r10
                goto L_0x009b
            L_0x002a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0032:
                java.lang.Object r0 = r10.f33736h
                kotlin.sequences.d r0 = (kotlin.sequences.C12982d) r0
                kotlin.C12949k.m33849a(r11)
                goto L_0x00a8
            L_0x003b:
                kotlin.C12949k.m33849a(r11)
                kotlin.sequences.d r11 = r10.f33735g
                kotlinx.coroutines.r0 r1 = r10.f33743o
                java.lang.Object r1 = r1.mo37647c()
                boolean r4 = r1 instanceof kotlinx.coroutines.C13082i
                if (r4 == 0) goto L_0x005c
                r2 = r1
                kotlinx.coroutines.i r2 = (kotlinx.coroutines.C13082i) r2
                kotlinx.coroutines.ChildJob r2 = r2.f33666i
                r10.f33736h = r11
                r10.f33737i = r1
                r10.f33742n = r3
                java.lang.Object r11 = r11.mo37380a(r2, r10)
                if (r11 != r0) goto L_0x00a8
                return r0
            L_0x005c:
                boolean r4 = r1 instanceof kotlinx.coroutines.Incomplete
                if (r4 == 0) goto L_0x00a8
                r4 = r1
                kotlinx.coroutines.Incomplete r4 = (kotlinx.coroutines.Incomplete) r4
                kotlinx.coroutines.u0 r4 = r4.getList()
                if (r4 == 0) goto L_0x00a8
                java.lang.Object r5 = r4.mo37592a()
                if (r5 == 0) goto L_0x00a0
                kotlinx.coroutines.internal.i r5 = (kotlinx.coroutines.internal.C13099i) r5
                r7 = r11
                r6 = r1
                r1 = r5
                r11 = r10
                r5 = r4
            L_0x0076:
                boolean r8 = kotlin.jvm.internal.C12932j.m33817a(r1, r4)
                r8 = r8 ^ r3
                if (r8 == 0) goto L_0x00a8
                boolean r8 = r1 instanceof kotlinx.coroutines.C13082i
                if (r8 == 0) goto L_0x009b
                r8 = r1
                kotlinx.coroutines.i r8 = (kotlinx.coroutines.C13082i) r8
                kotlinx.coroutines.ChildJob r9 = r8.f33666i
                r11.f33736h = r7
                r11.f33737i = r6
                r11.f33738j = r5
                r11.f33739k = r4
                r11.f33740l = r1
                r11.f33741m = r8
                r11.f33742n = r2
                java.lang.Object r8 = r7.mo37380a(r9, r11)
                if (r8 != r0) goto L_0x009b
                return r0
            L_0x009b:
                kotlinx.coroutines.internal.i r1 = r1.mo37594b()
                goto L_0x0076
            L_0x00a0:
                kotlin.TypeCastException r11 = new kotlin.TypeCastException
                java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
                r11.<init>(r0)
                throw r11
            L_0x00a8:
                kotlin.q r11 = kotlin.C12956q.f33541a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13136r0.C13140d.mo37176a(java.lang.Object):java.lang.Object");
        }

        /* renamed from: a */
        public final Continuation<C12956q> mo37189a(Object obj, Continuation<?> continuation) {
            C12932j.m33818b(continuation, "completion");
            C13140d dVar = new C13140d(this.f33743o, continuation);
            dVar.f33735g = (C12982d) obj;
            return dVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C13140d) mo37189a(obj, (Continuation) obj2)).mo37176a(C12956q.f33541a);
        }
    }

    /* renamed from: b */
    private final boolean m34282b(Incomplete incomplete, Object obj, int i) {
        if (C13149u.m34325a()) {
            if (!((incomplete instanceof C13064c0) || (incomplete instanceof C13133q0))) {
                throw new AssertionError();
            }
        }
        if (C13149u.m34325a() && !(!(obj instanceof C13118j))) {
            throw new AssertionError();
        } else if (!f33727e.compareAndSet(this, incomplete, C13143s0.m34322a(obj))) {
            return false;
        } else {
            mo37652e((Throwable) null);
            mo37644b(obj);
            m34271a(incomplete, obj, i);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0054, code lost:
        if (r3 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0056, code lost:
        m34275a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0059, code lost:
        r8 = m34267a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005d, code lost:
        if (r8 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0063, code lost:
        if (m34283b(r2, r8, r9) == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0066, code lost:
        return 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x006b, code lost:
        if (m34278a(r2, r9, r10) == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x006d, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x006e, code lost:
        return 3;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m34284c(kotlinx.coroutines.Incomplete r8, java.lang.Object r9, int r10) {
        /*
            r7 = this;
            kotlinx.coroutines.u0 r0 = r7.m34279b(r8)
            r1 = 3
            if (r0 == 0) goto L_0x007e
            boolean r2 = r8 instanceof kotlinx.coroutines.C13136r0.C13138b
            r3 = 0
            if (r2 != 0) goto L_0x000e
            r2 = r3
            goto L_0x000f
        L_0x000e:
            r2 = r8
        L_0x000f:
            kotlinx.coroutines.r0$b r2 = (kotlinx.coroutines.C13136r0.C13138b) r2
            r4 = 0
            if (r2 == 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            kotlinx.coroutines.r0$b r2 = new kotlinx.coroutines.r0$b
            r2.<init>(r0, r4, r3)
        L_0x001a:
            monitor-enter(r2)
            boolean r5 = r2.isCompleting     // Catch:{ all -> 0x007b }
            if (r5 == 0) goto L_0x0021
            monitor-exit(r2)
            return r4
        L_0x0021:
            r4 = 1
            r2.isCompleting = r4     // Catch:{ all -> 0x007b }
            if (r2 == r8) goto L_0x0030
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f33727e     // Catch:{ all -> 0x007b }
            boolean r5 = r5.compareAndSet(r7, r8, r2)     // Catch:{ all -> 0x007b }
            if (r5 != 0) goto L_0x0030
            monitor-exit(r2)
            return r1
        L_0x0030:
            boolean r5 = r2.mo37660b()     // Catch:{ all -> 0x007b }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x006f
            boolean r5 = r2.mo37658a()     // Catch:{ all -> 0x007b }
            boolean r6 = r9 instanceof kotlinx.coroutines.C13118j     // Catch:{ all -> 0x007b }
            if (r6 != 0) goto L_0x0041
            r6 = r3
            goto L_0x0042
        L_0x0041:
            r6 = r9
        L_0x0042:
            kotlinx.coroutines.j r6 = (kotlinx.coroutines.C13118j) r6     // Catch:{ all -> 0x007b }
            if (r6 == 0) goto L_0x004b
            java.lang.Throwable r6 = r6.f33714a     // Catch:{ all -> 0x007b }
            r2.mo37657a(r6)     // Catch:{ all -> 0x007b }
        L_0x004b:
            java.lang.Throwable r6 = r2.rootCause     // Catch:{ all -> 0x007b }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x0051
            r3 = r6
        L_0x0051:
            kotlin.q r5 = kotlin.C12956q.f33541a     // Catch:{ all -> 0x007b }
            monitor-exit(r2)
            if (r3 == 0) goto L_0x0059
            r7.m34275a(r0, r3)
        L_0x0059:
            kotlinx.coroutines.i r8 = r7.m34267a(r8)
            if (r8 == 0) goto L_0x0067
            boolean r8 = r7.m34283b(r2, r8, r9)
            if (r8 == 0) goto L_0x0067
            r8 = 2
            return r8
        L_0x0067:
            boolean r8 = r7.m34278a(r2, r9, r10)
            if (r8 == 0) goto L_0x006e
            return r4
        L_0x006e:
            return r1
        L_0x006f:
            java.lang.String r8 = "Failed requirement."
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007b }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x007b }
            r9.<init>(r8)     // Catch:{ all -> 0x007b }
            throw r9     // Catch:{ all -> 0x007b }
        L_0x007b:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13136r0.m34284c(kotlinx.coroutines.Incomplete, java.lang.Object, int):int");
    }

    /* renamed from: d */
    private final Throwable m34286d(Object obj) {
        if (obj != null ? obj instanceof Throwable : true) {
            return obj != null ? (Throwable) obj : m34291h();
        }
        if (obj != null) {
            return ((ParentJob) obj).getChildJobCancellationCause();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    /* renamed from: f */
    private final boolean m34289f(Throwable th) {
        boolean z = true;
        if (mo37650d()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        ChildHandle childHandle = this.parentHandle;
        if (childHandle == null || childHandle == C13152v0.f33756e) {
            return z2;
        }
        if (!childHandle.childCancelled(th) && !z2) {
            z = false;
        }
        return z;
    }

    /* renamed from: h */
    private final JobCancellationException m34291h() {
        return new JobCancellationException("Job was cancelled", null, this);
    }

    /* renamed from: i */
    private final boolean m34292i() {
        Object c;
        do {
            c = mo37647c();
            if (!(c instanceof Incomplete)) {
                return false;
            }
        } while (m34288f(c) < 0);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo37639a(Object obj, int i) {
    }

    /* renamed from: a */
    public boolean mo37641a() {
        return true;
    }

    public final ChildHandle attachChild(ChildJob childJob) {
        C12932j.m33818b(childJob, "child");
        DisposableHandle a = C13048a.m34061a(this, true, false, new C13082i(this, childJob), 2, null);
        if (a != null) {
            return (ChildHandle) a;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo37644b(Object obj) {
    }

    /* renamed from: b */
    public boolean mo37645b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo37648c(Throwable th) {
        C12932j.m33818b(th, "exception");
        return false;
    }

    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo37650d() {
        return false;
    }

    /* renamed from: e */
    public String mo37651e() {
        return C13151v.m34329a((Object) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo37652e(Throwable th) {
    }

    /* renamed from: f */
    public void mo37653f() {
    }

    public <R> R fold(R r, Function2<? super R, ? super Element, ? extends R> function2) {
        C12932j.m33818b(function2, "operation");
        return C13048a.m34058a(this, r, function2);
    }

    /* renamed from: g */
    public final String mo37654g() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo37651e());
        sb.append('{');
        sb.append(m34290g(mo37647c()));
        sb.append('}');
        return sb.toString();
    }

    public <E extends Element> E get(Key<E> key) {
        C12932j.m33818b(key, "key");
        return C13048a.m34059a((Job) this, key);
    }

    public final CancellationException getCancellationException() {
        Object c = mo37647c();
        String str = "Job is still new or active: ";
        if (c instanceof C13138b) {
            Throwable th = ((C13138b) c).rootCause;
            if (th != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(C13151v.m34329a((Object) this));
                sb.append(" is cancelling");
                CancellationException a = mo37638a(th, sb.toString());
                if (a != null) {
                    return a;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this);
            throw new IllegalStateException(sb2.toString().toString());
        } else if (c instanceof Incomplete) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(this);
            throw new IllegalStateException(sb3.toString().toString());
        } else if (c instanceof C13118j) {
            return m34266a(this, ((C13118j) c).f33714a, null, 1, null);
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(C13151v.m34329a((Object) this));
            sb4.append(" has completed normally");
            return new JobCancellationException(sb4.toString(), null, this);
        }
    }

    public CancellationException getChildJobCancellationCause() {
        Throwable th;
        Object c = mo37647c();
        CancellationException cancellationException = null;
        if (c instanceof C13138b) {
            th = ((C13138b) c).rootCause;
        } else if (c instanceof C13118j) {
            th = ((C13118j) c).f33714a;
        } else if (!(c instanceof Incomplete)) {
            th = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot be cancelling child in this state: ");
            sb.append(c);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Parent job is ");
        sb2.append(m34290g(c));
        return new JobCancellationException(sb2.toString(), th, this);
    }

    public final Sequence<Job> getChildren() {
        return C12984f.m33918b(new C13140d(this, null));
    }

    public final Key<?> getKey() {
        return Job.f33627d;
    }

    public final SelectClause0 getOnJoin() {
        return this;
    }

    public final DisposableHandle invokeOnCompletion(Function1<? super Throwable, C12956q> function1) {
        C12932j.m33818b(function1, "handler");
        return invokeOnCompletion(false, true, function1);
    }

    public boolean isActive() {
        Object c = mo37647c();
        return (c instanceof Incomplete) && ((Incomplete) c).isActive();
    }

    public final boolean isCancelled() {
        Object c = mo37647c();
        return (c instanceof C13118j) || ((c instanceof C13138b) && ((C13138b) c).mo37658a());
    }

    public final boolean isCompleted() {
        return !(mo37647c() instanceof Incomplete);
    }

    public final Object join(Continuation<? super C12956q> continuation) {
        if (m34292i()) {
            return mo37637a(continuation);
        }
        C13062b1.m34084a(continuation.getContext());
        return C12956q.f33541a;
    }

    public CoroutineContext minusKey(Key<?> key) {
        C12932j.m33818b(key, "key");
        return C13048a.m34065b(this, key);
    }

    public final void parentCancelled(ParentJob parentJob) {
        C12932j.m33818b(parentJob, "parentJob");
        mo37642a((Object) parentJob);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        C12932j.m33818b(coroutineContext, "context");
        return C13048a.m34060a((Job) this, coroutineContext);
    }

    public final <R> void registerSelectClause0(SelectInstance<? super R> selectInstance, Function1<? super Continuation<? super R>, ? extends Object> function1) {
        Object c;
        C12932j.m33818b(selectInstance, "select");
        C12932j.m33818b(function1, "block");
        do {
            c = mo37647c();
            if (!selectInstance.isSelected()) {
                if (!(c instanceof Incomplete)) {
                    if (selectInstance.trySelect(null)) {
                        C13066b.m34086a(function1, selectInstance.getCompletion());
                    }
                    return;
                }
            } else {
                return;
            }
        } while (m34288f(c) != 0);
        selectInstance.disposeOnSelect(invokeOnCompletion(new C13158y0(this, selectInstance, function1)));
    }

    public final boolean start() {
        int f;
        do {
            f = m34288f(mo37647c());
            if (f == 0) {
                return false;
            }
        } while (f != 1);
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo37654g());
        sb.append('@');
        sb.append(C13151v.m34331b(this));
        return sb.toString();
    }

    /* renamed from: a */
    private final boolean m34278a(C13138b bVar, Object obj, int i) {
        boolean a;
        Throwable a2;
        boolean z = false;
        if (!(mo37647c() == bVar)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!(!bVar.mo37660b())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (bVar.isCompleting) {
            C13118j jVar = (C13118j) (!(obj instanceof C13118j) ? null : obj);
            Throwable th = jVar != null ? jVar.f33714a : null;
            synchronized (bVar) {
                a = bVar.mo37658a();
                List b = bVar.mo37659b(th);
                a2 = m34265a(bVar, b);
                if (a2 != null) {
                    m34270a(a2, b);
                }
            }
            if (!(a2 == null || a2 == th)) {
                obj = new C13118j(a2, false, 2, null);
            }
            if (a2 != null) {
                if (m34289f(a2) || mo37648c(a2)) {
                    z = true;
                }
                if (z) {
                    if (obj != null) {
                        ((C13118j) obj).mo37628a();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    }
                }
            }
            if (!a) {
                mo37652e(a2);
            }
            mo37644b(obj);
            if (f33727e.compareAndSet(this, bVar, C13143s0.m34322a(obj))) {
                m34271a((Incomplete) bVar, obj, i);
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected state: ");
            sb.append(this._state);
            sb.append(", expected: ");
            sb.append(bVar);
            sb.append(", update: ");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString().toString());
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r8 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        m34275a(((kotlinx.coroutines.C13136r0.C13138b) r2).getList(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        return true;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m34287e(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r7.mo37647c()
            boolean r3 = r2 instanceof kotlinx.coroutines.C13136r0.C13138b
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x004b
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.r0$b r3 = (kotlinx.coroutines.C13136r0.C13138b) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.mo37660b()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0018
            monitor-exit(r2)
            return r4
        L_0x0018:
            r3 = r2
            kotlinx.coroutines.r0$b r3 = (kotlinx.coroutines.C13136r0.C13138b) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.mo37658a()     // Catch:{ all -> 0x0048 }
            if (r8 != 0) goto L_0x0023
            if (r3 != 0) goto L_0x0030
        L_0x0023:
            if (r1 == 0) goto L_0x0026
            goto L_0x002a
        L_0x0026:
            java.lang.Throwable r1 = r7.m34286d(r8)     // Catch:{ all -> 0x0048 }
        L_0x002a:
            r8 = r2
            kotlinx.coroutines.r0$b r8 = (kotlinx.coroutines.C13136r0.C13138b) r8     // Catch:{ all -> 0x0048 }
            r8.mo37657a(r1)     // Catch:{ all -> 0x0048 }
        L_0x0030:
            r8 = r2
            kotlinx.coroutines.r0$b r8 = (kotlinx.coroutines.C13136r0.C13138b) r8     // Catch:{ all -> 0x0048 }
            java.lang.Throwable r8 = r8.rootCause     // Catch:{ all -> 0x0048 }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r8 = r0
        L_0x003b:
            monitor-exit(r2)
            if (r8 == 0) goto L_0x0047
            kotlinx.coroutines.r0$b r2 = (kotlinx.coroutines.C13136r0.C13138b) r2
            kotlinx.coroutines.u0 r0 = r2.getList()
            r7.m34275a(r0, r8)
        L_0x0047:
            return r5
        L_0x0048:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x004b:
            boolean r3 = r2 instanceof kotlinx.coroutines.Incomplete
            if (r3 == 0) goto L_0x00a2
            if (r1 == 0) goto L_0x0052
            goto L_0x0056
        L_0x0052:
            java.lang.Throwable r1 = r7.m34286d(r8)
        L_0x0056:
            r3 = r2
            kotlinx.coroutines.Incomplete r3 = (kotlinx.coroutines.Incomplete) r3
            boolean r6 = r3.isActive()
            if (r6 == 0) goto L_0x0066
            boolean r2 = r7.m34277a(r3, r1)
            if (r2 == 0) goto L_0x0002
            return r5
        L_0x0066:
            kotlinx.coroutines.j r3 = new kotlinx.coroutines.j
            r6 = 2
            r3.<init>(r1, r4, r6, r0)
            int r3 = r7.m34264a(r2, r3, r4)
            if (r3 == 0) goto L_0x0087
            if (r3 == r5) goto L_0x0086
            if (r3 == r6) goto L_0x0086
            r2 = 3
            if (r3 != r2) goto L_0x007a
            goto L_0x0002
        L_0x007a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected result"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x0086:
            return r5
        L_0x0087:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Cannot happen in "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L_0x00a2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13136r0.m34287e(java.lang.Object):boolean");
    }

    /* renamed from: g */
    private final String m34290g(Object obj) {
        String str = "Active";
        if (obj instanceof C13138b) {
            C13138b bVar = (C13138b) obj;
            if (bVar.mo37658a()) {
                return "Cancelling";
            }
            if (bVar.isCompleting) {
                return "Completing";
            }
            return str;
        } else if (!(obj instanceof Incomplete)) {
            return obj instanceof C13118j ? "Cancelled" : "Completed";
        } else {
            if (((Incomplete) obj).isActive()) {
                return str;
            }
            return "New";
        }
    }

    public void cancel(CancellationException cancellationException) {
        cancel((Throwable) cancellationException);
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r4v0, types: [kotlinx.coroutines.v0] */
    /* JADX WARNING: type inference failed for: r4v1, types: [kotlinx.coroutines.DisposableHandle] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [kotlinx.coroutines.DisposableHandle, kotlinx.coroutines.q0] */
    /* JADX WARNING: type inference failed for: r1v5, types: [kotlinx.coroutines.q0] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7, types: [kotlinx.coroutines.DisposableHandle, kotlinx.coroutines.q0] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r1v8, types: [kotlinx.coroutines.q0] */
    /* JADX WARNING: type inference failed for: r1v9, types: [kotlinx.coroutines.DisposableHandle, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v10, types: [kotlinx.coroutines.q0] */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0007, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v2
      assigns: []
      uses: []
      mth insns count: 91
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(boolean r8, boolean r9, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.C12956q> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "handler"
            kotlin.jvm.internal.C12932j.m33818b(r10, r0)
            r0 = 0
            r1 = r0
        L_0x0007:
            java.lang.Object r2 = r7.mo37647c()
            boolean r3 = r2 instanceof kotlinx.coroutines.C13064c0
            if (r3 == 0) goto L_0x002c
            r3 = r2
            kotlinx.coroutines.c0 r3 = (kotlinx.coroutines.C13064c0) r3
            boolean r4 = r3.isActive()
            if (r4 == 0) goto L_0x0028
            if (r1 == 0) goto L_0x001b
            goto L_0x001f
        L_0x001b:
            kotlinx.coroutines.q0 r1 = r7.m34269a(r10, r8)
        L_0x001f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f33727e
            boolean r2 = r3.compareAndSet(r7, r2, r1)
            if (r2 == 0) goto L_0x0007
            return r1
        L_0x0028:
            r7.m34272a(r3)
            goto L_0x0007
        L_0x002c:
            boolean r3 = r2 instanceof kotlinx.coroutines.Incomplete
            if (r3 == 0) goto L_0x0096
            r3 = r2
            kotlinx.coroutines.Incomplete r3 = (kotlinx.coroutines.Incomplete) r3
            kotlinx.coroutines.u0 r3 = r3.getList()
            if (r3 != 0) goto L_0x0049
            if (r2 == 0) goto L_0x0041
            kotlinx.coroutines.q0 r2 = (kotlinx.coroutines.C13133q0) r2
            r7.m34280b(r2)
            goto L_0x0007
        L_0x0041:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            java.lang.String r9 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>"
            r8.<init>(r9)
            throw r8
        L_0x0049:
            kotlinx.coroutines.v0 r4 = kotlinx.coroutines.C13152v0.f33756e
            if (r8 == 0) goto L_0x007f
            boolean r5 = r2 instanceof kotlinx.coroutines.C13136r0.C13138b
            if (r5 == 0) goto L_0x007f
            monitor-enter(r2)
            r5 = r2
            kotlinx.coroutines.r0$b r5 = (kotlinx.coroutines.C13136r0.C13138b) r5     // Catch:{ all -> 0x007c }
            java.lang.Throwable r5 = r5.rootCause     // Catch:{ all -> 0x007c }
            if (r5 == 0) goto L_0x0064
            boolean r6 = r10 instanceof kotlinx.coroutines.C13082i     // Catch:{ all -> 0x007c }
            if (r6 == 0) goto L_0x0078
            r6 = r2
            kotlinx.coroutines.r0$b r6 = (kotlinx.coroutines.C13136r0.C13138b) r6     // Catch:{ all -> 0x007c }
            boolean r6 = r6.isCompleting     // Catch:{ all -> 0x007c }
            if (r6 != 0) goto L_0x0078
        L_0x0064:
            if (r1 == 0) goto L_0x0067
            goto L_0x006b
        L_0x0067:
            kotlinx.coroutines.q0 r1 = r7.m34269a(r10, r8)     // Catch:{ all -> 0x007c }
        L_0x006b:
            boolean r4 = r7.m34276a(r2, r3, r1)     // Catch:{ all -> 0x007c }
            if (r4 != 0) goto L_0x0073
            monitor-exit(r2)
            goto L_0x0007
        L_0x0073:
            if (r5 != 0) goto L_0x0077
            monitor-exit(r2)
            return r1
        L_0x0077:
            r4 = r1
        L_0x0078:
            kotlin.q r6 = kotlin.C12956q.f33541a     // Catch:{ all -> 0x007c }
            monitor-exit(r2)
            goto L_0x0080
        L_0x007c:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x007f:
            r5 = r0
        L_0x0080:
            if (r5 == 0) goto L_0x0088
            if (r9 == 0) goto L_0x0087
            r10.invoke(r5)
        L_0x0087:
            return r4
        L_0x0088:
            if (r1 == 0) goto L_0x008b
            goto L_0x008f
        L_0x008b:
            kotlinx.coroutines.q0 r1 = r7.m34269a(r10, r8)
        L_0x008f:
            boolean r2 = r7.m34276a(r2, r3, r1)
            if (r2 == 0) goto L_0x0007
            return r1
        L_0x0096:
            if (r9 == 0) goto L_0x00a6
            boolean r8 = r2 instanceof kotlinx.coroutines.C13118j
            if (r8 != 0) goto L_0x009d
            r2 = r0
        L_0x009d:
            kotlinx.coroutines.j r2 = (kotlinx.coroutines.C13118j) r2
            if (r2 == 0) goto L_0x00a3
            java.lang.Throwable r0 = r2.f33714a
        L_0x00a3:
            r10.invoke(r0)
        L_0x00a6:
            kotlinx.coroutines.v0 r8 = kotlinx.coroutines.C13152v0.f33756e
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13136r0.invokeOnCompletion(boolean, boolean, kotlin.jvm.functions.Function1):kotlinx.coroutines.DisposableHandle");
    }

    public Job plus(Job job) {
        C12932j.m33818b(job, "other");
        C13048a.m34062a((Job) this, job);
        return job;
    }

    /* renamed from: d */
    public void mo37649d(Throwable th) {
        C12932j.m33818b(th, "exception");
        throw th;
    }

    /* renamed from: f */
    private final int m34288f(Object obj) {
        if (obj instanceof C13064c0) {
            if (((C13064c0) obj).isActive()) {
                return 0;
            }
            if (!f33727e.compareAndSet(this, obj, C13143s0.f33747b)) {
                return -1;
            }
            mo37653f();
            return 1;
        } else if (!(obj instanceof C13083i0)) {
            return 0;
        } else {
            if (!f33727e.compareAndSet(this, obj, ((C13083i0) obj).getList())) {
                return -1;
            }
            mo37653f();
            return 1;
        }
    }

    /* renamed from: b */
    private final void m34280b(C13133q0<?> q0Var) {
        q0Var.mo37593a(new C13150u0());
        f33727e.compareAndSet(this, q0Var, q0Var.mo37594b());
    }

    /* renamed from: b */
    public boolean mo37646b(Throwable th) {
        C12932j.m33818b(th, "cause");
        boolean z = true;
        if (th instanceof CancellationException) {
            return true;
        }
        if (!mo37642a((Object) th) || !mo37641a()) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    private final C13150u0 m34279b(Incomplete incomplete) {
        C13150u0 list = incomplete.getList();
        if (list != null) {
            return list;
        }
        if (incomplete instanceof C13064c0) {
            return new C13150u0();
        }
        if (incomplete instanceof C13133q0) {
            m34280b((C13133q0) incomplete);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("State should have list: ");
        sb.append(incomplete);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: b */
    private final boolean m34283b(C13138b bVar, C13082i iVar, Object obj) {
        while (C13048a.m34061a(iVar.f33666i, false, false, new C13137a(this, bVar, iVar, obj), 1, null) == C13152v0.f33756e) {
            iVar = m34268a((C13099i) iVar);
            if (iVar == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final Object mo37647c() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C13104k)) {
                return obj;
            }
            ((C13104k) obj).mo37580a(this);
        }
    }

    /* renamed from: c */
    private final boolean m34285c(Object obj) {
        int a;
        do {
            Object c = mo37647c();
            if ((c instanceof Incomplete) && (!(c instanceof C13138b) || !((C13138b) c).isCompleting)) {
                a = m34264a(c, (Object) new C13118j(m34286d(obj), false, 2, null), 0);
                if (a != 0) {
                    if (a == 1 || a == 2) {
                        return true;
                    }
                }
            }
            return false;
        } while (a == 3);
        throw new IllegalStateException("unexpected result".toString());
    }

    /* renamed from: b */
    private final void m34281b(C13150u0 u0Var, Throwable th) {
        Object a = u0Var.mo37592a();
        if (a != null) {
            Throwable th2 = null;
            for (C13099i iVar = (C13099i) a; !C12932j.m33817a((Object) iVar, (Object) u0Var); iVar = iVar.mo37594b()) {
                if (iVar instanceof C13133q0) {
                    C13133q0 q0Var = (C13133q0) iVar;
                    try {
                        q0Var.mo37574a(th);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            C12813b.m33495a(th2, th3);
                            if (th2 != null) {
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Exception in completion handler ");
                        sb.append(q0Var);
                        sb.append(" for ");
                        sb.append(this);
                        th2 = new CompletionHandlerException(sb.toString(), th3);
                        C12956q qVar = C12956q.f33541a;
                    }
                }
            }
            if (th2 != null) {
                mo37649d(th2);
                throw null;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: a */
    private final Throwable m34265a(C13138b bVar, List<? extends Throwable> list) {
        Object obj;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th = (Throwable) obj;
            if (th == null) {
                th = (Throwable) list.get(0);
            }
            return th;
        } else if (bVar.mo37658a()) {
            return m34291h();
        } else {
            return null;
        }
    }

    /* renamed from: a */
    private final void m34270a(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set a = C13088e.m34155a(list.size());
            Throwable b = C13106m.m34215b(th);
            for (Throwable b2 : list) {
                Throwable b3 = C13106m.m34215b(b2);
                if (b3 != th && b3 != b && !(b3 instanceof CancellationException) && a.add(b3)) {
                    C12813b.m33495a(th, b3);
                }
            }
        }
    }

    /* renamed from: a */
    private final void m34271a(Incomplete incomplete, Object obj, int i) {
        ChildHandle childHandle = this.parentHandle;
        if (childHandle != null) {
            childHandle.dispose();
            this.parentHandle = C13152v0.f33756e;
        }
        C13118j jVar = (C13118j) (!(obj instanceof C13118j) ? null : obj);
        Throwable th = jVar != null ? jVar.f33714a : null;
        if (incomplete instanceof C13133q0) {
            try {
                ((C13133q0) incomplete).mo37574a(th);
            } catch (Throwable th2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in completion handler ");
                sb.append(incomplete);
                sb.append(" for ");
                sb.append(this);
                mo37649d((Throwable) new CompletionHandlerException(sb.toString(), th2));
                throw null;
            }
        } else {
            C13150u0 list = incomplete.getList();
            if (list != null) {
                m34281b(list, th);
            }
        }
        mo37639a(obj, i);
    }

    /* renamed from: a */
    private final void m34275a(C13150u0 u0Var, Throwable th) {
        mo37652e(th);
        Object a = u0Var.mo37592a();
        if (a != null) {
            Throwable th2 = null;
            for (C13099i iVar = (C13099i) a; !C12932j.m33817a((Object) iVar, (Object) u0Var); iVar = iVar.mo37594b()) {
                if (iVar instanceof C13127n0) {
                    C13133q0 q0Var = (C13133q0) iVar;
                    try {
                        q0Var.mo37574a(th);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            C12813b.m33495a(th2, th3);
                            if (th2 != null) {
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Exception in completion handler ");
                        sb.append(q0Var);
                        sb.append(" for ");
                        sb.append(this);
                        th2 = new CompletionHandlerException(sb.toString(), th3);
                        C12956q qVar = C12956q.f33541a;
                    }
                }
            }
            if (th2 == null) {
                m34289f(th);
            } else {
                mo37649d(th2);
                throw null;
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        }
    }

    /* renamed from: a */
    public static /* synthetic */ CancellationException m34266a(C13136r0 r0Var, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return r0Var.mo37638a(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final CancellationException mo37638a(Throwable th, String str) {
        C12932j.m33818b(th, "$this$toCancellationException");
        CancellationException cancellationException = (CancellationException) (!(th instanceof CancellationException) ? null : th);
        if (cancellationException == null) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(C13151v.m34329a((Object) th));
                sb.append(" was cancelled");
                str = sb.toString();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    /* renamed from: a */
    private final C13133q0<?> m34269a(Function1<? super Throwable, C12956q> function1, boolean z) {
        String str = "Failed requirement.";
        boolean z2 = true;
        C13127n0 n0Var = null;
        if (z) {
            if (function1 instanceof C13127n0) {
                n0Var = function1;
            }
            C13127n0 n0Var2 = n0Var;
            if (n0Var2 != null) {
                if (n0Var2.f33725h != this) {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalArgumentException(str.toString());
                } else if (n0Var2 != null) {
                    return n0Var2;
                }
            }
            return new C13123l0(this, function1);
        }
        if (function1 instanceof C13133q0) {
            n0Var = function1;
        }
        C13133q0<?> q0Var = n0Var;
        if (q0Var != null) {
            if (q0Var.f33725h != this || (q0Var instanceof C13127n0)) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(str.toString());
            } else if (q0Var != null) {
                return q0Var;
            }
        }
        return new C13125m0(this, function1);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [kotlinx.coroutines.i0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m34272a(kotlinx.coroutines.C13064c0 r3) {
        /*
            r2 = this;
            kotlinx.coroutines.u0 r0 = new kotlinx.coroutines.u0
            r0.<init>()
            boolean r1 = r3.isActive()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            kotlinx.coroutines.i0 r1 = new kotlinx.coroutines.i0
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f33727e
            r1.compareAndSet(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13136r0.m34272a(kotlinx.coroutines.c0):void");
    }

    /* renamed from: a */
    public boolean cancel(Throwable th) {
        return mo37642a((Object) th) && mo37641a();
    }

    /* renamed from: a */
    public final boolean mo37642a(Object obj) {
        if (!mo37645b() || !m34285c(obj)) {
            return m34287e(obj);
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m34277a(Incomplete incomplete, Throwable th) {
        if (C13149u.m34325a() && !(!(incomplete instanceof C13138b))) {
            throw new AssertionError();
        } else if (!C13149u.m34325a() || incomplete.isActive()) {
            C13150u0 b = m34279b(incomplete);
            if (b == null) {
                return false;
            }
            if (!f33727e.compareAndSet(this, incomplete, new C13138b(b, false, th))) {
                return false;
            }
            m34275a(b, th);
            return true;
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private final int m34264a(Object obj, Object obj2, int i) {
        if (!(obj instanceof Incomplete)) {
            return 0;
        }
        if (((obj instanceof C13064c0) || (obj instanceof C13133q0)) && !(obj instanceof C13082i) && !(obj2 instanceof C13118j)) {
            return !m34282b((Incomplete) obj, obj2, i) ? 3 : 1;
        }
        return m34284c((Incomplete) obj, obj2, i);
    }

    /* renamed from: a */
    private final C13082i m34267a(Incomplete incomplete) {
        C13082i iVar = (C13082i) (!(incomplete instanceof C13082i) ? null : incomplete);
        if (iVar != null) {
            return iVar;
        }
        C13150u0 list = incomplete.getList();
        if (list != null) {
            return m34268a((C13099i) list);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m34273a(C13138b bVar, C13082i iVar, Object obj) {
        if (mo37647c() == bVar) {
            C13082i a = m34268a((C13099i) iVar);
            if ((a == null || !m34283b(bVar, a, obj)) && m34278a(bVar, obj, 0)) {
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: a */
    private final C13082i m34268a(C13099i iVar) {
        while (iVar.mo37598f()) {
            iVar = iVar.mo37596d();
        }
        while (true) {
            iVar = iVar.mo37594b();
            if (!iVar.mo37598f()) {
                if (iVar instanceof C13082i) {
                    return (C13082i) iVar;
                }
                if (iVar instanceof C13150u0) {
                    return null;
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m34276a(Object obj, C13150u0 u0Var, C13133q0<?> q0Var) {
        int a;
        C13139c cVar = new C13139c(q0Var, q0Var, this, obj);
        do {
            Object c = u0Var.mo37595c();
            if (c != null) {
                a = ((C13099i) c).mo37591a(q0Var, u0Var, cVar);
                if (a == 1) {
                    return true;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (a != 2);
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo37637a(Continuation<? super C12956q> continuation) {
        C13070e eVar = new C13070e(C12877c.m33719a(continuation), 1);
        C13076f.m34134a(eVar, invokeOnCompletion(new C13156x0(this, eVar)));
        Object c = eVar.mo37546c();
        if (c == C12882d.m33726a()) {
            C12889f.m33745c(continuation);
        }
        return c;
    }

    /* renamed from: a */
    public final void mo37640a(C13133q0<?> q0Var) {
        Object c;
        C12932j.m33818b(q0Var, "node");
        do {
            c = mo37647c();
            if (!(c instanceof C13133q0)) {
                if ((c instanceof Incomplete) && ((Incomplete) c).getList() != null) {
                    q0Var.mo37599g();
                }
                return;
            } else if (c != q0Var) {
                return;
            }
        } while (!f33727e.compareAndSet(this, c, C13143s0.f33747b));
    }
}
