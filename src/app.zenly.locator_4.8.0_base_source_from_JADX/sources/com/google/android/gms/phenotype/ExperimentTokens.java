package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExperimentTokens extends AbstractSafeParcelable {
    public static final Creator<ExperimentTokens> CREATOR = new C10672g();

    /* renamed from: m */
    private static final byte[][] f27736m = new byte[0][];

    /* renamed from: e */
    private final String f27737e;

    /* renamed from: f */
    private final byte[] f27738f;

    /* renamed from: g */
    private final byte[][] f27739g;

    /* renamed from: h */
    private final byte[][] f27740h;

    /* renamed from: i */
    private final byte[][] f27741i;

    /* renamed from: j */
    private final byte[][] f27742j;

    /* renamed from: k */
    private final int[] f27743k;

    /* renamed from: l */
    private final byte[][] f27744l;

    /* renamed from: com.google.android.gms.phenotype.ExperimentTokens$a */
    private interface C10665a {
    }

    static {
        byte[][] bArr = f27736m;
        new ExperimentTokens("", null, bArr, bArr, bArr, bArr, null, null);
        new C10668c();
        new C10669d();
        new C10670e();
        new C10671f();
    }

    public ExperimentTokens(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f27737e = str;
        this.f27738f = bArr;
        this.f27739g = bArr2;
        this.f27740h = bArr3;
        this.f27741i = bArr4;
        this.f27742j = bArr5;
        this.f27743k = iArr;
        this.f27744l = bArr6;
    }

    /* renamed from: a */
    private static List<Integer> m27179a(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private static List<String> m27180a(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private static void m27181a(StringBuilder sb, String str, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (!z) {
                    sb.append(", ");
                }
                String str3 = "'";
                sb.append(str3);
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append(str3);
                i++;
                z = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            if (C10676k.m27184a(this.f27737e, experimentTokens.f27737e) && Arrays.equals(this.f27738f, experimentTokens.f27738f) && C10676k.m27184a(m27180a(this.f27739g), m27180a(experimentTokens.f27739g)) && C10676k.m27184a(m27180a(this.f27740h), m27180a(experimentTokens.f27740h)) && C10676k.m27184a(m27180a(this.f27741i), m27180a(experimentTokens.f27741i)) && C10676k.m27184a(m27180a(this.f27742j), m27180a(experimentTokens.f27742j)) && C10676k.m27184a(m27179a(this.f27743k), m27179a(experimentTokens.f27743k)) && C10676k.m27184a(m27180a(this.f27744l), m27180a(experimentTokens.f27744l))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        String str2 = "(";
        sb.append(str2);
        String str3 = this.f27737e;
        String str4 = "null";
        String str5 = "'";
        if (str3 == null) {
            str = str4;
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 2);
            sb2.append(str5);
            sb2.append(str3);
            sb2.append(str5);
            str = sb2.toString();
        }
        sb.append(str);
        String str6 = ", ";
        sb.append(str6);
        byte[] bArr = this.f27738f;
        sb.append("direct");
        String str7 = "=";
        sb.append(str7);
        if (bArr == null) {
            sb.append(str4);
        } else {
            sb.append(str5);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append(str5);
        }
        sb.append(str6);
        m27181a(sb, "GAIA", this.f27739g);
        sb.append(str6);
        m27181a(sb, "PSEUDO", this.f27740h);
        sb.append(str6);
        m27181a(sb, "ALWAYS", this.f27741i);
        sb.append(str6);
        m27181a(sb, "OTHER", this.f27742j);
        sb.append(str6);
        int[] iArr = this.f27743k;
        sb.append("weak");
        sb.append(str7);
        String str8 = ")";
        if (iArr == null) {
            sb.append(str4);
        } else {
            sb.append(str2);
            int length = iArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    sb.append(str6);
                }
                sb.append(i2);
                i++;
                z = false;
            }
            sb.append(str8);
        }
        sb.append(str6);
        m27181a(sb, "directs", this.f27744l);
        sb.append(str8);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25583a(parcel, 2, this.f27737e, false);
        C10134a.m25587a(parcel, 3, this.f27738f, false);
        C10134a.m25591a(parcel, 4, this.f27739g, false);
        C10134a.m25591a(parcel, 5, this.f27740h, false);
        C10134a.m25591a(parcel, 6, this.f27741i, false);
        C10134a.m25591a(parcel, 7, this.f27742j, false);
        C10134a.m25588a(parcel, 8, this.f27743k, false);
        C10134a.m25591a(parcel, 9, this.f27744l, false);
        C10134a.m25571a(parcel, a);
    }
}
