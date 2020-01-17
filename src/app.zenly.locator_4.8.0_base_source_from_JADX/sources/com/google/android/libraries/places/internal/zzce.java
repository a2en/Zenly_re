package com.google.android.libraries.places.internal;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.tasks.C10689a;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10694d;
import com.google.android.gms.tasks.OnCompleteListener;
import java.util.HashMap;
import java.util.Map;

public final class zzce {
    private final zzcf zza;
    private final Map<C10694d<?>, HandlerThread> zzb = new HashMap();

    public zzce(zzcf zzcf) {
        this.zza = zzcf;
    }

    public final <T> boolean zza(C10694d<T> dVar, long j, String str) {
        if (this.zzb.containsKey(dVar)) {
            return false;
        }
        HandlerThread handlerThread = new HandlerThread("timeoutHandlerThread");
        handlerThread.start();
        this.zzb.put(dVar, handlerThread);
        return new Handler(handlerThread.getLooper()).postDelayed(new zzch(dVar, str), j);
    }

    public final <T> C10693c<T> zza(C10693c<T> cVar, C10689a aVar, long j, String str) {
        C10694d dVar;
        if (aVar == null) {
            dVar = new C10694d();
        } else {
            dVar = new C10694d(aVar);
        }
        zza(dVar, j, str);
        cVar.mo29313b(new zzcg(this, dVar));
        dVar.mo29325a().mo29299a((OnCompleteListener<TResult>) new zzcj<TResult>(this, dVar));
        return dVar.mo29325a();
    }

    public final boolean zza(C10694d<?> dVar) {
        HandlerThread handlerThread = (HandlerThread) this.zzb.remove(dVar);
        if (handlerThread == null) {
            return false;
        }
        return handlerThread.quit();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void zza(C10694d dVar, C10693c cVar) {
        zza(dVar);
    }
}
