package com.google.gson.internal.p312m;

import com.google.gson.C11125d;
import com.google.gson.C11138i;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C11141b;
import com.google.gson.p316k.C11261a;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11264b;
import com.google.gson.stream.C11265c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: com.google.gson.internal.m.a */
public final class C11183a<E> extends C11138i<Object> {

    /* renamed from: c */
    public static final TypeAdapterFactory f28918c = new C11184a();

    /* renamed from: a */
    private final Class<E> f28919a;

    /* renamed from: b */
    private final C11138i<E> f28920b;

    /* renamed from: com.google.gson.internal.m.a$a */
    static class C11184a implements TypeAdapterFactory {
        C11184a() {
        }

        public <T> C11138i<T> create(C11125d dVar, C11261a<T> aVar) {
            Type type = aVar.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type d = C11141b.m28695d(type);
            return new C11183a(dVar, dVar.mo32448a(C11261a.get(d)), C11141b.m28696e(d));
        }
    }

    public C11183a(C11125d dVar, C11138i<E> iVar, Class<E> cls) {
        this.f28920b = new C11211m(dVar, iVar, cls);
        this.f28919a = cls;
    }

    public Object read(C11262a aVar) throws IOException {
        if (aVar.peek() == C11264b.NULL) {
            aVar.mo32585o();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.mo32573a();
        while (aVar.mo32579g()) {
            arrayList.add(this.f28920b.read(aVar));
        }
        aVar.mo32576d();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f28919a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    public void write(C11265c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.mo32606h();
            return;
        }
        cVar.mo32593a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f28920b.write(cVar, Array.get(obj, i));
        }
        cVar.mo32600c();
    }
}
