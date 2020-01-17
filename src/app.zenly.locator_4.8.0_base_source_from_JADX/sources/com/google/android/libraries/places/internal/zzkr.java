package com.google.android.libraries.places.internal;

public final class zzkr {

    public static final class zza extends zzrb<zza, C13860zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zza zze;
        private static volatile zzsw<zza> zzf;
        private int zzc;
        private int zzd;

        /* renamed from: com.google.android.libraries.places.internal.zzkr$zza$zza reason: collision with other inner class name */
        public static final class C13860zza extends com.google.android.libraries.places.internal.zzrb.zzb<zza, C13860zza> implements zzso {
            private C13860zza() {
                super(zza.zze);
            }

            /* synthetic */ C13860zza(zzkq zzkq) {
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

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zza>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zza>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zza>, com.google.android.libraries.places.internal.zzrb$zza] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zza> r2 = zzf
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zza> r3 = com.google.android.libraries.places.internal.zzkr.zza.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zza> r2 = zzf     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkr$zza r4 = zze     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkr$zza r2 = zze
                return r2
            L_0x0033:
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                com.google.android.libraries.places.internal.zzkr$zza r3 = zze
                java.lang.String r4 = "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004\u0000"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0048:
                com.google.android.libraries.places.internal.zzkr$zza$zza r2 = new com.google.android.libraries.places.internal.zzkr$zza$zza
                r2.<init>(r3)
                return r2
            L_0x004e:
                com.google.android.libraries.places.internal.zzkr$zza r2 = new com.google.android.libraries.places.internal.zzkr$zza
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzb extends zzrb<zzb, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzb zzj;
        private static volatile zzsw<zzb> zzk;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;
        private boolean zzh;
        private int zzi;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzb, zza> implements zzso {
            private zza() {
                super(zzb.zzj);
            }

            /* synthetic */ zza(zzkq zzkq) {
                this();
            }
        }

        /* renamed from: com.google.android.libraries.places.internal.zzkr$zzb$zzb reason: collision with other inner class name */
        public enum C13861zzb implements zzrg {
            NOT_REQUIRED(0),
            ISSUED(1),
            REQUIRED_BUT_GPS_SPEED_TOO_HIGH(2),
            REQUIRED_BUT_RECENTLY_MADE(3),
            REQUIRED_BUT_USER_ON_THE_GO(4),
            REQUIRED_BUT_USER_IN_TRANSIT(5);
            
            private static final zzrf<C13861zzb> zzg = null;
            private final int zzh;

            static {
                zzg = new zzks();
            }

            private C13861zzb(int i) {
                this.zzh = i;
            }

            public static zzri zzb() {
                return zzkt.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(C13861zzb.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.zzh);
                sb.append(" name=");
                sb.append(name());
                sb.append('>');
                return sb.toString();
            }

            public final int zza() {
                return this.zzh;
            }
        }

        static {
            zzb zzb = new zzb();
            zzj = zzb;
            zzrb.zza(zzb.class, zzb);
        }

        private zzb() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzb>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzb>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzb>] */
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzb> r2 = zzk
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzb> r3 = com.google.android.libraries.places.internal.zzkr.zzb.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzb> r2 = zzk     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkr$zzb r4 = zzj     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkr$zzb r2 = zzj
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzb.C13861zzb.zzb()
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkr$zzb r3 = zzj
                java.lang.String r4 = "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0007\u0004\u0006\f\u0005"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0069:
                com.google.android.libraries.places.internal.zzkr$zzb$zza r2 = new com.google.android.libraries.places.internal.zzkr$zzb$zza
                r2.<init>(r3)
                return r2
            L_0x006f:
                com.google.android.libraries.places.internal.zzkr$zzb r2 = new com.google.android.libraries.places.internal.zzkr$zzb
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zzb.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzc extends zzrb<zzc, zzb> implements zzso {
        /* access modifiers changed from: private */
        public static final zzc zzg;
        private static volatile zzsw<zzc> zzh;
        private int zzc;
        private int zzd;
        private zze zze;
        private zza zzf;

        public enum zza implements zzrg {
            UNKNOWN(0),
            LOCATION_WITH_WIFI(1),
            BLE_BEACON(2);
            
            private static final zzrf<zza> zzd = null;
            private final int zze;

            static {
                zzd = new zzkv();
            }

            private zza(int i) {
                this.zze = i;
            }

            public static zzri zzb() {
                return zzku.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zza.class.getName());
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

        public static final class zzb extends com.google.android.libraries.places.internal.zzrb.zzb<zzc, zzb> implements zzso {
            private zzb() {
                super(zzc.zzg);
            }

            /* synthetic */ zzb(zzkq zzkq) {
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

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzc>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzc>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzc>] */
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzc> r2 = zzh
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzc> r3 = com.google.android.libraries.places.internal.zzkr.zzc.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzc> r2 = zzh     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkr$zzc r4 = zzg     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkr$zzc r2 = zzg
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzc.zza.zzb()
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zze"
                r2[r3] = r4
                r3 = 4
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkr$zzc r3 = zzg
                java.lang.String r4 = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0059:
                com.google.android.libraries.places.internal.zzkr$zzc$zzb r2 = new com.google.android.libraries.places.internal.zzkr$zzc$zzb
                r2.<init>(r3)
                return r2
            L_0x005f:
                com.google.android.libraries.places.internal.zzkr$zzc r2 = new com.google.android.libraries.places.internal.zzkr$zzc
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zzc.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
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

            /* synthetic */ zza(zzkq zzkq) {
                this();
            }
        }

        public enum zzb implements zzrg {
            UNKNOWN_COMPONENT(0),
            CENTRAL_ENGINE(1),
            ANONYMOUS_ENGINE(2),
            PERSONALIZED_ENGINE(3);
            
            private static final zzrf<zzb> zze = null;
            private final int zzf;

            static {
                zze = new zzkw();
            }

            private zzb(int i) {
                this.zzf = i;
            }

            public static zzri zzb() {
                return zzkx.zza;
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

        public enum zzc implements zzrg {
            UNKNOWN_MODE(0),
            ZERO_POWER(1),
            STATE_ONLY(2),
            FULL_INFERENCE(3);
            
            private static final zzrf<zzc> zze = null;
            private final int zzf;

            static {
                zze = new zzkz();
            }

            private zzc(int i) {
                this.zzf = i;
            }

            public static zzri zzb() {
                return zzky.zza;
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

        /* renamed from: com.google.android.libraries.places.internal.zzkr$zzd$zzd reason: collision with other inner class name */
        public enum C13862zzd implements zzrg {
            UNKNOWN_STATE_CHANGE(0),
            STARTED(1),
            STOPPED(2);
            
            private static final zzrf<C13862zzd> zzd = null;
            private final int zze;

            static {
                zzd = new zzla();
            }

            private C13862zzd(int i) {
                this.zze = i;
            }

            public static zzri zzb() {
                return zzlb.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(C13862zzd.class.getName());
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
            zzd zzd2 = new zzd();
            zzg = zzd2;
            zzrb.zza(zzd.class, zzd2);
        }

        private zzd() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzd>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzd>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzd>] */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
          assigns: []
          uses: []
          mth insns count: 50
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
                int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzd> r2 = zzh
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzd> r3 = com.google.android.libraries.places.internal.zzkr.zzd.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzd> r2 = zzh     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkr$zzd r4 = zzg     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkr$zzd r2 = zzg
                return r2
            L_0x0033:
                r2 = 7
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                r3 = 2
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzd.zzb.zzb()
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zze"
                r2[r3] = r4
                r3 = 4
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzd.C13862zzd.zzb()
                r2[r3] = r4
                r3 = 5
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                r3 = 6
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzd.zzc.zzb()
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkr$zzd r3 = zzg
                java.lang.String r4 = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0067:
                com.google.android.libraries.places.internal.zzkr$zzd$zza r2 = new com.google.android.libraries.places.internal.zzkr$zzd$zza
                r2.<init>(r3)
                return r2
            L_0x006d:
                com.google.android.libraries.places.internal.zzkr$zzd r2 = new com.google.android.libraries.places.internal.zzkr$zzd
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zzd.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zze extends zzrb<zze, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zze zzi;
        private static volatile zzsw<zze> zzj;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;
        private int zzh;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zze, zza> implements zzso {
            private zza() {
                super(zze.zzi);
            }

            /* synthetic */ zza(zzkq zzkq) {
                this();
            }
        }

        static {
            zze zze2 = new zze();
            zzi = zze2;
            zzrb.zza(zze.class, zze2);
        }

        private zze() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zze>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zze>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zze>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zze> r2 = zzj
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zze> r3 = com.google.android.libraries.places.internal.zzkr.zze.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zze> r2 = zzj     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkr$zze r4 = zzi     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkr$zze r2 = zzi
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
                com.google.android.libraries.places.internal.zzkr$zze r3 = zzi
                java.lang.String r4 = "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u000f\u0001\u0003\u000f\u0002\u0004\u0004\u0003\u0005\u000f\u0004"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x005c:
                com.google.android.libraries.places.internal.zzkr$zze$zza r2 = new com.google.android.libraries.places.internal.zzkr$zze$zza
                r2.<init>(r3)
                return r2
            L_0x0062:
                com.google.android.libraries.places.internal.zzkr$zze r2 = new com.google.android.libraries.places.internal.zzkr$zze
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zze.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzf extends zzrb<zzf, zzb> implements zzso {
        /* access modifiers changed from: private */
        public static final zzf zzg;
        private static volatile zzsw<zzf> zzh;
        private int zzc;
        private int zzd;
        private boolean zze;
        private long zzf;

        public enum zza implements zzrg {
            UNKNOWN_TYPE(0),
            IO_EXCEPTION(1),
            FILE_NOT_FOUND(2);
            
            private static final zzrf<zza> zzd = null;
            private final int zze;

            static {
                zzd = new zzld();
            }

            private zza(int i) {
                this.zze = i;
            }

            public static zzri zzb() {
                return zzlc.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zza.class.getName());
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

        public static final class zzb extends com.google.android.libraries.places.internal.zzrb.zzb<zzf, zzb> implements zzso {
            private zzb() {
                super(zzf.zzg);
            }

            /* synthetic */ zzb(zzkq zzkq) {
                this();
            }
        }

        static {
            zzf zzf2 = new zzf();
            zzg = zzf2;
            zzrb.zza(zzf.class, zzf2);
        }

        private zzf() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzf>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzf>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzf>] */
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzf> r2 = zzh
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzf> r3 = com.google.android.libraries.places.internal.zzkr.zzf.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzf> r2 = zzh     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkr$zzf r4 = zzg     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkr$zzf r2 = zzg
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzf.zza.zzb()
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zze"
                r2[r3] = r4
                r3 = 4
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkr$zzf r3 = zzg
                java.lang.String r4 = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\u0002\u0002"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0059:
                com.google.android.libraries.places.internal.zzkr$zzf$zzb r2 = new com.google.android.libraries.places.internal.zzkr$zzf$zzb
                r2.<init>(r3)
                return r2
            L_0x005f:
                com.google.android.libraries.places.internal.zzkr$zzf r2 = new com.google.android.libraries.places.internal.zzkr$zzf
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zzf.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzg extends zzrb<zzg, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzg zzh;
        private static volatile zzsw<zzg> zzi;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzg, zza> implements zzso {
            private zza() {
                super(zzg.zzh);
            }

            /* synthetic */ zza(zzkq zzkq) {
                this();
            }
        }

        public enum zzb implements zzrg {
            UNDEFINED_SOURCE(0),
            INTERNAL_STORAGE(1),
            MOBILE_DATA_DOWNLOAD(2),
            APK(3),
            SERVER_DOWNLOAD(4);
            
            private static final zzrf<zzb> zzf = null;
            private final int zzg;

            static {
                zzf = new zzle();
            }

            private zzb(int i) {
                this.zzg = i;
            }

            public static zzri zzb() {
                return zzlf.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zzb.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.zzg);
                sb.append(" name=");
                sb.append(name());
                sb.append('>');
                return sb.toString();
            }

            public final int zza() {
                return this.zzg;
            }
        }

        public enum zzc implements zzrg {
            UNDEFINED_STATUS(0),
            SUCCESS(1),
            NO_FILE_AVAILABLE(2),
            PARSING_FAILED(3),
            SERVER_REQUEST_FAILED(4),
            MDD_CONNECTION_FAILED(5),
            FILE_READ_FAILED(6);
            
            private static final zzrf<zzc> zzh = null;
            private final int zzi;

            static {
                zzh = new zzlh();
            }

            private zzc(int i) {
                this.zzi = i;
            }

            public static zzri zzb() {
                return zzlg.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zzc.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.zzi);
                sb.append(" name=");
                sb.append(name());
                sb.append('>');
                return sb.toString();
            }

            public final int zza() {
                return this.zzi;
            }
        }

        static {
            zzg zzg2 = new zzg();
            zzh = zzg2;
            zzrb.zza(zzg.class, zzg2);
        }

        private zzg() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzg>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzg>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzg>] */
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x0073;
                    case 2: goto L_0x006d;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzg> r2 = zzi
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzg> r3 = com.google.android.libraries.places.internal.zzkr.zzg.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzg> r2 = zzi     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkr$zzg r4 = zzh     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzi = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkr$zzg r2 = zzh
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzg.zzb.zzb()
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zze"
                r2[r3] = r4
                r3 = 4
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzg.zzc.zzb()
                r2[r3] = r4
                r3 = 5
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                r3 = 6
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzlj.zzb()
                r2[r3] = r4
                r3 = 7
                java.lang.String r4 = "zzg"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkr$zzg r3 = zzh
                java.lang.String r4 = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\u0004\u0003"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x006d:
                com.google.android.libraries.places.internal.zzkr$zzg$zza r2 = new com.google.android.libraries.places.internal.zzkr$zzg$zza
                r2.<init>(r3)
                return r2
            L_0x0073:
                com.google.android.libraries.places.internal.zzkr$zzg r2 = new com.google.android.libraries.places.internal.zzkr$zzg
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zzg.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzh extends zzrb<zzh, zzb> implements zzso {
        /* access modifiers changed from: private */
        public static final zzh zzm;
        private static volatile zzsw<zzh> zzn;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;
        private zzq zzh;
        private zzk zzi;
        private zzp zzj;
        private int zzk;
        private int zzl;

        public enum zza implements zzrg {
            UNKNOWN_STATUS(0),
            LOW_BATTERY(1),
            NORMAL_BATTERY(2),
            CHARGING(3);
            
            private static final zzrf<zza> zze = null;
            private final int zzf;

            static {
                zze = new zzll();
            }

            private zza(int i) {
                this.zzf = i;
            }

            public static zzri zzb() {
                return zzlm.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zza.class.getName());
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

        public static final class zzb extends com.google.android.libraries.places.internal.zzrb.zzb<zzh, zzb> implements zzso {
            private zzb() {
                super(zzh.zzm);
            }

            /* synthetic */ zzb(zzkq zzkq) {
                this();
            }
        }

        public enum zzc implements zzrg {
            UNKNOWN(0),
            WLAN(1),
            MOBILE(2),
            OTHER(3);
            
            private static final zzrf<zzc> zze = null;
            private final int zzf;

            static {
                zze = new zzln();
            }

            private zzc(int i) {
                this.zzf = i;
            }

            public static zzri zzb() {
                return zzlo.zza;
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
            UNKNOWN_NETWORK_REQUEST(0),
            PLACE_INFO_REQUEST(1),
            PERSONALIZED_PLACE_INFO_REQUEST(2),
            PLACE_INFERENCE_MODEL_WEIGHTS_REQUEST(3);
            
            private static final zzrf<zzd> zze = null;
            private final int zzf;

            static {
                zze = new zzlq();
            }

            private zzd(int i) {
                this.zzf = i;
            }

            public static zzri zzb() {
                return zzlp.zza;
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

        public enum zze implements zzrg {
            UNKNOWN_SERVER_TYPE(0),
            PLACES_SERVER(1),
            SEMANTIC_LOCATION_SERVER(2);
            
            private static final zzrf<zze> zzd = null;
            private final int zze;

            static {
                zzd = new zzlr();
            }

            private zze(int i) {
                this.zze = i;
            }

            public static zzri zzb() {
                return zzls.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zze.class.getName());
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

        public enum zzf implements zzrg {
            UNKNOWN_REQUEST_STATUS(0),
            SUCCESS(1),
            TIMEOUT(2),
            NETWORK_ERROR(3);
            
            private static final zzrf<zzf> zze = null;
            private final int zzf;

            static {
                zze = new zzlu();
            }

            private zzf(int i) {
                this.zzf = i;
            }

            public static zzri zzb() {
                return zzlt.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zzf.class.getName());
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
            zzh zzh2 = new zzh();
            zzm = zzh2;
            zzrb.zza(zzh.class, zzh2);
        }

        private zzh() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzh>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzh>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzh>] */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
          assigns: []
          uses: []
          mth insns count: 66
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
                int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x00a1;
                    case 2: goto L_0x009b;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzh> r2 = zzn
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzh> r3 = com.google.android.libraries.places.internal.zzkr.zzh.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzh> r2 = zzn     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkr$zzh r4 = zzm     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkr$zzh r2 = zzm
                return r2
            L_0x0033:
                r2 = 15
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                r3 = 2
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzh.zzd.zzb()
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zze"
                r2[r3] = r4
                r3 = 4
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzh.zzf.zzb()
                r2[r3] = r4
                r3 = 5
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                r3 = 6
                java.lang.String r4 = "zzg"
                r2[r3] = r4
                r3 = 7
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzh.zzc.zzb()
                r2[r3] = r4
                r3 = 8
                java.lang.String r4 = "zzh"
                r2[r3] = r4
                r3 = 9
                java.lang.String r4 = "zzi"
                r2[r3] = r4
                r3 = 10
                java.lang.String r4 = "zzj"
                r2[r3] = r4
                r3 = 11
                java.lang.String r4 = "zzk"
                r2[r3] = r4
                r3 = 12
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzh.zza.zzb()
                r2[r3] = r4
                r3 = 13
                java.lang.String r4 = "zzl"
                r2[r3] = r4
                r3 = 14
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzh.zze.zzb()
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkr$zzh r3 = zzm
                java.lang.String r4 = "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\f\u0003\u0005\t\u0004\u0006\t\u0005\u0007\t\u0006\b\f\u0007\t\f\b"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x009b:
                com.google.android.libraries.places.internal.zzkr$zzh$zzb r2 = new com.google.android.libraries.places.internal.zzkr$zzh$zzb
                r2.<init>(r3)
                return r2
            L_0x00a1:
                com.google.android.libraries.places.internal.zzkr$zzh r2 = new com.google.android.libraries.places.internal.zzkr$zzh
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zzh.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzi extends zzrb<zzi, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzi zze;
        private static volatile zzsw<zzi> zzf;
        private int zzc;
        private int zzd;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzi, zza> implements zzso {
            private zza() {
                super(zzi.zze);
            }

            /* synthetic */ zza(zzkq zzkq) {
                this();
            }
        }

        static {
            zzi zzi = new zzi();
            zze = zzi;
            zzrb.zza(zzi.class, zzi);
        }

        private zzi() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzi>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzi>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzi>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzi> r2 = zzf
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzi> r3 = com.google.android.libraries.places.internal.zzkr.zzi.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzi> r2 = zzf     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkr$zzi r4 = zze     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkr$zzi r2 = zze
                return r2
            L_0x0033:
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                com.google.android.libraries.places.internal.zzkr$zzi r3 = zze
                java.lang.String r4 = "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004\u0000"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0048:
                com.google.android.libraries.places.internal.zzkr$zzi$zza r2 = new com.google.android.libraries.places.internal.zzkr$zzi$zza
                r2.<init>(r3)
                return r2
            L_0x004e:
                com.google.android.libraries.places.internal.zzkr$zzi r2 = new com.google.android.libraries.places.internal.zzkr$zzi
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zzi.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzj extends zzrb<zzj, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzj zzl;
        private static volatile zzsw<zzj> zzm;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;
        private int zzh;
        private boolean zzi;
        private int zzj;
        private int zzk;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzj, zza> implements zzso {
            private zza() {
                super(zzj.zzl);
            }

            /* synthetic */ zza(zzkq zzkq) {
                this();
            }
        }

        public enum zzb implements zzrg {
            CONTEXT_MANAGER(0),
            MDH(1);
            
            private static final zzrf<zzb> zzc = null;
            private final int zzd;

            static {
                zzc = new zzlv();
            }

            private zzb(int i) {
                this.zzd = i;
            }

            public static zzri zzb() {
                return zzlw.zza;
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

        public enum zzc implements zzrg {
            SUCCESS(0),
            PROTO_PARSING_ERROR(1),
            REQUEST_FAILED(2);
            
            private static final zzrf<zzc> zzd = null;
            private final int zze;

            static {
                zzd = new zzly();
            }

            private zzc(int i) {
                this.zze = i;
            }

            public static zzri zzb() {
                return zzlx.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zzc.class.getName());
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
            zzj zzj2 = new zzj();
            zzl = zzj2;
            zzrb.zza(zzj.class, zzj2);
        }

        private zzj() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzj>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzj>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzj>] */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
          assigns: []
          uses: []
          mth insns count: 58
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
                int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x0083;
                    case 2: goto L_0x007d;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzj> r2 = zzm
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzj> r3 = com.google.android.libraries.places.internal.zzkr.zzj.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzj> r2 = zzm     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkr$zzj r4 = zzl     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkr$zzj r2 = zzl
                return r2
            L_0x0033:
                r2 = 11
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzj.zzc.zzb()
                r2[r3] = r4
                r3 = 9
                java.lang.String r4 = "zzk"
                r2[r3] = r4
                r3 = 10
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzj.zzb.zzb()
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkr$zzj r3 = zzl
                java.lang.String r4 = "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0007\u0005\u0007\f\u0006\b\f\u0007"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x007d:
                com.google.android.libraries.places.internal.zzkr$zzj$zza r2 = new com.google.android.libraries.places.internal.zzkr$zzj$zza
                r2.<init>(r3)
                return r2
            L_0x0083:
                com.google.android.libraries.places.internal.zzkr$zzj r2 = new com.google.android.libraries.places.internal.zzkr$zzj
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zzj.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzk extends zzrb<zzk, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzk zzg;
        private static volatile zzsw<zzk> zzh;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzk, zza> implements zzso {
            private zza() {
                super(zzk.zzg);
            }

            /* synthetic */ zza(zzkq zzkq) {
                this();
            }
        }

        static {
            zzk zzk = new zzk();
            zzg = zzk;
            zzrb.zza(zzk.class, zzk);
        }

        private zzk() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzk>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzk>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzk>] */
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzk> r2 = zzh
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzk> r3 = com.google.android.libraries.places.internal.zzkr.zzk.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzk> r2 = zzh     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkr$zzk r4 = zzg     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkr$zzk r2 = zzg
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
                com.google.android.libraries.places.internal.zzkr$zzk r3 = zzg
                java.lang.String r4 = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0052:
                com.google.android.libraries.places.internal.zzkr$zzk$zza r2 = new com.google.android.libraries.places.internal.zzkr$zzk$zza
                r2.<init>(r3)
                return r2
            L_0x0058:
                com.google.android.libraries.places.internal.zzkr$zzk r2 = new com.google.android.libraries.places.internal.zzkr$zzk
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zzk.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzl extends zzrb<zzl, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzl zzj;
        private static volatile zzsw<zzl> zzk;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;
        private int zzh;
        private int zzi;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzl, zza> implements zzso {
            private zza() {
                super(zzl.zzj);
            }

            /* synthetic */ zza(zzkq zzkq) {
                this();
            }
        }

        static {
            zzl zzl = new zzl();
            zzj = zzl;
            zzrb.zza(zzl.class, zzl);
        }

        private zzl() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzl>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzl>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzl>, com.google.android.libraries.places.internal.zzrb$zza] */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
          assigns: []
          uses: []
          mth insns count: 50
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
                int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x0067;
                    case 2: goto L_0x0061;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzl> r2 = zzk
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzl> r3 = com.google.android.libraries.places.internal.zzkr.zzl.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzl> r2 = zzk     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkr$zzl r4 = zzj     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkr$zzl r2 = zzj
                return r2
            L_0x0033:
                r2 = 7
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
                com.google.android.libraries.places.internal.zzkr$zzl r3 = zzj
                java.lang.String r4 = "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0061:
                com.google.android.libraries.places.internal.zzkr$zzl$zza r2 = new com.google.android.libraries.places.internal.zzkr$zzl$zza
                r2.<init>(r3)
                return r2
            L_0x0067:
                com.google.android.libraries.places.internal.zzkr$zzl r2 = new com.google.android.libraries.places.internal.zzkr$zzl
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zzl.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzm extends zzrb<zzm, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzm zzk;
        private static volatile zzsw<zzm> zzl;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;
        private int zzh;
        private int zzi;
        private int zzj;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzm, zza> implements zzso {
            private zza() {
                super(zzm.zzk);
            }

            /* synthetic */ zza(zzkq zzkq) {
                this();
            }
        }

        static {
            zzm zzm = new zzm();
            zzk = zzm;
            zzrb.zza(zzm.class, zzm);
        }

        private zzm() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzm>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzm>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzm>, com.google.android.libraries.places.internal.zzrb$zza] */
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzm> r2 = zzl
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzm> r3 = com.google.android.libraries.places.internal.zzkr.zzm.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzm> r2 = zzl     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkr$zzm r4 = zzk     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzl = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkr$zzm r2 = zzk
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
                java.lang.String r4 = "zzj"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkr$zzm r3 = zzk
                java.lang.String r4 = "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0067:
                com.google.android.libraries.places.internal.zzkr$zzm$zza r2 = new com.google.android.libraries.places.internal.zzkr$zzm$zza
                r2.<init>(r3)
                return r2
            L_0x006d:
                com.google.android.libraries.places.internal.zzkr$zzm r2 = new com.google.android.libraries.places.internal.zzkr$zzm
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zzm.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzn extends zzrb<zzn, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzn zzp;
        private static volatile zzsw<zzn> zzq;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private boolean zzg;
        private boolean zzh;
        private int zzi;
        private int zzj;
        private int zzk;
        private zzrm<zzb> zzl = zzrb.zzk();
        private int zzm;
        private int zzn;
        private int zzo;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzn, zza> implements zzso {
            private zza() {
                super(zzn.zzp);
            }

            /* synthetic */ zza(zzkq zzkq) {
                this();
            }
        }

        public static final class zzb extends zzrb<zzb, zza> implements zzso {
            /* access modifiers changed from: private */
            public static final zzb zzg;
            private static volatile zzsw<zzb> zzh;
            private int zzc;
            private int zzd;
            private int zze;
            private int zzf;

            public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzb, zza> implements zzso {
                private zza() {
                    super(zzb.zzg);
                }

                /* synthetic */ zza(zzkq zzkq) {
                    this();
                }
            }

            static {
                zzb zzb = new zzb();
                zzg = zzb;
                zzrb.zza(zzb.class, zzb);
            }

            private zzb() {
            }

            /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzn$zzb>] */
            /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
            /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzn$zzb>] */
            /* JADX WARNING: type inference failed for: r2v13 */
            /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzn$zzb>] */
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
             */
            /* JADX WARNING: Unknown variable types count: 3 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
                /*
                    r1 = this;
                    int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
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
                    com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzn$zzb> r2 = zzh
                    if (r2 != 0) goto L_0x002f
                    java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzn$zzb> r3 = com.google.android.libraries.places.internal.zzkr.zzn.zzb.class
                    monitor-enter(r3)
                    com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzn$zzb> r2 = zzh     // Catch:{ all -> 0x002c }
                    if (r2 != 0) goto L_0x002a
                    com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                    com.google.android.libraries.places.internal.zzkr$zzn$zzb r4 = zzg     // Catch:{ all -> 0x002c }
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
                    com.google.android.libraries.places.internal.zzkr$zzn$zzb r2 = zzg
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
                    com.google.android.libraries.places.internal.zzkr$zzn$zzb r3 = zzg
                    java.lang.String r4 = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002"
                    java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                    return r2
                L_0x0052:
                    com.google.android.libraries.places.internal.zzkr$zzn$zzb$zza r2 = new com.google.android.libraries.places.internal.zzkr$zzn$zzb$zza
                    r2.<init>(r3)
                    return r2
                L_0x0058:
                    com.google.android.libraries.places.internal.zzkr$zzn$zzb r2 = new com.google.android.libraries.places.internal.zzkr$zzn$zzb
                    r2.<init>()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zzn.zzb.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        static {
            zzn zzn2 = new zzn();
            zzp = zzn2;
            zzrb.zza(zzn.class, zzn2);
        }

        private zzn() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzn>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzn>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzn>, com.google.android.libraries.places.internal.zzrb$zza] */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
          assigns: []
          uses: []
          mth insns count: 66
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
                int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x0099;
                    case 2: goto L_0x0093;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzn> r2 = zzq
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzn> r3 = com.google.android.libraries.places.internal.zzkr.zzn.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzn> r2 = zzq     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkr$zzn r4 = zzp     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzq = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkr$zzn r2 = zzp
                return r2
            L_0x0033:
                r2 = 15
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
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzn$zzb> r4 = com.google.android.libraries.places.internal.zzkr.zzn.zzb.class
                r2[r3] = r4
                r3 = 11
                java.lang.String r4 = "zzm"
                r2[r3] = r4
                r3 = 12
                java.lang.String r4 = "zzn"
                r2[r3] = r4
                r3 = 13
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzlj.zzb()
                r2[r3] = r4
                r3 = 14
                java.lang.String r4 = "zzo"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkr$zzn r3 = zzp
                java.lang.String r4 = "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007\t\u001b\n\u0004\b\u000b\f\t\f\u0004\n"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0093:
                com.google.android.libraries.places.internal.zzkr$zzn$zza r2 = new com.google.android.libraries.places.internal.zzkr$zzn$zza
                r2.<init>(r3)
                return r2
            L_0x0099:
                com.google.android.libraries.places.internal.zzkr$zzn r2 = new com.google.android.libraries.places.internal.zzkr$zzn
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zzn.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzo extends zzrb<zzo, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzo zzw;
        private static volatile zzsw<zzo> zzx;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;
        private boolean zzh;
        private zzrh zzi = zzrb.zzi();
        private int zzj;
        private zzh zzk;
        private zzn zzl;
        private zzb zzm;
        private zzl zzn;
        private zzj zzo;
        private zzm zzp;
        private zzc zzq;
        private zzd zzr;
        private zzr zzs;
        private zzs zzt;
        private zzg zzu;
        private zzf zzv;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzo, zza> implements zzso {
            private zza() {
                super(zzo.zzw);
            }

            /* synthetic */ zza(zzkq zzkq) {
                this();
            }
        }

        public enum zzb implements zzrg {
            UNKNOWN_EVENT_TYPE(0),
            NETWORK_REQUEST(1),
            PLACE_INFERENCE_COMPUTATION(2),
            CANDIDATE_SELECTION(3),
            PLACE_INDEX(4),
            PERSONAL_PLACES_UPDATE(5),
            PLACE_INDEX_FREE_SPACE(6),
            INCOMING_SIGNAL(7),
            LIFECYCLE(8),
            PREFETCH(9),
            SEGMENTER(10),
            MODEL_LOAD(11),
            MAPPED_BYTE_BUFFER_ERROR(12);
            
            private static final zzrf<zzb> zzn = null;
            private final int zzo;

            static {
                zzn = new zzlz();
            }

            private zzb(int i) {
                this.zzo = i;
            }

            public static zzri zzb() {
                return zzma.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zzb.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.zzo);
                sb.append(" name=");
                sb.append(name());
                sb.append('>');
                return sb.toString();
            }

            public final int zza() {
                return this.zzo;
            }
        }

        public enum zzc implements zzrg {
            UNKWNOWN_POWER_MODE(0),
            HIGH_POWER(1),
            BALANCED_POWER(2),
            LOW_POWER(3),
            NO_POWER(4);
            
            private static final zzrf<zzc> zzf = null;
            private final int zzg;

            static {
                zzf = new zzmc();
            }

            private zzc(int i) {
                this.zzg = i;
            }

            public static zzri zzb() {
                return zzmb.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zzc.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.zzg);
                sb.append(" name=");
                sb.append(name());
                sb.append('>');
                return sb.toString();
            }

            public final int zza() {
                return this.zzg;
            }
        }

        static {
            zzo zzo2 = new zzo();
            zzw = zzo2;
            zzrb.zza(zzo.class, zzo2);
        }

        private zzo() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzo>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzo>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzo>, com.google.android.libraries.places.internal.zzrb$zza] */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
          assigns: []
          uses: []
          mth insns count: 80
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
                int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x00c5;
                    case 2: goto L_0x00bf;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzo> r2 = zzx
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzo> r3 = com.google.android.libraries.places.internal.zzkr.zzo.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzo> r2 = zzx     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkr$zzo r4 = zzw     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzx = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkr$zzo r2 = zzw
                return r2
            L_0x0033:
                r2 = 22
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zze"
                r2[r4] = r3
                r3 = 2
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzo.zzb.zzb()
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                r3 = 4
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzo.zzc.zzb()
                r2[r3] = r4
                r3 = 5
                java.lang.String r4 = "zzg"
                r2[r3] = r4
                r3 = 6
                java.lang.String r4 = "zzk"
                r2[r3] = r4
                r3 = 7
                java.lang.String r4 = "zzl"
                r2[r3] = r4
                r3 = 8
                java.lang.String r4 = "zzm"
                r2[r3] = r4
                r3 = 9
                java.lang.String r4 = "zzn"
                r2[r3] = r4
                r3 = 10
                java.lang.String r4 = "zzh"
                r2[r3] = r4
                r3 = 11
                java.lang.String r4 = "zzo"
                r2[r3] = r4
                r3 = 12
                java.lang.String r4 = "zzp"
                r2[r3] = r4
                r3 = 13
                java.lang.String r4 = "zzi"
                r2[r3] = r4
                r3 = 14
                java.lang.String r4 = "zzj"
                r2[r3] = r4
                r3 = 15
                java.lang.String r4 = "zzq"
                r2[r3] = r4
                r3 = 16
                java.lang.String r4 = "zzr"
                r2[r3] = r4
                r3 = 17
                java.lang.String r4 = "zzs"
                r2[r3] = r4
                r3 = 18
                java.lang.String r4 = "zzt"
                r2[r3] = r4
                r3 = 19
                java.lang.String r4 = "zzd"
                r2[r3] = r4
                r3 = 20
                java.lang.String r4 = "zzu"
                r2[r3] = r4
                r3 = 21
                java.lang.String r4 = "zzv"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkr$zzo r3 = zzw
                java.lang.String r4 = "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0001\u0000\u0001\f\u0001\u0002\f\u0002\u0003\u0004\u0003\u0004\t\u0006\u0005\t\u0007\u0006\t\b\u0007\t\t\b\u0007\u0004\t\t\n\n\t\u000b\u000b\u0016\f\u0004\u0005\r\t\f\u000e\t\r\u000f\t\u000e\u0010\t\u000f\u0011\u0004\u0000\u0012\t\u0010\u0013\t\u0011"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x00bf:
                com.google.android.libraries.places.internal.zzkr$zzo$zza r2 = new com.google.android.libraries.places.internal.zzkr$zzo$zza
                r2.<init>(r3)
                return r2
            L_0x00c5:
                com.google.android.libraries.places.internal.zzkr$zzo r2 = new com.google.android.libraries.places.internal.zzkr$zzo
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zzo.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzp extends zzrb<zzp, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzp zze;
        private static volatile zzsw<zzp> zzf;
        private int zzc;
        private int zzd;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzp, zza> implements zzso {
            private zza() {
                super(zzp.zze);
            }

            /* synthetic */ zza(zzkq zzkq) {
                this();
            }
        }

        static {
            zzp zzp = new zzp();
            zze = zzp;
            zzrb.zza(zzp.class, zzp);
        }

        private zzp() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzp>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzp>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzp>, com.google.android.libraries.places.internal.zzrb$zza] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzp> r2 = zzf
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzp> r3 = com.google.android.libraries.places.internal.zzkr.zzp.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzp> r2 = zzf     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkr$zzp r4 = zze     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkr$zzp r2 = zze
                return r2
            L_0x0033:
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                com.google.android.libraries.places.internal.zzkr$zzp r3 = zze
                java.lang.String r4 = "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004\u0000"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0048:
                com.google.android.libraries.places.internal.zzkr$zzp$zza r2 = new com.google.android.libraries.places.internal.zzkr$zzp$zza
                r2.<init>(r3)
                return r2
            L_0x004e:
                com.google.android.libraries.places.internal.zzkr$zzp r2 = new com.google.android.libraries.places.internal.zzkr$zzp
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zzp.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzq extends zzrb<zzq, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzq zzh;
        private static volatile zzsw<zzq> zzi;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private boolean zzg;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzq, zza> implements zzso {
            private zza() {
                super(zzq.zzh);
            }

            /* synthetic */ zza(zzkq zzkq) {
                this();
            }
        }

        static {
            zzq zzq = new zzq();
            zzh = zzq;
            zzrb.zza(zzq.class, zzq);
        }

        private zzq() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzq>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzq>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzq>, com.google.android.libraries.places.internal.zzrb$zza] */
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzq> r2 = zzi
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzq> r3 = com.google.android.libraries.places.internal.zzkr.zzq.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzq> r2 = zzi     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkr$zzq r4 = zzh     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzi = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkr$zzq r2 = zzh
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
                java.lang.String r4 = "zzg"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkr$zzq r3 = zzh
                java.lang.String r4 = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0007\u0003"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0057:
                com.google.android.libraries.places.internal.zzkr$zzq$zza r2 = new com.google.android.libraries.places.internal.zzkr$zzq$zza
                r2.<init>(r3)
                return r2
            L_0x005d:
                com.google.android.libraries.places.internal.zzkr$zzq r2 = new com.google.android.libraries.places.internal.zzkr$zzq
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zzq.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzr extends zzrb<zzr, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzr zze;
        private static volatile zzsw<zzr> zzf;
        private int zzc;
        private int zzd;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzr, zza> implements zzso {
            private zza() {
                super(zzr.zze);
            }

            /* synthetic */ zza(zzkq zzkq) {
                this();
            }
        }

        public enum zzb implements zzrg {
            UNKNOWN(0),
            SCHEDULE(1),
            TRIGGERED(2),
            CANCEL(3);
            
            private static final zzrf<zzb> zze = null;
            private final int zzf;

            static {
                zze = new zzmd();
            }

            private zzb(int i) {
                this.zzf = i;
            }

            public static zzri zzb() {
                return zzme.zza;
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
            zzr zzr = new zzr();
            zze = zzr;
            zzrb.zza(zzr.class, zzr);
        }

        private zzr() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzr>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzr>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzr>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzr> r2 = zzf
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzr> r3 = com.google.android.libraries.places.internal.zzkr.zzr.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzr> r2 = zzf     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkr$zzr r4 = zze     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkr$zzr r2 = zze
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzr.zzb.zzb()
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkr$zzr r3 = zze
                java.lang.String r4 = "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x004f:
                com.google.android.libraries.places.internal.zzkr$zzr$zza r2 = new com.google.android.libraries.places.internal.zzkr$zzr$zza
                r2.<init>(r3)
                return r2
            L_0x0055:
                com.google.android.libraries.places.internal.zzkr$zzr r2 = new com.google.android.libraries.places.internal.zzkr$zzr
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zzr.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzs extends zzrb<zzs, zzb> implements zzso {
        /* access modifiers changed from: private */
        public static final zzs zzj;
        private static volatile zzsw<zzs> zzk;
        private int zzc;
        private int zzd;
        private zza zze;
        private zza zzf;
        private int zzg;
        private zzt zzh;
        private zzi zzi;

        public static final class zza extends zzrb<zza, zzb> implements zzso {
            /* access modifiers changed from: private */
            public static final zza zzf;
            private static volatile zzsw<zza> zzg;
            private int zzc;
            private int zzd;
            private long zze;

            /* renamed from: com.google.android.libraries.places.internal.zzkr$zzs$zza$zza reason: collision with other inner class name */
            public enum C13863zza implements zzrg {
                UNKNOWN(0),
                AT_PLACE(1),
                IN_TRANSIT(2);
                
                private static final zzrf<C13863zza> zzd = null;
                private final int zze;

                static {
                    zzd = new zzmg();
                }

                private C13863zza(int i) {
                    this.zze = i;
                }

                public static zzri zzb() {
                    return zzmf.zza;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("<");
                    sb.append(C13863zza.class.getName());
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

            public static final class zzb extends com.google.android.libraries.places.internal.zzrb.zzb<zza, zzb> implements zzso {
                private zzb() {
                    super(zza.zzf);
                }

                /* synthetic */ zzb(zzkq zzkq) {
                    this();
                }
            }

            static {
                zza zza = new zza();
                zzf = zza;
                zzrb.zza(zza.class, zza);
            }

            private zza() {
            }

            /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzs$zza>] */
            /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
            /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzs$zza>] */
            /* JADX WARNING: type inference failed for: r2v13 */
            /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzs$zza>] */
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
             */
            /* JADX WARNING: Unknown variable types count: 3 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
                /*
                    r1 = this;
                    int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
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
                    com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzs$zza> r2 = zzg
                    if (r2 != 0) goto L_0x002f
                    java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzs$zza> r3 = com.google.android.libraries.places.internal.zzkr.zzs.zza.class
                    monitor-enter(r3)
                    com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzs$zza> r2 = zzg     // Catch:{ all -> 0x002c }
                    if (r2 != 0) goto L_0x002a
                    com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                    com.google.android.libraries.places.internal.zzkr$zzs$zza r4 = zzf     // Catch:{ all -> 0x002c }
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
                    com.google.android.libraries.places.internal.zzkr$zzs$zza r2 = zzf
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
                    com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzs.zza.C13863zza.zzb()
                    r2[r3] = r4
                    r3 = 3
                    java.lang.String r4 = "zze"
                    r2[r3] = r4
                    com.google.android.libraries.places.internal.zzkr$zzs$zza r3 = zzf
                    java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0003\u0001"
                    java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                    return r2
                L_0x0054:
                    com.google.android.libraries.places.internal.zzkr$zzs$zza$zzb r2 = new com.google.android.libraries.places.internal.zzkr$zzs$zza$zzb
                    r2.<init>(r3)
                    return r2
                L_0x005a:
                    com.google.android.libraries.places.internal.zzkr$zzs$zza r2 = new com.google.android.libraries.places.internal.zzkr$zzs$zza
                    r2.<init>()
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zzs.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        public static final class zzb extends com.google.android.libraries.places.internal.zzrb.zzb<zzs, zzb> implements zzso {
            private zzb() {
                super(zzs.zzj);
            }

            /* synthetic */ zzb(zzkq zzkq) {
                this();
            }
        }

        public enum zzc implements zzrg {
            UNKNOWN_EVENT_TYPE(0),
            NEW_SEGMENT(1),
            EXTEND_SEGMENT(2);
            
            private static final zzrf<zzc> zzd = null;
            private final int zze;

            static {
                zzd = new zzmh();
            }

            private zzc(int i) {
                this.zze = i;
            }

            public static zzri zzb() {
                return zzmi.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zzc.class.getName());
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

        public enum zzd implements zzrg {
            UNKNOWN(0),
            SIMPLE_SEGMENTER(1),
            ON_THE_GO_SEGMENTER(2);
            
            private static final zzrf<zzd> zzd = null;
            private final int zze;

            static {
                zzd = new zzmk();
            }

            private zzd(int i) {
                this.zze = i;
            }

            public static zzri zzb() {
                return zzmj.zza;
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
            zzs zzs = new zzs();
            zzj = zzs;
            zzrb.zza(zzs.class, zzs);
        }

        private zzs() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzs>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzs>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzs>] */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
          assigns: []
          uses: []
          mth insns count: 54
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
                int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x0077;
                    case 2: goto L_0x0071;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzs> r2 = zzk
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzs> r3 = com.google.android.libraries.places.internal.zzkr.zzs.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzs> r2 = zzk     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkr$zzs r4 = zzj     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkr$zzs r2 = zzj
                return r2
            L_0x0033:
                r2 = 9
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                r3 = 2
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzs.zzc.zzb()
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzkr.zzs.zzd.zzb()
                r2[r3] = r4
                r3 = 7
                java.lang.String r4 = "zzh"
                r2[r3] = r4
                r3 = 8
                java.lang.String r4 = "zzi"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkr$zzs r3 = zzj
                java.lang.String r4 = "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002\u0004\f\u0003\u0005\t\u0004\u0006\t\u0005"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0071:
                com.google.android.libraries.places.internal.zzkr$zzs$zzb r2 = new com.google.android.libraries.places.internal.zzkr$zzs$zzb
                r2.<init>(r3)
                return r2
            L_0x0077:
                com.google.android.libraries.places.internal.zzkr$zzs r2 = new com.google.android.libraries.places.internal.zzkr$zzs
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zzs.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzt extends zzrb<zzt, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzt zzh;
        private static volatile zzsw<zzt> zzi;
        private int zzc;
        private int zzd;
        private boolean zze;
        private boolean zzf;
        private boolean zzg;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzt, zza> implements zzso {
            private zza() {
                super(zzt.zzh);
            }

            /* synthetic */ zza(zzkq zzkq) {
                this();
            }
        }

        static {
            zzt zzt = new zzt();
            zzh = zzt;
            zzrb.zza(zzt.class, zzt);
        }

        private zzt() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzt>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzt>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzt>] */
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzkq.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzt> r2 = zzi
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzkr$zzt> r3 = com.google.android.libraries.places.internal.zzkr.zzt.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzkr$zzt> r2 = zzi     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzkr$zzt r4 = zzh     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzi = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzkr$zzt r2 = zzh
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
                java.lang.String r4 = "zzg"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzkr$zzt r3 = zzh
                java.lang.String r4 = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0057:
                com.google.android.libraries.places.internal.zzkr$zzt$zza r2 = new com.google.android.libraries.places.internal.zzkr$zzt$zza
                r2.<init>(r3)
                return r2
            L_0x005d:
                com.google.android.libraries.places.internal.zzkr$zzt r2 = new com.google.android.libraries.places.internal.zzkr$zzt
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzkr.zzt.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
