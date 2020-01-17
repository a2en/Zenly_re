package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import java.util.ArrayList;
import java.util.Map;

public final class zam extends AbstractSafeParcelable {
    public static final Creator<zam> CREATOR = new C10159c();

    /* renamed from: e */
    private final int f26703e;

    /* renamed from: f */
    final String f26704f;

    /* renamed from: g */
    final ArrayList<zal> f26705g;

    zam(int i, String str, ArrayList<zal> arrayList) {
        this.f26703e = i;
        this.f26704f = str;
        this.f26705g = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26703e);
        C10134a.m25583a(parcel, 2, this.f26704f, false);
        C10134a.m25597c(parcel, 3, this.f26705g, false);
        C10134a.m25571a(parcel, a);
    }

    zam(String str, Map<String, Field<?, ?>> map) {
        ArrayList<zal> arrayList;
        this.f26703e = 1;
        this.f26704f = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String str2 : map.keySet()) {
                arrayList.add(new zal(str2, (Field) map.get(str2)));
            }
        }
        this.f26705g = arrayList;
    }
}
