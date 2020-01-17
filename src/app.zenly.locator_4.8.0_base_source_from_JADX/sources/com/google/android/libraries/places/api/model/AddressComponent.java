package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.places.internal.zzgg;
import com.google.android.libraries.places.internal.zzgv;
import java.util.Collection;
import java.util.List;

public abstract class AddressComponent implements Parcelable {

    public static abstract class Builder {
        public AddressComponent build() {
            AddressComponent zza = zza();
            zzgg.zzb(!zza.getName().isEmpty(), (Object) "Name must not be empty.");
            List<String> types = zza.getTypes();
            zzgg.zzb(!types.isEmpty(), (Object) "Types must not be empty.");
            for (String isEmpty : types) {
                zzgg.zzb(!TextUtils.isEmpty(isEmpty), (Object) "Types must not contain null or empty values.");
            }
            zza((List<String>) zzgv.zza((Collection<? extends E>) types));
            return zza();
        }

        public abstract Builder setShortName(String str);

        /* access modifiers changed from: 0000 */
        public abstract Builder zza(String str);

        /* access modifiers changed from: 0000 */
        public abstract Builder zza(List<String> list);

        /* access modifiers changed from: 0000 */
        public abstract AddressComponent zza();
    }

    public static Builder builder(String str, List<String> list) {
        return new zza().zza(str).zza(list);
    }

    public abstract String getName();

    public abstract String getShortName();

    public abstract List<String> getTypes();
}
