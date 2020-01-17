package com.airbnb.lottie.p287p.p288k0;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.C13342c;
import okio.C13346d;
import okio.C13359m;

/* renamed from: com.airbnb.lottie.p.k0.c */
public abstract class C8630c implements Closeable {

    /* renamed from: k */
    private static final String[] f22158k = new String[128];

    /* renamed from: e */
    int f22159e;

    /* renamed from: f */
    int[] f22160f = new int[32];

    /* renamed from: g */
    String[] f22161g = new String[32];

    /* renamed from: h */
    int[] f22162h = new int[32];

    /* renamed from: i */
    boolean f22163i;

    /* renamed from: j */
    boolean f22164j;

    /* renamed from: com.airbnb.lottie.p.k0.c$a */
    public static final class C8631a {

        /* renamed from: a */
        final String[] f22165a;

        /* renamed from: b */
        final C13359m f22166b;

        private C8631a(String[] strArr, C13359m mVar) {
            this.f22165a = strArr;
            this.f22166b = mVar;
        }

        /* renamed from: a */
        public static C8631a m20077a(String... strArr) {
            try {
                C13346d[] dVarArr = new C13346d[strArr.length];
                C13342c cVar = new C13342c();
                for (int i = 0; i < strArr.length; i++) {
                    C8630c.m20060b(cVar, strArr[i]);
                    cVar.readByte();
                    dVarArr[i] = cVar.readByteString();
                }
                return new C8631a((String[]) strArr.clone(), C13359m.m35391a(dVarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.airbnb.lottie.p.k0.c$b */
    public enum C8632b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f22158k[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f22158k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    C8630c() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m20060b(BufferedSink bufferedSink, String str) throws IOException {
        String str2;
        String[] strArr = f22158k;
        bufferedSink.writeByte(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                bufferedSink.writeUtf8(str, i, i2);
            }
            bufferedSink.writeUtf8(str2);
            i = i2 + 1;
        }
        if (i < length) {
            bufferedSink.writeUtf8(str, i, length);
        }
        bufferedSink.writeByte(34);
    }

    /* renamed from: a */
    public abstract int mo23225a(C8631a aVar) throws IOException;

    /* renamed from: a */
    public abstract void mo23227a() throws IOException;

    /* renamed from: b */
    public abstract void mo23229b() throws IOException;

    /* renamed from: c */
    public abstract void mo23230c() throws IOException;

    /* renamed from: d */
    public abstract void mo23231d() throws IOException;

    /* renamed from: e */
    public final String mo23232e() {
        return C8633d.m20078a(this.f22159e, this.f22160f, this.f22161g, this.f22162h);
    }

    /* renamed from: f */
    public abstract boolean mo23233f() throws IOException;

    /* renamed from: g */
    public abstract boolean mo23234g() throws IOException;

    /* renamed from: h */
    public abstract double mo23235h() throws IOException;

    /* renamed from: i */
    public abstract int mo23236i() throws IOException;

    /* renamed from: j */
    public abstract String mo23237j() throws IOException;

    /* renamed from: k */
    public abstract String mo23238k() throws IOException;

    /* renamed from: l */
    public abstract void mo23239l() throws IOException;

    /* renamed from: m */
    public abstract void mo23240m() throws IOException;

    public abstract C8632b peek() throws IOException;

    /* renamed from: a */
    public static C8630c m20058a(BufferedSource bufferedSource) {
        return new C8634e(bufferedSource);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo23228a(int i) {
        int i2 = this.f22159e;
        int[] iArr = this.f22160f;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f22160f = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f22161g;
                this.f22161g = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f22162h;
                this.f22162h = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Nesting too deep at ");
                sb.append(mo23232e());
                throw new C8628a(sb.toString());
            }
        }
        int[] iArr3 = this.f22160f;
        int i3 = this.f22159e;
        this.f22159e = i3 + 1;
        iArr3[i3] = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C8629b mo23226a(String str) throws C8629b {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" at path ");
        sb.append(mo23232e());
        throw new C8629b(sb.toString());
    }
}
