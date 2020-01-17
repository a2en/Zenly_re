package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public interface CallAdapter<R, T> {

    /* renamed from: retrofit2.CallAdapter$a */
    public static abstract class C13388a {
        /* renamed from: a */
        protected static Class<?> m35479a(Type type) {
            return C13435k.m35607c(type);
        }

        /* renamed from: a */
        public abstract CallAdapter<?, ?> mo38628a(Type type, Annotation[] annotationArr, C13430i iVar);
    }

    T adapt(Call<R> call);

    Type responseType();
}
