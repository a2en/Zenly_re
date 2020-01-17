package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.C13167a0;
import okhttp3.C13170b0;
import okhttp3.C13317r;
import okhttp3.C13317r.C13318a;
import okhttp3.C13319s;
import okhttp3.C13321t;
import okhttp3.C13322u.C13324b;
import okhttp3.Call;
import okhttp3.Call.Factory;
import retrofit2.p427m.C13445a;
import retrofit2.p427m.C13446b;
import retrofit2.p427m.C13447c;
import retrofit2.p427m.C13448d;
import retrofit2.p427m.C13449e;
import retrofit2.p427m.C13450f;
import retrofit2.p427m.C13451g;
import retrofit2.p427m.C13452h;
import retrofit2.p427m.C13453i;
import retrofit2.p427m.C13454j;
import retrofit2.p427m.C13455k;
import retrofit2.p427m.C13456l;
import retrofit2.p427m.C13457m;
import retrofit2.p427m.C13458n;
import retrofit2.p427m.C13459o;
import retrofit2.p427m.C13460p;
import retrofit2.p427m.C13461q;
import retrofit2.p427m.C13462r;
import retrofit2.p427m.C13463s;

/* renamed from: retrofit2.j */
final class C13433j<R, T> {

    /* renamed from: m */
    static final Pattern f34845m = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: n */
    static final Pattern f34846n = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: a */
    private final Factory f34847a;

    /* renamed from: b */
    private final CallAdapter<R, T> f34848b;

    /* renamed from: c */
    private final C13319s f34849c;

    /* renamed from: d */
    private final Converter<C13170b0, R> f34850d;

    /* renamed from: e */
    private final String f34851e;

    /* renamed from: f */
    private final String f34852f;

    /* renamed from: g */
    private final C13317r f34853g;

    /* renamed from: h */
    private final C13321t f34854h;

    /* renamed from: i */
    private final boolean f34855i;

    /* renamed from: j */
    private final boolean f34856j;

    /* renamed from: k */
    private final boolean f34857k;

    /* renamed from: l */
    private final C13409e<?>[] f34858l;

    /* renamed from: retrofit2.j$a */
    static final class C13434a<T, R> {

        /* renamed from: a */
        final C13430i f34859a;

        /* renamed from: b */
        final Method f34860b;

        /* renamed from: c */
        final Annotation[] f34861c;

        /* renamed from: d */
        final Annotation[][] f34862d;

        /* renamed from: e */
        final Type[] f34863e;

        /* renamed from: f */
        Type f34864f;

        /* renamed from: g */
        boolean f34865g;

        /* renamed from: h */
        boolean f34866h;

        /* renamed from: i */
        boolean f34867i;

        /* renamed from: j */
        boolean f34868j;

        /* renamed from: k */
        boolean f34869k;

        /* renamed from: l */
        boolean f34870l;

        /* renamed from: m */
        String f34871m;

        /* renamed from: n */
        boolean f34872n;

        /* renamed from: o */
        boolean f34873o;

        /* renamed from: p */
        boolean f34874p;

        /* renamed from: q */
        String f34875q;

        /* renamed from: r */
        C13317r f34876r;

        /* renamed from: s */
        C13321t f34877s;

        /* renamed from: t */
        Set<String> f34878t;

        /* renamed from: u */
        C13409e<?>[] f34879u;

        /* renamed from: v */
        Converter<C13170b0, T> f34880v;

        /* renamed from: w */
        CallAdapter<T, R> f34881w;

        C13434a(C13430i iVar, Method method) {
            this.f34859a = iVar;
            this.f34860b = method;
            this.f34861c = method.getAnnotations();
            this.f34863e = method.getGenericParameterTypes();
            this.f34862d = method.getParameterAnnotations();
        }

        /* renamed from: b */
        private CallAdapter<T, R> m35589b() {
            Type genericReturnType = this.f34860b.getGenericReturnType();
            if (C13435k.m35608d(genericReturnType)) {
                throw m35580a("Method return type must not include a type variable or wildcard: %s", genericReturnType);
            } else if (genericReturnType != Void.TYPE) {
                try {
                    return this.f34859a.mo38672a(genericReturnType, this.f34860b.getAnnotations());
                } catch (RuntimeException e) {
                    throw m35582a((Throwable) e, "Unable to create call adapter for %s", genericReturnType);
                }
            } else {
                throw m35580a("Service methods cannot return void.", new Object[0]);
            }
        }

        /* renamed from: c */
        private Converter<C13170b0, T> m35590c() {
            try {
                return this.f34859a.mo38679b(this.f34864f, this.f34860b.getAnnotations());
            } catch (RuntimeException e) {
                throw m35582a((Throwable) e, "Unable to create converter for %s", this.f34864f);
            }
        }

        /* renamed from: a */
        public C13433j mo38692a() {
            this.f34881w = m35589b();
            this.f34864f = this.f34881w.responseType();
            Type type = this.f34864f;
            if (type == C13429h.class || type == C13167a0.class) {
                StringBuilder sb = new StringBuilder();
                sb.append("'");
                sb.append(C13435k.m35607c(this.f34864f).getName());
                sb.append("' is not a valid response body type. Did you mean ResponseBody?");
                throw m35580a(sb.toString(), new Object[0]);
            }
            this.f34880v = m35590c();
            for (Annotation a : this.f34861c) {
                m35588a(a);
            }
            if (this.f34871m != null) {
                if (!this.f34872n) {
                    if (this.f34874p) {
                        throw m35580a("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f34873o) {
                        throw m35580a("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f34862d.length;
                this.f34879u = new C13409e[length];
                int i = 0;
                while (i < length) {
                    Type type2 = this.f34863e[i];
                    if (!C13435k.m35608d(type2)) {
                        Annotation[] annotationArr = this.f34862d[i];
                        if (annotationArr != null) {
                            this.f34879u[i] = m35584a(i, type2, annotationArr);
                            i++;
                        } else {
                            throw m35579a(i, "No Retrofit annotation found.", new Object[0]);
                        }
                    } else {
                        throw m35579a(i, "Parameter type must not include a type variable or wildcard: %s", type2);
                    }
                }
                if (this.f34875q == null && !this.f34870l) {
                    throw m35580a("Missing either @%s URL or @Url parameter.", this.f34871m);
                } else if (!this.f34873o && !this.f34874p && !this.f34872n && this.f34867i) {
                    throw m35580a("Non-body HTTP method cannot contain @Body.", new Object[0]);
                } else if (this.f34873o && !this.f34865g) {
                    throw m35580a("Form-encoded method must contain at least one @Field.", new Object[0]);
                } else if (!this.f34874p || this.f34866h) {
                    return new C13433j(this);
                } else {
                    throw m35580a("Multipart method must contain at least one @Part.", new Object[0]);
                }
            } else {
                throw m35580a("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }

        /* renamed from: a */
        private void m35588a(Annotation annotation) {
            if (annotation instanceof C13446b) {
                m35587a("DELETE", ((C13446b) annotation).value(), false);
            } else if (annotation instanceof C13449e) {
                m35587a("GET", ((C13449e) annotation).value(), false);
            } else if (annotation instanceof C13450f) {
                m35587a("HEAD", ((C13450f) annotation).value(), false);
                if (!Void.class.equals(this.f34864f)) {
                    throw m35580a("HEAD method must use Void as response type.", new Object[0]);
                }
            } else if (annotation instanceof C13455k) {
                m35587a("PATCH", ((C13455k) annotation).value(), true);
            } else if (annotation instanceof C13456l) {
                m35587a("POST", ((C13456l) annotation).value(), true);
            } else if (annotation instanceof C13457m) {
                m35587a("PUT", ((C13457m) annotation).value(), true);
            } else if (annotation instanceof C13454j) {
                m35587a("OPTIONS", ((C13454j) annotation).value(), false);
            } else if (annotation instanceof C13451g) {
                C13451g gVar = (C13451g) annotation;
                m35587a(gVar.method(), gVar.path(), gVar.hasBody());
            } else if (annotation instanceof C13453i) {
                String[] value = ((C13453i) annotation).value();
                if (value.length != 0) {
                    this.f34876r = m35583a(value);
                } else {
                    throw m35580a("@Headers annotation is empty.", new Object[0]);
                }
            }
        }

        /* renamed from: a */
        private void m35587a(String str, String str2, boolean z) {
            String str3 = this.f34871m;
            if (str3 == null) {
                this.f34871m = str;
                this.f34872n = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (C13433j.f34845m.matcher(substring).find()) {
                            throw m35580a("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f34875q = str2;
                    this.f34878t = C13433j.m35575a(str2);
                    return;
                }
                return;
            }
            throw m35580a("Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: a */
        private C13317r m35583a(String[] strArr) {
            C13318a aVar = new C13318a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw m35580a("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    C13321t b = C13321t.m35172b(trim);
                    if (b != null) {
                        this.f34877s = b;
                    } else {
                        throw m35580a("Malformed content type: %s", trim);
                    }
                } else {
                    aVar.mo38271a(substring, trim);
                }
            }
            return aVar.mo38272a();
        }

        /* renamed from: a */
        private C13409e<?> m35584a(int i, Type type, Annotation[] annotationArr) {
            C13409e<?> eVar = null;
            for (Annotation a : annotationArr) {
                C13409e<?> a2 = m35585a(i, type, annotationArr, a);
                if (a2 != null) {
                    if (eVar == null) {
                        eVar = a2;
                    } else {
                        throw m35579a(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                }
            }
            if (eVar != null) {
                return eVar;
            }
            throw m35579a(i, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: a */
        private C13409e<?> m35585a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            Class<C13324b> cls = C13324b.class;
            if (!(annotation instanceof C13460p)) {
                String str = "<String>)";
                String str2 = " must include generic type (e.g., ";
                if (annotation instanceof C13461q) {
                    C13461q qVar = (C13461q) annotation;
                    String value = qVar.value();
                    boolean encoded = qVar.encoded();
                    Class c = C13435k.m35607c(type);
                    this.f34869k = true;
                    if (Iterable.class.isAssignableFrom(c)) {
                        if (type instanceof ParameterizedType) {
                            return new C13419j(value, this.f34859a.mo38680c(C13435k.m35595a(0, (ParameterizedType) type), annotationArr), encoded).mo38643b();
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(c.getSimpleName());
                        sb.append(str2);
                        sb.append(c.getSimpleName());
                        sb.append(str);
                        throw m35579a(i, sb.toString(), new Object[0]);
                    } else if (!c.isArray()) {
                        return new C13419j(value, this.f34859a.mo38680c(type, annotationArr), encoded);
                    } else {
                        return new C13419j(value, this.f34859a.mo38680c(C13433j.m35574a(c.getComponentType()), annotationArr), encoded).mo38641a();
                    }
                } else if (annotation instanceof C13463s) {
                    boolean encoded2 = ((C13463s) annotation).encoded();
                    Class c2 = C13435k.m35607c(type);
                    this.f34869k = true;
                    if (Iterable.class.isAssignableFrom(c2)) {
                        if (type instanceof ParameterizedType) {
                            return new C13421l(this.f34859a.mo38680c(C13435k.m35595a(0, (ParameterizedType) type), annotationArr), encoded2).mo38643b();
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(c2.getSimpleName());
                        sb2.append(str2);
                        sb2.append(c2.getSimpleName());
                        sb2.append(str);
                        throw m35579a(i, sb2.toString(), new Object[0]);
                    } else if (!c2.isArray()) {
                        return new C13421l(this.f34859a.mo38680c(type, annotationArr), encoded2);
                    } else {
                        return new C13421l(this.f34859a.mo38680c(C13433j.m35574a(c2.getComponentType()), annotationArr), encoded2).mo38641a();
                    }
                } else {
                    String str3 = "Map must include generic types (e.g., Map<String, String>)";
                    if (annotation instanceof C13462r) {
                        Class c3 = C13435k.m35607c(type);
                        if (Map.class.isAssignableFrom(c3)) {
                            Type b = C13435k.m35606b(type, c3, Map.class);
                            if (b instanceof ParameterizedType) {
                                ParameterizedType parameterizedType = (ParameterizedType) b;
                                Type a = C13435k.m35595a(0, parameterizedType);
                                if (String.class == a) {
                                    return new C13420k(this.f34859a.mo38680c(C13435k.m35595a(1, parameterizedType), annotationArr), ((C13462r) annotation).encoded());
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("@QueryMap keys must be of type String: ");
                                sb3.append(a);
                                throw m35579a(i, sb3.toString(), new Object[0]);
                            }
                            throw m35579a(i, str3, new Object[0]);
                        }
                        throw m35579a(i, "@QueryMap parameter type must be Map.", new Object[0]);
                    } else if (annotation instanceof C13452h) {
                        String value2 = ((C13452h) annotation).value();
                        Class c4 = C13435k.m35607c(type);
                        if (Iterable.class.isAssignableFrom(c4)) {
                            if (type instanceof ParameterizedType) {
                                return new C13415f(value2, this.f34859a.mo38680c(C13435k.m35595a(0, (ParameterizedType) type), annotationArr)).mo38643b();
                            }
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(c4.getSimpleName());
                            sb4.append(str2);
                            sb4.append(c4.getSimpleName());
                            sb4.append(str);
                            throw m35579a(i, sb4.toString(), new Object[0]);
                        } else if (!c4.isArray()) {
                            return new C13415f(value2, this.f34859a.mo38680c(type, annotationArr));
                        } else {
                            return new C13415f(value2, this.f34859a.mo38680c(C13433j.m35574a(c4.getComponentType()), annotationArr)).mo38641a();
                        }
                    } else if (annotation instanceof C13447c) {
                        if (this.f34873o) {
                            C13447c cVar = (C13447c) annotation;
                            String value3 = cVar.value();
                            boolean encoded3 = cVar.encoded();
                            this.f34865g = true;
                            Class c5 = C13435k.m35607c(type);
                            if (Iterable.class.isAssignableFrom(c5)) {
                                if (type instanceof ParameterizedType) {
                                    return new C13413d(value3, this.f34859a.mo38680c(C13435k.m35595a(0, (ParameterizedType) type), annotationArr), encoded3).mo38643b();
                                }
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(c5.getSimpleName());
                                sb5.append(str2);
                                sb5.append(c5.getSimpleName());
                                sb5.append(str);
                                throw m35579a(i, sb5.toString(), new Object[0]);
                            } else if (!c5.isArray()) {
                                return new C13413d(value3, this.f34859a.mo38680c(type, annotationArr), encoded3);
                            } else {
                                return new C13413d(value3, this.f34859a.mo38680c(C13433j.m35574a(c5.getComponentType()), annotationArr), encoded3).mo38641a();
                            }
                        } else {
                            throw m35579a(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                        }
                    } else if (annotation instanceof C13448d) {
                        if (this.f34873o) {
                            Class c6 = C13435k.m35607c(type);
                            if (Map.class.isAssignableFrom(c6)) {
                                Type b2 = C13435k.m35606b(type, c6, Map.class);
                                if (b2 instanceof ParameterizedType) {
                                    ParameterizedType parameterizedType2 = (ParameterizedType) b2;
                                    Type a2 = C13435k.m35595a(0, parameterizedType2);
                                    if (String.class == a2) {
                                        Converter c7 = this.f34859a.mo38680c(C13435k.m35595a(1, parameterizedType2), annotationArr);
                                        this.f34865g = true;
                                        return new C13414e(c7, ((C13448d) annotation).encoded());
                                    }
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append("@FieldMap keys must be of type String: ");
                                    sb6.append(a2);
                                    throw m35579a(i, sb6.toString(), new Object[0]);
                                }
                                throw m35579a(i, str3, new Object[0]);
                            }
                            throw m35579a(i, "@FieldMap parameter type must be Map.", new Object[0]);
                        }
                        throw m35579a(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                    } else if (annotation instanceof C13458n) {
                        if (this.f34874p) {
                            C13458n nVar = (C13458n) annotation;
                            this.f34866h = true;
                            String value4 = nVar.value();
                            Class c8 = C13435k.m35607c(type);
                            if (value4.isEmpty()) {
                                String str4 = "@Part annotation must supply a name or use MultipartBody.Part parameter type.";
                                if (Iterable.class.isAssignableFrom(c8)) {
                                    if (!(type instanceof ParameterizedType)) {
                                        StringBuilder sb7 = new StringBuilder();
                                        sb7.append(c8.getSimpleName());
                                        sb7.append(str2);
                                        sb7.append(c8.getSimpleName());
                                        sb7.append(str);
                                        throw m35579a(i, sb7.toString(), new Object[0]);
                                    } else if (cls.isAssignableFrom(C13435k.m35607c(C13435k.m35595a(0, (ParameterizedType) type)))) {
                                        return C13422m.f34809a.mo38643b();
                                    } else {
                                        throw m35579a(i, str4, new Object[0]);
                                    }
                                } else if (c8.isArray()) {
                                    if (cls.isAssignableFrom(c8.getComponentType())) {
                                        return C13422m.f34809a.mo38641a();
                                    }
                                    throw m35579a(i, str4, new Object[0]);
                                } else if (cls.isAssignableFrom(c8)) {
                                    return C13422m.f34809a;
                                } else {
                                    throw m35579a(i, str4, new Object[0]);
                                }
                            } else {
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append("form-data; name=\"");
                                sb8.append(value4);
                                sb8.append("\"");
                                C13317r a3 = C13317r.m35096a("Content-Disposition", sb8.toString(), "Content-Transfer-Encoding", nVar.encoding());
                                String str5 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.";
                                if (Iterable.class.isAssignableFrom(c8)) {
                                    if (type instanceof ParameterizedType) {
                                        Type a4 = C13435k.m35595a(0, (ParameterizedType) type);
                                        if (!cls.isAssignableFrom(C13435k.m35607c(a4))) {
                                            return new C13416g(a3, this.f34859a.mo38674a(a4, annotationArr, this.f34861c)).mo38643b();
                                        }
                                        throw m35579a(i, str5, new Object[0]);
                                    }
                                    StringBuilder sb9 = new StringBuilder();
                                    sb9.append(c8.getSimpleName());
                                    sb9.append(str2);
                                    sb9.append(c8.getSimpleName());
                                    sb9.append(str);
                                    throw m35579a(i, sb9.toString(), new Object[0]);
                                } else if (c8.isArray()) {
                                    Class a5 = C13433j.m35574a(c8.getComponentType());
                                    if (!cls.isAssignableFrom(a5)) {
                                        return new C13416g(a3, this.f34859a.mo38674a((Type) a5, annotationArr, this.f34861c)).mo38641a();
                                    }
                                    throw m35579a(i, str5, new Object[0]);
                                } else if (!cls.isAssignableFrom(c8)) {
                                    return new C13416g(a3, this.f34859a.mo38674a(type, annotationArr, this.f34861c));
                                } else {
                                    throw m35579a(i, str5, new Object[0]);
                                }
                            }
                        } else {
                            throw m35579a(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                        }
                    } else if (annotation instanceof C13459o) {
                        if (this.f34874p) {
                            this.f34866h = true;
                            Class c9 = C13435k.m35607c(type);
                            if (Map.class.isAssignableFrom(c9)) {
                                Type b3 = C13435k.m35606b(type, c9, Map.class);
                                if (b3 instanceof ParameterizedType) {
                                    ParameterizedType parameterizedType3 = (ParameterizedType) b3;
                                    Type a6 = C13435k.m35595a(0, parameterizedType3);
                                    if (String.class == a6) {
                                        Type a7 = C13435k.m35595a(1, parameterizedType3);
                                        if (!cls.isAssignableFrom(C13435k.m35607c(a7))) {
                                            return new C13417h(this.f34859a.mo38674a(a7, annotationArr, this.f34861c), ((C13459o) annotation).encoding());
                                        }
                                        throw m35579a(i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                    }
                                    StringBuilder sb10 = new StringBuilder();
                                    sb10.append("@PartMap keys must be of type String: ");
                                    sb10.append(a6);
                                    throw m35579a(i, sb10.toString(), new Object[0]);
                                }
                                throw m35579a(i, str3, new Object[0]);
                            }
                            throw m35579a(i, "@PartMap parameter type must be Map.", new Object[0]);
                        }
                        throw m35579a(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    } else if (!(annotation instanceof C13445a)) {
                        return null;
                    } else {
                        if (this.f34873o || this.f34874p) {
                            throw m35579a(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                        } else if (!this.f34867i) {
                            try {
                                Converter a8 = this.f34859a.mo38674a(type, annotationArr, this.f34861c);
                                this.f34867i = true;
                                return new C13412c(a8);
                            } catch (RuntimeException e) {
                                throw m35581a((Throwable) e, i, "Unable to create @Body converter for %s", type);
                            }
                        } else {
                            throw m35579a(i, "Multiple @Body method annotations found.", new Object[0]);
                        }
                    }
                }
            } else if (this.f34869k) {
                throw m35579a(i, "A @Path parameter must not come after a @Query.", new Object[0]);
            } else if (this.f34870l) {
                throw m35579a(i, "@Path parameters may not be used with @Url.", new Object[0]);
            } else if (this.f34875q != null) {
                this.f34868j = true;
                C13460p pVar = (C13460p) annotation;
                String value5 = pVar.value();
                m35586a(i, value5);
                return new C13418i(value5, this.f34859a.mo38680c(type, annotationArr), pVar.encoded());
            } else {
                throw m35579a(i, "@Path can only be used with relative url on @%s", this.f34871m);
            }
        }

        /* renamed from: a */
        private void m35586a(int i, String str) {
            if (!C13433j.f34846n.matcher(str).matches()) {
                throw m35579a(i, "@Path parameter name must match %s. Found: %s", C13433j.f34845m.pattern(), str);
            } else if (!this.f34878t.contains(str)) {
                throw m35579a(i, "URL \"%s\" does not contain \"{%s}\".", this.f34875q, str);
            }
        }

        /* renamed from: a */
        private RuntimeException m35580a(String str, Object... objArr) {
            return m35582a((Throwable) null, str, objArr);
        }

        /* renamed from: a */
        private RuntimeException m35582a(Throwable th, String str, Object... objArr) {
            String format = String.format(str, objArr);
            StringBuilder sb = new StringBuilder();
            sb.append(format);
            sb.append("\n    for method ");
            sb.append(this.f34860b.getDeclaringClass().getSimpleName());
            sb.append(".");
            sb.append(this.f34860b.getName());
            return new IllegalArgumentException(sb.toString(), th);
        }

        /* renamed from: a */
        private RuntimeException m35581a(Throwable th, int i, String str, Object... objArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" (parameter #");
            sb.append(i + 1);
            sb.append(")");
            return m35582a(th, sb.toString(), objArr);
        }

        /* renamed from: a */
        private RuntimeException m35579a(int i, String str, Object... objArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" (parameter #");
            sb.append(i + 1);
            sb.append(")");
            return m35580a(sb.toString(), objArr);
        }
    }

    C13433j(C13434a<R, T> aVar) {
        this.f34847a = aVar.f34859a.mo38678b();
        this.f34848b = aVar.f34881w;
        this.f34849c = aVar.f34859a.mo38671a();
        this.f34850d = aVar.f34880v;
        this.f34851e = aVar.f34871m;
        this.f34852f = aVar.f34875q;
        this.f34853g = aVar.f34876r;
        this.f34854h = aVar.f34877s;
        this.f34855i = aVar.f34872n;
        this.f34856j = aVar.f34873o;
        this.f34857k = aVar.f34874p;
        this.f34858l = aVar.f34879u;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Call mo38691a(Object... objArr) throws IOException {
        C13427g gVar = new C13427g(this.f34851e, this.f34849c, this.f34852f, this.f34853g, this.f34854h, this.f34855i, this.f34856j, this.f34857k);
        C13409e<?>[] eVarArr = this.f34858l;
        int length = objArr != null ? objArr.length : 0;
        if (length == eVarArr.length) {
            for (int i = 0; i < length; i++) {
                eVarArr[i].mo38642a(gVar, objArr[i]);
            }
            return this.f34847a.newCall(gVar.mo38654a());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Argument count (");
        sb.append(length);
        sb.append(") doesn't match expected count (");
        sb.append(eVarArr.length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public T mo38690a(Call<R> call) {
        return this.f34848b.adapt(call);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public R mo38689a(C13170b0 b0Var) throws IOException {
        return this.f34850d.convert(b0Var);
    }

    /* renamed from: a */
    static Set<String> m35575a(String str) {
        Matcher matcher = f34845m.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class<?>, code=java.lang.Class, for r1v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Class<?> m35574a(java.lang.Class r1) {
        /*
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r0 != r1) goto L_0x0007
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            return r1
        L_0x0007:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r0 != r1) goto L_0x000e
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            return r1
        L_0x000e:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r0 != r1) goto L_0x0015
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            return r1
        L_0x0015:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r0 != r1) goto L_0x001c
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            return r1
        L_0x001c:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r0 != r1) goto L_0x0023
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            return r1
        L_0x0023:
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r0 != r1) goto L_0x002a
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            return r1
        L_0x002a:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r0 != r1) goto L_0x0031
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            return r1
        L_0x0031:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r0 != r1) goto L_0x0037
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
        L_0x0037:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.C13433j.m35574a(java.lang.Class):java.lang.Class");
    }
}
