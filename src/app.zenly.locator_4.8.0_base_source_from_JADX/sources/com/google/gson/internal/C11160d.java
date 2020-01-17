package com.google.gson.internal;

import com.google.gson.C11117b;
import com.google.gson.C11125d;
import com.google.gson.C11138i;
import com.google.gson.ExclusionStrategy;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.p315j.C11256a;
import com.google.gson.p315j.C11259d;
import com.google.gson.p315j.C11260e;
import com.google.gson.p316k.C11261a;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11265c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.gson.internal.d */
public final class C11160d implements TypeAdapterFactory, Cloneable {

    /* renamed from: k */
    public static final C11160d f28871k = new C11160d();

    /* renamed from: e */
    private double f28872e = -1.0d;

    /* renamed from: f */
    private int f28873f = 136;

    /* renamed from: g */
    private boolean f28874g = true;

    /* renamed from: h */
    private boolean f28875h;

    /* renamed from: i */
    private List<ExclusionStrategy> f28876i = Collections.emptyList();

    /* renamed from: j */
    private List<ExclusionStrategy> f28877j = Collections.emptyList();

    /* renamed from: com.google.gson.internal.d$a */
    class C11161a extends C11138i<T> {

        /* renamed from: a */
        private C11138i<T> f28878a;

        /* renamed from: b */
        final /* synthetic */ boolean f28879b;

        /* renamed from: c */
        final /* synthetic */ boolean f28880c;

        /* renamed from: d */
        final /* synthetic */ C11125d f28881d;

        /* renamed from: e */
        final /* synthetic */ C11261a f28882e;

        C11161a(boolean z, boolean z2, C11125d dVar, C11261a aVar) {
            this.f28879b = z;
            this.f28880c = z2;
            this.f28881d = dVar;
            this.f28882e = aVar;
        }

        /* renamed from: a */
        private C11138i<T> m28715a() {
            C11138i<T> iVar = this.f28878a;
            if (iVar != null) {
                return iVar;
            }
            C11138i<T> a = this.f28881d.mo32447a((TypeAdapterFactory) C11160d.this, this.f28882e);
            this.f28878a = a;
            return a;
        }

        public T read(C11262a aVar) throws IOException {
            if (!this.f28879b) {
                return m28715a().read(aVar);
            }
            aVar.mo32588q();
            return null;
        }

        public void write(C11265c cVar, T t) throws IOException {
            if (this.f28880c) {
                cVar.mo32606h();
            } else {
                m28715a().write(cVar, t);
            }
        }
    }

    /* renamed from: b */
    private boolean m28709b(Class<?> cls, boolean z) {
        for (ExclusionStrategy shouldSkipClass : z ? this.f28876i : this.f28877j) {
            if (shouldSkipClass.shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m28710c(Class<?> cls) {
        return cls.isMemberClass() && !m28711d(cls);
    }

    /* renamed from: d */
    private boolean m28711d(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: a */
    public C11160d mo32512a(int... iArr) {
        C11160d clone = clone();
        clone.f28873f = 0;
        for (int i : iArr) {
            clone.f28873f = i | clone.f28873f;
        }
        return clone;
    }

    public <T> C11138i<T> create(C11125d dVar, C11261a<T> aVar) {
        Class rawType = aVar.getRawType();
        boolean a = m28707a(rawType);
        boolean z = a || m28709b(rawType, true);
        boolean z2 = a || m28709b(rawType, false);
        if (!z && !z2) {
            return null;
        }
        C11161a aVar2 = new C11161a(z2, z, dVar, aVar);
        return aVar2;
    }

    /* access modifiers changed from: protected */
    public C11160d clone() {
        try {
            return (C11160d) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    private boolean m28708b(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: a */
    public boolean mo32514a(Field field, boolean z) {
        if ((this.f28873f & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f28872e != -1.0d && !m28705a((C11259d) field.getAnnotation(C11259d.class), (C11260e) field.getAnnotation(C11260e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f28875h) {
            C11256a aVar = (C11256a) field.getAnnotation(C11256a.class);
            if (aVar == null || (!z ? !aVar.deserialize() : !aVar.serialize())) {
                return true;
            }
        }
        if ((!this.f28874g && m28710c(field.getType())) || m28708b(field.getType())) {
            return true;
        }
        List<ExclusionStrategy> list = z ? this.f28876i : this.f28877j;
        if (!list.isEmpty()) {
            C11117b bVar = new C11117b(field);
            for (ExclusionStrategy shouldSkipField : list) {
                if (shouldSkipField.shouldSkipField(bVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m28707a(Class<?> cls) {
        if (this.f28872e != -1.0d && !m28705a((C11259d) cls.getAnnotation(C11259d.class), (C11260e) cls.getAnnotation(C11260e.class))) {
            return true;
        }
        if ((this.f28874g || !m28710c(cls)) && !m28708b(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo32513a(Class<?> cls, boolean z) {
        return m28707a(cls) || m28709b(cls, z);
    }

    /* renamed from: a */
    private boolean m28705a(C11259d dVar, C11260e eVar) {
        return m28704a(dVar) && m28706a(eVar);
    }

    /* renamed from: a */
    private boolean m28704a(C11259d dVar) {
        return dVar == null || dVar.value() <= this.f28872e;
    }

    /* renamed from: a */
    private boolean m28706a(C11260e eVar) {
        return eVar == null || eVar.value() > this.f28872e;
    }
}
