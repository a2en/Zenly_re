package com.google.gson.internal.p312m;

import com.google.gson.C11125d;
import com.google.gson.C11138i;
import com.google.gson.internal.p312m.C11199i.C11201b;
import com.google.gson.p316k.C11261a;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11265c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.gson.internal.m.m */
final class C11211m<T> extends C11138i<T> {

    /* renamed from: a */
    private final C11125d f28980a;

    /* renamed from: b */
    private final C11138i<T> f28981b;

    /* renamed from: c */
    private final Type f28982c;

    C11211m(C11125d dVar, C11138i<T> iVar, Type type) {
        this.f28980a = dVar;
        this.f28981b = iVar;
        this.f28982c = type;
    }

    /* renamed from: a */
    private Type m28809a(Type type, Object obj) {
        if (obj != null) {
            return (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type;
        }
        return type;
    }

    public T read(C11262a aVar) throws IOException {
        return this.f28981b.read(aVar);
    }

    public void write(C11265c cVar, T t) throws IOException {
        C11138i<T> iVar = this.f28981b;
        Type a = m28809a(this.f28982c, t);
        if (a != this.f28982c) {
            iVar = this.f28980a.mo32448a(C11261a.get(a));
            if (iVar instanceof C11201b) {
                C11138i<T> iVar2 = this.f28981b;
                if (!(iVar2 instanceof C11201b)) {
                    iVar = iVar2;
                }
            }
        }
        iVar.write(cVar, t);
    }
}
