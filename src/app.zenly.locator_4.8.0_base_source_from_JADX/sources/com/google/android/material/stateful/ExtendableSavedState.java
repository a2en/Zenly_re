package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import androidx.customview.view.AbsSavedState;
import p214e.p228e.C7584g;

public class ExtendableSavedState extends AbsSavedState {
    public static final Creator<ExtendableSavedState> CREATOR = new C10818a();

    /* renamed from: g */
    public final C7584g<String, Bundle> f28267g;

    /* renamed from: com.google.android.material.stateful.ExtendableSavedState$a */
    static class C10818a implements ClassLoaderCreator<ExtendableSavedState> {
        C10818a() {
        }

        public ExtendableSavedState[] newArray(int i) {
            return new ExtendableSavedState[i];
        }

        public ExtendableSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, null);
        }

        public ExtendableSavedState createFromParcel(Parcel parcel) {
            return new ExtendableSavedState(parcel, null, null);
        }
    }

    /* synthetic */ ExtendableSavedState(Parcel parcel, ClassLoader classLoader, C10818a aVar) {
        this(parcel, classLoader);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExtendableSavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" states=");
        sb.append(this.f28267g);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f28267g.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = (String) this.f28267g.mo19595b(i2);
            bundleArr[i2] = (Bundle) this.f28267g.mo19601d(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f28267g = new C7584g<>();
    }

    private ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f28267g = new C7584g<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f28267g.put(strArr[i], bundleArr[i]);
        }
    }
}
