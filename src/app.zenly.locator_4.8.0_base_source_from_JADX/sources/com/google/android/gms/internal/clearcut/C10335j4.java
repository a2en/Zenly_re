package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C10273b1.C10274a;

/* renamed from: com.google.android.gms.internal.clearcut.j4 */
public final class C10335j4 extends C10273b1<C10335j4, C10336a> implements zzdq {
    private static volatile zzdz<C10335j4> zzbg;
    /* access modifiers changed from: private */
    public static final C10335j4 zztx = new C10335j4();
    private int zzbb;
    private int zztu;
    private String zztv;
    private String zztw;

    /* renamed from: com.google.android.gms.internal.clearcut.j4$a */
    public static final class C10336a extends C10274a<C10335j4, C10336a> implements zzdq {
        private C10336a() {
            super(C10335j4.zztx);
        }

        /* synthetic */ C10336a(C10361m4 m4Var) {
            this();
        }
    }

    static {
        C10273b1.m25923a(C10335j4.class, zztx);
    }

    private C10335j4() {
        String str = "";
        this.zztv = str;
        this.zztw = str;
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.j4>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.j4>] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.b1$b, com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.j4>] */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
      assigns: []
      uses: []
      mth insns count: 44
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo27802a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            r1 = this;
            int[] r3 = com.google.android.gms.internal.clearcut.C10361m4.f27146a
            r4 = 1
            int r2 = r2 - r4
            r2 = r3[r2]
            r3 = 0
            switch(r2) {
                case 1: goto L_0x0058;
                case 2: goto L_0x0052;
                case 3: goto L_0x0033;
                case 4: goto L_0x0030;
                case 5: goto L_0x0016;
                case 6: goto L_0x0011;
                case 7: goto L_0x0010;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
        L_0x0010:
            return r3
        L_0x0011:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r4)
            return r2
        L_0x0016:
            com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.j4> r2 = zzbg
            if (r2 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.clearcut.j4> r3 = com.google.android.gms.internal.clearcut.C10335j4.class
            monitor-enter(r3)
            com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.j4> r2 = zzbg     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.clearcut.b1$b r2 = new com.google.android.gms.internal.clearcut.b1$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.clearcut.j4 r4 = zztx     // Catch:{ all -> 0x002c }
            r2.<init>(r4)     // Catch:{ all -> 0x002c }
            zzbg = r2     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            goto L_0x002f
        L_0x002c:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            throw r2
        L_0x002f:
            return r2
        L_0x0030:
            com.google.android.gms.internal.clearcut.j4 r2 = zztx
            return r2
        L_0x0033:
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = "zzbb"
            r2[r3] = r0
            java.lang.String r3 = "zztu"
            r2[r4] = r3
            r3 = 2
            java.lang.String r4 = "zztv"
            r2[r3] = r4
            r3 = 3
            java.lang.String r4 = "zztw"
            r2[r3] = r4
            com.google.android.gms.internal.clearcut.j4 r3 = zztx
            java.lang.String r4 = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\b\u0002"
            java.lang.Object r2 = com.google.android.gms.internal.clearcut.C10273b1.m25921a(r3, r4, r2)
            return r2
        L_0x0052:
            com.google.android.gms.internal.clearcut.j4$a r2 = new com.google.android.gms.internal.clearcut.j4$a
            r2.<init>(r3)
            return r2
        L_0x0058:
            com.google.android.gms.internal.clearcut.j4 r2 = new com.google.android.gms.internal.clearcut.j4
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10335j4.mo27802a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
