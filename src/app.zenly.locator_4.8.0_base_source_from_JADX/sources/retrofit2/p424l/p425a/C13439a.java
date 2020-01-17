package retrofit2.p424l.p425a;

import com.google.gson.C11125d;
import com.google.gson.p316k.C11261a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.C13170b0;
import okhttp3.C13333z;
import retrofit2.C13430i;
import retrofit2.Converter;
import retrofit2.Converter.C13389a;

/* renamed from: retrofit2.l.a.a */
public final class C13439a extends C13389a {

    /* renamed from: a */
    private final C11125d f34889a;

    private C13439a(C11125d dVar) {
        this.f34889a = dVar;
    }

    /* renamed from: a */
    public static C13439a m35610a(C11125d dVar) {
        if (dVar != null) {
            return new C13439a(dVar);
        }
        throw new NullPointerException("gson == null");
    }

    /* renamed from: a */
    public Converter<C13170b0, ?> mo38630a(Type type, Annotation[] annotationArr, C13430i iVar) {
        return new C13441c(this.f34889a, this.f34889a.mo32448a(C11261a.get(type)));
    }

    /* renamed from: a */
    public Converter<?, C13333z> mo38631a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C13430i iVar) {
        return new C13440b(this.f34889a, this.f34889a.mo32448a(C11261a.get(type)));
    }
}
