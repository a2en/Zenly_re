package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C10273b1.C10274a;

/* renamed from: com.google.android.gms.internal.clearcut.k4 */
public final class C10346k4 extends C10273b1<C10346k4, C10347a> implements zzdq {
    /* access modifiers changed from: private */
    public static final C10346k4 zzbfc = new C10346k4();
    private static volatile zzdz<C10346k4> zzbg;
    private int zzbb;
    private int zzbfa = -1;
    private int zzbfb;

    /* renamed from: com.google.android.gms.internal.clearcut.k4$a */
    public static final class C10347a extends C10274a<C10346k4, C10347a> implements zzdq {
        private C10347a() {
            super(C10346k4.zzbfc);
        }

        /* synthetic */ C10347a(C10361m4 m4Var) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.k4$b */
    public enum C10348b implements zzcj {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: A */
        private static final zzck<C10348b> f27081A = null;

        /* renamed from: e */
        private final int f27104e;

        static {
            f27081A = new C10367n4();
        }

        private C10348b(int i) {
            this.f27104e = i;
        }

        /* renamed from: a */
        public static C10348b m26284a(int i) {
            if (i == 100) {
                return COMBINED;
            }
            switch (i) {
                case 0:
                    return UNKNOWN_MOBILE_SUBTYPE;
                case 1:
                    return GPRS;
                case 2:
                    return EDGE;
                case 3:
                    return UMTS;
                case 4:
                    return CDMA;
                case 5:
                    return EVDO_0;
                case 6:
                    return EVDO_A;
                case 7:
                    return RTT;
                case 8:
                    return HSDPA;
                case 9:
                    return HSUPA;
                case 10:
                    return HSPA;
                case 11:
                    return IDEN;
                case 12:
                    return EVDO_B;
                case 13:
                    return LTE;
                case 14:
                    return EHRPD;
                case 15:
                    return HSPAP;
                case 16:
                    return GSM;
                case 17:
                    return TD_SCDMA;
                case 18:
                    return IWLAN;
                case 19:
                    return LTE_CA;
                default:
                    return null;
            }
        }

        public static zzck<C10348b> zzd() {
            return f27081A;
        }

        public final int zzc() {
            return this.f27104e;
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.k4$c */
    public enum C10349c implements zzcj {
        NONE(-1),
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17);
        

        /* renamed from: y */
        private static final zzck<C10349c> f27124y = null;

        /* renamed from: e */
        private final int f27126e;

        static {
            f27124y = new C10373o4();
        }

        private C10349c(int i) {
            this.f27126e = i;
        }

        /* renamed from: a */
        public static C10349c m26285a(int i) {
            switch (i) {
                case -1:
                    return NONE;
                case 0:
                    return MOBILE;
                case 1:
                    return WIFI;
                case 2:
                    return MOBILE_MMS;
                case 3:
                    return MOBILE_SUPL;
                case 4:
                    return MOBILE_DUN;
                case 5:
                    return MOBILE_HIPRI;
                case 6:
                    return WIMAX;
                case 7:
                    return BLUETOOTH;
                case 8:
                    return DUMMY;
                case 9:
                    return ETHERNET;
                case 10:
                    return MOBILE_FOTA;
                case 11:
                    return MOBILE_IMS;
                case 12:
                    return MOBILE_CBS;
                case 13:
                    return WIFI_P2P;
                case 14:
                    return MOBILE_IA;
                case 15:
                    return MOBILE_EMERGENCY;
                case 16:
                    return PROXY;
                case 17:
                    return VPN;
                default:
                    return null;
            }
        }

        public static zzck<C10349c> zzd() {
            return f27124y;
        }

        public final int zzc() {
            return this.f27126e;
        }
    }

    static {
        C10273b1.m25923a(C10346k4.class, zzbfc);
    }

    private C10346k4() {
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.k4>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.k4>] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.b1$b, com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.k4>] */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
      assigns: []
      uses: []
      mth insns count: 46
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
                case 1: goto L_0x0061;
                case 2: goto L_0x005b;
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
            com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.k4> r2 = zzbg
            if (r2 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.clearcut.k4> r3 = com.google.android.gms.internal.clearcut.C10346k4.class
            monitor-enter(r3)
            com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.k4> r2 = zzbg     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.clearcut.b1$b r2 = new com.google.android.gms.internal.clearcut.b1$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.clearcut.k4 r4 = zzbfc     // Catch:{ all -> 0x002c }
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
            com.google.android.gms.internal.clearcut.k4 r2 = zzbfc
            return r2
        L_0x0033:
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = "zzbb"
            r2[r3] = r0
            java.lang.String r3 = "zzbfa"
            r2[r4] = r3
            r3 = 2
            com.google.android.gms.internal.clearcut.zzck r4 = com.google.android.gms.internal.clearcut.C10346k4.C10349c.zzd()
            r2[r3] = r4
            r3 = 3
            java.lang.String r4 = "zzbfb"
            r2[r3] = r4
            r3 = 4
            com.google.android.gms.internal.clearcut.zzck r4 = com.google.android.gms.internal.clearcut.C10346k4.C10348b.zzd()
            r2[r3] = r4
            com.google.android.gms.internal.clearcut.k4 r3 = zzbfc
            java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001"
            java.lang.Object r2 = com.google.android.gms.internal.clearcut.C10273b1.m25921a(r3, r4, r2)
            return r2
        L_0x005b:
            com.google.android.gms.internal.clearcut.k4$a r2 = new com.google.android.gms.internal.clearcut.k4$a
            r2.<init>(r3)
            return r2
        L_0x0061:
            com.google.android.gms.internal.clearcut.k4 r2 = new com.google.android.gms.internal.clearcut.k4
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10346k4.mo27802a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
