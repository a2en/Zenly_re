package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

public abstract class AbsSavedState implements Parcelable {
    public static final Creator<AbsSavedState> CREATOR = new C0689a();

    /* renamed from: f */
    public static final AbsSavedState f2931f = new AbsSavedState() {
    };

    /* renamed from: e */
    private final Parcelable f2932e;

    /* renamed from: androidx.customview.view.AbsSavedState$a */
    static class C0689a implements ClassLoaderCreator<AbsSavedState> {
        C0689a() {
        }

        public AbsSavedState[] newArray(int i) {
            return new AbsSavedState[i];
        }

        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f2931f;
            }
            throw new IllegalStateException("superState must be null");
        }

        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }
    }

    /* renamed from: a */
    public final Parcelable mo3548a() {
        return this.f2932e;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2932e, i);
    }

    private AbsSavedState() {
        this.f2932e = null;
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable == f2931f) {
                parcelable = null;
            }
            this.f2932e = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = f2931f;
        }
        this.f2932e = readParcelable;
    }
}
