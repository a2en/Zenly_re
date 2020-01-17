package com.google.android.libraries.places.internal;

import android.location.Location;
import android.text.TextUtils;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10697f;
import com.google.android.gms.tasks.Continuation;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;

public final class zzbo implements zzv {
    private final zzcr zza;
    private final zzcu zzb;
    private final zzy zzc;
    private final zzae zzd;
    private final zzcp zze;
    private final zzb zzf;

    zzbo(zzcr zzcr, zzcu zzcu, zzy zzy, zzae zzae, zzcp zzcp, zzb zzb2) {
        this.zza = zzcr;
        this.zzb = zzcu;
        this.zzc = zzy;
        this.zzd = zzae;
        this.zze = zzcp;
        this.zzf = zzb2;
    }

    public final C10693c<FindAutocompletePredictionsResponse> zza(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest) {
        String query = findAutocompletePredictionsRequest.getQuery();
        if (query == null || TextUtils.isEmpty(query.trim())) {
            return C10697f.m27261a(FindAutocompletePredictionsResponse.newInstance(zzgv.zza()));
        }
        zzbf zzbf = new zzbf(findAutocompletePredictionsRequest, this.zza.zzc(), this.zza.zzb(), this.zza.zzd(), this.zzb);
        return this.zzc.zza(zzbf, zzbi.class).mo29298a(zzbn.zza).mo29298a((Continuation<TResult, TContinuationResult>) new zzbq<TResult,TContinuationResult>(this, this.zzf.zza()));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ FetchPlaceResponse zzb(long j, C10693c cVar) throws Exception {
        this.zze.zzb(cVar, j, this.zzf.zza());
        return (FetchPlaceResponse) cVar.mo29315b();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ FetchPhotoResponse zzc(long j, C10693c cVar) throws Exception {
        this.zze.zzd(cVar, j, this.zzf.zza());
        return (FetchPhotoResponse) cVar.mo29315b();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ FindAutocompletePredictionsResponse zzd(long j, C10693c cVar) throws Exception {
        this.zze.zza(cVar, j, this.zzf.zza());
        return (FindAutocompletePredictionsResponse) cVar.mo29315b();
    }

    public final C10693c<FetchPhotoResponse> zza(FetchPhotoRequest fetchPhotoRequest) {
        Integer maxWidth = fetchPhotoRequest.getMaxWidth();
        Integer maxHeight = fetchPhotoRequest.getMaxHeight();
        if (maxWidth == null && maxHeight == null) {
            return C10697f.m27260a((Exception) new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Must include max width or max height in request.")));
        }
        if (maxWidth != null && maxWidth.intValue() <= 0) {
            return C10697f.m27260a((Exception) new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, String.format("Max Width must not be < 1, but was: %d.", new Object[]{maxWidth}))));
        } else if (maxHeight == null || maxHeight.intValue() > 0) {
            return this.zzd.zza(new zzba(fetchPhotoRequest, this.zza.zzb(), this.zza.zzd(), this.zzb), new zzbe()).mo29298a(zzbp.zza).mo29298a((Continuation<TResult, TContinuationResult>) new zzbs<TResult,TContinuationResult>(this, this.zzf.zza()));
        } else {
            return C10697f.m27260a((Exception) new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, String.format("Max Height must not be < 1, but was: %d.", new Object[]{maxHeight}))));
        }
    }

    public final C10693c<FetchPlaceResponse> zza(FetchPlaceRequest fetchPlaceRequest) {
        if (TextUtils.isEmpty(fetchPlaceRequest.getPlaceId())) {
            return C10697f.m27260a((Exception) new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Place ID must not be empty.")));
        }
        if (fetchPlaceRequest.getPlaceFields().isEmpty()) {
            return C10697f.m27260a((Exception) new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty.")));
        }
        zzbd zzbd = new zzbd(fetchPlaceRequest, this.zza.zzc(), this.zza.zzb(), this.zza.zzd(), this.zzb);
        return this.zzc.zza(zzbd, zzbg.class).mo29298a(zzbr.zza).mo29298a((Continuation<TResult, TContinuationResult>) new zzbu<TResult,TContinuationResult>(this, this.zzf.zza()));
    }

    public final C10693c<FindCurrentPlaceResponse> zza(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location, zzgv<zzq> zzgv) {
        if (findCurrentPlaceRequest.getPlaceFields().isEmpty()) {
            return C10697f.m27260a((Exception) new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty.")));
        }
        zzbh zzbh = new zzbh(findCurrentPlaceRequest, location, zzgv, this.zza.zzc(), this.zza.zzb(), this.zza.zzd(), this.zzb);
        return this.zzc.zza(zzbh, zzbk.class).mo29298a(zzbt.zza).mo29298a((Continuation<TResult, TContinuationResult>) new zzbw<TResult,TContinuationResult>(this, this.zzf.zza()));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ FindCurrentPlaceResponse zza(long j, C10693c cVar) throws Exception {
        this.zze.zzc(cVar, j, this.zzf.zza());
        return (FindCurrentPlaceResponse) cVar.mo29315b();
    }
}
