package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.AutocompletePrediction.zza;
import com.google.android.libraries.places.api.model.Place.Type;
import java.util.List;

abstract class zzc extends AutocompletePrediction {
    private final String zza;
    private final List<Type> zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final List<zza> zzf;
    private final List<zza> zzg;
    private final List<zza> zzh;

    zzc(String str, List<Type> list, String str2, String str3, String str4, List<zza> list2, List<zza> list3, List<zza> list4) {
        if (str != null) {
            this.zza = str;
            if (list != null) {
                this.zzb = list;
                if (str2 != null) {
                    this.zzc = str2;
                    if (str3 != null) {
                        this.zzd = str3;
                        if (str4 != null) {
                            this.zze = str4;
                            this.zzf = list2;
                            this.zzg = list3;
                            this.zzh = list4;
                            return;
                        }
                        throw new NullPointerException("Null secondaryText");
                    }
                    throw new NullPointerException("Null primaryText");
                }
                throw new NullPointerException("Null fullText");
            }
            throw new NullPointerException("Null placeTypes");
        }
        throw new NullPointerException("Null placeId");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutocompletePrediction) {
            AutocompletePrediction autocompletePrediction = (AutocompletePrediction) obj;
            if (this.zza.equals(autocompletePrediction.getPlaceId()) && this.zzb.equals(autocompletePrediction.getPlaceTypes()) && this.zzc.equals(autocompletePrediction.zza()) && this.zzd.equals(autocompletePrediction.zzb()) && this.zze.equals(autocompletePrediction.zzc())) {
                List<zza> list = this.zzf;
                if (list != null ? list.equals(autocompletePrediction.zzd()) : autocompletePrediction.zzd() == null) {
                    List<zza> list2 = this.zzg;
                    if (list2 != null ? list2.equals(autocompletePrediction.zze()) : autocompletePrediction.zze() == null) {
                        List<zza> list3 = this.zzh;
                        return list3 != null ? list3.equals(autocompletePrediction.zzf()) : autocompletePrediction.zzf() == null;
                    }
                }
            }
        }
    }

    public String getPlaceId() {
        return this.zza;
    }

    public List<Type> getPlaceTypes() {
        return this.zzb;
    }

    public int hashCode() {
        int hashCode = (((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode()) * 1000003;
        List<zza> list = this.zzf;
        int i = 0;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<zza> list2 = this.zzg;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        List<zza> list3 = this.zzh;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode3 ^ i;
    }

    public String toString() {
        String str = this.zza;
        String valueOf = String.valueOf(this.zzb);
        String str2 = this.zzc;
        String str3 = this.zzd;
        String str4 = this.zze;
        String valueOf2 = String.valueOf(this.zzf);
        String valueOf3 = String.valueOf(this.zzg);
        String valueOf4 = String.valueOf(this.zzh);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 178 + String.valueOf(valueOf).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("AutocompletePrediction{placeId=");
        sb.append(str);
        sb.append(", placeTypes=");
        sb.append(valueOf);
        sb.append(", fullText=");
        sb.append(str2);
        sb.append(", primaryText=");
        sb.append(str3);
        sb.append(", secondaryText=");
        sb.append(str4);
        sb.append(", fullTextMatchedSubstrings=");
        sb.append(valueOf2);
        sb.append(", primaryTextMatchedSubstrings=");
        sb.append(valueOf3);
        sb.append(", secondaryTextMatchedSubstrings=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final String zza() {
        return this.zzc;
    }

    /* access modifiers changed from: 0000 */
    public final String zzb() {
        return this.zzd;
    }

    /* access modifiers changed from: 0000 */
    public final String zzc() {
        return this.zze;
    }

    /* access modifiers changed from: 0000 */
    public final List<zza> zzd() {
        return this.zzf;
    }

    /* access modifiers changed from: 0000 */
    public final List<zza> zze() {
        return this.zzg;
    }

    /* access modifiers changed from: 0000 */
    public final List<zza> zzf() {
        return this.zzh;
    }
}
