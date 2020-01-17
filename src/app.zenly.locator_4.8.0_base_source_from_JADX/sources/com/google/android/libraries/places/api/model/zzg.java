package com.google.android.libraries.places.api.model;

import android.os.ParcelUuid;

abstract class zzg extends AutocompleteSessionToken {
    private final ParcelUuid zza;

    zzg(ParcelUuid parcelUuid) {
        if (parcelUuid != null) {
            this.zza = parcelUuid;
            return;
        }
        throw new NullPointerException("Null UUID");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutocompleteSessionToken)) {
            return false;
        }
        return this.zza.equals(((AutocompleteSessionToken) obj).zza());
    }

    public int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    /* access modifiers changed from: 0000 */
    public final ParcelUuid zza() {
        return this.zza;
    }
}
