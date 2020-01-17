package com.google.gson.internal.p312m;

import com.google.gson.C11125d;
import com.google.gson.C11138i;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C11141b;
import com.google.gson.internal.C11145c;
import com.google.gson.internal.C11163f;
import com.google.gson.internal.C11175k;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.p316k.C11261a;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11264b;
import com.google.gson.stream.C11265c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.gson.internal.m.g */
public final class C11194g implements TypeAdapterFactory {

    /* renamed from: e */
    private final C11145c f28938e;

    /* renamed from: f */
    final boolean f28939f;

    /* renamed from: com.google.gson.internal.m.g$a */
    private final class C11195a<K, V> extends C11138i<Map<K, V>> {

        /* renamed from: a */
        private final C11138i<K> f28940a;

        /* renamed from: b */
        private final C11138i<V> f28941b;

        /* renamed from: c */
        private final ObjectConstructor<? extends Map<K, V>> f28942c;

        public C11195a(C11125d dVar, Type type, C11138i<K> iVar, Type type2, C11138i<V> iVar2, ObjectConstructor<? extends Map<K, V>> objectConstructor) {
            this.f28940a = new C11211m(dVar, iVar, type);
            this.f28941b = new C11211m(dVar, iVar2, type2);
            this.f28942c = objectConstructor;
        }

        /* renamed from: a */
        public void write(C11265c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.mo32606h();
            } else if (!C11194g.this.f28939f) {
                cVar.mo32598b();
                for (Entry entry : map.entrySet()) {
                    cVar.mo32599b(String.valueOf(entry.getKey()));
                    this.f28941b.write(cVar, entry.getValue());
                }
                cVar.mo32602d();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Entry entry2 : map.entrySet()) {
                    JsonElement jsonTree = this.f28940a.toJsonTree(entry2.getKey());
                    arrayList.add(jsonTree);
                    arrayList2.add(entry2.getValue());
                    z |= jsonTree.isJsonArray() || jsonTree.isJsonObject();
                }
                if (z) {
                    cVar.mo32593a();
                    int size = arrayList.size();
                    while (i < size) {
                        cVar.mo32593a();
                        C11175k.m28745a((JsonElement) arrayList.get(i), cVar);
                        this.f28941b.write(cVar, arrayList2.get(i));
                        cVar.mo32600c();
                        i++;
                    }
                    cVar.mo32600c();
                } else {
                    cVar.mo32598b();
                    int size2 = arrayList.size();
                    while (i < size2) {
                        cVar.mo32599b(m28792a((JsonElement) arrayList.get(i)));
                        this.f28941b.write(cVar, arrayList2.get(i));
                        i++;
                    }
                    cVar.mo32602d();
                }
            }
        }

        public Map<K, V> read(C11262a aVar) throws IOException {
            C11264b peek = aVar.peek();
            if (peek == C11264b.NULL) {
                aVar.mo32585o();
                return null;
            }
            Map<K, V> map = (Map) this.f28942c.construct();
            String str = "duplicate key: ";
            if (peek == C11264b.BEGIN_ARRAY) {
                aVar.mo32573a();
                while (aVar.mo32579g()) {
                    aVar.mo32573a();
                    Object read = this.f28940a.read(aVar);
                    if (map.put(read, this.f28941b.read(aVar)) == null) {
                        aVar.mo32576d();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(read);
                        throw new JsonSyntaxException(sb.toString());
                    }
                }
                aVar.mo32576d();
            } else {
                aVar.mo32574b();
                while (aVar.mo32579g()) {
                    C11163f.f28885a.mo32516a(aVar);
                    Object read2 = this.f28940a.read(aVar);
                    if (map.put(read2, this.f28941b.read(aVar)) != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(read2);
                        throw new JsonSyntaxException(sb2.toString());
                    }
                }
                aVar.mo32577e();
            }
            return map;
        }

        /* renamed from: a */
        private String m28792a(JsonElement jsonElement) {
            if (jsonElement.isJsonPrimitive()) {
                JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                if (asJsonPrimitive.isNumber()) {
                    return String.valueOf(asJsonPrimitive.getAsNumber());
                }
                if (asJsonPrimitive.isBoolean()) {
                    return Boolean.toString(asJsonPrimitive.getAsBoolean());
                }
                if (asJsonPrimitive.isString()) {
                    return asJsonPrimitive.getAsString();
                }
                throw new AssertionError();
            } else if (jsonElement.isJsonNull()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }
    }

    public C11194g(C11145c cVar, boolean z) {
        this.f28938e = cVar;
        this.f28939f = z;
    }

    /* renamed from: a */
    private C11138i<?> m28791a(C11125d dVar, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return C11212n.f29014f;
        }
        return dVar.mo32448a(C11261a.get(type));
    }

    public <T> C11138i<T> create(C11125d dVar, C11261a<T> aVar) {
        Type type = aVar.getType();
        if (!Map.class.isAssignableFrom(aVar.getRawType())) {
            return null;
        }
        Type[] b = C11141b.m28693b(type, C11141b.m28696e(type));
        C11125d dVar2 = dVar;
        C11195a aVar2 = new C11195a(dVar2, b[0], m28791a(dVar, b[0]), b[1], dVar.mo32448a(C11261a.get(b[1])), this.f28938e.mo32510a(aVar));
        return aVar2;
    }
}
