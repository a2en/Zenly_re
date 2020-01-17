package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import java.util.Collections;
import java.util.List;

public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Creator<ActivityTransitionResult> CREATOR = new C10597x();

    /* renamed from: e */
    private final List<ActivityTransitionEvent> f27488e;

    public ActivityTransitionResult(List<ActivityTransitionEvent> list) {
        C10123l.m25506a(list, (Object) "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                C10123l.m25512a(((ActivityTransitionEvent) list.get(i)).mo28601b() >= ((ActivityTransitionEvent) list.get(i + -1)).mo28601b());
            }
        }
        this.f27488e = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public List<ActivityTransitionEvent> mo28611a() {
        return this.f27488e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ActivityTransitionResult.class != obj.getClass()) {
            return false;
        }
        return this.f27488e.equals(((ActivityTransitionResult) obj).f27488e);
    }

    public int hashCode() {
        return this.f27488e.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25597c(parcel, 1, mo28611a(), false);
        C10134a.m25571a(parcel, a);
    }
}
