package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzjk.zzc;
import com.google.android.libraries.places.internal.zzjv.zzi;
import com.google.android.libraries.places.internal.zzkr.zzo;
import com.google.android.libraries.places.internal.zzmm.zzs;

public final class zzhr {

    public static final class zza extends zzrb<zza, zzb> implements zzso {
        /* access modifiers changed from: private */
        public static final zza zzt;
        private static volatile zzsw<zza> zzu;
        private int zzc;
        private int zzd = 1;
        private zzs zze;
        private com.google.android.libraries.places.internal.zzjh.zza zzf;
        private com.google.android.libraries.places.internal.zzpo.zza zzg;
        private zzo zzh;
        private zzi zzi;
        private com.google.android.libraries.places.internal.zzjm.zzb zzj;
        private com.google.android.libraries.places.internal.zzir.zza zzk;
        private com.google.android.libraries.places.internal.zzig.zzb zzl;
        private zzc zzm;
        private zzkb.zzi zzn;
        private com.google.android.libraries.places.internal.zzkk.zza zzo;
        private com.google.android.libraries.places.internal.zzkp.zza zzp;
        private com.google.android.libraries.places.internal.zzix.zzb zzq;
        private com.google.android.libraries.places.internal.zzid.zzb zzr;
        private byte zzs = 2;

        /* renamed from: com.google.android.libraries.places.internal.zzhr$zza$zza reason: collision with other inner class name */
        public enum C13839zza implements zzrg {
            PLACES(1),
            ENGINE_STATS(2),
            USER_CONFIG(3),
            PLACE_INFERENCE(4),
            FLP(5),
            GEOCODER_STATS(6),
            DIALOGS(7),
            CHRE(8),
            FOP(9),
            GEOFENCER(10),
            RE_UP(11),
            NANOAPP(12),
            EMERGENCY_ALERT(13),
            BLUEPIXEL(14);
            
            private static final zzrf<C13839zza> zzo = null;
            private final int zzp;

            static {
                zzo = new zzhv();
            }

            private C13839zza(int i) {
                this.zzp = i;
            }

            public static zzri zzb() {
                return zzhu.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(C13839zza.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.zzp);
                sb.append(" name=");
                sb.append(name());
                sb.append('>');
                return sb.toString();
            }

            public final int zza() {
                return this.zzp;
            }
        }

        public static final class zzb extends com.google.android.libraries.places.internal.zzrb.zzb<zza, zzb> implements zzso {
            private zzb() {
                super(zza.zzt);
            }

            public final zzb zza(C13839zza zza) {
                zzb();
                ((zza) this.zza).zza(zza);
                return this;
            }

            /* synthetic */ zzb(zzht zzht) {
                this();
            }

            public final zzb zza(zzs zzs) {
                zzb();
                ((zza) this.zza).zza(zzs);
                return this;
            }
        }

        static {
            zza zza = new zza();
            zzt = zza;
            zzrb.zza(zza.class, zza);
        }

        private zza() {
        }

        /* access modifiers changed from: private */
        public final void zza(C13839zza zza) {
            if (zza != null) {
                this.zzc |= 1;
                this.zzd = zza.zza();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zza(zzs zzs2) {
            if (zzs2 != null) {
                this.zze = zzs2;
                this.zzc |= 2;
                return;
            }
            throw new NullPointerException();
        }

        public static zzb zza() {
            return (zzb) zzt.zzf();
        }

        /* JADX WARNING: type inference failed for: r3v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzhr$zza>] */
        /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzhr$zza>] */
        /* JADX WARNING: type inference failed for: r3v13 */
        /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzhr$zza>, com.google.android.libraries.places.internal.zzrb$zza] */
        /* JADX WARNING: type inference failed for: r3v19 */
        /* JADX WARNING: type inference failed for: r3v20 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v13
          assigns: []
          uses: []
          mth insns count: 76
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
        public final java.lang.Object zza(int r3, java.lang.Object r4, java.lang.Object r5) {
            /*
                r2 = this;
                int[] r5 = com.google.android.libraries.places.internal.zzht.zza
                r0 = 1
                int r3 = r3 - r0
                r3 = r5[r3]
                r5 = 0
                r1 = 0
                switch(r3) {
                    case 1: goto L_0x00ae;
                    case 2: goto L_0x00a8;
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
                r2.zzs = r3
                return r1
            L_0x0019:
                byte r3 = r2.zzs
                java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
                return r3
            L_0x0020:
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzhr$zza> r3 = zzu
                if (r3 != 0) goto L_0x0039
                java.lang.Class<com.google.android.libraries.places.internal.zzhr$zza> r4 = com.google.android.libraries.places.internal.zzhr.zza.class
                monitor-enter(r4)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzhr$zza> r3 = zzu     // Catch:{ all -> 0x0036 }
                if (r3 != 0) goto L_0x0034
                com.google.android.libraries.places.internal.zzrb$zza r3 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x0036 }
                com.google.android.libraries.places.internal.zzhr$zza r5 = zzt     // Catch:{ all -> 0x0036 }
                r3.<init>(r5)     // Catch:{ all -> 0x0036 }
                zzu = r3     // Catch:{ all -> 0x0036 }
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
                com.google.android.libraries.places.internal.zzhr$zza r3 = zzt
                return r3
            L_0x003d:
                r3 = 17
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "zzc"
                r3[r5] = r4
                java.lang.String r4 = "zzd"
                r3[r0] = r4
                r4 = 2
                com.google.android.libraries.places.internal.zzri r5 = com.google.android.libraries.places.internal.zzhr.zza.C13839zza.zzb()
                r3[r4] = r5
                r4 = 3
                java.lang.String r5 = "zze"
                r3[r4] = r5
                r4 = 4
                java.lang.String r5 = "zzf"
                r3[r4] = r5
                r4 = 5
                java.lang.String r5 = "zzg"
                r3[r4] = r5
                r4 = 6
                java.lang.String r5 = "zzh"
                r3[r4] = r5
                r4 = 7
                java.lang.String r5 = "zzi"
                r3[r4] = r5
                r4 = 8
                java.lang.String r5 = "zzj"
                r3[r4] = r5
                r4 = 9
                java.lang.String r5 = "zzk"
                r3[r4] = r5
                r4 = 10
                java.lang.String r5 = "zzl"
                r3[r4] = r5
                r4 = 11
                java.lang.String r5 = "zzm"
                r3[r4] = r5
                r4 = 12
                java.lang.String r5 = "zzn"
                r3[r4] = r5
                r4 = 13
                java.lang.String r5 = "zzo"
                r3[r4] = r5
                r4 = 14
                java.lang.String r5 = "zzp"
                r3[r4] = r5
                r4 = 15
                java.lang.String r5 = "zzq"
                r3[r4] = r5
                r4 = 16
                java.lang.String r5 = "zzr"
                r3[r4] = r5
                com.google.android.libraries.places.internal.zzhr$zza r4 = zzt
                java.lang.String r5 = "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0001\u0001\f\u0000\u0002Љ\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\t\u0006\b\t\u0007\t\t\b\n\t\t\u000b\t\n\f\t\u000b\r\t\f\u000e\t\r\u000f\t\u000e"
                java.lang.Object r3 = com.google.android.libraries.places.internal.zzrb.zza(r4, r5, r3)
                return r3
            L_0x00a8:
                com.google.android.libraries.places.internal.zzhr$zza$zzb r3 = new com.google.android.libraries.places.internal.zzhr$zza$zzb
                r3.<init>(r1)
                return r3
            L_0x00ae:
                com.google.android.libraries.places.internal.zzhr$zza r3 = new com.google.android.libraries.places.internal.zzhr$zza
                r3.<init>()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzhr.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
