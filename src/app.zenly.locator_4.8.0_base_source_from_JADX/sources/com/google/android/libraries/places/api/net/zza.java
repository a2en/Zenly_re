package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.C10689a;
import com.google.android.libraries.places.api.model.PhotoMetadata;

final class zza extends FetchPhotoRequest {
    private final Integer zza;
    private final Integer zzb;
    private final PhotoMetadata zzc;
    private final C10689a zzd;

    private zza(Integer num, Integer num2, PhotoMetadata photoMetadata, C10689a aVar) {
        this.zza = num;
        this.zzb = num2;
        this.zzc = photoMetadata;
        this.zzd = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchPhotoRequest) {
            FetchPhotoRequest fetchPhotoRequest = (FetchPhotoRequest) obj;
            Integer num = this.zza;
            if (num != null ? num.equals(fetchPhotoRequest.getMaxWidth()) : fetchPhotoRequest.getMaxWidth() == null) {
                Integer num2 = this.zzb;
                if (num2 != null ? num2.equals(fetchPhotoRequest.getMaxHeight()) : fetchPhotoRequest.getMaxHeight() == null) {
                    if (this.zzc.equals(fetchPhotoRequest.getPhotoMetadata())) {
                        C10689a aVar = this.zzd;
                        return aVar != null ? aVar.equals(fetchPhotoRequest.getCancellationToken()) : fetchPhotoRequest.getCancellationToken() == null;
                    }
                }
            }
        }
    }

    public final C10689a getCancellationToken() {
        return this.zzd;
    }

    public final Integer getMaxHeight() {
        return this.zzb;
    }

    public final Integer getMaxWidth() {
        return this.zza;
    }

    public final PhotoMetadata getPhotoMetadata() {
        return this.zzc;
    }

    public final int hashCode() {
        Integer num = this.zza;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        Integer num2 = this.zzb;
        int hashCode2 = (((hashCode ^ (num2 == null ? 0 : num2.hashCode())) * 1000003) ^ this.zzc.hashCode()) * 1000003;
        C10689a aVar = this.zzd;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String valueOf3 = String.valueOf(this.zzc);
        String valueOf4 = String.valueOf(this.zzd);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("FetchPhotoRequest{maxWidth=");
        sb.append(valueOf);
        sb.append(", maxHeight=");
        sb.append(valueOf2);
        sb.append(", photoMetadata=");
        sb.append(valueOf3);
        sb.append(", cancellationToken=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
