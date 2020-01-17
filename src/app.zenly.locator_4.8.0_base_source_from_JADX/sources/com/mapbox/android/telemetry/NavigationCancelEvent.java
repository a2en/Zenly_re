package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p315j.C11257b;
import com.mapbox.android.telemetry.Event.C11300a;

class NavigationCancelEvent extends Event implements Parcelable {
    public static final Creator<NavigationCancelEvent> CREATOR = new C11309a();

    /* renamed from: f */
    private final String f29290f;
    @C11257b(C11337e.class)

    /* renamed from: g */
    private NavigationCancelData f29291g;
    @C11257b(C11364j0.class)

    /* renamed from: h */
    private NavigationMetadata f29292h;

    /* renamed from: com.mapbox.android.telemetry.NavigationCancelEvent$a */
    static class C11309a implements Creator<NavigationCancelEvent> {
        C11309a() {
        }

        public NavigationCancelEvent createFromParcel(Parcel parcel) {
            return new NavigationCancelEvent(parcel, null);
        }

        public NavigationCancelEvent[] newArray(int i) {
            return new NavigationCancelEvent[i];
        }
    }

    /* synthetic */ NavigationCancelEvent(Parcel parcel, C11309a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11300a mo32828a() {
        return C11300a.NAV_CANCEL;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public NavigationCancelData mo32890b() {
        return this.f29291g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo32891c() {
        return this.f29290f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public NavigationMetadata mo32892d() {
        return this.f29292h;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29290f);
        parcel.writeParcelable(this.f29291g, i);
        parcel.writeParcelable(this.f29292h, i);
    }

    private NavigationCancelEvent(Parcel parcel) {
        this.f29290f = parcel.readString();
        this.f29291g = (NavigationCancelData) parcel.readParcelable(NavigationCancelData.class.getClassLoader());
        this.f29292h = (NavigationMetadata) parcel.readParcelable(NavigationMetadata.class.getClassLoader());
    }
}
