package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.internal.p312m.C11212n;
import com.google.gson.stream.C11265c;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.google.gson.internal.k */
public final class C11175k {

    /* renamed from: com.google.gson.internal.k$a */
    private static final class C11176a extends Writer {

        /* renamed from: e */
        private final Appendable f28910e;

        /* renamed from: f */
        private final C11177a f28911f = new C11177a();

        /* renamed from: com.google.gson.internal.k$a$a */
        static class C11177a implements CharSequence {

            /* renamed from: e */
            char[] f28912e;

            C11177a() {
            }

            public char charAt(int i) {
                return this.f28912e[i];
            }

            public int length() {
                return this.f28912e.length;
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.f28912e, i, i2 - i);
            }
        }

        C11176a(Appendable appendable) {
            this.f28910e = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(char[] cArr, int i, int i2) throws IOException {
            C11177a aVar = this.f28911f;
            aVar.f28912e = cArr;
            this.f28910e.append(aVar, i, i2 + i);
        }

        public void write(int i) throws IOException {
            this.f28910e.append((char) i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new com.google.gson.JsonIOException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return com.google.gson.C11133f.f28848a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: MalformedJsonException (r2v4 'e' com.google.gson.stream.MalformedJsonException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.gson.JsonElement m28743a(com.google.gson.stream.C11262a r2) throws com.google.gson.JsonParseException {
        /*
            r2.peek()     // Catch:{ EOFException -> 0x0024, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            com.google.gson.i<com.google.gson.JsonElement> r1 = com.google.gson.internal.p312m.C11212n.f29006X     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.read(r2)     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            com.google.gson.JsonElement r2 = (com.google.gson.JsonElement) r2     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>(r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            com.google.gson.f r2 = com.google.gson.C11133f.f28848a
            return r2
        L_0x002b:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C11175k.m28743a(com.google.gson.stream.a):com.google.gson.JsonElement");
    }

    /* renamed from: a */
    public static void m28745a(JsonElement jsonElement, C11265c cVar) throws IOException {
        C11212n.f29006X.write(cVar, jsonElement);
    }

    /* renamed from: a */
    public static Writer m28744a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C11176a(appendable);
    }
}
