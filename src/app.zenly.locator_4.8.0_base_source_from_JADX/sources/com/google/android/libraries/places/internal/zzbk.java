package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import java.util.ArrayList;
import java.util.List;

final class zzbk extends zzbl<Object, FindCurrentPlaceResponse> {
    private String errorMessage;
    private String[] htmlAttributions;
    private zzby[] predictions;
    private String status;

    zzbk() {
    }

    public final FindCurrentPlaceResponse zza() throws ApiException {
        int zza = zzcb.zza(this.status);
        if (!PlacesStatusCodes.isError(zza)) {
            ArrayList arrayList = new ArrayList();
            zzby[] zzbyArr = this.predictions;
            if (zzbyArr != null) {
                int length = zzbyArr.length;
                int i = 0;
                while (i < length) {
                    zzby zzby = zzbyArr[i];
                    if (zzby.zzb() == null) {
                        throw new ApiException(new Status(8, "Unexpected server error: PlaceLikelihood returned without a Place value"));
                    } else if (zzby.zza() != null) {
                        zzbx zzb = zzby.zzb();
                        String[] strArr = this.htmlAttributions;
                        arrayList.add(PlaceLikelihood.newInstance(zzbz.zza(zzb, (List<String>) strArr != null ? zzgv.zza((E[]) strArr) : null), zzby.zza().doubleValue()));
                        i++;
                    } else {
                        throw new ApiException(new Status(8, "Unexpected server error: PlaceLikelihood returned without a likelihood value"));
                    }
                }
            }
            return FindCurrentPlaceResponse.newInstance(arrayList);
        }
        throw new ApiException(new Status(zza, zzcb.zza(this.status, this.errorMessage)));
    }
}
