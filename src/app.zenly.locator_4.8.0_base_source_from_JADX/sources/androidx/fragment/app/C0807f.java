package androidx.fragment.app;

import androidx.fragment.app.Fragment.InstantiationException;
import p214e.p228e.C7584g;

/* renamed from: androidx.fragment.app.f */
public class C0807f {

    /* renamed from: a */
    private static final C7584g<String, Class<?>> f3279a = new C7584g<>();

    /* renamed from: b */
    static boolean m3786b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m3787c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m3787c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        Class<?> cls = (Class) f3279a.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        f3279a.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m3788d(ClassLoader classLoader, String str) {
        String str2 = "Unable to instantiate fragment ";
        try {
            return m3787c(classLoader, str);
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append(": make sure class name exists");
            throw new InstantiationException(sb.toString(), e);
        } catch (ClassCastException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            sb2.append(": make sure class is a valid subclass of Fragment");
            throw new InstantiationException(sb2.toString(), e2);
        }
    }

    /* renamed from: a */
    public Fragment mo4142a(ClassLoader classLoader, String str) {
        throw null;
    }
}
