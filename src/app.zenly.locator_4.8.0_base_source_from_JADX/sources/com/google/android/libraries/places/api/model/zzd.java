package com.google.android.libraries.places.api.model;

import java.util.List;

abstract class zzd extends AddressComponents {
    private final List<AddressComponent> zza;

    zzd(List<AddressComponent> list) {
        if (list != null) {
            this.zza = list;
            return;
        }
        throw new NullPointerException("Null asList");
    }

    public List<AddressComponent> asList() {
        return this.zza;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddressComponents)) {
            return false;
        }
        return this.zza.equals(((AddressComponents) obj).asList());
    }

    public int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public String toString() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("AddressComponents{asList=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
