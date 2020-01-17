package kotlinx.coroutines.android;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import java.lang.reflect.Constructor;
import kotlin.C12918j;
import kotlin.C12918j.C12919a;
import kotlin.C12949k;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.android.c */
public final class C13059c {
    static {
        Object obj;
        try {
            C12919a aVar = C12918j.f33499e;
            Looper mainLooper = Looper.getMainLooper();
            C12932j.m33815a((Object) mainLooper, "Looper.getMainLooper()");
            obj = new C13054a(m34081a(mainLooper, true), "Main");
            C12918j.m33783a(obj);
        } catch (Throwable th) {
            C12919a aVar2 = C12918j.f33499e;
            obj = C12949k.m33848a(th);
            C12918j.m33783a(obj);
        }
        if (C12918j.m33785c(obj)) {
            obj = null;
        }
        C13058b bVar = (C13058b) obj;
    }

    /* renamed from: a */
    public static final Handler m34081a(Looper looper, boolean z) {
        C12932j.m33818b(looper, "$this$asHandler");
        if (z) {
            int i = VERSION.SDK_INT;
            if (i >= 16) {
                if (i >= 28) {
                    Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke(null, new Object[]{looper});
                    if (invoke != null) {
                        return (Handler) invoke;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.os.Handler");
                }
                try {
                    Constructor declaredConstructor = Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Callback.class, Boolean.TYPE});
                    C12932j.m33815a((Object) declaredConstructor, "Handler::class.java.getD…:class.javaPrimitiveType)");
                    Object newInstance = declaredConstructor.newInstance(new Object[]{looper, null, Boolean.valueOf(true)});
                    C12932j.m33815a(newInstance, "constructor.newInstance(this, null, true)");
                    return (Handler) newInstance;
                } catch (NoSuchMethodException unused) {
                    return new Handler(looper);
                }
            }
        }
        return new Handler(looper);
    }
}
