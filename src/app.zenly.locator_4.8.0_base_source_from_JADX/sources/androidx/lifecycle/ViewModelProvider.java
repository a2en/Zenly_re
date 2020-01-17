package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

public class ViewModelProvider {

    /* renamed from: a */
    private final Factory f3436a;

    /* renamed from: b */
    private final C0891w f3437b;

    public interface Factory {
        <T extends C0889u> T create(Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.ViewModelProvider$a */
    public static class C0847a extends C0849c {

        /* renamed from: c */
        private static C0847a f3438c;

        /* renamed from: b */
        private Application f3439b;

        public C0847a(Application application) {
            this.f3439b = application;
        }

        /* renamed from: a */
        public static C0847a m4004a(Application application) {
            if (f3438c == null) {
                f3438c = new C0847a(application);
            }
            return f3438c;
        }

        public <T extends C0889u> T create(Class<T> cls) {
            String str = "Cannot create an instance of ";
            if (!C0851a.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            try {
                return (C0889u) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.f3439b});
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(cls);
                throw new RuntimeException(sb2.toString(), e2);
            } catch (InstantiationException e3) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(cls);
                throw new RuntimeException(sb3.toString(), e3);
            } catch (InvocationTargetException e4) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(cls);
                throw new RuntimeException(sb4.toString(), e4);
            }
        }
    }

    /* renamed from: androidx.lifecycle.ViewModelProvider$b */
    static abstract class C0848b extends C0850d implements Factory {
        C0848b() {
        }

        /* renamed from: a */
        public abstract <T extends C0889u> T mo4417a(String str, Class<T> cls);

        public <T extends C0889u> T create(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }
    }

    /* renamed from: androidx.lifecycle.ViewModelProvider$c */
    public static class C0849c implements Factory {

        /* renamed from: a */
        private static C0849c f3440a;

        /* renamed from: a */
        static C0849c m4006a() {
            if (f3440a == null) {
                f3440a = new C0849c();
            }
            return f3440a;
        }

        public <T extends C0889u> T create(Class<T> cls) {
            String str = "Cannot create an instance of ";
            try {
                return (C0889u) cls.newInstance();
            } catch (InstantiationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(cls);
                throw new RuntimeException(sb2.toString(), e2);
            }
        }
    }

    /* renamed from: androidx.lifecycle.ViewModelProvider$d */
    static class C0850d {
        C0850d() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4418a(C0889u uVar) {
        }
    }

    public ViewModelProvider(ViewModelStoreOwner viewModelStoreOwner) {
        Factory factory;
        C0891w viewModelStore = viewModelStoreOwner.getViewModelStore();
        if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
            factory = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory();
        } else {
            factory = C0849c.m4006a();
        }
        this(viewModelStore, factory);
    }

    /* renamed from: a */
    public <T extends C0889u> T mo4415a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            return mo4416a(sb.toString(), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: a */
    public <T extends C0889u> T mo4416a(String str, Class<T> cls) {
        T t;
        T a = this.f3437b.mo4500a(str);
        if (cls.isInstance(a)) {
            Factory factory = this.f3436a;
            if (factory instanceof C0850d) {
                ((C0850d) factory).mo4418a(a);
            }
            return a;
        }
        Factory factory2 = this.f3436a;
        if (factory2 instanceof C0848b) {
            t = ((C0848b) factory2).mo4417a(str, cls);
        } else {
            t = factory2.create(cls);
        }
        this.f3437b.mo4502a(str, t);
        return t;
    }

    public ViewModelProvider(C0891w wVar, Factory factory) {
        this.f3436a = factory;
        this.f3437b = wVar;
    }
}
