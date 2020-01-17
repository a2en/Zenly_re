package com.google.android.libraries.places.internal;

public final class zzkb {

    public static final class zza extends zzrb<zza, C13856zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zza zze;
        private static volatile zzsw<zza> zzf;
        private int zzc;
        private int zzd;

        /* renamed from: com.google.android.libraries.places.internal.zzkb$zza$zza reason: collision with other inner class name */
        public static final class C13856zza extends com.google.android.libraries.places.internal.zzrb.zzb<zza, C13856zza> implements zzso {
            private C13856zza() {
                super(zza.zze);
            }

            /* synthetic */ C13856zza(zzka zzka) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zze = zza;
            zzrb.zza(zza.class, zza);
        }

        private zza() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zza>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zza>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zza>, com.google.android.libraries.places.internal.zzrb$zza] */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
          assigns: []
          uses: []
          mth insns count: 42
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
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzka.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x0055;
                    case 2: goto L_0x004f;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zza> r2 = zzf
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkb$zza> r3 = com.google.android.libraries.places.internal.zzkb.zza.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zza> r2 = zzf     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkb$zza r4 = zze     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzf = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkb$zza r2 = zze
                return r2
            L_0x0033:
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                r3 = 2
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkf.zzb()
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkb$zza r3 = zze
                java.lang.String r4 = "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x004f:
                com.google.android.libraries.places.internal.zzkb$zza$zza r2 = new com.google.android.libraries.places.internal.zzkb$zza$zza
                r2.<init>(r3)
                return r2
            L_0x0055:
                com.google.android.libraries.places.internal.zzkb$zza r2 = new com.google.android.libraries.places.internal.zzkb$zza
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkb.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzb extends zzrb<zzb, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzb zzg;
        private static volatile zzsw<zzb> zzh;
        private int zzc;
        private String zzd = "";
        private int zze;
        private zzrm<C13857zzb> zzf = zzrb.zzk();

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzb, zza> implements zzso {
            private zza() {
                super(zzb.zzg);
            }

            /* synthetic */ zza(zzka zzka) {
                this();
            }
        }

        /* renamed from: com.google.android.libraries.places.internal.zzkb$zzb$zzb reason: collision with other inner class name */
        public static final class C13857zzb extends zzrb<C13857zzb, zza> implements zzso {
            /* access modifiers changed from: private */
            public static final C13857zzb zzm;
            private static volatile zzsw<C13857zzb> zzn;
            private int zzc;
            private float zzd;
            private float zze;
            private float zzf;
            private int zzg;
            private long zzh;
            private long zzi;
            private long zzj;
            private long zzk;
            private long zzl;

            /* renamed from: com.google.android.libraries.places.internal.zzkb$zzb$zzb$zza */
            public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<C13857zzb, zza> implements zzso {
                private zza() {
                    super(C13857zzb.zzm);
                }

                /* synthetic */ zza(zzka zzka) {
                    this();
                }
            }

            static {
                C13857zzb zzb = new C13857zzb();
                zzm = zzb;
                zzrb.zza(C13857zzb.class, zzb);
            }

            private C13857zzb() {
            }

            /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzb$zzb>] */
            /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
            /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzb$zzb>] */
            /* JADX WARNING: type inference failed for: r2v13 */
            /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzb$zzb>] */
            /* JADX WARNING: type inference failed for: r2v17 */
            /* JADX WARNING: type inference failed for: r2v18 */
            /* access modifiers changed from: protected */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
              assigns: []
              uses: []
              mth insns count: 56
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
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
                /*
                    r1 = this;
                    int[] r3 = com.google.android.libraries.places.internal.zzka.zza
                    r4 = 1
                    int r2 = r2 - r4
                    r2 = r3[r2]
                    r3 = 0
                    switch(r2) {
                        case 1: goto L_0x0079;
                        case 2: goto L_0x0073;
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
                    com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzb$zzb> r2 = zzn
                    if (r2 != 0) goto L_0x002f
                    java.lang.Class<com.google.android.libraries.places.internal.zzkb$zzb$zzb> r3 = com.google.android.libraries.places.internal.zzkb.zzb.C13857zzb.class
                    monitor-enter(r3)
                    com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzb$zzb> r2 = zzn     // Catch:{ all -> 0x002c }
                    if (r2 != 0) goto L_0x002a
                    com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                    com.google.android.libraries.places.internal.zzkb$zzb$zzb r4 = zzm     // Catch:{ all -> 0x002c }
                    r2.<init>(r4)     // Catch:{ all -> 0x002c }
                    zzn = r2     // Catch:{ all -> 0x002c }
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
                    com.google.android.libraries.places.internal.zzkb$zzb$zzb r2 = zzm
                    return r2
                L_0x0033:
                    r2 = 10
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r3 = 0
                    java.lang.String r0 = "zzc"
                    r2[r3] = r0
                    java.lang.String r3 = "zzd"
                    r2[r4] = r3
                    r3 = 2
                    java.lang.String r4 = "zze"
                    r2[r3] = r4
                    r3 = 3
                    java.lang.String r4 = "zzf"
                    r2[r3] = r4
                    r3 = 4
                    java.lang.String r4 = "zzg"
                    r2[r3] = r4
                    r3 = 5
                    java.lang.String r4 = "zzh"
                    r2[r3] = r4
                    r3 = 6
                    java.lang.String r4 = "zzi"
                    r2[r3] = r4
                    r3 = 7
                    java.lang.String r4 = "zzj"
                    r2[r3] = r4
                    r3 = 8
                    java.lang.String r4 = "zzk"
                    r2[r3] = r4
                    r3 = 9
                    java.lang.String r4 = "zzl"
                    r2[r3] = r4
                    com.google.android.libraries.places.internal.zzkb$zzb$zzb r3 = zzm
                    java.lang.String r4 = "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0003\u0001\u0002\u0004\u0004\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\u0002\u0007\t\u0002\b"
                    java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                    return r2
                L_0x0073:
                    com.google.android.libraries.places.internal.zzkb$zzb$zzb$zza r2 = new com.google.android.libraries.places.internal.zzkb$zzb$zzb$zza
                    r2.<init>(r3)
                    return r2
                L_0x0079:
                    com.google.android.libraries.places.internal.zzkb$zzb$zzb r2 = new com.google.android.libraries.places.internal.zzkb$zzb$zzb
                    r2.<init>()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkb.zzb.C13857zzb.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        static {
            zzb zzb = new zzb();
            zzg = zzb;
            zzrb.zza(zzb.class, zzb);
        }

        private zzb() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzb>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzb>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzb>] */
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
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzka.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzb> r2 = zzh
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkb$zzb> r3 = com.google.android.libraries.places.internal.zzkb.zzb.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzb> r2 = zzh     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkb$zzb r4 = zzg     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzh = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkb$zzb r2 = zzg
                return r2
            L_0x0033:
                r2 = 5
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                r3 = 2
                java.lang.String r4 = "zze"
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                r3 = 4
                java.lang.Class<com.google.android.libraries.places.internal.zzkb$zzb$zzb> r4 = com.google.android.libraries.places.internal.zzkb.zzb.C13857zzb.class
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkb$zzb r3 = zzg
                java.lang.String r4 = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u001b"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0057:
                com.google.android.libraries.places.internal.zzkb$zzb$zza r2 = new com.google.android.libraries.places.internal.zzkb$zzb$zza
                r2.<init>(r3)
                return r2
            L_0x005d:
                com.google.android.libraries.places.internal.zzkb$zzb r2 = new com.google.android.libraries.places.internal.zzkb$zzb
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkb.zzb.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzc extends zzrb<zzc, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzc zzj;
        private static volatile zzsw<zzc> zzk;
        private int zzc;
        private String zzd = "";
        private int zze;
        private int zzf;
        private float zzg;
        private float zzh;
        private float zzi;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzc, zza> implements zzso {
            private zza() {
                super(zzc.zzj);
            }

            /* synthetic */ zza(zzka zzka) {
                this();
            }
        }

        static {
            zzc zzc2 = new zzc();
            zzj = zzc2;
            zzrb.zza(zzc.class, zzc2);
        }

        private zzc() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzc>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzc>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzc>] */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
          assigns: []
          uses: []
          mth insns count: 52
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
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzka.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x006f;
                    case 2: goto L_0x0069;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzc> r2 = zzk
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkb$zzc> r3 = com.google.android.libraries.places.internal.zzkb.zzc.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzc> r2 = zzk     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkb$zzc r4 = zzj     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzk = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkb$zzc r2 = zzj
                return r2
            L_0x0033:
                r2 = 8
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                r3 = 2
                java.lang.String r4 = "zze"
                r2[r3] = r4
                r3 = 3
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkd.zzb()
                r2[r3] = r4
                r3 = 4
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                r3 = 5
                java.lang.String r4 = "zzg"
                r2[r3] = r4
                r3 = 6
                java.lang.String r4 = "zzh"
                r2[r3] = r4
                r3 = 7
                java.lang.String r4 = "zzi"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkb$zzc r3 = zzj
                java.lang.String r4 = "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\u0001\u0003\u0005\u0001\u0004\u0006\u0001\u0005"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0069:
                com.google.android.libraries.places.internal.zzkb$zzc$zza r2 = new com.google.android.libraries.places.internal.zzkb$zzc$zza
                r2.<init>(r3)
                return r2
            L_0x006f:
                com.google.android.libraries.places.internal.zzkb$zzc r2 = new com.google.android.libraries.places.internal.zzkb$zzc
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkb.zzc.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzd extends zzrb<zzd, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzd zzg;
        private static volatile zzsw<zzd> zzh;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzd, zza> implements zzso {
            private zza() {
                super(zzd.zzg);
            }

            /* synthetic */ zza(zzka zzka) {
                this();
            }
        }

        static {
            zzd zzd2 = new zzd();
            zzg = zzd2;
            zzrb.zza(zzd.class, zzd2);
        }

        private zzd() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzd>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzd>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzd>] */
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
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzka.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzd> r2 = zzh
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkb$zzd> r3 = com.google.android.libraries.places.internal.zzkb.zzd.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzd> r2 = zzh     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkb$zzd r4 = zzg     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzh = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkb$zzd r2 = zzg
                return r2
            L_0x0033:
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                r3 = 2
                java.lang.String r4 = "zze"
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkb$zzd r3 = zzg
                java.lang.String r4 = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0052:
                com.google.android.libraries.places.internal.zzkb$zzd$zza r2 = new com.google.android.libraries.places.internal.zzkb$zzd$zza
                r2.<init>(r3)
                return r2
            L_0x0058:
                com.google.android.libraries.places.internal.zzkb$zzd r2 = new com.google.android.libraries.places.internal.zzkb$zzd
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkb.zzd.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zze extends zzrb<zze, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zze zzj;
        private static volatile zzsw<zze> zzk;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;
        private int zzh;
        private zzrm<zzb> zzi = zzrb.zzk();

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zze, zza> implements zzso {
            private zza() {
                super(zze.zzj);
            }

            /* synthetic */ zza(zzka zzka) {
                this();
            }
        }

        public static final class zzb extends zzrb<zzb, zza> implements zzso {
            /* access modifiers changed from: private */
            public static final zzb zzl;
            private static volatile zzsw<zzb> zzm;
            private int zzc;
            private String zzd = "";
            private int zze;
            private int zzf;
            private int zzg;
            private int zzh;
            private int zzi;
            private zzrm<zzd> zzj = zzrb.zzk();
            private int zzk;

            public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzb, zza> implements zzso {
                private zza() {
                    super(zzb.zzl);
                }

                /* synthetic */ zza(zzka zzka) {
                    this();
                }
            }

            static {
                zzb zzb = new zzb();
                zzl = zzb;
                zzrb.zza(zzb.class, zzb);
            }

            private zzb() {
            }

            /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zze$zzb>] */
            /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
            /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zze$zzb>] */
            /* JADX WARNING: type inference failed for: r2v13 */
            /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zze$zzb>, com.google.android.libraries.places.internal.zzrb$zza] */
            /* JADX WARNING: type inference failed for: r2v17 */
            /* JADX WARNING: type inference failed for: r2v18 */
            /* access modifiers changed from: protected */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
              assigns: []
              uses: []
              mth insns count: 56
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
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
                /*
                    r1 = this;
                    int[] r3 = com.google.android.libraries.places.internal.zzka.zza
                    r4 = 1
                    int r2 = r2 - r4
                    r2 = r3[r2]
                    r3 = 0
                    switch(r2) {
                        case 1: goto L_0x0079;
                        case 2: goto L_0x0073;
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
                    com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zze$zzb> r2 = zzm
                    if (r2 != 0) goto L_0x002f
                    java.lang.Class<com.google.android.libraries.places.internal.zzkb$zze$zzb> r3 = com.google.android.libraries.places.internal.zzkb.zze.zzb.class
                    monitor-enter(r3)
                    com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zze$zzb> r2 = zzm     // Catch:{ all -> 0x002c }
                    if (r2 != 0) goto L_0x002a
                    com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                    com.google.android.libraries.places.internal.zzkb$zze$zzb r4 = zzl     // Catch:{ all -> 0x002c }
                    r2.<init>(r4)     // Catch:{ all -> 0x002c }
                    zzm = r2     // Catch:{ all -> 0x002c }
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
                    com.google.android.libraries.places.internal.zzkb$zze$zzb r2 = zzl
                    return r2
                L_0x0033:
                    r2 = 10
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r3 = 0
                    java.lang.String r0 = "zzc"
                    r2[r3] = r0
                    java.lang.String r3 = "zzd"
                    r2[r4] = r3
                    r3 = 2
                    java.lang.String r4 = "zze"
                    r2[r3] = r4
                    r3 = 3
                    java.lang.String r4 = "zzf"
                    r2[r3] = r4
                    r3 = 4
                    java.lang.String r4 = "zzg"
                    r2[r3] = r4
                    r3 = 5
                    java.lang.String r4 = "zzh"
                    r2[r3] = r4
                    r3 = 6
                    java.lang.String r4 = "zzi"
                    r2[r3] = r4
                    r3 = 7
                    java.lang.String r4 = "zzj"
                    r2[r3] = r4
                    r3 = 8
                    java.lang.Class<com.google.android.libraries.places.internal.zzkb$zzd> r4 = com.google.android.libraries.places.internal.zzkb.zzd.class
                    r2[r3] = r4
                    r3 = 9
                    java.lang.String r4 = "zzk"
                    r2[r3] = r4
                    com.google.android.libraries.places.internal.zzkb$zze$zzb r3 = zzl
                    java.lang.String r4 = "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u001b\b\u0004\u0006"
                    java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                    return r2
                L_0x0073:
                    com.google.android.libraries.places.internal.zzkb$zze$zzb$zza r2 = new com.google.android.libraries.places.internal.zzkb$zze$zzb$zza
                    r2.<init>(r3)
                    return r2
                L_0x0079:
                    com.google.android.libraries.places.internal.zzkb$zze$zzb r2 = new com.google.android.libraries.places.internal.zzkb$zze$zzb
                    r2.<init>()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkb.zze.zzb.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        static {
            zze zze2 = new zze();
            zzj = zze2;
            zzrb.zza(zze.class, zze2);
        }

        private zze() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zze>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zze>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zze>] */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
          assigns: []
          uses: []
          mth insns count: 52
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
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzka.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x006d;
                    case 2: goto L_0x0067;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zze> r2 = zzk
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkb$zze> r3 = com.google.android.libraries.places.internal.zzkb.zze.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zze> r2 = zzk     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkb$zze r4 = zzj     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzk = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkb$zze r2 = zzj
                return r2
            L_0x0033:
                r2 = 8
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                r3 = 2
                java.lang.String r4 = "zze"
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                r3 = 4
                java.lang.String r4 = "zzg"
                r2[r3] = r4
                r3 = 5
                java.lang.String r4 = "zzh"
                r2[r3] = r4
                r3 = 6
                java.lang.String r4 = "zzi"
                r2[r3] = r4
                r3 = 7
                java.lang.Class<com.google.android.libraries.places.internal.zzkb$zze$zzb> r4 = com.google.android.libraries.places.internal.zzkb.zze.zzb.class
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkb$zze r3 = zzj
                java.lang.String r4 = "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u001b"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0067:
                com.google.android.libraries.places.internal.zzkb$zze$zza r2 = new com.google.android.libraries.places.internal.zzkb$zze$zza
                r2.<init>(r3)
                return r2
            L_0x006d:
                com.google.android.libraries.places.internal.zzkb$zze r2 = new com.google.android.libraries.places.internal.zzkb$zze
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkb.zze.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzf extends zzrb<zzf, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzf zzi;
        private static volatile zzsw<zzf> zzj;
        private int zzc;
        private boolean zzd;
        private boolean zze;
        private boolean zzf;
        private boolean zzg;
        private boolean zzh;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzf, zza> implements zzso {
            private zza() {
                super(zzf.zzi);
            }

            /* synthetic */ zza(zzka zzka) {
                this();
            }
        }

        static {
            zzf zzf2 = new zzf();
            zzi = zzf2;
            zzrb.zza(zzf.class, zzf2);
        }

        private zzf() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzf>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzf>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzf>] */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
          assigns: []
          uses: []
          mth insns count: 48
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
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzka.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x0062;
                    case 2: goto L_0x005c;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzf> r2 = zzj
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkb$zzf> r3 = com.google.android.libraries.places.internal.zzkb.zzf.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzf> r2 = zzj     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkb$zzf r4 = zzi     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzj = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkb$zzf r2 = zzi
                return r2
            L_0x0033:
                r2 = 6
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                r3 = 2
                java.lang.String r4 = "zze"
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                r3 = 4
                java.lang.String r4 = "zzg"
                r2[r3] = r4
                r3 = 5
                java.lang.String r4 = "zzh"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkb$zzf r3 = zzi
                java.lang.String r4 = "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0007\u0004"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x005c:
                com.google.android.libraries.places.internal.zzkb$zzf$zza r2 = new com.google.android.libraries.places.internal.zzkb$zzf$zza
                r2.<init>(r3)
                return r2
            L_0x0062:
                com.google.android.libraries.places.internal.zzkb$zzf r2 = new com.google.android.libraries.places.internal.zzkb$zzf
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkb.zzf.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzg extends zzrb<zzg, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzg zzf;
        private static volatile zzsw<zzg> zzg;
        private int zzc;
        private zzrm<zzb> zzd = zzrb.zzk();
        private long zze;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzg, zza> implements zzso {
            private zza() {
                super(zzg.zzf);
            }

            /* synthetic */ zza(zzka zzka) {
                this();
            }
        }

        public static final class zzb extends zzrb<zzb, zza> implements zzso {
            /* access modifiers changed from: private */
            public static final zzb zzf;
            private static volatile zzsw<zzb> zzg;
            private int zzc;
            private int zzd;
            private long zze;

            public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzb, zza> implements zzso {
                private zza() {
                    super(zzb.zzf);
                }

                /* synthetic */ zza(zzka zzka) {
                    this();
                }
            }

            static {
                zzb zzb = new zzb();
                zzf = zzb;
                zzrb.zza(zzb.class, zzb);
            }

            private zzb() {
            }

            /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzg$zzb>] */
            /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
            /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzg$zzb>] */
            /* JADX WARNING: type inference failed for: r2v13 */
            /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzg$zzb>] */
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
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
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
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
                /*
                    r1 = this;
                    int[] r3 = com.google.android.libraries.places.internal.zzka.zza
                    r4 = 1
                    int r2 = r2 - r4
                    r2 = r3[r2]
                    r3 = 0
                    switch(r2) {
                        case 1: goto L_0x005a;
                        case 2: goto L_0x0054;
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
                    com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzg$zzb> r2 = zzg
                    if (r2 != 0) goto L_0x002f
                    java.lang.Class<com.google.android.libraries.places.internal.zzkb$zzg$zzb> r3 = com.google.android.libraries.places.internal.zzkb.zzg.zzb.class
                    monitor-enter(r3)
                    com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzg$zzb> r2 = zzg     // Catch:{ all -> 0x002c }
                    if (r2 != 0) goto L_0x002a
                    com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                    com.google.android.libraries.places.internal.zzkb$zzg$zzb r4 = zzf     // Catch:{ all -> 0x002c }
                    r2.<init>(r4)     // Catch:{ all -> 0x002c }
                    zzg = r2     // Catch:{ all -> 0x002c }
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
                    com.google.android.libraries.places.internal.zzkb$zzg$zzb r2 = zzf
                    return r2
                L_0x0033:
                    r2 = 4
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r3 = 0
                    java.lang.String r0 = "zzc"
                    r2[r3] = r0
                    java.lang.String r3 = "zzd"
                    r2[r4] = r3
                    r3 = 2
                    com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkd.zzb()
                    r2[r3] = r4
                    r3 = 3
                    java.lang.String r4 = "zze"
                    r2[r3] = r4
                    com.google.android.libraries.places.internal.zzkb$zzg$zzb r3 = zzf
                    java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001"
                    java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                    return r2
                L_0x0054:
                    com.google.android.libraries.places.internal.zzkb$zzg$zzb$zza r2 = new com.google.android.libraries.places.internal.zzkb$zzg$zzb$zza
                    r2.<init>(r3)
                    return r2
                L_0x005a:
                    com.google.android.libraries.places.internal.zzkb$zzg$zzb r2 = new com.google.android.libraries.places.internal.zzkb$zzg$zzb
                    r2.<init>()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkb.zzg.zzb.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        static {
            zzg zzg2 = new zzg();
            zzf = zzg2;
            zzrb.zza(zzg.class, zzg2);
        }

        private zzg() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzg>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzg>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzg>] */
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
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzka.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzg> r2 = zzg
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkb$zzg> r3 = com.google.android.libraries.places.internal.zzkb.zzg.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzg> r2 = zzg     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkb$zzg r4 = zzf     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzg = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkb$zzg r2 = zzf
                return r2
            L_0x0033:
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                r3 = 2
                java.lang.Class<com.google.android.libraries.places.internal.zzkb$zzg$zzb> r4 = com.google.android.libraries.places.internal.zzkb.zzg.zzb.class
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zze"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkb$zzg r3 = zzf
                java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002\u0000"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0052:
                com.google.android.libraries.places.internal.zzkb$zzg$zza r2 = new com.google.android.libraries.places.internal.zzkb$zzg$zza
                r2.<init>(r3)
                return r2
            L_0x0058:
                com.google.android.libraries.places.internal.zzkb$zzg r2 = new com.google.android.libraries.places.internal.zzkb$zzg
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkb.zzg.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzh extends zzrb<zzh, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzh zzf;
        private static volatile zzsw<zzh> zzg;
        private int zzc;
        private zzg zzd;
        private zze zze;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzh, zza> implements zzso {
            private zza() {
                super(zzh.zzf);
            }

            /* synthetic */ zza(zzka zzka) {
                this();
            }
        }

        static {
            zzh zzh = new zzh();
            zzf = zzh;
            zzrb.zza(zzh.class, zzh);
        }

        private zzh() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzh>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzh>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzh>] */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
          assigns: []
          uses: []
          mth insns count: 42
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
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzka.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x0053;
                    case 2: goto L_0x004d;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzh> r2 = zzg
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkb$zzh> r3 = com.google.android.libraries.places.internal.zzkb.zzh.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzh> r2 = zzg     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkb$zzh r4 = zzf     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzg = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkb$zzh r2 = zzf
                return r2
            L_0x0033:
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                r3 = 2
                java.lang.String r4 = "zze"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkb$zzh r3 = zzf
                java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x004d:
                com.google.android.libraries.places.internal.zzkb$zzh$zza r2 = new com.google.android.libraries.places.internal.zzkb$zzh$zza
                r2.<init>(r3)
                return r2
            L_0x0053:
                com.google.android.libraries.places.internal.zzkb$zzh r2 = new com.google.android.libraries.places.internal.zzkb$zzh
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkb.zzh.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzi extends zzrb<zzi, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzi zzo;
        private static volatile zzsw<zzi> zzp;
        private int zzc;
        private long zzd;
        private zzf zze;
        private zzf zzf;
        private zzk zzg;
        private zzh zzh;
        private zzb zzi;
        private zzl zzj;
        private zzm zzk;
        private zzj zzl;
        private zza zzm;
        private zzc zzn;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzi, zza> implements zzso {
            private zza() {
                super(zzi.zzo);
            }

            /* synthetic */ zza(zzka zzka) {
                this();
            }
        }

        static {
            zzi zzi2 = new zzi();
            zzo = zzi2;
            zzrb.zza(zzi.class, zzi2);
        }

        private zzi() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzi>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzi>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzi>] */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
          assigns: []
          uses: []
          mth insns count: 60
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
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzka.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x0085;
                    case 2: goto L_0x007f;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzi> r2 = zzp
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkb$zzi> r3 = com.google.android.libraries.places.internal.zzkb.zzi.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzi> r2 = zzp     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkb$zzi r4 = zzo     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzp = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkb$zzi r2 = zzo
                return r2
            L_0x0033:
                r2 = 12
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                r3 = 2
                java.lang.String r4 = "zze"
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                r3 = 4
                java.lang.String r4 = "zzg"
                r2[r3] = r4
                r3 = 5
                java.lang.String r4 = "zzh"
                r2[r3] = r4
                r3 = 6
                java.lang.String r4 = "zzi"
                r2[r3] = r4
                r3 = 7
                java.lang.String r4 = "zzj"
                r2[r3] = r4
                r3 = 8
                java.lang.String r4 = "zzk"
                r2[r3] = r4
                r3 = 9
                java.lang.String r4 = "zzl"
                r2[r3] = r4
                r3 = 10
                java.lang.String r4 = "zzm"
                r2[r3] = r4
                r3 = 11
                java.lang.String r4 = "zzn"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkb$zzi r3 = zzo
                java.lang.String r4 = "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0002\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\t\u0006\b\t\u0007\t\t\b\n\t\t\u000b\t\n"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x007f:
                com.google.android.libraries.places.internal.zzkb$zzi$zza r2 = new com.google.android.libraries.places.internal.zzkb$zzi$zza
                r2.<init>(r3)
                return r2
            L_0x0085:
                com.google.android.libraries.places.internal.zzkb$zzi r2 = new com.google.android.libraries.places.internal.zzkb$zzi
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkb.zzi.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzj extends zzrb<zzj, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzj zzg;
        private static volatile zzsw<zzj> zzh;
        private int zzc;
        private int zzd;
        private float zze;
        private float zzf;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzj, zza> implements zzso {
            private zza() {
                super(zzj.zzg);
            }

            /* synthetic */ zza(zzka zzka) {
                this();
            }
        }

        static {
            zzj zzj = new zzj();
            zzg = zzj;
            zzrb.zza(zzj.class, zzj);
        }

        private zzj() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzj>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzj>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzj>, com.google.android.libraries.places.internal.zzrb$zza] */
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
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzka.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x005f;
                    case 2: goto L_0x0059;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzj> r2 = zzh
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkb$zzj> r3 = com.google.android.libraries.places.internal.zzkb.zzj.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzj> r2 = zzh     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkb$zzj r4 = zzg     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzh = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkb$zzj r2 = zzg
                return r2
            L_0x0033:
                r2 = 5
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                r3 = 2
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkd.zzb()
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zze"
                r2[r3] = r4
                r3 = 4
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkb$zzj r3 = zzg
                java.lang.String r4 = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0001\u0001\u0003\u0001\u0002"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0059:
                com.google.android.libraries.places.internal.zzkb$zzj$zza r2 = new com.google.android.libraries.places.internal.zzkb$zzj$zza
                r2.<init>(r3)
                return r2
            L_0x005f:
                com.google.android.libraries.places.internal.zzkb$zzj r2 = new com.google.android.libraries.places.internal.zzkb$zzj
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkb.zzj.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzk extends zzrb<zzk, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzk zzf;
        private static volatile zzsw<zzk> zzg;
        private int zzc;
        private boolean zzd;
        private boolean zze;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzk, zza> implements zzso {
            private zza() {
                super(zzk.zzf);
            }

            /* synthetic */ zza(zzka zzka) {
                this();
            }
        }

        static {
            zzk zzk = new zzk();
            zzf = zzk;
            zzrb.zza(zzk.class, zzk);
        }

        private zzk() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzk>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzk>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzk>, com.google.android.libraries.places.internal.zzrb$zza] */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
          assigns: []
          uses: []
          mth insns count: 42
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
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzka.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x0053;
                    case 2: goto L_0x004d;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzk> r2 = zzg
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkb$zzk> r3 = com.google.android.libraries.places.internal.zzkb.zzk.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzk> r2 = zzg     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkb$zzk r4 = zzf     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzg = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkb$zzk r2 = zzf
                return r2
            L_0x0033:
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                r3 = 2
                java.lang.String r4 = "zze"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkb$zzk r3 = zzf
                java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x004d:
                com.google.android.libraries.places.internal.zzkb$zzk$zza r2 = new com.google.android.libraries.places.internal.zzkb$zzk$zza
                r2.<init>(r3)
                return r2
            L_0x0053:
                com.google.android.libraries.places.internal.zzkb$zzk r2 = new com.google.android.libraries.places.internal.zzkb$zzk
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkb.zzk.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzl extends zzrb<zzl, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzl zzg;
        private static volatile zzsw<zzl> zzh;
        private int zzc;
        private int zzd;
        private int zze;
        private String zzf = "";

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzl, zza> implements zzso {
            private zza() {
                super(zzl.zzg);
            }

            /* synthetic */ zza(zzka zzka) {
                this();
            }
        }

        public enum zzb implements zzrg {
            INVALID_TYPE(0),
            REMOVE_ALL(1),
            REMOVE_BY_PENDING_INTENT(2),
            REMOVE_BY_REQUEST_IDS(3);
            
            private static final zzrf<zzb> zze = null;
            private final int zzf;

            static {
                zze = new zzki();
            }

            private zzb(int i) {
                this.zzf = i;
            }

            public static zzri zzb() {
                return zzkj.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zzb.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.zzf);
                sb.append(" name=");
                sb.append(name());
                sb.append('>');
                return sb.toString();
            }

            public final int zza() {
                return this.zzf;
            }
        }

        static {
            zzl zzl = new zzl();
            zzg = zzl;
            zzrb.zza(zzl.class, zzl);
        }

        private zzl() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzl>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzl>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzl>] */
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
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzka.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x005f;
                    case 2: goto L_0x0059;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzl> r2 = zzh
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkb$zzl> r3 = com.google.android.libraries.places.internal.zzkb.zzl.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzl> r2 = zzh     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkb$zzl r4 = zzg     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzh = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkb$zzl r2 = zzg
                return r2
            L_0x0033:
                r2 = 5
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                r3 = 2
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkb.zzl.zzb.zzb()
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zze"
                r2[r3] = r4
                r3 = 4
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkb$zzl r3 = zzg
                java.lang.String r4 = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\b\u0002"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0059:
                com.google.android.libraries.places.internal.zzkb$zzl$zza r2 = new com.google.android.libraries.places.internal.zzkb$zzl$zza
                r2.<init>(r3)
                return r2
            L_0x005f:
                com.google.android.libraries.places.internal.zzkb$zzl r2 = new com.google.android.libraries.places.internal.zzkb$zzl
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkb.zzl.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzm extends zzrb<zzm, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzm zzg;
        private static volatile zzsw<zzm> zzh;
        private int zzc;
        private int zzd;
        private long zze;
        private long zzf;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzm, zza> implements zzso {
            private zza() {
                super(zzm.zzg);
            }

            /* synthetic */ zza(zzka zzka) {
                this();
            }
        }

        static {
            zzm zzm = new zzm();
            zzg = zzm;
            zzrb.zza(zzm.class, zzm);
        }

        private zzm() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzm>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzm>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzm>] */
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
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzka.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x005f;
                    case 2: goto L_0x0059;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzm> r2 = zzh
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkb$zzm> r3 = com.google.android.libraries.places.internal.zzkb.zzm.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkb$zzm> r2 = zzh     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkb$zzm r4 = zzg     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzh = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkb$zzm r2 = zzg
                return r2
            L_0x0033:
                r2 = 5
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                r3 = 2
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkd.zzb()
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zze"
                r2[r3] = r4
                r3 = 4
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkb$zzm r3 = zzg
                java.lang.String r4 = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\u0002\u0002"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0059:
                com.google.android.libraries.places.internal.zzkb$zzm$zza r2 = new com.google.android.libraries.places.internal.zzkb$zzm$zza
                r2.<init>(r3)
                return r2
            L_0x005f:
                com.google.android.libraries.places.internal.zzkb$zzm r2 = new com.google.android.libraries.places.internal.zzkb$zzm
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkb.zzm.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
