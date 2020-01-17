package okio;

import java.nio.charset.Charset;

/* renamed from: okio.u */
final class C13370u {

    /* renamed from: a */
    public static final Charset f34678a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static int m35430a(int i) {
        return ((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: a */
    public static long m35431a(long j) {
        return ((j & 255) << 56) | ((-72057594037927936L & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    /* renamed from: a */
    public static short m35432a(short s) {
        short s2 = s & 65535;
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    /* renamed from: a */
    public static void m35433a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}));
        }
    }

    /* renamed from: b */
    private static <T extends Throwable> void m35436b(Throwable th) throws Throwable {
        throw th;
    }

    /* renamed from: a */
    public static void m35434a(Throwable th) {
        m35436b(th);
        throw null;
    }

    /* renamed from: a */
    public static boolean m35435a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
