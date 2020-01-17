package androidx.slidingpanelayout.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import androidx.customview.view.AbsSavedState;

class SlidingPaneLayout$SavedState extends AbsSavedState {
    public static final Creator<SlidingPaneLayout$SavedState> CREATOR = new C1162a();

    /* renamed from: g */
    boolean f4397g;

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$a */
    static class C1162a implements ClassLoaderCreator<SlidingPaneLayout$SavedState> {
        C1162a() {
        }

        public SlidingPaneLayout$SavedState[] newArray(int i) {
            return new SlidingPaneLayout$SavedState[i];
        }

        public SlidingPaneLayout$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new SlidingPaneLayout$SavedState(parcel, null);
        }

        public SlidingPaneLayout$SavedState createFromParcel(Parcel parcel) {
            return new SlidingPaneLayout$SavedState(parcel, null);
        }
    }

    SlidingPaneLayout$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4397g = parcel.readInt() != 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4397g ? 1 : 0);
    }
}
