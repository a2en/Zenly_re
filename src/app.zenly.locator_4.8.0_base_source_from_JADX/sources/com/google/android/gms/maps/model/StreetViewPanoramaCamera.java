package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.C10120k.C10121a;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation.C10632a;

public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<StreetViewPanoramaCamera> CREATOR = new C10661w();

    /* renamed from: e */
    public final float f27694e;

    /* renamed from: f */
    public final float f27695f;

    /* renamed from: g */
    public final float f27696g;

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        boolean z = -90.0f <= f2 && f2 <= 90.0f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f2);
        C10123l.m25513a(z, (Object) sb.toString());
        if (((double) f) <= 0.0d) {
            f = 0.0f;
        }
        this.f27694e = f;
        this.f27695f = 0.0f + f2;
        this.f27696g = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        C10632a aVar = new C10632a();
        aVar.mo29174b(f2);
        aVar.mo29172a(f3);
        aVar.mo29173a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.f27694e) == Float.floatToIntBits(streetViewPanoramaCamera.f27694e) && Float.floatToIntBits(this.f27695f) == Float.floatToIntBits(streetViewPanoramaCamera.f27695f) && Float.floatToIntBits(this.f27696g) == Float.floatToIntBits(streetViewPanoramaCamera.f27696g);
    }

    public int hashCode() {
        return C10120k.m25499a(Float.valueOf(this.f27694e), Float.valueOf(this.f27695f), Float.valueOf(this.f27696g));
    }

    public String toString() {
        C10121a a = C10120k.m25500a((Object) this);
        a.mo27499a("zoom", Float.valueOf(this.f27694e));
        a.mo27499a("tilt", Float.valueOf(this.f27695f));
        a.mo27499a("bearing", Float.valueOf(this.f27696g));
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25574a(parcel, 2, this.f27694e);
        C10134a.m25574a(parcel, 3, this.f27695f);
        C10134a.m25574a(parcel, 4, this.f27696g);
        C10134a.m25571a(parcel, a);
    }
}
