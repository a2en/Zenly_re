package com.google.android.libraries.places.internal;

public final class zzjr {

    public static final class zza extends zzrb<zza, C13853zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zza zzc;
        private static volatile zzsw<zza> zzd;

        /* renamed from: com.google.android.libraries.places.internal.zzjr$zza$zza reason: collision with other inner class name */
        public static final class C13853zza extends com.google.android.libraries.places.internal.zzrb.zzb<zza, C13853zza> implements zzso {
            private C13853zza() {
                super(zza.zzc);
            }

            /* synthetic */ C13853zza(zzjq zzjq) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zzc = zza;
            zzrb.zza(zza.class, zza);
        }

        private zza() {
        }

        /* JADX WARNING: type inference failed for: r1v8, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjr$zza>] */
        /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r1v11, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjr$zza>] */
        /* JADX WARNING: type inference failed for: r1v12 */
        /* JADX WARNING: type inference failed for: r1v13, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjr$zza>, com.google.android.libraries.places.internal.zzrb$zza] */
        /* JADX WARNING: type inference failed for: r1v16 */
        /* JADX WARNING: type inference failed for: r1v17 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v12
          assigns: []
          uses: []
          mth insns count: 35
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r1, java.lang.Object r2, java.lang.Object r3) {
            /*
                r0 = this;
                int[] r2 = com.google.android.libraries.places.internal.zzjq.zza
                r3 = 1
                int r1 = r1 - r3
                r1 = r2[r1]
                r2 = 0
                switch(r1) {
                    case 1: goto L_0x0042;
                    case 2: goto L_0x003c;
                    case 3: goto L_0x0033;
                    case 4: goto L_0x0030;
                    case 5: goto L_0x0016;
                    case 6: goto L_0x0011;
                    case 7: goto L_0x0010;
                    default: goto L_0x000a;
                }
            L_0x000a:
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
            L_0x0010:
                return r2
            L_0x0011:
                java.lang.Byte r1 = java.lang.Byte.valueOf(r3)
                return r1
            L_0x0016:
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjr$zza> r1 = zzd
                if (r1 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzjr$zza> r2 = com.google.android.libraries.places.internal.zzjr.zza.class
                monitor-enter(r2)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjr$zza> r1 = zzd     // Catch:{ all -> 0x002c }
                if (r1 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r1 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzjr$zza r3 = zzc     // Catch:{ all -> 0x002c }
                r1.<init>(r3)     // Catch:{ all -> 0x002c }
                zzd = r1     // Catch:{ all -> 0x002c }
            L_0x002a:
                monitor-exit(r2)     // Catch:{ all -> 0x002c }
                goto L_0x002f
            L_0x002c:
                r1 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002c }
                throw r1
            L_0x002f:
                return r1
            L_0x0030:
                com.google.android.libraries.places.internal.zzjr$zza r1 = zzc
                return r1
            L_0x0033:
                com.google.android.libraries.places.internal.zzjr$zza r1 = zzc
                java.lang.String r3 = "\u0001\u0000"
                java.lang.Object r1 = com.google.android.libraries.places.internal.zzrb.zza(r1, r3, r2)
                return r1
            L_0x003c:
                com.google.android.libraries.places.internal.zzjr$zza$zza r1 = new com.google.android.libraries.places.internal.zzjr$zza$zza
                r1.<init>(r2)
                return r1
            L_0x0042:
                com.google.android.libraries.places.internal.zzjr$zza r1 = new com.google.android.libraries.places.internal.zzjr$zza
                r1.<init>()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzjr.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzb extends zzrb<zzb, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzb zzf;
        private static volatile zzsw<zzb> zzg;
        private int zzc;
        private int zzd = 0;
        private Object zze;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzb, zza> implements zzso {
            private zza() {
                super(zzb.zzf);
            }

            /* synthetic */ zza(zzjq zzjq) {
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

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjr$zzb>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjr$zzb>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjr$zzb>, com.google.android.libraries.places.internal.zzrb$zza] */
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzjq.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjr$zzb> r2 = zzg
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzjr$zzb> r3 = com.google.android.libraries.places.internal.zzjr.zzb.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjr$zzb> r2 = zzg     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzjr$zzb r4 = zzf     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzjr$zzb r2 = zzf
                return r2
            L_0x0033:
                r2 = 6
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zze"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                r3 = 2
                java.lang.String r4 = "zzc"
                r2[r3] = r4
                r3 = 3
                java.lang.Class<com.google.android.libraries.places.internal.zzjr$zzd> r4 = com.google.android.libraries.places.internal.zzjr.zzd.class
                r2[r3] = r4
                r3 = 4
                java.lang.Class<com.google.android.libraries.places.internal.zzjr$zza> r4 = com.google.android.libraries.places.internal.zzjr.zza.class
                r2[r3] = r4
                r3 = 5
                java.lang.Class<com.google.android.libraries.places.internal.zzjr$zzc> r4 = com.google.android.libraries.places.internal.zzjr.zzc.class
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzjr$zzb r3 = zzf
                java.lang.String r4 = "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x005c:
                com.google.android.libraries.places.internal.zzjr$zzb$zza r2 = new com.google.android.libraries.places.internal.zzjr$zzb$zza
                r2.<init>(r3)
                return r2
            L_0x0062:
                com.google.android.libraries.places.internal.zzjr$zzb r2 = new com.google.android.libraries.places.internal.zzjr$zzb
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzjr.zzb.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzc extends zzrb<zzc, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzc zzf;
        private static volatile zzsw<zzc> zzg;
        private int zzc;
        private boolean zzd;
        private long zze;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzc, zza> implements zzso {
            private zza() {
                super(zzc.zzf);
            }

            /* synthetic */ zza(zzjq zzjq) {
                this();
            }
        }

        static {
            zzc zzc2 = new zzc();
            zzf = zzc2;
            zzrb.zza(zzc.class, zzc2);
        }

        private zzc() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjr$zzc>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjr$zzc>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjr$zzc>] */
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzjq.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjr$zzc> r2 = zzg
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzjr$zzc> r3 = com.google.android.libraries.places.internal.zzjr.zzc.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjr$zzc> r2 = zzg     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzjr$zzc r4 = zzf     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzjr$zzc r2 = zzf
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
                com.google.android.libraries.places.internal.zzjr$zzc r3 = zzf
                java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0003\u0001"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x004d:
                com.google.android.libraries.places.internal.zzjr$zzc$zza r2 = new com.google.android.libraries.places.internal.zzjr$zzc$zza
                r2.<init>(r3)
                return r2
            L_0x0053:
                com.google.android.libraries.places.internal.zzjr$zzc r2 = new com.google.android.libraries.places.internal.zzjr$zzc
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzjr.zzc.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzd extends zzrb<zzd, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzd zzf;
        private static volatile zzsw<zzd> zzg;
        private int zzc;
        private boolean zzd;
        private boolean zze;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzd, zza> implements zzso {
            private zza() {
                super(zzd.zzf);
            }

            /* synthetic */ zza(zzjq zzjq) {
                this();
            }
        }

        static {
            zzd zzd2 = new zzd();
            zzf = zzd2;
            zzrb.zza(zzd.class, zzd2);
        }

        private zzd() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjr$zzd>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjr$zzd>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjr$zzd>] */
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzjq.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjr$zzd> r2 = zzg
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzjr$zzd> r3 = com.google.android.libraries.places.internal.zzjr.zzd.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjr$zzd> r2 = zzg     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzjr$zzd r4 = zzf     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzjr$zzd r2 = zzf
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
                com.google.android.libraries.places.internal.zzjr$zzd r3 = zzf
                java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x004d:
                com.google.android.libraries.places.internal.zzjr$zzd$zza r2 = new com.google.android.libraries.places.internal.zzjr$zzd$zza
                r2.<init>(r3)
                return r2
            L_0x0053:
                com.google.android.libraries.places.internal.zzjr$zzd r2 = new com.google.android.libraries.places.internal.zzjr$zzd
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzjr.zzd.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
