package androidx.navigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.UUID;

@SuppressLint({"BanParcelableUsage"})
final class NavBackStackEntryState implements Parcelable {
    public static final Creator<NavBackStackEntryState> CREATOR = new C0942a();

    /* renamed from: e */
    private final UUID f3626e;

    /* renamed from: f */
    private final int f3627f;

    /* renamed from: g */
    private final Bundle f3628g;

    /* renamed from: h */
    private final Bundle f3629h;

    /* renamed from: androidx.navigation.NavBackStackEntryState$a */
    static class C0942a implements Creator<NavBackStackEntryState> {
        C0942a() {
        }

        public NavBackStackEntryState createFromParcel(Parcel parcel) {
            return new NavBackStackEntryState(parcel);
        }

        public NavBackStackEntryState[] newArray(int i) {
            return new NavBackStackEntryState[i];
        }
    }

    NavBackStackEntryState(C0963g gVar) {
        this.f3626e = gVar.f3690j;
        this.f3627f = gVar.mo4710b().mo4734d();
        this.f3628g = gVar.mo4706a();
        this.f3629h = new Bundle();
        gVar.mo4707a(this.f3629h);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Bundle mo4621a() {
        return this.f3628g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo4622b() {
        return this.f3627f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Bundle mo4623c() {
        return this.f3629h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public UUID mo4624d() {
        return this.f3626e;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3626e.toString());
        parcel.writeInt(this.f3627f);
        parcel.writeBundle(this.f3628g);
        parcel.writeBundle(this.f3629h);
    }

    NavBackStackEntryState(Parcel parcel) {
        this.f3626e = UUID.fromString(parcel.readString());
        this.f3627f = parcel.readInt();
        this.f3628g = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        this.f3629h = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
    }
}
