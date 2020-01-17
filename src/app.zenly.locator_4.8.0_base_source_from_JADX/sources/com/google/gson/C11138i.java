package com.google.gson;

import com.google.gson.internal.p312m.C11190e;
import com.google.gson.internal.p312m.C11192f;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11264b;
import com.google.gson.stream.C11265c;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: com.google.gson.i */
public abstract class C11138i<T> {

    /* renamed from: com.google.gson.i$a */
    class C11139a extends C11138i<T> {
        C11139a() {
        }

        public T read(C11262a aVar) throws IOException {
            if (aVar.peek() != C11264b.NULL) {
                return C11138i.this.read(aVar);
            }
            aVar.mo32585o();
            return null;
        }

        public void write(C11265c cVar, T t) throws IOException {
            if (t == null) {
                cVar.mo32606h();
            } else {
                C11138i.this.write(cVar, t);
            }
        }
    }

    public final T fromJson(Reader reader) throws IOException {
        return read(new C11262a(reader));
    }

    public final T fromJsonTree(JsonElement jsonElement) {
        try {
            return read(new C11190e(jsonElement));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    public final C11138i<T> nullSafe() {
        return new C11139a();
    }

    public abstract T read(C11262a aVar) throws IOException;

    public final void toJson(Writer writer, T t) throws IOException {
        write(new C11265c(writer), t);
    }

    public final JsonElement toJsonTree(T t) {
        try {
            C11192f fVar = new C11192f();
            write(fVar, t);
            return fVar.mo32607i();
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    public abstract void write(C11265c cVar, T t) throws IOException;

    public final T fromJson(String str) throws IOException {
        return fromJson((Reader) new StringReader(str));
    }

    public final String toJson(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
