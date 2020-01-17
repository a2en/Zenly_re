package com.google.android.gms.location;

import java.util.Comparator;

/* renamed from: com.google.android.gms.location.v */
final class C10595v implements Comparator<ActivityTransition> {
    C10595v() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        int a = activityTransition.mo28594a();
        int a2 = activityTransition2.mo28594a();
        if (a != a2) {
            return a < a2 ? -1 : 1;
        }
        int b = activityTransition.mo28595b();
        int b2 = activityTransition2.mo28595b();
        if (b == b2) {
            return 0;
        }
        return b < b2 ? -1 : 1;
    }
}
