package com.google.gson.internal.p312m;

import com.google.gson.C11125d;
import com.google.gson.C11133f;
import com.google.gson.C11138i;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C11164g;
import com.google.gson.p315j.C11258c;
import com.google.gson.p316k.C11261a;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11264b;
import com.google.gson.stream.C11265c;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: com.google.gson.internal.m.n */
public final class C11212n {

    /* renamed from: A */
    public static final C11138i<String> f28983A = new C11226g();

    /* renamed from: B */
    public static final C11138i<BigDecimal> f28984B = new C11228h();

    /* renamed from: C */
    public static final C11138i<BigInteger> f28985C = new C11230i();

    /* renamed from: D */
    public static final TypeAdapterFactory f28986D = m28811a(String.class, f28983A);

    /* renamed from: E */
    public static final C11138i<StringBuilder> f28987E = new C11232j();

    /* renamed from: F */
    public static final TypeAdapterFactory f28988F = m28811a(StringBuilder.class, f28987E);

    /* renamed from: G */
    public static final C11138i<StringBuffer> f28989G = new C11236l();

    /* renamed from: H */
    public static final TypeAdapterFactory f28990H = m28811a(StringBuffer.class, f28989G);

    /* renamed from: I */
    public static final C11138i<URL> f28991I = new C11237m();

    /* renamed from: J */
    public static final TypeAdapterFactory f28992J = m28811a(URL.class, f28991I);

    /* renamed from: K */
    public static final C11138i<URI> f28993K = new C11238n();

    /* renamed from: L */
    public static final TypeAdapterFactory f28994L = m28811a(URI.class, f28993K);

    /* renamed from: M */
    public static final C11138i<InetAddress> f28995M = new C11239o();

    /* renamed from: N */
    public static final TypeAdapterFactory f28996N = m28813b(InetAddress.class, f28995M);

    /* renamed from: O */
    public static final C11138i<UUID> f28997O = new C11240p();

    /* renamed from: P */
    public static final TypeAdapterFactory f28998P = m28811a(UUID.class, f28997O);

    /* renamed from: Q */
    public static final C11138i<Currency> f28999Q = new C11241q().nullSafe();

    /* renamed from: R */
    public static final TypeAdapterFactory f29000R = m28811a(Currency.class, f28999Q);

    /* renamed from: S */
    public static final TypeAdapterFactory f29001S = new C11242r();

    /* renamed from: T */
    public static final C11138i<Calendar> f29002T = new C11244s();

    /* renamed from: U */
    public static final TypeAdapterFactory f29003U = m28814b(Calendar.class, GregorianCalendar.class, f29002T);

    /* renamed from: V */
    public static final C11138i<Locale> f29004V = new C11245t();

    /* renamed from: W */
    public static final TypeAdapterFactory f29005W = m28811a(Locale.class, f29004V);

    /* renamed from: X */
    public static final C11138i<JsonElement> f29006X = new C11246u();

    /* renamed from: Y */
    public static final TypeAdapterFactory f29007Y = m28813b(JsonElement.class, f29006X);

    /* renamed from: Z */
    public static final TypeAdapterFactory f29008Z = new C11248w();

    /* renamed from: a */
    public static final C11138i<Class> f29009a = new C11234k().nullSafe();

    /* renamed from: b */
    public static final TypeAdapterFactory f29010b = m28811a(Class.class, f29009a);

    /* renamed from: c */
    public static final C11138i<BitSet> f29011c = new C11247v().nullSafe();

    /* renamed from: d */
    public static final TypeAdapterFactory f29012d = m28811a(BitSet.class, f29011c);

    /* renamed from: e */
    public static final C11138i<Boolean> f29013e = new C11221d0();

    /* renamed from: f */
    public static final C11138i<Boolean> f29014f = new C11223e0();

    /* renamed from: g */
    public static final TypeAdapterFactory f29015g = m28812a(Boolean.TYPE, Boolean.class, f29013e);

    /* renamed from: h */
    public static final C11138i<Number> f29016h = new C11225f0();

    /* renamed from: i */
    public static final TypeAdapterFactory f29017i = m28812a(Byte.TYPE, Byte.class, f29016h);

    /* renamed from: j */
    public static final C11138i<Number> f29018j = new C11227g0();

    /* renamed from: k */
    public static final TypeAdapterFactory f29019k = m28812a(Short.TYPE, Short.class, f29018j);

    /* renamed from: l */
    public static final C11138i<Number> f29020l = new C11229h0();

    /* renamed from: m */
    public static final TypeAdapterFactory f29021m = m28812a(Integer.TYPE, Integer.class, f29020l);

    /* renamed from: n */
    public static final C11138i<AtomicInteger> f29022n = new C11231i0().nullSafe();

    /* renamed from: o */
    public static final TypeAdapterFactory f29023o = m28811a(AtomicInteger.class, f29022n);

    /* renamed from: p */
    public static final C11138i<AtomicBoolean> f29024p = new C11233j0().nullSafe();

    /* renamed from: q */
    public static final TypeAdapterFactory f29025q = m28811a(AtomicBoolean.class, f29024p);

    /* renamed from: r */
    public static final C11138i<AtomicIntegerArray> f29026r = new C11213a().nullSafe();

    /* renamed from: s */
    public static final TypeAdapterFactory f29027s = m28811a(AtomicIntegerArray.class, f29026r);

    /* renamed from: t */
    public static final C11138i<Number> f29028t = new C11215b();

    /* renamed from: u */
    public static final C11138i<Number> f29029u = new C11218c();

    /* renamed from: v */
    public static final C11138i<Number> f29030v = new C11220d();

    /* renamed from: w */
    public static final C11138i<Number> f29031w = new C11222e();

    /* renamed from: x */
    public static final TypeAdapterFactory f29032x = m28811a(Number.class, f29031w);

    /* renamed from: y */
    public static final C11138i<Character> f29033y = new C11224f();

    /* renamed from: z */
    public static final TypeAdapterFactory f29034z = m28812a(Character.TYPE, Character.class, f29033y);

    /* renamed from: com.google.gson.internal.m.n$a */
    static class C11213a extends C11138i<AtomicIntegerArray> {
        C11213a() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.mo32593a();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                cVar.mo32595a((long) atomicIntegerArray.get(i));
            }
            cVar.mo32600c();
        }

        public AtomicIntegerArray read(C11262a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.mo32573a();
            while (aVar.mo32579g()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.mo32582l()));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }
            aVar.mo32576d();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }
    }

    /* renamed from: com.google.gson.internal.m.n$a0 */
    static class C11214a0 implements TypeAdapterFactory {

        /* renamed from: e */
        final /* synthetic */ Class f29035e;

        /* renamed from: f */
        final /* synthetic */ Class f29036f;

        /* renamed from: g */
        final /* synthetic */ C11138i f29037g;

        C11214a0(Class cls, Class cls2, C11138i iVar) {
            this.f29035e = cls;
            this.f29036f = cls2;
            this.f29037g = iVar;
        }

        public <T> C11138i<T> create(C11125d dVar, C11261a<T> aVar) {
            Class rawType = aVar.getRawType();
            if (rawType == this.f29035e || rawType == this.f29036f) {
                return this.f29037g;
            }
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Factory[type=");
            sb.append(this.f29035e.getName());
            sb.append("+");
            sb.append(this.f29036f.getName());
            sb.append(",adapter=");
            sb.append(this.f29037g);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: com.google.gson.internal.m.n$b */
    static class C11215b extends C11138i<Number> {
        C11215b() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, Number number) throws IOException {
            cVar.mo32597a(number);
        }

        public Number read(C11262a aVar) throws IOException {
            if (aVar.peek() == C11264b.NULL) {
                aVar.mo32585o();
                return null;
            }
            try {
                return Long.valueOf(aVar.mo32583m());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.m.n$b0 */
    static class C11216b0 implements TypeAdapterFactory {

        /* renamed from: e */
        final /* synthetic */ Class f29038e;

        /* renamed from: f */
        final /* synthetic */ C11138i f29039f;

        /* renamed from: com.google.gson.internal.m.n$b0$a */
        class C11217a extends C11138i<T1> {

            /* renamed from: a */
            final /* synthetic */ Class f29040a;

            C11217a(Class cls) {
                this.f29040a = cls;
            }

            public T1 read(C11262a aVar) throws IOException {
                T1 read = C11216b0.this.f29039f.read(aVar);
                if (read == null || this.f29040a.isInstance(read)) {
                    return read;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a ");
                sb.append(this.f29040a.getName());
                sb.append(" but was ");
                sb.append(read.getClass().getName());
                throw new JsonSyntaxException(sb.toString());
            }

            public void write(C11265c cVar, T1 t1) throws IOException {
                C11216b0.this.f29039f.write(cVar, t1);
            }
        }

        C11216b0(Class cls, C11138i iVar) {
            this.f29038e = cls;
            this.f29039f = iVar;
        }

        public <T2> C11138i<T2> create(C11125d dVar, C11261a<T2> aVar) {
            Class rawType = aVar.getRawType();
            if (!this.f29038e.isAssignableFrom(rawType)) {
                return null;
            }
            return new C11217a(rawType);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Factory[typeHierarchy=");
            sb.append(this.f29038e.getName());
            sb.append(",adapter=");
            sb.append(this.f29039f);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: com.google.gson.internal.m.n$c */
    static class C11218c extends C11138i<Number> {
        C11218c() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, Number number) throws IOException {
            cVar.mo32597a(number);
        }

        public Number read(C11262a aVar) throws IOException {
            if (aVar.peek() != C11264b.NULL) {
                return Float.valueOf((float) aVar.mo32581k());
            }
            aVar.mo32585o();
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.m.n$c0 */
    static /* synthetic */ class C11219c0 {

        /* renamed from: a */
        static final /* synthetic */ int[] f29042a = new int[C11264b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.google.gson.stream.b[] r0 = com.google.gson.stream.C11264b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29042a = r0
                int[] r0 = f29042a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.gson.stream.b r1 = com.google.gson.stream.C11264b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f29042a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.gson.stream.b r1 = com.google.gson.stream.C11264b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f29042a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.google.gson.stream.b r1 = com.google.gson.stream.C11264b.STRING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f29042a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.google.gson.stream.b r1 = com.google.gson.stream.C11264b.NULL     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f29042a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.google.gson.stream.b r1 = com.google.gson.stream.C11264b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f29042a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.google.gson.stream.b r1 = com.google.gson.stream.C11264b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f29042a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.google.gson.stream.b r1 = com.google.gson.stream.C11264b.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f29042a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.google.gson.stream.b r1 = com.google.gson.stream.C11264b.NAME     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f29042a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.google.gson.stream.b r1 = com.google.gson.stream.C11264b.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f29042a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.google.gson.stream.b r1 = com.google.gson.stream.C11264b.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.p312m.C11212n.C11219c0.<clinit>():void");
        }
    }

    /* renamed from: com.google.gson.internal.m.n$d */
    static class C11220d extends C11138i<Number> {
        C11220d() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, Number number) throws IOException {
            cVar.mo32597a(number);
        }

        public Number read(C11262a aVar) throws IOException {
            if (aVar.peek() != C11264b.NULL) {
                return Double.valueOf(aVar.mo32581k());
            }
            aVar.mo32585o();
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.m.n$d0 */
    static class C11221d0 extends C11138i<Boolean> {
        C11221d0() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, Boolean bool) throws IOException {
            cVar.mo32596a(bool);
        }

        public Boolean read(C11262a aVar) throws IOException {
            C11264b peek = aVar.peek();
            if (peek == C11264b.NULL) {
                aVar.mo32585o();
                return null;
            } else if (peek == C11264b.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.mo32586p()));
            } else {
                return Boolean.valueOf(aVar.mo32580j());
            }
        }
    }

    /* renamed from: com.google.gson.internal.m.n$e */
    static class C11222e extends C11138i<Number> {
        C11222e() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, Number number) throws IOException {
            cVar.mo32597a(number);
        }

        public Number read(C11262a aVar) throws IOException {
            C11264b peek = aVar.peek();
            int i = C11219c0.f29042a[peek.ordinal()];
            if (i == 1 || i == 3) {
                return new C11164g(aVar.mo32586p());
            }
            if (i == 4) {
                aVar.mo32585o();
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expecting number, got: ");
            sb.append(peek);
            throw new JsonSyntaxException(sb.toString());
        }
    }

    /* renamed from: com.google.gson.internal.m.n$e0 */
    static class C11223e0 extends C11138i<Boolean> {
        C11223e0() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, Boolean bool) throws IOException {
            cVar.mo32603d(bool == null ? "null" : bool.toString());
        }

        public Boolean read(C11262a aVar) throws IOException {
            if (aVar.peek() != C11264b.NULL) {
                return Boolean.valueOf(aVar.mo32586p());
            }
            aVar.mo32585o();
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.m.n$f */
    static class C11224f extends C11138i<Character> {
        C11224f() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, Character ch) throws IOException {
            cVar.mo32603d(ch == null ? null : String.valueOf(ch));
        }

        public Character read(C11262a aVar) throws IOException {
            if (aVar.peek() == C11264b.NULL) {
                aVar.mo32585o();
                return null;
            }
            String p = aVar.mo32586p();
            if (p.length() == 1) {
                return Character.valueOf(p.charAt(0));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expecting character, got: ");
            sb.append(p);
            throw new JsonSyntaxException(sb.toString());
        }
    }

    /* renamed from: com.google.gson.internal.m.n$f0 */
    static class C11225f0 extends C11138i<Number> {
        C11225f0() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, Number number) throws IOException {
            cVar.mo32597a(number);
        }

        public Number read(C11262a aVar) throws IOException {
            if (aVar.peek() == C11264b.NULL) {
                aVar.mo32585o();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.mo32582l());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.m.n$g */
    static class C11226g extends C11138i<String> {
        C11226g() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, String str) throws IOException {
            cVar.mo32603d(str);
        }

        public String read(C11262a aVar) throws IOException {
            C11264b peek = aVar.peek();
            if (peek == C11264b.NULL) {
                aVar.mo32585o();
                return null;
            } else if (peek == C11264b.BOOLEAN) {
                return Boolean.toString(aVar.mo32580j());
            } else {
                return aVar.mo32586p();
            }
        }
    }

    /* renamed from: com.google.gson.internal.m.n$g0 */
    static class C11227g0 extends C11138i<Number> {
        C11227g0() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, Number number) throws IOException {
            cVar.mo32597a(number);
        }

        public Number read(C11262a aVar) throws IOException {
            if (aVar.peek() == C11264b.NULL) {
                aVar.mo32585o();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.mo32582l());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.m.n$h */
    static class C11228h extends C11138i<BigDecimal> {
        C11228h() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.mo32597a((Number) bigDecimal);
        }

        public BigDecimal read(C11262a aVar) throws IOException {
            if (aVar.peek() == C11264b.NULL) {
                aVar.mo32585o();
                return null;
            }
            try {
                return new BigDecimal(aVar.mo32586p());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.m.n$h0 */
    static class C11229h0 extends C11138i<Number> {
        C11229h0() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, Number number) throws IOException {
            cVar.mo32597a(number);
        }

        public Number read(C11262a aVar) throws IOException {
            if (aVar.peek() == C11264b.NULL) {
                aVar.mo32585o();
                return null;
            }
            try {
                return Integer.valueOf(aVar.mo32582l());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.m.n$i */
    static class C11230i extends C11138i<BigInteger> {
        C11230i() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, BigInteger bigInteger) throws IOException {
            cVar.mo32597a((Number) bigInteger);
        }

        public BigInteger read(C11262a aVar) throws IOException {
            if (aVar.peek() == C11264b.NULL) {
                aVar.mo32585o();
                return null;
            }
            try {
                return new BigInteger(aVar.mo32586p());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.m.n$i0 */
    static class C11231i0 extends C11138i<AtomicInteger> {
        C11231i0() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.mo32595a((long) atomicInteger.get());
        }

        public AtomicInteger read(C11262a aVar) throws IOException {
            try {
                return new AtomicInteger(aVar.mo32582l());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.m.n$j */
    static class C11232j extends C11138i<StringBuilder> {
        C11232j() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, StringBuilder sb) throws IOException {
            cVar.mo32603d(sb == null ? null : sb.toString());
        }

        public StringBuilder read(C11262a aVar) throws IOException {
            if (aVar.peek() != C11264b.NULL) {
                return new StringBuilder(aVar.mo32586p());
            }
            aVar.mo32585o();
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.m.n$j0 */
    static class C11233j0 extends C11138i<AtomicBoolean> {
        C11233j0() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.mo32604d(atomicBoolean.get());
        }

        public AtomicBoolean read(C11262a aVar) throws IOException {
            return new AtomicBoolean(aVar.mo32580j());
        }
    }

    /* renamed from: com.google.gson.internal.m.n$k */
    static class C11234k extends C11138i<Class> {
        C11234k() {
        }

        /* renamed from: a */
        public void mo32637a(C11265c cVar, Class cls) throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append("Attempted to serialize java.lang.Class: ");
            sb.append(cls.getName());
            sb.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(sb.toString());
        }

        public /* bridge */ /* synthetic */ void write(C11265c cVar, Object obj) throws IOException {
            mo32637a(cVar, (Class) obj);
            throw null;
        }

        public Class read(C11262a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }
    }

    /* renamed from: com.google.gson.internal.m.n$k0 */
    private static final class C11235k0<T extends Enum<T>> extends C11138i<T> {

        /* renamed from: a */
        private final Map<String, T> f29043a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f29044b = new HashMap();

        public C11235k0(Class<T> cls) {
            Enum[] enumArr;
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    C11258c cVar = (C11258c) cls.getField(name).getAnnotation(C11258c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String put : cVar.alternate()) {
                            this.f29043a.put(put, enumR);
                        }
                    }
                    this.f29043a.put(name, enumR);
                    this.f29044b.put(enumR, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: a */
        public void write(C11265c cVar, T t) throws IOException {
            cVar.mo32603d(t == null ? null : (String) this.f29044b.get(t));
        }

        public T read(C11262a aVar) throws IOException {
            if (aVar.peek() != C11264b.NULL) {
                return (Enum) this.f29043a.get(aVar.mo32586p());
            }
            aVar.mo32585o();
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.m.n$l */
    static class C11236l extends C11138i<StringBuffer> {
        C11236l() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.mo32603d(stringBuffer == null ? null : stringBuffer.toString());
        }

        public StringBuffer read(C11262a aVar) throws IOException {
            if (aVar.peek() != C11264b.NULL) {
                return new StringBuffer(aVar.mo32586p());
            }
            aVar.mo32585o();
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.m.n$m */
    static class C11237m extends C11138i<URL> {
        C11237m() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, URL url) throws IOException {
            cVar.mo32603d(url == null ? null : url.toExternalForm());
        }

        public URL read(C11262a aVar) throws IOException {
            URL url = null;
            if (aVar.peek() == C11264b.NULL) {
                aVar.mo32585o();
                return null;
            }
            String p = aVar.mo32586p();
            if (!"null".equals(p)) {
                url = new URL(p);
            }
            return url;
        }
    }

    /* renamed from: com.google.gson.internal.m.n$n */
    static class C11238n extends C11138i<URI> {
        C11238n() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, URI uri) throws IOException {
            cVar.mo32603d(uri == null ? null : uri.toASCIIString());
        }

        public URI read(C11262a aVar) throws IOException {
            URI uri = null;
            if (aVar.peek() == C11264b.NULL) {
                aVar.mo32585o();
                return null;
            }
            try {
                String p = aVar.mo32586p();
                if (!"null".equals(p)) {
                    uri = new URI(p);
                }
                return uri;
            } catch (URISyntaxException e) {
                throw new JsonIOException((Throwable) e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.m.n$o */
    static class C11239o extends C11138i<InetAddress> {
        C11239o() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, InetAddress inetAddress) throws IOException {
            cVar.mo32603d(inetAddress == null ? null : inetAddress.getHostAddress());
        }

        public InetAddress read(C11262a aVar) throws IOException {
            if (aVar.peek() != C11264b.NULL) {
                return InetAddress.getByName(aVar.mo32586p());
            }
            aVar.mo32585o();
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.m.n$p */
    static class C11240p extends C11138i<UUID> {
        C11240p() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, UUID uuid) throws IOException {
            cVar.mo32603d(uuid == null ? null : uuid.toString());
        }

        public UUID read(C11262a aVar) throws IOException {
            if (aVar.peek() != C11264b.NULL) {
                return UUID.fromString(aVar.mo32586p());
            }
            aVar.mo32585o();
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.m.n$q */
    static class C11241q extends C11138i<Currency> {
        C11241q() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, Currency currency) throws IOException {
            cVar.mo32603d(currency.getCurrencyCode());
        }

        public Currency read(C11262a aVar) throws IOException {
            return Currency.getInstance(aVar.mo32586p());
        }
    }

    /* renamed from: com.google.gson.internal.m.n$r */
    static class C11242r implements TypeAdapterFactory {

        /* renamed from: com.google.gson.internal.m.n$r$a */
        class C11243a extends C11138i<Timestamp> {

            /* renamed from: a */
            final /* synthetic */ C11138i f29045a;

            C11243a(C11242r rVar, C11138i iVar) {
                this.f29045a = iVar;
            }

            /* renamed from: a */
            public void write(C11265c cVar, Timestamp timestamp) throws IOException {
                this.f29045a.write(cVar, timestamp);
            }

            public Timestamp read(C11262a aVar) throws IOException {
                Date date = (Date) this.f29045a.read(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }
        }

        C11242r() {
        }

        public <T> C11138i<T> create(C11125d dVar, C11261a<T> aVar) {
            if (aVar.getRawType() != Timestamp.class) {
                return null;
            }
            return new C11243a(this, dVar.mo32449a(Date.class));
        }
    }

    /* renamed from: com.google.gson.internal.m.n$s */
    static class C11244s extends C11138i<Calendar> {
        C11244s() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.mo32606h();
                return;
            }
            cVar.mo32598b();
            cVar.mo32599b("year");
            cVar.mo32595a((long) calendar.get(1));
            cVar.mo32599b("month");
            cVar.mo32595a((long) calendar.get(2));
            cVar.mo32599b("dayOfMonth");
            cVar.mo32595a((long) calendar.get(5));
            cVar.mo32599b("hourOfDay");
            cVar.mo32595a((long) calendar.get(11));
            cVar.mo32599b("minute");
            cVar.mo32595a((long) calendar.get(12));
            cVar.mo32599b("second");
            cVar.mo32595a((long) calendar.get(13));
            cVar.mo32602d();
        }

        public Calendar read(C11262a aVar) throws IOException {
            if (aVar.peek() == C11264b.NULL) {
                aVar.mo32585o();
                return null;
            }
            aVar.mo32574b();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (aVar.peek() != C11264b.END_OBJECT) {
                String n = aVar.mo32584n();
                int l = aVar.mo32582l();
                if ("year".equals(n)) {
                    i = l;
                } else if ("month".equals(n)) {
                    i2 = l;
                } else if ("dayOfMonth".equals(n)) {
                    i3 = l;
                } else if ("hourOfDay".equals(n)) {
                    i4 = l;
                } else if ("minute".equals(n)) {
                    i5 = l;
                } else if ("second".equals(n)) {
                    i6 = l;
                }
            }
            aVar.mo32577e();
            GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, i3, i4, i5, i6);
            return gregorianCalendar;
        }
    }

    /* renamed from: com.google.gson.internal.m.n$t */
    static class C11245t extends C11138i<Locale> {
        C11245t() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, Locale locale) throws IOException {
            cVar.mo32603d(locale == null ? null : locale.toString());
        }

        public Locale read(C11262a aVar) throws IOException {
            String str = null;
            if (aVar.peek() == C11264b.NULL) {
                aVar.mo32585o();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.mo32586p(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str == null) {
                return new Locale(nextToken, nextToken2);
            }
            return new Locale(nextToken, nextToken2, str);
        }
    }

    /* renamed from: com.google.gson.internal.m.n$u */
    static class C11246u extends C11138i<JsonElement> {
        C11246u() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, JsonElement jsonElement) throws IOException {
            if (jsonElement == null || jsonElement.isJsonNull()) {
                cVar.mo32606h();
            } else if (jsonElement.isJsonPrimitive()) {
                JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                if (asJsonPrimitive.isNumber()) {
                    cVar.mo32597a(asJsonPrimitive.getAsNumber());
                } else if (asJsonPrimitive.isBoolean()) {
                    cVar.mo32604d(asJsonPrimitive.getAsBoolean());
                } else {
                    cVar.mo32603d(asJsonPrimitive.getAsString());
                }
            } else if (jsonElement.isJsonArray()) {
                cVar.mo32593a();
                Iterator it = jsonElement.getAsJsonArray().iterator();
                while (it.hasNext()) {
                    write(cVar, (JsonElement) it.next());
                }
                cVar.mo32600c();
            } else if (jsonElement.isJsonObject()) {
                cVar.mo32598b();
                for (Entry entry : jsonElement.getAsJsonObject().entrySet()) {
                    cVar.mo32599b((String) entry.getKey());
                    write(cVar, (JsonElement) entry.getValue());
                }
                cVar.mo32602d();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't write ");
                sb.append(jsonElement.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public JsonElement read(C11262a aVar) throws IOException {
            switch (C11219c0.f29042a[aVar.peek().ordinal()]) {
                case 1:
                    return new JsonPrimitive((Number) new C11164g(aVar.mo32586p()));
                case 2:
                    return new JsonPrimitive(Boolean.valueOf(aVar.mo32580j()));
                case 3:
                    return new JsonPrimitive(aVar.mo32586p());
                case 4:
                    aVar.mo32585o();
                    return C11133f.f28848a;
                case 5:
                    JsonArray jsonArray = new JsonArray();
                    aVar.mo32573a();
                    while (aVar.mo32579g()) {
                        jsonArray.add(read(aVar));
                    }
                    aVar.mo32576d();
                    return jsonArray;
                case 6:
                    JsonObject jsonObject = new JsonObject();
                    aVar.mo32574b();
                    while (aVar.mo32579g()) {
                        jsonObject.add(aVar.mo32584n(), read(aVar));
                    }
                    aVar.mo32577e();
                    return jsonObject;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    /* renamed from: com.google.gson.internal.m.n$v */
    static class C11247v extends C11138i<BitSet> {
        C11247v() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, BitSet bitSet) throws IOException {
            cVar.mo32593a();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                cVar.mo32595a(bitSet.get(i) ? 1 : 0);
            }
            cVar.mo32600c();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
            if (r8.mo32582l() != 0) goto L_0x0069;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006e A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.BitSet read(com.google.gson.stream.C11262a r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.mo32573a()
                com.google.gson.stream.b r1 = r8.peek()
                r2 = 0
                r3 = 0
            L_0x000e:
                com.google.gson.stream.b r4 = com.google.gson.stream.C11264b.END_ARRAY
                if (r1 == r4) goto L_0x0075
                int[] r4 = com.google.gson.internal.p312m.C11212n.C11219c0.f29042a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L_0x0063
                r6 = 2
                if (r4 == r6) goto L_0x005e
                r6 = 3
                if (r4 != r6) goto L_0x0047
                java.lang.String r1 = r8.mo32586p()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0030 }
                if (r1 == 0) goto L_0x002e
                goto L_0x0069
            L_0x002e:
                r5 = 0
                goto L_0x0069
            L_0x0030:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L_0x0047:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L_0x005e:
                boolean r5 = r8.mo32580j()
                goto L_0x0069
            L_0x0063:
                int r1 = r8.mo32582l()
                if (r1 == 0) goto L_0x002e
            L_0x0069:
                if (r5 == 0) goto L_0x006e
                r0.set(r3)
            L_0x006e:
                int r3 = r3 + 1
                com.google.gson.stream.b r1 = r8.peek()
                goto L_0x000e
            L_0x0075:
                r8.mo32576d()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.p312m.C11212n.C11247v.read(com.google.gson.stream.a):java.util.BitSet");
        }
    }

    /* renamed from: com.google.gson.internal.m.n$w */
    static class C11248w implements TypeAdapterFactory {
        C11248w() {
        }

        public <T> C11138i<T> create(C11125d dVar, C11261a<T> aVar) {
            Class<Enum> rawType = aVar.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new C11235k0(rawType);
        }
    }

    /* renamed from: com.google.gson.internal.m.n$x */
    static class C11249x implements TypeAdapterFactory {

        /* renamed from: e */
        final /* synthetic */ C11261a f29046e;

        /* renamed from: f */
        final /* synthetic */ C11138i f29047f;

        C11249x(C11261a aVar, C11138i iVar) {
            this.f29046e = aVar;
            this.f29047f = iVar;
        }

        public <T> C11138i<T> create(C11125d dVar, C11261a<T> aVar) {
            if (aVar.equals(this.f29046e)) {
                return this.f29047f;
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.m.n$y */
    static class C11250y implements TypeAdapterFactory {

        /* renamed from: e */
        final /* synthetic */ Class f29048e;

        /* renamed from: f */
        final /* synthetic */ C11138i f29049f;

        C11250y(Class cls, C11138i iVar) {
            this.f29048e = cls;
            this.f29049f = iVar;
        }

        public <T> C11138i<T> create(C11125d dVar, C11261a<T> aVar) {
            if (aVar.getRawType() == this.f29048e) {
                return this.f29049f;
            }
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Factory[type=");
            sb.append(this.f29048e.getName());
            sb.append(",adapter=");
            sb.append(this.f29049f);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: com.google.gson.internal.m.n$z */
    static class C11251z implements TypeAdapterFactory {

        /* renamed from: e */
        final /* synthetic */ Class f29050e;

        /* renamed from: f */
        final /* synthetic */ Class f29051f;

        /* renamed from: g */
        final /* synthetic */ C11138i f29052g;

        C11251z(Class cls, Class cls2, C11138i iVar) {
            this.f29050e = cls;
            this.f29051f = cls2;
            this.f29052g = iVar;
        }

        public <T> C11138i<T> create(C11125d dVar, C11261a<T> aVar) {
            Class rawType = aVar.getRawType();
            if (rawType == this.f29050e || rawType == this.f29051f) {
                return this.f29052g;
            }
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Factory[type=");
            sb.append(this.f29051f.getName());
            sb.append("+");
            sb.append(this.f29050e.getName());
            sb.append(",adapter=");
            sb.append(this.f29052g);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static <TT> TypeAdapterFactory m28810a(C11261a<TT> aVar, C11138i<TT> iVar) {
        return new C11249x(aVar, iVar);
    }

    /* renamed from: b */
    public static <TT> TypeAdapterFactory m28814b(Class<TT> cls, Class<? extends TT> cls2, C11138i<? super TT> iVar) {
        return new C11214a0(cls, cls2, iVar);
    }

    /* renamed from: a */
    public static <TT> TypeAdapterFactory m28811a(Class<TT> cls, C11138i<TT> iVar) {
        return new C11250y(cls, iVar);
    }

    /* renamed from: b */
    public static <T1> TypeAdapterFactory m28813b(Class<T1> cls, C11138i<T1> iVar) {
        return new C11216b0(cls, iVar);
    }

    /* renamed from: a */
    public static <TT> TypeAdapterFactory m28812a(Class<TT> cls, Class<TT> cls2, C11138i<? super TT> iVar) {
        return new C11251z(cls, cls2, iVar);
    }
}
