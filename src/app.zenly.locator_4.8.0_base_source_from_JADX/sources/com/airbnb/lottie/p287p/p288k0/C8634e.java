package com.airbnb.lottie.p287p.p288k0;

import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8632b;
import java.io.EOFException;
import java.io.IOException;
import okio.BufferedSource;
import okio.C13342c;
import okio.C13346d;

/* renamed from: com.airbnb.lottie.p.k0.e */
final class C8634e extends C8630c {

    /* renamed from: r */
    private static final C13346d f22178r = C13346d.m35334d("'\\");

    /* renamed from: s */
    private static final C13346d f22179s = C13346d.m35334d("\"\\");

    /* renamed from: t */
    private static final C13346d f22180t = C13346d.m35334d("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: u */
    private static final C13346d f22181u = C13346d.m35334d("\n\r");

    /* renamed from: v */
    private static final C13346d f22182v = C13346d.m35334d("*/");

    /* renamed from: l */
    private final BufferedSource f22183l;

    /* renamed from: m */
    private final C13342c f22184m;

    /* renamed from: n */
    private int f22185n = 0;

    /* renamed from: o */
    private long f22186o;

    /* renamed from: p */
    private int f22187p;

    /* renamed from: q */
    private String f22188q;

    C8634e(BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            this.f22183l = bufferedSource;
            this.f22184m = bufferedSource.getBuffer();
            mo23228a(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: n */
    private void m20084n() throws IOException {
        if (!this.f22163i) {
            mo23226a("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* renamed from: o */
    private int m20085o() throws IOException {
        int[] iArr = this.f22160f;
        int i = this.f22159e;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int a = m20080a(true);
            this.f22184m.readByte();
            if (a != 44) {
                if (a == 59) {
                    m20084n();
                } else if (a == 93) {
                    this.f22185n = 4;
                    return 4;
                } else {
                    mo23226a("Unterminated array");
                    throw null;
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            this.f22160f[this.f22159e - 1] = 4;
            if (i2 == 5) {
                int a2 = m20080a(true);
                this.f22184m.readByte();
                if (a2 != 44) {
                    if (a2 == 59) {
                        m20084n();
                    } else if (a2 == 125) {
                        this.f22185n = 2;
                        return 2;
                    } else {
                        mo23226a("Unterminated object");
                        throw null;
                    }
                }
            }
            int a3 = m20080a(true);
            if (a3 == 34) {
                this.f22184m.readByte();
                this.f22185n = 13;
                return 13;
            } else if (a3 == 39) {
                this.f22184m.readByte();
                m20084n();
                this.f22185n = 12;
                return 12;
            } else if (a3 != 125) {
                m20084n();
                if (m20083b((int) (char) a3)) {
                    this.f22185n = 14;
                    return 14;
                }
                mo23226a("Expected name");
                throw null;
            } else if (i2 != 5) {
                this.f22184m.readByte();
                this.f22185n = 2;
                return 2;
            } else {
                mo23226a("Expected name");
                throw null;
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int a4 = m20080a(true);
            this.f22184m.readByte();
            if (a4 != 58) {
                if (a4 == 61) {
                    m20084n();
                    if (this.f22183l.request(1) && this.f22184m.mo38482a(0) == 62) {
                        this.f22184m.readByte();
                    }
                } else {
                    mo23226a("Expected ':'");
                    throw null;
                }
            }
        } else if (i2 == 6) {
            iArr[i - 1] = 7;
        } else if (i2 == 7) {
            if (m20080a(false) == -1) {
                this.f22185n = 18;
                return 18;
            }
            m20084n();
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int a5 = m20080a(true);
        if (a5 == 34) {
            this.f22184m.readByte();
            this.f22185n = 9;
            return 9;
        } else if (a5 != 39) {
            if (!(a5 == 44 || a5 == 59)) {
                if (a5 == 91) {
                    this.f22184m.readByte();
                    this.f22185n = 3;
                    return 3;
                } else if (a5 != 93) {
                    if (a5 != 123) {
                        int q = m20087q();
                        if (q != 0) {
                            return q;
                        }
                        int r = m20088r();
                        if (r != 0) {
                            return r;
                        }
                        if (m20083b((int) this.f22184m.mo38482a(0))) {
                            m20084n();
                            this.f22185n = 10;
                            return 10;
                        }
                        mo23226a("Expected value");
                        throw null;
                    }
                    this.f22184m.readByte();
                    this.f22185n = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f22184m.readByte();
                    this.f22185n = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                m20084n();
                this.f22185n = 7;
                return 7;
            }
            mo23226a("Unexpected value");
            throw null;
        } else {
            m20084n();
            this.f22184m.readByte();
            this.f22185n = 8;
            return 8;
        }
    }

    /* renamed from: p */
    private String m20086p() throws IOException {
        long indexOfElement = this.f22183l.indexOfElement(f22180t);
        return indexOfElement != -1 ? this.f22184m.readUtf8(indexOfElement) : this.f22184m.readUtf8();
    }

    /* renamed from: q */
    private int m20087q() throws IOException {
        String str;
        String str2;
        int i;
        byte a = this.f22184m.mo38482a(0);
        if (a == 116 || a == 84) {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (a == 102 || a == 70) {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (a != 110 && a != 78) {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f22183l.request((long) i3)) {
                return 0;
            }
            byte a2 = this.f22184m.mo38482a((long) i2);
            if (a2 != str2.charAt(i2) && a2 != str.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f22183l.request((long) (length + 1)) && m20083b((int) this.f22184m.mo38482a((long) length))) {
            return 0;
        }
        this.f22184m.skip((long) length);
        this.f22185n = i;
        return i;
    }

    /* renamed from: r */
    private int m20088r() throws IOException {
        byte a;
        boolean z = true;
        int i = 0;
        long j = 0;
        int i2 = 0;
        char c = 0;
        boolean z2 = true;
        boolean z3 = false;
        while (true) {
            int i3 = i2 + 1;
            if (!this.f22183l.request((long) i3)) {
                break;
            }
            a = this.f22184m.mo38482a((long) i2);
            if (a != 43) {
                if (a != 69 && a != 101) {
                    if (a != 45) {
                        if (a != 46) {
                            if (a >= 48 && a <= 57) {
                                if (c == z || c == 0) {
                                    j = (long) (-(a - 48));
                                    i = 0;
                                    c = 2;
                                } else {
                                    if (c == 2) {
                                        if (j == 0) {
                                            return i;
                                        }
                                        long j2 = (10 * j) - ((long) (a - 48));
                                        int i4 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                                        z2 = (i4 > 0 || (i4 == 0 && j2 < j)) & z2;
                                        j = j2;
                                    } else if (c == 3) {
                                        i = 0;
                                        c = 4;
                                    } else if (c == 5 || c == 6) {
                                        i = 0;
                                        c = 7;
                                    }
                                    i = 0;
                                }
                            }
                        } else if (c != 2) {
                            return i;
                        } else {
                            c = 3;
                        }
                    } else if (c == 0) {
                        c = 1;
                        z3 = true;
                    } else if (c != 5) {
                        return i;
                    }
                    i2 = i3;
                    z = true;
                } else if (c != 2 && c != 4) {
                    return i;
                } else {
                    c = 5;
                    i2 = i3;
                    z = true;
                }
            } else if (c != 5) {
                return i;
            }
            c = 6;
            i2 = i3;
            z = true;
        }
        if (m20083b((int) a)) {
            return 0;
        }
        if (c == 2 && z2 && ((j != Long.MIN_VALUE || z3) && (j != 0 || !z3))) {
            if (!z3) {
                j = -j;
            }
            this.f22186o = j;
            this.f22184m.skip((long) i2);
            this.f22185n = 16;
            return 16;
        } else if (c != 2 && c != 4 && c != 7) {
            return 0;
        } else {
            this.f22187p = i2;
            this.f22185n = 17;
            return 17;
        }
    }

    /* renamed from: s */
    private char m20089s() throws IOException {
        int i;
        int i2;
        if (this.f22183l.request(1)) {
            byte readByte = this.f22184m.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                if (this.f22163i) {
                    return (char) readByte;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid escape sequence: \\");
                sb.append((char) readByte);
                mo23226a(sb.toString());
                throw null;
            } else if (this.f22183l.request(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte a = this.f22184m.mo38482a((long) i3);
                    char c2 = (char) (c << 4);
                    if (a < 48 || a > 57) {
                        if (a >= 97 && a <= 102) {
                            i = a - 97;
                        } else if (a < 65 || a > 70) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("\\u");
                            sb2.append(this.f22184m.readUtf8(4));
                            mo23226a(sb2.toString());
                            throw null;
                        } else {
                            i = a - 65;
                        }
                        i2 = i + 10;
                    } else {
                        i2 = a - 48;
                    }
                    c = (char) (c2 + i2);
                }
                this.f22184m.skip(4);
                return c;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unterminated escape sequence at path ");
                sb3.append(mo23232e());
                throw new EOFException(sb3.toString());
            }
        } else {
            mo23226a("Unterminated escape sequence");
            throw null;
        }
    }

    /* renamed from: t */
    private boolean m20090t() throws IOException {
        long indexOf = this.f22183l.indexOf(f22182v);
        boolean z = indexOf != -1;
        C13342c cVar = this.f22184m;
        cVar.skip(z ? indexOf + ((long) f22182v.mo38528g()) : cVar.mo38488b());
        return z;
    }

    /* renamed from: u */
    private void m20091u() throws IOException {
        long indexOfElement = this.f22183l.indexOfElement(f22181u);
        C13342c cVar = this.f22184m;
        cVar.skip(indexOfElement != -1 ? indexOfElement + 1 : cVar.mo38488b());
    }

    /* renamed from: v */
    private void m20092v() throws IOException {
        long indexOfElement = this.f22183l.indexOfElement(f22180t);
        C13342c cVar = this.f22184m;
        if (indexOfElement == -1) {
            indexOfElement = cVar.mo38488b();
        }
        cVar.skip(indexOfElement);
    }

    /* renamed from: a */
    public void mo23227a() throws IOException {
        int i = this.f22185n;
        if (i == 0) {
            i = m20085o();
        }
        if (i == 3) {
            mo23228a(1);
            this.f22162h[this.f22159e - 1] = 0;
            this.f22185n = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected BEGIN_ARRAY but was ");
        sb.append(peek());
        sb.append(" at path ");
        sb.append(mo23232e());
        throw new C8628a(sb.toString());
    }

    /* renamed from: b */
    public void mo23229b() throws IOException {
        int i = this.f22185n;
        if (i == 0) {
            i = m20085o();
        }
        if (i == 1) {
            mo23228a(3);
            this.f22185n = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected BEGIN_OBJECT but was ");
        sb.append(peek());
        sb.append(" at path ");
        sb.append(mo23232e());
        throw new C8628a(sb.toString());
    }

    /* renamed from: c */
    public void mo23230c() throws IOException {
        int i = this.f22185n;
        if (i == 0) {
            i = m20085o();
        }
        if (i == 4) {
            this.f22159e--;
            int[] iArr = this.f22162h;
            int i2 = this.f22159e - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f22185n = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected END_ARRAY but was ");
        sb.append(peek());
        sb.append(" at path ");
        sb.append(mo23232e());
        throw new C8628a(sb.toString());
    }

    public void close() throws IOException {
        this.f22185n = 0;
        this.f22160f[0] = 8;
        this.f22159e = 1;
        this.f22184m.clear();
        this.f22183l.close();
    }

    /* renamed from: d */
    public void mo23231d() throws IOException {
        int i = this.f22185n;
        if (i == 0) {
            i = m20085o();
        }
        if (i == 2) {
            this.f22159e--;
            String[] strArr = this.f22161g;
            int i2 = this.f22159e;
            strArr[i2] = null;
            int[] iArr = this.f22162h;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f22185n = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected END_OBJECT but was ");
        sb.append(peek());
        sb.append(" at path ");
        sb.append(mo23232e());
        throw new C8628a(sb.toString());
    }

    /* renamed from: f */
    public boolean mo23233f() throws IOException {
        int i = this.f22185n;
        if (i == 0) {
            i = m20085o();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    /* renamed from: g */
    public boolean mo23234g() throws IOException {
        int i = this.f22185n;
        if (i == 0) {
            i = m20085o();
        }
        if (i == 5) {
            this.f22185n = 0;
            int[] iArr = this.f22162h;
            int i2 = this.f22159e - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f22185n = 0;
            int[] iArr2 = this.f22162h;
            int i3 = this.f22159e - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a boolean but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(mo23232e());
            throw new C8628a(sb.toString());
        }
    }

    /* renamed from: h */
    public double mo23235h() throws IOException {
        int i = this.f22185n;
        if (i == 0) {
            i = m20085o();
        }
        if (i == 16) {
            this.f22185n = 0;
            int[] iArr = this.f22162h;
            int i2 = this.f22159e - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f22186o;
        }
        String str = "Expected a double but was ";
        String str2 = " at path ";
        if (i == 17) {
            this.f22188q = this.f22184m.readUtf8((long) this.f22187p);
        } else if (i == 9) {
            this.f22188q = m20081a(f22179s);
        } else if (i == 8) {
            this.f22188q = m20081a(f22178r);
        } else if (i == 10) {
            this.f22188q = m20086p();
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(peek());
            sb.append(str2);
            sb.append(mo23232e());
            throw new C8628a(sb.toString());
        }
        this.f22185n = 11;
        try {
            double parseDouble = Double.parseDouble(this.f22188q);
            if (this.f22163i || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.f22188q = null;
                this.f22185n = 0;
                int[] iArr2 = this.f22162h;
                int i3 = this.f22159e - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseDouble;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("JSON forbids NaN and infinities: ");
            sb2.append(parseDouble);
            sb2.append(str2);
            sb2.append(mo23232e());
            throw new C8629b(sb2.toString());
        } catch (NumberFormatException unused) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(this.f22188q);
            sb3.append(str2);
            sb3.append(mo23232e());
            throw new C8628a(sb3.toString());
        }
    }

    /* renamed from: i */
    public int mo23236i() throws IOException {
        String str;
        int i = this.f22185n;
        if (i == 0) {
            i = m20085o();
        }
        String str2 = " at path ";
        String str3 = "Expected an int but was ";
        if (i == 16) {
            long j = this.f22186o;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f22185n = 0;
                int[] iArr = this.f22162h;
                int i3 = this.f22159e - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(this.f22186o);
            sb.append(str2);
            sb.append(mo23232e());
            throw new C8628a(sb.toString());
        }
        if (i == 17) {
            this.f22188q = this.f22184m.readUtf8((long) this.f22187p);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = m20081a(f22179s);
            } else {
                str = m20081a(f22178r);
            }
            this.f22188q = str;
            try {
                int parseInt = Integer.parseInt(this.f22188q);
                this.f22185n = 0;
                int[] iArr2 = this.f22162h;
                int i4 = this.f22159e - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(peek());
            sb2.append(str2);
            sb2.append(mo23232e());
            throw new C8628a(sb2.toString());
        }
        this.f22185n = 11;
        try {
            double parseDouble = Double.parseDouble(this.f22188q);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f22188q = null;
                this.f22185n = 0;
                int[] iArr3 = this.f22162h;
                int i6 = this.f22159e - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(this.f22188q);
            sb3.append(str2);
            sb3.append(mo23232e());
            throw new C8628a(sb3.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str3);
            sb4.append(this.f22188q);
            sb4.append(str2);
            sb4.append(mo23232e());
            throw new C8628a(sb4.toString());
        }
    }

    /* renamed from: j */
    public String mo23237j() throws IOException {
        String str;
        int i = this.f22185n;
        if (i == 0) {
            i = m20085o();
        }
        if (i == 14) {
            str = m20086p();
        } else if (i == 13) {
            str = m20081a(f22179s);
        } else if (i == 12) {
            str = m20081a(f22178r);
        } else if (i == 15) {
            str = this.f22188q;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a name but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(mo23232e());
            throw new C8628a(sb.toString());
        }
        this.f22185n = 0;
        this.f22161g[this.f22159e - 1] = str;
        return str;
    }

    /* renamed from: k */
    public String mo23238k() throws IOException {
        String str;
        int i = this.f22185n;
        if (i == 0) {
            i = m20085o();
        }
        if (i == 10) {
            str = m20086p();
        } else if (i == 9) {
            str = m20081a(f22179s);
        } else if (i == 8) {
            str = m20081a(f22178r);
        } else if (i == 11) {
            str = this.f22188q;
            this.f22188q = null;
        } else if (i == 16) {
            str = Long.toString(this.f22186o);
        } else if (i == 17) {
            str = this.f22184m.readUtf8((long) this.f22187p);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a string but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(mo23232e());
            throw new C8628a(sb.toString());
        }
        this.f22185n = 0;
        int[] iArr = this.f22162h;
        int i2 = this.f22159e - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: l */
    public void mo23239l() throws IOException {
        if (!this.f22164j) {
            int i = this.f22185n;
            if (i == 0) {
                i = m20085o();
            }
            if (i == 14) {
                m20092v();
            } else if (i == 13) {
                m20082b(f22179s);
            } else if (i == 12) {
                m20082b(f22178r);
            } else if (i != 15) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a name but was ");
                sb.append(peek());
                sb.append(" at path ");
                sb.append(mo23232e());
                throw new C8628a(sb.toString());
            }
            this.f22185n = 0;
            this.f22161g[this.f22159e - 1] = "null";
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot skip unexpected ");
        sb2.append(peek());
        sb2.append(" at ");
        sb2.append(mo23232e());
        throw new C8628a(sb2.toString());
    }

    /* renamed from: m */
    public void mo23240m() throws IOException {
        if (!this.f22164j) {
            int i = 0;
            do {
                int i2 = this.f22185n;
                if (i2 == 0) {
                    i2 = m20085o();
                }
                if (i2 == 3) {
                    mo23228a(1);
                } else if (i2 == 1) {
                    mo23228a(3);
                } else {
                    String str = " at path ";
                    String str2 = "Expected a value but was ";
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.f22159e--;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str2);
                            sb.append(peek());
                            sb.append(str);
                            sb.append(mo23232e());
                            throw new C8628a(sb.toString());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.f22159e--;
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str2);
                            sb2.append(peek());
                            sb2.append(str);
                            sb2.append(mo23232e());
                            throw new C8628a(sb2.toString());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        m20092v();
                    } else if (i2 == 9 || i2 == 13) {
                        m20082b(f22179s);
                    } else if (i2 == 8 || i2 == 12) {
                        m20082b(f22178r);
                    } else if (i2 == 17) {
                        this.f22184m.skip((long) this.f22187p);
                    } else if (i2 == 18) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str2);
                        sb3.append(peek());
                        sb3.append(str);
                        sb3.append(mo23232e());
                        throw new C8628a(sb3.toString());
                    }
                    this.f22185n = 0;
                }
                i++;
                this.f22185n = 0;
            } while (i != 0);
            int[] iArr = this.f22162h;
            int i3 = this.f22159e;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f22161g[i3 - 1] = "null";
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Cannot skip unexpected ");
        sb4.append(peek());
        sb4.append(" at ");
        sb4.append(mo23232e());
        throw new C8628a(sb4.toString());
    }

    public C8632b peek() throws IOException {
        int i = this.f22185n;
        if (i == 0) {
            i = m20085o();
        }
        switch (i) {
            case 1:
                return C8632b.BEGIN_OBJECT;
            case 2:
                return C8632b.END_OBJECT;
            case 3:
                return C8632b.BEGIN_ARRAY;
            case 4:
                return C8632b.END_ARRAY;
            case 5:
            case 6:
                return C8632b.BOOLEAN;
            case 7:
                return C8632b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C8632b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return C8632b.NAME;
            case 16:
            case 17:
                return C8632b.NUMBER;
            case 18:
                return C8632b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JsonReader(");
        sb.append(this.f22183l);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: b */
    private boolean m20083b(int i) throws IOException {
        if (!(i == 9 || i == 10 || i == 12 || i == 13 || i == 32)) {
            if (i != 35) {
                if (i != 44) {
                    if (!(i == 47 || i == 61)) {
                        if (!(i == 123 || i == 125 || i == 58)) {
                            if (i != 59) {
                                switch (i) {
                                    case 91:
                                    case 93:
                                        break;
                                    case 92:
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
            m20084n();
        }
        return false;
    }

    /* renamed from: b */
    private void m20082b(C13346d dVar) throws IOException {
        while (true) {
            long indexOfElement = this.f22183l.indexOfElement(dVar);
            if (indexOfElement == -1) {
                mo23226a("Unterminated string");
                throw null;
            } else if (this.f22184m.mo38482a(indexOfElement) == 92) {
                this.f22184m.skip(indexOfElement + 1);
                m20089s();
            } else {
                this.f22184m.skip(indexOfElement + 1);
                return;
            }
        }
    }

    /* renamed from: a */
    public int mo23225a(C8631a aVar) throws IOException {
        int i = this.f22185n;
        if (i == 0) {
            i = m20085o();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m20079a(this.f22188q, aVar);
        }
        int select = this.f22183l.select(aVar.f22166b);
        if (select != -1) {
            this.f22185n = 0;
            this.f22161g[this.f22159e - 1] = aVar.f22165a[select];
            return select;
        }
        String str = this.f22161g[this.f22159e - 1];
        String j = mo23237j();
        int a = m20079a(j, aVar);
        if (a == -1) {
            this.f22185n = 15;
            this.f22188q = j;
            this.f22161g[this.f22159e - 1] = str;
        }
        return a;
    }

    /* renamed from: a */
    private int m20079a(String str, C8631a aVar) {
        int length = aVar.f22165a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f22165a[i])) {
                this.f22185n = 0;
                this.f22161g[this.f22159e - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private String m20081a(C13346d dVar) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long indexOfElement = this.f22183l.indexOfElement(dVar);
            if (indexOfElement == -1) {
                mo23226a("Unterminated string");
                throw null;
            } else if (this.f22184m.mo38482a(indexOfElement) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f22184m.readUtf8(indexOfElement));
                this.f22184m.readByte();
                sb.append(m20089s());
            } else if (sb == null) {
                String readUtf8 = this.f22184m.readUtf8(indexOfElement);
                this.f22184m.readByte();
                return readUtf8;
            } else {
                sb.append(this.f22184m.readUtf8(indexOfElement));
                this.f22184m.readByte();
                return sb.toString();
            }
        }
    }

    /* JADX INFO: used method not loaded: okio.c.a(long):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.f22184m.skip((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1 != 47) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.f22183l.request(2) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        m20084n();
        r3 = r6.f22184m.mo38482a(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r3 == 42) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r3 == 47) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r6.f22184m.readByte();
        r6.f22184m.readByte();
        m20091u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r6.f22184m.readByte();
        r6.f22184m.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (m20090t() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        mo23226a("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r1 != 35) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        m20084n();
        m20091u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m20080a(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            okio.BufferedSource r2 = r6.f22183l
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L_0x0082
            okio.c r2 = r6.f22184m
            long r4 = (long) r1
            byte r1 = r2.mo38482a(r4)
            r2 = 10
            if (r1 == r2) goto L_0x0080
            r2 = 32
            if (r1 == r2) goto L_0x0080
            r2 = 13
            if (r1 == r2) goto L_0x0080
            r2 = 9
            if (r1 != r2) goto L_0x0025
            goto L_0x0080
        L_0x0025:
            okio.c r2 = r6.f22184m
            int r3 = r3 + -1
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L_0x0074
            okio.BufferedSource r3 = r6.f22183l
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L_0x003c
            return r1
        L_0x003c:
            r6.m20084n()
            okio.c r3 = r6.f22184m
            r4 = 1
            byte r3 = r3.mo38482a(r4)
            r4 = 42
            if (r3 == r4) goto L_0x005c
            if (r3 == r2) goto L_0x004e
            return r1
        L_0x004e:
            okio.c r1 = r6.f22184m
            r1.readByte()
            okio.c r1 = r6.f22184m
            r1.readByte()
            r6.m20091u()
            goto L_0x0001
        L_0x005c:
            okio.c r1 = r6.f22184m
            r1.readByte()
            okio.c r1 = r6.f22184m
            r1.readByte()
            boolean r1 = r6.m20090t()
            if (r1 == 0) goto L_0x006d
            goto L_0x0001
        L_0x006d:
            java.lang.String r7 = "Unterminated comment"
            r6.mo23226a(r7)
            r7 = 0
            throw r7
        L_0x0074:
            r2 = 35
            if (r1 != r2) goto L_0x007f
            r6.m20084n()
            r6.m20091u()
            goto L_0x0001
        L_0x007f:
            return r1
        L_0x0080:
            r1 = r3
            goto L_0x0002
        L_0x0082:
            if (r7 != 0) goto L_0x0086
            r7 = -1
            return r7
        L_0x0086:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p287p.p288k0.C8634e.m20080a(boolean):int");
    }
}
