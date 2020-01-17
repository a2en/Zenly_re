package com.google.android.libraries.places.internal;

import com.appsflyer.share.Constants;
import java.lang.Comparable;

final class zzgs<C extends Comparable> extends zzgq<C> {
    zzgs(C c) {
        super((Comparable) zzgg.zza(c));
    }

    public final int hashCode() {
        return ~this.zza.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
        sb.append(Constants.URL_PATH_DELIMITER);
        sb.append(valueOf);
        sb.append("\\");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final boolean zza(C c) {
        return zzhb.zzc(this.zza, c) < 0;
    }

    /* access modifiers changed from: 0000 */
    public final void zzb(StringBuilder sb) {
        sb.append(this.zza);
        sb.append(']');
    }

    /* access modifiers changed from: 0000 */
    public final void zza(StringBuilder sb) {
        sb.append('(');
        sb.append(this.zza);
    }
}
