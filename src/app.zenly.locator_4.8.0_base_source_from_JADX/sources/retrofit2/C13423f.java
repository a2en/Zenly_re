package retrofit2;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import retrofit2.CallAdapter.C13388a;

/* renamed from: retrofit2.f */
class C13423f {

    /* renamed from: a */
    private static final C13423f f34810a = m35523b();

    /* renamed from: retrofit2.f$a */
    static class C13424a extends C13423f {

        /* renamed from: retrofit2.f$a$a */
        static class C13425a implements Executor {

            /* renamed from: a */
            private final Handler f34811a = new Handler(Looper.getMainLooper());

            C13425a() {
            }

            public void execute(Runnable runnable) {
                this.f34811a.post(runnable);
            }
        }

        C13424a() {
        }

        /* renamed from: a */
        public Executor mo38650a() {
            return new C13425a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C13388a mo38651a(Executor executor) {
            if (executor != null) {
                return new C13398c(executor);
            }
            throw new AssertionError();
        }
    }

    /* renamed from: retrofit2.f$b */
    static class C13426b extends C13423f {
        C13426b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo38652a(Method method) {
            return method.isDefault();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Object mo38649a(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            Constructor declaredConstructor = Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return ((Lookup) declaredConstructor.newInstance(new Object[]{cls, Integer.valueOf(-1)})).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }
    }

    C13423f() {
    }

    /* renamed from: b */
    private static C13423f m35523b() {
        try {
            Class.forName("android.os.Build");
            if (VERSION.SDK_INT != 0) {
                return new C13424a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new C13426b();
        } catch (ClassNotFoundException unused2) {
            return new C13423f();
        }
    }

    /* renamed from: c */
    static C13423f m35524c() {
        return f34810a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Executor mo38650a() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13388a mo38651a(Executor executor) {
        if (executor != null) {
            return new C13398c(executor);
        }
        return C13396b.f34759a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo38652a(Method method) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Object mo38649a(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        throw new UnsupportedOperationException();
    }
}
