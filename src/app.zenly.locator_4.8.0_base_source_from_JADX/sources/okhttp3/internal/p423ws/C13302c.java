package okhttp3.internal.p423ws;

import okio.C13342c.C13345c;

/* renamed from: okhttp3.internal.ws.c */
public final class C13302c {
    /* renamed from: a */
    static void m35029a(C13345c cVar, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = cVar.f34613i;
            int i2 = cVar.f34614j;
            int i3 = cVar.f34615k;
            while (i2 < i3) {
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
        } while (cVar.mo38510a() != -1);
    }

    /* renamed from: b */
    static void m35030b(int i) {
        String a = m35028a(i);
        if (a != null) {
            throw new IllegalArgumentException(a);
        }
    }

    /* renamed from: a */
    static String m35028a(int i) {
        if (i < 1000 || i >= 5000) {
            StringBuilder sb = new StringBuilder();
            sb.append("Code must be in range [1000,5000): ");
            sb.append(i);
            return sb.toString();
        } else if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Code ");
            sb2.append(i);
            sb2.append(" is reserved and may not be used.");
            return sb2.toString();
        }
    }
}
