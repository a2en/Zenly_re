package com.google.android.libraries.places.internal;

import com.android.volley.RequestQueue;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C10689a;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10694d;
import java.util.Map;
import org.json.JSONObject;

public final class zzy {
    private final RequestQueue zza;
    private final zzam zzb;

    zzy(RequestQueue requestQueue, zzam zzam) {
        this.zza = requestQueue;
        this.zzb = zzam;
    }

    public final <HttpJsonResponseT extends zzaj<Object, ? extends Object>> C10693c<HttpJsonResponseT> zza(zzak<Object, ? extends zzcq> zzak, Class<HttpJsonResponseT> cls) {
        C10694d dVar;
        String zzd = zzak.zzd();
        Map zzc = zzak.zzc();
        C10689a zzb2 = zzak.zzb();
        if (zzb2 != null) {
            dVar = new C10694d(zzb2);
        } else {
            dVar = new C10694d();
        }
        C10694d dVar2 = dVar;
        zzac zzac = new zzac(this, 0, zzd, null, new zzx(this, cls, dVar2), new zzaa(dVar2), zzc);
        if (zzb2 != null) {
            Class<zzac> cls2 = zzac.class;
            zzb2.mo29297a(zzz.zza(zzac));
        }
        this.zza.mo23548a(zzac);
        return dVar2.mo29325a();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void zza(Class cls, C10694d dVar, JSONObject jSONObject) {
        try {
            dVar.mo29329b((zzaj) this.zzb.zza(jSONObject.toString(), cls));
        } catch (zzal e) {
            try {
                dVar.mo29328b((Exception) new ApiException(new Status(8, e.getMessage())));
            } catch (Error | RuntimeException e2) {
                zzdc.zza(e2);
                throw e2;
            }
        }
    }
}
