package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.internal.p314n.C11254b;
import com.google.gson.p316k.C11261a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: com.google.gson.internal.c */
public final class C11145c {

    /* renamed from: a */
    private final Map<Type, InstanceCreator<?>> f28860a;

    /* renamed from: b */
    private final C11254b f28861b = C11254b.m28850a();

    /* renamed from: com.google.gson.internal.c$a */
    class C11146a implements ObjectConstructor<T> {
        C11146a(C11145c cVar) {
        }

        public T construct() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.google.gson.internal.c$b */
    class C11147b implements ObjectConstructor<T> {
        C11147b(C11145c cVar) {
        }

        public T construct() {
            return new TreeMap();
        }
    }

    /* renamed from: com.google.gson.internal.c$c */
    class C11148c implements ObjectConstructor<T> {
        C11148c(C11145c cVar) {
        }

        public T construct() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.google.gson.internal.c$d */
    class C11149d implements ObjectConstructor<T> {
        C11149d(C11145c cVar) {
        }

        public T construct() {
            return new C11165h();
        }
    }

    /* renamed from: com.google.gson.internal.c$e */
    class C11150e implements ObjectConstructor<T> {

        /* renamed from: a */
        private final C11178l f28862a = C11178l.m28746a();

        /* renamed from: b */
        final /* synthetic */ Class f28863b;

        /* renamed from: c */
        final /* synthetic */ Type f28864c;

        C11150e(C11145c cVar, Class cls, Type type) {
            this.f28863b = cls;
            this.f28864c = type;
        }

        public T construct() {
            try {
                return this.f28862a.mo32569a(this.f28863b);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to invoke no-args constructor for ");
                sb.append(this.f28864c);
                sb.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
                throw new RuntimeException(sb.toString(), e);
            }
        }
    }

    /* renamed from: com.google.gson.internal.c$f */
    class C11151f implements ObjectConstructor<T> {

        /* renamed from: a */
        final /* synthetic */ InstanceCreator f28865a;

        /* renamed from: b */
        final /* synthetic */ Type f28866b;

        C11151f(C11145c cVar, InstanceCreator instanceCreator, Type type) {
            this.f28865a = instanceCreator;
            this.f28866b = type;
        }

        public T construct() {
            return this.f28865a.createInstance(this.f28866b);
        }
    }

    /* renamed from: com.google.gson.internal.c$g */
    class C11152g implements ObjectConstructor<T> {

        /* renamed from: a */
        final /* synthetic */ InstanceCreator f28867a;

        /* renamed from: b */
        final /* synthetic */ Type f28868b;

        C11152g(C11145c cVar, InstanceCreator instanceCreator, Type type) {
            this.f28867a = instanceCreator;
            this.f28868b = type;
        }

        public T construct() {
            return this.f28867a.createInstance(this.f28868b);
        }
    }

    /* renamed from: com.google.gson.internal.c$h */
    class C11153h implements ObjectConstructor<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f28869a;

        C11153h(C11145c cVar, Constructor constructor) {
            this.f28869a = constructor;
        }

        public T construct() {
            String str = " with no args";
            String str2 = "Failed to invoke ";
            try {
                return this.f28869a.newInstance(null);
            } catch (InstantiationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(this.f28869a);
                sb.append(str);
                throw new RuntimeException(sb.toString(), e);
            } catch (InvocationTargetException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(this.f28869a);
                sb2.append(str);
                throw new RuntimeException(sb2.toString(), e2.getTargetException());
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    /* renamed from: com.google.gson.internal.c$i */
    class C11154i implements ObjectConstructor<T> {
        C11154i(C11145c cVar) {
        }

        public T construct() {
            return new TreeSet();
        }
    }

    /* renamed from: com.google.gson.internal.c$j */
    class C11155j implements ObjectConstructor<T> {

        /* renamed from: a */
        final /* synthetic */ Type f28870a;

        C11155j(C11145c cVar, Type type) {
            this.f28870a = type;
        }

        public T construct() {
            Type type = this.f28870a;
            String str = "Invalid EnumSet type: ";
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.f28870a.toString());
                throw new JsonIOException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f28870a.toString());
            throw new JsonIOException(sb2.toString());
        }
    }

    /* renamed from: com.google.gson.internal.c$k */
    class C11156k implements ObjectConstructor<T> {
        C11156k(C11145c cVar) {
        }

        public T construct() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.google.gson.internal.c$l */
    class C11157l implements ObjectConstructor<T> {
        C11157l(C11145c cVar) {
        }

        public T construct() {
            return new ArrayDeque();
        }
    }

    /* renamed from: com.google.gson.internal.c$m */
    class C11158m implements ObjectConstructor<T> {
        C11158m(C11145c cVar) {
        }

        public T construct() {
            return new ArrayList();
        }
    }

    /* renamed from: com.google.gson.internal.c$n */
    class C11159n implements ObjectConstructor<T> {
        C11159n(C11145c cVar) {
        }

        public T construct() {
            return new ConcurrentSkipListMap();
        }
    }

    public C11145c(Map<Type, InstanceCreator<?>> map) {
        this.f28860a = map;
    }

    /* renamed from: b */
    private <T> ObjectConstructor<T> m28702b(Type type, Class<? super T> cls) {
        return new C11150e(this, cls, type);
    }

    /* renamed from: a */
    public <T> ObjectConstructor<T> mo32510a(C11261a<T> aVar) {
        Type type = aVar.getType();
        Class rawType = aVar.getRawType();
        InstanceCreator instanceCreator = (InstanceCreator) this.f28860a.get(type);
        if (instanceCreator != null) {
            return new C11151f(this, instanceCreator, type);
        }
        InstanceCreator instanceCreator2 = (InstanceCreator) this.f28860a.get(rawType);
        if (instanceCreator2 != null) {
            return new C11152g(this, instanceCreator2, type);
        }
        ObjectConstructor<T> a = m28700a(rawType);
        if (a != null) {
            return a;
        }
        ObjectConstructor<T> a2 = m28701a(type, rawType);
        if (a2 != null) {
            return a2;
        }
        return m28702b(type, rawType);
    }

    public String toString() {
        return this.f28860a.toString();
    }

    /* renamed from: a */
    private <T> ObjectConstructor<T> m28700a(Class<? super T> cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f28861b.mo32652a(declaredConstructor);
            }
            return new C11153h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private <T> ObjectConstructor<T> m28701a(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new C11154i(this);
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new C11155j(this, type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new C11156k(this);
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new C11157l(this);
            }
            return new C11158m(this);
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new C11159n(this);
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new C11146a(this);
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new C11147b(this);
            }
            if (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C11261a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                return new C11149d(this);
            }
            return new C11148c(this);
        }
    }
}
