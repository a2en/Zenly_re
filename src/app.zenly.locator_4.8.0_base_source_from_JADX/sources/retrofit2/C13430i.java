package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.C13170b0;
import okhttp3.C13319s;
import okhttp3.C13325v;
import okhttp3.C13333z;
import okhttp3.Call.Factory;
import retrofit2.CallAdapter.C13388a;
import retrofit2.Converter.C13389a;

/* renamed from: retrofit2.i */
public final class C13430i {

    /* renamed from: a */
    private final Map<Method, C13433j<?, ?>> f34828a = new ConcurrentHashMap();

    /* renamed from: b */
    final Factory f34829b;

    /* renamed from: c */
    final C13319s f34830c;

    /* renamed from: d */
    final List<C13389a> f34831d;

    /* renamed from: e */
    final List<C13388a> f34832e;

    /* renamed from: f */
    final Executor f34833f;

    /* renamed from: g */
    final boolean f34834g;

    /* renamed from: retrofit2.i$a */
    class C13431a implements InvocationHandler {

        /* renamed from: a */
        private final C13423f f34835a = C13423f.m35524c();

        /* renamed from: b */
        final /* synthetic */ Class f34836b;

        C13431a(Class cls) {
            this.f34836b = cls;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.f34835a.mo38652a(method)) {
                return this.f34835a.mo38649a(method, this.f34836b, obj, objArr);
            }
            C13433j a = C13430i.this.mo38677a(method);
            return a.mo38690a((Call<R>) new C13404d<R>(a, objArr));
        }
    }

    /* renamed from: retrofit2.i$b */
    public static final class C13432b {

        /* renamed from: a */
        private final C13423f f34838a;

        /* renamed from: b */
        private Factory f34839b;

        /* renamed from: c */
        private C13319s f34840c;

        /* renamed from: d */
        private final List<C13389a> f34841d;

        /* renamed from: e */
        private final List<C13388a> f34842e;

        /* renamed from: f */
        private Executor f34843f;

        /* renamed from: g */
        private boolean f34844g;

        C13432b(C13423f fVar) {
            this.f34841d = new ArrayList();
            this.f34842e = new ArrayList();
            this.f34838a = fVar;
        }

        /* renamed from: a */
        public C13432b mo38686a(C13325v vVar) {
            C13435k.m35594a(vVar, "client == null");
            mo38684a((Factory) vVar);
            return this;
        }

        /* renamed from: a */
        public C13432b mo38684a(Factory factory) {
            C13435k.m35594a(factory, "factory == null");
            this.f34839b = factory;
            return this;
        }

        /* renamed from: a */
        public C13432b mo38683a(String str) {
            C13435k.m35594a(str, "baseUrl == null");
            C13319s f = C13319s.m35127f(str);
            if (f != null) {
                mo38685a(f);
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal URL: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }

        public C13432b() {
            this(C13423f.m35524c());
        }

        C13432b(C13430i iVar) {
            this.f34841d = new ArrayList();
            this.f34842e = new ArrayList();
            this.f34838a = C13423f.m35524c();
            this.f34839b = iVar.f34829b;
            this.f34840c = iVar.f34830c;
            this.f34841d.addAll(iVar.f34831d);
            this.f34841d.remove(0);
            this.f34842e.addAll(iVar.f34832e);
            List<C13388a> list = this.f34842e;
            list.remove(list.size() - 1);
            this.f34843f = iVar.f34833f;
            this.f34844g = iVar.f34834g;
        }

        /* renamed from: a */
        public C13432b mo38685a(C13319s sVar) {
            C13435k.m35594a(sVar, "baseUrl == null");
            List j = sVar.mo38292j();
            if ("".equals(j.get(j.size() - 1))) {
                this.f34840c = sVar;
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("baseUrl must end in /: ");
            sb.append(sVar);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public C13432b mo38687a(C13389a aVar) {
            List<C13389a> list = this.f34841d;
            C13435k.m35594a(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: a */
        public C13430i mo38688a() {
            if (this.f34840c != null) {
                Factory factory = this.f34839b;
                if (factory == null) {
                    factory = new C13325v();
                }
                Factory factory2 = factory;
                Executor executor = this.f34843f;
                if (executor == null) {
                    executor = this.f34838a.mo38650a();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f34842e);
                arrayList.add(this.f34838a.mo38651a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f34841d.size() + 1);
                arrayList2.add(new C13390a());
                arrayList2.addAll(this.f34841d);
                C13430i iVar = new C13430i(factory2, this.f34840c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f34844g);
                return iVar;
            }
            throw new IllegalStateException("Base URL required.");
        }
    }

    C13430i(Factory factory, C13319s sVar, List<C13389a> list, List<C13388a> list2, Executor executor, boolean z) {
        this.f34829b = factory;
        this.f34830c = sVar;
        this.f34831d = list;
        this.f34832e = list2;
        this.f34833f = executor;
        this.f34834g = z;
    }

    /* renamed from: b */
    private void m35555b(Class<?> cls) {
        Method[] declaredMethods;
        C13423f c = C13423f.m35524c();
        for (Method method : cls.getDeclaredMethods()) {
            if (!c.mo38652a(method)) {
                mo38677a(method);
            }
        }
    }

    /* renamed from: a */
    public <T> T mo38670a(Class<T> cls) {
        C13435k.m35600a(cls);
        if (this.f34834g) {
            m35555b(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C13431a(cls));
    }

    /* renamed from: c */
    public <T> Converter<T, String> mo38680c(Type type, Annotation[] annotationArr) {
        C13435k.m35594a(type, "type == null");
        C13435k.m35594a(annotationArr, "annotations == null");
        int size = this.f34831d.size();
        for (int i = 0; i < size; i++) {
            Converter<T, String> b = ((C13389a) this.f34831d.get(i)).mo38632b(type, annotationArr, this);
            if (b != null) {
                return b;
            }
        }
        return C13394d.f34757a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13433j<?, ?> mo38677a(Method method) {
        C13433j<?, ?> jVar;
        C13433j<?, ?> jVar2 = (C13433j) this.f34828a.get(method);
        if (jVar2 != null) {
            return jVar2;
        }
        synchronized (this.f34828a) {
            jVar = (C13433j) this.f34828a.get(method);
            if (jVar == null) {
                jVar = new C13434a(this, method).mo38692a();
                this.f34828a.put(method, jVar);
            }
        }
        return jVar;
    }

    /* renamed from: b */
    public Factory mo38678b() {
        return this.f34829b;
    }

    /* renamed from: b */
    public <T> Converter<C13170b0, T> mo38679b(Type type, Annotation[] annotationArr) {
        return mo38675a((C13389a) null, type, annotationArr);
    }

    /* renamed from: c */
    public C13432b mo38681c() {
        return new C13432b(this);
    }

    /* renamed from: a */
    public C13319s mo38671a() {
        return this.f34830c;
    }

    /* renamed from: a */
    public CallAdapter<?, ?> mo38672a(Type type, Annotation[] annotationArr) {
        return mo38673a((C13388a) null, type, annotationArr);
    }

    /* renamed from: a */
    public CallAdapter<?, ?> mo38673a(C13388a aVar, Type type, Annotation[] annotationArr) {
        C13435k.m35594a(type, "returnType == null");
        C13435k.m35594a(annotationArr, "annotations == null");
        int indexOf = this.f34832e.indexOf(aVar) + 1;
        int size = this.f34832e.size();
        for (int i = indexOf; i < size; i++) {
            CallAdapter<?, ?> a = ((C13388a) this.f34832e.get(i)).mo38628a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        String str = "\n   * ";
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append(str);
                sb.append(((C13388a) this.f34832e.get(i2)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f34832e.size();
        while (indexOf < size2) {
            sb.append(str);
            sb.append(((C13388a) this.f34832e.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public <T> Converter<T, C13333z> mo38674a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return mo38676a(null, type, annotationArr, annotationArr2);
    }

    /* renamed from: a */
    public <T> Converter<T, C13333z> mo38676a(C13389a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        C13435k.m35594a(type, "type == null");
        C13435k.m35594a(annotationArr, "parameterAnnotations == null");
        C13435k.m35594a(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f34831d.indexOf(aVar) + 1;
        int size = this.f34831d.size();
        for (int i = indexOf; i < size; i++) {
            Converter<T, C13333z> a = ((C13389a) this.f34831d.get(i)).mo38631a(type, annotationArr, annotationArr2, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        String str = "\n   * ";
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append(str);
                sb.append(((C13389a) this.f34831d.get(i2)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f34831d.size();
        while (indexOf < size2) {
            sb.append(str);
            sb.append(((C13389a) this.f34831d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public <T> Converter<C13170b0, T> mo38675a(C13389a aVar, Type type, Annotation[] annotationArr) {
        C13435k.m35594a(type, "type == null");
        C13435k.m35594a(annotationArr, "annotations == null");
        int indexOf = this.f34831d.indexOf(aVar) + 1;
        int size = this.f34831d.size();
        for (int i = indexOf; i < size; i++) {
            Converter<C13170b0, T> a = ((C13389a) this.f34831d.get(i)).mo38630a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        String str = "\n   * ";
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append(str);
                sb.append(((C13389a) this.f34831d.get(i2)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f34831d.size();
        while (indexOf < size2) {
            sb.append(str);
            sb.append(((C13389a) this.f34831d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }
}
