package androidx.lifecycle;

import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0862g.C0864b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import p214e.p222b.p223a.p225b.C7557a;

/* renamed from: androidx.lifecycle.k */
public class C0869k extends C0862g {

    /* renamed from: a */
    private C7557a<LifecycleObserver, C0871b> f3466a = new C7557a<>();

    /* renamed from: b */
    private C0864b f3467b;

    /* renamed from: c */
    private final WeakReference<LifecycleOwner> f3468c;

    /* renamed from: d */
    private int f3469d = 0;

    /* renamed from: e */
    private boolean f3470e = false;

    /* renamed from: f */
    private boolean f3471f = false;

    /* renamed from: g */
    private ArrayList<C0864b> f3472g = new ArrayList<>();

    /* renamed from: androidx.lifecycle.k$a */
    static /* synthetic */ class C0870a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3473a = new int[C0863a.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f3474b = new int[C0864b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0086 */
        static {
            /*
                androidx.lifecycle.g$b[] r0 = androidx.lifecycle.C0862g.C0864b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3474b = r0
                r0 = 1
                int[] r1 = f3474b     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.lifecycle.g$b r2 = androidx.lifecycle.C0862g.C0864b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f3474b     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.lifecycle.g$b r3 = androidx.lifecycle.C0862g.C0864b.CREATED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f3474b     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.lifecycle.g$b r4 = androidx.lifecycle.C0862g.C0864b.STARTED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f3474b     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.lifecycle.g$b r5 = androidx.lifecycle.C0862g.C0864b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                r4 = 5
                int[] r5 = f3474b     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.lifecycle.g$b r6 = androidx.lifecycle.C0862g.C0864b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                androidx.lifecycle.g$a[] r5 = androidx.lifecycle.C0862g.C0863a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f3473a = r5
                int[] r5 = f3473a     // Catch:{ NoSuchFieldError -> 0x0053 }
                androidx.lifecycle.g$a r6 = androidx.lifecycle.C0862g.C0863a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r0 = f3473a     // Catch:{ NoSuchFieldError -> 0x005d }
                androidx.lifecycle.g$a r5 = androidx.lifecycle.C0862g.C0863a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x005d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                int[] r0 = f3473a     // Catch:{ NoSuchFieldError -> 0x0067 }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0862g.C0863a.ON_START     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                int[] r0 = f3473a     // Catch:{ NoSuchFieldError -> 0x0071 }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0862g.C0863a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r0 = f3473a     // Catch:{ NoSuchFieldError -> 0x007b }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0862g.C0863a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x007b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = f3473a     // Catch:{ NoSuchFieldError -> 0x0086 }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0862g.C0863a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r0 = f3473a     // Catch:{ NoSuchFieldError -> 0x0091 }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0862g.C0863a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0869k.C0870a.<clinit>():void");
        }
    }

    /* renamed from: androidx.lifecycle.k$b */
    static class C0871b {

        /* renamed from: a */
        C0864b f3475a;

        /* renamed from: b */
        LifecycleEventObserver f3476b;

        C0871b(LifecycleObserver lifecycleObserver, C0864b bVar) {
            this.f3476b = C0872l.m4055a((Object) lifecycleObserver);
            this.f3475a = bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4452a(LifecycleOwner lifecycleOwner, C0863a aVar) {
            C0864b b = C0869k.m4039b(aVar);
            this.f3475a = C0869k.m4036a(this.f3475a, b);
            this.f3476b.onStateChanged(lifecycleOwner, aVar);
            this.f3475a = b;
        }
    }

    public C0869k(LifecycleOwner lifecycleOwner) {
        this.f3468c = new WeakReference<>(lifecycleOwner);
        this.f3467b = C0864b.INITIALIZED;
    }

    /* renamed from: b */
    private boolean m4041b() {
        boolean z = true;
        if (this.f3466a.size() == 0) {
            return true;
        }
        C0864b bVar = ((C0871b) this.f3466a.mo19448a().getValue()).f3475a;
        C0864b bVar2 = ((C0871b) this.f3466a.mo19450c().getValue()).f3475a;
        if (!(bVar == bVar2 && this.f3467b == bVar2)) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private void m4044c(C0864b bVar) {
        if (this.f3467b != bVar) {
            this.f3467b = bVar;
            if (this.f3470e || this.f3469d != 0) {
                this.f3471f = true;
                return;
            }
            this.f3470e = true;
            m4045d();
            this.f3470e = false;
        }
    }

    /* renamed from: d */
    private void m4046d(C0864b bVar) {
        this.f3472g.add(bVar);
    }

    /* renamed from: e */
    private static C0863a m4047e(C0864b bVar) {
        int i = C0870a.f3474b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C0863a.ON_START;
            }
            if (i == 3) {
                return C0863a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state value ");
                sb.append(bVar);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return C0863a.ON_CREATE;
    }

    /* renamed from: a */
    public void mo4451a(C0864b bVar) {
        m4044c(bVar);
    }

    /* renamed from: d */
    private void m4045d() {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f3468c.get();
        if (lifecycleOwner != null) {
            while (!m4041b()) {
                this.f3471f = false;
                if (this.f3467b.compareTo(((C0871b) this.f3466a.mo19448a().getValue()).f3475a) < 0) {
                    m4037a(lifecycleOwner);
                }
                Entry c = this.f3466a.mo19450c();
                if (!this.f3471f && c != null && this.f3467b.compareTo(((C0871b) c.getValue()).f3475a) > 0) {
                    m4040b(lifecycleOwner);
                }
            }
            this.f3471f = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    /* renamed from: a */
    public void mo4450a(C0863a aVar) {
        m4044c(m4039b(aVar));
    }

    /* renamed from: a */
    public void mo4446a(LifecycleObserver lifecycleObserver) {
        C0864b bVar = this.f3467b;
        C0864b bVar2 = C0864b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = C0864b.INITIALIZED;
        }
        C0871b bVar3 = new C0871b(lifecycleObserver, bVar2);
        if (((C0871b) this.f3466a.mo19443b(lifecycleObserver, bVar3)) == null) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f3468c.get();
            if (lifecycleOwner != null) {
                boolean z = this.f3469d != 0 || this.f3470e;
                C0864b c = m4042c(lifecycleObserver);
                this.f3469d++;
                while (bVar3.f3475a.compareTo(c) < 0 && this.f3466a.contains(lifecycleObserver)) {
                    m4046d(bVar3.f3475a);
                    bVar3.mo4452a(lifecycleOwner, m4047e(bVar3.f3475a));
                    m4043c();
                    c = m4042c(lifecycleObserver);
                }
                if (!z) {
                    m4045d();
                }
                this.f3469d--;
            }
        }
    }

    /* renamed from: b */
    public void mo4447b(LifecycleObserver lifecycleObserver) {
        this.f3466a.remove(lifecycleObserver);
    }

    /* renamed from: b */
    static C0864b m4039b(C0863a aVar) {
        switch (C0870a.f3473a[aVar.ordinal()]) {
            case 1:
            case 2:
                return C0864b.CREATED;
            case 3:
            case 4:
                return C0864b.STARTED;
            case 5:
                return C0864b.RESUMED;
            case 6:
                return C0864b.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected event value ");
                sb.append(aVar);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    private C0864b m4042c(LifecycleObserver lifecycleObserver) {
        Entry b = this.f3466a.mo19444b(lifecycleObserver);
        C0864b bVar = null;
        C0864b bVar2 = b != null ? ((C0871b) b.getValue()).f3475a : null;
        if (!this.f3472g.isEmpty()) {
            ArrayList<C0864b> arrayList = this.f3472g;
            bVar = (C0864b) arrayList.get(arrayList.size() - 1);
        }
        return m4036a(m4036a(this.f3467b, bVar2), bVar);
    }

    /* renamed from: b */
    private static C0863a m4038b(C0864b bVar) {
        int i = C0870a.f3474b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return C0863a.ON_DESTROY;
        } else {
            if (i == 3) {
                return C0863a.ON_STOP;
            }
            if (i == 4) {
                return C0863a.ON_PAUSE;
            }
            if (i != 5) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state value ");
                sb.append(bVar);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    private void m4043c() {
        ArrayList<C0864b> arrayList = this.f3472g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: b */
    private void m4040b(LifecycleOwner lifecycleOwner) {
        C7562d b = this.f3466a.mo19449b();
        while (b.hasNext() && !this.f3471f) {
            Entry entry = (Entry) b.next();
            C0871b bVar = (C0871b) entry.getValue();
            while (bVar.f3475a.compareTo(this.f3467b) < 0 && !this.f3471f && this.f3466a.contains(entry.getKey())) {
                m4046d(bVar.f3475a);
                bVar.mo4452a(lifecycleOwner, m4047e(bVar.f3475a));
                m4043c();
            }
        }
    }

    /* renamed from: a */
    public C0864b mo4445a() {
        return this.f3467b;
    }

    /* renamed from: a */
    private void m4037a(LifecycleOwner lifecycleOwner) {
        Iterator descendingIterator = this.f3466a.descendingIterator();
        while (descendingIterator.hasNext() && !this.f3471f) {
            Entry entry = (Entry) descendingIterator.next();
            C0871b bVar = (C0871b) entry.getValue();
            while (bVar.f3475a.compareTo(this.f3467b) > 0 && !this.f3471f && this.f3466a.contains(entry.getKey())) {
                C0863a b = m4038b(bVar.f3475a);
                m4046d(m4039b(b));
                bVar.mo4452a(lifecycleOwner, b);
                m4043c();
            }
        }
    }

    /* renamed from: a */
    static C0864b m4036a(C0864b bVar, C0864b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }
}
