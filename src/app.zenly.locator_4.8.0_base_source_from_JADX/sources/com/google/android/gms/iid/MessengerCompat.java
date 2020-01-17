package com.google.android.gms.iid;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class MessengerCompat implements ReflectedParcelable {
    public static final Creator<MessengerCompat> CREATOR = new C10240p();

    /* renamed from: e */
    private Messenger f26828e;

    /* renamed from: f */
    private zzl f26829f;

    public MessengerCompat(IBinder iBinder) {
        zzl zzl;
        if (VERSION.SDK_INT >= 21) {
            this.f26828e = new Messenger(iBinder);
            return;
        }
        if (iBinder == null) {
            zzl = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
            if (queryLocalInterface instanceof zzl) {
                zzl = (zzl) queryLocalInterface;
            } else {
                zzl = new C10238n(iBinder);
            }
        }
        this.f26829f = zzl;
    }

    /* renamed from: a */
    private final IBinder m25847a() {
        Messenger messenger = this.f26828e;
        return messenger != null ? messenger.getBinder() : this.f26829f.asBinder();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m25847a().equals(((MessengerCompat) obj).m25847a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return m25847a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f26828e;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f26829f.asBinder());
        }
    }
}
