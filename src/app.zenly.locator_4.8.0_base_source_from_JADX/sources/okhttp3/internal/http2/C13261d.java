package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.p418f0.C13184e;
import okio.C13346d;

/* renamed from: okhttp3.internal.http2.d */
public final class C13261d {

    /* renamed from: a */
    static final C13346d f34186a = C13346d.m35334d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    private static final String[] f34187b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    static final String[] f34188c = new String[64];

    /* renamed from: d */
    static final String[] f34189d = new String[256];

    static {
        String str;
        int[] iArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f34189d;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C13184e.m34490a("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f34188c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr2 = {1};
        strArr2[8] = "PADDED";
        int length = iArr2.length;
        int i3 = 0;
        while (true) {
            str = "|PADDED";
            if (i3 >= length) {
                break;
            }
            int i4 = iArr2[i3];
            String[] strArr3 = f34188c;
            int i5 = i4 | 8;
            StringBuilder sb = new StringBuilder();
            sb.append(f34188c[i4]);
            sb.append(str);
            strArr3[i5] = sb.toString();
            i3++;
        }
        String[] strArr4 = f34188c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        for (int i6 : new int[]{4, 32, 36}) {
            for (int i7 : iArr2) {
                String[] strArr5 = f34188c;
                int i8 = i7 | i6;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f34188c[i7]);
                sb2.append('|');
                sb2.append(f34188c[i6]);
                strArr5[i8] = sb2.toString();
                String[] strArr6 = f34188c;
                int i9 = i8 | 8;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(f34188c[i7]);
                sb3.append('|');
                sb3.append(f34188c[i6]);
                sb3.append(str);
                strArr6[i9] = sb3.toString();
            }
        }
        while (true) {
            String[] strArr7 = f34188c;
            if (i < strArr7.length) {
                if (strArr7[i] == null) {
                    strArr7[i] = f34189d[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    private C13261d() {
    }

    /* renamed from: a */
    static IllegalArgumentException m34846a(String str, Object... objArr) {
        throw new IllegalArgumentException(C13184e.m34490a(str, objArr));
    }

    /* renamed from: b */
    static IOException m34849b(String str, Object... objArr) throws IOException {
        throw new IOException(C13184e.m34490a(str, objArr));
    }

    /* renamed from: a */
    static String m34848a(boolean z, int i, int i2, byte b, byte b2) {
        String[] strArr = f34187b;
        String a = b < strArr.length ? strArr[b] : C13184e.m34490a("0x%02x", Byte.valueOf(b));
        String a2 = m34847a(b, b2);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = a;
        objArr[4] = a2;
        return C13184e.m34490a("%s 0x%08x %5d %-13s %s", objArr);
    }

    /* renamed from: a */
    static String m34847a(byte b, byte b2) {
        String str;
        if (b2 == 0) {
            return "";
        }
        if (!(b == 2 || b == 3)) {
            if (b == 4 || b == 6) {
                if (b2 == 1) {
                    str = "ACK";
                } else {
                    str = f34189d[b2];
                }
                return str;
            } else if (!(b == 7 || b == 8)) {
                String[] strArr = f34188c;
                String str2 = b2 < strArr.length ? strArr[b2] : f34189d[b2];
                if (b != 5 || (b2 & 4) == 0) {
                    return (b != 0 || (b2 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED");
                }
                return str2.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f34189d[b2];
    }
}
