package com.evernote.android.job.util.support;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: com.evernote.android.job.util.support.a */
class C9472a implements XmlSerializer {

    /* renamed from: k */
    private static final String[] f24535k = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};

    /* renamed from: l */
    private static String f24536l = "                                                              ";

    /* renamed from: a */
    private final char[] f24537a = new char[8192];

    /* renamed from: b */
    private int f24538b;

    /* renamed from: c */
    private Writer f24539c;

    /* renamed from: d */
    private OutputStream f24540d;

    /* renamed from: e */
    private CharsetEncoder f24541e;

    /* renamed from: f */
    private ByteBuffer f24542f = ByteBuffer.allocate(8192);

    /* renamed from: g */
    private boolean f24543g = false;

    /* renamed from: h */
    private boolean f24544h;

    /* renamed from: i */
    private int f24545i = 0;

    /* renamed from: j */
    private boolean f24546j = true;

    C9472a() {
    }

    /* renamed from: a */
    private void m23080a(char c) throws IOException {
        int i = this.f24538b;
        if (i >= 8191) {
            flush();
            i = this.f24538b;
        }
        this.f24537a[i] = c;
        this.f24538b = i + 1;
    }

    /* renamed from: b */
    private void m23085b(String str) throws IOException {
        int length = str.length();
        String[] strArr = f24535k;
        char length2 = (char) strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < length2) {
                String str2 = strArr[charAt];
                if (str2 != null) {
                    if (i2 < i) {
                        m23083a(str, i2, i - i2);
                    }
                    i2 = i + 1;
                    m23082a(str2);
                }
            }
            i++;
        }
        if (i2 < i) {
            m23083a(str, i2, i - i2);
        }
    }

    public XmlSerializer attribute(String str, String str2, String str3) throws IOException, IllegalArgumentException, IllegalStateException {
        m23080a(' ');
        if (str != null) {
            m23082a(str);
            m23080a(':');
        }
        m23082a(str2);
        m23082a("=\"");
        m23085b(str3);
        m23080a('\"');
        this.f24546j = false;
        return this;
    }

    public void cdsect(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void comment(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void docdecl(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void endDocument() throws IOException, IllegalArgumentException, IllegalStateException {
        flush();
    }

    public XmlSerializer endTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        this.f24545i--;
        if (this.f24544h) {
            m23082a(" />\n");
        } else {
            if (this.f24543g && this.f24546j) {
                m23081a(this.f24545i);
            }
            m23082a("</");
            if (str != null) {
                m23082a(str);
                m23080a(':');
            }
            m23082a(str2);
            m23082a(">\n");
        }
        this.f24546j = true;
        this.f24544h = false;
        return this;
    }

    public void entityRef(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void flush() throws IOException {
        int i = this.f24538b;
        if (i > 0) {
            if (this.f24540d != null) {
                CharBuffer wrap = CharBuffer.wrap(this.f24537a, 0, i);
                CoderResult encode = this.f24541e.encode(wrap, this.f24542f, true);
                while (!encode.isError()) {
                    if (encode.isOverflow()) {
                        m23079a();
                        encode = this.f24541e.encode(wrap, this.f24542f, true);
                    } else {
                        m23079a();
                        this.f24540d.flush();
                    }
                }
                throw new IOException(encode.toString());
            }
            this.f24539c.write(this.f24537a, 0, i);
            this.f24539c.flush();
            this.f24538b = 0;
        }
    }

    public int getDepth() {
        throw new UnsupportedOperationException();
    }

    public boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getNamespace() {
        throw new UnsupportedOperationException();
    }

    public String getPrefix(String str, boolean z) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    public void ignorableWhitespace(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void processingInstruction(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void setFeature(String str, boolean z) throws IllegalArgumentException, IllegalStateException {
        if (str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            this.f24543g = true;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public void setOutput(OutputStream outputStream, String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (outputStream != null) {
            try {
                this.f24541e = Charset.forName(str).newEncoder();
                this.f24540d = outputStream;
            } catch (IllegalCharsetNameException e) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e));
            } catch (UnsupportedCharsetException e2) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e2));
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setPrefix(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void setProperty(String str, Object obj) throws IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void startDocument(String str, Boolean bool) throws IOException, IllegalArgumentException, IllegalStateException {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version='1.0' encoding='utf-8' standalone='");
        sb.append(bool.booleanValue() ? "yes" : "no");
        sb.append("' ?>\n");
        m23082a(sb.toString());
        this.f24546j = true;
    }

    public XmlSerializer startTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f24544h) {
            m23082a(">\n");
        }
        if (this.f24543g) {
            m23081a(this.f24545i);
        }
        this.f24545i++;
        m23080a('<');
        if (str != null) {
            m23082a(str);
            m23080a(':');
        }
        m23082a(str2);
        this.f24544h = true;
        this.f24546j = false;
        return this;
    }

    public XmlSerializer text(char[] cArr, int i, int i2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f24544h) {
            m23082a(">");
            this.f24544h = false;
        }
        m23086b(cArr, i, i2);
        if (this.f24543g) {
            int i3 = i + i2;
            boolean z = true;
            if (cArr[i3 - 1] != 10) {
                z = false;
            }
            this.f24546j = z;
        }
        return this;
    }

    /* renamed from: a */
    private void m23083a(String str, int i, int i2) throws IOException {
        if (i2 > 8192) {
            int i3 = i2 + i;
            while (i < i3) {
                int i4 = i + 8192;
                m23083a(str, i, i4 < i3 ? 8192 : i3 - i);
                i = i4;
            }
            return;
        }
        int i5 = this.f24538b;
        if (i5 + i2 > 8192) {
            flush();
            i5 = this.f24538b;
        }
        str.getChars(i, i + i2, this.f24537a, i5);
        this.f24538b = i5 + i2;
    }

    public XmlSerializer text(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        boolean z = false;
        if (this.f24544h) {
            m23082a(">");
            this.f24544h = false;
        }
        m23085b(str);
        if (this.f24543g) {
            if (str.length() > 0 && str.charAt(str.length() - 1) == 10) {
                z = true;
            }
            this.f24546j = z;
        }
        return this;
    }

    /* renamed from: b */
    private void m23086b(char[] cArr, int i, int i2) throws IOException {
        String[] strArr = f24535k;
        char length = (char) strArr.length;
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            char c = cArr[i];
            if (c < length) {
                String str = strArr[c];
                if (str != null) {
                    if (i4 < i) {
                        m23084a(cArr, i4, i - i4);
                    }
                    i4 = i + 1;
                    m23082a(str);
                }
            }
            i++;
        }
        if (i4 < i) {
            m23084a(cArr, i4, i - i4);
        }
    }

    public void setOutput(Writer writer) throws IOException, IllegalArgumentException, IllegalStateException {
        this.f24539c = writer;
    }

    /* renamed from: a */
    private void m23084a(char[] cArr, int i, int i2) throws IOException {
        if (i2 > 8192) {
            int i3 = i2 + i;
            while (i < i3) {
                int i4 = i + 8192;
                m23084a(cArr, i, i4 < i3 ? 8192 : i3 - i);
                i = i4;
            }
            return;
        }
        int i5 = this.f24538b;
        if (i5 + i2 > 8192) {
            flush();
            i5 = this.f24538b;
        }
        System.arraycopy(cArr, i, this.f24537a, i5, i2);
        this.f24538b = i5 + i2;
    }

    /* renamed from: a */
    private void m23082a(String str) throws IOException {
        m23083a(str, 0, str.length());
    }

    /* renamed from: a */
    private void m23081a(int i) throws IOException {
        int i2 = i * 4;
        if (i2 > f24536l.length()) {
            i2 = f24536l.length();
        }
        m23083a(f24536l, 0, i2);
    }

    /* renamed from: a */
    private void m23079a() throws IOException {
        int position = this.f24542f.position();
        if (position > 0) {
            this.f24542f.flip();
            this.f24540d.write(this.f24542f.array(), 0, position);
            this.f24542f.clear();
        }
    }
}
