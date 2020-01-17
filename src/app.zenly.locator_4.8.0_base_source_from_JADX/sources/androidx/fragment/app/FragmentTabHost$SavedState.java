package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class FragmentTabHost$SavedState extends BaseSavedState {
    public static final Creator<FragmentTabHost$SavedState> CREATOR = new C0792a();

    /* renamed from: e */
    String f3240e;

    /* renamed from: androidx.fragment.app.FragmentTabHost$SavedState$a */
    static class C0792a implements Creator<FragmentTabHost$SavedState> {
        C0792a() {
        }

        public FragmentTabHost$SavedState createFromParcel(Parcel parcel) {
            return new FragmentTabHost$SavedState(parcel);
        }

        public FragmentTabHost$SavedState[] newArray(int i) {
            return new FragmentTabHost$SavedState[i];
        }
    }

    FragmentTabHost$SavedState(Parcel parcel) {
        super(parcel);
        this.f3240e = parcel.readString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FragmentTabHost.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" curTab=");
        sb.append(this.f3240e);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f3240e);
    }
}
