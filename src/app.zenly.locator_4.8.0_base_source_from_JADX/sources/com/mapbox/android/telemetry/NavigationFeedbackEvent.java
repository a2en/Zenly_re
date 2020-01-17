package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p315j.C11257b;
import com.mapbox.android.telemetry.Event.C11300a;

class NavigationFeedbackEvent extends Event implements Parcelable {
    public static final Creator<NavigationFeedbackEvent> CREATOR = new C11312a();

    /* renamed from: f */
    private final String f29299f;
    @C11257b(C11364j0.class)

    /* renamed from: g */
    private NavigationMetadata f29300g;
    @C11257b(C11404x.class)

    /* renamed from: h */
    private FeedbackEventData f29301h;
    @C11257b(C11336d0.class)

    /* renamed from: i */
    private NavigationLocationData f29302i;
    @C11257b(C11401w.class)

    /* renamed from: j */
    private FeedbackData f29303j;

    /* renamed from: k */
    private NavigationStepMetadata f29304k;

    /* renamed from: com.mapbox.android.telemetry.NavigationFeedbackEvent$a */
    static class C11312a implements Creator<NavigationFeedbackEvent> {
        C11312a() {
        }

        public NavigationFeedbackEvent createFromParcel(Parcel parcel) {
            return new NavigationFeedbackEvent(parcel, null);
        }

        public NavigationFeedbackEvent[] newArray(int i) {
            return new NavigationFeedbackEvent[i];
        }
    }

    /* synthetic */ NavigationFeedbackEvent(Parcel parcel, C11312a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11300a mo32828a() {
        return C11300a.NAV_FEEDBACK;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo32911b() {
        return this.f29299f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public FeedbackData mo32912c() {
        return this.f29303j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public FeedbackEventData mo32913d() {
        return this.f29301h;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public NavigationMetadata mo32915e() {
        return this.f29300g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public NavigationLocationData mo32916f() {
        return this.f29302i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public NavigationStepMetadata mo32917g() {
        return this.f29304k;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29299f);
        parcel.writeValue(this.f29300g);
        parcel.writeValue(this.f29301h);
        parcel.writeValue(this.f29302i);
        parcel.writeValue(this.f29303j);
        parcel.writeValue(this.f29304k);
    }

    private NavigationFeedbackEvent(Parcel parcel) {
        this.f29304k = null;
        this.f29299f = parcel.readString();
        this.f29300g = (NavigationMetadata) parcel.readValue(NavigationMetadata.class.getClassLoader());
        this.f29301h = (FeedbackEventData) parcel.readValue(FeedbackEventData.class.getClassLoader());
        this.f29302i = (NavigationLocationData) parcel.readValue(NavigationLocationData.class.getClassLoader());
        this.f29303j = (FeedbackData) parcel.readValue(FeedbackData.class.getClassLoader());
        this.f29304k = (NavigationStepMetadata) parcel.readValue(NavigationStepMetadata.class.getClassLoader());
    }
}
