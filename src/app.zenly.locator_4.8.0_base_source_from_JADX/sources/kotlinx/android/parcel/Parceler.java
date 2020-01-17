package kotlinx.android.parcel;

import android.os.Parcel;

public interface Parceler<T> {
    T create(Parcel parcel);

    T[] newArray(int i);

    void write(T t, Parcel parcel, int i);
}
