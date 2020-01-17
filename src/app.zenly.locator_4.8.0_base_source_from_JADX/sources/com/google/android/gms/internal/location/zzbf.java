package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.location.C10578i0;
import com.google.android.gms.location.C10582k0;
import com.google.android.gms.location.zzu;
import com.google.android.gms.location.zzx;

public final class zzbf extends AbstractSafeParcelable {
    public static final Creator<zzbf> CREATOR = new C10487b0();

    /* renamed from: e */
    private int f27446e;

    /* renamed from: f */
    private zzbd f27447f;

    /* renamed from: g */
    private zzx f27448g;

    /* renamed from: h */
    private PendingIntent f27449h;

    /* renamed from: i */
    private zzu f27450i;

    /* renamed from: j */
    private zzaj f27451j;

    zzbf(int i, zzbd zzbd, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.f27446e = i;
        this.f27447f = zzbd;
        zzaj zzaj = null;
        this.f27448g = iBinder == null ? null : C10582k0.m27027a(iBinder);
        this.f27449h = pendingIntent;
        this.f27450i = iBinder2 == null ? null : C10578i0.m27025a(iBinder2);
        if (!(iBinder3 == null || iBinder3 == null)) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzaj = queryLocalInterface instanceof zzaj ? (zzaj) queryLocalInterface : new C10504k(iBinder3);
        }
        this.f27451j = zzaj;
    }

    /* renamed from: a */
    public static zzbf m26932a(zzu zzu, zzaj zzaj) {
        zzbf zzbf = new zzbf(2, null, null, null, zzu.asBinder(), zzaj != null ? zzaj.asBinder() : null);
        return zzbf;
    }

    /* renamed from: a */
    public static zzbf m26933a(zzx zzx, zzaj zzaj) {
        zzbf zzbf = new zzbf(2, null, zzx.asBinder(), null, null, zzaj != null ? zzaj.asBinder() : null);
        return zzbf;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f27446e);
        C10134a.m25580a(parcel, 2, (Parcelable) this.f27447f, i, false);
        zzx zzx = this.f27448g;
        IBinder iBinder = null;
        C10134a.m25578a(parcel, 3, zzx == null ? null : zzx.asBinder(), false);
        C10134a.m25580a(parcel, 4, (Parcelable) this.f27449h, i, false);
        zzu zzu = this.f27450i;
        C10134a.m25578a(parcel, 5, zzu == null ? null : zzu.asBinder(), false);
        zzaj zzaj = this.f27451j;
        if (zzaj != null) {
            iBinder = zzaj.asBinder();
        }
        C10134a.m25578a(parcel, 6, iBinder, false);
        C10134a.m25571a(parcel, a);
    }
}
