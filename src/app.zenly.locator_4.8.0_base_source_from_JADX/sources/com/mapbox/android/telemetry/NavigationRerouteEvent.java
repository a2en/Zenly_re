package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p315j.C11257b;
import com.mapbox.android.telemetry.Event.C11300a;

class NavigationRerouteEvent extends Event implements Parcelable {
    public static final Creator<NavigationRerouteEvent> CREATOR = new C11316a();

    /* renamed from: f */
    private final String f29354f;
    @C11257b(C11364j0.class)

    /* renamed from: g */
    private NavigationMetadata f29355g;
    @C11257b(C11378m0.class)

    /* renamed from: h */
    private C11366k0 f29356h;
    @C11257b(C11336d0.class)

    /* renamed from: i */
    private NavigationLocationData f29357i;
    @C11257b(C11401w.class)

    /* renamed from: j */
    private FeedbackData f29358j;

    /* renamed from: k */
    private NavigationStepMetadata f29359k;

    /* renamed from: com.mapbox.android.telemetry.NavigationRerouteEvent$a */
    static class C11316a implements Creator<NavigationRerouteEvent> {
        C11316a() {
        }

        public NavigationRerouteEvent createFromParcel(Parcel parcel) {
            return new NavigationRerouteEvent(parcel, null);
        }

        public NavigationRerouteEvent[] newArray(int i) {
            return new NavigationRerouteEvent[i];
        }
    }

    /* synthetic */ NavigationRerouteEvent(Parcel parcel, C11316a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11300a mo32828a() {
        return C11300a.NAV_REROUTE;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo32933b() {
        return this.f29354f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public FeedbackData mo32934c() {
        return this.f29358j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public NavigationLocationData mo32935d() {
        return this.f29357i;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public NavigationMetadata mo32937e() {
        return this.f29355g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C11366k0 mo32938f() {
        return this.f29356h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public NavigationStepMetadata mo32939g() {
        return this.f29359k;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29354f);
        parcel.writeParcelable(this.f29355g, i);
        parcel.writeParcelable(this.f29357i, i);
        parcel.writeParcelable(this.f29358j, i);
        parcel.writeParcelable(this.f29359k, i);
    }

    private NavigationRerouteEvent(Parcel parcel) {
        this.f29359k = null;
        this.f29354f = parcel.readString();
        this.f29355g = (NavigationMetadata) parcel.readParcelable(NavigationMetadata.class.getClassLoader());
        this.f29357i = (NavigationLocationData) parcel.readParcelable(NavigationLocationData.class.getClassLoader());
        this.f29358j = (FeedbackData) parcel.readParcelable(FeedbackData.class.getClassLoader());
        this.f29359k = (NavigationStepMetadata) parcel.readParcelable(NavigationStepMetadata.class.getClassLoader());
    }
}
