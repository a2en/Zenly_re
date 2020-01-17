package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;

/* renamed from: com.google.android.gms.clearcut.c */
public final class C9987c implements Creator<zze> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        zzr zzr = null;
        byte[] bArr = null;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[][] bArr2 = null;
        ExperimentTokens[] experimentTokensArr = null;
        boolean z = true;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            switch (SafeParcelReader.m25535a(a)) {
                case 2:
                    zzr = (zzr) SafeParcelReader.m25537a(parcel, a, zzr.CREATOR);
                    break;
                case 3:
                    bArr = SafeParcelReader.m25550g(parcel, a);
                    break;
                case 4:
                    iArr = SafeParcelReader.m25554k(parcel, a);
                    break;
                case 5:
                    strArr = SafeParcelReader.m25559p(parcel, a);
                    break;
                case 6:
                    iArr2 = SafeParcelReader.m25554k(parcel, a);
                    break;
                case 7:
                    bArr2 = SafeParcelReader.m25551h(parcel, a);
                    break;
                case 8:
                    z = SafeParcelReader.m25562s(parcel, a);
                    break;
                case 9:
                    experimentTokensArr = (ExperimentTokens[]) SafeParcelReader.m25543b(parcel, a, ExperimentTokens.CREATOR);
                    break;
                default:
                    SafeParcelReader.m25534D(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        zze zze = new zze(zzr, bArr, iArr, strArr, iArr2, bArr2, z, experimentTokensArr);
        return zze;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zze[i];
    }
}
