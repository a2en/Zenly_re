package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.dynamic.IObjectWrapper.C10182a;

public class Cap extends AbstractSafeParcelable {
    public static final Creator<Cap> CREATOR = new C10650l();

    /* renamed from: e */
    private final int f27620e;

    /* renamed from: f */
    private final C10633a f27621f;

    /* renamed from: g */
    private final Float f27622g;

    static {
        Class<Cap> cls = Cap.class;
    }

    private Cap(int i, C10633a aVar, Float f) {
        C10123l.m25513a(i != 3 || (aVar != null && (f != null && (f.floatValue() > 0.0f ? 1 : (f.floatValue() == 0.0f ? 0 : -1)) > 0)), (Object) String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[]{Integer.valueOf(i), aVar, f}));
        this.f27620e = i;
        this.f27621f = aVar;
        this.f27622g = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.f27620e == cap.f27620e && C10120k.m25501a(this.f27621f, cap.f27621f) && C10120k.m25501a(this.f27622g, cap.f27622g);
    }

    public int hashCode() {
        return C10120k.m25499a(Integer.valueOf(this.f27620e), this.f27621f, this.f27622g);
    }

    public String toString() {
        int i = this.f27620e;
        StringBuilder sb = new StringBuilder(23);
        sb.append("[Cap: type=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 2, this.f27620e);
        C10633a aVar = this.f27621f;
        if (aVar == null) {
            iBinder = null;
        } else {
            iBinder = aVar.mo29192a().asBinder();
        }
        C10134a.m25578a(parcel, 3, iBinder, false);
        C10134a.m25581a(parcel, 4, this.f27622g, false);
        C10134a.m25571a(parcel, a);
    }

    Cap(int i, IBinder iBinder, Float f) {
        C10633a aVar;
        if (iBinder == null) {
            aVar = null;
        } else {
            aVar = new C10633a(C10182a.m25696a(iBinder));
        }
        this(i, aVar, f);
    }

    protected Cap(int i) {
        this(i, (C10633a) null, (Float) null);
    }
}
