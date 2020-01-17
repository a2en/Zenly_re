package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.C13170b0;
import okhttp3.C13333z;
import retrofit2.Converter.C13389a;
import retrofit2.p427m.C13464t;

/* renamed from: retrofit2.a */
final class C13390a extends C13389a {

    /* renamed from: retrofit2.a$a */
    static final class C13391a implements Converter<C13170b0, C13170b0> {

        /* renamed from: a */
        static final C13391a f34754a = new C13391a();

        C13391a() {
        }

        /* renamed from: a */
        public C13170b0 convert(C13170b0 b0Var) throws IOException {
            try {
                return C13435k.m35599a(b0Var);
            } finally {
                b0Var.close();
            }
        }
    }

    /* renamed from: retrofit2.a$b */
    static final class C13392b implements Converter<C13333z, C13333z> {

        /* renamed from: a */
        static final C13392b f34755a = new C13392b();

        C13392b() {
        }

        /* renamed from: a */
        public C13333z mo38634a(C13333z zVar) {
            return zVar;
        }

        public /* bridge */ /* synthetic */ Object convert(Object obj) throws IOException {
            C13333z zVar = (C13333z) obj;
            mo38634a(zVar);
            return zVar;
        }
    }

    /* renamed from: retrofit2.a$c */
    static final class C13393c implements Converter<C13170b0, C13170b0> {

        /* renamed from: a */
        static final C13393c f34756a = new C13393c();

        C13393c() {
        }

        /* renamed from: a */
        public C13170b0 mo38635a(C13170b0 b0Var) {
            return b0Var;
        }

        public /* bridge */ /* synthetic */ Object convert(Object obj) throws IOException {
            C13170b0 b0Var = (C13170b0) obj;
            mo38635a(b0Var);
            return b0Var;
        }
    }

    /* renamed from: retrofit2.a$d */
    static final class C13394d implements Converter<Object, String> {

        /* renamed from: a */
        static final C13394d f34757a = new C13394d();

        C13394d() {
        }

        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: retrofit2.a$e */
    static final class C13395e implements Converter<C13170b0, Void> {

        /* renamed from: a */
        static final C13395e f34758a = new C13395e();

        C13395e() {
        }

        /* renamed from: a */
        public Void convert(C13170b0 b0Var) {
            b0Var.close();
            return null;
        }
    }

    C13390a() {
    }

    /* renamed from: a */
    public Converter<C13170b0, ?> mo38630a(Type type, Annotation[] annotationArr, C13430i iVar) {
        Converter<C13170b0, ?> converter;
        if (type == C13170b0.class) {
            if (C13435k.m35604a(annotationArr, C13464t.class)) {
                converter = C13393c.f34756a;
            } else {
                converter = C13391a.f34754a;
            }
            return converter;
        } else if (type == Void.class) {
            return C13395e.f34758a;
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public Converter<?, C13333z> mo38631a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C13430i iVar) {
        if (C13333z.class.isAssignableFrom(C13435k.m35607c(type))) {
            return C13392b.f34755a;
        }
        return null;
    }
}
