package com.bluelinelabs.conductor.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;

public class StringSparseArrayParceler implements Parcelable {
    public static final Creator<StringSparseArrayParceler> CREATOR = new C8841a();

    /* renamed from: e */
    private final SparseArray<String> f22962e;

    /* renamed from: com.bluelinelabs.conductor.internal.StringSparseArrayParceler$a */
    static class C8841a implements Creator<StringSparseArrayParceler> {
        C8841a() {
        }

        public StringSparseArrayParceler createFromParcel(Parcel parcel) {
            return new StringSparseArrayParceler(parcel);
        }

        public StringSparseArrayParceler[] newArray(int i) {
            return new StringSparseArrayParceler[i];
        }
    }

    public StringSparseArrayParceler(SparseArray<String> sparseArray) {
        this.f22962e = sparseArray;
    }

    /* renamed from: a */
    public SparseArray<String> mo24062a() {
        return this.f22962e;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f22962e.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = this.f22962e.keyAt(i2);
            parcel.writeInt(keyAt);
            parcel.writeString((String) this.f22962e.get(keyAt));
        }
    }

    StringSparseArrayParceler(Parcel parcel) {
        this.f22962e = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f22962e.put(parcel.readInt(), parcel.readString());
        }
    }
}
