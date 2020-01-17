package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.C10120k.C10121a;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<LatLngBounds> CREATOR = new C10653o();

    /* renamed from: e */
    public final LatLng f27650e;

    /* renamed from: f */
    public final LatLng f27651f;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        C10123l.m25506a(latLng, (Object) "null southwest");
        C10123l.m25506a(latLng2, (Object) "null northeast");
        C10123l.m25514a(latLng2.f27648e >= latLng.f27648e, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(latLng.f27648e), Double.valueOf(latLng2.f27648e));
        this.f27650e = latLng;
        this.f27651f = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f27650e.equals(latLngBounds.f27650e) && this.f27651f.equals(latLngBounds.f27651f);
    }

    public final int hashCode() {
        return C10120k.m25499a(this.f27650e, this.f27651f);
    }

    public final String toString() {
        C10121a a = C10120k.m25500a((Object) this);
        a.mo27499a("southwest", this.f27650e);
        a.mo27499a("northeast", this.f27651f);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25580a(parcel, 2, (Parcelable) this.f27650e, i, false);
        C10134a.m25580a(parcel, 3, (Parcelable) this.f27651f, i, false);
        C10134a.m25571a(parcel, a);
    }
}
