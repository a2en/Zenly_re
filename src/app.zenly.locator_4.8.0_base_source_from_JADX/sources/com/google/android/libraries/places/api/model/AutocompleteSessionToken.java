package com.google.android.libraries.places.api.model;

import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.UUID;

public abstract class AutocompleteSessionToken implements Parcelable {
    public static AutocompleteSessionToken newInstance() {
        return new zzaf(new ParcelUuid(UUID.randomUUID()));
    }

    public final String toString() {
        return zza().toString();
    }

    /* access modifiers changed from: 0000 */
    public abstract ParcelUuid zza();
}
