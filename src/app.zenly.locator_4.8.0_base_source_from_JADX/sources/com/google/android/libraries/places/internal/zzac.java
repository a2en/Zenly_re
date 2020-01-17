package com.google.android.libraries.places.internal;

import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.C8734k;
import java.util.Map;
import org.json.JSONObject;

final class zzac extends C8734k {
    private final /* synthetic */ Map zza;

    zzac(zzy zzy, int i, String str, JSONObject jSONObject, Listener listener, ErrorListener errorListener, Map map) {
        this.zza = map;
        super(0, str, null, listener, errorListener);
    }

    public final Map<String, String> getHeaders() {
        return this.zza;
    }
}
