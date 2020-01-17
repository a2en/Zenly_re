package com.google.android.libraries.places.internal;

import android.graphics.Bitmap.Config;
import android.widget.ImageView.ScaleType;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.C8733j;
import java.util.Map;

final class zzai extends C8733j {
    private final /* synthetic */ Map zza;

    zzai(zzae zzae, String str, Listener listener, int i, int i2, ScaleType scaleType, Config config, ErrorListener errorListener, Map map) {
        this.zza = map;
        super(str, listener, 0, 0, scaleType, config, errorListener);
    }

    public final Map<String, String> getHeaders() {
        return this.zza;
    }
}
