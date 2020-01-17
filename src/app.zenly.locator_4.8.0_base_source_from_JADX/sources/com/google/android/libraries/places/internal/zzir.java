package com.google.android.libraries.places.internal;

public final class zzir {

    public static final class zza extends zzrb<zza, C13845zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zza zzf;
        private static volatile zzsw<zza> zzg;
        private int zzc;
        private int zzd;
        private zzc zze;

        /* renamed from: com.google.android.libraries.places.internal.zzir$zza$zza reason: collision with other inner class name */
        public static final class C13845zza extends com.google.android.libraries.places.internal.zzrb.zzb<zza, C13845zza> implements zzso {
            private C13845zza() {
                super(zza.zzf);
            }

            /* synthetic */ C13845zza(zziq zziq) {
                this();
            }
        }

        public enum zzb implements zzrg {
            UNSPECIFIED(0),
            LOWD(1);
            
            private static final zzrf<zzb> zzc = null;
            private final int zzd;

            static {
                zzc = new zzis();
            }

            private zzb(int i) {
                this.zzd = i;
            }

            public static zzri zzb() {
                return zzit.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zzb.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.zzd);
                sb.append(" name=");
                sb.append(name());
                sb.append('>');
                return sb.toString();
            }

            public final int zza() {
                return this.zzd;
            }
        }

        public static final class zzc extends zzrb<zzc, zzb> implements zzso {
            /* access modifiers changed from: private */
            public static final zzc zzg;
            private static volatile zzsw<zzc> zzh;
            private int zzc;
            private int zzd;
            private long zze;
            private long zzf;

            /* renamed from: com.google.android.libraries.places.internal.zzir$zza$zzc$zza reason: collision with other inner class name */
            public enum C13846zza implements zzrg {
                UNSPECIFIED(0),
                BACKOFF(1),
                ACCEPT(2),
                REJECT(3);
                
                private static final zzrf<C13846zza> zze = null;
                private final int zzf;

                static {
                    zze = new zziv();
                }

                private C13846zza(int i) {
                    this.zzf = i;
                }

                public static zzri zzb() {
                    return zziu.zza;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("<");
                    sb.append(C13846zza.class.getName());
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

            public static final class zzb extends com.google.android.libraries.places.internal.zzrb.zzb<zzc, zzb> implements zzso {
                private zzb() {
                    super(zzc.zzg);
                }

                /* synthetic */ zzb(zziq zziq) {
                    this();
                }
            }

            static {
                zzc zzc2 = new zzc();
                zzg = zzc2;
                zzrb.zza(zzc.class, zzc2);
            }

            private zzc() {
            }

            /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzir$zza$zzc>] */
            /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
            /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzir$zza$zzc>] */
            /* JADX WARNING: type inference failed for: r2v13 */
            /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzir$zza$zzc>] */
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
                    int[] r3 = com.google.android.libraries.places.internal.zziq.zza
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
                    com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzir$zza$zzc> r2 = zzh
                    if (r2 != 0) goto L_0x002f
                    java.lang.Class<com.google.android.libraries.places.internal.zzir$zza$zzc> r3 = com.google.android.libraries.places.internal.zzir.zza.zzc.class
                    monitor-enter(r3)
                    com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzir$zza$zzc> r2 = zzh     // Catch:{ all -> 0x002c }
                    if (r2 != 0) goto L_0x002a
                    com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                    com.google.android.libraries.places.internal.zzir$zza$zzc r4 = zzg     // Catch:{ all -> 0x002c }
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
                    com.google.android.libraries.places.internal.zzir$zza$zzc r2 = zzg
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
                    com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzir.zza.zzc.C13846zza.zzb()
                    r2[r3] = r4
                    r3 = 3
                    java.lang.String r4 = "zze"
                    r2[r3] = r4
                    r3 = 4
                    java.lang.String r4 = "zzf"
                    r2[r3] = r4
                    com.google.android.libraries.places.internal.zzir$zza$zzc r3 = zzg
                    java.lang.String r4 = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0003\u0001\u0003\u0003\u0002"
                    java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                    return r2
                L_0x0059:
                    com.google.android.libraries.places.internal.zzir$zza$zzc$zzb r2 = new com.google.android.libraries.places.internal.zzir$zza$zzc$zzb
                    r2.<init>(r3)
                    return r2
                L_0x005f:
                    com.google.android.libraries.places.internal.zzir$zza$zzc r2 = new com.google.android.libraries.places.internal.zzir$zza$zzc
                    r2.<init>()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzir.zza.zzc.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        static {
            zza zza = new zza();
            zzf = zza;
            zzrb.zza(zza.class, zza);
        }

        private zza() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzir$zza>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzir$zza>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzir$zza>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zziq.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzir$zza> r2 = zzg
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzir$zza> r3 = com.google.android.libraries.places.internal.zzir.zza.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzir$zza> r2 = zzg     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzir$zza r4 = zzf     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzir$zza r2 = zzf
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzir.zza.zzb.zzb()
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zze"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzir$zza r3 = zzf
                java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0054:
                com.google.android.libraries.places.internal.zzir$zza$zza r2 = new com.google.android.libraries.places.internal.zzir$zza$zza
                r2.<init>(r3)
                return r2
            L_0x005a:
                com.google.android.libraries.places.internal.zzir$zza r2 = new com.google.android.libraries.places.internal.zzir$zza
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzir.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
