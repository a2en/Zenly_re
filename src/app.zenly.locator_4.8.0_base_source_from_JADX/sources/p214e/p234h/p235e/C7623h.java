package p214e.p234h.p235e;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e.h.e.h */
public class C7623h extends C7622g {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo19732a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f19202g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f19208m.invoke(null, new Object[]{newInstance, "sans-serif", Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Method mo19737d(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
