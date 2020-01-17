package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: okio.d */
public class C13346d implements Serializable, Comparable<C13346d> {

    /* renamed from: h */
    static final char[] f34616h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: i */
    public static final C13346d f34617i = m35331a(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: e */
    final byte[] f34618e;

    /* renamed from: f */
    transient int f34619f;

    /* renamed from: g */
    transient String f34620g;

    C13346d(byte[] bArr) {
        this.f34618e = bArr;
    }

    /* renamed from: a */
    public static C13346d m35331a(byte... bArr) {
        if (bArr != null) {
            return new C13346d((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: c */
    private C13346d m35333c(String str) {
        try {
            return m35331a(MessageDigest.getInstance(str).digest(this.f34618e));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public static C13346d m35334d(String str) {
        if (str != null) {
            C13346d dVar = new C13346d(str.getBytes(C13370u.f34678a));
            dVar.f34620g = str;
            return dVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        C13346d a = m35329a((InputStream) objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = C13346d.class.getDeclaredField("e");
            declaredField.setAccessible(true);
            declaredField.set(this, a.f34618e);
        } catch (NoSuchFieldException unused) {
            throw new AssertionError();
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f34618e.length);
        objectOutputStream.write(this.f34618e);
    }

    /* renamed from: b */
    public String mo38520b() {
        byte[] bArr = this.f34618e;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f34616h;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: e */
    public C13346d mo38525e() {
        return m35333c("SHA-1");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r6.mo38519a(0, r3, 0, r3.length) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof okio.C13346d
            r2 = 0
            if (r1 == 0) goto L_0x001c
            okio.d r6 = (okio.C13346d) r6
            int r1 = r6.mo38528g()
            byte[] r3 = r5.f34618e
            int r4 = r3.length
            if (r1 != r4) goto L_0x001c
            int r1 = r3.length
            boolean r6 = r6.mo38519a(r2, r3, r2, r1)
            if (r6 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C13346d.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public C13346d mo38527f() {
        return m35333c("SHA-256");
    }

    /* renamed from: g */
    public int mo38528g() {
        return this.f34618e.length;
    }

    /* renamed from: h */
    public C13346d mo38529h() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f34618e;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new C13346d(bArr2);
            }
        }
    }

    public int hashCode() {
        int i = this.f34619f;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f34618e);
        this.f34619f = hashCode;
        return hashCode;
    }

    /* renamed from: i */
    public byte[] mo38531i() {
        return (byte[]) this.f34618e.clone();
    }

    /* renamed from: j */
    public String mo38532j() {
        String str = this.f34620g;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f34618e, C13370u.f34678a);
        this.f34620g = str2;
        return str2;
    }

    public String toString() {
        String str;
        String str2;
        if (this.f34618e.length == 0) {
            return "[size=0]";
        }
        String j = mo38532j();
        int a = m35328a(j, 64);
        String str3 = "…]";
        String str4 = "[size=";
        String str5 = "]";
        if (a == -1) {
            if (this.f34618e.length <= 64) {
                StringBuilder sb = new StringBuilder();
                sb.append("[hex=");
                sb.append(mo38520b());
                sb.append(str5);
                str2 = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(this.f34618e.length);
                sb2.append(" hex=");
                sb2.append(mo38516a(0, 64).mo38520b());
                sb2.append(str3);
                str2 = sb2.toString();
            }
            return str2;
        }
        String replace = j.substring(0, a).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (a < j.length()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str4);
            sb3.append(this.f34618e.length);
            sb3.append(" text=");
            sb3.append(replace);
            sb3.append(str3);
            str = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[text=");
            sb4.append(replace);
            sb4.append(str5);
            str = sb4.toString();
        }
        return str;
    }

    /* renamed from: a */
    public String mo38515a() {
        return C13341b.m35311a(this.f34618e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public byte[] mo38522c() {
        return this.f34618e;
    }

    /* renamed from: a */
    public static C13346d m35330a(String str) {
        if (str != null) {
            byte[] a = C13341b.m35313a(str);
            if (a != null) {
                return new C13346d(a);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    /* renamed from: d */
    public C13346d mo38524d() {
        return m35333c("MD5");
    }

    /* renamed from: b */
    public static C13346d m35332b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            byte[] bArr = new byte[(str.length() / 2)];
            for (int i = 0; i < bArr.length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((m35327a(str.charAt(i2)) << 4) + m35327a(str.charAt(i2 + 1)));
            }
            return m35331a(bArr);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected hex string: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private static int m35327a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected hex digit: ");
                sb.append(c);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: a */
    public static C13346d m35329a(InputStream inputStream, int i) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (i >= 0) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read != -1) {
                    i2 += read;
                } else {
                    throw new EOFException();
                }
            }
            return new C13346d(bArr);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public C13346d mo38516a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f34618e;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.f34618e, i, bArr2, 0, i3);
                    return new C13346d(bArr2);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("endIndex > length(");
                sb.append(this.f34618e.length);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    /* renamed from: b */
    public final boolean mo38521b(C13346d dVar) {
        return mo38518a(0, dVar, 0, dVar.mo38528g());
    }

    /* renamed from: a */
    public byte mo38513a(int i) {
        return this.f34618e[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38517a(C13342c cVar) {
        byte[] bArr = this.f34618e;
        cVar.write(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public boolean mo38518a(int i, C13346d dVar, int i2, int i3) {
        return dVar.mo38519a(i2, this.f34618e, i, i3);
    }

    /* renamed from: a */
    public boolean mo38519a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f34618e;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C13370u.m35435a(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public int compareTo(C13346d dVar) {
        int g = mo38528g();
        int g2 = dVar.mo38528g();
        int min = Math.min(g, g2);
        int i = 0;
        while (true) {
            int i2 = -1;
            if (i < min) {
                byte a = mo38513a(i) & 255;
                byte a2 = dVar.mo38513a(i) & 255;
                if (a == a2) {
                    i++;
                } else {
                    if (a >= a2) {
                        i2 = 1;
                    }
                    return i2;
                }
            } else if (g == g2) {
                return 0;
            } else {
                if (g >= g2) {
                    i2 = 1;
                }
                return i2;
            }
        }
    }

    /* renamed from: a */
    static int m35328a(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }
}
