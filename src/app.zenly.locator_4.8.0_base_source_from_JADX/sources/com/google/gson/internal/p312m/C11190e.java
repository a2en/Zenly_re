package com.google.gson.internal.p312m;

import com.google.gson.C11133f;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11264b;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.gson.internal.m.e */
public final class C11190e extends C11262a {

    /* renamed from: y */
    private static final Reader f28927y = new C11191a();

    /* renamed from: z */
    private static final Object f28928z = new Object();

    /* renamed from: u */
    private Object[] f28929u = new Object[32];

    /* renamed from: v */
    private int f28930v = 0;

    /* renamed from: w */
    private String[] f28931w = new String[32];

    /* renamed from: x */
    private int[] f28932x = new int[32];

    /* renamed from: com.google.gson.internal.m.e$a */
    static class C11191a extends Reader {
        C11191a() {
        }

        public void close() throws IOException {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    public C11190e(JsonElement jsonElement) {
        super(f28927y);
        m28758a((Object) jsonElement);
    }

    /* renamed from: i */
    private String m28759i() {
        StringBuilder sb = new StringBuilder();
        sb.append(" at path ");
        sb.append(mo32578f());
        return sb.toString();
    }

    /* renamed from: s */
    private Object m28760s() {
        return this.f28929u[this.f28930v - 1];
    }

    /* renamed from: t */
    private Object m28761t() {
        Object[] objArr = this.f28929u;
        int i = this.f28930v - 1;
        this.f28930v = i;
        Object obj = objArr[i];
        objArr[this.f28930v] = null;
        return obj;
    }

    /* renamed from: a */
    public void mo32573a() throws IOException {
        m28757a(C11264b.BEGIN_ARRAY);
        m28758a((Object) ((JsonArray) m28760s()).iterator());
        this.f28932x[this.f28930v - 1] = 0;
    }

    /* renamed from: b */
    public void mo32574b() throws IOException {
        m28757a(C11264b.BEGIN_OBJECT);
        m28758a((Object) ((JsonObject) m28760s()).entrySet().iterator());
    }

    public void close() throws IOException {
        this.f28929u = new Object[]{f28928z};
        this.f28930v = 1;
    }

    /* renamed from: d */
    public void mo32576d() throws IOException {
        m28757a(C11264b.END_ARRAY);
        m28761t();
        m28761t();
        int i = this.f28930v;
        if (i > 0) {
            int[] iArr = this.f28932x;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: e */
    public void mo32577e() throws IOException {
        m28757a(C11264b.END_OBJECT);
        m28761t();
        m28761t();
        int i = this.f28930v;
        if (i > 0) {
            int[] iArr = this.f28932x;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: f */
    public String mo32578f() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.f28930v) {
            Object[] objArr = this.f28929u;
            if (objArr[i] instanceof JsonArray) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f28932x[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof JsonObject) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f28931w;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: g */
    public boolean mo32579g() throws IOException {
        C11264b peek = peek();
        return (peek == C11264b.END_OBJECT || peek == C11264b.END_ARRAY) ? false : true;
    }

    /* renamed from: j */
    public boolean mo32580j() throws IOException {
        m28757a(C11264b.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) m28761t()).getAsBoolean();
        int i = this.f28930v;
        if (i > 0) {
            int[] iArr = this.f28932x;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asBoolean;
    }

    /* renamed from: k */
    public double mo32581k() throws IOException {
        C11264b peek = peek();
        if (peek == C11264b.NUMBER || peek == C11264b.STRING) {
            double asDouble = ((JsonPrimitive) m28760s()).getAsDouble();
            if (mo32672h() || (!Double.isNaN(asDouble) && !Double.isInfinite(asDouble))) {
                m28761t();
                int i = this.f28930v;
                if (i > 0) {
                    int[] iArr = this.f28932x;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return asDouble;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("JSON forbids NaN and infinities: ");
            sb.append(asDouble);
            throw new NumberFormatException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected ");
        sb2.append(C11264b.NUMBER);
        sb2.append(" but was ");
        sb2.append(peek);
        sb2.append(m28759i());
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: l */
    public int mo32582l() throws IOException {
        C11264b peek = peek();
        if (peek == C11264b.NUMBER || peek == C11264b.STRING) {
            int asInt = ((JsonPrimitive) m28760s()).getAsInt();
            m28761t();
            int i = this.f28930v;
            if (i > 0) {
                int[] iArr = this.f28932x;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return asInt;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(C11264b.NUMBER);
        sb.append(" but was ");
        sb.append(peek);
        sb.append(m28759i());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: m */
    public long mo32583m() throws IOException {
        C11264b peek = peek();
        if (peek == C11264b.NUMBER || peek == C11264b.STRING) {
            long asLong = ((JsonPrimitive) m28760s()).getAsLong();
            m28761t();
            int i = this.f28930v;
            if (i > 0) {
                int[] iArr = this.f28932x;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return asLong;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(C11264b.NUMBER);
        sb.append(" but was ");
        sb.append(peek);
        sb.append(m28759i());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: n */
    public String mo32584n() throws IOException {
        m28757a(C11264b.NAME);
        Entry entry = (Entry) ((Iterator) m28760s()).next();
        String str = (String) entry.getKey();
        this.f28931w[this.f28930v - 1] = str;
        m28758a(entry.getValue());
        return str;
    }

    /* renamed from: o */
    public void mo32585o() throws IOException {
        m28757a(C11264b.NULL);
        m28761t();
        int i = this.f28930v;
        if (i > 0) {
            int[] iArr = this.f28932x;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: p */
    public String mo32586p() throws IOException {
        C11264b peek = peek();
        if (peek == C11264b.STRING || peek == C11264b.NUMBER) {
            String asString = ((JsonPrimitive) m28761t()).getAsString();
            int i = this.f28930v;
            if (i > 0) {
                int[] iArr = this.f28932x;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return asString;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(C11264b.STRING);
        sb.append(" but was ");
        sb.append(peek);
        sb.append(m28759i());
        throw new IllegalStateException(sb.toString());
    }

    public C11264b peek() throws IOException {
        if (this.f28930v == 0) {
            return C11264b.END_DOCUMENT;
        }
        Object s = m28760s();
        if (s instanceof Iterator) {
            boolean z = this.f28929u[this.f28930v - 2] instanceof JsonObject;
            Iterator it = (Iterator) s;
            if (!it.hasNext()) {
                return z ? C11264b.END_OBJECT : C11264b.END_ARRAY;
            } else if (z) {
                return C11264b.NAME;
            } else {
                m28758a(it.next());
                return peek();
            }
        } else if (s instanceof JsonObject) {
            return C11264b.BEGIN_OBJECT;
        } else {
            if (s instanceof JsonArray) {
                return C11264b.BEGIN_ARRAY;
            }
            if (s instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) s;
                if (jsonPrimitive.isString()) {
                    return C11264b.STRING;
                }
                if (jsonPrimitive.isBoolean()) {
                    return C11264b.BOOLEAN;
                }
                if (jsonPrimitive.isNumber()) {
                    return C11264b.NUMBER;
                }
                throw new AssertionError();
            } else if (s instanceof C11133f) {
                return C11264b.NULL;
            } else {
                if (s == f28928z) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    /* renamed from: q */
    public void mo32588q() throws IOException {
        String str = "null";
        if (peek() == C11264b.NAME) {
            mo32584n();
            this.f28931w[this.f28930v - 2] = str;
        } else {
            m28761t();
            int i = this.f28930v;
            if (i > 0) {
                this.f28931w[i - 1] = str;
            }
        }
        int i2 = this.f28930v;
        if (i2 > 0) {
            int[] iArr = this.f28932x;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* renamed from: r */
    public void mo32589r() throws IOException {
        m28757a(C11264b.NAME);
        Entry entry = (Entry) ((Iterator) m28760s()).next();
        m28758a(entry.getValue());
        m28758a((Object) new JsonPrimitive((String) entry.getKey()));
    }

    public String toString() {
        return C11190e.class.getSimpleName();
    }

    /* renamed from: a */
    private void m28757a(C11264b bVar) throws IOException {
        if (peek() != bVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected ");
            sb.append(bVar);
            sb.append(" but was ");
            sb.append(peek());
            sb.append(m28759i());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private void m28758a(Object obj) {
        int i = this.f28930v;
        Object[] objArr = this.f28929u;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[(i * 2)];
            int[] iArr = new int[(i * 2)];
            String[] strArr = new String[(i * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f28932x, 0, iArr, 0, this.f28930v);
            System.arraycopy(this.f28931w, 0, strArr, 0, this.f28930v);
            this.f28929u = objArr2;
            this.f28932x = iArr;
            this.f28931w = strArr;
        }
        Object[] objArr3 = this.f28929u;
        int i2 = this.f28930v;
        this.f28930v = i2 + 1;
        objArr3[i2] = obj;
    }
}
