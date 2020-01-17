package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: com.google.android.gms.location.s */
public final class C10592s implements Creator<ActivityRecognitionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        long j = 0;
        long j2 = 0;
        List list = null;
        Bundle bundle = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                list = SafeParcelReader.m25546c(parcel, a, DetectedActivity.CREATOR);
            } else if (a2 == 2) {
                j = SafeParcelReader.m25531A(parcel, a);
            } else if (a2 == 3) {
                j2 = SafeParcelReader.m25531A(parcel, a);
            } else if (a2 == 4) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 != 5) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                bundle = SafeParcelReader.m25549f(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        ActivityRecognitionResult activityRecognitionResult = new ActivityRecognitionResult(list, j, j2, i, bundle);
        return activityRecognitionResult;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
