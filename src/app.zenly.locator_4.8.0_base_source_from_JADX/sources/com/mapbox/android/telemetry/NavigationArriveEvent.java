package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p315j.C11257b;
import com.mapbox.android.telemetry.Event.C11300a;

class NavigationArriveEvent extends Event implements Parcelable {
    public static final Creator<NavigationArriveEvent> CREATOR = new C11307a();

    /* renamed from: f */
    private final String f29285f;
    @C11257b(C11364j0.class)

    /* renamed from: g */
    private NavigationMetadata f29286g;

    /* renamed from: com.mapbox.android.telemetry.NavigationArriveEvent$a */
    static class C11307a implements Creator<NavigationArriveEvent> {
        C11307a() {
        }

        public NavigationArriveEvent createFromParcel(Parcel parcel) {
            return new NavigationArriveEvent(parcel, null);
        }

        public NavigationArriveEvent[] newArray(int i) {
            return new NavigationArriveEvent[i];
        }
    }

    /* synthetic */ NavigationArriveEvent(Parcel parcel, C11307a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11300a mo32828a() {
        return C11300a.NAV_ARRIVE;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo32880b() {
        return this.f29285f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public NavigationMetadata mo32881c() {
        return this.f29286g;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29285f);
        parcel.writeParcelable(this.f29286g, i);
    }

    private NavigationArriveEvent(Parcel parcel) {
        this.f29285f = parcel.readString();
        this.f29286g = (NavigationMetadata) parcel.readParcelable(NavigationMetadata.class.getClassLoader());
    }
}
