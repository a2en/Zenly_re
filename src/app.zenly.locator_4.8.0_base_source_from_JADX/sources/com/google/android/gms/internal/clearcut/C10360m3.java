package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.clearcut.m3 */
final class C10360m3 {

    /* renamed from: a */
    private static final C10366n3 f27145a = (C10341k3.m26212b() && C10341k3.m26215c() ? new C10384q3() : new C10372o3());

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m26322a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m26323a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m26324a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: a */
    static int m26325a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C10378p3(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j = ((long) i3) + 4294967296L;
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static int m26326a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f27145a.mo28068a(charSequence, bArr, i, i2);
    }

    /* renamed from: a */
    static void m26327a(CharSequence charSequence, ByteBuffer byteBuffer) {
        C10366n3 n3Var = f27145a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(m26326a(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            n3Var.mo28069a(charSequence, byteBuffer);
        } else {
            C10366n3.m26352b(charSequence, byteBuffer);
        }
    }

    /* renamed from: a */
    public static boolean m26328a(byte[] bArr) {
        return f27145a.mo28070a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static boolean m26329a(byte[] bArr, int i, int i2) {
        return f27145a.mo28070a(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m26333b(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m26322a((int) b);
        }
        if (i3 == 1) {
            return m26323a((int) b, (int) bArr[i]);
        }
        if (i3 == 2) {
            return m26324a((int) b, (int) bArr[i], (int) bArr[i + 1]);
        }
        throw new AssertionError();
    }
}
