package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.internal.location.zzbh;
import java.util.ArrayList;
import java.util.List;

public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Creator<GeofencingRequest> CREATOR = new C10572f0();

    /* renamed from: e */
    private final List<zzbh> f27501e;

    /* renamed from: f */
    private final int f27502f;

    /* renamed from: g */
    private final String f27503g;

    /* renamed from: com.google.android.gms.location.GeofencingRequest$a */
    public static final class C10557a {

        /* renamed from: a */
        private final List<zzbh> f27504a = new ArrayList();

        /* renamed from: b */
        private int f27505b = 5;

        /* renamed from: c */
        private String f27506c = "";

        /* renamed from: a */
        public final C10557a mo28631a(int i) {
            this.f27505b = i & 7;
            return this;
        }

        /* renamed from: a */
        public final C10557a mo28632a(Geofence geofence) {
            C10123l.m25506a(geofence, (Object) "geofence can't be null.");
            C10123l.m25513a(geofence instanceof zzbh, (Object) "Geofence must be created using Geofence.Builder.");
            this.f27504a.add((zzbh) geofence);
            return this;
        }

        /* renamed from: a */
        public final C10557a mo28633a(List<Geofence> list) {
            if (list != null && !list.isEmpty()) {
                for (Geofence geofence : list) {
                    if (geofence != null) {
                        mo28632a(geofence);
                    }
                }
            }
            return this;
        }

        /* renamed from: a */
        public final GeofencingRequest mo28634a() {
            C10123l.m25513a(!this.f27504a.isEmpty(), (Object) "No geofence has been added to this request.");
            return new GeofencingRequest(this.f27504a, this.f27505b, this.f27506c);
        }
    }

    GeofencingRequest(List<zzbh> list, int i, String str) {
        this.f27501e = list;
        this.f27502f = i;
        this.f27503g = str;
    }

    /* renamed from: a */
    public int mo28628a() {
        return this.f27502f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeofencingRequest[");
        sb.append("geofences=");
        sb.append(this.f27501e);
        int i = this.f27502f;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(", initialTrigger=");
        sb2.append(i);
        sb2.append(", ");
        sb.append(sb2.toString());
        String valueOf = String.valueOf(this.f27503g);
        String str = "tag=";
        sb.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25597c(parcel, 1, this.f27501e, false);
        C10134a.m25575a(parcel, 2, mo28628a());
        C10134a.m25583a(parcel, 3, this.f27503g, false);
        C10134a.m25571a(parcel, a);
    }
}
