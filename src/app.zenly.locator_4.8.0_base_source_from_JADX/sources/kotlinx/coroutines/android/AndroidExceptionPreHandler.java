package kotlinx.coroutines.android;

import android.os.Build.VERSION;
import androidx.annotation.Keep;
import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Lazy;
import kotlin.coroutines.C12868a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineExceptionHandler;

@Keep
public final class AndroidExceptionPreHandler extends C12868a implements CoroutineExceptionHandler, Function0<Method> {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private final Lazy preHandler$delegate = C12896f.m33751a(this);

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(AndroidExceptionPreHandler.class), "preHandler", "getPreHandler()Ljava/lang/reflect/Method;");
        C12946x.m33839a((C12940r) sVar);
        $$delegatedProperties = new KProperty[]{sVar};
    }

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.f33625c);
    }

    private final Method getPreHandler() {
        Lazy lazy = this.preHandler$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Method) lazy.getValue();
    }

    public void handleException(CoroutineContext coroutineContext, Throwable th) {
        C12932j.m33818b(coroutineContext, "context");
        C12932j.m33818b(th, "exception");
        Thread currentThread = Thread.currentThread();
        if (VERSION.SDK_INT >= 28) {
            C12932j.m33815a((Object) currentThread, "thread");
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
            return;
        }
        Method preHandler = getPreHandler();
        Object invoke = preHandler != null ? preHandler.invoke(null, new Object[0]) : null;
        if (!(invoke instanceof UncaughtExceptionHandler)) {
            invoke = null;
        }
        UncaughtExceptionHandler uncaughtExceptionHandler = (UncaughtExceptionHandler) invoke;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(currentThread, th);
        }
    }

    public Method invoke() {
        boolean z = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            C12932j.m33815a((Object) declaredMethod, "it");
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z = true;
            }
            if (z) {
                return declaredMethod;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
