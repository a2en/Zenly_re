package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzrb.zzb;

public final class zzpo {

    public static final class zza extends zzrb<zza, C13866zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zza zzj;
        private static volatile zzsw<zza> zzk;
        private int zzc;
        private boolean zzd;
        private boolean zze;
        private boolean zzf;
        private boolean zzg;
        private boolean zzh;
        private boolean zzi;

        /* renamed from: com.google.android.libraries.places.internal.zzpo$zza$zza reason: collision with other inner class name */
        public static final class C13866zza extends zzb<zza, C13866zza> implements zzso {
            private C13866zza() {
                super(zza.zzj);
            }

            /* synthetic */ C13866zza(zzpp zzpp) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zzj = zza;
            zzrb.zza(zza.class, zza);
        }

        private zza() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzpo$zza>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzpo$zza>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzpo$zza>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzpp.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzpo$zza> r2 = zzk
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzpo$zza> r3 = com.google.android.libraries.places.internal.zzpo.zza.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzpo$zza> r2 = zzk     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzpo$zza r4 = zzj     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzpo$zza r2 = zzj
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
                com.google.android.libraries.places.internal.zzpo$zza r3 = zzj
                java.lang.String r4 = "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0061:
                com.google.android.libraries.places.internal.zzpo$zza$zza r2 = new com.google.android.libraries.places.internal.zzpo$zza$zza
                r2.<init>(r3)
                return r2
            L_0x0067:
                com.google.android.libraries.places.internal.zzpo$zza r2 = new com.google.android.libraries.places.internal.zzpo$zza
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzpo.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
