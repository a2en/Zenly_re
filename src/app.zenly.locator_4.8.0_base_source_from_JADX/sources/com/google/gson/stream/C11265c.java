package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.google.gson.stream.c */
public class C11265c implements Closeable, Flushable {

    /* renamed from: n */
    private static final String[] f29085n = new String[128];

    /* renamed from: o */
    private static final String[] f29086o;

    /* renamed from: e */
    private final Writer f29087e;

    /* renamed from: f */
    private int[] f29088f = new int[32];

    /* renamed from: g */
    private int f29089g = 0;

    /* renamed from: h */
    private String f29090h;

    /* renamed from: i */
    private String f29091i;

    /* renamed from: j */
    private boolean f29092j;

    /* renamed from: k */
    private boolean f29093k;

    /* renamed from: l */
    private String f29094l;

    /* renamed from: m */
    private boolean f29095m;

    static {
        for (int i = 0; i <= 31; i++) {
            f29085n[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f29085n;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f29086o = (String[]) strArr.clone();
        String[] strArr2 = f29086o;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C11265c(Writer writer) {
        m28893a(6);
        this.f29091i = ":";
        this.f29095m = true;
        if (writer != null) {
            this.f29087e = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: i */
    private void mo32607i() throws IOException {
        int peek = peek();
        if (peek == 5) {
            this.f29087e.write(44);
        } else if (peek != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m28898k();
        m28894b(4);
    }

    /* renamed from: j */
    private void m28897j() throws IOException {
        int peek = peek();
        if (peek == 1) {
            m28894b(2);
            m28898k();
        } else if (peek == 2) {
            this.f29087e.append(',');
            m28898k();
        } else if (peek != 4) {
            if (peek != 6) {
                if (peek != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f29092j) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m28894b(7);
        } else {
            this.f29087e.append(this.f29091i);
            m28894b(5);
        }
    }

    /* renamed from: k */
    private void m28898k() throws IOException {
        if (this.f29090h != null) {
            this.f29087e.write("\n");
            int i = this.f29089g;
            for (int i2 = 1; i2 < i; i2++) {
                this.f29087e.write(this.f29090h);
            }
        }
    }

    /* renamed from: l */
    private void m28899l() throws IOException {
        if (this.f29094l != null) {
            mo32607i();
            m28895e(this.f29094l);
            this.f29094l = null;
        }
    }

    private int peek() {
        int i = this.f29089g;
        if (i != 0) {
            return this.f29088f[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: a */
    public final void mo32675a(boolean z) {
        this.f29093k = z;
    }

    /* renamed from: b */
    public final void mo32676b(boolean z) {
        this.f29092j = z;
    }

    /* renamed from: c */
    public final void mo32677c(String str) {
        if (str.length() == 0) {
            this.f29090h = null;
            this.f29091i = ":";
            return;
        }
        this.f29090h = str;
        this.f29091i = ": ";
    }

    public void close() throws IOException {
        this.f29087e.close();
        int i = this.f29089g;
        if (i > 1 || (i == 1 && this.f29088f[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f29089g = 0;
    }

    /* renamed from: d */
    public C11265c mo32602d() throws IOException {
        m28891a(3, 5, "}");
        return this;
    }

    /* renamed from: e */
    public final boolean mo32679e() {
        return this.f29095m;
    }

    /* renamed from: f */
    public final boolean mo32680f() {
        return this.f29093k;
    }

    public void flush() throws IOException {
        if (this.f29089g != 0) {
            this.f29087e.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public boolean mo32681g() {
        return this.f29092j;
    }

    /* renamed from: h */
    public C11265c mo32606h() throws IOException {
        if (this.f29094l != null) {
            if (this.f29095m) {
                m28899l();
            } else {
                this.f29094l = null;
                return this;
            }
        }
        m28897j();
        this.f29087e.write("null");
        return this;
    }

    /* renamed from: e */
    private void m28895e(String str) throws IOException {
        String str2;
        String[] strArr = this.f29093k ? f29086o : f29085n;
        String str3 = "\"";
        this.f29087e.write(str3);
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
                this.f29087e.write(str, i, i2 - i);
            }
            this.f29087e.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f29087e.write(str, i, length - i);
        }
        this.f29087e.write(str3);
    }

    /* renamed from: a */
    public C11265c mo32593a() throws IOException {
        m28899l();
        m28892a(1, "[");
        return this;
    }

    /* renamed from: b */
    public C11265c mo32598b() throws IOException {
        m28899l();
        m28892a(3, "{");
        return this;
    }

    /* renamed from: d */
    public C11265c mo32603d(String str) throws IOException {
        if (str == null) {
            return mo32606h();
        }
        m28899l();
        m28897j();
        m28895e(str);
        return this;
    }

    /* renamed from: a */
    private C11265c m28892a(int i, String str) throws IOException {
        m28897j();
        m28893a(i);
        this.f29087e.write(str);
        return this;
    }

    /* renamed from: b */
    private void m28894b(int i) {
        this.f29088f[this.f29089g - 1] = i;
    }

    /* renamed from: b */
    public C11265c mo32599b(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f29094l != null) {
            throw new IllegalStateException();
        } else if (this.f29089g != 0) {
            this.f29094l = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: c */
    public final void mo32678c(boolean z) {
        this.f29095m = z;
    }

    /* renamed from: d */
    public C11265c mo32604d(boolean z) throws IOException {
        m28899l();
        m28897j();
        this.f29087e.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: a */
    private C11265c m28891a(int i, int i2, String str) throws IOException {
        int peek = peek();
        if (peek != i2 && peek != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f29094l == null) {
            this.f29089g--;
            if (peek == i2) {
                m28898k();
            }
            this.f29087e.write(str);
            return this;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Dangling name: ");
            sb.append(this.f29094l);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: c */
    public C11265c mo32600c() throws IOException {
        m28891a(1, 2, "]");
        return this;
    }

    /* renamed from: a */
    private void m28893a(int i) {
        int i2 = this.f29089g;
        int[] iArr = this.f29088f;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f29088f = iArr2;
        }
        int[] iArr3 = this.f29088f;
        int i3 = this.f29089g;
        this.f29089g = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: a */
    public C11265c mo32674a(String str) throws IOException {
        if (str == null) {
            return mo32606h();
        }
        m28899l();
        m28897j();
        this.f29087e.append(str);
        return this;
    }

    /* renamed from: a */
    public C11265c mo32596a(Boolean bool) throws IOException {
        if (bool == null) {
            return mo32606h();
        }
        m28899l();
        m28897j();
        this.f29087e.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: a */
    public C11265c mo32594a(double d) throws IOException {
        m28899l();
        if (this.f29092j || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            m28897j();
            this.f29087e.append(Double.toString(d));
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Numeric values must be finite, but was ");
        sb.append(d);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public C11265c mo32595a(long j) throws IOException {
        m28899l();
        m28897j();
        this.f29087e.write(Long.toString(j));
        return this;
    }

    /* renamed from: a */
    public C11265c mo32597a(Number number) throws IOException {
        if (number == null) {
            return mo32606h();
        }
        m28899l();
        String obj = number.toString();
        if (this.f29092j || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m28897j();
            this.f29087e.append(obj);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Numeric values must be finite, but was ");
        sb.append(number);
        throw new IllegalArgumentException(sb.toString());
    }
}
