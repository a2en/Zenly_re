package p214e.p234h.p235e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.FontResourcesParserCompat.C0546a;
import androidx.core.content.res.FontResourcesParserCompat.C0547b;
import androidx.core.provider.C0575b.C0581f;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p214e.p228e.C7584g;

/* renamed from: e.h.e.f */
class C7621f extends C7625j {

    /* renamed from: b */
    private static final Class f19198b;

    /* renamed from: c */
    private static final Constructor f19199c;

    /* renamed from: d */
    private static final Method f19200d;

    /* renamed from: e */
    private static final Method f19201e;

    static {
        Method method;
        Method method2;
        Class cls;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f19199c = constructor;
        f19198b = cls;
        f19200d = method;
        f19201e = method2;
    }

    C7621f() {
    }

    /* renamed from: a */
    public static boolean m18526a() {
        if (f19200d == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f19200d != null;
    }

    /* renamed from: b */
    private static Object m18528b() {
        try {
            return f19199c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m18527a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f19200d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static Typeface m18525a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f19198b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f19201e.invoke(null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Typeface mo19729a(Context context, CancellationSignal cancellationSignal, C0581f[] fVarArr, int i) {
        Object b = m18528b();
        if (b == null) {
            return null;
        }
        C7584g gVar = new C7584g();
        for (C0581f fVar : fVarArr) {
            Uri c = fVar.mo3198c();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(c);
            if (byteBuffer == null) {
                byteBuffer = C7629k.m18577a(context, cancellationSignal, c);
                gVar.put(c, byteBuffer);
            }
            if (byteBuffer == null || !m18527a(b, byteBuffer, fVar.mo3197b(), fVar.mo3199d(), fVar.mo3200e())) {
                return null;
            }
        }
        Typeface a = m18525a(b);
        if (a == null) {
            return null;
        }
        return Typeface.create(a, i);
    }

    /* renamed from: a */
    public Typeface mo19730a(Context context, C0546a aVar, Resources resources, int i) {
        C0547b[] a;
        Object b = m18528b();
        if (b == null) {
            return null;
        }
        for (C0547b bVar : aVar.mo3082a()) {
            ByteBuffer a2 = C7629k.m18576a(context, resources, bVar.mo3084b());
            if (a2 == null || !m18527a(b, a2, bVar.mo3085c(), bVar.mo3087e(), bVar.mo3088f())) {
                return null;
            }
        }
        return m18525a(b);
    }
}
