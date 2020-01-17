package p250f.p251a.p252a.p263b.p279d.p280h.p281a;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.C12932j;

/* renamed from: f.a.a.b.d.h.a.b */
public final class C7775b {

    /* renamed from: a */
    public static final C7775b f19446a = new C7775b();

    private C7775b() {
    }

    /* renamed from: a */
    public final Method mo19982a(Class<?> cls, String str, Class<?>... clsArr) {
        C12932j.m33818b(cls, "target");
        C12932j.m33818b(str, "name");
        C12932j.m33818b(clsArr, "parameterTypes");
        Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        C12932j.m33815a((Object) declaredMethod, "target.getDeclaredMethod(name, *parameterTypes)");
        return declaredMethod;
    }

    /* renamed from: a */
    public final <T> T mo19981a(Object obj, Method method, Object... objArr) {
        C12932j.m33818b(method, "method");
        C12932j.m33818b(objArr, "args");
        return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }
}
