package com.crashlytics.android.core;

import com.crashlytics.android.core.C9388l0.C9389a;

/* renamed from: com.crashlytics.android.core.h */
class C9321h implements C9409s {

    /* renamed from: a */
    private final C9414u f24184a;

    /* renamed from: b */
    private final C9312d0 f24185b;

    /* renamed from: com.crashlytics.android.core.h$a */
    static /* synthetic */ class C9322a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24186a = new int[C9389a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.crashlytics.android.core.l0$a[] r0 = com.crashlytics.android.core.C9388l0.C9389a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24186a = r0
                int[] r0 = f24186a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.crashlytics.android.core.l0$a r1 = com.crashlytics.android.core.C9388l0.C9389a.JAVA     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f24186a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.crashlytics.android.core.l0$a r1 = com.crashlytics.android.core.C9388l0.C9389a.NATIVE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.C9321h.C9322a.<clinit>():void");
        }
    }

    public C9321h(C9414u uVar, C9312d0 d0Var) {
        this.f24184a = uVar;
        this.f24185b = d0Var;
    }

    /* renamed from: a */
    public boolean mo25076a(C9407r rVar) {
        int i = C9322a.f24186a[rVar.f24368b.getType().ordinal()];
        if (i == 1) {
            this.f24184a.mo25076a(rVar);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.f24185b.mo25076a(rVar);
            return true;
        }
    }
}
