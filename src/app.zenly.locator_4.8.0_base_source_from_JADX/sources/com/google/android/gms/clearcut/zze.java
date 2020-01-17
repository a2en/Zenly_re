package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.clearcut.ClearcutLogger.zzb;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.internal.clearcut.C10418v4;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;

public final class zze extends AbstractSafeParcelable {
    public static final Creator<zze> CREATOR = new C9987c();

    /* renamed from: e */
    public zzr f26248e;

    /* renamed from: f */
    public byte[] f26249f;

    /* renamed from: g */
    private int[] f26250g;

    /* renamed from: h */
    private String[] f26251h;

    /* renamed from: i */
    private int[] f26252i;

    /* renamed from: j */
    private byte[][] f26253j;

    /* renamed from: k */
    private ExperimentTokens[] f26254k;

    /* renamed from: l */
    private boolean f26255l;

    /* renamed from: m */
    public final C10418v4 f26256m;

    /* renamed from: n */
    public final zzb f26257n;

    /* renamed from: o */
    public final zzb f26258o;

    public zze(zzr zzr, C10418v4 v4Var, zzb zzb, zzb zzb2, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, ExperimentTokens[] experimentTokensArr, boolean z) {
        this.f26248e = zzr;
        this.f26256m = v4Var;
        this.f26257n = zzb;
        this.f26258o = null;
        this.f26250g = iArr;
        this.f26251h = null;
        this.f26252i = iArr2;
        this.f26253j = null;
        this.f26254k = null;
        this.f26255l = z;
    }

    zze(zzr zzr, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, ExperimentTokens[] experimentTokensArr) {
        this.f26248e = zzr;
        this.f26249f = bArr;
        this.f26250g = iArr;
        this.f26251h = strArr;
        this.f26256m = null;
        this.f26257n = null;
        this.f26258o = null;
        this.f26252i = iArr2;
        this.f26253j = bArr2;
        this.f26254k = experimentTokensArr;
        this.f26255l = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zze) {
            zze zze = (zze) obj;
            return C10120k.m25501a(this.f26248e, zze.f26248e) && Arrays.equals(this.f26249f, zze.f26249f) && Arrays.equals(this.f26250g, zze.f26250g) && Arrays.equals(this.f26251h, zze.f26251h) && C10120k.m25501a(this.f26256m, zze.f26256m) && C10120k.m25501a(this.f26257n, zze.f26257n) && C10120k.m25501a(this.f26258o, zze.f26258o) && Arrays.equals(this.f26252i, zze.f26252i) && Arrays.deepEquals(this.f26253j, zze.f26253j) && Arrays.equals(this.f26254k, zze.f26254k) && this.f26255l == zze.f26255l;
        }
    }

    public final int hashCode() {
        return C10120k.m25499a(this.f26248e, this.f26249f, this.f26250g, this.f26251h, this.f26256m, this.f26257n, this.f26258o, this.f26252i, this.f26253j, this.f26254k, Boolean.valueOf(this.f26255l));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.f26248e);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.f26249f;
        sb.append(bArr == null ? null : new String(bArr));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.f26250g));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.f26251h));
        sb.append(", LogEvent: ");
        sb.append(this.f26256m);
        sb.append(", ExtensionProducer: ");
        sb.append(this.f26257n);
        sb.append(", VeProducer: ");
        sb.append(this.f26258o);
        sb.append(", ExperimentIDs: ");
        sb.append(Arrays.toString(this.f26252i));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.toString(this.f26253j));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.f26254k));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.f26255l);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25580a(parcel, 2, (Parcelable) this.f26248e, i, false);
        C10134a.m25587a(parcel, 3, this.f26249f, false);
        C10134a.m25588a(parcel, 4, this.f26250g, false);
        C10134a.m25590a(parcel, 5, this.f26251h, false);
        C10134a.m25588a(parcel, 6, this.f26252i, false);
        C10134a.m25591a(parcel, 7, this.f26253j, false);
        C10134a.m25586a(parcel, 8, this.f26255l);
        C10134a.m25589a(parcel, 9, (T[]) this.f26254k, i, false);
        C10134a.m25571a(parcel, a);
    }
}
