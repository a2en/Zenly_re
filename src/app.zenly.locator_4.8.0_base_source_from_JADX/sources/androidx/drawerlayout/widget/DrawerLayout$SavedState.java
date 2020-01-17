package androidx.drawerlayout.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import androidx.customview.view.AbsSavedState;

public class DrawerLayout$SavedState extends AbsSavedState {
    public static final Creator<DrawerLayout$SavedState> CREATOR = new C0699a();

    /* renamed from: g */
    int f2975g = 0;

    /* renamed from: h */
    int f2976h;

    /* renamed from: i */
    int f2977i;

    /* renamed from: j */
    int f2978j;

    /* renamed from: k */
    int f2979k;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$a */
    static class C0699a implements ClassLoaderCreator<DrawerLayout$SavedState> {
        C0699a() {
        }

        public DrawerLayout$SavedState[] newArray(int i) {
            return new DrawerLayout$SavedState[i];
        }

        public DrawerLayout$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new DrawerLayout$SavedState(parcel, classLoader);
        }

        public DrawerLayout$SavedState createFromParcel(Parcel parcel) {
            return new DrawerLayout$SavedState(parcel, null);
        }
    }

    public DrawerLayout$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2975g = parcel.readInt();
        this.f2976h = parcel.readInt();
        this.f2977i = parcel.readInt();
        this.f2978j = parcel.readInt();
        this.f2979k = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2975g);
        parcel.writeInt(this.f2976h);
        parcel.writeInt(this.f2977i);
        parcel.writeInt(this.f2978j);
        parcel.writeInt(this.f2979k);
    }
}
