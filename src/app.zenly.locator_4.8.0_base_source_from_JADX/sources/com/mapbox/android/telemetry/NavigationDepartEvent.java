package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p315j.C11257b;
import com.mapbox.android.telemetry.Event.C11300a;

class NavigationDepartEvent extends Event implements Parcelable {
    public static final Creator<NavigationDepartEvent> CREATOR = new C11310a();

    /* renamed from: f */
    private final String f29293f;
    @C11257b(C11364j0.class)

    /* renamed from: g */
    private NavigationMetadata f29294g;

    /* renamed from: com.mapbox.android.telemetry.NavigationDepartEvent$a */
    static class C11310a implements Creator<NavigationDepartEvent> {
        C11310a() {
        }

        public NavigationDepartEvent createFromParcel(Parcel parcel) {
            return new NavigationDepartEvent(parcel, null);
        }

        public NavigationDepartEvent[] newArray(int i) {
            return new NavigationDepartEvent[i];
        }
    }

    /* synthetic */ NavigationDepartEvent(Parcel parcel, C11310a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11300a mo32828a() {
        return C11300a.NAV_DEPART;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo32897b() {
        return this.f29293f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public NavigationMetadata mo32898c() {
        return this.f29294g;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29293f);
        parcel.writeParcelable(this.f29294g, i);
    }

    private NavigationDepartEvent(Parcel parcel) {
        this.f29293f = parcel.readString();
        this.f29294g = (NavigationMetadata) parcel.readParcelable(NavigationMetadata.class.getClassLoader());
    }
}
