package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.C10120k.C10121a;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Creator<StreetViewPanoramaOrientation> CREATOR = new C10664z();

    /* renamed from: e */
    public final float f27702e;

    /* renamed from: f */
    public final float f27703f;

    /* renamed from: com.google.android.gms.maps.model.StreetViewPanoramaOrientation$a */
    public static final class C10632a {

        /* renamed from: a */
        public float f27704a;

        /* renamed from: b */
        public float f27705b;

        /* renamed from: a */
        public final C10632a mo29172a(float f) {
            this.f27704a = f;
            return this;
        }

        /* renamed from: b */
        public final C10632a mo29174b(float f) {
            this.f27705b = f;
            return this;
        }

        /* renamed from: a */
        public final StreetViewPanoramaOrientation mo29173a() {
            return new StreetViewPanoramaOrientation(this.f27705b, this.f27704a);
        }
    }

    public StreetViewPanoramaOrientation(float f, float f2) {
        boolean z = -90.0f <= f && f <= 90.0f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f);
        C10123l.m25513a(z, (Object) sb.toString());
        this.f27702e = f + 0.0f;
        if (((double) f2) <= 0.0d) {
            f2 = (f2 % 360.0f) + 360.0f;
        }
        this.f27703f = f2 % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.f27702e) == Float.floatToIntBits(streetViewPanoramaOrientation.f27702e) && Float.floatToIntBits(this.f27703f) == Float.floatToIntBits(streetViewPanoramaOrientation.f27703f);
    }

    public int hashCode() {
        return C10120k.m25499a(Float.valueOf(this.f27702e), Float.valueOf(this.f27703f));
    }

    public String toString() {
        C10121a a = C10120k.m25500a((Object) this);
        a.mo27499a("tilt", Float.valueOf(this.f27702e));
        a.mo27499a("bearing", Float.valueOf(this.f27703f));
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25574a(parcel, 2, this.f27702e);
        C10134a.m25574a(parcel, 3, this.f27703f);
        C10134a.m25571a(parcel, a);
    }
}
