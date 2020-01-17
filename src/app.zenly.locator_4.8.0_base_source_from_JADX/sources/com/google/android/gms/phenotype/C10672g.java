package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.phenotype.g */
public final class C10672g implements Creator<ExperimentTokens> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        String str = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        int[] iArr = null;
        byte[][] bArr6 = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            switch (SafeParcelReader.m25535a(a)) {
                case 2:
                    str = SafeParcelReader.m25558o(parcel, a);
                    break;
                case 3:
                    bArr = SafeParcelReader.m25550g(parcel, a);
                    break;
                case 4:
                    bArr2 = SafeParcelReader.m25551h(parcel, a);
                    break;
                case 5:
                    bArr3 = SafeParcelReader.m25551h(parcel, a);
                    break;
                case 6:
                    bArr4 = SafeParcelReader.m25551h(parcel, a);
                    break;
                case 7:
                    bArr5 = SafeParcelReader.m25551h(parcel, a);
                    break;
                case 8:
                    iArr = SafeParcelReader.m25554k(parcel, a);
                    break;
                case 9:
                    bArr6 = SafeParcelReader.m25551h(parcel, a);
                    break;
                default:
                    SafeParcelReader.m25534D(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        ExperimentTokens experimentTokens = new ExperimentTokens(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6);
        return experimentTokens;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ExperimentTokens[i];
    }
}
