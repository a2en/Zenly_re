package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C10273b1.C10274a;
import com.google.android.gms.internal.clearcut.C10273b1.C10278e;
import java.util.List;

/* renamed from: com.google.android.gms.internal.clearcut.q4 */
public final class C10385q4 extends C10273b1<C10385q4, C10386a> implements zzdq {
    private static volatile zzdz<C10385q4> zzbg;
    /* access modifiers changed from: private */
    public static final C10385q4 zzbir = new C10385q4();
    private zzcn<C10387b> zzbiq = C10273b1.m25926b();

    /* renamed from: com.google.android.gms.internal.clearcut.q4$a */
    public static final class C10386a extends C10274a<C10385q4, C10386a> implements zzdq {
        private C10386a() {
            super(C10385q4.zzbir);
        }

        /* synthetic */ C10386a(C10394r4 r4Var) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.q4$b */
    public static final class C10387b extends C10273b1<C10387b, C10388a> implements zzdq {
        private static volatile zzdz<C10387b> zzbg;
        /* access modifiers changed from: private */
        public static final C10387b zzbiv = new C10387b();
        private int zzbb;
        private String zzbis = "";
        private long zzbit;
        private long zzbiu;
        private int zzya;

        /* renamed from: com.google.android.gms.internal.clearcut.q4$b$a */
        public static final class C10388a extends C10274a<C10387b, C10388a> implements zzdq {
            private C10388a() {
                super(C10387b.zzbiv);
            }

            /* synthetic */ C10388a(C10394r4 r4Var) {
                this();
            }

            /* renamed from: a */
            public final C10388a mo28111a(long j) {
                mo27815a();
                ((C10387b) this.f26885f).m26472a(j);
                return this;
            }

            /* renamed from: a */
            public final C10388a mo28112a(String str) {
                mo27815a();
                ((C10387b) this.f26885f).m26475a(str);
                return this;
            }

            /* renamed from: b */
            public final C10388a mo28113b(long j) {
                mo27815a();
                ((C10387b) this.f26885f).m26476b(j);
                return this;
            }
        }

        static {
            C10273b1.m25923a(C10387b.class, zzbiv);
        }

        private C10387b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m26472a(long j) {
            this.zzbb |= 4;
            this.zzbit = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m26475a(String str) {
            if (str != null) {
                this.zzbb |= 2;
                this.zzbis = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m26476b(long j) {
            this.zzbb |= 8;
            this.zzbiu = j;
        }

        /* renamed from: h */
        public static C10388a m26478h() {
            return (C10388a) zzbiv.mo27802a(C10278e.f26893e, null, null);
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.q4$b>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.q4$b>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.q4$b>, com.google.android.gms.internal.clearcut.b1$b] */
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
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
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
                int[] r3 = com.google.android.gms.internal.clearcut.C10394r4.f27177a
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x005d;
                    case 2: goto L_0x0057;
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
                com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.q4$b> r2 = zzbg
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.gms.internal.clearcut.q4$b> r3 = com.google.android.gms.internal.clearcut.C10385q4.C10387b.class
                monitor-enter(r3)
                com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.q4$b> r2 = zzbg     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.gms.internal.clearcut.b1$b r2 = new com.google.android.gms.internal.clearcut.b1$b     // Catch:{ all -> 0x002c }
                com.google.android.gms.internal.clearcut.q4$b r4 = zzbiv     // Catch:{ all -> 0x002c }
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
                com.google.android.gms.internal.clearcut.q4$b r2 = zzbiv
                return r2
            L_0x0033:
                r2 = 5
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzbb"
                r2[r3] = r0
                java.lang.String r3 = "zzya"
                r2[r4] = r3
                r3 = 2
                java.lang.String r4 = "zzbis"
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zzbit"
                r2[r3] = r4
                r3 = 4
                java.lang.String r4 = "zzbiu"
                r2[r3] = r4
                com.google.android.gms.internal.clearcut.q4$b r3 = zzbiv
                java.lang.String r4 = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003"
                java.lang.Object r2 = com.google.android.gms.internal.clearcut.C10273b1.m25921a(r3, r4, r2)
                return r2
            L_0x0057:
                com.google.android.gms.internal.clearcut.q4$b$a r2 = new com.google.android.gms.internal.clearcut.q4$b$a
                r2.<init>(r3)
                return r2
            L_0x005d:
                com.google.android.gms.internal.clearcut.q4$b r2 = new com.google.android.gms.internal.clearcut.q4$b
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10385q4.C10387b.mo27802a(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /* renamed from: c */
        public final int mo28106c() {
            return this.zzya;
        }

        /* renamed from: d */
        public final boolean mo28107d() {
            return (this.zzbb & 1) == 1;
        }

        /* renamed from: e */
        public final String mo28108e() {
            return this.zzbis;
        }

        /* renamed from: f */
        public final long mo28109f() {
            return this.zzbit;
        }

        /* renamed from: g */
        public final long mo28110g() {
            return this.zzbiu;
        }
    }

    static {
        C10273b1.m25923a(C10385q4.class, zzbir);
    }

    private C10385q4() {
    }

    /* renamed from: a */
    public static C10385q4 m26467a(byte[] bArr) throws zzco {
        return (C10385q4) C10273b1.m25925b(zzbir, bArr);
    }

    /* renamed from: d */
    public static C10385q4 m26468d() {
        return zzbir;
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.q4>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.q4>] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.q4>, com.google.android.gms.internal.clearcut.b1$b] */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
      assigns: []
      uses: []
      mth insns count: 40
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
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo27802a(int r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            r1 = this;
            int[] r3 = com.google.android.gms.internal.clearcut.C10394r4.f27177a
            r4 = 1
            int r2 = r2 - r4
            r2 = r3[r2]
            r3 = 0
            switch(r2) {
                case 1: goto L_0x004e;
                case 2: goto L_0x0048;
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
            com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.q4> r2 = zzbg
            if (r2 != 0) goto L_0x002f
            java.lang.Class<com.google.android.gms.internal.clearcut.q4> r3 = com.google.android.gms.internal.clearcut.C10385q4.class
            monitor-enter(r3)
            com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.q4> r2 = zzbg     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x002a
            com.google.android.gms.internal.clearcut.b1$b r2 = new com.google.android.gms.internal.clearcut.b1$b     // Catch:{ all -> 0x002c }
            com.google.android.gms.internal.clearcut.q4 r4 = zzbir     // Catch:{ all -> 0x002c }
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
            com.google.android.gms.internal.clearcut.q4 r2 = zzbir
            return r2
        L_0x0033:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r0 = "zzbiq"
            r2[r3] = r0
            java.lang.Class<com.google.android.gms.internal.clearcut.q4$b> r3 = com.google.android.gms.internal.clearcut.C10385q4.C10387b.class
            r2[r4] = r3
            com.google.android.gms.internal.clearcut.q4 r3 = zzbir
            java.lang.String r4 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b"
            java.lang.Object r2 = com.google.android.gms.internal.clearcut.C10273b1.m25921a(r3, r4, r2)
            return r2
        L_0x0048:
            com.google.android.gms.internal.clearcut.q4$a r2 = new com.google.android.gms.internal.clearcut.q4$a
            r2.<init>(r3)
            return r2
        L_0x004e:
            com.google.android.gms.internal.clearcut.q4 r2 = new com.google.android.gms.internal.clearcut.q4
            r2.<init>()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10385q4.mo27802a(int, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final List<C10387b> mo28105c() {
        return this.zzbiq;
    }
}
