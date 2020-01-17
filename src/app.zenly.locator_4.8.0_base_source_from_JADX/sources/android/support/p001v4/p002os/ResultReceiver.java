package android.support.p001v4.p002os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.p001v4.p002os.IResultReceiver.C0077a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.os.ResultReceiver */
public class ResultReceiver implements Parcelable {
    public static final Creator<ResultReceiver> CREATOR = new C0079a();

    /* renamed from: e */
    final boolean f120e = false;

    /* renamed from: f */
    final Handler f121f = null;

    /* renamed from: g */
    IResultReceiver f122g;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    static class C0079a implements Creator<ResultReceiver> {
        C0079a() {
        }

        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    class C0080b extends C0077a {
        C0080b() {
        }

        public void send(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f121f;
            if (handler != null) {
                handler.post(new C0081c(i, bundle));
            } else {
                resultReceiver.mo33a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    class C0081c implements Runnable {

        /* renamed from: e */
        final int f124e;

        /* renamed from: f */
        final Bundle f125f;

        C0081c(int i, Bundle bundle) {
            this.f124e = i;
            this.f125f = bundle;
        }

        public void run() {
            ResultReceiver.this.mo33a(this.f124e, this.f125f);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f122g = C0077a.m171a(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33a(int i, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo262b(int i, Bundle bundle) {
        if (this.f120e) {
            Handler handler = this.f121f;
            if (handler != null) {
                handler.post(new C0081c(i, bundle));
            } else {
                mo33a(i, bundle);
            }
            return;
        }
        IResultReceiver iResultReceiver = this.f122g;
        if (iResultReceiver != null) {
            try {
                iResultReceiver.send(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f122g == null) {
                this.f122g = new C0080b();
            }
            parcel.writeStrongBinder(this.f122g.asBinder());
        }
    }
}
