package com.google.gson.internal.p312m;

import com.google.gson.C11133f;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.C11265c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.gson.internal.m.f */
public final class C11192f extends C11265c {

    /* renamed from: s */
    private static final Writer f28933s = new C11193a();

    /* renamed from: t */
    private static final JsonPrimitive f28934t = new JsonPrimitive("closed");

    /* renamed from: p */
    private final List<JsonElement> f28935p = new ArrayList();

    /* renamed from: q */
    private String f28936q;

    /* renamed from: r */
    private JsonElement f28937r = C11133f.f28848a;

    /* renamed from: com.google.gson.internal.m.f$a */
    static class C11193a extends Writer {
        C11193a() {
        }

        public void close() throws IOException {
            throw new AssertionError();
        }

        public void flush() throws IOException {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C11192f() {
        super(f28933s);
    }

    /* renamed from: a */
    private void m28777a(JsonElement jsonElement) {
        if (this.f28936q != null) {
            if (!jsonElement.isJsonNull() || mo32679e()) {
                ((JsonObject) peek()).add(this.f28936q, jsonElement);
            }
            this.f28936q = null;
        } else if (this.f28935p.isEmpty()) {
            this.f28937r = jsonElement;
        } else {
            JsonElement peek = peek();
            if (peek instanceof JsonArray) {
                ((JsonArray) peek).add(jsonElement);
                return;
            }
            throw new IllegalStateException();
        }
    }

    private JsonElement peek() {
        List<JsonElement> list = this.f28935p;
        return (JsonElement) list.get(list.size() - 1);
    }

    /* renamed from: b */
    public C11265c mo32598b() throws IOException {
        JsonObject jsonObject = new JsonObject();
        m28777a((JsonElement) jsonObject);
        this.f28935p.add(jsonObject);
        return this;
    }

    /* renamed from: c */
    public C11265c mo32600c() throws IOException {
        if (this.f28935p.isEmpty() || this.f28936q != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof JsonArray) {
            List<JsonElement> list = this.f28935p;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void close() throws IOException {
        if (this.f28935p.isEmpty()) {
            this.f28935p.add(f28934t);
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public C11265c mo32602d() throws IOException {
        if (this.f28935p.isEmpty() || this.f28936q != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof JsonObject) {
            List<JsonElement> list = this.f28935p;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void flush() throws IOException {
    }

    /* renamed from: h */
    public C11265c mo32606h() throws IOException {
        m28777a((JsonElement) C11133f.f28848a);
        return this;
    }

    /* renamed from: i */
    public JsonElement mo32607i() {
        if (this.f28935p.isEmpty()) {
            return this.f28937r;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected one JSON element but was ");
        sb.append(this.f28935p);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public C11265c mo32599b(String str) throws IOException {
        if (this.f28935p.isEmpty() || this.f28936q != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof JsonObject) {
            this.f28936q = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: d */
    public C11265c mo32603d(String str) throws IOException {
        if (str == null) {
            mo32606h();
            return this;
        }
        m28777a((JsonElement) new JsonPrimitive(str));
        return this;
    }

    /* renamed from: d */
    public C11265c mo32604d(boolean z) throws IOException {
        m28777a((JsonElement) new JsonPrimitive(Boolean.valueOf(z)));
        return this;
    }

    /* renamed from: a */
    public C11265c mo32593a() throws IOException {
        JsonArray jsonArray = new JsonArray();
        m28777a((JsonElement) jsonArray);
        this.f28935p.add(jsonArray);
        return this;
    }

    /* renamed from: a */
    public C11265c mo32596a(Boolean bool) throws IOException {
        if (bool == null) {
            mo32606h();
            return this;
        }
        m28777a((JsonElement) new JsonPrimitive(bool));
        return this;
    }

    /* renamed from: a */
    public C11265c mo32594a(double d) throws IOException {
        if (mo32681g() || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            m28777a((JsonElement) new JsonPrimitive((Number) Double.valueOf(d)));
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("JSON forbids NaN and infinities: ");
        sb.append(d);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public C11265c mo32595a(long j) throws IOException {
        m28777a((JsonElement) new JsonPrimitive((Number) Long.valueOf(j)));
        return this;
    }

    /* renamed from: a */
    public C11265c mo32597a(Number number) throws IOException {
        if (number == null) {
            mo32606h();
            return this;
        }
        if (!mo32681g()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                StringBuilder sb = new StringBuilder();
                sb.append("JSON forbids NaN and infinities: ");
                sb.append(number);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        m28777a((JsonElement) new JsonPrimitive(number));
        return this;
    }
}
