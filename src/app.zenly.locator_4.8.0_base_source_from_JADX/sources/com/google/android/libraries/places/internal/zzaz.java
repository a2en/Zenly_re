package com.google.android.libraries.places.internal;

final class zzaz {
    private String description;
    private zzb[] matchedSubstrings;
    private String placeId;
    private zza structuredFormatting;
    private String[] types;

    static class zza {
        private String mainText;
        private zzb[] mainTextMatchedSubstrings;
        private String secondaryText;
        private zzb[] secondaryTextMatchedSubstrings;

        zza() {
        }

        /* access modifiers changed from: 0000 */
        public final String zza() {
            return this.mainText;
        }

        /* access modifiers changed from: 0000 */
        public final String zzb() {
            return this.secondaryText;
        }

        /* access modifiers changed from: 0000 */
        public final zzgv<zzb> zzc() {
            zzb[] zzbArr = this.mainTextMatchedSubstrings;
            if (zzbArr != null) {
                return zzgv.zza((E[]) zzbArr);
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public final zzgv<zzb> zzd() {
            zzb[] zzbArr = this.secondaryTextMatchedSubstrings;
            if (zzbArr != null) {
                return zzgv.zza((E[]) zzbArr);
            }
            return null;
        }
    }

    static class zzb {
        Integer length;
        Integer offset;

        zzb() {
        }
    }

    zzaz() {
    }

    /* access modifiers changed from: 0000 */
    public final String zza() {
        return this.description;
    }

    /* access modifiers changed from: 0000 */
    public final String zzb() {
        return this.placeId;
    }

    /* access modifiers changed from: 0000 */
    public final zza zzc() {
        return this.structuredFormatting;
    }

    /* access modifiers changed from: 0000 */
    public final zzgv<String> zzd() {
        String[] strArr = this.types;
        if (strArr != null) {
            return zzgv.zza((E[]) strArr);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final zzgv<zzb> zze() {
        zzb[] zzbArr = this.matchedSubstrings;
        if (zzbArr != null) {
            return zzgv.zza((E[]) zzbArr);
        }
        return null;
    }
}
