package com.google.android.libraries.places.api.model;

import java.util.List;

abstract class zzb extends AddressComponent {
    private final String zza;
    private final String zzb;
    private final List<String> zzc;

    zzb(String str, String str2, List<String> list) {
        if (str != null) {
            this.zza = str;
            this.zzb = str2;
            if (list != null) {
                this.zzc = list;
                return;
            }
            throw new NullPointerException("Null types");
        }
        throw new NullPointerException("Null name");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AddressComponent) {
            AddressComponent addressComponent = (AddressComponent) obj;
            if (this.zza.equals(addressComponent.getName())) {
                String str = this.zzb;
                if (str != null ? str.equals(addressComponent.getShortName()) : addressComponent.getShortName() == null) {
                    if (this.zzc.equals(addressComponent.getTypes())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String getName() {
        return this.zza;
    }

    public String getShortName() {
        return this.zzb;
    }

    public List<String> getTypes() {
        return this.zzc;
    }

    public int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        String str = this.zzb;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc.hashCode();
    }

    public String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        String valueOf = String.valueOf(this.zzc);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("AddressComponent{name=");
        sb.append(str);
        sb.append(", shortName=");
        sb.append(str2);
        sb.append(", types=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
