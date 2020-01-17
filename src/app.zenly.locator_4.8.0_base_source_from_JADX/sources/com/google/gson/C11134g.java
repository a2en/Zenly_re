package com.google.gson;

import com.google.gson.internal.C11175k;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11264b;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* renamed from: com.google.gson.g */
public final class C11134g {
    /* renamed from: a */
    public JsonElement mo32486a(String str) throws JsonSyntaxException {
        return mo32485a((Reader) new StringReader(str));
    }

    /* renamed from: a */
    public JsonElement mo32485a(Reader reader) throws JsonIOException, JsonSyntaxException {
        try {
            C11262a aVar = new C11262a(reader);
            JsonElement a = mo32484a(aVar);
            if (!a.isJsonNull()) {
                if (aVar.peek() != C11264b.END_DOCUMENT) {
                    throw new JsonSyntaxException("Did not consume the entire document.");
                }
            }
            return a;
        } catch (MalformedJsonException e) {
            throw new JsonSyntaxException((Throwable) e);
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        } catch (NumberFormatException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        }
    }

    /* renamed from: a */
    public JsonElement mo32484a(C11262a aVar) throws JsonIOException, JsonSyntaxException {
        String str = " to Json";
        String str2 = "Failed parsing JSON source: ";
        boolean h = aVar.mo32672h();
        aVar.mo32670a(true);
        try {
            JsonElement a = C11175k.m28743a(aVar);
            aVar.mo32670a(h);
            return a;
        } catch (StackOverflowError e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(aVar);
            sb.append(str);
            throw new JsonParseException(sb.toString(), e);
        } catch (OutOfMemoryError e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(aVar);
            sb2.append(str);
            throw new JsonParseException(sb2.toString(), e2);
        } catch (Throwable th) {
            aVar.mo32670a(h);
            throw th;
        }
    }
}
