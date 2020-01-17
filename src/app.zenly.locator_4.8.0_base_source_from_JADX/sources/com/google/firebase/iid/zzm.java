package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;

public class zzm implements Parcelable {
    public static final Creator<zzm> CREATOR = new C11070k0();

    /* renamed from: e */
    private Messenger f28784e;

    /* renamed from: f */
    private C11086s0 f28785f;

    /* renamed from: com.google.firebase.iid.zzm$a */
    public static final class C11099a extends ClassLoader {
        /* access modifiers changed from: protected */
        public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (FirebaseInstanceId.zzm()) {
                Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            }
            return zzm.class;
        }
    }

    public zzm(IBinder iBinder) {
        if (VERSION.SDK_INT >= 21) {
            this.f28784e = new Messenger(iBinder);
        } else {
            this.f28785f = new C11090u0(iBinder);
        }
    }

    /* renamed from: a */
    public final void mo32337a(Message message) throws RemoteException {
        Messenger messenger = this.f28784e;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f28785f.send(message);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m28579a().equals(((zzm) obj).m28579a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return m28579a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f28784e;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f28785f.asBinder());
        }
    }

    /* renamed from: a */
    private final IBinder m28579a() {
        Messenger messenger = this.f28784e;
        return messenger != null ? messenger.getBinder() : this.f28785f.asBinder();
    }
}
