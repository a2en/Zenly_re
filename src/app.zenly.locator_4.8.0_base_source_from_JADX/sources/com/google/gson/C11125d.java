package com.google.gson;

import com.google.gson.internal.C11145c;
import com.google.gson.internal.C11160d;
import com.google.gson.internal.C11174j;
import com.google.gson.internal.C11175k;
import com.google.gson.internal.p312m.C11183a;
import com.google.gson.internal.p312m.C11185b;
import com.google.gson.internal.p312m.C11187c;
import com.google.gson.internal.p312m.C11189d;
import com.google.gson.internal.p312m.C11190e;
import com.google.gson.internal.p312m.C11192f;
import com.google.gson.internal.p312m.C11194g;
import com.google.gson.internal.p312m.C11196h;
import com.google.gson.internal.p312m.C11199i;
import com.google.gson.internal.p312m.C11203j;
import com.google.gson.internal.p312m.C11205k;
import com.google.gson.internal.p312m.C11212n;
import com.google.gson.p316k.C11261a;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11264b;
import com.google.gson.stream.C11265c;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: com.google.gson.d */
public final class C11125d {

    /* renamed from: k */
    private static final C11261a<?> f28818k = C11261a.get(Object.class);

    /* renamed from: a */
    private final ThreadLocal<Map<C11261a<?>, C11131f<?>>> f28819a;

    /* renamed from: b */
    private final Map<C11261a<?>, C11138i<?>> f28820b;

    /* renamed from: c */
    private final C11145c f28821c;

    /* renamed from: d */
    private final C11189d f28822d;

    /* renamed from: e */
    final List<TypeAdapterFactory> f28823e;

    /* renamed from: f */
    final boolean f28824f;

    /* renamed from: g */
    final boolean f28825g;

    /* renamed from: h */
    final boolean f28826h;

    /* renamed from: i */
    final boolean f28827i;

    /* renamed from: j */
    final boolean f28828j;

    /* renamed from: com.google.gson.d$a */
    class C11126a extends C11138i<Number> {
        C11126a(C11125d dVar) {
        }

        /* renamed from: a */
        public void write(C11265c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.mo32606h();
                return;
            }
            C11125d.m28635a(number.doubleValue());
            cVar.mo32597a(number);
        }

        public Double read(C11262a aVar) throws IOException {
            if (aVar.peek() != C11264b.NULL) {
                return Double.valueOf(aVar.mo32581k());
            }
            aVar.mo32585o();
            return null;
        }
    }

    /* renamed from: com.google.gson.d$b */
    class C11127b extends C11138i<Number> {
        C11127b(C11125d dVar) {
        }

        /* renamed from: a */
        public void write(C11265c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.mo32606h();
                return;
            }
            C11125d.m28635a((double) number.floatValue());
            cVar.mo32597a(number);
        }

        public Float read(C11262a aVar) throws IOException {
            if (aVar.peek() != C11264b.NULL) {
                return Float.valueOf((float) aVar.mo32581k());
            }
            aVar.mo32585o();
            return null;
        }
    }

    /* renamed from: com.google.gson.d$c */
    static class C11128c extends C11138i<Number> {
        C11128c() {
        }

        /* renamed from: a */
        public void write(C11265c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.mo32606h();
            } else {
                cVar.mo32603d(number.toString());
            }
        }

        public Number read(C11262a aVar) throws IOException {
            if (aVar.peek() != C11264b.NULL) {
                return Long.valueOf(aVar.mo32583m());
            }
            aVar.mo32585o();
            return null;
        }
    }

    /* renamed from: com.google.gson.d$d */
    static class C11129d extends C11138i<AtomicLong> {

        /* renamed from: a */
        final /* synthetic */ C11138i f28829a;

        C11129d(C11138i iVar) {
            this.f28829a = iVar;
        }

        /* renamed from: a */
        public void write(C11265c cVar, AtomicLong atomicLong) throws IOException {
            this.f28829a.write(cVar, Long.valueOf(atomicLong.get()));
        }

        public AtomicLong read(C11262a aVar) throws IOException {
            return new AtomicLong(((Number) this.f28829a.read(aVar)).longValue());
        }
    }

    /* renamed from: com.google.gson.d$e */
    static class C11130e extends C11138i<AtomicLongArray> {

        /* renamed from: a */
        final /* synthetic */ C11138i f28830a;

        C11130e(C11138i iVar) {
            this.f28830a = iVar;
        }

        /* renamed from: a */
        public void write(C11265c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.mo32593a();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f28830a.write(cVar, Long.valueOf(atomicLongArray.get(i)));
            }
            cVar.mo32600c();
        }

        public AtomicLongArray read(C11262a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.mo32573a();
            while (aVar.mo32579g()) {
                arrayList.add(Long.valueOf(((Number) this.f28830a.read(aVar)).longValue()));
            }
            aVar.mo32576d();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }
    }

    /* renamed from: com.google.gson.d$f */
    static class C11131f<T> extends C11138i<T> {

        /* renamed from: a */
        private C11138i<T> f28831a;

        C11131f() {
        }

        /* renamed from: a */
        public void mo32475a(C11138i<T> iVar) {
            if (this.f28831a == null) {
                this.f28831a = iVar;
                return;
            }
            throw new AssertionError();
        }

        public T read(C11262a aVar) throws IOException {
            C11138i<T> iVar = this.f28831a;
            if (iVar != null) {
                return iVar.read(aVar);
            }
            throw new IllegalStateException();
        }

        public void write(C11265c cVar, T t) throws IOException {
            C11138i<T> iVar = this.f28831a;
            if (iVar != null) {
                iVar.write(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C11125d() {
        this(C11160d.f28871k, C11118c.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, C11135h.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: a */
    private C11138i<Number> m28634a(boolean z) {
        if (z) {
            return C11212n.f29030v;
        }
        return new C11126a(this);
    }

    /* renamed from: b */
    private C11138i<Number> m28638b(boolean z) {
        if (z) {
            return C11212n.f29029u;
        }
        return new C11127b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{serializeNulls:");
        sb.append(this.f28824f);
        sb.append(",factories:");
        sb.append(this.f28823e);
        sb.append(",instanceCreators:");
        sb.append(this.f28821c);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    static void m28635a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(d);
            sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    private static C11138i<AtomicLongArray> m28637b(C11138i<Number> iVar) {
        return new C11130e(iVar).nullSafe();
    }

    /* renamed from: a */
    private static C11138i<Number> m28632a(C11135h hVar) {
        if (hVar == C11135h.DEFAULT) {
            return C11212n.f29028t;
        }
        return new C11128c();
    }

    /* renamed from: b */
    public JsonElement mo32467b(Object obj) {
        if (obj == null) {
            return C11133f.f28848a;
        }
        return mo32468b(obj, obj.getClass());
    }

    C11125d(C11160d dVar, FieldNamingStrategy fieldNamingStrategy, Map<Type, InstanceCreator<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, C11135h hVar, String str, int i, int i2, List<TypeAdapterFactory> list, List<TypeAdapterFactory> list2, List<TypeAdapterFactory> list3) {
        C11160d dVar2 = dVar;
        boolean z8 = z7;
        this.f28819a = new ThreadLocal<>();
        this.f28820b = new ConcurrentHashMap();
        Map<Type, InstanceCreator<?>> map2 = map;
        this.f28821c = new C11145c(map);
        this.f28824f = z;
        this.f28825g = z3;
        this.f28826h = z4;
        this.f28827i = z5;
        this.f28828j = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C11212n.f29007Y);
        arrayList.add(C11196h.f28944b);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(C11212n.f28986D);
        arrayList.add(C11212n.f29021m);
        arrayList.add(C11212n.f29015g);
        arrayList.add(C11212n.f29017i);
        arrayList.add(C11212n.f29019k);
        C11138i a = m28632a(hVar);
        arrayList.add(C11212n.m28812a(Long.TYPE, Long.class, a));
        arrayList.add(C11212n.m28812a(Double.TYPE, Double.class, m28634a(z8)));
        arrayList.add(C11212n.m28812a(Float.TYPE, Float.class, m28638b(z8)));
        arrayList.add(C11212n.f29032x);
        arrayList.add(C11212n.f29023o);
        arrayList.add(C11212n.f29025q);
        arrayList.add(C11212n.m28811a(AtomicLong.class, m28633a(a)));
        arrayList.add(C11212n.m28811a(AtomicLongArray.class, m28637b(a)));
        arrayList.add(C11212n.f29027s);
        arrayList.add(C11212n.f29034z);
        arrayList.add(C11212n.f28988F);
        arrayList.add(C11212n.f28990H);
        arrayList.add(C11212n.m28811a(BigDecimal.class, C11212n.f28984B));
        arrayList.add(C11212n.m28811a(BigInteger.class, C11212n.f28985C));
        arrayList.add(C11212n.f28992J);
        arrayList.add(C11212n.f28994L);
        arrayList.add(C11212n.f28998P);
        arrayList.add(C11212n.f29000R);
        arrayList.add(C11212n.f29005W);
        arrayList.add(C11212n.f28996N);
        arrayList.add(C11212n.f29012d);
        arrayList.add(C11187c.f28924b);
        arrayList.add(C11212n.f29003U);
        arrayList.add(C11205k.f28965b);
        arrayList.add(C11203j.f28963b);
        arrayList.add(C11212n.f29001S);
        arrayList.add(C11183a.f28918c);
        arrayList.add(C11212n.f29010b);
        arrayList.add(new C11185b(this.f28821c));
        boolean z9 = z2;
        arrayList.add(new C11194g(this.f28821c, z2));
        this.f28822d = new C11189d(this.f28821c);
        arrayList.add(this.f28822d);
        arrayList.add(C11212n.f29008Z);
        FieldNamingStrategy fieldNamingStrategy2 = fieldNamingStrategy;
        arrayList.add(new C11199i(this.f28821c, fieldNamingStrategy, dVar, this.f28822d));
        this.f28823e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    public JsonElement mo32468b(Object obj, Type type) {
        C11192f fVar = new C11192f();
        mo32465a(obj, type, (C11265c) fVar);
        return fVar.mo32607i();
    }

    /* renamed from: a */
    private static C11138i<AtomicLong> m28633a(C11138i<Number> iVar) {
        return new C11129d(iVar).nullSafe();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.gson.k.a<T>, code=com.google.gson.k.a, for r6v0, types: [com.google.gson.k.a<T>, java.lang.Object, com.google.gson.k.a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> com.google.gson.C11138i<T> mo32448a(com.google.gson.p316k.C11261a r6) {
        /*
            r5 = this;
            java.util.Map<com.google.gson.k.a<?>, com.google.gson.i<?>> r0 = r5.f28820b
            if (r6 != 0) goto L_0x0007
            com.google.gson.k.a<?> r1 = f28818k
            goto L_0x0008
        L_0x0007:
            r1 = r6
        L_0x0008:
            java.lang.Object r0 = r0.get(r1)
            com.google.gson.i r0 = (com.google.gson.C11138i) r0
            if (r0 == 0) goto L_0x0011
            return r0
        L_0x0011:
            java.lang.ThreadLocal<java.util.Map<com.google.gson.k.a<?>, com.google.gson.d$f<?>>> r0 = r5.f28819a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            r1 = 0
            if (r0 != 0) goto L_0x0027
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal<java.util.Map<com.google.gson.k.a<?>, com.google.gson.d$f<?>>> r1 = r5.f28819a
            r1.set(r0)
            r1 = 1
        L_0x0027:
            java.lang.Object r2 = r0.get(r6)
            com.google.gson.d$f r2 = (com.google.gson.C11125d.C11131f) r2
            if (r2 == 0) goto L_0x0030
            return r2
        L_0x0030:
            com.google.gson.d$f r2 = new com.google.gson.d$f     // Catch:{ all -> 0x007a }
            r2.<init>()     // Catch:{ all -> 0x007a }
            r0.put(r6, r2)     // Catch:{ all -> 0x007a }
            java.util.List<com.google.gson.TypeAdapterFactory> r3 = r5.f28823e     // Catch:{ all -> 0x007a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x007a }
        L_0x003e:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x007a }
            if (r4 == 0) goto L_0x0063
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x007a }
            com.google.gson.TypeAdapterFactory r4 = (com.google.gson.TypeAdapterFactory) r4     // Catch:{ all -> 0x007a }
            com.google.gson.i r4 = r4.create(r5, r6)     // Catch:{ all -> 0x007a }
            if (r4 == 0) goto L_0x003e
            r2.mo32475a(r4)     // Catch:{ all -> 0x007a }
            java.util.Map<com.google.gson.k.a<?>, com.google.gson.i<?>> r2 = r5.f28820b     // Catch:{ all -> 0x007a }
            r2.put(r6, r4)     // Catch:{ all -> 0x007a }
            r0.remove(r6)
            if (r1 == 0) goto L_0x0062
            java.lang.ThreadLocal<java.util.Map<com.google.gson.k.a<?>, com.google.gson.d$f<?>>> r6 = r5.f28819a
            r6.remove()
        L_0x0062:
            return r4
        L_0x0063:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
            r3.<init>()     // Catch:{ all -> 0x007a }
            java.lang.String r4 = "GSON (2.8.5) cannot handle "
            r3.append(r4)     // Catch:{ all -> 0x007a }
            r3.append(r6)     // Catch:{ all -> 0x007a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x007a }
            r2.<init>(r3)     // Catch:{ all -> 0x007a }
            throw r2     // Catch:{ all -> 0x007a }
        L_0x007a:
            r2 = move-exception
            r0.remove(r6)
            if (r1 == 0) goto L_0x0085
            java.lang.ThreadLocal<java.util.Map<com.google.gson.k.a<?>, com.google.gson.d$f<?>>> r6 = r5.f28819a
            r6.remove()
        L_0x0085:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.C11125d.mo32448a(com.google.gson.k.a):com.google.gson.i");
    }

    /* renamed from: a */
    public <T> C11138i<T> mo32447a(TypeAdapterFactory typeAdapterFactory, C11261a<T> aVar) {
        if (!this.f28823e.contains(typeAdapterFactory)) {
            typeAdapterFactory = this.f28822d;
        }
        boolean z = false;
        for (TypeAdapterFactory typeAdapterFactory2 : this.f28823e) {
            if (z) {
                C11138i<T> create = typeAdapterFactory2.create(this, aVar);
                if (create != null) {
                    return create;
                }
            } else if (typeAdapterFactory2 == typeAdapterFactory) {
                z = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GSON cannot serialize ");
        sb.append(aVar);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public <T> C11138i<T> mo32449a(Class<T> cls) {
        return mo32448a(C11261a.get(cls));
    }

    /* renamed from: a */
    public String mo32460a(Object obj) {
        if (obj == null) {
            return mo32459a((JsonElement) C11133f.f28848a);
        }
        return mo32461a(obj, (Type) obj.getClass());
    }

    /* renamed from: a */
    public String mo32461a(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        mo32466a(obj, type, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void mo32464a(Object obj, Appendable appendable) throws JsonIOException {
        if (obj != null) {
            mo32466a(obj, (Type) obj.getClass(), appendable);
        } else {
            mo32463a((JsonElement) C11133f.f28848a, appendable);
        }
    }

    /* renamed from: a */
    public void mo32466a(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            mo32465a(obj, type, mo32451a(C11175k.m28744a(appendable)));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo32465a(Object obj, Type type, C11265c cVar) throws JsonIOException {
        C11138i a = mo32448a(C11261a.get(type));
        boolean g = cVar.mo32681g();
        cVar.mo32676b(true);
        boolean f = cVar.mo32680f();
        cVar.mo32675a(this.f28826h);
        boolean e = cVar.mo32679e();
        cVar.mo32678c(this.f28824f);
        try {
            a.write(cVar, obj);
            cVar.mo32676b(g);
            cVar.mo32675a(f);
            cVar.mo32678c(e);
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        } catch (AssertionError e3) {
            StringBuilder sb = new StringBuilder();
            sb.append("AssertionError (GSON 2.8.5): ");
            sb.append(e3.getMessage());
            throw new AssertionError(sb.toString(), e3);
        } catch (Throwable th) {
            cVar.mo32676b(g);
            cVar.mo32675a(f);
            cVar.mo32678c(e);
            throw th;
        }
    }

    /* renamed from: a */
    public String mo32459a(JsonElement jsonElement) {
        StringWriter stringWriter = new StringWriter();
        mo32463a(jsonElement, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void mo32463a(JsonElement jsonElement, Appendable appendable) throws JsonIOException {
        try {
            mo32462a(jsonElement, mo32451a(C11175k.m28744a(appendable)));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    /* renamed from: a */
    public C11265c mo32451a(Writer writer) throws IOException {
        if (this.f28825g) {
            writer.write(")]}'\n");
        }
        C11265c cVar = new C11265c(writer);
        if (this.f28827i) {
            cVar.mo32677c("  ");
        }
        cVar.mo32678c(this.f28824f);
        return cVar;
    }

    /* renamed from: a */
    public C11262a mo32450a(Reader reader) {
        C11262a aVar = new C11262a(reader);
        aVar.mo32670a(this.f28828j);
        return aVar;
    }

    /* renamed from: a */
    public void mo32462a(JsonElement jsonElement, C11265c cVar) throws JsonIOException {
        boolean g = cVar.mo32681g();
        cVar.mo32676b(true);
        boolean f = cVar.mo32680f();
        cVar.mo32675a(this.f28826h);
        boolean e = cVar.mo32679e();
        cVar.mo32678c(this.f28824f);
        try {
            C11175k.m28745a(jsonElement, cVar);
            cVar.mo32676b(g);
            cVar.mo32675a(f);
            cVar.mo32678c(e);
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        } catch (AssertionError e3) {
            StringBuilder sb = new StringBuilder();
            sb.append("AssertionError (GSON 2.8.5): ");
            sb.append(e3.getMessage());
            throw new AssertionError(sb.toString(), e3);
        } catch (Throwable th) {
            cVar.mo32676b(g);
            cVar.mo32675a(f);
            cVar.mo32678c(e);
            throw th;
        }
    }

    /* renamed from: a */
    public <T> T mo32457a(String str, Class<T> cls) throws JsonSyntaxException {
        return C11174j.m28740a(cls).cast(mo32458a(str, (Type) cls));
    }

    /* renamed from: a */
    public <T> T mo32458a(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return mo32456a((Reader) new StringReader(str), type);
    }

    /* renamed from: a */
    public <T> T mo32455a(Reader reader, Class<T> cls) throws JsonSyntaxException, JsonIOException {
        C11262a a = mo32450a(reader);
        Object a2 = mo32454a(a, (Type) cls);
        m28636a(a2, a);
        return C11174j.m28740a(cls).cast(a2);
    }

    /* renamed from: a */
    public <T> T mo32456a(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        C11262a a = mo32450a(reader);
        T a2 = mo32454a(a, type);
        m28636a((Object) a2, a);
        return a2;
    }

    /* renamed from: a */
    private static void m28636a(Object obj, C11262a aVar) {
        if (obj != null) {
            try {
                if (aVar.peek() != C11264b.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IOException e2) {
                throw new JsonIOException((Throwable) e2);
            }
        }
    }

    /* renamed from: a */
    public <T> T mo32454a(C11262a aVar, Type type) throws JsonIOException, JsonSyntaxException {
        boolean h = aVar.mo32672h();
        aVar.mo32670a(true);
        try {
            aVar.peek();
            T read = mo32448a(C11261a.get(type)).read(aVar);
            aVar.mo32670a(h);
            return read;
        } catch (EOFException e) {
            if (1 != 0) {
                aVar.mo32670a(h);
                return null;
            }
            throw new JsonSyntaxException((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException((Throwable) e2);
        } catch (IOException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        } catch (AssertionError e4) {
            StringBuilder sb = new StringBuilder();
            sb.append("AssertionError (GSON 2.8.5): ");
            sb.append(e4.getMessage());
            throw new AssertionError(sb.toString(), e4);
        } catch (Throwable th) {
            aVar.mo32670a(h);
            throw th;
        }
    }

    /* renamed from: a */
    public <T> T mo32452a(JsonElement jsonElement, Class<T> cls) throws JsonSyntaxException {
        return C11174j.m28740a(cls).cast(mo32453a(jsonElement, (Type) cls));
    }

    /* renamed from: a */
    public <T> T mo32453a(JsonElement jsonElement, Type type) throws JsonSyntaxException {
        if (jsonElement == null) {
            return null;
        }
        return mo32454a((C11262a) new C11190e(jsonElement), type);
    }
}
