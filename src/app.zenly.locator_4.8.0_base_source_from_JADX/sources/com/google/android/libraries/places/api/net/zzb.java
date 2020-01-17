package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.C10689a;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.net.FetchPhotoRequest.Builder;

final class zzb extends Builder {
    private Integer zza;
    private Integer zzb;
    private PhotoMetadata zzc;
    private C10689a zzd;

    zzb() {
    }

    public final Builder setCancellationToken(C10689a aVar) {
        this.zzd = aVar;
        return this;
    }

    public final Builder setMaxHeight(Integer num) {
        this.zzb = num;
        return this;
    }

    public final Builder setMaxWidth(Integer num) {
        this.zza = num;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final Integer zza() {
        return this.zza;
    }

    /* access modifiers changed from: 0000 */
    public final Integer zzb() {
        return this.zzb;
    }

    /* access modifiers changed from: 0000 */
    public final PhotoMetadata zzc() {
        PhotoMetadata photoMetadata = this.zzc;
        if (photoMetadata != null) {
            return photoMetadata;
        }
        throw new IllegalStateException("Property \"photoMetadata\" has not been set");
    }

    /* access modifiers changed from: 0000 */
    public final FetchPhotoRequest zzd() {
        String str = "";
        if (this.zzc == null) {
            str = str.concat(" photoMetadata");
        }
        if (!str.isEmpty()) {
            String str2 = "Missing required properties:";
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        zza zza2 = new zza(this.zza, this.zzb, this.zzc, this.zzd);
        return zza2;
    }

    /* access modifiers changed from: 0000 */
    public final Builder zza(PhotoMetadata photoMetadata) {
        if (photoMetadata != null) {
            this.zzc = photoMetadata;
            return this;
        }
        throw new NullPointerException("Null photoMetadata");
    }
}
