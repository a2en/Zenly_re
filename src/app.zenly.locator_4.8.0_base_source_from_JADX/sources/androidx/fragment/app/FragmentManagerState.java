package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Creator<FragmentManagerState> CREATOR = new C0790a();

    /* renamed from: e */
    ArrayList<FragmentState> f3222e;

    /* renamed from: f */
    ArrayList<String> f3223f;

    /* renamed from: g */
    BackStackState[] f3224g;

    /* renamed from: h */
    int f3225h;

    /* renamed from: i */
    String f3226i = null;

    /* renamed from: androidx.fragment.app.FragmentManagerState$a */
    static class C0790a implements Creator<FragmentManagerState> {
        C0790a() {
        }

        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f3222e);
        parcel.writeStringList(this.f3223f);
        parcel.writeTypedArray(this.f3224g, i);
        parcel.writeInt(this.f3225h);
        parcel.writeString(this.f3226i);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f3222e = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f3223f = parcel.createStringArrayList();
        this.f3224g = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f3225h = parcel.readInt();
        this.f3226i = parcel.readString();
    }
}
