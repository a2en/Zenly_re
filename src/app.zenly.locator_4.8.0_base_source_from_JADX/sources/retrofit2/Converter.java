package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.C13170b0;
import okhttp3.C13333z;

public interface Converter<F, T> {

    /* renamed from: retrofit2.Converter$a */
    public static abstract class C13389a {
        /* renamed from: a */
        public Converter<C13170b0, ?> mo38630a(Type type, Annotation[] annotationArr, C13430i iVar) {
            return null;
        }

        /* renamed from: a */
        public Converter<?, C13333z> mo38631a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C13430i iVar) {
            return null;
        }

        /* renamed from: b */
        public Converter<?, String> mo38632b(Type type, Annotation[] annotationArr, C13430i iVar) {
            return null;
        }
    }

    T convert(F f) throws IOException;
}
