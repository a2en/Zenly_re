package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.CallAdapter.C13388a;

/* renamed from: retrofit2.b */
final class C13396b extends C13388a {

    /* renamed from: a */
    static final C13388a f34759a = new C13396b();

    /* renamed from: retrofit2.b$a */
    class C13397a implements CallAdapter<Object, Call<?>> {

        /* renamed from: a */
        final /* synthetic */ Type f34760a;

        C13397a(C13396b bVar, Type type) {
            this.f34760a = type;
        }

        public Call<Object> adapt(Call<Object> call) {
            return call;
        }

        public Type responseType() {
            return this.f34760a;
        }
    }

    C13396b() {
    }

    /* renamed from: a */
    public CallAdapter<?, ?> mo38628a(Type type, Annotation[] annotationArr, C13430i iVar) {
        if (C13388a.m35479a(type) != Call.class) {
            return null;
        }
        return new C13397a(this, C13435k.m35605b(type));
    }
}
