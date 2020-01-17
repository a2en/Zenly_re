package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import java.util.List;

public abstract class AddressComponents implements Parcelable {
    public static AddressComponents newInstance(List<AddressComponent> list) {
        return new zzz(list);
    }

    public abstract List<AddressComponent> asList();
}
