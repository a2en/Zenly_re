package com.google.gson.internal.p312m;

import com.google.gson.C11125d;
import com.google.gson.C11138i;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C11145c;
import com.google.gson.p315j.C11257b;
import com.google.gson.p316k.C11261a;

/* renamed from: com.google.gson.internal.m.d */
public final class C11189d implements TypeAdapterFactory {

    /* renamed from: e */
    private final C11145c f28926e;

    public C11189d(C11145c cVar) {
        this.f28926e = cVar;
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [com.google.gson.i, com.google.gson.i<?>] */
    /* JADX WARNING: type inference failed for: r9v13, types: [com.google.gson.i] */
    /* JADX WARNING: type inference failed for: r9v14, types: [com.google.gson.i] */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.gson.C11138i<?> mo32572a(com.google.gson.internal.C11145c r9, com.google.gson.C11125d r10, com.google.gson.p316k.C11261a<?> r11, com.google.gson.p315j.C11257b r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            com.google.gson.k.a r0 = com.google.gson.p316k.C11261a.get(r0)
            com.google.gson.internal.ObjectConstructor r9 = r9.mo32510a(r0)
            java.lang.Object r9 = r9.construct()
            boolean r0 = r9 instanceof com.google.gson.C11138i
            if (r0 == 0) goto L_0x0017
            com.google.gson.i r9 = (com.google.gson.C11138i) r9
            goto L_0x0075
        L_0x0017:
            boolean r0 = r9 instanceof com.google.gson.TypeAdapterFactory
            if (r0 == 0) goto L_0x0022
            com.google.gson.TypeAdapterFactory r9 = (com.google.gson.TypeAdapterFactory) r9
            com.google.gson.i r9 = r9.create(r10, r11)
            goto L_0x0075
        L_0x0022:
            boolean r0 = r9 instanceof com.google.gson.JsonSerializer
            if (r0 != 0) goto L_0x005b
            boolean r1 = r9 instanceof com.google.gson.JsonDeserializer
            if (r1 == 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r12.append(r0)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x005b:
            r1 = 0
            if (r0 == 0) goto L_0x0063
            r0 = r9
            com.google.gson.JsonSerializer r0 = (com.google.gson.JsonSerializer) r0
            r3 = r0
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            boolean r0 = r9 instanceof com.google.gson.JsonDeserializer
            if (r0 == 0) goto L_0x006b
            r1 = r9
            com.google.gson.JsonDeserializer r1 = (com.google.gson.JsonDeserializer) r1
        L_0x006b:
            r4 = r1
            com.google.gson.internal.m.l r9 = new com.google.gson.internal.m.l
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0075:
            if (r9 == 0) goto L_0x0081
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0081
            com.google.gson.i r9 = r9.nullSafe()
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.p312m.C11189d.mo32572a(com.google.gson.internal.c, com.google.gson.d, com.google.gson.k.a, com.google.gson.j.b):com.google.gson.i");
    }

    public <T> C11138i<T> create(C11125d dVar, C11261a<T> aVar) {
        C11257b bVar = (C11257b) aVar.getRawType().getAnnotation(C11257b.class);
        if (bVar == null) {
            return null;
        }
        return mo32572a(this.f28926e, dVar, aVar, bVar);
    }
}
