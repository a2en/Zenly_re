package androidx.lifecycle;

import androidx.lifecycle.C0862g.C0863a;

class FullLifecycleObserverAdapter implements LifecycleEventObserver {

    /* renamed from: e */
    private final C0861f f3402e;

    /* renamed from: f */
    private final LifecycleEventObserver f3403f;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    static /* synthetic */ class C0842a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3404a = new int[C0863a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                androidx.lifecycle.g$a[] r0 = androidx.lifecycle.C0862g.C0863a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3404a = r0
                int[] r0 = f3404a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0862g.C0863a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f3404a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0862g.C0863a.ON_START     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f3404a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0862g.C0863a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f3404a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0862g.C0863a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f3404a     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0862g.C0863a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f3404a     // Catch:{ NoSuchFieldError -> 0x004b }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0862g.C0863a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f3404a     // Catch:{ NoSuchFieldError -> 0x0056 }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0862g.C0863a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.C0842a.<clinit>():void");
        }
    }

    FullLifecycleObserverAdapter(C0861f fVar, LifecycleEventObserver lifecycleEventObserver) {
        this.f3402e = fVar;
        this.f3403f = lifecycleEventObserver;
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, C0863a aVar) {
        switch (C0842a.f3404a[aVar.ordinal()]) {
            case 1:
                this.f3402e.mo4439a(lifecycleOwner);
                break;
            case 2:
                this.f3402e.mo4444f(lifecycleOwner);
                break;
            case 3:
                this.f3402e.mo4440b(lifecycleOwner);
                break;
            case 4:
                this.f3402e.mo4441c(lifecycleOwner);
                break;
            case 5:
                this.f3402e.mo4442d(lifecycleOwner);
                break;
            case 6:
                this.f3402e.mo4443e(lifecycleOwner);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        LifecycleEventObserver lifecycleEventObserver = this.f3403f;
        if (lifecycleEventObserver != null) {
            lifecycleEventObserver.onStateChanged(lifecycleOwner, aVar);
        }
    }
}
