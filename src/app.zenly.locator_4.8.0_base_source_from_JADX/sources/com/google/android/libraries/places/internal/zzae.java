package com.google.android.libraries.places.internal;

import android.graphics.Bitmap.Config;
import android.widget.ImageView.ScaleType;
import com.android.volley.RequestQueue;
import com.google.android.gms.tasks.C10689a;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10694d;
import java.util.Map;

public final class zzae {
    private final RequestQueue zza;

    zzae(RequestQueue requestQueue) {
        this.zza = requestQueue;
    }

    public final <HttpPhotoResponseT extends zzaj<Object, ? extends Object>> C10693c<HttpPhotoResponseT> zza(zzak<Object, ?> zzak, zzao<HttpPhotoResponseT> zzao) {
        C10694d dVar;
        String zzd = zzak.zzd();
        Map zzc = zzak.zzc();
        C10689a zzb = zzak.zzb();
        if (zzb != null) {
            dVar = new C10694d(zzb);
        } else {
            dVar = new C10694d();
        }
        C10694d dVar2 = dVar;
        zzai zzai = new zzai(this, zzd, new zzad(zzao, dVar2), 0, 0, ScaleType.CENTER, Config.ARGB_8888, new zzag(dVar2), zzc);
        if (zzb != null) {
            Class<zzai> cls = zzai.class;
            zzb.mo29297a(zzaf.zza(zzai));
        }
        this.zza.mo23548a(zzai);
        return dVar2.mo29325a();
    }
}
