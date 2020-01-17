package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.t */
final class C10401t {
    /* renamed from: a */
    static int m26503a(int i, byte[] bArr, int i2, int i3, C10301e3 e3Var, C10407u uVar) throws IOException {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int b = m26510b(bArr, i2, uVar);
                e3Var.mo27889a(i, (Object) Long.valueOf(uVar.f27220b));
                return b;
            } else if (i4 == 1) {
                e3Var.mo27889a(i, (Object) Long.valueOf(m26511b(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int a = m26508a(bArr, i2, uVar);
                int i5 = uVar.f27219a;
                e3Var.mo27889a(i, (Object) i5 == 0 ? C10431y.f27328f : C10431y.m26593a(bArr, a, i5));
                return a + i5;
            } else if (i4 == 3) {
                C10301e3 e = C10301e3.m26062e();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a2 = m26508a(bArr, i2, uVar);
                    int i8 = uVar.f27219a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = a2;
                        break;
                    }
                    int a3 = m26503a(i7, bArr, a2, i3, e, uVar);
                    i7 = i8;
                    i2 = a3;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzco.m26832d();
                }
                e3Var.mo27889a(i, (Object) e);
                return i2;
            } else if (i4 == 5) {
                e3Var.mo27889a(i, (Object) Integer.valueOf(m26507a(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzco.m26830b();
            }
        } else {
            throw zzco.m26830b();
        }
    }

    /* renamed from: a */
    static int m26504a(int i, byte[] bArr, int i2, int i3, C10407u uVar) throws zzco {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m26510b(bArr, i2, uVar);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m26508a(bArr, i2, uVar) + uVar.f27219a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m26508a(bArr, i2, uVar);
                    i6 = uVar.f27219a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m26504a(i6, bArr, i2, i3, uVar);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw zzco.m26832d();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzco.m26830b();
            }
        } else {
            throw zzco.m26830b();
        }
    }

    /* renamed from: a */
    static int m26505a(int i, byte[] bArr, int i2, int i3, zzcn<?> zzcn, C10407u uVar) {
        C10285c1 c1Var = (C10285c1) zzcn;
        int a = m26508a(bArr, i2, uVar);
        while (true) {
            c1Var.mo27843a(uVar.f27219a);
            if (a >= i3) {
                break;
            }
            int a2 = m26508a(bArr, a, uVar);
            if (i != uVar.f27219a) {
                break;
            }
            a = m26508a(bArr, a2, uVar);
        }
        return a;
    }

    /* renamed from: a */
    static int m26506a(int i, byte[] bArr, int i2, C10407u uVar) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i4 = b << 7;
        } else {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                uVar.f27219a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            uVar.f27219a = i7 | i3;
            return i8;
        }
        uVar.f27219a = i5 | i4;
        return i6;
    }

    /* renamed from: a */
    static int m26507a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: a */
    static int m26508a(byte[] bArr, int i, C10407u uVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m26506a((int) b, bArr, i2, uVar);
        }
        uVar.f27219a = b;
        return i2;
    }

    /* renamed from: a */
    static int m26509a(byte[] bArr, int i, zzcn<?> zzcn, C10407u uVar) throws IOException {
        C10285c1 c1Var = (C10285c1) zzcn;
        int a = m26508a(bArr, i, uVar);
        int i2 = uVar.f27219a + a;
        while (a < i2) {
            a = m26508a(bArr, a, uVar);
            c1Var.mo27843a(uVar.f27219a);
        }
        if (a == i2) {
            return a;
        }
        throw zzco.m26829a();
    }

    /* renamed from: b */
    static int m26510b(byte[] bArr, int i, C10407u uVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            uVar.f27220b = j;
            return i2;
        }
        long j2 = j & 127;
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j3 = j2 | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j3 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        uVar.f27220b = j3;
        return i3;
    }

    /* renamed from: b */
    static long m26511b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: c */
    static double m26512c(byte[] bArr, int i) {
        return Double.longBitsToDouble(m26511b(bArr, i));
    }

    /* renamed from: c */
    static int m26513c(byte[] bArr, int i, C10407u uVar) {
        int a = m26508a(bArr, i, uVar);
        int i2 = uVar.f27219a;
        if (i2 == 0) {
            uVar.f27221c = "";
            return a;
        }
        uVar.f27221c = new String(bArr, a, i2, C10292d1.f26951a);
        return a + i2;
    }

    /* renamed from: d */
    static float m26514d(byte[] bArr, int i) {
        return Float.intBitsToFloat(m26507a(bArr, i));
    }

    /* renamed from: d */
    static int m26515d(byte[] bArr, int i, C10407u uVar) throws IOException {
        int a = m26508a(bArr, i, uVar);
        int i2 = uVar.f27219a;
        if (i2 == 0) {
            uVar.f27221c = "";
            return a;
        }
        int i3 = a + i2;
        if (C10360m3.m26329a(bArr, a, i3)) {
            uVar.f27221c = new String(bArr, a, i2, C10292d1.f26951a);
            return i3;
        }
        throw zzco.m26833e();
    }

    /* renamed from: e */
    static int m26516e(byte[] bArr, int i, C10407u uVar) {
        int a = m26508a(bArr, i, uVar);
        int i2 = uVar.f27219a;
        if (i2 == 0) {
            uVar.f27221c = C10431y.f27328f;
            return a;
        }
        uVar.f27221c = C10431y.m26593a(bArr, a, i2);
        return a + i2;
    }
}
