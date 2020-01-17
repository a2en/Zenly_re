package com.google.gson.internal.p312m;

import com.google.gson.C11125d;
import com.google.gson.C11138i;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C11141b;
import com.google.gson.internal.C11145c;
import com.google.gson.internal.C11160d;
import com.google.gson.internal.C11174j;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.p314n.C11254b;
import com.google.gson.p315j.C11257b;
import com.google.gson.p315j.C11258c;
import com.google.gson.p316k.C11261a;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11264b;
import com.google.gson.stream.C11265c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.gson.internal.m.i */
public final class C11199i implements TypeAdapterFactory {

    /* renamed from: e */
    private final C11145c f28947e;

    /* renamed from: f */
    private final FieldNamingStrategy f28948f;

    /* renamed from: g */
    private final C11160d f28949g;

    /* renamed from: h */
    private final C11189d f28950h;

    /* renamed from: i */
    private final C11254b f28951i = C11254b.m28850a();

    /* renamed from: com.google.gson.internal.m.i$a */
    class C11200a extends C11202c {

        /* renamed from: d */
        final /* synthetic */ Field f28952d;

        /* renamed from: e */
        final /* synthetic */ boolean f28953e;

        /* renamed from: f */
        final /* synthetic */ C11138i f28954f;

        /* renamed from: g */
        final /* synthetic */ C11125d f28955g;

        /* renamed from: h */
        final /* synthetic */ C11261a f28956h;

        /* renamed from: i */
        final /* synthetic */ boolean f28957i;

        C11200a(C11199i iVar, String str, boolean z, boolean z2, Field field, boolean z3, C11138i iVar2, C11125d dVar, C11261a aVar, boolean z4) {
            this.f28952d = field;
            this.f28953e = z3;
            this.f28954f = iVar2;
            this.f28955g = dVar;
            this.f28956h = aVar;
            this.f28957i = z4;
            super(str, z, z2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo32614a(C11265c cVar, Object obj) throws IOException, IllegalAccessException {
            C11138i iVar;
            Object obj2 = this.f28952d.get(obj);
            if (this.f28953e) {
                iVar = this.f28954f;
            } else {
                iVar = new C11211m(this.f28955g, this.f28954f, this.f28956h.getType());
            }
            iVar.write(cVar, obj2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo32613a(C11262a aVar, Object obj) throws IOException, IllegalAccessException {
            Object read = this.f28954f.read(aVar);
            if (read != null || !this.f28957i) {
                this.f28952d.set(obj, read);
            }
        }

        /* renamed from: a */
        public boolean mo32615a(Object obj) throws IOException, IllegalAccessException {
            boolean z = false;
            if (!this.f28961b) {
                return false;
            }
            if (this.f28952d.get(obj) != obj) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: com.google.gson.internal.m.i$b */
    public static final class C11201b<T> extends C11138i<T> {

        /* renamed from: a */
        private final ObjectConstructor<T> f28958a;

        /* renamed from: b */
        private final Map<String, C11202c> f28959b;

        C11201b(ObjectConstructor<T> objectConstructor, Map<String, C11202c> map) {
            this.f28958a = objectConstructor;
            this.f28959b = map;
        }

        public T read(C11262a aVar) throws IOException {
            if (aVar.peek() == C11264b.NULL) {
                aVar.mo32585o();
                return null;
            }
            T construct = this.f28958a.construct();
            try {
                aVar.mo32574b();
                while (aVar.mo32579g()) {
                    C11202c cVar = (C11202c) this.f28959b.get(aVar.mo32584n());
                    if (cVar != null) {
                        if (cVar.f28962c) {
                            cVar.mo32613a(aVar, (Object) construct);
                        }
                    }
                    aVar.mo32588q();
                }
                aVar.mo32577e();
                return construct;
            } catch (IllegalStateException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public void write(C11265c cVar, T t) throws IOException {
            if (t == null) {
                cVar.mo32606h();
                return;
            }
            cVar.mo32598b();
            try {
                for (C11202c cVar2 : this.f28959b.values()) {
                    if (cVar2.mo32615a(t)) {
                        cVar.mo32599b(cVar2.f28960a);
                        cVar2.mo32614a(cVar, (Object) t);
                    }
                }
                cVar.mo32602d();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.m.i$c */
    static abstract class C11202c {

        /* renamed from: a */
        final String f28960a;

        /* renamed from: b */
        final boolean f28961b;

        /* renamed from: c */
        final boolean f28962c;

        protected C11202c(String str, boolean z, boolean z2) {
            this.f28960a = str;
            this.f28961b = z;
            this.f28962c = z2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo32613a(C11262a aVar, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo32614a(C11265c cVar, Object obj) throws IOException, IllegalAccessException;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo32615a(Object obj) throws IOException, IllegalAccessException;
    }

    public C11199i(C11145c cVar, FieldNamingStrategy fieldNamingStrategy, C11160d dVar, C11189d dVar2) {
        this.f28947e = cVar;
        this.f28948f = fieldNamingStrategy;
        this.f28949g = dVar;
        this.f28950h = dVar2;
    }

    /* renamed from: a */
    public boolean mo32612a(Field field, boolean z) {
        return m28797a(field, z, this.f28949g);
    }

    public <T> C11138i<T> create(C11125d dVar, C11261a<T> aVar) {
        Class rawType = aVar.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        return new C11201b(this.f28947e.mo32510a(aVar), m28796a(dVar, aVar, rawType));
    }

    /* renamed from: a */
    static boolean m28797a(Field field, boolean z, C11160d dVar) {
        return !dVar.mo32513a(field.getType(), z) && !dVar.mo32514a(field, z);
    }

    /* renamed from: a */
    private List<String> m28795a(Field field) {
        C11258c cVar = (C11258c) field.getAnnotation(C11258c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f28948f.translateName(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: a */
    private C11202c m28794a(C11125d dVar, Field field, String str, C11261a<?> aVar, boolean z, boolean z2) {
        C11125d dVar2 = dVar;
        C11261a<?> aVar2 = aVar;
        boolean a = C11174j.m28742a((Type) aVar.getRawType());
        Field field2 = field;
        C11257b bVar = (C11257b) field.getAnnotation(C11257b.class);
        C11138i a2 = bVar != null ? this.f28950h.mo32572a(this.f28947e, dVar, aVar2, bVar) : null;
        boolean z3 = a2 != null;
        if (a2 == null) {
            a2 = dVar.mo32448a(aVar2);
        }
        C11200a aVar3 = new C11200a(this, str, z, z2, field, z3, a2, dVar, aVar, a);
        return aVar3;
    }

    /* renamed from: a */
    private Map<String, C11202c> m28796a(C11125d dVar, C11261a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = aVar.getType();
        C11261a<?> aVar2 = aVar;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean a = mo32612a(field, true);
                boolean a2 = mo32612a(field, z);
                if (a || a2) {
                    this.f28951i.mo32652a(field);
                    Type a3 = C11141b.m28686a(aVar2.getType(), cls2, field.getGenericType());
                    List a4 = m28795a(field);
                    int size = a4.size();
                    C11202c cVar = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = (String) a4.get(i2);
                        boolean z2 = i2 != 0 ? false : a;
                        String str2 = str;
                        C11202c cVar2 = cVar;
                        int i3 = i2;
                        int i4 = size;
                        List list = a4;
                        Field field2 = field;
                        cVar = cVar2 == null ? (C11202c) linkedHashMap.put(str2, m28794a(dVar, field, str2, C11261a.get(a3), z2, a2)) : cVar2;
                        i2 = i3 + 1;
                        a = z2;
                        a4 = list;
                        size = i4;
                        field = field2;
                    }
                    C11202c cVar3 = cVar;
                    if (cVar3 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(type);
                        sb.append(" declares multiple JSON fields named ");
                        sb.append(cVar3.f28960a);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                i++;
                z = false;
            }
            aVar2 = C11261a.get(C11141b.m28686a(aVar2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.getRawType();
        }
        return linkedHashMap;
    }
}
