package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class zzel implements Parcelable {
    public static final Creator<zzel> CREATOR = new zzeo();
    static final zzel zzf;
    public static final zzel zzg;
    public final int zza;
    final Status zzb;
    public final List<AutocompletePrediction> zzc;
    public final int zzd;
    final Place zze;

    static {
        zzel zzel = new zzel(-1, new Status(PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty."), zzgv.zza(), -1, null);
        zzf = zzel;
        zzel zzel2 = new zzel(1, null, zzgv.zza(), -1, null);
        zzg = zzel2;
    }

    zzel(int i, Status status, List<AutocompletePrediction> list, int i2, Place place) {
        this.zza = i;
        this.zzb = status;
        this.zzc = list;
        this.zzd = i2;
        this.zze = place;
    }

    public static zzel zza(List<AutocompletePrediction> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (AutocompletePrediction autocompletePrediction : list) {
            if (!TextUtils.isEmpty(autocompletePrediction.getPlaceId())) {
                arrayList.add(autocompletePrediction);
            }
        }
        zzel zzel = new zzel(4, new Status(0), arrayList, -1, null);
        return zzel;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzel) {
            zzel zzel = (zzel) obj;
            if (zzgd.zza(Integer.valueOf(this.zza), Integer.valueOf(zzel.zza)) && zzgd.zza(this.zzb, zzel.zzb) && zzgd.zza(this.zzc, zzel.zzc) && zzgd.zza(Integer.valueOf(this.zzd), Integer.valueOf(zzel.zzd)) && zzgd.zza(this.zze, zzel.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzb, this.zzc, Integer.valueOf(this.zzd), this.zze});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeParcelable(this.zzb, i);
        parcel.writeList(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeParcelable(this.zze, i);
    }

    public static zzel zza(zzel zzel, Place place) {
        if (zzel.zza != 5) {
            return zzel;
        }
        zzel zzel2 = new zzel(7, new Status(0), zzel.zzc, zzel.zzd, place);
        return zzel2;
    }

    public static zzel zza(zzel zzel, Status status) {
        if (zzel.zza != 5) {
            return zzel;
        }
        zzel zzel2 = new zzel(6, status, zzel.zzc, zzel.zzd, null);
        return zzel2;
    }

    /* access modifiers changed from: 0000 */
    public final boolean zza() {
        int i = this.zza;
        return i == 5 || i == 6 || i == 7;
    }

    public static zzel zza(Parcel parcel) {
        int readInt = parcel.readInt();
        Status status = (Status) parcel.readParcelable(Status.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, AutocompletePrediction.class.getClassLoader());
        zzel zzel = new zzel(readInt, status, arrayList, parcel.readInt(), (Place) parcel.readParcelable(Place.class.getClassLoader()));
        return zzel;
    }
}
