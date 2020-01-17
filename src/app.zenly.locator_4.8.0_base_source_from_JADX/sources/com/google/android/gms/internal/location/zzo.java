package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.location.C10574g0;
import com.google.android.gms.location.zzr;

public final class zzo extends AbstractSafeParcelable {
    public static final Creator<zzo> CREATOR = new C10505k0();

    /* renamed from: e */
    private int f27466e;

    /* renamed from: f */
    private zzm f27467f;

    /* renamed from: g */
    private zzr f27468g;

    /* renamed from: h */
    private zzaj f27469h;

    zzo(int i, zzm zzm, IBinder iBinder, IBinder iBinder2) {
        this.f27466e = i;
        this.f27467f = zzm;
        zzaj zzaj = null;
        this.f27468g = iBinder == null ? null : C10574g0.m27022a(iBinder);
        if (!(iBinder2 == null || iBinder2 == null)) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzaj = queryLocalInterface instanceof zzaj ? (zzaj) queryLocalInterface : new C10504k(iBinder2);
        }
        this.f27469h = zzaj;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f27466e);
        C10134a.m25580a(parcel, 2, (Parcelable) this.f27467f, i, false);
        zzr zzr = this.f27468g;
        IBinder iBinder = null;
        C10134a.m25578a(parcel, 3, zzr == null ? null : zzr.asBinder(), false);
        zzaj zzaj = this.f27469h;
        if (zzaj != null) {
            iBinder = zzaj.asBinder();
        }
        C10134a.m25578a(parcel, 4, iBinder, false);
        C10134a.m25571a(parcel, a);
    }
}
