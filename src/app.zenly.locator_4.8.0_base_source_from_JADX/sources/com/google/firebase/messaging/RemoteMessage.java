package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import java.util.Map;
import p214e.p228e.C7571a;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Creator<RemoteMessage> CREATOR = new C11109h();

    /* renamed from: e */
    Bundle f28786e;

    /* renamed from: f */
    private Map<String, String> f28787f;

    public RemoteMessage(Bundle bundle) {
        this.f28786e = bundle;
    }

    /* renamed from: a */
    public final Map<String, String> mo32348a() {
        if (this.f28787f == null) {
            Bundle bundle = this.f28786e;
            C7571a aVar = new C7571a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        aVar.put(str, str2);
                    }
                }
            }
            this.f28787f = aVar;
        }
        return this.f28787f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25577a(parcel, 2, this.f28786e, false);
        C10134a.m25571a(parcel, a);
    }
}
