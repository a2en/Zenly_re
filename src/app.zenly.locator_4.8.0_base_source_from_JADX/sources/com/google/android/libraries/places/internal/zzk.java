package com.google.android.libraries.places.internal;

import android.location.Location;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.C10559a;
import com.google.android.gms.location.C10566d;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.C10689a;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10694d;
import com.google.android.gms.tasks.OnCompleteListener;
import java.util.concurrent.TimeUnit;

public final class zzk {
    private static final long zza = TimeUnit.SECONDS.toMillis(10);
    private static final long zzb = TimeUnit.SECONDS.toNanos(24);
    private static final long zzc = TimeUnit.SECONDS.toMillis(59);
    private final C10559a zzd;
    private final zzce zze;

    zzk(C10559a aVar, zzce zzce) {
        this.zzd = aVar;
        this.zze = zzce;
    }

    public final C10693c<Location> zza(C10689a aVar) {
        return this.zze.zza(this.zzd.mo28685f(), aVar, zza, "Location timeout.").mo29313b(new zzj(this, aVar));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void zza(C10566d dVar, C10694d dVar2, C10693c cVar) {
        this.zzd.mo28683a(dVar);
        this.zze.zza(dVar2);
    }

    static /* synthetic */ C10693c zza(C10694d dVar, C10693c cVar) throws Exception {
        if (cVar.mo29319d()) {
            if (cVar.mo29318c()) {
                dVar.mo29328b((Exception) new ApiException(new Status(16, "Location request was cancelled. Please try again.")));
            } else if (!cVar.mo29320e()) {
                dVar.mo29328b((Exception) new ApiException(new Status(8, cVar.mo29309a().getMessage())));
            }
        }
        return cVar;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ C10693c zza(C10689a aVar, C10693c cVar) throws Exception {
        C10694d dVar;
        if (cVar.mo29320e()) {
            Location location = (Location) cVar.mo29315b();
            boolean z = false;
            if (location != null && (VERSION.SDK_INT < 17 || SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos() <= zzb)) {
                z = true;
            }
            if (z) {
                return cVar;
            }
        }
        if (aVar != null) {
            dVar = new C10694d(aVar);
        } else {
            dVar = new C10694d();
        }
        LocationRequest numUpdates = LocationRequest.create().setPriority(100).setExpirationDuration(zza).setInterval(zzc).setFastestInterval(10).setNumUpdates(1);
        zzo zzo = new zzo(this, dVar);
        this.zzd.mo28682a(numUpdates, zzo, Looper.getMainLooper()).mo29313b(new zzm(this, dVar));
        this.zze.zza(dVar, zza, "Location timeout.");
        dVar.mo29325a().mo29299a((OnCompleteListener<TResult>) new zzl<TResult>(this, zzo, dVar));
        return dVar.mo29325a();
    }
}
