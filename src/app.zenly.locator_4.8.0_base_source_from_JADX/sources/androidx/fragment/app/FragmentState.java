package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Creator<FragmentState> CREATOR = new C0791a();

    /* renamed from: e */
    final String f3227e;

    /* renamed from: f */
    final String f3228f;

    /* renamed from: g */
    final boolean f3229g;

    /* renamed from: h */
    final int f3230h;

    /* renamed from: i */
    final int f3231i;

    /* renamed from: j */
    final String f3232j;

    /* renamed from: k */
    final boolean f3233k;

    /* renamed from: l */
    final boolean f3234l;

    /* renamed from: m */
    final boolean f3235m;

    /* renamed from: n */
    final Bundle f3236n;

    /* renamed from: o */
    final boolean f3237o;

    /* renamed from: p */
    final int f3238p;

    /* renamed from: q */
    Bundle f3239q;

    /* renamed from: androidx.fragment.app.FragmentState$a */
    static class C0791a implements Creator<FragmentState> {
        C0791a() {
        }

        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    FragmentState(Fragment fragment) {
        this.f3227e = fragment.getClass().getName();
        this.f3228f = fragment.mWho;
        this.f3229g = fragment.mFromLayout;
        this.f3230h = fragment.mFragmentId;
        this.f3231i = fragment.mContainerId;
        this.f3232j = fragment.mTag;
        this.f3233k = fragment.mRetainInstance;
        this.f3234l = fragment.mRemoving;
        this.f3235m = fragment.mDetached;
        this.f3236n = fragment.mArguments;
        this.f3237o = fragment.mHidden;
        this.f3238p = fragment.mMaxState.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3227e);
        sb.append(" (");
        sb.append(this.f3228f);
        sb.append(")}:");
        if (this.f3229g) {
            sb.append(" fromLayout");
        }
        if (this.f3231i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3231i));
        }
        String str = this.f3232j;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3232j);
        }
        if (this.f3233k) {
            sb.append(" retainInstance");
        }
        if (this.f3234l) {
            sb.append(" removing");
        }
        if (this.f3235m) {
            sb.append(" detached");
        }
        if (this.f3237o) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3227e);
        parcel.writeString(this.f3228f);
        parcel.writeInt(this.f3229g ? 1 : 0);
        parcel.writeInt(this.f3230h);
        parcel.writeInt(this.f3231i);
        parcel.writeString(this.f3232j);
        parcel.writeInt(this.f3233k ? 1 : 0);
        parcel.writeInt(this.f3234l ? 1 : 0);
        parcel.writeInt(this.f3235m ? 1 : 0);
        parcel.writeBundle(this.f3236n);
        parcel.writeInt(this.f3237o ? 1 : 0);
        parcel.writeBundle(this.f3239q);
        parcel.writeInt(this.f3238p);
    }

    FragmentState(Parcel parcel) {
        this.f3227e = parcel.readString();
        this.f3228f = parcel.readString();
        boolean z = true;
        this.f3229g = parcel.readInt() != 0;
        this.f3230h = parcel.readInt();
        this.f3231i = parcel.readInt();
        this.f3232j = parcel.readString();
        this.f3233k = parcel.readInt() != 0;
        this.f3234l = parcel.readInt() != 0;
        this.f3235m = parcel.readInt() != 0;
        this.f3236n = parcel.readBundle();
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.f3237o = z;
        this.f3239q = parcel.readBundle();
        this.f3238p = parcel.readInt();
    }
}
