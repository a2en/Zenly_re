package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Creator<LocationSettingsRequest> CREATOR = new C10586n();

    /* renamed from: e */
    private final List<LocationRequest> f27514e;

    /* renamed from: f */
    private final boolean f27515f;

    /* renamed from: g */
    private final boolean f27516g;

    /* renamed from: h */
    private zzae f27517h;

    /* renamed from: com.google.android.gms.location.LocationSettingsRequest$a */
    public static final class C10558a {

        /* renamed from: a */
        private final ArrayList<LocationRequest> f27518a = new ArrayList<>();

        /* renamed from: b */
        private boolean f27519b = false;

        /* renamed from: c */
        private boolean f27520c = false;

        /* renamed from: a */
        public final C10558a mo28668a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f27518a.add(locationRequest);
            }
            return this;
        }

        /* renamed from: a */
        public final C10558a mo28669a(boolean z) {
            this.f27519b = z;
            return this;
        }

        /* renamed from: a */
        public final LocationSettingsRequest mo28670a() {
            return new LocationSettingsRequest(this.f27518a, this.f27519b, this.f27520c, null);
        }
    }

    LocationSettingsRequest(List<LocationRequest> list, boolean z, boolean z2, zzae zzae) {
        this.f27514e = list;
        this.f27515f = z;
        this.f27516g = z2;
        this.f27517h = zzae;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25597c(parcel, 1, Collections.unmodifiableList(this.f27514e), false);
        C10134a.m25586a(parcel, 2, this.f27515f);
        C10134a.m25586a(parcel, 3, this.f27516g);
        C10134a.m25580a(parcel, 5, (Parcelable) this.f27517h, i, false);
        C10134a.m25571a(parcel, a);
    }
}
