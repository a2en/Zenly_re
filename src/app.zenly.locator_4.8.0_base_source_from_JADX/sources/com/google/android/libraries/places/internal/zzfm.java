package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.Arrays;

public final class zzfm implements Parcelable {
    public static final Creator<zzfm> CREATOR = new zzfl();
    private final zzdf zza;
    private final AutocompleteActivityMode zzb;
    private final AutocompleteSessionToken zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private String zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private int zzo;
    private long zzp;
    private final zzb zzq;

    public zzfm(zzdf zzdf, AutocompleteActivityMode autocompleteActivityMode, String str, zzb zzb2) {
        this.zza = zzdf;
        this.zzb = autocompleteActivityMode;
        this.zzk = zzgl.zza(str);
        this.zzg = -1;
        this.zzp = -1;
        this.zzc = AutocompleteSessionToken.newInstance();
        this.zzq = zzb2;
    }

    private static boolean zza(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    private final boolean zzy() {
        return this.zzp != -1;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfm) {
            zzfm zzfm = (zzfm) obj;
            if (zzgd.zza(this.zza, zzfm.zza) && zzgd.zza(this.zzb, zzfm.zzb) && zzgd.zza(this.zzc, zzfm.zzc) && zzgd.zza(Boolean.valueOf(this.zzd), Boolean.valueOf(zzfm.zzd)) && zzgd.zza(Boolean.valueOf(this.zze), Boolean.valueOf(zzfm.zze)) && zzgd.zza(Boolean.valueOf(this.zzf), Boolean.valueOf(zzfm.zzf)) && this.zzg == zzfm.zzg && this.zzh == zzfm.zzh && this.zzi == zzfm.zzi && this.zzj == zzfm.zzj && zzgd.zza(this.zzk, zzfm.zzk) && this.zzl == zzfm.zzl && this.zzm == zzfm.zzm && zzgd.zza(Boolean.valueOf(this.zzn), Boolean.valueOf(zzfm.zzn)) && this.zzo == zzfm.zzo && this.zzp == zzfm.zzp && zzgd.zza(this.zzq, zzfm.zzq)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, Boolean.valueOf(this.zzd), Boolean.valueOf(this.zze), Boolean.valueOf(this.zzf), Integer.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi), Integer.valueOf(this.zzj), this.zzk, Integer.valueOf(this.zzl), Integer.valueOf(this.zzm), Boolean.valueOf(this.zzn), Integer.valueOf(this.zzo), Long.valueOf(this.zzp), this.zzq});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.zza, i);
        parcel.writeParcelable(this.zzb, i);
        zza(parcel, this.zzd);
        zza(parcel, this.zze);
        zza(parcel, this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeInt(this.zzh);
        parcel.writeInt(this.zzi);
        parcel.writeInt(this.zzj);
        parcel.writeString(this.zzk);
        parcel.writeInt(this.zzl);
        parcel.writeInt(this.zzm);
        zza(parcel, this.zzn);
        parcel.writeInt(this.zzo);
        parcel.writeLong(this.zzp);
        parcel.writeParcelable(this.zzc, i);
    }

    public final AutocompleteActivityMode zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zze;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final int zzf() {
        return this.zzg;
    }

    public final int zzg() {
        return this.zzh;
    }

    public final int zzh() {
        return this.zzi;
    }

    public final int zzi() {
        return this.zzj;
    }

    public final String zzj() {
        return this.zzk;
    }

    public final int zzk() {
        return this.zzl;
    }

    public final int zzl() {
        return this.zzm;
    }

    public final boolean zzm() {
        return this.zzn;
    }

    public final int zzn() {
        return this.zzo;
    }

    public final AutocompleteSessionToken zzo() {
        return this.zzc;
    }

    public final void zzp() {
        this.zze = true;
    }

    public final void zzq() {
        this.zzf = true;
    }

    public final void zzr() {
        this.zzh++;
    }

    public final void zzs() {
        this.zzi++;
    }

    public final void zzt() {
        this.zzj++;
    }

    public final void zzu() {
        this.zzm++;
    }

    public final void zzv() {
        this.zzn = true;
    }

    public final void zzw() {
        if (zzy()) {
            Log.e("Places", "Already active!");
        } else {
            this.zzp = this.zzq.zza();
        }
    }

    public final void zzx() {
        if (!zzy()) {
            Log.e("Places", "Already inactive!");
            return;
        }
        this.zzo += (int) (this.zzq.zza() - this.zzp);
        this.zzp = -1;
    }

    private static void zza(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public final zzdf zza() {
        return this.zza;
    }

    public final void zza(int i) {
        this.zzd = true;
        this.zzg = i;
    }

    public final void zza(String str) {
        this.zzl++;
        this.zzk = str;
    }

    private zzfm(Parcel parcel) {
        this.zza = (zzdf) parcel.readParcelable(zzdf.class.getClassLoader());
        this.zzb = (AutocompleteActivityMode) parcel.readParcelable(AutocompleteActivityMode.class.getClassLoader());
        this.zzd = zza(parcel);
        this.zze = zza(parcel);
        this.zzf = zza(parcel);
        this.zzg = parcel.readInt();
        this.zzh = parcel.readInt();
        this.zzi = parcel.readInt();
        this.zzj = parcel.readInt();
        this.zzk = parcel.readString();
        this.zzl = parcel.readInt();
        this.zzm = parcel.readInt();
        this.zzn = zza(parcel);
        this.zzo = parcel.readInt();
        this.zzp = parcel.readLong();
        this.zzc = (AutocompleteSessionToken) parcel.readParcelable(AutocompleteSessionToken.class.getClassLoader());
        this.zzq = new zzd();
    }

    /* synthetic */ zzfm(Parcel parcel, zzfl zzfl) {
        this(parcel);
    }
}
