package com.google.android.libraries.places.internal;

import androidx.recyclerview.widget.RecyclerView.ItemAnimator;

public final class zzmm {

    public static final class zza extends zzrb<zza, C13864zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zza zzf;
        private static volatile zzsw<zza> zzg;
        private int zzc;
        private String zzd = "";
        private int zze;

        /* renamed from: com.google.android.libraries.places.internal.zzmm$zza$zza reason: collision with other inner class name */
        public static final class C13864zza extends com.google.android.libraries.places.internal.zzrb.zzb<zza, C13864zza> implements zzso {
            private C13864zza() {
                super(zza.zzf);
            }

            /* synthetic */ C13864zza(zzml zzml) {
                this();
            }
        }

        public enum zzb implements zzrg {
            UNKNOWN(0),
            CHAIN(1),
            TYPE(2);
            
            private static final zzrf<zzb> zzd = null;
            private final int zze;

            static {
                zzd = new zzmt();
            }

            private zzb(int i) {
                this.zze = i;
            }

            public static zzri zzb() {
                return zzmu.zza;
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

        static {
            zza zza = new zza();
            zzf = zza;
            zzrb.zza(zza.class, zza);
        }

        private zza() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zza>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zza>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zza>, com.google.android.libraries.places.internal.zzrb$zza] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zza> r2 = zzg
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zza> r3 = com.google.android.libraries.places.internal.zzmm.zza.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zza> r2 = zzg     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zza r4 = zzf     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zza r2 = zzf
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zza.zzb.zzb()
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzmm$zza r3 = zzf
                java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0054:
                com.google.android.libraries.places.internal.zzmm$zza$zza r2 = new com.google.android.libraries.places.internal.zzmm$zza$zza
                r2.<init>(r3)
                return r2
            L_0x005a:
                com.google.android.libraries.places.internal.zzmm$zza r2 = new com.google.android.libraries.places.internal.zzmm$zza
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzaa extends zzrb<zzaa, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzaa zzk;
        private static volatile zzsw<zzaa> zzl;
        private int zzc;
        private int zzd;
        private zzrm<String> zze = zzrb.zzk();
        private int zzf;
        private int zzg;
        private long zzh;
        private String zzi = "";
        private boolean zzj;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzaa, zza> implements zzso {
            private zza() {
                super(zzaa.zzk);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzaa zzaa = new zzaa();
            zzk = zzaa;
            zzrb.zza(zzaa.class, zzaa);
        }

        private zzaa() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzaa>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzaa>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzaa>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x007d;
                    case 2: goto L_0x0077;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzaa> r2 = zzl
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzaa> r3 = com.google.android.libraries.places.internal.zzmm.zzaa.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzaa> r2 = zzl     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzaa r4 = zzk     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzaa r2 = zzk
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzne.zzb()
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zzab.zzc.zzb()
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
                com.google.android.libraries.places.internal.zzmm$zzaa r3 = zzk
                java.lang.String r4 = "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\f\u0000\u0002\u001a\u0003\u0004\u0001\u0004\f\u0002\u0005\u0002\u0003\u0006\b\u0004\u0007\u0007\u0005"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0077:
                com.google.android.libraries.places.internal.zzmm$zzaa$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzaa$zza
                r2.<init>(r3)
                return r2
            L_0x007d:
                com.google.android.libraries.places.internal.zzmm$zzaa r2 = new com.google.android.libraries.places.internal.zzmm$zzaa
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzaa.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzab extends zzrb<zzab, zzb> implements zzso {
        /* access modifiers changed from: private */
        public static final zzab zzl;
        private static volatile zzsw<zzab> zzm;
        private int zzc;
        private zzh zzd;
        private int zze;
        private int zzf;
        private boolean zzg;
        private long zzh;
        private int zzi;
        private int zzj;
        private int zzk;

        public enum zza implements zzrg {
            TYPE_UNSPECIFIED(0),
            INVALID(-1),
            NO_POWER(100),
            HIGH_POWER(110);
            
            private static final zzrf<zza> zze = null;
            private final int zzf;

            static {
                zze = new zzow();
            }

            private zza(int i) {
                this.zzf = i;
            }

            public static zzri zzb() {
                return zzov.zza;
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

        public static final class zzb extends com.google.android.libraries.places.internal.zzrb.zzb<zzab, zzb> implements zzso {
            private zzb() {
                super(zzab.zzl);
            }

            /* synthetic */ zzb(zzml zzml) {
                this();
            }
        }

        public enum zzc implements zzrg {
            ADAPTIVE(0),
            FIXED_DEPRECATED(1),
            FIXED_MEDIUM(2),
            FIXED_LARGE(4);
            
            private static final zzrf<zzc> zze = null;
            private final int zzf;

            static {
                zze = new zzox();
            }

            private zzc(int i) {
                this.zzf = i;
            }

            public static zzri zzb() {
                return zzoy.zza;
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

        static {
            zzab zzab = new zzab();
            zzl = zzab;
            zzrb.zza(zzab.class, zzab);
        }

        private zzab() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzab>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzab>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzab>] */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
          assigns: []
          uses: []
          mth insns count: 62
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x0093;
                    case 2: goto L_0x008d;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzab> r2 = zzm
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzab> r3 = com.google.android.libraries.places.internal.zzmm.zzab.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzab> r2 = zzm     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzab r4 = zzl     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzab r2 = zzl
                return r2
            L_0x0033:
                r2 = 13
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzne.zzb()
                r2[r3] = r4
                r3 = 4
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                r3 = 5
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zzab.zzc.zzb()
                r2[r3] = r4
                r3 = 6
                java.lang.String r4 = "zzg"
                r2[r3] = r4
                r3 = 7
                java.lang.String r4 = "zzh"
                r2[r3] = r4
                r3 = 8
                java.lang.String r4 = "zzi"
                r2[r3] = r4
                r3 = 9
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zzab.zza.zzb()
                r2[r3] = r4
                r3 = 10
                java.lang.String r4 = "zzj"
                r2[r3] = r4
                r3 = 11
                java.lang.String r4 = "zzk"
                r2[r3] = r4
                r3 = 12
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmo.zzb()
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzmm$zzab r3 = zzl
                java.lang.String r4 = "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\f\u0002\u0004\u0007\u0003\u0005\u0002\u0004\u0006\f\u0005\u0007\u0004\u0006\b\f\u0007"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x008d:
                com.google.android.libraries.places.internal.zzmm$zzab$zzb r2 = new com.google.android.libraries.places.internal.zzmm$zzab$zzb
                r2.<init>(r3)
                return r2
            L_0x0093:
                com.google.android.libraries.places.internal.zzmm$zzab r2 = new com.google.android.libraries.places.internal.zzmm$zzab
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzab.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzac extends zzrb<zzac, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzac zzh;
        private static volatile zzsw<zzac> zzi;
        private int zzc;
        private zzrm<String> zzd = zzrb.zzk();
        private int zze;
        private String zzf = "";
        private boolean zzg;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzac, zza> implements zzso {
            private zza() {
                super(zzac.zzh);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzac zzac = new zzac();
            zzh = zzac;
            zzrb.zza(zzac.class, zzac);
        }

        private zzac() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzac>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzac>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzac>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x0064;
                    case 2: goto L_0x005e;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzac> r2 = zzi
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzac> r3 = com.google.android.libraries.places.internal.zzmm.zzac.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzac> r2 = zzi     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzac r4 = zzh     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzac r2 = zzh
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zzab.zzc.zzb()
                r2[r3] = r4
                r3 = 4
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                r3 = 5
                java.lang.String r4 = "zzg"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzmm$zzac r3 = zzh
                java.lang.String r4 = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002\f\u0000\u0003\b\u0001\u0004\u0007\u0002"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x005e:
                com.google.android.libraries.places.internal.zzmm$zzac$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzac$zza
                r2.<init>(r3)
                return r2
            L_0x0064:
                com.google.android.libraries.places.internal.zzmm$zzac r2 = new com.google.android.libraries.places.internal.zzmm$zzac
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzac.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzad extends zzrb<zzad, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzad zze;
        private static volatile zzsw<zzad> zzf;
        private int zzc;
        private int zzd;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzad, zza> implements zzso {
            private zza() {
                super(zzad.zze);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzad zzad = new zzad();
            zze = zzad;
            zzrb.zza(zzad.class, zzad);
        }

        private zzad() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzad>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzad>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzad>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzad> r2 = zzf
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzad> r3 = com.google.android.libraries.places.internal.zzmm.zzad.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzad> r2 = zzf     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzad r4 = zze     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzad r2 = zze
                return r2
            L_0x0033:
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                com.google.android.libraries.places.internal.zzmm$zzad r3 = zze
                java.lang.String r4 = "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004\u0000"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0048:
                com.google.android.libraries.places.internal.zzmm$zzad$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzad$zza
                r2.<init>(r3)
                return r2
            L_0x004e:
                com.google.android.libraries.places.internal.zzmm$zzad r2 = new com.google.android.libraries.places.internal.zzmm$zzad
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzad.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzae extends zzrb<zzae, zzb> implements zzso {
        /* access modifiers changed from: private */
        public static final zzae zzg;
        private static volatile zzsw<zzae> zzh;
        private int zzc;
        private int zzd;
        private int zze;
        private boolean zzf;

        public enum zza implements zzrg {
            PHOTO_METADATA(0),
            PHOTO_IMAGE(1);
            
            private static final zzrf<zza> zzc = null;
            private final int zzd;

            static {
                zzc = new zzpa();
            }

            private zza(int i) {
                this.zzd = i;
            }

            public static zzri zzb() {
                return zzoz.zza;
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

        public static final class zzb extends com.google.android.libraries.places.internal.zzrb.zzb<zzae, zzb> implements zzso {
            private zzb() {
                super(zzae.zzg);
            }

            public final zzb zza(zza zza) {
                zzb();
                ((zzae) this.zza).zza(zza);
                return this;
            }

            /* synthetic */ zzb(zzml zzml) {
                this();
            }
        }

        static {
            zzae zzae = new zzae();
            zzg = zzae;
            zzrb.zza(zzae.class, zzae);
        }

        private zzae() {
        }

        /* access modifiers changed from: private */
        public final void zza(zza zza2) {
            if (zza2 != null) {
                this.zzc |= 1;
                this.zzd = zza2.zza();
                return;
            }
            throw new NullPointerException();
        }

        public static zzb zza() {
            return (zzb) zzg.zzf();
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzae>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzae>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzae>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzae> r2 = zzh
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzae> r3 = com.google.android.libraries.places.internal.zzmm.zzae.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzae> r2 = zzh     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzae r4 = zzg     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzae r2 = zzg
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zzae.zza.zzb()
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zze"
                r2[r3] = r4
                r3 = 4
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzmm$zzae r3 = zzg
                java.lang.String r4 = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\u0007\u0002"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0059:
                com.google.android.libraries.places.internal.zzmm$zzae$zzb r2 = new com.google.android.libraries.places.internal.zzmm$zzae$zzb
                r2.<init>(r3)
                return r2
            L_0x005f:
                com.google.android.libraries.places.internal.zzmm$zzae r2 = new com.google.android.libraries.places.internal.zzmm$zzae
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzae.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzaf extends zzrb<zzaf, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzaf zzd;
        private static volatile zzsw<zzaf> zze;
        private zzrm<String> zzc = zzrb.zzk();

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzaf, zza> implements zzso {
            private zza() {
                super(zzaf.zzd);
            }

            public final zza zza(Iterable<String> iterable) {
                zzb();
                ((zzaf) this.zza).zza(iterable);
                return this;
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzaf zzaf = new zzaf();
            zzd = zzaf;
            zzrb.zza(zzaf.class, zzaf);
        }

        private zzaf() {
        }

        /* access modifiers changed from: private */
        public final void zza(Iterable<String> iterable) {
            if (!this.zzc.zza()) {
                this.zzc = zzrb.zza(this.zzc);
            }
            zzpu.zza(iterable, this.zzc);
        }

        public static zza zza() {
            return (zza) zzd.zzf();
        }

        /* JADX WARNING: type inference failed for: r1v8, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzaf>] */
        /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r1v11, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzaf>] */
        /* JADX WARNING: type inference failed for: r1v12 */
        /* JADX WARNING: type inference failed for: r1v13, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzaf>] */
        /* JADX WARNING: type inference failed for: r1v16 */
        /* JADX WARNING: type inference failed for: r1v17 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v12
          assigns: []
          uses: []
          mth insns count: 38
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
        public final java.lang.Object zza(int r1, java.lang.Object r2, java.lang.Object r3) {
            /*
                r0 = this;
                int[] r2 = com.google.android.libraries.places.internal.zzml.zza
                r3 = 1
                int r1 = r1 - r3
                r1 = r2[r1]
                r2 = 0
                switch(r1) {
                    case 1: goto L_0x0049;
                    case 2: goto L_0x0043;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzaf> r1 = zze
                if (r1 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzaf> r2 = com.google.android.libraries.places.internal.zzmm.zzaf.class
                monitor-enter(r2)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzaf> r1 = zze     // Catch:{ all -> 0x002c }
                if (r1 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r1 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzaf r3 = zzd     // Catch:{ all -> 0x002c }
                r1.<init>(r3)     // Catch:{ all -> 0x002c }
                zze = r1     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzaf r1 = zzd
                return r1
            L_0x0033:
                java.lang.Object[] r1 = new java.lang.Object[r3]
                r2 = 0
                java.lang.String r3 = "zzc"
                r1[r2] = r3
                com.google.android.libraries.places.internal.zzmm$zzaf r2 = zzd
                java.lang.String r3 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"
                java.lang.Object r1 = com.google.android.libraries.places.internal.zzrb.zza(r2, r3, r1)
                return r1
            L_0x0043:
                com.google.android.libraries.places.internal.zzmm$zzaf$zza r1 = new com.google.android.libraries.places.internal.zzmm$zzaf$zza
                r1.<init>(r2)
                return r1
            L_0x0049:
                com.google.android.libraries.places.internal.zzmm$zzaf r1 = new com.google.android.libraries.places.internal.zzmm$zzaf
                r1.<init>()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzaf.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzag extends zzrb<zzag, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzag zzg;
        private static volatile zzsw<zzag> zzh;
        private int zzc;
        private int zzd;
        private long zze;
        private int zzf;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzag, zza> implements zzso {
            private zza() {
                super(zzag.zzg);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        public enum zzb implements zzrg {
            INVALID(0),
            HIGH_POWER(1),
            BALANCED_POWER(2),
            LOW_POWER(3),
            NO_POWER(4);
            
            private static final zzrf<zzb> zzf = null;
            private final int zzg;

            static {
                zzf = new zzpb();
            }

            private zzb(int i) {
                this.zzg = i;
            }

            public static zzri zzb() {
                return zzpc.zza;
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

        static {
            zzag zzag = new zzag();
            zzg = zzag;
            zzrb.zza(zzag.class, zzag);
        }

        private zzag() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzag>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzag>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzag>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x0066;
                    case 2: goto L_0x0060;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzag> r2 = zzh
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzag> r3 = com.google.android.libraries.places.internal.zzmm.zzag.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzag> r2 = zzh     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzag r4 = zzg     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzag r2 = zzg
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zzag.zzb.zzb()
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zze"
                r2[r3] = r4
                r3 = 4
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                r3 = 5
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmo.zzb()
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzmm$zzag r3 = zzg
                java.lang.String r4 = "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\b\f\u0002"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0060:
                com.google.android.libraries.places.internal.zzmm$zzag$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzag$zza
                r2.<init>(r3)
                return r2
            L_0x0066:
                com.google.android.libraries.places.internal.zzmm$zzag r2 = new com.google.android.libraries.places.internal.zzmm$zzag
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzag.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzah extends zzrb<zzah, zzb> implements zzso {
        /* access modifiers changed from: private */
        public static final zzah zzx;
        private static volatile zzsw<zzah> zzy;
        private int zzc;
        private int zzd;
        private String zze;
        private String zzf;
        private zzk zzg;
        private zzal zzh;
        private zzw zzi;
        private zzn zzj;
        private zzv zzk;
        private zzo zzl;
        private zzu zzm;
        private zzam zzn;
        private zzam zzo;
        private zzx zzp;
        private zzr zzq;
        private zzai zzr;
        private zzaj zzs;
        private zzad zzt;
        private zzz zzu;
        private zzak zzv;
        private byte zzw = 2;

        public enum zza implements zzrg {
            UNKNOWN(0),
            SEARCH(1),
            BY_LATLNG(2),
            ADD_A_PLACE(3),
            BY_ID(4),
            AUTOCOMPLETE(5),
            GET_ALIASES(6),
            SET_ALIAS(7),
            GET_BY_LOCATION(8),
            DELETE_ALIAS(9),
            SEARCH_BY_BEACON(10),
            SEARCH_BY_CHAIN(11),
            NEARBY_ALERTS_RADIUS_REQUEST(12),
            GET_USER_PLACES(13),
            SEARCH_BY_CLIENT(14);
            
            private static final zzrf<zza> zzp = null;
            private final int zzq;

            static {
                zzp = new zzpe();
            }

            private zza(int i) {
                this.zzq = i;
            }

            public static zzri zzb() {
                return zzpd.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zza.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.zzq);
                sb.append(" name=");
                sb.append(name());
                sb.append('>');
                return sb.toString();
            }

            public final int zza() {
                return this.zzq;
            }
        }

        public static final class zzb extends com.google.android.libraries.places.internal.zzrb.zzb<zzah, zzb> implements zzso {
            private zzb() {
                super(zzah.zzx);
            }

            public final zzb zza(zza zza) {
                zzb();
                ((zzah) this.zza).zza(zza);
                return this;
            }

            public final zzb zzb(String str) {
                zzb();
                ((zzah) this.zza).zzb(str);
                return this;
            }

            /* synthetic */ zzb(zzml zzml) {
                this();
            }

            public final zzb zza(String str) {
                zzb();
                ((zzah) this.zza).zza(str);
                return this;
            }

            public final zzb zza(zzv zzv) {
                zzb();
                ((zzah) this.zza).zza(zzv);
                return this;
            }

            public final zzb zza(zzo zzo) {
                zzb();
                ((zzah) this.zza).zza(zzo);
                return this;
            }
        }

        static {
            zzah zzah = new zzah();
            zzx = zzah;
            zzrb.zza(zzah.class, zzah);
        }

        private zzah() {
            String str = "";
            this.zze = str;
            this.zzf = str;
        }

        /* access modifiers changed from: private */
        public final void zza(zza zza2) {
            if (zza2 != null) {
                this.zzc |= 1;
                this.zzd = zza2.zza();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zzb(String str) {
            if (str != null) {
                this.zzc |= 4;
                this.zzf = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zza(String str) {
            if (str != null) {
                this.zzc |= 2;
                this.zze = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zza(zzv zzv2) {
            if (zzv2 != null) {
                this.zzk = zzv2;
                this.zzc |= 128;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zza(zzo zzo2) {
            if (zzo2 != null) {
                this.zzl = zzo2;
                this.zzc |= 256;
                return;
            }
            throw new NullPointerException();
        }

        public static zzb zza() {
            return (zzb) zzx.zzf();
        }

        /* JADX WARNING: type inference failed for: r3v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzah>] */
        /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzah>] */
        /* JADX WARNING: type inference failed for: r3v13 */
        /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzah>] */
        /* JADX WARNING: type inference failed for: r3v19 */
        /* JADX WARNING: type inference failed for: r3v20 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v13
          assigns: []
          uses: []
          mth insns count: 84
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
                int[] r5 = com.google.android.libraries.places.internal.zzml.zza
                r0 = 1
                int r3 = r3 - r0
                r3 = r5[r3]
                r5 = 0
                r1 = 0
                switch(r3) {
                    case 1: goto L_0x00c6;
                    case 2: goto L_0x00c0;
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
                r2.zzw = r3
                return r1
            L_0x0019:
                byte r3 = r2.zzw
                java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
                return r3
            L_0x0020:
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzah> r3 = zzy
                if (r3 != 0) goto L_0x0039
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzah> r4 = com.google.android.libraries.places.internal.zzmm.zzah.class
                monitor-enter(r4)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzah> r3 = zzy     // Catch:{ all -> 0x0036 }
                if (r3 != 0) goto L_0x0034
                com.google.android.libraries.places.internal.zzrb$zza r3 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x0036 }
                com.google.android.libraries.places.internal.zzmm$zzah r5 = zzx     // Catch:{ all -> 0x0036 }
                r3.<init>(r5)     // Catch:{ all -> 0x0036 }
                zzy = r3     // Catch:{ all -> 0x0036 }
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
                com.google.android.libraries.places.internal.zzmm$zzah r3 = zzx
                return r3
            L_0x003d:
                r3 = 21
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "zzc"
                r3[r5] = r4
                java.lang.String r4 = "zzd"
                r3[r0] = r4
                r4 = 2
                com.google.android.libraries.places.internal.zzri r5 = com.google.android.libraries.places.internal.zzmm.zzah.zza.zzb()
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
                java.lang.String r5 = "zzo"
                r3[r4] = r5
                r4 = 13
                java.lang.String r5 = "zzn"
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
                r4 = 17
                java.lang.String r5 = "zzs"
                r3[r4] = r5
                r4 = 18
                java.lang.String r5 = "zzt"
                r3[r4] = r5
                r4 = 19
                java.lang.String r5 = "zzu"
                r3[r4] = r5
                r4 = 20
                java.lang.String r5 = "zzv"
                r3[r4] = r5
                com.google.android.libraries.places.internal.zzmm$zzah r4 = zzx
                java.lang.String r5 = "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0004\u0001\f\u0000\u0002\b\u0001\u0003\b\u0002\u0004\t\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\b\t\u0007\tЉ\b\n\t\t\u000b\t\u000b\f\t\n\r\t\f\u000e\t\r\u000f\t\u000e\u0010\t\u000f\u0011\t\u0010\u0012\t\u0011\u0013\t\u0012"
                java.lang.Object r3 = com.google.android.libraries.places.internal.zzrb.zza(r4, r5, r3)
                return r3
            L_0x00c0:
                com.google.android.libraries.places.internal.zzmm$zzah$zzb r3 = new com.google.android.libraries.places.internal.zzmm$zzah$zzb
                r3.<init>(r1)
                return r3
            L_0x00c6:
                com.google.android.libraries.places.internal.zzmm$zzah r3 = new com.google.android.libraries.places.internal.zzmm$zzah
                r3.<init>()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzah.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzai extends zzrb<zzai, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzai zze;
        private static volatile zzsw<zzai> zzf;
        private int zzc;
        private int zzd;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzai, zza> implements zzso {
            private zza() {
                super(zzai.zze);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzai zzai = new zzai();
            zze = zzai;
            zzrb.zza(zzai.class, zzai);
        }

        private zzai() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzai>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzai>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzai>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzai> r2 = zzf
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzai> r3 = com.google.android.libraries.places.internal.zzmm.zzai.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzai> r2 = zzf     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzai r4 = zze     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzai r2 = zze
                return r2
            L_0x0033:
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                com.google.android.libraries.places.internal.zzmm$zzai r3 = zze
                java.lang.String r4 = "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b\u0000"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0048:
                com.google.android.libraries.places.internal.zzmm$zzai$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzai$zza
                r2.<init>(r3)
                return r2
            L_0x004e:
                com.google.android.libraries.places.internal.zzmm$zzai r2 = new com.google.android.libraries.places.internal.zzmm$zzai
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzai.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzaj extends zzrb<zzaj, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzaj zzd;
        private static volatile zzsw<zzaj> zze;
        private zzrm<String> zzc = zzrb.zzk();

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzaj, zza> implements zzso {
            private zza() {
                super(zzaj.zzd);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzaj zzaj = new zzaj();
            zzd = zzaj;
            zzrb.zza(zzaj.class, zzaj);
        }

        private zzaj() {
        }

        /* JADX WARNING: type inference failed for: r1v8, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzaj>] */
        /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r1v11, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzaj>] */
        /* JADX WARNING: type inference failed for: r1v12 */
        /* JADX WARNING: type inference failed for: r1v13, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzaj>, com.google.android.libraries.places.internal.zzrb$zza] */
        /* JADX WARNING: type inference failed for: r1v16 */
        /* JADX WARNING: type inference failed for: r1v17 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v12
          assigns: []
          uses: []
          mth insns count: 38
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
        public final java.lang.Object zza(int r1, java.lang.Object r2, java.lang.Object r3) {
            /*
                r0 = this;
                int[] r2 = com.google.android.libraries.places.internal.zzml.zza
                r3 = 1
                int r1 = r1 - r3
                r1 = r2[r1]
                r2 = 0
                switch(r1) {
                    case 1: goto L_0x0049;
                    case 2: goto L_0x0043;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzaj> r1 = zze
                if (r1 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzaj> r2 = com.google.android.libraries.places.internal.zzmm.zzaj.class
                monitor-enter(r2)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzaj> r1 = zze     // Catch:{ all -> 0x002c }
                if (r1 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r1 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzaj r3 = zzd     // Catch:{ all -> 0x002c }
                r1.<init>(r3)     // Catch:{ all -> 0x002c }
                zze = r1     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzaj r1 = zzd
                return r1
            L_0x0033:
                java.lang.Object[] r1 = new java.lang.Object[r3]
                r2 = 0
                java.lang.String r3 = "zzc"
                r1[r2] = r3
                com.google.android.libraries.places.internal.zzmm$zzaj r2 = zzd
                java.lang.String r3 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"
                java.lang.Object r1 = com.google.android.libraries.places.internal.zzrb.zza(r2, r3, r1)
                return r1
            L_0x0043:
                com.google.android.libraries.places.internal.zzmm$zzaj$zza r1 = new com.google.android.libraries.places.internal.zzmm$zzaj$zza
                r1.<init>(r2)
                return r1
            L_0x0049:
                com.google.android.libraries.places.internal.zzmm$zzaj r1 = new com.google.android.libraries.places.internal.zzmm$zzaj
                r1.<init>()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzaj.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzak extends zzrb<zzak, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzak zze;
        private static volatile zzsw<zzak> zzf;
        private zzrm<String> zzc = zzrb.zzk();
        private zzrm<zza> zzd = zzrb.zzk();

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzak, zza> implements zzso {
            private zza() {
                super(zzak.zze);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzak zzak = new zzak();
            zze = zzak;
            zzrb.zza(zzak.class, zzak);
        }

        private zzak() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzak>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzak>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzak>, com.google.android.libraries.places.internal.zzrb$zza] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzak> r2 = zzf
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzak> r3 = com.google.android.libraries.places.internal.zzmm.zzak.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzak> r2 = zzf     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzak r4 = zze     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzak r2 = zze
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
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zza> r4 = com.google.android.libraries.places.internal.zzmm.zza.class
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzmm$zzak r3 = zze
                java.lang.String r4 = "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001b"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x004d:
                com.google.android.libraries.places.internal.zzmm$zzak$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzak$zza
                r2.<init>(r3)
                return r2
            L_0x0053:
                com.google.android.libraries.places.internal.zzmm$zzak r2 = new com.google.android.libraries.places.internal.zzmm$zzak
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzak.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzal extends zzrb<zzal, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzal zzj;
        private static volatile zzsw<zzal> zzk;
        private int zzc;
        private com.google.android.libraries.places.internal.zzjt.zzb zzd;
        private int zze;
        private int zzf;
        private String zzg = "";
        private int zzh;
        private byte zzi = 2;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzal, zza> implements zzso {
            private zza() {
                super(zzal.zzj);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        public enum zzb implements zzrg {
            UNKNOWN(0),
            NEARBY_ALERTS(1),
            GEO_DATA_API(2);
            
            private static final zzrf<zzb> zzd = null;
            private final int zze;

            static {
                zzd = new zzpf();
            }

            private zzb(int i) {
                this.zze = i;
            }

            public static zzri zzb() {
                return zzpg.zza;
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

        static {
            zzal zzal = new zzal();
            zzj = zzal;
            zzrb.zza(zzal.class, zzal);
        }

        private zzal() {
        }

        /* JADX WARNING: type inference failed for: r3v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzal>] */
        /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzal>] */
        /* JADX WARNING: type inference failed for: r3v13 */
        /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzal>, com.google.android.libraries.places.internal.zzrb$zza] */
        /* JADX WARNING: type inference failed for: r3v19 */
        /* JADX WARNING: type inference failed for: r3v20 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v13
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
                int[] r5 = com.google.android.libraries.places.internal.zzml.zza
                r0 = 1
                int r3 = r3 - r0
                r3 = r5[r3]
                r5 = 0
                r1 = 0
                switch(r3) {
                    case 1: goto L_0x0072;
                    case 2: goto L_0x006c;
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
                r2.zzi = r3
                return r1
            L_0x0019:
                byte r3 = r2.zzi
                java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
                return r3
            L_0x0020:
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzal> r3 = zzk
                if (r3 != 0) goto L_0x0039
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzal> r4 = com.google.android.libraries.places.internal.zzmm.zzal.class
                monitor-enter(r4)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzal> r3 = zzk     // Catch:{ all -> 0x0036 }
                if (r3 != 0) goto L_0x0034
                com.google.android.libraries.places.internal.zzrb$zza r3 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x0036 }
                com.google.android.libraries.places.internal.zzmm$zzal r5 = zzj     // Catch:{ all -> 0x0036 }
                r3.<init>(r5)     // Catch:{ all -> 0x0036 }
                zzk = r3     // Catch:{ all -> 0x0036 }
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
                com.google.android.libraries.places.internal.zzmm$zzal r3 = zzj
                return r3
            L_0x003d:
                r3 = 7
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "zzc"
                r3[r5] = r4
                java.lang.String r4 = "zzd"
                r3[r0] = r4
                r4 = 2
                java.lang.String r5 = "zze"
                r3[r4] = r5
                r4 = 3
                java.lang.String r5 = "zzf"
                r3[r4] = r5
                r4 = 4
                java.lang.String r5 = "zzg"
                r3[r4] = r5
                r4 = 5
                java.lang.String r5 = "zzh"
                r3[r4] = r5
                r4 = 6
                com.google.android.libraries.places.internal.zzri r5 = com.google.android.libraries.places.internal.zzmm.zzal.zzb.zzb()
                r3[r4] = r5
                com.google.android.libraries.places.internal.zzmm$zzal r4 = zzj
                java.lang.String r5 = "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001Љ\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\b\u0003\u0005\f\u0004"
                java.lang.Object r3 = com.google.android.libraries.places.internal.zzrb.zza(r4, r5, r3)
                return r3
            L_0x006c:
                com.google.android.libraries.places.internal.zzmm$zzal$zza r3 = new com.google.android.libraries.places.internal.zzmm$zzal$zza
                r3.<init>(r1)
                return r3
            L_0x0072:
                com.google.android.libraries.places.internal.zzmm$zzal r3 = new com.google.android.libraries.places.internal.zzmm$zzal
                r3.<init>()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzal.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzam extends zzrb<zzam, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzam zzg;
        private static volatile zzsw<zzam> zzh;
        private int zzc;
        private int zzd;
        private String zze;
        private String zzf;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzam, zza> implements zzso {
            private zza() {
                super(zzam.zzg);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzam zzam = new zzam();
            zzg = zzam;
            zzrb.zza(zzam.class, zzam);
        }

        private zzam() {
            String str = "";
            this.zze = str;
            this.zzf = str;
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzam>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzam>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzam>, com.google.android.libraries.places.internal.zzrb$zza] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzam> r2 = zzh
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzam> r3 = com.google.android.libraries.places.internal.zzmm.zzam.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzam> r2 = zzh     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzam r4 = zzg     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzam r2 = zzg
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmp.zzb()
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zze"
                r2[r3] = r4
                r3 = 4
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzmm$zzam r3 = zzg
                java.lang.String r4 = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\b\u0002"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0059:
                com.google.android.libraries.places.internal.zzmm$zzam$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzam$zza
                r2.<init>(r3)
                return r2
            L_0x005f:
                com.google.android.libraries.places.internal.zzmm$zzam r2 = new com.google.android.libraries.places.internal.zzmm$zzam
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzam.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzan extends zzrb<zzan, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzan zzf;
        private static volatile zzsw<zzan> zzg;
        private int zzc;
        private boolean zzd;
        private int zze;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzan, zza> implements zzso {
            private zza() {
                super(zzan.zzf);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzan zzan = new zzan();
            zzf = zzan;
            zzrb.zza(zzan.class, zzan);
        }

        private zzan() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzan>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzan>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzan>, com.google.android.libraries.places.internal.zzrb$zza] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzan> r2 = zzg
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzan> r3 = com.google.android.libraries.places.internal.zzmm.zzan.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzan> r2 = zzg     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzan r4 = zzf     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzan r2 = zzf
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
                com.google.android.libraries.places.internal.zzmm$zzan r3 = zzf
                java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0004\u0001"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x004d:
                com.google.android.libraries.places.internal.zzmm$zzan$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzan$zza
                r2.<init>(r3)
                return r2
            L_0x0053:
                com.google.android.libraries.places.internal.zzmm$zzan r2 = new com.google.android.libraries.places.internal.zzmm$zzan
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzan.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzao extends zzrb<zzao, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzao zzf;
        private static volatile zzsw<zzao> zzg;
        private int zzc;
        private int zzd;
        private int zze;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzao, zza> implements zzso {
            private zza() {
                super(zzao.zzf);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzao zzao = new zzao();
            zzf = zzao;
            zzrb.zza(zzao.class, zzao);
        }

        private zzao() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzao>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzao>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzao>, com.google.android.libraries.places.internal.zzrb$zza] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzao> r2 = zzg
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzao> r3 = com.google.android.libraries.places.internal.zzmm.zzao.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzao> r2 = zzg     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzao r4 = zzf     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzao r2 = zzf
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
                com.google.android.libraries.places.internal.zzmm$zzao r3 = zzf
                java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x004d:
                com.google.android.libraries.places.internal.zzmm$zzao$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzao$zza
                r2.<init>(r3)
                return r2
            L_0x0053:
                com.google.android.libraries.places.internal.zzmm$zzao r2 = new com.google.android.libraries.places.internal.zzmm$zzao
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzao.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzap extends zzrb<zzap, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzap zzg;
        private static volatile zzsw<zzap> zzh;
        private int zzc;
        private int zzd;
        private zzrm<String> zze = zzrb.zzk();
        private zzrm<zzaq> zzf = zzrb.zzk();

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzap, zza> implements zzso {
            private zza() {
                super(zzap.zzg);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzap zzap = new zzap();
            zzg = zzap;
            zzrb.zza(zzap.class, zzap);
        }

        private zzap() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzap>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzap>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzap>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzap> r2 = zzh
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzap> r3 = com.google.android.libraries.places.internal.zzmm.zzap.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzap> r2 = zzh     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzap r4 = zzg     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzap r2 = zzg
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
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzaq> r4 = com.google.android.libraries.places.internal.zzmm.zzaq.class
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzmm$zzap r3 = zzg
                java.lang.String r4 = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0004\u0000\u0002\u001a\u0003\u001b"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0057:
                com.google.android.libraries.places.internal.zzmm$zzap$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzap$zza
                r2.<init>(r3)
                return r2
            L_0x005d:
                com.google.android.libraries.places.internal.zzmm$zzap r2 = new com.google.android.libraries.places.internal.zzmm$zzap
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzap.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzaq extends zzrb<zzaq, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzaq zzf;
        private static volatile zzsw<zzaq> zzg;
        private int zzc;
        private String zzd = "";
        private int zze;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzaq, zza> implements zzso {
            private zza() {
                super(zzaq.zzf);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzaq zzaq = new zzaq();
            zzf = zzaq;
            zzrb.zza(zzaq.class, zzaq);
        }

        private zzaq() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzaq>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzaq>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzaq>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzaq> r2 = zzg
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzaq> r3 = com.google.android.libraries.places.internal.zzmm.zzaq.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzaq> r2 = zzg     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzaq r4 = zzf     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzaq r2 = zzf
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
                com.google.android.libraries.places.internal.zzmm$zzaq r3 = zzf
                java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x004d:
                com.google.android.libraries.places.internal.zzmm$zzaq$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzaq$zza
                r2.<init>(r3)
                return r2
            L_0x0053:
                com.google.android.libraries.places.internal.zzmm$zzaq r2 = new com.google.android.libraries.places.internal.zzmm$zzaq
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzaq.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzar extends zzrb<zzar, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzar zzh;
        private static volatile zzsw<zzar> zzi;
        private int zzc;
        private int zzd;
        private zzrm<String> zze = zzrb.zzk();
        private zzrm<zzas> zzf = zzrb.zzk();
        private zzrm<zza> zzg = zzrb.zzk();

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzar, zza> implements zzso {
            private zza() {
                super(zzar.zzh);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzar zzar = new zzar();
            zzh = zzar;
            zzrb.zza(zzar.class, zzar);
        }

        private zzar() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzar>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzar>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzar>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzar> r2 = zzi
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzar> r3 = com.google.android.libraries.places.internal.zzmm.zzar.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzar> r2 = zzi     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzar r4 = zzh     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzar r2 = zzh
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
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzas> r4 = com.google.android.libraries.places.internal.zzmm.zzas.class
                r2[r3] = r4
                r3 = 5
                java.lang.String r4 = "zzg"
                r2[r3] = r4
                r3 = 6
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zza> r4 = com.google.android.libraries.places.internal.zzmm.zza.class
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzmm$zzar r3 = zzh
                java.lang.String r4 = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u0004\u0000\u0002\u001a\u0003\u001b\u0004\u001b"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0061:
                com.google.android.libraries.places.internal.zzmm$zzar$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzar$zza
                r2.<init>(r3)
                return r2
            L_0x0067:
                com.google.android.libraries.places.internal.zzmm$zzar r2 = new com.google.android.libraries.places.internal.zzmm$zzar
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzar.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzas extends zzrb<zzas, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzas zzf;
        private static volatile zzsw<zzas> zzg;
        private int zzc;
        private String zzd = "";
        private int zze;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzas, zza> implements zzso {
            private zza() {
                super(zzas.zzf);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzas zzas = new zzas();
            zzf = zzas;
            zzrb.zza(zzas.class, zzas);
        }

        private zzas() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzas>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzas>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzas>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzas> r2 = zzg
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzas> r3 = com.google.android.libraries.places.internal.zzmm.zzas.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzas> r2 = zzg     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzas r4 = zzf     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzas r2 = zzf
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
                com.google.android.libraries.places.internal.zzmm$zzas r3 = zzf
                java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x004d:
                com.google.android.libraries.places.internal.zzmm$zzas$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzas$zza
                r2.<init>(r3)
                return r2
            L_0x0053:
                com.google.android.libraries.places.internal.zzmm$zzas r2 = new com.google.android.libraries.places.internal.zzmm$zzas
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzas.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzat extends zzrb<zzat, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzat zzf;
        private static volatile zzsw<zzat> zzg;
        private int zzc;
        private int zzd;
        private int zze;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzat, zza> implements zzso {
            private zza() {
                super(zzat.zzf);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzat zzat = new zzat();
            zzf = zzat;
            zzrb.zza(zzat.class, zzat);
        }

        private zzat() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzat>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzat>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzat>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzat> r2 = zzg
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzat> r3 = com.google.android.libraries.places.internal.zzmm.zzat.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzat> r2 = zzg     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzat r4 = zzf     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzat r2 = zzf
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
                com.google.android.libraries.places.internal.zzmm$zzat r3 = zzf
                java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x004d:
                com.google.android.libraries.places.internal.zzmm$zzat$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzat$zza
                r2.<init>(r3)
                return r2
            L_0x0053:
                com.google.android.libraries.places.internal.zzmm$zzat r2 = new com.google.android.libraries.places.internal.zzmm$zzat
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzat.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzau extends zzrb<zzau, zzb> implements zzso {
        /* access modifiers changed from: private */
        public static final zzau zzf;
        private static volatile zzsw<zzau> zzg;
        private int zzc;
        private int zzd;
        private zzan zze;

        public enum zza implements zzrg {
            UNKNOWN(0),
            SEMANTIC_LOCATION_EVENTS_REGISTER(1),
            SEMANTIC_LOCATION_EVENTS_UNREGISTER(2),
            SEMANTIC_LOCATION_UPDATES_REGISTER(3),
            SEMANTIC_LOCATION_UPDATES_UNREGISTER(4),
            LAST_KNOWN_SEMANTIC_LOCATION(5),
            REPORT_CHECKIN(6);
            
            private static final zzrf<zza> zzh = null;
            private final int zzi;

            static {
                zzh = new zzpi();
            }

            private zza(int i) {
                this.zzi = i;
            }

            public static zzri zzb() {
                return zzph.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zza.class.getName());
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

        public static final class zzb extends com.google.android.libraries.places.internal.zzrb.zzb<zzau, zzb> implements zzso {
            private zzb() {
                super(zzau.zzf);
            }

            /* synthetic */ zzb(zzml zzml) {
                this();
            }
        }

        static {
            zzau zzau = new zzau();
            zzf = zzau;
            zzrb.zza(zzau.class, zzau);
        }

        private zzau() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzau>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzau>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzau>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzau> r2 = zzg
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzau> r3 = com.google.android.libraries.places.internal.zzmm.zzau.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzau> r2 = zzg     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzau r4 = zzf     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzau r2 = zzf
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zzau.zza.zzb()
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zze"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzmm$zzau r3 = zzf
                java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0054:
                com.google.android.libraries.places.internal.zzmm$zzau$zzb r2 = new com.google.android.libraries.places.internal.zzmm$zzau$zzb
                r2.<init>(r3)
                return r2
            L_0x005a:
                com.google.android.libraries.places.internal.zzmm$zzau r2 = new com.google.android.libraries.places.internal.zzmm$zzau
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzau.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzb extends zzrb<zzb, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzb zze;
        private static volatile zzsw<zzb> zzf;
        private int zzc;
        private int zzd;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzb, zza> implements zzso {
            private zza() {
                super(zzb.zze);
            }

            public final zza zza(int i) {
                zzb();
                ((zzb) this.zza).zzb(i);
                return this;
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzb zzb = new zzb();
            zze = zzb;
            zzrb.zza(zzb.class, zzb);
        }

        private zzb() {
        }

        public static zza zza() {
            return (zza) zze.zzf();
        }

        /* access modifiers changed from: private */
        public final void zzb(int i) {
            this.zzc |= 1;
            this.zzd = i;
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzb>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzb>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzb>, com.google.android.libraries.places.internal.zzrb$zza] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzb> r2 = zzf
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzb> r3 = com.google.android.libraries.places.internal.zzmm.zzb.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzb> r2 = zzf     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzb r4 = zze     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzb r2 = zze
                return r2
            L_0x0033:
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                com.google.android.libraries.places.internal.zzmm$zzb r3 = zze
                java.lang.String r4 = "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004\u0000"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0048:
                com.google.android.libraries.places.internal.zzmm$zzb$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzb$zza
                r2.<init>(r3)
                return r2
            L_0x004e:
                com.google.android.libraries.places.internal.zzmm$zzb r2 = new com.google.android.libraries.places.internal.zzmm$zzb
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzb.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzc extends zzrb<zzc, zzb> implements zzso {
        private static final zzrk<Integer, zza> zze = new zzmy();
        /* access modifiers changed from: private */
        public static final zzc zzg;
        private static volatile zzsw<zzc> zzh;
        private int zzc;
        private zzrh zzd = zzrb.zzi();
        private int zzf;

        public enum zza implements zzrg {
            UNKNOWN(0),
            HOME(1),
            WORK(2),
            NICKNAME(3),
            INFERRED_HOME(4),
            INFERRED_WORK(5);
            
            private static final zzrf<zza> zzg = null;
            private final int zzh;

            static {
                zzg = new zzmz();
            }

            private zza(int i) {
                this.zzh = i;
            }

            public static zzri zzb() {
                return zzna.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zza.class.getName());
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

        public static final class zzb extends com.google.android.libraries.places.internal.zzrb.zzb<zzc, zzb> implements zzso {
            private zzb() {
                super(zzc.zzg);
            }

            /* synthetic */ zzb(zzml zzml) {
                this();
            }
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.libraries.places.internal.zzmy, com.google.android.libraries.places.internal.zzrk<java.lang.Integer, com.google.android.libraries.places.internal.zzmm$zzc$zza>] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [com.google.android.libraries.places.internal.zzmy, com.google.android.libraries.places.internal.zzrk<java.lang.Integer, com.google.android.libraries.places.internal.zzmm$zzc$zza>]
          assigns: [com.google.android.libraries.places.internal.zzmy]
          uses: [com.google.android.libraries.places.internal.zzrk<java.lang.Integer, com.google.android.libraries.places.internal.zzmm$zzc$zza>]
          mth insns count: 7
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
        /* JADX WARNING: Unknown variable types count: 1 */
        static {
            /*
                com.google.android.libraries.places.internal.zzmy r0 = new com.google.android.libraries.places.internal.zzmy
                r0.<init>()
                zze = r0
                com.google.android.libraries.places.internal.zzmm$zzc r0 = new com.google.android.libraries.places.internal.zzmm$zzc
                r0.<init>()
                zzg = r0
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzc> r1 = com.google.android.libraries.places.internal.zzmm.zzc.class
                com.google.android.libraries.places.internal.zzrb.zza(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzc.<clinit>():void");
        }

        private zzc() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzc>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzc>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzc>, com.google.android.libraries.places.internal.zzrb$zza] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzc> r2 = zzh
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzc> r3 = com.google.android.libraries.places.internal.zzmm.zzc.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzc> r2 = zzh     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzc r4 = zzg     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzc r2 = zzg
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zzc.zza.zzb()
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzmm$zzc r3 = zzg
                java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001e\u0002\u0004\u0000"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0054:
                com.google.android.libraries.places.internal.zzmm$zzc$zzb r2 = new com.google.android.libraries.places.internal.zzmm$zzc$zzb
                r2.<init>(r3)
                return r2
            L_0x005a:
                com.google.android.libraries.places.internal.zzmm$zzc r2 = new com.google.android.libraries.places.internal.zzmm$zzc
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzc.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzd extends zzrb<zzd, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzd zze;
        private static volatile zzsw<zzd> zzf;
        private int zzc;
        private int zzd;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzd, zza> implements zzso {
            private zza() {
                super(zzd.zze);
            }

            public final zza zza(int i) {
                zzb();
                ((zzd) this.zza).zzb(i);
                return this;
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzd zzd2 = new zzd();
            zze = zzd2;
            zzrb.zza(zzd.class, zzd2);
        }

        private zzd() {
        }

        public static zza zza() {
            return (zza) zze.zzf();
        }

        /* access modifiers changed from: private */
        public final void zzb(int i) {
            this.zzc |= 1;
            this.zzd = i;
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzd>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzd>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzd>, com.google.android.libraries.places.internal.zzrb$zza] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzd> r2 = zzf
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzd> r3 = com.google.android.libraries.places.internal.zzmm.zzd.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzd> r2 = zzf     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzd r4 = zze     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzd r2 = zze
                return r2
            L_0x0033:
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                com.google.android.libraries.places.internal.zzmm$zzd r3 = zze
                java.lang.String r4 = "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004\u0000"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0048:
                com.google.android.libraries.places.internal.zzmm$zzd$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzd$zza
                r2.<init>(r3)
                return r2
            L_0x004e:
                com.google.android.libraries.places.internal.zzmm$zzd r2 = new com.google.android.libraries.places.internal.zzmm$zzd
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzd.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zze extends zzrb<zze, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zze zzf;
        private static volatile zzsw<zze> zzg;
        private int zzc;
        private int zzd;
        private int zze;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zze, zza> implements zzso {
            private zza() {
                super(zze.zzf);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zze zze2 = new zze();
            zzf = zze2;
            zzrb.zza(zze.class, zze2);
        }

        private zze() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zze>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zze>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zze>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zze> r2 = zzg
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zze> r3 = com.google.android.libraries.places.internal.zzmm.zze.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zze> r2 = zzg     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zze r4 = zzf     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zze r2 = zzf
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
                com.google.android.libraries.places.internal.zzmm$zze r3 = zzf
                java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x004d:
                com.google.android.libraries.places.internal.zzmm$zze$zza r2 = new com.google.android.libraries.places.internal.zzmm$zze$zza
                r2.<init>(r3)
                return r2
            L_0x0053:
                com.google.android.libraries.places.internal.zzmm$zze r2 = new com.google.android.libraries.places.internal.zzmm$zze
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zze.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzf extends zzrb<zzf, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzf zzf;
        private static volatile zzsw<zzf> zzg;
        private int zzc;
        private int zzd;
        private int zze;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzf, zza> implements zzso {
            private zza() {
                super(zzf.zzf);
            }

            public final zza zza(int i) {
                zzb();
                ((zzf) this.zza).zzb(1);
                return this;
            }

            public final zza zzb(int i) {
                zzb();
                ((zzf) this.zza).zzc(i);
                return this;
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzf zzf2 = new zzf();
            zzf = zzf2;
            zzrb.zza(zzf.class, zzf2);
        }

        private zzf() {
        }

        public static zza zza() {
            return (zza) zzf.zzf();
        }

        /* access modifiers changed from: private */
        public final void zzb(int i) {
            this.zzc |= 1;
            this.zzd = i;
        }

        /* access modifiers changed from: private */
        public final void zzc(int i) {
            this.zzc |= 2;
            this.zze = i;
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzf>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzf>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzf>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzf> r2 = zzg
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzf> r3 = com.google.android.libraries.places.internal.zzmm.zzf.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzf> r2 = zzg     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzf r4 = zzf     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzf r2 = zzf
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
                com.google.android.libraries.places.internal.zzmm$zzf r3 = zzf
                java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x004d:
                com.google.android.libraries.places.internal.zzmm$zzf$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzf$zza
                r2.<init>(r3)
                return r2
            L_0x0053:
                com.google.android.libraries.places.internal.zzmm$zzf r2 = new com.google.android.libraries.places.internal.zzmm$zzf
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzf.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzg extends zzrb<zzg, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzg zzf;
        private static volatile zzsw<zzg> zzg;
        private int zzc;
        private String zzd;
        private String zze;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzg, zza> implements zzso {
            private zza() {
                super(zzg.zzf);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzg zzg2 = new zzg();
            zzf = zzg2;
            zzrb.zza(zzg.class, zzg2);
        }

        private zzg() {
            String str = "";
            this.zzd = str;
            this.zze = str;
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzg>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzg>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzg>, com.google.android.libraries.places.internal.zzrb$zza] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzg> r2 = zzg
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzg> r3 = com.google.android.libraries.places.internal.zzmm.zzg.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzg> r2 = zzg     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzg r4 = zzf     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzg r2 = zzf
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
                com.google.android.libraries.places.internal.zzmm$zzg r3 = zzf
                java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x004d:
                com.google.android.libraries.places.internal.zzmm$zzg$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzg$zza
                r2.<init>(r3)
                return r2
            L_0x0053:
                com.google.android.libraries.places.internal.zzmm$zzg r2 = new com.google.android.libraries.places.internal.zzmm$zzg
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzg.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzh extends zzrb<zzh, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzh zzi;
        private static volatile zzsw<zzh> zzj;
        private int zzc;
        private zzrh zzd = zzrb.zzi();
        private zzrm<String> zze = zzrb.zzk();
        private String zzf = "";
        private boolean zzg;
        private int zzh;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzh, zza> implements zzso {
            private zza() {
                super(zzh.zzi);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzh zzh2 = new zzh();
            zzi = zzh2;
            zzrb.zza(zzh.class, zzh2);
        }

        private zzh() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzh>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzh>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzh>, com.google.android.libraries.places.internal.zzrb$zza] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzh> r2 = zzj
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzh> r3 = com.google.android.libraries.places.internal.zzmm.zzh.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzh> r2 = zzj     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzh r4 = zzi     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzh r2 = zzi
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
                com.google.android.libraries.places.internal.zzmm$zzh r3 = zzi
                java.lang.String r4 = "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0016\u0002\u001a\u0003\b\u0000\u0004\u0007\u0001\u0005\u000b\u0002"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x005c:
                com.google.android.libraries.places.internal.zzmm$zzh$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzh$zza
                r2.<init>(r3)
                return r2
            L_0x0062:
                com.google.android.libraries.places.internal.zzmm$zzh r2 = new com.google.android.libraries.places.internal.zzmm$zzh
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzh.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzi extends zzrb<zzi, zzc> implements zzso {
        /* access modifiers changed from: private */
        public static final zzi zzs;
        private static volatile zzsw<zzi> zzt;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;
        private int zzh;
        private zzf zzi;
        private zzc zzj;
        private zzb zzk;
        private zzao zzl;
        private zzd zzm;
        private zze zzn;
        private zzap zzo;
        private zzat zzp;
        private zzar zzq;
        private int zzr;

        public enum zza implements zzrg {
            UNKNOWN_STATUS(0),
            LOW_BATTERY(1),
            NORMAL_BATTERY(2),
            CHARGING(3);
            
            private static final zzrf<zza> zze = null;
            private final int zzf;

            static {
                zze = new zzni();
            }

            private zza(int i) {
                this.zzf = i;
            }

            public static zzri zzb() {
                return zznh.zza;
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

        public enum zzb implements zzrg {
            UNKNOWN(0),
            WLAN(1),
            MOBILE(2),
            OTHER(3);
            
            private static final zzrf<zzb> zze = null;
            private final int zzf;

            static {
                zze = new zznk();
            }

            private zzb(int i) {
                this.zzf = i;
            }

            public static zzri zzb() {
                return zznj.zza;
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

        public static final class zzc extends com.google.android.libraries.places.internal.zzrb.zzb<zzi, zzc> implements zzso {
            private zzc() {
                super(zzi.zzs);
            }

            public final zzc zza(zzd zzd) {
                zzb();
                ((zzi) this.zza).zza(zzd);
                return this;
            }

            /* synthetic */ zzc(zzml zzml) {
                this();
            }

            public final zzc zza(zzf zzf) {
                zzb();
                ((zzi) this.zza).zza(zzf);
                return this;
            }

            public final zzc zza(int i) {
                zzb();
                ((zzi) this.zza).zzb(i);
                return this;
            }

            public final zzc zza(zzf zzf) {
                zzb();
                ((zzi) this.zza).zza(zzf);
                return this;
            }

            public final zzc zza(zzb zzb) {
                zzb();
                ((zzi) this.zza).zza(zzb);
                return this;
            }

            public final zzc zza(zzd zzd) {
                zzb();
                ((zzi) this.zza).zza(zzd);
                return this;
            }
        }

        public enum zzd implements zzrg {
            UNDEFINED(0),
            ADD_PLACE(1),
            DELETE_ALIAS(2),
            ESTIMATE_PLACES_BY_LOCATION(3),
            GET_ALIASES(4),
            GET_AUTOCOMPLETE_PREDICTIONS(5),
            GET_NEARBY_ALERT_DATA_BY_ID(6),
            GET_PLACE_BY_ID(7),
            GET_PLACE_PHOTO_METADATA(8),
            SEARCH(9),
            SEARCH_BY_BEACON(10),
            SEARCH_BY_CHAIN(11),
            WRITE_ALIAS(12),
            SEARCH_BY_CLIENT(13),
            GET_PHOTO(14),
            SNAP_TO_PLACE(15);
            
            private static final zzrf<zzd> zzq = null;
            private final int zzr;

            static {
                zzq = new zznl();
            }

            private zzd(int i) {
                this.zzr = i;
            }

            public static zzri zzb() {
                return zznm.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zzd.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.zzr);
                sb.append(" name=");
                sb.append(name());
                sb.append('>');
                return sb.toString();
            }

            public final int zza() {
                return this.zzr;
            }
        }

        public enum zze implements zzrg {
            UNKNOWN_SERVER_TYPE(0),
            PLACES_SERVER(1),
            SEMANTIC_LOCATION_SERVER(2);
            
            private static final zzrf<zze> zzd = null;
            private final int zze;

            static {
                zzd = new zzno();
            }

            private zze(int i) {
                this.zze = i;
            }

            public static zzri zzb() {
                return zznn.zza;
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
            INVALID(0),
            SUCCESS(1),
            TIMEOUT(2),
            NETWORK_ERROR(3);
            
            private static final zzrf<zzf> zze = null;
            private final int zzf;

            static {
                zze = new zznp();
            }

            private zzf(int i) {
                this.zzf = i;
            }

            public static zzri zzb() {
                return zznq.zza;
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
            zzi zzi2 = new zzi();
            zzs = zzi2;
            zzrb.zza(zzi.class, zzi2);
        }

        private zzi() {
        }

        /* access modifiers changed from: private */
        public final void zza(zzd zzd2) {
            if (zzd2 != null) {
                this.zzc |= 1;
                this.zzd = zzd2.zza();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zzb(int i) {
            this.zzc |= 4;
            this.zzf = i;
        }

        /* access modifiers changed from: private */
        public final void zza(zzf zzf2) {
            if (zzf2 != null) {
                this.zzc |= 2;
                this.zze = zzf2.zza();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zza(zzf zzf2) {
            if (zzf2 != null) {
                this.zzi = zzf2;
                this.zzc |= 32;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zza(zzb zzb2) {
            if (zzb2 != null) {
                this.zzk = zzb2;
                this.zzc |= 128;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zza(zzd zzd2) {
            if (zzd2 != null) {
                this.zzm = zzd2;
                this.zzc |= 512;
                return;
            }
            throw new NullPointerException();
        }

        public static zzc zza() {
            return (zzc) zzs.zzf();
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzi>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzi>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzi>] */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
          assigns: []
          uses: []
          mth insns count: 78
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzi> r2 = zzt
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzi> r3 = com.google.android.libraries.places.internal.zzmm.zzi.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzi> r2 = zzt     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzi r4 = zzs     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzt = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzi r2 = zzs
                return r2
            L_0x0033:
                r2 = 21
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                r3 = 2
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zzi.zzd.zzb()
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zze"
                r2[r3] = r4
                r3 = 4
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zzi.zzf.zzb()
                r2[r3] = r4
                r3 = 5
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                r3 = 6
                java.lang.String r4 = "zzg"
                r2[r3] = r4
                r3 = 7
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zzi.zzb.zzb()
                r2[r3] = r4
                r3 = 8
                java.lang.String r4 = "zzh"
                r2[r3] = r4
                r3 = 9
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zzi.zza.zzb()
                r2[r3] = r4
                r3 = 10
                java.lang.String r4 = "zzi"
                r2[r3] = r4
                r3 = 11
                java.lang.String r4 = "zzj"
                r2[r3] = r4
                r3 = 12
                java.lang.String r4 = "zzk"
                r2[r3] = r4
                r3 = 13
                java.lang.String r4 = "zzl"
                r2[r3] = r4
                r3 = 14
                java.lang.String r4 = "zzm"
                r2[r3] = r4
                r3 = 15
                java.lang.String r4 = "zzn"
                r2[r3] = r4
                r3 = 16
                java.lang.String r4 = "zzo"
                r2[r3] = r4
                r3 = 17
                java.lang.String r4 = "zzp"
                r2[r3] = r4
                r3 = 18
                java.lang.String r4 = "zzq"
                r2[r3] = r4
                r3 = 19
                java.lang.String r4 = "zzr"
                r2[r3] = r4
                r3 = 20
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zzi.zze.zzb()
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzmm$zzi r3 = zzs
                java.lang.String r4 = "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\f\u0003\u0005\f\u0004\u0006\t\u0005\u0007\t\u0006\b\t\u0007\t\t\b\n\t\t\u000b\t\n\f\t\u000b\r\t\f\u000e\t\r\u000f\f\u000e"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x00bf:
                com.google.android.libraries.places.internal.zzmm$zzi$zzc r2 = new com.google.android.libraries.places.internal.zzmm$zzi$zzc
                r2.<init>(r3)
                return r2
            L_0x00c5:
                com.google.android.libraries.places.internal.zzmm$zzi r2 = new com.google.android.libraries.places.internal.zzmm$zzi
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzi.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzj extends zzrb<zzj, zzb> implements zzso {
        /* access modifiers changed from: private */
        public static final zzj zzg;
        private static volatile zzsw<zzj> zzh;
        private int zzc;
        private String zzd;
        private String zze;
        private int zzf;

        public enum zza implements zzrg {
            UNKNOWN(0),
            USER_REPORTED(1),
            INFERRED(2),
            INFERRED_GEOFENCING(33),
            INFERRED_RADIO_SIGNALS(34),
            INFERRED_REVERSE_GEOCODING(35),
            INFERRED_SNAPPED_TO_ROAD(36);
            
            private static final zzrf<zza> zzh = null;
            private final int zzi;

            static {
                zzh = new zzns();
            }

            private zza(int i) {
                this.zzi = i;
            }

            public static zzri zzb() {
                return zznr.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zza.class.getName());
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

        public static final class zzb extends com.google.android.libraries.places.internal.zzrb.zzb<zzj, zzb> implements zzso {
            private zzb() {
                super(zzj.zzg);
            }

            /* synthetic */ zzb(zzml zzml) {
                this();
            }
        }

        static {
            zzj zzj = new zzj();
            zzg = zzj;
            zzrb.zza(zzj.class, zzj);
        }

        private zzj() {
            String str = "";
            this.zzd = str;
            this.zze = str;
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzj>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzj>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzj>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzj> r2 = zzh
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzj> r3 = com.google.android.libraries.places.internal.zzmm.zzj.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzj> r2 = zzh     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzj r4 = zzg     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzj r2 = zzg
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zzj.zza.zzb()
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzmm$zzj r3 = zzg
                java.lang.String r4 = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\f\u0002"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0059:
                com.google.android.libraries.places.internal.zzmm$zzj$zzb r2 = new com.google.android.libraries.places.internal.zzmm$zzj$zzb
                r2.<init>(r3)
                return r2
            L_0x005f:
                com.google.android.libraries.places.internal.zzmm$zzj r2 = new com.google.android.libraries.places.internal.zzmm$zzj
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzj.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzk extends zzrb<zzk, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzk zzj;
        private static volatile zzsw<zzk> zzk;
        private int zzc;
        private int zzd;
        private zzrm<String> zze = zzrb.zzk();
        private String zzf;
        private String zzg;
        private boolean zzh;
        private zzrm<String> zzi;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzk, zza> implements zzso {
            private zza() {
                super(zzk.zzj);
            }

            public final zza zza(String str) {
                zzb();
                ((zzk) this.zza).zza(str);
                return this;
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzk zzk2 = new zzk();
            zzj = zzk2;
            zzrb.zza(zzk.class, zzk2);
        }

        private zzk() {
            String str = "";
            this.zzf = str;
            this.zzg = str;
            this.zzi = zzrb.zzk();
        }

        /* access modifiers changed from: private */
        public final void zza(String str) {
            if (str != null) {
                if (!this.zze.zza()) {
                    this.zze = zzrb.zza(this.zze);
                }
                this.zze.add(str);
                return;
            }
            throw new NullPointerException();
        }

        public static zza zza() {
            return (zza) zzj.zzf();
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzk>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzk>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzk>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzk> r2 = zzk
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzk> r3 = com.google.android.libraries.places.internal.zzmm.zzk.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzk> r2 = zzk     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzk r4 = zzj     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzk r2 = zzj
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
                com.google.android.libraries.places.internal.zzmm$zzk r3 = zzj
                java.lang.String r4 = "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0004\u0000\u0002\u001a\u0003\b\u0001\u0004\b\u0002\u0005\u0007\u0003\u0006\u001a"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0061:
                com.google.android.libraries.places.internal.zzmm$zzk$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzk$zza
                r2.<init>(r3)
                return r2
            L_0x0067:
                com.google.android.libraries.places.internal.zzmm$zzk r2 = new com.google.android.libraries.places.internal.zzmm$zzk
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzk.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzl extends zzrb<zzl, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzl zzo;
        private static volatile zzsw<zzl> zzp;
        private int zzc;
        private String zzd;
        private String zze;
        private zzk zzf;
        private com.google.android.libraries.places.internal.zzjt.zzb zzg;
        private int zzh;
        private String zzi;
        private int zzj;
        private int zzk;
        private String zzl;
        private int zzm;
        private byte zzn = 2;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzl, zza> implements zzso {
            private zza() {
                super(zzl.zzo);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        public enum zzb implements zzrg {
            MODE_EXPLORATION(1),
            MODE_CHECK_IN(2);
            
            private static final zzrf<zzb> zzc = null;
            private final int zzd;

            static {
                zzc = new zznt();
            }

            private zzb(int i) {
                this.zzd = i;
            }

            public static zzri zzb() {
                return zznu.zza;
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
            SEARCH(0),
            GET_CURRENT_PLACE_DEPRECATED(1),
            GET_CURRENT_PLACE_FROM_SERVER(2),
            GET_CURRENT_PLACE_FROM_DEVICE(3);
            
            private static final zzrf<zzc> zze = null;
            private final int zzf;

            static {
                zze = new zznw();
            }

            private zzc(int i) {
                this.zzf = i;
            }

            public static zzri zzb() {
                return zznv.zza;
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
            PLACE_SELECTION_NONE(0),
            PLACE_SELECTION_SELECT_THIS_LOCATION(1),
            PLACE_SELECTION_FROM_NEARBY_LIST(2),
            PLACE_SELECTION_FROM_SEARCH_RESULTS(3),
            PLACE_SELECTION_ADD_A_PLACE(4);
            
            private static final zzrf<zzd> zzf = null;
            private final int zzg;

            static {
                zzf = new zznx();
            }

            private zzd(int i) {
                this.zzg = i;
            }

            public static zzri zzb() {
                return zzny.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zzd.class.getName());
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
            zzl zzl2 = new zzl();
            zzo = zzl2;
            zzrb.zza(zzl.class, zzl2);
        }

        private zzl() {
            String str = "";
            this.zzd = str;
            this.zze = str;
            this.zzh = 1;
            this.zzi = str;
            this.zzl = str;
        }

        /* JADX WARNING: type inference failed for: r3v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzl>] */
        /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzl>] */
        /* JADX WARNING: type inference failed for: r3v13 */
        /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzl>] */
        /* JADX WARNING: type inference failed for: r3v19 */
        /* JADX WARNING: type inference failed for: r3v20 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v13
          assigns: []
          uses: []
          mth insns count: 70
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
                int[] r5 = com.google.android.libraries.places.internal.zzml.zza
                r0 = 1
                int r3 = r3 - r0
                r3 = r5[r3]
                r5 = 0
                r1 = 0
                switch(r3) {
                    case 1: goto L_0x00a0;
                    case 2: goto L_0x009a;
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
                r2.zzn = r3
                return r1
            L_0x0019:
                byte r3 = r2.zzn
                java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
                return r3
            L_0x0020:
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzl> r3 = zzp
                if (r3 != 0) goto L_0x0039
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzl> r4 = com.google.android.libraries.places.internal.zzmm.zzl.class
                monitor-enter(r4)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzl> r3 = zzp     // Catch:{ all -> 0x0036 }
                if (r3 != 0) goto L_0x0034
                com.google.android.libraries.places.internal.zzrb$zza r3 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x0036 }
                com.google.android.libraries.places.internal.zzmm$zzl r5 = zzo     // Catch:{ all -> 0x0036 }
                r3.<init>(r5)     // Catch:{ all -> 0x0036 }
                zzp = r3     // Catch:{ all -> 0x0036 }
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
                com.google.android.libraries.places.internal.zzmm$zzl r3 = zzo
                return r3
            L_0x003d:
                r3 = 14
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "zzc"
                r3[r5] = r4
                java.lang.String r4 = "zzd"
                r3[r0] = r4
                r4 = 2
                java.lang.String r5 = "zze"
                r3[r4] = r5
                r4 = 3
                java.lang.String r5 = "zzf"
                r3[r4] = r5
                r4 = 4
                java.lang.String r5 = "zzg"
                r3[r4] = r5
                r4 = 5
                java.lang.String r5 = "zzh"
                r3[r4] = r5
                r4 = 6
                com.google.android.libraries.places.internal.zzri r5 = com.google.android.libraries.places.internal.zzmm.zzl.zzb.zzb()
                r3[r4] = r5
                r4 = 7
                java.lang.String r5 = "zzi"
                r3[r4] = r5
                r4 = 8
                java.lang.String r5 = "zzj"
                r3[r4] = r5
                r4 = 9
                com.google.android.libraries.places.internal.zzri r5 = com.google.android.libraries.places.internal.zzmm.zzl.zzd.zzb()
                r3[r4] = r5
                r4 = 10
                java.lang.String r5 = "zzk"
                r3[r4] = r5
                r4 = 11
                java.lang.String r5 = "zzl"
                r3[r4] = r5
                r4 = 12
                java.lang.String r5 = "zzm"
                r3[r4] = r5
                r4 = 13
                com.google.android.libraries.places.internal.zzri r5 = com.google.android.libraries.places.internal.zzmm.zzl.zzc.zzb()
                r3[r4] = r5
                com.google.android.libraries.places.internal.zzmm$zzl r4 = zzo
                java.lang.String r5 = "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0001\u0001\b\u0000\u0002\b\u0001\u0003\t\u0002\u0004Љ\u0003\u0005\f\u0004\u0006\b\u0005\u0007\f\u0006\b\u0004\u0007\t\b\b\n\f\t"
                java.lang.Object r3 = com.google.android.libraries.places.internal.zzrb.zza(r4, r5, r3)
                return r3
            L_0x009a:
                com.google.android.libraries.places.internal.zzmm$zzl$zza r3 = new com.google.android.libraries.places.internal.zzmm$zzl$zza
                r3.<init>(r1)
                return r3
            L_0x00a0:
                com.google.android.libraries.places.internal.zzmm$zzl r3 = new com.google.android.libraries.places.internal.zzmm$zzl
                r3.<init>()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzl.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzm extends zzrb<zzm, zzb> implements zzso {
        /* access modifiers changed from: private */
        public static final zzm zze;
        private static volatile zzsw<zzm> zzf;
        private int zzc;
        private int zzd;

        public enum zza implements zzrg {
            SOURCE_UNKNOWN(0),
            BY_GEOFENCE_EVENT(1),
            BY_LOCATION_UPDATE_PREV_LOCATION_UNKONWN(2),
            BY_LOCATION_UPDATE_MISS_GEOFENCE_UPDATE(3),
            BY_LOCATION_UPDATE_WHEN_NO_POWER(4);
            
            private static final zzrf<zza> zzf = null;
            private final int zzg;

            static {
                zzf = new zzoa();
            }

            private zza(int i) {
                this.zzg = i;
            }

            public static zzri zzb() {
                return zznz.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zza.class.getName());
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

        public static final class zzb extends com.google.android.libraries.places.internal.zzrb.zzb<zzm, zzb> implements zzso {
            private zzb() {
                super(zzm.zze);
            }

            /* synthetic */ zzb(zzml zzml) {
                this();
            }
        }

        static {
            zzm zzm = new zzm();
            zze = zzm;
            zzrb.zza(zzm.class, zzm);
        }

        private zzm() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzm>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzm>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzm>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzm> r2 = zzf
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzm> r3 = com.google.android.libraries.places.internal.zzmm.zzm.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzm> r2 = zzf     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzm r4 = zze     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzm r2 = zze
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zzm.zza.zzb()
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzmm$zzm r3 = zze
                java.lang.String r4 = "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x004f:
                com.google.android.libraries.places.internal.zzmm$zzm$zzb r2 = new com.google.android.libraries.places.internal.zzmm$zzm$zzb
                r2.<init>(r3)
                return r2
            L_0x0055:
                com.google.android.libraries.places.internal.zzmm$zzm r2 = new com.google.android.libraries.places.internal.zzmm$zzm
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzm.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzn extends zzrb<zzn, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzn zzk;
        private static volatile zzsw<zzn> zzl;
        private int zzc;
        private String zzd;
        private com.google.android.libraries.places.internal.zzjt.zza zze;
        private String zzf;
        private zzrm<String> zzg;
        private String zzh;
        private String zzi;
        private byte zzj = 2;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzn, zza> implements zzso {
            private zza() {
                super(zzn.zzk);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzn zzn = new zzn();
            zzk = zzn;
            zzrb.zza(zzn.class, zzn);
        }

        private zzn() {
            String str = "";
            this.zzd = str;
            this.zzf = str;
            this.zzg = zzrb.zzk();
            this.zzh = str;
            this.zzi = str;
        }

        /* JADX WARNING: type inference failed for: r3v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzn>] */
        /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzn>] */
        /* JADX WARNING: type inference failed for: r3v13 */
        /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzn>] */
        /* JADX WARNING: type inference failed for: r3v19 */
        /* JADX WARNING: type inference failed for: r3v20 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v13
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
                int[] r5 = com.google.android.libraries.places.internal.zzml.zza
                r0 = 1
                int r3 = r3 - r0
                r3 = r5[r3]
                r5 = 0
                r1 = 0
                switch(r3) {
                    case 1: goto L_0x0070;
                    case 2: goto L_0x006a;
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
                r2.zzj = r3
                return r1
            L_0x0019:
                byte r3 = r2.zzj
                java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
                return r3
            L_0x0020:
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzn> r3 = zzl
                if (r3 != 0) goto L_0x0039
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzn> r4 = com.google.android.libraries.places.internal.zzmm.zzn.class
                monitor-enter(r4)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzn> r3 = zzl     // Catch:{ all -> 0x0036 }
                if (r3 != 0) goto L_0x0034
                com.google.android.libraries.places.internal.zzrb$zza r3 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x0036 }
                com.google.android.libraries.places.internal.zzmm$zzn r5 = zzk     // Catch:{ all -> 0x0036 }
                r3.<init>(r5)     // Catch:{ all -> 0x0036 }
                zzl = r3     // Catch:{ all -> 0x0036 }
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
                com.google.android.libraries.places.internal.zzmm$zzn r3 = zzk
                return r3
            L_0x003d:
                r3 = 7
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "zzc"
                r3[r5] = r4
                java.lang.String r4 = "zzd"
                r3[r0] = r4
                r4 = 2
                java.lang.String r5 = "zze"
                r3[r4] = r5
                r4 = 3
                java.lang.String r5 = "zzf"
                r3[r4] = r5
                r4 = 4
                java.lang.String r5 = "zzg"
                r3[r4] = r5
                r4 = 5
                java.lang.String r5 = "zzh"
                r3[r4] = r5
                r4 = 6
                java.lang.String r5 = "zzi"
                r3[r4] = r5
                com.google.android.libraries.places.internal.zzmm$zzn r4 = zzk
                java.lang.String r5 = "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\b\u0000\u0002Љ\u0001\u0003\b\u0002\u0004\u001a\u0005\b\u0003\u0006\b\u0004"
                java.lang.Object r3 = com.google.android.libraries.places.internal.zzrb.zza(r4, r5, r3)
                return r3
            L_0x006a:
                com.google.android.libraries.places.internal.zzmm$zzn$zza r3 = new com.google.android.libraries.places.internal.zzmm$zzn$zza
                r3.<init>(r1)
                return r3
            L_0x0070:
                com.google.android.libraries.places.internal.zzmm$zzn r3 = new com.google.android.libraries.places.internal.zzmm$zzn
                r3.<init>()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzn.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzo extends zzrb<zzo, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzo zzh;
        private static volatile zzsw<zzo> zzi;
        private int zzc;
        private String zzd = "";
        private com.google.android.libraries.places.internal.zzjt.zzb zze;
        private zzk zzf;
        private byte zzg = 2;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzo, zza> implements zzso {
            private zza() {
                super(zzo.zzh);
            }

            public final zza zza(zzk zzk) {
                zzb();
                ((zzo) this.zza).zza(zzk);
                return this;
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzo zzo = new zzo();
            zzh = zzo;
            zzrb.zza(zzo.class, zzo);
        }

        private zzo() {
        }

        /* access modifiers changed from: private */
        public final void zza(zzk zzk) {
            if (zzk != null) {
                this.zzf = zzk;
                this.zzc |= 4;
                return;
            }
            throw new NullPointerException();
        }

        public static zza zza() {
            return (zza) zzh.zzf();
        }

        /* JADX WARNING: type inference failed for: r3v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzo>] */
        /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzo>] */
        /* JADX WARNING: type inference failed for: r3v13 */
        /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzo>] */
        /* JADX WARNING: type inference failed for: r3v19 */
        /* JADX WARNING: type inference failed for: r3v20 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v13
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
        public final java.lang.Object zza(int r3, java.lang.Object r4, java.lang.Object r5) {
            /*
                r2 = this;
                int[] r5 = com.google.android.libraries.places.internal.zzml.zza
                r0 = 1
                int r3 = r3 - r0
                r3 = r5[r3]
                r5 = 0
                r1 = 0
                switch(r3) {
                    case 1: goto L_0x0061;
                    case 2: goto L_0x005b;
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
                r2.zzg = r3
                return r1
            L_0x0019:
                byte r3 = r2.zzg
                java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
                return r3
            L_0x0020:
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzo> r3 = zzi
                if (r3 != 0) goto L_0x0039
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzo> r4 = com.google.android.libraries.places.internal.zzmm.zzo.class
                monitor-enter(r4)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzo> r3 = zzi     // Catch:{ all -> 0x0036 }
                if (r3 != 0) goto L_0x0034
                com.google.android.libraries.places.internal.zzrb$zza r3 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x0036 }
                com.google.android.libraries.places.internal.zzmm$zzo r5 = zzh     // Catch:{ all -> 0x0036 }
                r3.<init>(r5)     // Catch:{ all -> 0x0036 }
                zzi = r3     // Catch:{ all -> 0x0036 }
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
                com.google.android.libraries.places.internal.zzmm$zzo r3 = zzh
                return r3
            L_0x003d:
                r3 = 4
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "zzc"
                r3[r5] = r4
                java.lang.String r4 = "zzd"
                r3[r0] = r4
                r4 = 2
                java.lang.String r5 = "zze"
                r3[r4] = r5
                r4 = 3
                java.lang.String r5 = "zzf"
                r3[r4] = r5
                com.google.android.libraries.places.internal.zzmm$zzo r4 = zzh
                java.lang.String r5 = "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\b\u0000\u0002Љ\u0001\u0003\t\u0002"
                java.lang.Object r3 = com.google.android.libraries.places.internal.zzrb.zza(r4, r5, r3)
                return r3
            L_0x005b:
                com.google.android.libraries.places.internal.zzmm$zzo$zza r3 = new com.google.android.libraries.places.internal.zzmm$zzo$zza
                r3.<init>(r1)
                return r3
            L_0x0061:
                com.google.android.libraries.places.internal.zzmm$zzo r3 = new com.google.android.libraries.places.internal.zzmm$zzo
                r3.<init>()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzo.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzp extends zzrb<zzp, zzc> implements zzso {
        /* access modifiers changed from: private */
        public static final zzp zzt;
        private static volatile zzsw<zzp> zzu;
        private int zzc;
        private int zzd;
        private int zze = 1;
        private boolean zzf;
        private boolean zzg;
        private boolean zzh;
        private int zzi;
        private int zzj;
        private int zzk;
        private int zzl;
        private int zzm;
        private int zzn;
        private int zzo;
        private boolean zzp;
        private int zzq;
        private int zzr;
        private int zzs;

        public enum zza implements zzrg {
            OVERLAY(1),
            FULLSCREEN(2);
            
            private static final zzrf<zza> zzc = null;
            private final int zzd;

            static {
                zzc = new zzoc();
            }

            private zza(int i) {
                this.zzd = i;
            }

            public static zzri zzb() {
                return zzob.zza;
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

        public enum zzb implements zzrg {
            UNKNOWN(0),
            YES(1),
            NO(2);
            
            private static final zzrf<zzb> zzd = null;
            private final int zze;

            static {
                zzd = new zzoe();
            }

            private zzb(int i) {
                this.zze = i;
            }

            public static zzri zzb() {
                return zzod.zza;
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

        public static final class zzc extends com.google.android.libraries.places.internal.zzrb.zzb<zzp, zzc> implements zzso {
            private zzc() {
                super(zzp.zzt);
            }

            public final zzc zza(zzd zzd) {
                zzb();
                ((zzp) this.zza).zza(zzd);
                return this;
            }

            public final zzc zzb(boolean z) {
                zzb();
                ((zzp) this.zza).zzb(z);
                return this;
            }

            public final zzc zzc(boolean z) {
                zzb();
                ((zzp) this.zza).zzc(z);
                return this;
            }

            public final zzc zzd(int i) {
                zzb();
                ((zzp) this.zza).zze(i);
                return this;
            }

            public final zzc zze(int i) {
                zzb();
                ((zzp) this.zza).zzf(i);
                return this;
            }

            public final zzc zzf(int i) {
                zzb();
                ((zzp) this.zza).zzg(i);
                return this;
            }

            public final zzc zzg(int i) {
                zzb();
                ((zzp) this.zza).zzh(i);
                return this;
            }

            public final zzc zzh(int i) {
                zzb();
                ((zzp) this.zza).zzi(i);
                return this;
            }

            /* synthetic */ zzc(zzml zzml) {
                this();
            }

            public final zzc zza(zza zza) {
                zzb();
                ((zzp) this.zza).zza(zza);
                return this;
            }

            public final zzc zzb(int i) {
                zzb();
                ((zzp) this.zza).zzc(i);
                return this;
            }

            public final zzc zzc(int i) {
                zzb();
                ((zzp) this.zza).zzd(i);
                return this;
            }

            public final zzc zzd(boolean z) {
                zzb();
                ((zzp) this.zza).zzd(z);
                return this;
            }

            public final zzc zza(boolean z) {
                zzb();
                ((zzp) this.zza).zza(z);
                return this;
            }

            public final zzc zza(int i) {
                zzb();
                ((zzp) this.zza).zzb(i);
                return this;
            }
        }

        public enum zzd implements zzrg {
            UNKNOWN_ORIGIN(0),
            ANDROID_AUTOCOMPLETE_FRAGMENT(1),
            ANDROID_AUTOCOMPLETE_MANUAL_LAUNCHER(2),
            ANDROID_PLACE_PICKER(3),
            ANDROID_ADAPTER(4),
            IOS_AUTOCOMPLETE_VIEW_CONTROLLER(5),
            IOS_AUTOCOMPLETE_SEARCH_CONTROLLER(6),
            IOS_AUTOCOMPLETE_DATA_SOURCE(7),
            IOS_PLACE_PICKER(8);
            
            private static final zzrf<zzd> zzj = null;
            private final int zzk;

            static {
                zzj = new zzof();
            }

            private zzd(int i) {
                this.zzk = i;
            }

            public static zzri zzb() {
                return zzog.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zzd.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.zzk);
                sb.append(" name=");
                sb.append(name());
                sb.append('>');
                return sb.toString();
            }

            public final int zza() {
                return this.zzk;
            }
        }

        static {
            zzp zzp2 = new zzp();
            zzt = zzp2;
            zzrb.zza(zzp.class, zzp2);
        }

        private zzp() {
        }

        /* access modifiers changed from: private */
        public final void zza(zzd zzd2) {
            if (zzd2 != null) {
                this.zzc |= 1;
                this.zzd = zzd2.zza();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zzb(boolean z) {
            this.zzc |= 8;
            this.zzg = z;
        }

        /* access modifiers changed from: private */
        public final void zzc(boolean z) {
            this.zzc |= 16;
            this.zzh = z;
        }

        /* access modifiers changed from: private */
        public final void zzd(int i) {
            this.zzc |= 128;
            this.zzk = i;
        }

        /* access modifiers changed from: private */
        public final void zze(int i) {
            this.zzc |= 256;
            this.zzl = i;
        }

        /* access modifiers changed from: private */
        public final void zzf(int i) {
            this.zzc |= 512;
            this.zzm = i;
        }

        /* access modifiers changed from: private */
        public final void zzg(int i) {
            this.zzc |= 1024;
            this.zzn = i;
        }

        /* access modifiers changed from: private */
        public final void zzh(int i) {
            this.zzc |= ItemAnimator.FLAG_MOVED;
            this.zzo = i;
        }

        /* access modifiers changed from: private */
        public final void zzi(int i) {
            this.zzc |= 8192;
            this.zzq = i;
        }

        /* access modifiers changed from: private */
        public final void zzb(int i) {
            this.zzc |= 32;
            this.zzi = i;
        }

        /* access modifiers changed from: private */
        public final void zzc(int i) {
            this.zzc |= 64;
            this.zzj = i;
        }

        /* access modifiers changed from: private */
        public final void zzd(boolean z) {
            this.zzc |= 4096;
            this.zzp = z;
        }

        /* access modifiers changed from: private */
        public final void zza(zza zza2) {
            if (zza2 != null) {
                this.zzc |= 2;
                this.zze = zza2.zza();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zza(boolean z) {
            this.zzc |= 4;
            this.zzf = z;
        }

        public static zzc zza() {
            return (zzc) zzt.zzf();
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzp>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzp>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzp>] */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
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
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
                r1 = this;
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x00bb;
                    case 2: goto L_0x00b5;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzp> r2 = zzu
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzp> r3 = com.google.android.libraries.places.internal.zzmm.zzp.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzp> r2 = zzu     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzp r4 = zzt     // Catch:{ all -> 0x002c }
                r2.<init>(r4)     // Catch:{ all -> 0x002c }
                zzu = r2     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzp r2 = zzt
                return r2
            L_0x0033:
                r2 = 20
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                java.lang.String r3 = "zzd"
                r2[r4] = r3
                r3 = 2
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zzp.zzd.zzb()
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zze"
                r2[r3] = r4
                r3 = 4
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zzp.zza.zzb()
                r2[r3] = r4
                r3 = 5
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                r3 = 6
                java.lang.String r4 = "zzg"
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
                java.lang.String r4 = "zzm"
                r2[r3] = r4
                r3 = 12
                java.lang.String r4 = "zzn"
                r2[r3] = r4
                r3 = 13
                java.lang.String r4 = "zzo"
                r2[r3] = r4
                r3 = 14
                java.lang.String r4 = "zzp"
                r2[r3] = r4
                r3 = 15
                java.lang.String r4 = "zzq"
                r2[r3] = r4
                r3 = 16
                java.lang.String r4 = "zzl"
                r2[r3] = r4
                r3 = 17
                java.lang.String r4 = "zzr"
                r2[r3] = r4
                r3 = 18
                java.lang.String r4 = "zzs"
                r2[r3] = r4
                r3 = 19
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zzp.zzb.zzb()
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzmm$zzp r3 = zzt
                java.lang.String r4 = "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u000b\u0005\u0007\u000b\u0006\b\u000b\u0007\n\u000b\t\u000b\u000b\n\f\u000b\u000b\r\u0007\f\u000e\u000b\r\u000f\u000b\b\u0010\u000b\u000e\u0011\f\u000f"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x00b5:
                com.google.android.libraries.places.internal.zzmm$zzp$zzc r2 = new com.google.android.libraries.places.internal.zzmm$zzp$zzc
                r2.<init>(r3)
                return r2
            L_0x00bb:
                com.google.android.libraries.places.internal.zzmm$zzp r2 = new com.google.android.libraries.places.internal.zzmm$zzp
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzp.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzq extends zzrb<zzq, zzb> implements zzso {
        /* access modifiers changed from: private */
        public static final zzq zzf;
        private static volatile zzsw<zzq> zzg;
        private int zzc;
        private int zzd;
        private int zze;

        public enum zza implements zzrg {
            METHOD_UNKNOWN(0),
            METHOD_PHOTO_IMAGE(1),
            METHOD_PLACE_PICKER(2);
            
            private static final zzrf<zza> zzd = null;
            private final int zze;

            static {
                zzd = new zzoi();
            }

            private zza(int i) {
                this.zze = i;
            }

            public static zzri zzb() {
                return zzoh.zza;
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

        public static final class zzb extends com.google.android.libraries.places.internal.zzrb.zzb<zzq, zzb> implements zzso {
            private zzb() {
                super(zzq.zzf);
            }

            /* synthetic */ zzb(zzml zzml) {
                this();
            }
        }

        static {
            zzq zzq = new zzq();
            zzf = zzq;
            zzrb.zza(zzq.class, zzq);
        }

        private zzq() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzq>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzq>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzq>, com.google.android.libraries.places.internal.zzrb$zza] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzq> r2 = zzg
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzq> r3 = com.google.android.libraries.places.internal.zzmm.zzq.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzq> r2 = zzg     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzq r4 = zzf     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzq r2 = zzf
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zzq.zza.zzb()
                r2[r3] = r4
                r3 = 3
                java.lang.String r4 = "zze"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzmm$zzq r3 = zzf
                java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u000b\u0001"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0054:
                com.google.android.libraries.places.internal.zzmm$zzq$zzb r2 = new com.google.android.libraries.places.internal.zzmm$zzq$zzb
                r2.<init>(r3)
                return r2
            L_0x005a:
                com.google.android.libraries.places.internal.zzmm$zzq r2 = new com.google.android.libraries.places.internal.zzmm$zzq
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzq.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
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

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzr zzr = new zzr();
            zze = zzr;
            zzrb.zza(zzr.class, zzr);
        }

        private zzr() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzr>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzr>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzr>, com.google.android.libraries.places.internal.zzrb$zza] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzr> r2 = zzf
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzr> r3 = com.google.android.libraries.places.internal.zzmm.zzr.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzr> r2 = zzf     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzr r4 = zze     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzr r2 = zze
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmp.zzb()
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzmm$zzr r3 = zze
                java.lang.String r4 = "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x004f:
                com.google.android.libraries.places.internal.zzmm$zzr$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzr$zza
                r2.<init>(r3)
                return r2
            L_0x0055:
                com.google.android.libraries.places.internal.zzmm$zzr r2 = new com.google.android.libraries.places.internal.zzmm$zzr
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzr.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzs extends zzrb<zzs, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzs zzak;
        private static volatile zzsw<zzs> zzal;
        private boolean zzaa;
        private String zzab;
        private zzi zzac;
        private boolean zzad;
        private String zzae;
        private int zzaf;
        private String zzag;
        private String zzah;
        private int zzai;
        private byte zzaj = 2;
        private int zzc;
        private int zzd;
        private int zze = 1;
        private com.google.android.libraries.places.internal.zzhx.zza zzf;
        private com.google.android.libraries.places.internal.zzjt.zza zzg;
        private int zzh;
        private float zzi;
        private zzrm<com.google.android.libraries.places.internal.zzpl.zza> zzj = zzrb.zzk();
        private zzah zzk;
        private zzrm<zzj> zzl = zzrb.zzk();
        private zzj zzm;
        private zzl zzn;
        private zzae zzo;
        private zzy zzp;
        private zzab zzq;
        private zzaa zzr;
        private zzag zzs;
        private zzp zzt;
        private zzt zzu;
        private zzac zzv;
        private zzq zzw;
        private zzm zzx;
        private zzg zzy;
        private zzau zzz;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzs, zza> implements zzso {
            private zza() {
                super(zzs.zzak);
            }

            public final zza zza(zzc zzc) {
                zzb();
                ((zzs) this.zza).zza(zzc);
                return this;
            }

            public final zza zzb(String str) {
                zzb();
                ((zzs) this.zza).zzb(str);
                return this;
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }

            public final zza zza(com.google.android.libraries.places.internal.zzhx.zza zza) {
                zzb();
                ((zzs) this.zza).zza(zza);
                return this;
            }

            public final zza zza(zzah zzah) {
                zzb();
                ((zzs) this.zza).zza(zzah);
                return this;
            }

            public final zza zza(zzae zzae) {
                zzb();
                ((zzs) this.zza).zza(zzae);
                return this;
            }

            public final zza zza(zzy zzy) {
                zzb();
                ((zzs) this.zza).zza(zzy);
                return this;
            }

            public final zza zza(zzp zzp) {
                zzb();
                ((zzs) this.zza).zza(zzp);
                return this;
            }

            public final zza zza(zzi zzi) {
                zzb();
                ((zzs) this.zza).zza(zzi);
                return this;
            }

            public final zza zza(boolean z) {
                zzb();
                ((zzs) this.zza).zza(true);
                return this;
            }

            public final zza zza(String str) {
                zzb();
                ((zzs) this.zza).zza(str);
                return this;
            }

            public final zza zza(zze zze) {
                zzb();
                ((zzs) this.zza).zza(zze);
                return this;
            }
        }

        public enum zzb implements zzrg {
            UNKNOWN(0),
            GPS(1),
            WIFI(2),
            CELL(3);
            
            private static final zzrf<zzb> zze = null;
            private final int zzf;

            static {
                zze = new zzoj();
            }

            private zzb(int i) {
                this.zzf = i;
            }

            public static zzri zzb() {
                return zzok.zza;
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
            PLACES_QUERY(1),
            PLACE_OBJECT_ACCESS(2),
            PLACE_REPORT(3),
            PLACE_PICKER_RESULT(4),
            PLACE_PHOTO_QUERY(5),
            GET_CURRENT_PLACE(6),
            NEARBY_ALERT_REQUEST(7),
            NEARBY_ALERT(8),
            PLACE_UPDATE_REQUEST(9),
            AUTOCOMPLETE_WIDGET_SESSION(10),
            GEOFENCE_STATUS(11),
            SERVER_RESPONSE(12),
            COUNT_OPERATION(13),
            PLACES_BOUNDS_REFRESH(14),
            HAS_PERSONALIZED_DATA_ACCESS(15),
            NETWORK_REQUEST_EVENT(16),
            SEMANTIC_LOCATION_PROVIDER_EVENT(17);
            
            private static final zzrf<zzc> zzr = null;
            private final int zzs;

            static {
                zzr = new zzom();
            }

            private zzc(int i) {
                this.zzs = i;
            }

            public static zzri zzb() {
                return zzol.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zzc.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.zzs);
                sb.append(" name=");
                sb.append(name());
                sb.append('>');
                return sb.toString();
            }

            public final int zza() {
                return this.zzs;
            }
        }

        public enum zzd implements zzrg {
            UNKNOWN_PLATFORM(0),
            ANDROID(1),
            IOS(2);
            
            private static final zzrf<zzd> zzd = null;
            private final int zze;

            static {
                zzd = new zzon();
            }

            private zzd(int i) {
                this.zze = i;
            }

            public static zzri zzb() {
                return zzoo.zza;
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

        public enum zze implements zzrg {
            UNKNOWN_SOURCE(0),
            PROGRAMMATIC_API(1),
            PLACE_PICKER(2),
            AUTOCOMPLETE_WIDGET(3);
            
            private static final zzrf<zze> zze = null;
            private final int zzf;

            static {
                zze = new zzoq();
            }

            private zze(int i) {
                this.zzf = i;
            }

            public static zzri zzb() {
                return zzop.zza;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(zze.class.getName());
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
            zzs zzs2 = new zzs();
            zzak = zzs2;
            zzrb.zza(zzs.class, zzs2);
        }

        private zzs() {
            String str = "";
            this.zzab = str;
            this.zzae = str;
            this.zzag = str;
            this.zzah = str;
        }

        /* access modifiers changed from: private */
        public final void zza(zzc zzc2) {
            if (zzc2 != null) {
                this.zzc |= 2;
                this.zze = zzc2.zza();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zzb(String str) {
            if (str != null) {
                this.zzc |= 134217728;
                this.zzag = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zza(com.google.android.libraries.places.internal.zzhx.zza zza2) {
            if (zza2 != null) {
                this.zzf = zza2;
                this.zzc |= 4;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zza(zzah zzah2) {
            if (zzah2 != null) {
                this.zzk = zzah2;
                this.zzc |= 64;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zza(zzae zzae2) {
            if (zzae2 != null) {
                this.zzo = zzae2;
                this.zzc |= 512;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zza(zzy zzy2) {
            if (zzy2 != null) {
                this.zzp = zzy2;
                this.zzc |= 1024;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zza(zzp zzp2) {
            if (zzp2 != null) {
                this.zzt = zzp2;
                this.zzc |= 16384;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zza(zzi zzi2) {
            if (zzi2 != null) {
                this.zzac = zzi2;
                this.zzc |= 8388608;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zza(boolean z) {
            this.zzc |= 16777216;
            this.zzad = z;
        }

        /* access modifiers changed from: private */
        public final void zza(String str) {
            if (str != null) {
                this.zzc |= 33554432;
                this.zzae = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zza(zze zze2) {
            if (zze2 != null) {
                this.zzc |= 536870912;
                this.zzai = zze2.zza();
                return;
            }
            throw new NullPointerException();
        }

        public static zza zza() {
            return (zza) zzak.zzf();
        }

        /* JADX WARNING: type inference failed for: r3v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzs>] */
        /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzs>] */
        /* JADX WARNING: type inference failed for: r3v13 */
        /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzs>, com.google.android.libraries.places.internal.zzrb$zza] */
        /* JADX WARNING: type inference failed for: r3v19 */
        /* JADX WARNING: type inference failed for: r3v20 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v13
          assigns: []
          uses: []
          mth insns count: 120
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
                int[] r5 = com.google.android.libraries.places.internal.zzml.zza
                r0 = 1
                int r3 = r3 - r0
                r3 = r5[r3]
                r5 = 0
                r1 = 0
                switch(r3) {
                    case 1: goto L_0x0138;
                    case 2: goto L_0x0132;
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
                r2.zzaj = r3
                return r1
            L_0x0019:
                byte r3 = r2.zzaj
                java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
                return r3
            L_0x0020:
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzs> r3 = zzal
                if (r3 != 0) goto L_0x0039
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzs> r4 = com.google.android.libraries.places.internal.zzmm.zzs.class
                monitor-enter(r4)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzs> r3 = zzal     // Catch:{ all -> 0x0036 }
                if (r3 != 0) goto L_0x0034
                com.google.android.libraries.places.internal.zzrb$zza r3 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x0036 }
                com.google.android.libraries.places.internal.zzmm$zzs r5 = zzak     // Catch:{ all -> 0x0036 }
                r3.<init>(r5)     // Catch:{ all -> 0x0036 }
                zzal = r3     // Catch:{ all -> 0x0036 }
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
                com.google.android.libraries.places.internal.zzmm$zzs r3 = zzak
                return r3
            L_0x003d:
                r3 = 39
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "zzc"
                r3[r5] = r4
                java.lang.String r4 = "zze"
                r3[r0] = r4
                r4 = 2
                com.google.android.libraries.places.internal.zzri r5 = com.google.android.libraries.places.internal.zzmm.zzs.zzc.zzb()
                r3[r4] = r5
                r4 = 3
                java.lang.String r5 = "zzf"
                r3[r4] = r5
                r4 = 4
                java.lang.String r5 = "zzg"
                r3[r4] = r5
                r4 = 5
                java.lang.String r5 = "zzj"
                r3[r4] = r5
                r4 = 6
                java.lang.Class<com.google.android.libraries.places.internal.zzpl$zza> r5 = com.google.android.libraries.places.internal.zzpl.zza.class
                r3[r4] = r5
                r4 = 7
                java.lang.String r5 = "zzk"
                r3[r4] = r5
                r4 = 8
                java.lang.String r5 = "zzl"
                r3[r4] = r5
                r4 = 9
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzj> r5 = com.google.android.libraries.places.internal.zzmm.zzj.class
                r3[r4] = r5
                r4 = 10
                java.lang.String r5 = "zzm"
                r3[r4] = r5
                r4 = 11
                java.lang.String r5 = "zzn"
                r3[r4] = r5
                r4 = 12
                java.lang.String r5 = "zzh"
                r3[r4] = r5
                r4 = 13
                com.google.android.libraries.places.internal.zzri r5 = com.google.android.libraries.places.internal.zzmm.zzs.zzb.zzb()
                r3[r4] = r5
                r4 = 14
                java.lang.String r5 = "zzi"
                r3[r4] = r5
                r4 = 15
                java.lang.String r5 = "zzaa"
                r3[r4] = r5
                r4 = 16
                java.lang.String r5 = "zzo"
                r3[r4] = r5
                r4 = 17
                java.lang.String r5 = "zzab"
                r3[r4] = r5
                r4 = 18
                java.lang.String r5 = "zzp"
                r3[r4] = r5
                r4 = 19
                java.lang.String r5 = "zzq"
                r3[r4] = r5
                r4 = 20
                java.lang.String r5 = "zzr"
                r3[r4] = r5
                r4 = 21
                java.lang.String r5 = "zzs"
                r3[r4] = r5
                r4 = 22
                java.lang.String r5 = "zzt"
                r3[r4] = r5
                r4 = 23
                java.lang.String r5 = "zzu"
                r3[r4] = r5
                r4 = 24
                java.lang.String r5 = "zzv"
                r3[r4] = r5
                r4 = 25
                java.lang.String r5 = "zzw"
                r3[r4] = r5
                r4 = 26
                java.lang.String r5 = "zzx"
                r3[r4] = r5
                r4 = 27
                java.lang.String r5 = "zzy"
                r3[r4] = r5
                r4 = 28
                java.lang.String r5 = "zzac"
                r3[r4] = r5
                r4 = 29
                java.lang.String r5 = "zzd"
                r3[r4] = r5
                r4 = 30
                java.lang.String r5 = "zzz"
                r3[r4] = r5
                r4 = 31
                java.lang.String r5 = "zzad"
                r3[r4] = r5
                r4 = 32
                java.lang.String r5 = "zzae"
                r3[r4] = r5
                r4 = 33
                java.lang.String r5 = "zzaf"
                r3[r4] = r5
                r4 = 34
                com.google.android.libraries.places.internal.zzri r5 = com.google.android.libraries.places.internal.zzmm.zzs.zzd.zzb()
                r3[r4] = r5
                r4 = 35
                java.lang.String r5 = "zzag"
                r3[r4] = r5
                r4 = 36
                java.lang.String r5 = "zzah"
                r3[r4] = r5
                r4 = 37
                java.lang.String r5 = "zzai"
                r3[r4] = r5
                r4 = 38
                com.google.android.libraries.places.internal.zzri r5 = com.google.android.libraries.places.internal.zzmm.zzs.zze.zzb()
                r3[r4] = r5
                com.google.android.libraries.places.internal.zzmm$zzs r4 = zzak
                java.lang.String r5 = "\u0001 \u0000\u0001\u0001  \u0000\u0002\u0003\u0001\f\u0001\u0002\t\u0002\u0003Љ\u0003\u0004\u001b\u0005Љ\u0006\u0006\u001b\u0007\t\u0007\bЉ\b\t\f\u0004\n\u0001\u0005\u000b\u0007\u0015\f\t\t\r\b\u0016\u000e\t\n\u000f\t\u000b\u0010\t\f\u0011\t\r\u0012\t\u000e\u0013\t\u000f\u0014\t\u0010\u0015\t\u0011\u0016\t\u0012\u0017\t\u0013\u0018\t\u0017\u0019\u0004\u0000\u001a\t\u0014\u001b\u0007\u0018\u001c\b\u0019\u001d\f\u001a\u001e\b\u001b\u001f\b\u001c \f\u001d"
                java.lang.Object r3 = com.google.android.libraries.places.internal.zzrb.zza(r4, r5, r3)
                return r3
            L_0x0132:
                com.google.android.libraries.places.internal.zzmm$zzs$zza r3 = new com.google.android.libraries.places.internal.zzmm$zzs$zza
                r3.<init>(r1)
                return r3
            L_0x0138:
                com.google.android.libraries.places.internal.zzmm$zzs r3 = new com.google.android.libraries.places.internal.zzmm$zzs
                r3.<init>()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzs.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzt extends zzrb<zzt, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzt zzi;
        private static volatile zzsw<zzt> zzj;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private int zzg;
        private int zzh;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzt, zza> implements zzso {
            private zza() {
                super(zzt.zzi);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzt zzt = new zzt();
            zzi = zzt;
            zzrb.zza(zzt.class, zzt);
        }

        private zzt() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzt>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzt>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzt>, com.google.android.libraries.places.internal.zzrb$zza] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x0069;
                    case 2: goto L_0x0063;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzt> r2 = zzj
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzt> r3 = com.google.android.libraries.places.internal.zzmm.zzt.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzt> r2 = zzj     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzt r4 = zzi     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzt r2 = zzi
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmv.zzb()
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzmm$zzt r3 = zzi
                java.lang.String r4 = "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0000\u0002\u000b\u0001\u0003\u000b\u0002\u0004\u000b\u0003\u0005\f\u0004"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x0063:
                com.google.android.libraries.places.internal.zzmm$zzt$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzt$zza
                r2.<init>(r3)
                return r2
            L_0x0069:
                com.google.android.libraries.places.internal.zzmm$zzt r2 = new com.google.android.libraries.places.internal.zzmm$zzt
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzt.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzu extends zzrb<zzu, zza> implements zzso {
        private static final zzrk<Integer, zzmp> zzd = new zzor();
        /* access modifiers changed from: private */
        public static final zzu zze;
        private static volatile zzsw<zzu> zzf;
        private zzrh zzc = zzrb.zzi();

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzu, zza> implements zzso {
            private zza() {
                super(zzu.zze);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.libraries.places.internal.zzrk<java.lang.Integer, com.google.android.libraries.places.internal.zzmp>, com.google.android.libraries.places.internal.zzor] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [com.google.android.libraries.places.internal.zzrk<java.lang.Integer, com.google.android.libraries.places.internal.zzmp>, com.google.android.libraries.places.internal.zzor]
          assigns: [com.google.android.libraries.places.internal.zzor]
          uses: [com.google.android.libraries.places.internal.zzrk<java.lang.Integer, com.google.android.libraries.places.internal.zzmp>]
          mth insns count: 7
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
        /* JADX WARNING: Unknown variable types count: 1 */
        static {
            /*
                com.google.android.libraries.places.internal.zzor r0 = new com.google.android.libraries.places.internal.zzor
                r0.<init>()
                zzd = r0
                com.google.android.libraries.places.internal.zzmm$zzu r0 = new com.google.android.libraries.places.internal.zzmm$zzu
                r0.<init>()
                zze = r0
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzu> r1 = com.google.android.libraries.places.internal.zzmm.zzu.class
                com.google.android.libraries.places.internal.zzrb.zza(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzu.<clinit>():void");
        }

        private zzu() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzu>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzu>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzu>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x0050;
                    case 2: goto L_0x004a;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzu> r2 = zzf
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzu> r3 = com.google.android.libraries.places.internal.zzmm.zzu.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzu> r2 = zzf     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzu r4 = zze     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzu r2 = zze
                return r2
            L_0x0033:
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                com.google.android.libraries.places.internal.zzri r3 = com.google.android.libraries.places.internal.zzmp.zzb()
                r2[r4] = r3
                com.google.android.libraries.places.internal.zzmm$zzu r3 = zze
                java.lang.String r4 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x004a:
                com.google.android.libraries.places.internal.zzmm$zzu$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzu$zza
                r2.<init>(r3)
                return r2
            L_0x0050:
                com.google.android.libraries.places.internal.zzmm$zzu r2 = new com.google.android.libraries.places.internal.zzmm$zzu
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzu.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzv extends zzrb<zzv, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzv zzh;
        private static volatile zzsw<zzv> zzi;
        private int zzc;
        private zzrm<String> zzd = zzrb.zzk();
        private int zze;
        private int zzf;
        private zzaf zzg;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzv, zza> implements zzso {
            private zza() {
                super(zzv.zzh);
            }

            public final zza zza(int i) {
                zzb();
                ((zzv) this.zza).zzb(1);
                return this;
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }

            public final zza zza(zzaf zzaf) {
                zzb();
                ((zzv) this.zza).zza(zzaf);
                return this;
            }
        }

        static {
            zzv zzv = new zzv();
            zzh = zzv;
            zzrb.zza(zzv.class, zzv);
        }

        private zzv() {
        }

        /* access modifiers changed from: private */
        public final void zza(zzaf zzaf) {
            if (zzaf != null) {
                this.zzg = zzaf;
                this.zzc |= 4;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zzb(int i) {
            this.zzc |= 2;
            this.zzf = i;
        }

        public static zza zza() {
            return (zza) zzh.zzf();
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzv>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzv>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzv>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x0064;
                    case 2: goto L_0x005e;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzv> r2 = zzi
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzv> r3 = com.google.android.libraries.places.internal.zzmm.zzv.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzv> r2 = zzi     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzv r4 = zzh     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzv r2 = zzh
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zznc.zzb()
                r2[r3] = r4
                r3 = 4
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                r3 = 5
                java.lang.String r4 = "zzg"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzmm$zzv r3 = zzh
                java.lang.String r4 = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002\f\u0000\u0003\u000b\u0001\u0004\t\u0002"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x005e:
                com.google.android.libraries.places.internal.zzmm$zzv$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzv$zza
                r2.<init>(r3)
                return r2
            L_0x0064:
                com.google.android.libraries.places.internal.zzmm$zzv r2 = new com.google.android.libraries.places.internal.zzmm$zzv
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzv.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzw extends zzrb<zzw, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzw zzf;
        private static volatile zzsw<zzw> zzg;
        private int zzc;
        private com.google.android.libraries.places.internal.zzjt.zza zzd;
        private byte zze = 2;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzw, zza> implements zzso {
            private zza() {
                super(zzw.zzf);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzw zzw = new zzw();
            zzf = zzw;
            zzrb.zza(zzw.class, zzw);
        }

        private zzw() {
        }

        /* JADX WARNING: type inference failed for: r3v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzw>] */
        /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzw>] */
        /* JADX WARNING: type inference failed for: r3v13 */
        /* JADX WARNING: type inference failed for: r3v14, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzw>, com.google.android.libraries.places.internal.zzrb$zza] */
        /* JADX WARNING: type inference failed for: r3v19 */
        /* JADX WARNING: type inference failed for: r3v20 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v13
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
        public final java.lang.Object zza(int r3, java.lang.Object r4, java.lang.Object r5) {
            /*
                r2 = this;
                int[] r5 = com.google.android.libraries.places.internal.zzml.zza
                r0 = 1
                int r3 = r3 - r0
                r3 = r5[r3]
                r5 = 0
                r1 = 0
                switch(r3) {
                    case 1: goto L_0x0057;
                    case 2: goto L_0x0051;
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
                r2.zze = r3
                return r1
            L_0x0019:
                byte r3 = r2.zze
                java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
                return r3
            L_0x0020:
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzw> r3 = zzg
                if (r3 != 0) goto L_0x0039
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzw> r4 = com.google.android.libraries.places.internal.zzmm.zzw.class
                monitor-enter(r4)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzw> r3 = zzg     // Catch:{ all -> 0x0036 }
                if (r3 != 0) goto L_0x0034
                com.google.android.libraries.places.internal.zzrb$zza r3 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x0036 }
                com.google.android.libraries.places.internal.zzmm$zzw r5 = zzf     // Catch:{ all -> 0x0036 }
                r3.<init>(r5)     // Catch:{ all -> 0x0036 }
                zzg = r3     // Catch:{ all -> 0x0036 }
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
                com.google.android.libraries.places.internal.zzmm$zzw r3 = zzf
                return r3
            L_0x003d:
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "zzc"
                r3[r5] = r4
                java.lang.String r4 = "zzd"
                r3[r0] = r4
                com.google.android.libraries.places.internal.zzmm$zzw r4 = zzf
                java.lang.String r5 = "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ\u0000"
                java.lang.Object r3 = com.google.android.libraries.places.internal.zzrb.zza(r4, r5, r3)
                return r3
            L_0x0051:
                com.google.android.libraries.places.internal.zzmm$zzw$zza r3 = new com.google.android.libraries.places.internal.zzmm$zzw$zza
                r3.<init>(r1)
                return r3
            L_0x0057:
                com.google.android.libraries.places.internal.zzmm$zzw r3 = new com.google.android.libraries.places.internal.zzmm$zzw
                r3.<init>()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzw.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzx extends zzrb<zzx, zza> implements zzso {
        /* access modifiers changed from: private */
        public static final zzx zzc;
        private static volatile zzsw<zzx> zzd;

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzx, zza> implements zzso {
            private zza() {
                super(zzx.zzc);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        static {
            zzx zzx = new zzx();
            zzc = zzx;
            zzrb.zza(zzx.class, zzx);
        }

        private zzx() {
        }

        /* JADX WARNING: type inference failed for: r1v8, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzx>] */
        /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r1v11, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzx>] */
        /* JADX WARNING: type inference failed for: r1v12 */
        /* JADX WARNING: type inference failed for: r1v13, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzx>, com.google.android.libraries.places.internal.zzrb$zza] */
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
        public final java.lang.Object zza(int r1, java.lang.Object r2, java.lang.Object r3) {
            /*
                r0 = this;
                int[] r2 = com.google.android.libraries.places.internal.zzml.zza
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzx> r1 = zzd
                if (r1 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzx> r2 = com.google.android.libraries.places.internal.zzmm.zzx.class
                monitor-enter(r2)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzx> r1 = zzd     // Catch:{ all -> 0x002c }
                if (r1 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r1 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzx r3 = zzc     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzx r1 = zzc
                return r1
            L_0x0033:
                com.google.android.libraries.places.internal.zzmm$zzx r1 = zzc
                java.lang.String r3 = "\u0001\u0000"
                java.lang.Object r1 = com.google.android.libraries.places.internal.zzrb.zza(r1, r3, r2)
                return r1
            L_0x003c:
                com.google.android.libraries.places.internal.zzmm$zzx$zza r1 = new com.google.android.libraries.places.internal.zzmm$zzx$zza
                r1.<init>(r2)
                return r1
            L_0x0042:
                com.google.android.libraries.places.internal.zzmm$zzx r1 = new com.google.android.libraries.places.internal.zzmm$zzx
                r1.<init>()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzx.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzy extends zzrb<zzy, zzb> implements zzso {
        /* access modifiers changed from: private */
        public static final zzy zzh;
        private static volatile zzsw<zzy> zzi;
        private int zzc;
        private zzk zzd;
        private int zze;
        private int zzf;
        private zzaf zzg;

        public enum zza implements zzrg {
            NO_RESULT(0),
            NEARBY_SEARCH(1),
            ON_DEVICE_INFERENCE(2);
            
            private static final zzrf<zza> zzd = null;
            private final int zze;

            static {
                zzd = new zzot();
            }

            private zza(int i) {
                this.zze = i;
            }

            public static zzri zzb() {
                return zzos.zza;
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

        public static final class zzb extends com.google.android.libraries.places.internal.zzrb.zzb<zzy, zzb> implements zzso {
            private zzb() {
                super(zzy.zzh);
            }

            public final zzb zza(zza zza) {
                zzb();
                ((zzy) this.zza).zza(zza);
                return this;
            }

            /* synthetic */ zzb(zzml zzml) {
                this();
            }

            public final zzb zza(int i) {
                zzb();
                ((zzy) this.zza).zzb(i);
                return this;
            }

            public final zzb zza(zzaf zzaf) {
                zzb();
                ((zzy) this.zza).zza(zzaf);
                return this;
            }
        }

        static {
            zzy zzy = new zzy();
            zzh = zzy;
            zzrb.zza(zzy.class, zzy);
        }

        private zzy() {
        }

        /* access modifiers changed from: private */
        public final void zza(zza zza2) {
            if (zza2 != null) {
                this.zzc |= 2;
                this.zze = zza2.zza();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void zzb(int i) {
            this.zzc |= 4;
            this.zzf = i;
        }

        /* access modifiers changed from: private */
        public final void zza(zzaf zzaf) {
            if (zzaf != null) {
                this.zzg = zzaf;
                this.zzc |= 8;
                return;
            }
            throw new NullPointerException();
        }

        public static zzb zza() {
            return (zzb) zzh.zzf();
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzy>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzy>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzy>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x0064;
                    case 2: goto L_0x005e;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzy> r2 = zzi
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzy> r3 = com.google.android.libraries.places.internal.zzmm.zzy.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzy> r2 = zzi     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzy r4 = zzh     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzy r2 = zzh
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
                com.google.android.libraries.places.internal.zzri r4 = com.google.android.libraries.places.internal.zzmm.zzy.zza.zzb()
                r2[r3] = r4
                r3 = 4
                java.lang.String r4 = "zzf"
                r2[r3] = r4
                r3 = 5
                java.lang.String r4 = "zzg"
                r2[r3] = r4
                com.google.android.libraries.places.internal.zzmm$zzy r3 = zzh
                java.lang.String r4 = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\t\u0003"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x005e:
                com.google.android.libraries.places.internal.zzmm$zzy$zzb r2 = new com.google.android.libraries.places.internal.zzmm$zzy$zzb
                r2.<init>(r3)
                return r2
            L_0x0064:
                com.google.android.libraries.places.internal.zzmm$zzy r2 = new com.google.android.libraries.places.internal.zzmm$zzy
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzy.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class zzz extends zzrb<zzz, zza> implements zzso {
        private static final zzrk<Integer, zzpk> zzd = new zzou();
        /* access modifiers changed from: private */
        public static final zzz zze;
        private static volatile zzsw<zzz> zzf;
        private zzrh zzc = zzrb.zzi();

        public static final class zza extends com.google.android.libraries.places.internal.zzrb.zzb<zzz, zza> implements zzso {
            private zza() {
                super(zzz.zze);
            }

            /* synthetic */ zza(zzml zzml) {
                this();
            }
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.libraries.places.internal.zzou, com.google.android.libraries.places.internal.zzrk<java.lang.Integer, com.google.android.libraries.places.internal.zzpk>] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [com.google.android.libraries.places.internal.zzou, com.google.android.libraries.places.internal.zzrk<java.lang.Integer, com.google.android.libraries.places.internal.zzpk>]
          assigns: [com.google.android.libraries.places.internal.zzou]
          uses: [com.google.android.libraries.places.internal.zzrk<java.lang.Integer, com.google.android.libraries.places.internal.zzpk>]
          mth insns count: 7
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
        /* JADX WARNING: Unknown variable types count: 1 */
        static {
            /*
                com.google.android.libraries.places.internal.zzou r0 = new com.google.android.libraries.places.internal.zzou
                r0.<init>()
                zzd = r0
                com.google.android.libraries.places.internal.zzmm$zzz r0 = new com.google.android.libraries.places.internal.zzmm$zzz
                r0.<init>()
                zze = r0
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzz> r1 = com.google.android.libraries.places.internal.zzmm.zzz.class
                com.google.android.libraries.places.internal.zzrb.zza(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzz.<clinit>():void");
        }

        private zzz() {
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzz>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzz>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzrb$zza, com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzz>] */
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
                int[] r3 = com.google.android.libraries.places.internal.zzml.zza
                r4 = 1
                int r2 = r2 - r4
                r2 = r3[r2]
                r3 = 0
                switch(r2) {
                    case 1: goto L_0x0050;
                    case 2: goto L_0x004a;
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
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzz> r2 = zzf
                if (r2 != 0) goto L_0x002f
                java.lang.Class<com.google.android.libraries.places.internal.zzmm$zzz> r3 = com.google.android.libraries.places.internal.zzmm.zzz.class
                monitor-enter(r3)
                com.google.android.libraries.places.internal.zzsw<com.google.android.libraries.places.internal.zzmm$zzz> r2 = zzf     // Catch:{ all -> 0x002c }
                if (r2 != 0) goto L_0x002a
                com.google.android.libraries.places.internal.zzrb$zza r2 = new com.google.android.libraries.places.internal.zzrb$zza     // Catch:{ all -> 0x002c }
                com.google.android.libraries.places.internal.zzmm$zzz r4 = zze     // Catch:{ all -> 0x002c }
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
                com.google.android.libraries.places.internal.zzmm$zzz r2 = zze
                return r2
            L_0x0033:
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.String r0 = "zzc"
                r2[r3] = r0
                com.google.android.libraries.places.internal.zzri r3 = com.google.android.libraries.places.internal.zzpk.zzb()
                r2[r4] = r3
                com.google.android.libraries.places.internal.zzmm$zzz r3 = zze
                java.lang.String r4 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e"
                java.lang.Object r2 = com.google.android.libraries.places.internal.zzrb.zza(r3, r4, r2)
                return r2
            L_0x004a:
                com.google.android.libraries.places.internal.zzmm$zzz$zza r2 = new com.google.android.libraries.places.internal.zzmm$zzz$zza
                r2.<init>(r3)
                return r2
            L_0x0050:
                com.google.android.libraries.places.internal.zzmm$zzz r2 = new com.google.android.libraries.places.internal.zzmm$zzz
                r2.<init>()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzmm.zzz.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
