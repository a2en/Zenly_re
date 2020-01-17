package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class BinderWrapper implements Parcelable {
    public static final Creator<BinderWrapper> CREATOR = new C10102c0();

    /* renamed from: e */
    private IBinder f26556e;

    public BinderWrapper() {
        this.f26556e = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f26556e);
    }

    private BinderWrapper(Parcel parcel) {
        this.f26556e = null;
        this.f26556e = parcel.readStrongBinder();
    }

    /* synthetic */ BinderWrapper(Parcel parcel, C10102c0 c0Var) {
        this(parcel);
    }
}
