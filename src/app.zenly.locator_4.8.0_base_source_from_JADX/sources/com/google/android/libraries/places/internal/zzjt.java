package com.google.android.libraries.places.internal;

public final class zzjt {

    public static final class zza extends zzrb<zza, C13854zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zza zzg;
        private static volatile zzsw<zza> zzh;
        private int zzc;
        private int zzd;
        private int zze;
        private byte zzf = 2;

        /* renamed from: com.google.android.libraries.places.internal.zzjt$zza$zza reason: collision with other inner class name */
        public static final class C13854zza extends com.google.android.libraries.places.internal.zzrb.zzb<zza, C13854zza> implements zzso {
            private C13854zza() {
                super(zza.zzg);
            }

            /* synthetic */ C13854zza(zzjs zzjs) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zzg = zza;
            zzrb.zza(zza.class, zza);
        }

        private zza() {
        }

        /* JADX WARNING: type inference failed for: r3v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjt$zza>] */
        /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjt$zza>] */
        /* JADX WARNING: type inference failed for: r3v13 */
        /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjt$zza>] */
        /* JADX WARNING: type inference failed for: r3v19 */
        /* JADX WARNING: type inference failed for: r3v20 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v13
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
        public final java.lang.Object zza(int r3, java.lang.Object r4, java.lang.Object r5) {
            /*
                r2 = this;
                int[] r5 = com.google.android.libraries.places.internal.zzjs.zza
                r0 = 1
                int r3 = r3 - r0
                r3 = r5[r3]
                r5 = 0
                r1 = 0
                switch(r3) {
                    case 1: goto L_0x005c;
                    case 2: goto L_0x0056;
                    case 3: goto L_0x003d;
                    case 4: goto L_0x003a;
                    case 5: goto L_0x0020;
                    case 6: goto L_0x0019;
                    case 7: goto L_0x0011;
                    default: goto L_0x000b;
                }
            L_0x000b:
                java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
                r3.<init>()
                throw r3
            L_0x0011:
                if (r4 != 0) goto L_0x0014
                goto L_0x0015
            L_0x0014:
                r5 = 1
            L_0x0015:
                byte r3 = (byte) r5
                r2.zzf = r3
                return r1
            L_0x0019:
                byte r3 = r2.zzf
                java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
                return r3
            L_0x0020:
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjt$zza> r3 = zzh
                if (r3 != 0) goto L_0x0039
                java.lang.Class<com.google.android.libraries.places.internal.zzjt$zza> r4 = com.google.android.libraries.places.internal.zzjt.zza.class
                monitor-enter(r4)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjt$zza> r3 = zzh     // Catch:{ all -> 0x0036 }
                if (r3 != 0) goto L_0x0034
                com.google.android.libraries.places.internal.zzrb$zza r3 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x0036 }
                com.google.android.libraries.places.internal.zzjt$zza r5 = zzg     // Catch:{ all -> 0x0036 }
                r3.<init>(r5)     // Catch:{ all -> 0x0036 }
                zzh = r3     // Catch:{ all -> 0x0036 }
            L_0x0034:
                monitor-exit(r4)     // Catch:{ all -> 0x0036 }
                goto L_0x0039
            L_0x0036:
                r3 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0036 }
                throw r3
            L_0x0039:
                return r3
            L_0x003a:
                com.google.android.libraries.places.internal.zzjt$zza r3 = zzg
                return r3
            L_0x003d:
                r3 = 3
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "zzc"
                r3[r5] = r4
                java.lang.String r4 = "zzd"
                r3[r0] = r4
                r4 = 2
                java.lang.String r5 = "zze"
                r3[r4] = r5
                com.google.android.libraries.places.internal.zzjt$zza r4 = zzg
                java.lang.String r5 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001Ԇ\u0000\u0002Ԇ\u0001"
                java.lang.Object r3 = com.google.android.libraries.places.internal.zzrb.zza(r4, r5, r3)
                return r3
            L_0x0056:
                com.google.android.libraries.places.internal.zzjt$zza$zza r3 = new com.google.android.libraries.places.internal.zzjt$zza$zza
                r3.<init>(r1)
                return r3
            L_0x005c:
                com.google.android.libraries.places.internal.zzjt$zza r3 = new com.google.android.libraries.places.internal.zzjt$zza
                r3.<init>()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzjt.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzb extends zzrb<zzb, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzb zzg;
        private static volatile zzsw<zzb> zzh;
        private int zzc;
        private zza zzd;
        private zza zze;
        private byte zzf = 2;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzb, zza> implements zzso {
            private zza() {
                super(zzb.zzg);
            }

            /* synthetic */ zza(zzjs zzjs) {
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

        /* JADX WARNING: type inference failed for: r3v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjt$zzb>] */
        /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjt$zzb>] */
        /* JADX WARNING: type inference failed for: r3v13 */
        /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjt$zzb>] */
        /* JADX WARNING: type inference failed for: r3v19 */
        /* JADX WARNING: type inference failed for: r3v20 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v13
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
        public final java.lang.Object zza(int r3, java.lang.Object r4, java.lang.Object r5) {
            /*
                r2 = this;
                int[] r5 = com.google.android.libraries.places.internal.zzjs.zza
                r0 = 1
                int r3 = r3 - r0
                r3 = r5[r3]
                r5 = 0
                r1 = 0
                switch(r3) {
                    case 1: goto L_0x005c;
                    case 2: goto L_0x0056;
                    case 3: goto L_0x003d;
                    case 4: goto L_0x003a;
                    case 5: goto L_0x0020;
                    case 6: goto L_0x0019;
                    case 7: goto L_0x0011;
                    default: goto L_0x000b;
                }
            L_0x000b:
                java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
                r3.<init>()
                throw r3
            L_0x0011:
                if (r4 != 0) goto L_0x0014
                goto L_0x0015
            L_0x0014:
                r5 = 1
            L_0x0015:
                byte r3 = (byte) r5
                r2.zzf = r3
                return r1
            L_0x0019:
                byte r3 = r2.zzf
                java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
                return r3
            L_0x0020:
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjt$zzb> r3 = zzh
                if (r3 != 0) goto L_0x0039
                java.lang.Class<com.google.android.libraries.places.internal.zzjt$zzb> r4 = com.google.android.libraries.places.internal.zzjt.zzb.class
                monitor-enter(r4)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzjt$zzb> r3 = zzh     // Catch:{ all -> 0x0036 }
                if (r3 != 0) goto L_0x0034
                com.google.android.libraries.places.internal.zzrb$zza r3 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x0036 }
                com.google.android.libraries.places.internal.zzjt$zzb r5 = zzg     // Catch:{ all -> 0x0036 }
                r3.<init>(r5)     // Catch:{ all -> 0x0036 }
                zzh = r3     // Catch:{ all -> 0x0036 }
            L_0x0034:
                monitor-exit(r4)     // Catch:{ all -> 0x0036 }
                goto L_0x0039
            L_0x0036:
                r3 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0036 }
                throw r3
            L_0x0039:
                return r3
            L_0x003a:
                com.google.android.libraries.places.internal.zzjt$zzb r3 = zzg
                return r3
            L_0x003d:
                r3 = 3
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "zzc"
                r3[r5] = r4
                java.lang.String r4 = "zzd"
                r3[r0] = r4
                r4 = 2
                java.lang.String r5 = "zze"
                r3[r4] = r5
                com.google.android.libraries.places.internal.zzjt$zzb r4 = zzg
                java.lang.String r5 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001Љ\u0000\u0002Љ\u0001"
                java.lang.Object r3 = com.google.android.libraries.places.internal.zzrb.zza(r4, r5, r3)
                return r3
            L_0x0056:
                com.google.android.libraries.places.internal.zzjt$zzb$zza r3 = new com.google.android.libraries.places.internal.zzjt$zzb$zza
                r3.<init>(r1)
                return r3
            L_0x005c:
                com.google.android.libraries.places.internal.zzjt$zzb r3 = new com.google.android.libraries.places.internal.zzjt$zzb
                r3.<init>()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzjt.zzb.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
