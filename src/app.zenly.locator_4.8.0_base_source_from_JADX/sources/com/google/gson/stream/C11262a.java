package com.google.gson.stream;

import com.google.gson.internal.C11163f;
import com.google.gson.internal.p312m.C11190e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* renamed from: com.google.gson.stream.a */
public class C11262a implements Closeable {

    /* renamed from: t */
    private static final char[] f29058t = ")]}'\n".toCharArray();

    /* renamed from: e */
    private final Reader f29059e;

    /* renamed from: f */
    private boolean f29060f = false;

    /* renamed from: g */
    private final char[] f29061g = new char[1024];

    /* renamed from: h */
    private int f29062h = 0;

    /* renamed from: i */
    private int f29063i = 0;

    /* renamed from: j */
    private int f29064j = 0;

    /* renamed from: k */
    private int f29065k = 0;

    /* renamed from: l */
    int f29066l = 0;

    /* renamed from: m */
    private long f29067m;

    /* renamed from: n */
    private int f29068n;

    /* renamed from: o */
    private String f29069o;

    /* renamed from: p */
    private int[] f29070p = new int[32];

    /* renamed from: q */
    private int f29071q = 0;

    /* renamed from: r */
    private String[] f29072r;

    /* renamed from: s */
    private int[] f29073s;

    /* renamed from: com.google.gson.stream.a$a */
    static class C11263a extends C11163f {
        C11263a() {
        }

        /* renamed from: a */
        public void mo32516a(C11262a aVar) throws IOException {
            if (aVar instanceof C11190e) {
                ((C11190e) aVar).mo32589r();
                return;
            }
            int i = aVar.f29066l;
            if (i == 0) {
                i = aVar.mo32671c();
            }
            if (i == 13) {
                aVar.f29066l = 9;
            } else if (i == 12) {
                aVar.f29066l = 8;
            } else if (i == 14) {
                aVar.f29066l = 10;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a name but was ");
                sb.append(aVar.peek());
                sb.append(aVar.mo32673i());
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    static {
        C11163f.f28885a = new C11263a();
    }

    public C11262a(Reader reader) {
        int[] iArr = this.f29070p;
        int i = this.f29071q;
        this.f29071q = i + 1;
        iArr[i] = 6;
        this.f29072r = new String[32];
        this.f29073s = new int[32];
        if (reader != null) {
            this.f29059e = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: r */
    private void mo32589r() throws IOException {
        if (!this.f29060f) {
            m28860b("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* renamed from: s */
    private void m28865s() throws IOException {
        m28859b(true);
        this.f29062h--;
        int i = this.f29062h;
        char[] cArr = f29058t;
        if (i + cArr.length <= this.f29063i || m28857a(cArr.length)) {
            int i2 = 0;
            while (true) {
                char[] cArr2 = f29058t;
                if (i2 >= cArr2.length) {
                    this.f29062h += cArr2.length;
                    return;
                } else if (this.f29061g[this.f29062h + i2] == cArr2[i2]) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004b, code lost:
        mo32589r();
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m28866t() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = r1
        L_0x0003:
            r1 = 0
        L_0x0004:
            int r3 = r6.f29062h
            int r4 = r3 + r1
            int r5 = r6.f29063i
            if (r4 >= r5) goto L_0x004f
            char[] r4 = r6.f29061g
            int r3 = r3 + r1
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005d
            r4 = 10
            if (r3 == r4) goto L_0x005d
            r4 = 12
            if (r3 == r4) goto L_0x005d
            r4 = 13
            if (r3 == r4) goto L_0x005d
            r4 = 32
            if (r3 == r4) goto L_0x005d
            r4 = 35
            if (r3 == r4) goto L_0x004b
            r4 = 44
            if (r3 == r4) goto L_0x005d
            r4 = 47
            if (r3 == r4) goto L_0x004b
            r4 = 61
            if (r3 == r4) goto L_0x004b
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005d
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005d
            r4 = 58
            if (r3 == r4) goto L_0x005d
            r4 = 59
            if (r3 == r4) goto L_0x004b
            switch(r3) {
                case 91: goto L_0x005d;
                case 92: goto L_0x004b;
                case 93: goto L_0x005d;
                default: goto L_0x0048;
            }
        L_0x0048:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x004b:
            r6.mo32589r()
            goto L_0x005d
        L_0x004f:
            char[] r3 = r6.f29061g
            int r3 = r3.length
            if (r1 >= r3) goto L_0x005f
            int r3 = r1 + 1
            boolean r3 = r6.m28857a(r3)
            if (r3 == 0) goto L_0x005d
            goto L_0x0004
        L_0x005d:
            r0 = r1
            goto L_0x007f
        L_0x005f:
            if (r2 != 0) goto L_0x006c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r1, r3)
            r2.<init>(r3)
        L_0x006c:
            char[] r3 = r6.f29061g
            int r4 = r6.f29062h
            r2.append(r3, r4, r1)
            int r3 = r6.f29062h
            int r3 = r3 + r1
            r6.f29062h = r3
            r1 = 1
            boolean r1 = r6.m28857a(r1)
            if (r1 != 0) goto L_0x0003
        L_0x007f:
            if (r2 != 0) goto L_0x008b
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f29061g
            int r3 = r6.f29062h
            r1.<init>(r2, r3, r0)
            goto L_0x0096
        L_0x008b:
            char[] r1 = r6.f29061g
            int r3 = r6.f29062h
            r2.append(r1, r3, r0)
            java.lang.String r1 = r2.toString()
        L_0x0096:
            int r2 = r6.f29062h
            int r2 = r2 + r0
            r6.f29062h = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C11262a.m28866t():java.lang.String");
    }

    /* renamed from: u */
    private int m28867u() throws IOException {
        String str;
        String str2;
        int i;
        char c = this.f29061g[this.f29062h];
        if (c == 't' || c == 'T') {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f29062h + i2 >= this.f29063i && !m28857a(i2 + 1)) {
                return 0;
            }
            char c2 = this.f29061g[this.f29062h + i2];
            if (c2 != str2.charAt(i2) && c2 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f29062h + length < this.f29063i || m28857a(length + 1)) && m28856a(this.f29061g[this.f29062h + length])) {
            return 0;
        }
        this.f29062h += length;
        this.f29066l = i;
        return i;
    }

    /* renamed from: v */
    private int m28868v() throws IOException {
        char c;
        char[] cArr = this.f29061g;
        int i = this.f29062h;
        int i2 = 0;
        int i3 = this.f29063i;
        int i4 = 0;
        char c2 = 0;
        boolean z = true;
        long j = 0;
        boolean z2 = false;
        while (true) {
            if (i + i4 == i3) {
                if (i4 == cArr.length) {
                    return i2;
                }
                if (!m28857a(i4 + 1)) {
                    break;
                }
                i = this.f29062h;
                i3 = this.f29063i;
            }
            c = cArr[i + i4];
            if (c == '+') {
                i2 = 0;
                if (c2 != 5) {
                    return 0;
                }
            } else if (c == 'E' || c == 'e') {
                i2 = 0;
                if (c2 != 2 && c2 != 4) {
                    return 0;
                }
                c2 = 5;
                i4++;
            } else {
                if (c == '-') {
                    i2 = 0;
                    if (c2 == 0) {
                        c2 = 1;
                        z2 = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                } else if (c == '.') {
                    i2 = 0;
                    if (c2 != 2) {
                        return 0;
                    }
                    c2 = 3;
                } else if (c >= '0' && c <= '9') {
                    if (c2 == 1 || c2 == 0) {
                        j = (long) (-(c - '0'));
                        i2 = 0;
                        c2 = 2;
                    } else {
                        if (c2 == 2) {
                            if (j == 0) {
                                return 0;
                            }
                            long j2 = (10 * j) - ((long) (c - '0'));
                            int i5 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                            boolean z3 = i5 > 0 || (i5 == 0 && j2 < j);
                            j = j2;
                            z = z3 & z;
                        } else if (c2 == 3) {
                            i2 = 0;
                            c2 = 4;
                        } else if (c2 == 5 || c2 == 6) {
                            i2 = 0;
                            c2 = 7;
                        }
                        i2 = 0;
                    }
                }
                i4++;
            }
            c2 = 6;
            i4++;
        }
        if (m28856a(c)) {
            return 0;
        }
        if (c2 == 2 && z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
            if (!z2) {
                j = -j;
            }
            this.f29067m = j;
            this.f29062h += i4;
            this.f29066l = 15;
            return 15;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f29068n = i4;
            this.f29066l = 16;
            return 16;
        }
    }

    /* renamed from: w */
    private char m28869w() throws IOException {
        int i;
        int i2;
        String str = "Unterminated escape sequence";
        if (this.f29062h != this.f29063i || m28857a(1)) {
            char[] cArr = this.f29061g;
            int i3 = this.f29062h;
            this.f29062h = i3 + 1;
            char c = cArr[i3];
            if (c == 10) {
                this.f29064j++;
                this.f29065k = this.f29062h;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    m28860b("Invalid escape sequence");
                    throw null;
                } else if (this.f29062h + 4 <= this.f29063i || m28857a(4)) {
                    char c2 = 0;
                    int i4 = this.f29062h;
                    int i5 = i4 + 4;
                    while (i4 < i5) {
                        char c3 = this.f29061g[i4];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                StringBuilder sb = new StringBuilder();
                                sb.append("\\u");
                                sb.append(new String(this.f29061g, this.f29062h, 4));
                                throw new NumberFormatException(sb.toString());
                            } else {
                                i = c3 - 'A';
                            }
                            i2 = i + 10;
                        } else {
                            i2 = c3 - '0';
                        }
                        c2 = (char) (c4 + i2);
                        i4++;
                    }
                    this.f29062h += 4;
                    return c2;
                } else {
                    m28860b(str);
                    throw null;
                }
            }
            return c;
        }
        m28860b(str);
        throw null;
    }

    /* renamed from: x */
    private void m28870x() throws IOException {
        char c;
        do {
            if (this.f29062h < this.f29063i || m28857a(1)) {
                char[] cArr = this.f29061g;
                int i = this.f29062h;
                this.f29062h = i + 1;
                c = cArr[i];
                if (c == 10) {
                    this.f29064j++;
                    this.f29065k = this.f29062h;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        mo32589r();
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m28871y() throws java.io.IOException {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f29062h
            int r2 = r1 + r0
            int r3 = r4.f29063i
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f29061g
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.mo32589r()
        L_0x004b:
            int r1 = r4.f29062h
            int r1 = r1 + r0
            r4.f29062h = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f29062h = r1
            r0 = 1
            boolean r0 = r4.m28857a(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C11262a.m28871y():void");
    }

    /* renamed from: a */
    public final void mo32670a(boolean z) {
        this.f29060f = z;
    }

    /* renamed from: b */
    public void mo32574b() throws IOException {
        int i = this.f29066l;
        if (i == 0) {
            i = mo32671c();
        }
        if (i == 1) {
            m28862b(3);
            this.f29066l = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected BEGIN_OBJECT but was ");
        sb.append(peek());
        sb.append(mo32673i());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo32671c() throws IOException {
        int[] iArr = this.f29070p;
        int i = this.f29071q;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int b = m28859b(true);
            if (b != 44) {
                if (b == 59) {
                    mo32589r();
                } else if (b == 93) {
                    this.f29066l = 4;
                    return 4;
                } else {
                    m28860b("Unterminated array");
                    throw null;
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            this.f29070p[this.f29071q - 1] = 4;
            if (i2 == 5) {
                int b2 = m28859b(true);
                if (b2 != 44) {
                    if (b2 == 59) {
                        mo32589r();
                    } else if (b2 == 125) {
                        this.f29066l = 2;
                        return 2;
                    } else {
                        m28860b("Unterminated object");
                        throw null;
                    }
                }
            }
            int b3 = m28859b(true);
            if (b3 == 34) {
                this.f29066l = 13;
                return 13;
            } else if (b3 != 39) {
                String str = "Expected name";
                if (b3 != 125) {
                    mo32589r();
                    this.f29062h--;
                    if (m28856a((char) b3)) {
                        this.f29066l = 14;
                        return 14;
                    }
                    m28860b(str);
                    throw null;
                } else if (i2 != 5) {
                    this.f29066l = 2;
                    return 2;
                } else {
                    m28860b(str);
                    throw null;
                }
            } else {
                mo32589r();
                this.f29066l = 12;
                return 12;
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int b4 = m28859b(true);
            if (b4 != 58) {
                if (b4 == 61) {
                    mo32589r();
                    if (this.f29062h < this.f29063i || m28857a(1)) {
                        char[] cArr = this.f29061g;
                        int i3 = this.f29062h;
                        if (cArr[i3] == '>') {
                            this.f29062h = i3 + 1;
                        }
                    }
                } else {
                    m28860b("Expected ':'");
                    throw null;
                }
            }
        } else if (i2 == 6) {
            if (this.f29060f) {
                m28865s();
            }
            this.f29070p[this.f29071q - 1] = 7;
        } else if (i2 == 7) {
            if (m28859b(false) == -1) {
                this.f29066l = 17;
                return 17;
            }
            mo32589r();
            this.f29062h--;
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int b5 = m28859b(true);
        if (b5 == 34) {
            this.f29066l = 9;
            return 9;
        } else if (b5 != 39) {
            if (!(b5 == 44 || b5 == 59)) {
                if (b5 == 91) {
                    this.f29066l = 3;
                    return 3;
                } else if (b5 != 93) {
                    if (b5 != 123) {
                        this.f29062h--;
                        int u = m28867u();
                        if (u != 0) {
                            return u;
                        }
                        int v = m28868v();
                        if (v != 0) {
                            return v;
                        }
                        if (m28856a(this.f29061g[this.f29062h])) {
                            mo32589r();
                            this.f29066l = 10;
                            return 10;
                        }
                        m28860b("Expected value");
                        throw null;
                    }
                    this.f29066l = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f29066l = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                mo32589r();
                this.f29062h--;
                this.f29066l = 7;
                return 7;
            }
            m28860b("Unexpected value");
            throw null;
        } else {
            mo32589r();
            this.f29066l = 8;
            return 8;
        }
    }

    public void close() throws IOException {
        this.f29066l = 0;
        this.f29070p[0] = 8;
        this.f29071q = 1;
        this.f29059e.close();
    }

    /* renamed from: d */
    public void mo32576d() throws IOException {
        int i = this.f29066l;
        if (i == 0) {
            i = mo32671c();
        }
        if (i == 4) {
            this.f29071q--;
            int[] iArr = this.f29073s;
            int i2 = this.f29071q - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f29066l = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected END_ARRAY but was ");
        sb.append(peek());
        sb.append(mo32673i());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public void mo32577e() throws IOException {
        int i = this.f29066l;
        if (i == 0) {
            i = mo32671c();
        }
        if (i == 2) {
            this.f29071q--;
            String[] strArr = this.f29072r;
            int i2 = this.f29071q;
            strArr[i2] = null;
            int[] iArr = this.f29073s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f29066l = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected END_OBJECT but was ");
        sb.append(peek());
        sb.append(mo32673i());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: f */
    public String mo32578f() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.f29071q;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f29070p[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f29073s[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.f29072r;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: g */
    public boolean mo32579g() throws IOException {
        int i = this.f29066l;
        if (i == 0) {
            i = mo32671c();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: h */
    public final boolean mo32672h() {
        return this.f29060f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public String mo32673i() {
        int i = this.f29064j + 1;
        int i2 = (this.f29062h - this.f29065k) + 1;
        StringBuilder sb = new StringBuilder();
        sb.append(" at line ");
        sb.append(i);
        sb.append(" column ");
        sb.append(i2);
        sb.append(" path ");
        sb.append(mo32578f());
        return sb.toString();
    }

    /* renamed from: j */
    public boolean mo32580j() throws IOException {
        int i = this.f29066l;
        if (i == 0) {
            i = mo32671c();
        }
        if (i == 5) {
            this.f29066l = 0;
            int[] iArr = this.f29073s;
            int i2 = this.f29071q - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f29066l = 0;
            int[] iArr2 = this.f29073s;
            int i3 = this.f29071q - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a boolean but was ");
            sb.append(peek());
            sb.append(mo32673i());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: k */
    public double mo32581k() throws IOException {
        int i = this.f29066l;
        if (i == 0) {
            i = mo32671c();
        }
        if (i == 15) {
            this.f29066l = 0;
            int[] iArr = this.f29073s;
            int i2 = this.f29071q - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f29067m;
        }
        if (i == 16) {
            this.f29069o = new String(this.f29061g, this.f29062h, this.f29068n);
            this.f29062h += this.f29068n;
        } else if (i == 8 || i == 9) {
            this.f29069o = m28861b(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.f29069o = m28866t();
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a double but was ");
            sb.append(peek());
            sb.append(mo32673i());
            throw new IllegalStateException(sb.toString());
        }
        this.f29066l = 11;
        double parseDouble = Double.parseDouble(this.f29069o);
        if (this.f29060f || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f29069o = null;
            this.f29066l = 0;
            int[] iArr2 = this.f29073s;
            int i3 = this.f29071q - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("JSON forbids NaN and infinities: ");
        sb2.append(parseDouble);
        sb2.append(mo32673i());
        throw new MalformedJsonException(sb2.toString());
    }

    /* renamed from: l */
    public int mo32582l() throws IOException {
        int i = this.f29066l;
        if (i == 0) {
            i = mo32671c();
        }
        String str = "Expected an int but was ";
        if (i == 15) {
            long j = this.f29067m;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f29066l = 0;
                int[] iArr = this.f29073s;
                int i3 = this.f29071q - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f29067m);
            sb.append(mo32673i());
            throw new NumberFormatException(sb.toString());
        }
        if (i == 16) {
            this.f29069o = new String(this.f29061g, this.f29062h, this.f29068n);
            this.f29062h += this.f29068n;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f29069o = m28866t();
            } else {
                this.f29069o = m28861b(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f29069o);
                this.f29066l = 0;
                int[] iArr2 = this.f29073s;
                int i4 = this.f29071q - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(peek());
            sb2.append(mo32673i());
            throw new IllegalStateException(sb2.toString());
        }
        this.f29066l = 11;
        double parseDouble = Double.parseDouble(this.f29069o);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f29069o = null;
            this.f29066l = 0;
            int[] iArr3 = this.f29073s;
            int i6 = this.f29071q - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(this.f29069o);
        sb3.append(mo32673i());
        throw new NumberFormatException(sb3.toString());
    }

    /* renamed from: m */
    public long mo32583m() throws IOException {
        int i = this.f29066l;
        if (i == 0) {
            i = mo32671c();
        }
        if (i == 15) {
            this.f29066l = 0;
            int[] iArr = this.f29073s;
            int i2 = this.f29071q - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f29067m;
        }
        String str = "Expected a long but was ";
        if (i == 16) {
            this.f29069o = new String(this.f29061g, this.f29062h, this.f29068n);
            this.f29062h += this.f29068n;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f29069o = m28866t();
            } else {
                this.f29069o = m28861b(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f29069o);
                this.f29066l = 0;
                int[] iArr2 = this.f29073s;
                int i3 = this.f29071q - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(peek());
            sb.append(mo32673i());
            throw new IllegalStateException(sb.toString());
        }
        this.f29066l = 11;
        double parseDouble = Double.parseDouble(this.f29069o);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f29069o = null;
            this.f29066l = 0;
            int[] iArr3 = this.f29073s;
            int i4 = this.f29071q - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.f29069o);
        sb2.append(mo32673i());
        throw new NumberFormatException(sb2.toString());
    }

    /* renamed from: n */
    public String mo32584n() throws IOException {
        String str;
        int i = this.f29066l;
        if (i == 0) {
            i = mo32671c();
        }
        if (i == 14) {
            str = m28866t();
        } else if (i == 12) {
            str = m28861b('\'');
        } else if (i == 13) {
            str = m28861b('\"');
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a name but was ");
            sb.append(peek());
            sb.append(mo32673i());
            throw new IllegalStateException(sb.toString());
        }
        this.f29066l = 0;
        this.f29072r[this.f29071q - 1] = str;
        return str;
    }

    /* renamed from: o */
    public void mo32585o() throws IOException {
        int i = this.f29066l;
        if (i == 0) {
            i = mo32671c();
        }
        if (i == 7) {
            this.f29066l = 0;
            int[] iArr = this.f29073s;
            int i2 = this.f29071q - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected null but was ");
        sb.append(peek());
        sb.append(mo32673i());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: p */
    public String mo32586p() throws IOException {
        String str;
        int i = this.f29066l;
        if (i == 0) {
            i = mo32671c();
        }
        if (i == 10) {
            str = m28866t();
        } else if (i == 8) {
            str = m28861b('\'');
        } else if (i == 9) {
            str = m28861b('\"');
        } else if (i == 11) {
            str = this.f29069o;
            this.f29069o = null;
        } else if (i == 15) {
            str = Long.toString(this.f29067m);
        } else if (i == 16) {
            str = new String(this.f29061g, this.f29062h, this.f29068n);
            this.f29062h += this.f29068n;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a string but was ");
            sb.append(peek());
            sb.append(mo32673i());
            throw new IllegalStateException(sb.toString());
        }
        this.f29066l = 0;
        int[] iArr = this.f29073s;
        int i2 = this.f29071q - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public C11264b peek() throws IOException {
        int i = this.f29066l;
        if (i == 0) {
            i = mo32671c();
        }
        switch (i) {
            case 1:
                return C11264b.BEGIN_OBJECT;
            case 2:
                return C11264b.END_OBJECT;
            case 3:
                return C11264b.BEGIN_ARRAY;
            case 4:
                return C11264b.END_ARRAY;
            case 5:
            case 6:
                return C11264b.BOOLEAN;
            case 7:
                return C11264b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C11264b.STRING;
            case 12:
            case 13:
            case 14:
                return C11264b.NAME;
            case 15:
            case 16:
                return C11264b.NUMBER;
            case 17:
                return C11264b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: q */
    public void mo32588q() throws IOException {
        int i = 0;
        do {
            int i2 = this.f29066l;
            if (i2 == 0) {
                i2 = mo32671c();
            }
            if (i2 == 3) {
                m28862b(1);
            } else if (i2 == 1) {
                m28862b(3);
            } else {
                if (i2 == 4) {
                    this.f29071q--;
                } else if (i2 == 2) {
                    this.f29071q--;
                } else if (i2 == 14 || i2 == 10) {
                    m28871y();
                    this.f29066l = 0;
                } else if (i2 == 8 || i2 == 12) {
                    m28863c('\'');
                    this.f29066l = 0;
                } else if (i2 == 9 || i2 == 13) {
                    m28863c('\"');
                    this.f29066l = 0;
                } else {
                    if (i2 == 16) {
                        this.f29062h += this.f29068n;
                    }
                    this.f29066l = 0;
                }
                i--;
                this.f29066l = 0;
            }
            i++;
            this.f29066l = 0;
        } while (i != 0);
        int[] iArr = this.f29073s;
        int i3 = this.f29071q;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f29072r[i3 - 1] = "null";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(mo32673i());
        return sb.toString();
    }

    /* renamed from: a */
    public void mo32573a() throws IOException {
        int i = this.f29066l;
        if (i == 0) {
            i = mo32671c();
        }
        if (i == 3) {
            m28862b(1);
            this.f29073s[this.f29071q - 1] = 0;
            this.f29066l = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected BEGIN_ARRAY but was ");
        sb.append(peek());
        sb.append(mo32673i());
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r2 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        r2 = new java.lang.StringBuilder(java.lang.Math.max((r3 - r5) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r2.append(r0, r5, r3 - r5);
        r10.f29062h = r3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m28861b(char r11) throws java.io.IOException {
        /*
            r10 = this;
            char[] r0 = r10.f29061g
            r1 = 0
            r2 = r1
        L_0x0004:
            int r3 = r10.f29062h
            int r4 = r10.f29063i
        L_0x0008:
            r5 = r3
        L_0x0009:
            r6 = 16
            r7 = 1
            if (r3 >= r4) goto L_0x005c
            int r8 = r3 + 1
            char r3 = r0[r3]
            if (r3 != r11) goto L_0x0028
            r10.f29062h = r8
            int r8 = r8 - r5
            int r8 = r8 - r7
            if (r2 != 0) goto L_0x0020
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r5, r8)
            return r11
        L_0x0020:
            r2.append(r0, r5, r8)
            java.lang.String r11 = r2.toString()
            return r11
        L_0x0028:
            r9 = 92
            if (r3 != r9) goto L_0x004f
            r10.f29062h = r8
            int r8 = r8 - r5
            int r8 = r8 - r7
            if (r2 != 0) goto L_0x0040
            int r2 = r8 + 1
            int r2 = r2 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r3.<init>(r2)
            r2 = r3
        L_0x0040:
            r2.append(r0, r5, r8)
            char r3 = r10.m28869w()
            r2.append(r3)
            int r3 = r10.f29062h
            int r4 = r10.f29063i
            goto L_0x0008
        L_0x004f:
            r6 = 10
            if (r3 != r6) goto L_0x005a
            int r3 = r10.f29064j
            int r3 = r3 + r7
            r10.f29064j = r3
            r10.f29065k = r8
        L_0x005a:
            r3 = r8
            goto L_0x0009
        L_0x005c:
            if (r2 != 0) goto L_0x006c
            int r2 = r3 - r5
            int r2 = r2 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r4.<init>(r2)
            r2 = r4
        L_0x006c:
            int r4 = r3 - r5
            r2.append(r0, r5, r4)
            r10.f29062h = r3
            boolean r3 = r10.m28857a(r7)
            if (r3 == 0) goto L_0x007a
            goto L_0x0004
        L_0x007a:
            java.lang.String r11 = "Unterminated string"
            r10.m28860b(r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C11262a.m28861b(char):java.lang.String");
    }

    /* renamed from: a */
    private boolean m28856a(char c) throws IOException {
        if (!(c == 9 || c == 10 || c == 12 || c == 13 || c == ' ')) {
            if (c != '#') {
                if (c != ',') {
                    if (!(c == '/' || c == '=')) {
                        if (!(c == '{' || c == '}' || c == ':')) {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        break;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
            mo32589r();
        }
        return false;
    }

    /* renamed from: a */
    private boolean m28857a(int i) throws IOException {
        char[] cArr = this.f29061g;
        int i2 = this.f29065k;
        int i3 = this.f29062h;
        this.f29065k = i2 - i3;
        int i4 = this.f29063i;
        if (i4 != i3) {
            this.f29063i = i4 - i3;
            System.arraycopy(cArr, i3, cArr, 0, this.f29063i);
        } else {
            this.f29063i = 0;
        }
        this.f29062h = 0;
        do {
            Reader reader = this.f29059e;
            int i5 = this.f29063i;
            int read = reader.read(cArr, i5, cArr.length - i5);
            if (read == -1) {
                return false;
            }
            this.f29063i += read;
            if (this.f29064j == 0) {
                int i6 = this.f29065k;
                if (i6 == 0 && this.f29063i > 0 && cArr[0] == 65279) {
                    this.f29062h++;
                    this.f29065k = i6 + 1;
                    i++;
                }
            }
        } while (this.f29063i < i);
        return true;
    }

    /* renamed from: a */
    private boolean m28858a(String str) throws IOException {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f29062h + length > this.f29063i && !m28857a(length)) {
                return false;
            }
            char[] cArr = this.f29061g;
            int i2 = this.f29062h;
            if (cArr[i2] == 10) {
                this.f29064j++;
                this.f29065k = i2 + 1;
            } else {
                while (i < length) {
                    if (this.f29061g[this.f29062h + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f29062h++;
        }
    }

    /* renamed from: b */
    private void m28862b(int i) {
        int i2 = this.f29071q;
        int[] iArr = this.f29070p;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            int[] iArr3 = new int[(i2 * 2)];
            String[] strArr = new String[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f29073s, 0, iArr3, 0, this.f29071q);
            System.arraycopy(this.f29072r, 0, strArr, 0, this.f29071q);
            this.f29070p = iArr2;
            this.f29073s = iArr3;
            this.f29072r = strArr;
        }
        int[] iArr4 = this.f29070p;
        int i3 = this.f29071q;
        this.f29071q = i3 + 1;
        iArr4[i3] = i;
    }

    /* renamed from: b */
    private int m28859b(boolean z) throws IOException {
        char[] cArr = this.f29061g;
        int i = this.f29062h;
        int i2 = this.f29063i;
        while (true) {
            if (i == i2) {
                this.f29062h = i;
                if (m28857a(1)) {
                    i = this.f29062h;
                    i2 = this.f29063i;
                } else if (!z) {
                    return -1;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("End of input");
                    sb.append(mo32673i());
                    throw new EOFException(sb.toString());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.f29064j++;
                this.f29065k = i3;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.f29062h = i3;
                    if (i3 == i2) {
                        this.f29062h--;
                        boolean a = m28857a(2);
                        this.f29062h++;
                        if (!a) {
                            return c;
                        }
                    }
                    mo32589r();
                    int i4 = this.f29062h;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f29062h = i4 + 1;
                        if (m28858a("*/")) {
                            i = this.f29062h + 2;
                            i2 = this.f29063i;
                        } else {
                            m28860b("Unterminated comment");
                            throw null;
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.f29062h = i4 + 1;
                        m28870x();
                        i = this.f29062h;
                        i2 = this.f29063i;
                    }
                } else if (c == '#') {
                    this.f29062h = i3;
                    mo32589r();
                    m28870x();
                    i = this.f29062h;
                    i2 = this.f29063i;
                } else {
                    this.f29062h = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* renamed from: c */
    private void m28863c(char c) throws IOException {
        char[] cArr = this.f29061g;
        do {
            int i = this.f29062h;
            int i2 = this.f29063i;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f29062h = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f29062h = i3;
                    m28869w();
                    i = this.f29062h;
                    i2 = this.f29063i;
                } else {
                    if (c2 == 10) {
                        this.f29064j++;
                        this.f29065k = i3;
                    }
                    i = i3;
                }
            }
            this.f29062h = i;
        } while (m28857a(1));
        m28860b("Unterminated string");
        throw null;
    }

    /* renamed from: b */
    private IOException m28860b(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(mo32673i());
        throw new MalformedJsonException(sb.toString());
    }
}
