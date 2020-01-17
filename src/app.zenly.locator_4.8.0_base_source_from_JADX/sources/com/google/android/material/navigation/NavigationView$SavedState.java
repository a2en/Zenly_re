package com.google.android.material.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import androidx.customview.view.AbsSavedState;

public class NavigationView$SavedState extends AbsSavedState {
    public static final Creator<NavigationView$SavedState> CREATOR = new C10795a();

    /* renamed from: g */
    public Bundle f28199g;

    /* renamed from: com.google.android.material.navigation.NavigationView$SavedState$a */
    static class C10795a implements ClassLoaderCreator<NavigationView$SavedState> {
        C10795a() {
        }

        public NavigationView$SavedState[] newArray(int i) {
            return new NavigationView$SavedState[i];
        }

        public NavigationView$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new NavigationView$SavedState(parcel, classLoader);
        }

        public NavigationView$SavedState createFromParcel(Parcel parcel) {
            return new NavigationView$SavedState(parcel, null);
        }
    }

    public NavigationView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f28199g = parcel.readBundle(classLoader);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.f28199g);
    }
}
