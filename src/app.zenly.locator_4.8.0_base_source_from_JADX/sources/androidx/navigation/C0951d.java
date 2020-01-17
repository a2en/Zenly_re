package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavArgs;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.p413v.C13041a;
import kotlin.reflect.KClass;

/* renamed from: androidx.navigation.d */
public final class C0951d<Args extends NavArgs> implements Lazy<Args> {

    /* renamed from: e */
    private Args f3657e;

    /* renamed from: f */
    private final KClass<Args> f3658f;

    /* renamed from: g */
    private final Function0<Bundle> f3659g;

    public C0951d(KClass<Args> kClass, Function0<Bundle> function0) {
        C12932j.m33818b(kClass, "navArgsClass");
        C12932j.m33818b(function0, "argumentProducer");
        this.f3658f = kClass;
        this.f3659g = function0;
    }

    public boolean isInitialized() {
        return this.f3657e != null;
    }

    public Args getValue() {
        Args args = this.f3657e;
        if (args != null) {
            return args;
        }
        Bundle bundle = (Bundle) this.f3659g.invoke();
        Method method = (Method) C0952e.m4264a().get(this.f3658f);
        if (method == null) {
            Class a = C13041a.m34047a(this.f3658f);
            Class[] b = C0952e.m4265b();
            method = a.getMethod("fromBundle", (Class[]) Arrays.copyOf(b, b.length));
            C0952e.m4264a().put(this.f3658f, method);
            C12932j.m33815a((Object) method, "navArgsClass.java.getMet…hod\n                    }");
        }
        Args invoke = method.invoke(null, new Object[]{bundle});
        if (invoke != null) {
            Args args2 = (NavArgs) invoke;
            this.f3657e = args2;
            return args2;
        }
        throw new TypeCastException("null cannot be cast to non-null type Args");
    }
}
