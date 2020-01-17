package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider.C0847a;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* renamed from: androidx.lifecycle.s */
public final class C0886s extends C0848b {

    /* renamed from: f */
    private static final Class<?>[] f3497f;

    /* renamed from: g */
    private static final Class<?>[] f3498g;

    /* renamed from: a */
    private final Application f3499a;

    /* renamed from: b */
    private final C0847a f3500b;

    /* renamed from: c */
    private final Bundle f3501c;

    /* renamed from: d */
    private final C0862g f3502d;

    /* renamed from: e */
    private final SavedStateRegistry f3503e;

    static {
        Class<C0884r> cls = C0884r.class;
        f3497f = new Class[]{Application.class, cls};
        f3498g = new Class[]{cls};
    }

    @SuppressLint({"LambdaLast"})
    public C0886s(Application application, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        this.f3503e = savedStateRegistryOwner.getSavedStateRegistry();
        this.f3502d = savedStateRegistryOwner.getLifecycle();
        this.f3501c = bundle;
        this.f3499a = application;
        this.f3500b = C0847a.m4004a(application);
    }

    /* renamed from: a */
    public <T extends C0889u> T mo4417a(String str, Class<T> cls) {
        Constructor constructor;
        T t;
        boolean isAssignableFrom = C0851a.class.isAssignableFrom(cls);
        if (isAssignableFrom) {
            constructor = m4083a(cls, f3497f);
        } else {
            constructor = m4083a(cls, f3498g);
        }
        if (constructor == null) {
            return this.f3500b.create(cls);
        }
        SavedStateHandleController a = SavedStateHandleController.m3996a(this.f3503e, this.f3502d, str, this.f3501c);
        if (isAssignableFrom) {
            try {
                t = (C0889u) constructor.newInstance(new Object[]{this.f3499a, a.mo4411a()});
            } catch (IllegalAccessException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to access ");
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (InstantiationException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("A ");
                sb2.append(cls);
                sb2.append(" cannot be instantiated.");
                throw new RuntimeException(sb2.toString(), e2);
            } catch (InvocationTargetException e3) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("An exception happened in constructor of ");
                sb3.append(cls);
                throw new RuntimeException(sb3.toString(), e3.getCause());
            }
        } else {
            t = (C0889u) constructor.newInstance(new Object[]{a.mo4411a()});
        }
        t.mo4498a("androidx.lifecycle.savedstate.vm.tag", a);
        return t;
    }

    public <T extends C0889u> T create(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo4417a(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: a */
    private static <T> Constructor<T> m4083a(Class<T> cls, Class<?>[] clsArr) {
        Constructor<T>[] constructors;
        for (Constructor<T> constructor : cls.getConstructors()) {
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4418a(C0889u uVar) {
        SavedStateHandleController.m3997a(uVar, this.f3503e, this.f3502d);
    }
}
