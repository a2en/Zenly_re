package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.C10689a;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.internal.zzcq;

public abstract class FetchPhotoRequest implements zzcq {

    public static abstract class Builder {
        public FetchPhotoRequest build() {
            PhotoMetadata zzc = zzc();
            if (zza() == null && zzb() == null && zzc != null) {
                int width = zzc.getWidth();
                if (width > 0) {
                    setMaxWidth(Integer.valueOf(width));
                }
                int height = zzc.getHeight();
                if (height > 0) {
                    setMaxHeight(Integer.valueOf(height));
                }
            }
            return zzd();
        }

        public abstract Builder setCancellationToken(C10689a aVar);

        public abstract Builder setMaxHeight(Integer num);

        public abstract Builder setMaxWidth(Integer num);

        /* access modifiers changed from: 0000 */
        public abstract Builder zza(PhotoMetadata photoMetadata);

        /* access modifiers changed from: 0000 */
        public abstract Integer zza();

        /* access modifiers changed from: 0000 */
        public abstract Integer zzb();

        /* access modifiers changed from: 0000 */
        public abstract PhotoMetadata zzc();

        /* access modifiers changed from: 0000 */
        public abstract FetchPhotoRequest zzd();
    }

    public static Builder builder(PhotoMetadata photoMetadata) {
        return new zzb().zza(photoMetadata);
    }

    public static FetchPhotoRequest newInstance(PhotoMetadata photoMetadata) {
        return builder(photoMetadata).build();
    }

    public abstract C10689a getCancellationToken();

    public abstract Integer getMaxHeight();

    public abstract Integer getMaxWidth();

    public abstract PhotoMetadata getPhotoMetadata();
}
