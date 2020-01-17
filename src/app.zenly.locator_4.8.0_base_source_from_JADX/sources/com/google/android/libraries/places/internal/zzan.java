package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10697f;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesClient;

public final class zzan implements PlacesClient {
    private final zzv zza;
    private final zzk zzb;
    private final zzs zzc;
    private final zzcp zzd;
    private final zzb zze;

    zzan(zzv zzv, zzk zzk, zzs zzs, zzcp zzcp, zzb zzb2) {
        this.zza = zzv;
        this.zzb = zzk;
        this.zzc = zzs;
        this.zzd = zzcp;
        this.zze = zzb2;
    }

    /* access modifiers changed from: private */
    public static <ResponseT> C10693c<ResponseT> zzc(C10693c<ResponseT> cVar) {
        ApiException apiException;
        Exception a = cVar.mo29309a();
        if (a == null) {
            return cVar;
        }
        if (a instanceof ApiException) {
            apiException = (ApiException) a;
        } else {
            apiException = new ApiException(new Status(13, a.toString()));
        }
        return C10697f.m27260a((Exception) apiException);
    }

    public final C10693c<FetchPhotoResponse> fetchPhoto(FetchPhotoRequest fetchPhotoRequest) {
        try {
            zzgg.zza(fetchPhotoRequest, (Object) "Request must not be null.");
            return this.zza.zza(fetchPhotoRequest).mo29298a((Continuation<TResult, TContinuationResult>) new zzas<TResult,TContinuationResult>(this, fetchPhotoRequest)).mo29313b(new zzar(this));
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final C10693c<FetchPlaceResponse> fetchPlace(FetchPlaceRequest fetchPlaceRequest) {
        try {
            zzgg.zza(fetchPlaceRequest, (Object) "Request must not be null.");
            return this.zza.zza(fetchPlaceRequest).mo29298a((Continuation<TResult, TContinuationResult>) new zzau<TResult,TContinuationResult>(this, fetchPlaceRequest)).mo29313b(new zzat(this));
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final C10693c<FindAutocompletePredictionsResponse> findAutocompletePredictions(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest) {
        try {
            zzgg.zza(findAutocompletePredictionsRequest, (Object) "Request must not be null.");
            return this.zza.zza(findAutocompletePredictionsRequest).mo29298a((Continuation<TResult, TContinuationResult>) new zzaq<TResult,TContinuationResult>(this, findAutocompletePredictionsRequest)).mo29313b(new zzap(this));
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    public final C10693c<FindCurrentPlaceResponse> findCurrentPlace(FindCurrentPlaceRequest findCurrentPlaceRequest) {
        try {
            zzgg.zza(findCurrentPlaceRequest, (Object) "Request must not be null.");
            long zza2 = this.zze.zza();
            zzg zzb2 = zzf.zza().zzb();
            C10693c a = this.zzb.zza(findCurrentPlaceRequest.getCancellationToken()).mo29302a((SuccessContinuation<TResult, TContinuationResult>) new zzaw<TResult,TContinuationResult>(this, findCurrentPlaceRequest));
            zzav zzav = new zzav(this, findCurrentPlaceRequest, zza2, zzb2);
            return a.mo29298a((Continuation<TResult, TContinuationResult>) zzav).mo29313b(new zzay(this));
        } catch (Error | RuntimeException e) {
            zzdc.zza(e);
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ FindCurrentPlaceResponse zza(FindCurrentPlaceRequest findCurrentPlaceRequest, long j, zzg zzg, C10693c cVar) throws Exception {
        this.zzd.zza(findCurrentPlaceRequest, cVar, j, this.zze.zza());
        String str = "FindCurrentPlace";
        zzf.zza().zza(zzg, zzh.zza(str, "Duration"));
        zzf.zza().zza(zzh.zza(str));
        zzf.zza().zzb(zzh.zza(str, "Battery"));
        return (FindCurrentPlaceResponse) cVar.mo29315b();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ C10693c zza(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location) throws Exception {
        return this.zza.zza(findCurrentPlaceRequest, location, this.zzc.zza());
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ FetchPlaceResponse zza(FetchPlaceRequest fetchPlaceRequest, C10693c cVar) throws Exception {
        this.zzd.zza(fetchPlaceRequest);
        return (FetchPlaceResponse) cVar.mo29315b();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ FetchPhotoResponse zza(FetchPhotoRequest fetchPhotoRequest, C10693c cVar) throws Exception {
        this.zzd.zza(fetchPhotoRequest);
        return (FetchPhotoResponse) cVar.mo29315b();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ FindAutocompletePredictionsResponse zza(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, C10693c cVar) throws Exception {
        this.zzd.zza(findAutocompletePredictionsRequest);
        return (FindAutocompletePredictionsResponse) cVar.mo29315b();
    }
}
