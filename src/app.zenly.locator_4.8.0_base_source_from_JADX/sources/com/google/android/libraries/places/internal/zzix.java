package com.google.android.libraries.places.internal;

public final class zzix {

    public static final class zza extends zzrb<zza, zzc> implements zzso {
        /* access modifiers changed from: private */
        public static final zza zzl;
        private static volatile zzsw<zza> zzm;
        private int zzc;
        private int zzd;
        private String zze;
        private long zzf;
        private int zzg;
        private String zzh;
        private long zzi;
        private long zzj;
        private int zzk;

        /* renamed from: com.google.android.libraries.places.internal.zzix$zza$zza reason: collision with other inner class name */
        public enum C13847zza implements zzrg {
            UNKNOWN(0),
            DELIVERY(1),
            INTERACTION(2);
            
            private static final zzrf<C13847zza> zzd = null;
            private final int zze;

            static {
                zzd = new zziz();
            }

            private C13847zza(int i) {
                this.zze = i;
            }

            public static zzri zzb() {
                return zziy.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(C13847zza.class.getName());
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

        public enum zzb implements zzrg {
            UNKNOWN_CONNECTIVITY_TYPE(0),
            CELL(1),
            WIFI(2);
            
            private static final zzrf<zzb> zzd = null;
            private final int zze;

            static {
                zzd = new zzjb();
            }

            private zzb(int i) {
                this.zze = i;
            }

            public static zzri zzb() {
                return zzja.zza;
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

        public static final class zzc extends com.google.android.libraries.places.internal.zzrb.zzb<zza, zzc> implements zzso {
            private zzc() {
                super(zza.zzl);
            }

            /* synthetic */ zzc(zziw zziw) {
                this();
            }
        }

        public enum zzd implements zzrg {
            UNKNOWN_TIMESTAMP_TYPE(0),
            NATIVE(1),
            SUPPLIED(2);
            
            private static final zzrf<zzd> zzd = null;
            private final int zze;

            static {
                zzd = new zzjc();
            }

            private zzd(int i) {
                this.zze = i;
            }

            public static zzri zzb() {
                return zzjd.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zzd.class.getName());
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

        static {
            zza zza = new zza();
            zzl = zza;
            zzrb.zza(zza.class, zza);
        }

        private zza() {
            String str = "";
            this.zze = str;
            this.zzh = str;
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzix$zza>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzix$zza>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzix$zza>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zziw.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzix$zza> r2 = zzm
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzix$zza> r3 = com.google.android.libraries.places.internal.zzix.zza.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzix$zza> r2 = zzm     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzix$zza r4 = zzl     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzix$zza r2 = zzl
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzix.zza.C13847zza.zzb()
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zze"
                r2[r3] = r4
                r3 = 4
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                r3 = 5
                java.lang.String r4 = "zzg"
                r2[r3] = r4
                r3 = 6
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzix.zza.zzb.zzb()
                r2[r3] = r4
                r3 = 7
                java.lang.String r4 = "zzh"
                r2[r3] = r4
                r3 = 8
                java.lang.String r4 = "zzi"
                r2[r3] = r4
                r3 = 9
                java.lang.String r4 = "zzj"
                r2[r3] = r4
                r3 = 10
                java.lang.String r4 = "zzk"
                r2[r3] = r4
                r3 = 11
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzix.zza.zzd.zzb()
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzix$zza r3 = zzl
                java.lang.String r4 = "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\f\u0003\u0005\b\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\f\u0007"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0085:
                com.google.android.libraries.places.internal.zzix$zza$zzc r2 = new com.google.android.libraries.places.internal.zzix$zza$zzc
                r2.<init>(r3)
                return r2
            L_0x008b:
                com.google.android.libraries.places.internal.zzix$zza r2 = new com.google.android.libraries.places.internal.zzix$zza
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzix.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzb extends zzrb<zzb, C13848zzb> implements zzso {
        /* access modifiers changed from: private */
        public static final zzb zzf;
        private static volatile zzsw<zzb> zzg;
        private int zzc;
        private int zzd;
        private zza zze;

        public enum zza implements zzrg {
            UNKNOWN(0),
            LIFECYCLE(1);
            
            private static final zzrf<zza> zzc = null;
            private final int zzd;

            static {
                zzc = new zzjf();
            }

            private zza(int i) {
                this.zzd = i;
            }

            public static zzri zzb() {
                return zzje.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zza.class.getName());
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

        /* renamed from: com.google.android.libraries.places.internal.zzix$zzb$zzb reason: collision with other inner class name */
        public static final class C13848zzb extends com.google.android.libraries.places.internal.zzrb.zzb<zzb, C13848zzb> implements zzso {
            private C13848zzb() {
                super(zzb.zzf);
            }

            /* synthetic */ C13848zzb(zziw zziw) {
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

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzix$zzb>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzix$zzb>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzix$zzb>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zziw.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzix$zzb> r2 = zzg
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzix$zzb> r3 = com.google.android.libraries.places.internal.zzix.zzb.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzix$zzb> r2 = zzg     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzix$zzb r4 = zzf     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzix$zzb r2 = zzf
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzix.zzb.zza.zzb()
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zze"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzix$zzb r3 = zzf
                java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0054:
                com.google.android.libraries.places.internal.zzix$zzb$zzb r2 = new com.google.android.libraries.places.internal.zzix$zzb$zzb
                r2.<init>(r3)
                return r2
            L_0x005a:
                com.google.android.libraries.places.internal.zzix$zzb r2 = new com.google.android.libraries.places.internal.zzix$zzb
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzix.zzb.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
