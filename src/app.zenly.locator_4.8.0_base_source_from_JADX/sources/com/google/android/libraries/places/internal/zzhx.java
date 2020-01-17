package com.google.android.libraries.places.internal;

public final class zzhx {

    public static final class zza extends zzrb<zza, C13840zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zza zzl;
        private static volatile zzsw<zza> zzm;
        private int zzc;
        private String zzd;
        private int zze;
        private int zzf;
        private String zzg;
        private int zzh;
        private int zzi;
        private int zzj;
        private int zzk;

        /* renamed from: com.google.android.libraries.places.internal.zzhx$zza$zza reason: collision with other inner class name */
        public static final class C13840zza extends com.google.android.libraries.places.internal.zzrb.zzb<zza, C13840zza> implements zzso {
            private C13840zza() {
                super(zza.zzl);
            }

            public final C13840zza zza(String str) {
                zzb();
                ((zza) this.zza).zza(str);
                return this;
            }

            /* synthetic */ C13840zza(zzhw zzhw) {
                this();
            }

            public final C13840zza zza(int i) {
                zzb();
                ((zza) this.zza).zzb(i);
                return this;
            }
        }

        public enum zzb implements zzrg {
            STATUS_UNKNOWN(0),
            STATUS_TRUE(1),
            STATUS_FALSE(2);
            
            private static final zzrf<zzb> zzd = null;
            private final int zze;

            static {
                zzd = new zzhy();
            }

            private zzb(int i) {
                this.zze = i;
            }

            public static zzri zzb() {
                return zzhz.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zzb.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.zze);
                sb.append(" name=");
                sb.append(name());
                sb.append('>');
                return sb.toString();
            }

            public final int zza() {
                return this.zze;
            }
        }

        public enum zzc implements zzrg {
            GRANULARITY_UNKNOWN(0),
            NONE(1),
            COARSE(2),
            FINE(3);
            
            private static final zzrf<zzc> zze = null;
            private final int zzf;

            static {
                zze = new zzib();
            }

            private zzc(int i) {
                this.zzf = i;
            }

            public static zzri zzb() {
                return zzia.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zzc.class.getName());
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

        public enum zzd implements zzrg {
            PERMISSION_UNKNOWN(0),
            ALWAYS(1),
            WHILE_IN_USE(2),
            DENY(3);
            
            private static final zzrf<zzd> zze = null;
            private final int zzf;

            static {
                zze = new zzic();
            }

            private zzd(int i) {
                this.zzf = i;
            }

            public static zzri zzb() {
                return zzie.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zzd.class.getName());
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
            zza zza = new zza();
            zzl = zza;
            zzrb.zza(zza.class, zza);
        }

        private zza() {
            String str = "";
            this.zzd = str;
            this.zzg = str;
        }

        /* access modifiers changed from: private */
        public final void zza(String str) {
            if (str != null) {
                this.zzc |= 1;
                this.zzd = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zzb(int i) {
            this.zzc |= 2;
            this.zze = i;
        }

        public static C13840zza zza() {
            return (C13840zza) zzl.zzf();
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzhx$zza>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzhx$zza>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzhx$zza>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzhw.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x008b;
                    case 2: goto L_0x0085;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzhx$zza> r2 = zzm
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzhx$zza> r3 = com.google.android.libraries.places.internal.zzhx.zza.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzhx$zza> r2 = zzm     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzhx$zza r4 = zzl     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzhx$zza r2 = zzl
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzhx.zza.zzb.zzb()
                r2[r3] = r4
                r3 = 8
                java.lang.String r4 = "zzj"
                r2[r3] = r4
                r3 = 9
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzhx.zza.zzd.zzb()
                r2[r3] = r4
                r3 = 10
                java.lang.String r4 = "zzk"
                r2[r3] = r4
                r3 = 11
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzhx.zza.zzc.zzb()
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzhx$zza r3 = zzl
                java.lang.String r4 = "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\b\u0003\u0005\u0004\u0004\u0006\f\u0005\u0007\f\u0006\b\f\u0007"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0085:
                com.google.android.libraries.places.internal.zzhx$zza$zza r2 = new com.google.android.libraries.places.internal.zzhx$zza$zza
                r2.<init>(r3)
                return r2
            L_0x008b:
                com.google.android.libraries.places.internal.zzhx$zza r2 = new com.google.android.libraries.places.internal.zzhx$zza
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzhx.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
