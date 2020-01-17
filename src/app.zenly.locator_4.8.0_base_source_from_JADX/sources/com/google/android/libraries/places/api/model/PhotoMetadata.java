package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.places.internal.zzgg;

public abstract class PhotoMetadata implements Parcelable {

    public static abstract class Builder {
        public PhotoMetadata build() {
            PhotoMetadata zza = zza();
            int width = zza.getWidth();
            boolean z = false;
            zzgg.zza(width >= 0, "Width must not be < 0, but was: %s.", width);
            int height = zza.getHeight();
            if (height >= 0) {
                z = true;
            }
            zzgg.zza(z, "Height must not be < 0, but was: %s.", height);
            zzgg.zzb(!TextUtils.isEmpty(zza.zza()), (Object) "PhotoReference must not be null or empty.");
            return zza;
        }

        public abstract Builder setAttributions(String str);

        public abstract Builder setHeight(int i);

        public abstract Builder setWidth(int i);

        /* access modifiers changed from: 0000 */
        public abstract Builder zza(String str);

        /* access modifiers changed from: 0000 */
        public abstract PhotoMetadata zza();
    }

    public static Builder builder(String str) {
        return new zzo().zza(str).setWidth(0).setHeight(0).setAttributions("");
    }

    public abstract String getAttributions();

    public abstract int getHeight();

    public abstract int getWidth();

    public abstract String zza();
}
