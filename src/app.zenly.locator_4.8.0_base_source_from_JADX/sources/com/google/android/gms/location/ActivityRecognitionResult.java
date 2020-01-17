package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import java.util.List;

public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<ActivityRecognitionResult> CREATOR = new C10592s();

    /* renamed from: e */
    private List<DetectedActivity> f27474e;

    /* renamed from: f */
    private long f27475f;

    /* renamed from: g */
    private long f27476g;

    /* renamed from: h */
    private int f27477h;

    /* renamed from: i */
    private Bundle f27478i;

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2, int i, Bundle bundle) {
        boolean z = true;
        C10123l.m25513a(list != null && list.size() > 0, (Object) "Must have at least 1 detected activity");
        if (j <= 0 || j2 <= 0) {
            z = false;
        }
        C10123l.m25513a(z, (Object) "Must set times");
        this.f27474e = list;
        this.f27475f = j;
        this.f27476g = j2;
        this.f27477h = i;
        this.f27478i = bundle;
    }

    /* renamed from: a */
    private static boolean m26959a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null && bundle2 != null) || ((bundle != null && bundle2 == null) || bundle.size() != bundle2.size())) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof Bundle) {
                if (!m26959a(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ActivityRecognitionResult.class == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            return this.f27475f == activityRecognitionResult.f27475f && this.f27476g == activityRecognitionResult.f27476g && this.f27477h == activityRecognitionResult.f27477h && C10120k.m25501a(this.f27474e, activityRecognitionResult.f27474e) && m26959a(this.f27478i, activityRecognitionResult.f27478i);
        }
    }

    public int hashCode() {
        return C10120k.m25499a(Long.valueOf(this.f27475f), Long.valueOf(this.f27476g), Integer.valueOf(this.f27477h), this.f27474e, this.f27478i);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f27474e);
        long j = this.f27475f;
        long j2 = this.f27476g;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(valueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25597c(parcel, 1, this.f27474e, false);
        C10134a.m25576a(parcel, 2, this.f27475f);
        C10134a.m25576a(parcel, 3, this.f27476g);
        C10134a.m25575a(parcel, 4, this.f27477h);
        C10134a.m25577a(parcel, 5, this.f27478i, false);
        C10134a.m25571a(parcel, a);
    }
}
