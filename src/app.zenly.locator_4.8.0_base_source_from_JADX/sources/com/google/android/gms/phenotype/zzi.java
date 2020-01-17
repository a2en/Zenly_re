package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import java.util.Arrays;

public final class zzi extends AbstractSafeParcelable implements Comparable<zzi> {
    public static final Creator<zzi> CREATOR = new C10674i();

    /* renamed from: e */
    public final String f27747e;

    /* renamed from: f */
    private final long f27748f;

    /* renamed from: g */
    private final boolean f27749g;

    /* renamed from: h */
    private final double f27750h;

    /* renamed from: i */
    private final String f27751i;

    /* renamed from: j */
    private final byte[] f27752j;

    /* renamed from: k */
    private final int f27753k;

    /* renamed from: l */
    public final int f27754l;

    static {
        new C10673h();
    }

    public zzi(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2) {
        this.f27747e = str;
        this.f27748f = j;
        this.f27749g = z;
        this.f27750h = d;
        this.f27751i = str2;
        this.f27752j = bArr;
        this.f27753k = i;
        this.f27754l = i2;
    }

    /* renamed from: a */
    private static int m27185a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        zzi zzi = (zzi) obj;
        int compareTo = this.f27747e.compareTo(zzi.f27747e);
        if (compareTo != 0) {
            return compareTo;
        }
        int a = m27185a(this.f27753k, zzi.f27753k);
        if (a != 0) {
            return a;
        }
        int i = this.f27753k;
        if (i == 1) {
            int i2 = (this.f27748f > zzi.f27748f ? 1 : (this.f27748f == zzi.f27748f ? 0 : -1));
            if (i2 < 0) {
                return -1;
            }
            return i2 == 0 ? 0 : 1;
        } else if (i == 2) {
            boolean z = this.f27749g;
            if (z == zzi.f27749g) {
                return 0;
            }
            return z ? 1 : -1;
        } else if (i == 3) {
            return Double.compare(this.f27750h, zzi.f27750h);
        } else {
            if (i == 4) {
                String str = this.f27751i;
                String str2 = zzi.f27751i;
                if (str == str2) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            } else if (i == 5) {
                byte[] bArr = this.f27752j;
                byte[] bArr2 = zzi.f27752j;
                if (bArr == bArr2) {
                    return 0;
                }
                if (bArr == null) {
                    return -1;
                }
                if (bArr2 == null) {
                    return 1;
                }
                for (int i3 = 0; i3 < Math.min(this.f27752j.length, zzi.f27752j.length); i3++) {
                    int i4 = this.f27752j[i3] - zzi.f27752j[i3];
                    if (i4 != 0) {
                        return i4;
                    }
                }
                return m27185a(this.f27752j.length, zzi.f27752j.length);
            } else {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Invalid enum value: ");
                sb.append(i);
                throw new AssertionError(sb.toString());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzi) {
            zzi zzi = (zzi) obj;
            if (C10676k.m27184a(this.f27747e, zzi.f27747e)) {
                int i = this.f27753k;
                if (i == zzi.f27753k && this.f27754l == zzi.f27754l) {
                    if (i != 1) {
                        if (i == 2) {
                            return this.f27749g == zzi.f27749g;
                        }
                        if (i == 3) {
                            return this.f27750h == zzi.f27750h;
                        }
                        if (i == 4) {
                            return C10676k.m27184a(this.f27751i, zzi.f27751i);
                        }
                        if (i == 5) {
                            return Arrays.equals(this.f27752j, zzi.f27752j);
                        }
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Invalid enum value: ");
                        sb.append(i);
                        throw new AssertionError(sb.toString());
                    } else if (this.f27748f == zzi.f27748f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Flag(");
        sb.append(this.f27747e);
        String str2 = ", ";
        sb.append(str2);
        int i = this.f27753k;
        if (i == 1) {
            sb.append(this.f27748f);
        } else if (i == 2) {
            sb.append(this.f27749g);
        } else if (i != 3) {
            String str3 = "'";
            if (i == 4) {
                sb.append(str3);
                str = this.f27751i;
            } else if (i != 5) {
                String str4 = this.f27747e;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 27);
                sb2.append("Invalid type: ");
                sb2.append(str4);
                sb2.append(str2);
                sb2.append(i);
                throw new AssertionError(sb2.toString());
            } else if (this.f27752j == null) {
                sb.append("null");
            } else {
                sb.append(str3);
                str = Base64.encodeToString(this.f27752j, 3);
            }
            sb.append(str);
            sb.append(str3);
        } else {
            sb.append(this.f27750h);
        }
        sb.append(str2);
        sb.append(this.f27753k);
        sb.append(str2);
        sb.append(this.f27754l);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25583a(parcel, 2, this.f27747e, false);
        C10134a.m25576a(parcel, 3, this.f27748f);
        C10134a.m25586a(parcel, 4, this.f27749g);
        C10134a.m25573a(parcel, 5, this.f27750h);
        C10134a.m25583a(parcel, 6, this.f27751i, false);
        C10134a.m25587a(parcel, 7, this.f27752j, false);
        C10134a.m25575a(parcel, 8, this.f27753k);
        C10134a.m25575a(parcel, 9, this.f27754l);
        C10134a.m25571a(parcel, a);
    }
}
