package com.google.gson.internal.p312m;

import com.google.gson.C11125d;
import com.google.gson.C11138i;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C11141b;
import com.google.gson.internal.C11145c;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.p316k.C11261a;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11264b;
import com.google.gson.stream.C11265c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: com.google.gson.internal.m.b */
public final class C11185b implements TypeAdapterFactory {

    /* renamed from: e */
    private final C11145c f28921e;

    /* renamed from: com.google.gson.internal.m.b$a */
    private static final class C11186a<E> extends C11138i<Collection<E>> {

        /* renamed from: a */
        private final C11138i<E> f28922a;

        /* renamed from: b */
        private final ObjectConstructor<? extends Collection<E>> f28923b;

        public C11186a(C11125d dVar, Type type, C11138i<E> iVar, ObjectConstructor<? extends Collection<E>> objectConstructor) {
            this.f28922a = new C11211m(dVar, iVar, type);
            this.f28923b = objectConstructor;
        }

        /* renamed from: a */
        public void write(C11265c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.mo32606h();
                return;
            }
            cVar.mo32593a();
            for (E write : collection) {
                this.f28922a.write(cVar, write);
            }
            cVar.mo32600c();
        }

        public Collection<E> read(C11262a aVar) throws IOException {
            if (aVar.peek() == C11264b.NULL) {
                aVar.mo32585o();
                return null;
            }
            Collection<E> collection = (Collection) this.f28923b.construct();
            aVar.mo32573a();
            while (aVar.mo32579g()) {
                collection.add(this.f28922a.read(aVar));
            }
            aVar.mo32576d();
            return collection;
        }
    }

    public C11185b(C11145c cVar) {
        this.f28921e = cVar;
    }

    public <T> C11138i<T> create(C11125d dVar, C11261a<T> aVar) {
        Type type = aVar.getType();
        Class rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type a = C11141b.m28684a(type, rawType);
        return new C11186a(dVar, a, dVar.mo32448a(C11261a.get(a)), this.f28921e.mo32510a(aVar));
    }
}
