package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Creator<ActivityTransitionRequest> CREATOR = new C10596w();

    /* renamed from: h */
    public static final Comparator<ActivityTransition> f27484h = new C10595v();

    /* renamed from: e */
    private final List<ActivityTransition> f27485e;

    /* renamed from: f */
    private final String f27486f;

    /* renamed from: g */
    private final List<ClientIdentity> f27487g;

    public ActivityTransitionRequest(List<ActivityTransition> list, String str, List<ClientIdentity> list2) {
        C10123l.m25506a(list, (Object) "transitions can't be null");
        C10123l.m25513a(list.size() > 0, (Object) "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(f27484h);
        for (ActivityTransition activityTransition : list) {
            C10123l.m25513a(treeSet.add(activityTransition), (Object) String.format("Found duplicated transition: %s.", new Object[]{activityTransition}));
        }
        this.f27485e = Collections.unmodifiableList(list);
        this.f27486f = str;
        this.f27487g = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ActivityTransitionRequest.class == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            return C10120k.m25501a(this.f27485e, activityTransitionRequest.f27485e) && C10120k.m25501a(this.f27486f, activityTransitionRequest.f27486f) && C10120k.m25501a(this.f27487g, activityTransitionRequest.f27487g);
        }
    }

    public int hashCode() {
        int hashCode = this.f27485e.hashCode() * 31;
        String str = this.f27486f;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<ClientIdentity> list = this.f27487g;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f27485e);
        String str = this.f27486f;
        String valueOf2 = String.valueOf(this.f27487g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append('\'');
        sb.append(", mClients=");
        sb.append(valueOf2);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25597c(parcel, 1, this.f27485e, false);
        C10134a.m25583a(parcel, 2, this.f27486f, false);
        C10134a.m25597c(parcel, 3, this.f27487g, false);
        C10134a.m25571a(parcel, a);
    }
}
