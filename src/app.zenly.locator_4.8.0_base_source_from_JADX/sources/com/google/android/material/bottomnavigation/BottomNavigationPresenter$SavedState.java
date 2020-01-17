package com.google.android.material.bottomnavigation;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class BottomNavigationPresenter$SavedState implements Parcelable {
    public static final Creator<BottomNavigationPresenter$SavedState> CREATOR = new C10739a();

    /* renamed from: e */
    int f27923e;

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState$a */
    static class C10739a implements Creator<BottomNavigationPresenter$SavedState> {
        C10739a() {
        }

        public BottomNavigationPresenter$SavedState createFromParcel(Parcel parcel) {
            return new BottomNavigationPresenter$SavedState(parcel);
        }

        public BottomNavigationPresenter$SavedState[] newArray(int i) {
            return new BottomNavigationPresenter$SavedState[i];
        }
    }

    BottomNavigationPresenter$SavedState() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27923e);
    }

    BottomNavigationPresenter$SavedState(Parcel parcel) {
        this.f27923e = parcel.readInt();
    }
}
