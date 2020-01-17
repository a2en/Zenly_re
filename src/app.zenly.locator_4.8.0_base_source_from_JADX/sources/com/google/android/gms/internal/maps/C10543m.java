package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C10182a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.maps.m */
public final class C10543m extends C10531a implements zzh {
    C10543m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    public final LatLng getCenter() throws RemoteException {
        Parcel a = mo28412a(4, mo28411a());
        LatLng latLng = (LatLng) C10539i.m26943a(a, LatLng.CREATOR);
        a.recycle();
        return latLng;
    }

    public final int getFillColor() throws RemoteException {
        Parcel a = mo28412a(12, mo28411a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final String getId() throws RemoteException {
        Parcel a = mo28412a(2, mo28411a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final double getRadius() throws RemoteException {
        Parcel a = mo28412a(6, mo28411a());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    public final int getStrokeColor() throws RemoteException {
        Parcel a = mo28412a(10, mo28411a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final List<PatternItem> getStrokePattern() throws RemoteException {
        Parcel a = mo28412a(22, mo28411a());
        ArrayList createTypedArrayList = a.createTypedArrayList(PatternItem.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final float getStrokeWidth() throws RemoteException {
        Parcel a = mo28412a(8, mo28411a());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final float getZIndex() throws RemoteException {
        Parcel a = mo28412a(14, mo28411a());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final boolean isClickable() throws RemoteException {
        Parcel a = mo28412a(20, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean isVisible() throws RemoteException {
        Parcel a = mo28412a(16, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final void remove() throws RemoteException {
        mo28414b(1, mo28411a());
    }

    public final void setCenter(LatLng latLng) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) latLng);
        mo28414b(3, a);
    }

    public final void setClickable(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(19, a);
    }

    public final void setFillColor(int i) throws RemoteException {
        Parcel a = mo28411a();
        a.writeInt(i);
        mo28414b(11, a);
    }

    public final void setRadius(double d) throws RemoteException {
        Parcel a = mo28411a();
        a.writeDouble(d);
        mo28414b(5, a);
    }

    public final void setStrokeColor(int i) throws RemoteException {
        Parcel a = mo28411a();
        a.writeInt(i);
        mo28414b(9, a);
    }

    public final void setStrokePattern(List<PatternItem> list) throws RemoteException {
        Parcel a = mo28411a();
        a.writeTypedList(list);
        mo28414b(21, a);
    }

    public final void setStrokeWidth(float f) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        mo28414b(7, a);
    }

    public final void setVisible(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(15, a);
    }

    public final void setZIndex(float f) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        mo28414b(13, a);
    }

    public final boolean zzb(zzh zzh) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzh);
        Parcel a2 = mo28412a(17, a);
        boolean a3 = C10539i.m26947a(a2);
        a2.recycle();
        return a3;
    }

    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) iObjectWrapper);
        mo28414b(23, a);
    }

    public final int zzj() throws RemoteException {
        Parcel a = mo28412a(18, mo28411a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final IObjectWrapper zzk() throws RemoteException {
        Parcel a = mo28412a(24, mo28411a());
        IObjectWrapper a2 = C10182a.m25696a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
