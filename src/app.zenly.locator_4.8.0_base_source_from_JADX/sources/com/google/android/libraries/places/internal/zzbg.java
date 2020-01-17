package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import java.util.List;

final class zzbg extends zzbl<Object, FetchPlaceResponse> {
    private String errorMessage;
    private String[] htmlAttributions;
    private zzbx result;
    private String status;

    zzbg() {
    }

    public final FetchPlaceResponse zza() throws ApiException {
        int zza = zzcb.zza(this.status);
        if (!PlacesStatusCodes.isError(zza)) {
            zzbx zzbx = this.result;
            String[] strArr = this.htmlAttributions;
            return FetchPlaceResponse.newInstance(zzbz.zza(zzbx, (List<String>) strArr != null ? zzgv.zza((E[]) strArr) : null));
        }
        throw new ApiException(new Status(zza, zzcb.zza(this.status, this.errorMessage)));
    }
}
