package p214e.p215a.p216k.p217a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0271q;
import androidx.core.content.C0540a;
import androidx.core.content.res.C0549a;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

@SuppressLint({"RestrictedAPI"})
/* renamed from: e.a.k.a.a */
public final class C7531a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f18894a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C7532a>> f18895b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f18896c = new Object();

    /* renamed from: e.a.k.a.a$a */
    private static class C7532a {

        /* renamed from: a */
        final ColorStateList f18897a;

        /* renamed from: b */
        final Configuration f18898b;

        C7532a(ColorStateList colorStateList, Configuration configuration) {
            this.f18897a = colorStateList;
            this.f18898b = configuration;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m18129a(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f18896c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<e.a.k.a.a$a>> r1 = f18895b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            e.a.k.a.a$a r2 = (p214e.p215a.p216k.p217a.C7531a.C7532a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f18898b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f18897a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p214e.p215a.p216k.p217a.C7531a.m18129a(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: b */
    public static ColorStateList m18132b(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList a = m18129a(context, i);
        if (a != null) {
            return a;
        }
        ColorStateList d = m18134d(context, i);
        if (d == null) {
            return C0540a.m2543b(context, i);
        }
        m18131a(context, i, d);
        return d;
    }

    /* renamed from: c */
    public static Drawable m18133c(Context context, int i) {
        return C0271q.m1117a().mo1994a(context, i);
    }

    /* renamed from: d */
    private static ColorStateList m18134d(Context context, int i) {
        if (m18135e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C0549a.m2581a(resources, (XmlPullParser) resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: e */
    private static boolean m18135e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a = m18130a();
        resources.getValue(i, a, true);
        int i2 = a.type;
        if (i2 < 28 || i2 > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m18131a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f18896c) {
            SparseArray sparseArray = (SparseArray) f18895b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f18895b.put(context, sparseArray);
            }
            sparseArray.append(i, new C7532a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: a */
    private static TypedValue m18130a() {
        TypedValue typedValue = (TypedValue) f18894a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f18894a.set(typedValue2);
        return typedValue2;
    }
}
