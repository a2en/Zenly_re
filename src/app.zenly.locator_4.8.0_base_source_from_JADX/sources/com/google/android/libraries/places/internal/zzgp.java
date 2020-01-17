package com.google.android.libraries.places.internal;

final class zzgp extends zzgq<Comparable<?>> {
    /* access modifiers changed from: private */
    public static final zzgp zzb = new zzgp();

    private zzgp() {
        super(null);
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "+∞";
    }

    /* renamed from: zza */
    public final int compareTo(zzgq<Comparable<?>> zzgq) {
        return zzgq == this ? 0 : 1;
    }

    /* access modifiers changed from: 0000 */
    public final void zza(StringBuilder sb) {
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    public final boolean zza(Comparable<?> comparable) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final void zzb(StringBuilder sb) {
        sb.append("+∞)");
    }
}
