package com.google.android.material.bottomnavigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import androidx.customview.view.AbsSavedState;

class BottomNavigationView$SavedState extends AbsSavedState {
    public static final Creator<BottomNavigationView$SavedState> CREATOR = new C10740a();

    /* renamed from: g */
    Bundle f27924g;

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$SavedState$a */
    static class C10740a implements ClassLoaderCreator<BottomNavigationView$SavedState> {
        C10740a() {
        }

        public BottomNavigationView$SavedState[] newArray(int i) {
            return new BottomNavigationView$SavedState[i];
        }

        public BottomNavigationView$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new BottomNavigationView$SavedState(parcel, classLoader);
        }

        public BottomNavigationView$SavedState createFromParcel(Parcel parcel) {
            return new BottomNavigationView$SavedState(parcel, null);
        }
    }

    public BottomNavigationView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        m27413a(parcel, classLoader);
    }

    /* renamed from: a */
    private void m27413a(Parcel parcel, ClassLoader classLoader) {
        this.f27924g = parcel.readBundle(classLoader);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.f27924g);
    }
}
