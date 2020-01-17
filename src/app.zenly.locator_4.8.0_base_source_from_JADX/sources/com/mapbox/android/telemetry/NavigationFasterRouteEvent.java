package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p315j.C11257b;
import com.mapbox.android.telemetry.Event.C11300a;

class NavigationFasterRouteEvent extends Event implements Parcelable {
    public static final Creator<NavigationFasterRouteEvent> CREATOR = new C11311a();

    /* renamed from: f */
    private final String f29295f;
    @C11257b(C11364j0.class)

    /* renamed from: g */
    private NavigationMetadata f29296g;
    @C11257b(C11370l0.class)

    /* renamed from: h */
    private NavigationNewData f29297h;

    /* renamed from: i */
    private NavigationStepMetadata f29298i;

    /* renamed from: com.mapbox.android.telemetry.NavigationFasterRouteEvent$a */
    static class C11311a implements Creator<NavigationFasterRouteEvent> {
        C11311a() {
        }

        public NavigationFasterRouteEvent createFromParcel(Parcel parcel) {
            return new NavigationFasterRouteEvent(parcel, null);
        }

        public NavigationFasterRouteEvent[] newArray(int i) {
            return new NavigationFasterRouteEvent[i];
        }
    }

    /* synthetic */ NavigationFasterRouteEvent(Parcel parcel, C11311a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11300a mo32828a() {
        return C11300a.NAV_FASTER_ROUTE;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo32903b() {
        return this.f29295f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public NavigationMetadata mo32904c() {
        return this.f29296g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public NavigationNewData mo32905d() {
        return this.f29297h;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public NavigationStepMetadata mo32907e() {
        return this.f29298i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29295f);
        parcel.writeParcelable(this.f29297h, i);
        parcel.writeParcelable(this.f29298i, i);
        parcel.writeParcelable(this.f29296g, i);
    }

    private NavigationFasterRouteEvent(Parcel parcel) {
        this.f29296g = null;
        this.f29297h = null;
        this.f29298i = null;
        this.f29295f = parcel.readString();
        this.f29297h = (NavigationNewData) parcel.readParcelable(NavigationNewData.class.getClassLoader());
        this.f29298i = (NavigationStepMetadata) parcel.readParcelable(NavigationStepMetadata.class.getClassLoader());
        this.f29296g = (NavigationMetadata) parcel.readParcelable(NavigationMetadata.class.getClassLoader());
    }
}
