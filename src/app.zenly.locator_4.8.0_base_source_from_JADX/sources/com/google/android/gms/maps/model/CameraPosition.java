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

public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<CameraPosition> CREATOR = new C10649k();

    /* renamed from: e */
    public final LatLng f27612e;

    /* renamed from: f */
    public final float f27613f;

    /* renamed from: g */
    public final float f27614g;

    /* renamed from: h */
    public final float f27615h;

    /* renamed from: com.google.android.gms.maps.model.CameraPosition$a */
    public static final class C10631a {

        /* renamed from: a */
        private LatLng f27616a;

        /* renamed from: b */
        private float f27617b;

        /* renamed from: c */
        private float f27618c;

        /* renamed from: d */
        private float f27619d;

        /* renamed from: a */
        public final C10631a mo29071a(LatLng latLng) {
            this.f27616a = latLng;
            return this;
        }

        /* renamed from: b */
        public final C10631a mo29073b(float f) {
            this.f27618c = f;
            return this;
        }

        /* renamed from: c */
        public final C10631a mo29074c(float f) {
            this.f27617b = f;
            return this;
        }

        /* renamed from: a */
        public final C10631a mo29070a(float f) {
            this.f27619d = f;
            return this;
        }

        /* renamed from: a */
        public final CameraPosition mo29072a() {
            return new CameraPosition(this.f27616a, this.f27617b, this.f27618c, this.f27619d);
        }
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        C10123l.m25506a(latLng, (Object) "null camera target");
        C10123l.m25514a(0.0f <= f2 && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.f27612e = latLng;
        this.f27613f = f;
        this.f27614g = f2 + 0.0f;
        if (((double) f3) <= 0.0d) {
            f3 = (f3 % 360.0f) + 360.0f;
        }
        this.f27615h = f3 % 360.0f;
    }

    /* renamed from: a */
    public static C10631a m27096a() {
        return new C10631a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f27612e.equals(cameraPosition.f27612e) && Float.floatToIntBits(this.f27613f) == Float.floatToIntBits(cameraPosition.f27613f) && Float.floatToIntBits(this.f27614g) == Float.floatToIntBits(cameraPosition.f27614g) && Float.floatToIntBits(this.f27615h) == Float.floatToIntBits(cameraPosition.f27615h);
    }

    public final int hashCode() {
        return C10120k.m25499a(this.f27612e, Float.valueOf(this.f27613f), Float.valueOf(this.f27614g), Float.valueOf(this.f27615h));
    }

    public final String toString() {
        C10121a a = C10120k.m25500a((Object) this);
        a.mo27499a("target", this.f27612e);
        a.mo27499a("zoom", Float.valueOf(this.f27613f));
        a.mo27499a("tilt", Float.valueOf(this.f27614g));
        a.mo27499a("bearing", Float.valueOf(this.f27615h));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25580a(parcel, 2, (Parcelable) this.f27612e, i, false);
        C10134a.m25574a(parcel, 3, this.f27613f);
        C10134a.m25574a(parcel, 4, this.f27614g);
        C10134a.m25574a(parcel, 5, this.f27615h);
        C10134a.m25571a(parcel, a);
    }
}
