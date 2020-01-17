package com.google.android.libraries.places.internal;

import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C10693c;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.internal.zzmm.zzae;
import com.google.android.libraries.places.internal.zzmm.zzaf;
import com.google.android.libraries.places.internal.zzmm.zzah;
import com.google.android.libraries.places.internal.zzmm.zzb;
import com.google.android.libraries.places.internal.zzmm.zzf;
import com.google.android.libraries.places.internal.zzmm.zzi;
import com.google.android.libraries.places.internal.zzmm.zzi.zzd;
import com.google.android.libraries.places.internal.zzmm.zzk;
import com.google.android.libraries.places.internal.zzmm.zzk.zza;
import com.google.android.libraries.places.internal.zzmm.zzo;
import com.google.android.libraries.places.internal.zzmm.zzs;
import com.google.android.libraries.places.internal.zzmm.zzs.zzc;
import com.google.android.libraries.places.internal.zzmm.zzv;
import com.google.android.libraries.places.internal.zzmm.zzy;
import java.util.Locale;

public final class zzu implements zzcp {
    private final ClearcutLogger zza;
    private final zzdb zzb;
    private final zzdd zzc;

    zzu(ClearcutLogger clearcutLogger, zzdb zzdb, zzdd zzdd) {
        this.zza = clearcutLogger;
        this.zzb = zzdb;
        this.zzc = zzdd;
    }

    public final void zza(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest) {
        zza zza2 = zzk.zza();
        if (findAutocompletePredictionsRequest.getTypeFilter() != null) {
            zza2.zza(zzcc.zza(findAutocompletePredictionsRequest.getTypeFilter()));
        }
        zzk zzk = (zzk) zza2.zzf();
        zzo.zza zza3 = zzo.zza();
        if (zzk != null) {
            zza3.zza(zzk);
        }
        zzs.zza zza4 = zzda.zza(this.zzb).zza(zzc.PLACES_QUERY).zza((zzah) zza().zza(zzah.zza.AUTOCOMPLETE).zza((zzo) zza3.zzf()).zzf());
        if (findAutocompletePredictionsRequest.getSessionToken() != null) {
            zza4.zza(findAutocompletePredictionsRequest.getSessionToken().toString());
        }
        zza((zzs) zza4.zzf());
    }

    public final void zzb(C10693c<FetchPlaceResponse> cVar, long j, long j2) {
        zza((zzi) zzi.zza().zza(zzd.GET_PLACE_BY_ID).zza((zzf) zzf.zza().zza(1).zzb(cVar.mo29320e() ? 1 : 0).zzf()).zza(zza(cVar)).zza((int) (j2 - j)).zzf());
    }

    public final void zzc(C10693c<FindCurrentPlaceResponse> cVar, long j, long j2) {
        zza((zzi) zzi.zza().zza(zzd.ESTIMATE_PLACES_BY_LOCATION).zza((zzb) zzb.zza().zza(cVar.mo29320e() ? ((FindCurrentPlaceResponse) cVar.mo29315b()).getPlaceLikelihoods().size() : 0).zzf()).zza(zza(cVar)).zza((int) (j2 - j)).zzf());
    }

    public final void zzd(C10693c<FetchPhotoResponse> cVar, long j, long j2) {
        zza((zzi) zzi.zza().zza(zzd.GET_PHOTO).zza(zza(cVar)).zza((int) (j2 - j)).zzf());
    }

    public final void zza(C10693c<FindAutocompletePredictionsResponse> cVar, long j, long j2) {
        zza((zzi) zzi.zza().zza(zzd.GET_AUTOCOMPLETE_PREDICTIONS).zza((zzmm.zzd) zzmm.zzd.zza().zza(cVar.mo29320e() ? ((FindAutocompletePredictionsResponse) cVar.mo29315b()).getAutocompletePredictions().size() : 0).zzf()).zza(zza(cVar)).zza((int) (j2 - j)).zzf());
    }

    public final void zza(FetchPlaceRequest fetchPlaceRequest) {
        zzs.zza zza2 = zzda.zza(this.zzb).zza(zzc.PLACES_QUERY).zza((zzah) zza().zza(zzah.zza.BY_ID).zza((zzv) zzv.zza().zza(1).zza((zzaf) zzaf.zza().zza(zzcd.zza(fetchPlaceRequest.getPlaceFields())).zzf()).zzf()).zzf());
        if (fetchPlaceRequest.getSessionToken() != null) {
            zza2.zza(fetchPlaceRequest.getSessionToken().toString());
        }
        zza((zzs) zza2.zzf());
    }

    public final void zza(FindCurrentPlaceRequest findCurrentPlaceRequest, C10693c<FindCurrentPlaceResponse> cVar, long j, long j2) {
        zzy.zza zza2;
        if (cVar.mo29320e()) {
            zza2 = zzy.zza.NEARBY_SEARCH;
        } else {
            zza2 = zzy.zza.NO_RESULT;
        }
        zza((zzs) zzda.zza(this.zzb).zza(zzc.GET_CURRENT_PLACE).zza((zzy) zzy.zza().zza((zzaf) zzaf.zza().zza(zzcd.zza(findCurrentPlaceRequest.getPlaceFields())).zzf()).zza((int) (j2 - j)).zza(zza2).zzf()).zzf());
    }

    public final void zza(FetchPhotoRequest fetchPhotoRequest) {
        zza((zzs) zzda.zza(this.zzb).zza(zzc.PLACE_PHOTO_QUERY).zza((zzae) zzae.zza().zza(zzae.zza.PHOTO_IMAGE).zzf()).zzf());
    }

    private final zzah.zzb zza() {
        Locale zzc2 = this.zzc.zzc();
        Locale locale = Locale.getDefault();
        zzah.zzb zza2 = zzah.zza().zza(zzc2.toString());
        if (!zzc2.equals(locale)) {
            zza2.zzb(locale.toString());
        }
        return zza2;
    }

    private final void zza(zzi zzi) {
        zza((zzs) zzda.zza(this.zzb).zza(zzc.NETWORK_REQUEST_EVENT).zza(zzi).zzf());
    }

    private final void zza(zzs zzs) {
        this.zza.mo26970a(zzda.zza(zzs).zzd()).mo26971a();
    }

    private static <ResponseT> zzi.zzf zza(C10693c<ResponseT> cVar) {
        ApiException apiException;
        if (cVar.mo29320e()) {
            return zzi.zzf.SUCCESS;
        }
        Exception a = cVar.mo29309a();
        if (a instanceof ApiException) {
            apiException = (ApiException) a;
        } else {
            apiException = new ApiException(new Status(13, a.getMessage()));
        }
        int a2 = apiException.mo27035a();
        if (a2 == 7) {
            return zzi.zzf.NETWORK_ERROR;
        }
        if (a2 != 15) {
            return zzi.zzf.INVALID;
        }
        return zzi.zzf.TIMEOUT;
    }
}
