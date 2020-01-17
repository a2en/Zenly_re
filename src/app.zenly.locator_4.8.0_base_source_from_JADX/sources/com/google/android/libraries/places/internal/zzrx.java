package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.List;

final class zzrx extends zzrv {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzrx() {
        super();
    }

    private static <E> List<E> zzb(Object obj, long j) {
        return (List) zztx.zzf(obj, j);
    }

    /* access modifiers changed from: 0000 */
    public final void zza(Object obj, long j) {
        Object obj2;
        List list = (List) zztx.zzf(obj, j);
        if (list instanceof zzrw) {
            obj2 = ((zzrw) list).zze();
        } else if (!zza.isAssignableFrom(list.getClass())) {
            if (!(list instanceof zzsv) || !(list instanceof zzrm)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzrm zzrm = (zzrm) list;
                if (zzrm.zza()) {
                    zzrm.zzb();
                }
                return;
            }
        } else {
            return;
        }
        zztx.zza(obj, j, obj2);
    }

    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void zza(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.util.List r6 = zzb(r6, r7)
            int r0 = r6.size()
            java.util.List r1 = zzb(r5, r7)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0034
            boolean r2 = r1 instanceof com.google.android.libraries.places.internal.zzrw
            if (r2 == 0) goto L_0x001c
            com.google.android.libraries.places.internal.zzrt r1 = new com.google.android.libraries.places.internal.zzrt
            r1.<init>(r0)
            goto L_0x0030
        L_0x001c:
            boolean r2 = r1 instanceof com.google.android.libraries.places.internal.zzsv
            if (r2 == 0) goto L_0x002b
            boolean r2 = r1 instanceof com.google.android.libraries.places.internal.zzrm
            if (r2 == 0) goto L_0x002b
            com.google.android.libraries.places.internal.zzrm r1 = (com.google.android.libraries.places.internal.zzrm) r1
            com.google.android.libraries.places.internal.zzrm r1 = r1.zzb(r0)
            goto L_0x0030
        L_0x002b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0030:
            com.google.android.libraries.places.internal.zztx.zza(r5, r7, r1)
            goto L_0x0087
        L_0x0034:
            java.lang.Class<?> r2 = zza
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0052
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            com.google.android.libraries.places.internal.zztx.zza(r5, r7, r2)
        L_0x0050:
            r1 = r2
            goto L_0x0087
        L_0x0052:
            boolean r2 = r1 instanceof com.google.android.libraries.places.internal.zztw
            if (r2 == 0) goto L_0x0069
            com.google.android.libraries.places.internal.zzrt r2 = new com.google.android.libraries.places.internal.zzrt
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            com.google.android.libraries.places.internal.zztw r1 = (com.google.android.libraries.places.internal.zztw) r1
            r2.addAll(r1)
            com.google.android.libraries.places.internal.zztx.zza(r5, r7, r2)
            goto L_0x0050
        L_0x0069:
            boolean r2 = r1 instanceof com.google.android.libraries.places.internal.zzsv
            if (r2 == 0) goto L_0x0087
            boolean r2 = r1 instanceof com.google.android.libraries.places.internal.zzrm
            if (r2 == 0) goto L_0x0087
            r2 = r1
            com.google.android.libraries.places.internal.zzrm r2 = (com.google.android.libraries.places.internal.zzrm) r2
            boolean r3 = r2.zza()
            if (r3 != 0) goto L_0x0087
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.libraries.places.internal.zzrm r0 = r2.zzb(r1)
            com.google.android.libraries.places.internal.zztx.zza(r5, r7, r0)
            r1 = r0
        L_0x0087:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x0096
            if (r2 <= 0) goto L_0x0096
            r1.addAll(r6)
        L_0x0096:
            if (r0 <= 0) goto L_0x0099
            r6 = r1
        L_0x0099:
            com.google.android.libraries.places.internal.zztx.zza(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzrx.zza(java.lang.Object, java.lang.Object, long):void");
    }
}
