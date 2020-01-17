package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C10011b;
import java.util.ArrayList;
import p214e.p228e.C7571a;

public class AvailabilityException extends Exception {

    /* renamed from: e */
    private final C7571a<C10011b<?>, ConnectionResult> f26269e;

    public AvailabilityException(C7571a<C10011b<?>, ConnectionResult> aVar) {
        this.f26269e = aVar;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C10011b bVar : this.f26269e.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.f26269e.get(bVar);
            if (connectionResult.isSuccess()) {
                z = false;
            }
            String a = bVar.mo27147a();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
