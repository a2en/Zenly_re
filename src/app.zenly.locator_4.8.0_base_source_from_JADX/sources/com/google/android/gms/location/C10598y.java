package com.google.android.gms.location;

import java.util.Comparator;

/* renamed from: com.google.android.gms.location.y */
final class C10598y implements Comparator<DetectedActivity> {
    C10598y() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        DetectedActivity detectedActivity2 = (DetectedActivity) obj2;
        int compareTo = Integer.valueOf(detectedActivity2.mo28615a()).compareTo(Integer.valueOf(detectedActivity.mo28615a()));
        return compareTo == 0 ? Integer.valueOf(detectedActivity.mo28616b()).compareTo(Integer.valueOf(detectedActivity2.mo28616b())) : compareTo;
    }
}
