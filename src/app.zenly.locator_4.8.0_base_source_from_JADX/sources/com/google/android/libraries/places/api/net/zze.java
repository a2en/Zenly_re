package com.google.android.libraries.places.api.net;

import android.graphics.Bitmap;

final class zze extends FetchPhotoResponse {
    private final Bitmap zza;

    zze(Bitmap bitmap) {
        if (bitmap != null) {
            this.zza = bitmap;
            return;
        }
        throw new NullPointerException("Null bitmap");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FetchPhotoResponse)) {
            return false;
        }
        return this.zza.equals(((FetchPhotoResponse) obj).getBitmap());
    }

    public final Bitmap getBitmap() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("FetchPhotoResponse{bitmap=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
