package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.C10120k.C10121a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final Creator<StreetViewPanoramaLink> CREATOR = new C10662x();

    /* renamed from: e */
    public final String f27697e;

    /* renamed from: f */
    public final float f27698f;

    public StreetViewPanoramaLink(String str, float f) {
        this.f27697e = str;
        if (((double) f) <= 0.0d) {
            f = (f % 360.0f) + 360.0f;
        }
        this.f27698f = f % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.f27697e.equals(streetViewPanoramaLink.f27697e) && Float.floatToIntBits(this.f27698f) == Float.floatToIntBits(streetViewPanoramaLink.f27698f);
    }

    public int hashCode() {
        return C10120k.m25499a(this.f27697e, Float.valueOf(this.f27698f));
    }

    public String toString() {
        C10121a a = C10120k.m25500a((Object) this);
        a.mo27499a("panoId", this.f27697e);
        a.mo27499a("bearing", Float.valueOf(this.f27698f));
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25583a(parcel, 2, this.f27697e, false);
        C10134a.m25574a(parcel, 3, this.f27698f);
        C10134a.m25571a(parcel, a);
    }
}
