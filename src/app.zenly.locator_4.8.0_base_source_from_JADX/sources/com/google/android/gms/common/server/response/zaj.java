package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class zaj extends AbstractSafeParcelable {
    public static final Creator<zaj> CREATOR = new C10160d();

    /* renamed from: e */
    private final int f26697e;

    /* renamed from: f */
    private final HashMap<String, Map<String, Field<?, ?>>> f26698f;

    /* renamed from: g */
    private final String f26699g;

    zaj(int i, ArrayList<zam> arrayList, String str) {
        this.f26697e = i;
        HashMap<String, Map<String, Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zam zam = (zam) arrayList.get(i2);
            String str2 = zam.f26704f;
            HashMap hashMap2 = new HashMap();
            int size2 = zam.f26705g.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zal zal = (zal) zam.f26705g.get(i3);
                hashMap2.put(zal.f26701f, zal.f26702g);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f26698f = hashMap;
        C10123l.m25505a(str);
        this.f26699g = str;
        mo27575a();
    }

    /* renamed from: a */
    public final void mo27575a() {
        for (String str : this.f26698f.keySet()) {
            Map map = (Map) this.f26698f.get(str);
            for (String str2 : map.keySet()) {
                ((Field) map.get(str2)).mo27554a(this);
            }
        }
    }

    /* renamed from: b */
    public final String mo27576b() {
        return this.f26699g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f26698f.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.f26698f.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26697e);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f26698f.keySet()) {
            arrayList.add(new zam(str, (Map) this.f26698f.get(str)));
        }
        C10134a.m25597c(parcel, 2, arrayList, false);
        C10134a.m25583a(parcel, 3, this.f26699g, false);
        C10134a.m25571a(parcel, a);
    }

    /* renamed from: a */
    public final Map<String, Field<?, ?>> mo27574a(String str) {
        return (Map) this.f26698f.get(str);
    }
}
