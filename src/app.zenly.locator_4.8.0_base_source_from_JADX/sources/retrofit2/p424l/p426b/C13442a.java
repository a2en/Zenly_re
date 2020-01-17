package retrofit2.p424l.p426b;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.C13170b0;
import okhttp3.C13333z;
import retrofit2.C13430i;
import retrofit2.Converter;
import retrofit2.Converter.C13389a;

/* renamed from: retrofit2.l.b.a */
public final class C13442a extends C13389a {
    private C13442a() {
    }

    /* renamed from: a */
    public static C13442a m35614a() {
        return new C13442a();
    }

    /* renamed from: a */
    public Converter<C13170b0, ?> mo38630a(Type type, Annotation[] annotationArr, C13430i iVar) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!Message.class.isAssignableFrom(cls)) {
            return null;
        }
        return new C13444c(ProtoAdapter.get(cls));
    }

    /* renamed from: a */
    public Converter<?, C13333z> mo38631a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C13430i iVar) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!Message.class.isAssignableFrom(cls)) {
            return null;
        }
        return new C13443b(ProtoAdapter.get(cls));
    }
}
