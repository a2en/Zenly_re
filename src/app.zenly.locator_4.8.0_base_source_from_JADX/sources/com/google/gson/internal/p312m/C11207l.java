package com.google.gson.internal.p312m;

import com.google.gson.C11125d;
import com.google.gson.C11138i;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C11140a;
import com.google.gson.internal.C11175k;
import com.google.gson.p316k.C11261a;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11265c;
import java.io.IOException;
import java.lang.reflect.Type;

/* renamed from: com.google.gson.internal.m.l */
public final class C11207l<T> extends C11138i<T> {

    /* renamed from: a */
    private final JsonSerializer<T> f28967a;

    /* renamed from: b */
    private final JsonDeserializer<T> f28968b;

    /* renamed from: c */
    final C11125d f28969c;

    /* renamed from: d */
    private final C11261a<T> f28970d;

    /* renamed from: e */
    private final TypeAdapterFactory f28971e;

    /* renamed from: f */
    private final C11209b f28972f = new C11209b<>();

    /* renamed from: g */
    private C11138i<T> f28973g;

    /* renamed from: com.google.gson.internal.m.l$b */
    private final class C11209b implements JsonSerializationContext, JsonDeserializationContext {
        private C11209b() {
        }

        public <R> R deserialize(JsonElement jsonElement, Type type) throws JsonParseException {
            return C11207l.this.f28969c.mo32453a(jsonElement, type);
        }

        public JsonElement serialize(Object obj) {
            return C11207l.this.f28969c.mo32467b(obj);
        }

        public JsonElement serialize(Object obj, Type type) {
            return C11207l.this.f28969c.mo32468b(obj, type);
        }
    }

    /* renamed from: com.google.gson.internal.m.l$c */
    private static final class C11210c implements TypeAdapterFactory {

        /* renamed from: e */
        private final C11261a<?> f28975e;

        /* renamed from: f */
        private final boolean f28976f;

        /* renamed from: g */
        private final Class<?> f28977g;

        /* renamed from: h */
        private final JsonSerializer<?> f28978h;

        /* renamed from: i */
        private final JsonDeserializer<?> f28979i;

        C11210c(Object obj, C11261a<?> aVar, boolean z, Class<?> cls) {
            JsonDeserializer<?> jsonDeserializer = null;
            this.f28978h = obj instanceof JsonSerializer ? (JsonSerializer) obj : null;
            if (obj instanceof JsonDeserializer) {
                jsonDeserializer = (JsonDeserializer) obj;
            }
            this.f28979i = jsonDeserializer;
            C11140a.m28678a((this.f28978h == null && this.f28979i == null) ? false : true);
            this.f28975e = aVar;
            this.f28976f = z;
            this.f28977g = cls;
        }

        public <T> C11138i<T> create(C11125d dVar, C11261a<T> aVar) {
            C11261a<?> aVar2 = this.f28975e;
            boolean z = aVar2 != null ? aVar2.equals(aVar) || (this.f28976f && this.f28975e.getType() == aVar.getRawType()) : this.f28977g.isAssignableFrom(aVar.getRawType());
            if (!z) {
                return null;
            }
            C11207l lVar = new C11207l(this.f28978h, this.f28979i, dVar, aVar, this);
            return lVar;
        }
    }

    public C11207l(JsonSerializer<T> jsonSerializer, JsonDeserializer<T> jsonDeserializer, C11125d dVar, C11261a<T> aVar, TypeAdapterFactory typeAdapterFactory) {
        this.f28967a = jsonSerializer;
        this.f28968b = jsonDeserializer;
        this.f28969c = dVar;
        this.f28970d = aVar;
        this.f28971e = typeAdapterFactory;
    }

    /* renamed from: a */
    private C11138i<T> m28808a() {
        C11138i<T> iVar = this.f28973g;
        if (iVar != null) {
            return iVar;
        }
        C11138i<T> a = this.f28969c.mo32447a(this.f28971e, this.f28970d);
        this.f28973g = a;
        return a;
    }

    public T read(C11262a aVar) throws IOException {
        if (this.f28968b == null) {
            return m28808a().read(aVar);
        }
        JsonElement a = C11175k.m28743a(aVar);
        if (a.isJsonNull()) {
            return null;
        }
        return this.f28968b.deserialize(a, this.f28970d.getType(), this.f28972f);
    }

    public void write(C11265c cVar, T t) throws IOException {
        JsonSerializer<T> jsonSerializer = this.f28967a;
        if (jsonSerializer == null) {
            m28808a().write(cVar, t);
        } else if (t == null) {
            cVar.mo32606h();
        } else {
            C11175k.m28745a(jsonSerializer.serialize(t, this.f28970d.getType(), this.f28972f), cVar);
        }
    }

    /* renamed from: a */
    public static TypeAdapterFactory m28807a(C11261a<?> aVar, Object obj) {
        return new C11210c(obj, aVar, aVar.getType() == aVar.getRawType(), null);
    }
}
