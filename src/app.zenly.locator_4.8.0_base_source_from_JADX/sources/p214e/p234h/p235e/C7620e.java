package p214e.p234h.p235e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.FontResourcesParserCompat.C0546a;
import androidx.core.content.res.FontResourcesParserCompat.C0547b;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e.h.e.e */
class C7620e extends C7625j {

    /* renamed from: b */
    private static Class f19193b = null;

    /* renamed from: c */
    private static Constructor f19194c = null;

    /* renamed from: d */
    private static Method f19195d = null;

    /* renamed from: e */
    private static Method f19196e = null;

    /* renamed from: f */
    private static boolean f19197f = false;

    C7620e() {
    }

    /* renamed from: a */
    private static void mo19733a() {
        Method method;
        Class cls;
        Method method2;
        if (!f19197f) {
            f19197f = true;
            Constructor constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            f19194c = constructor;
            f19193b = cls;
            f19195d = method;
            f19196e = method2;
        }
    }

    /* renamed from: b */
    private static Object m18522b() {
        mo19733a();
        try {
            return f19194c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private File m18519a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("/proc/self/fd/");
            sb.append(parcelFileDescriptor.getFd());
            String readlink = Os.readlink(sb.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static Typeface mo19732a(Object obj) {
        mo19733a();
        try {
            Object newInstance = Array.newInstance(f19193b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f19196e.invoke(null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static boolean m18521a(Object obj, String str, int i, boolean z) {
        mo19733a();
        try {
            return ((Boolean) f19195d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004f, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0054, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r4.addSuppressed(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0058, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x005b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x005c, code lost:
        if (r5 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0066, code lost:
        throw r6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo19729a(android.content.Context r4, android.os.CancellationSignal r5, androidx.core.provider.C0575b.C0581f[] r6, int r7) {
        /*
            r3 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            androidx.core.provider.b$f r6 = r3.mo19741a(r6, r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.mo3198c()     // Catch:{ IOException -> 0x0067 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch:{ IOException -> 0x0067 }
            if (r5 != 0) goto L_0x0020
            if (r5 == 0) goto L_0x001f
            r5.close()     // Catch:{ IOException -> 0x0067 }
        L_0x001f:
            return r1
        L_0x0020:
            java.io.File r6 = r3.m18519a(r5)     // Catch:{ all -> 0x0059 }
            if (r6 == 0) goto L_0x0037
            boolean r7 = r6.canRead()     // Catch:{ all -> 0x0059 }
            if (r7 != 0) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r6)     // Catch:{ all -> 0x0059 }
            if (r5 == 0) goto L_0x0036
            r5.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0036:
            return r4
        L_0x0037:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0059 }
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch:{ all -> 0x0059 }
            r6.<init>(r7)     // Catch:{ all -> 0x0059 }
            android.graphics.Typeface r4 = super.mo19740a(r4, r6)     // Catch:{ all -> 0x004d }
            r6.close()     // Catch:{ all -> 0x0059 }
            if (r5 == 0) goto L_0x004c
            r5.close()     // Catch:{ IOException -> 0x0067 }
        L_0x004c:
            return r4
        L_0x004d:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x004f }
        L_0x004f:
            r7 = move-exception
            r6.close()     // Catch:{ all -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch:{ all -> 0x0059 }
        L_0x0058:
            throw r7     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x005b }
        L_0x005b:
            r6 = move-exception
            if (r5 == 0) goto L_0x0066
            r5.close()     // Catch:{ all -> 0x0062 }
            goto L_0x0066
        L_0x0062:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x0067 }
        L_0x0066:
            throw r6     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p214e.p234h.p235e.C7620e.mo19729a(android.content.Context, android.os.CancellationSignal, androidx.core.provider.b$f[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public Typeface mo19730a(Context context, C0546a aVar, Resources resources, int i) {
        Object b = m18522b();
        C0547b[] a = aVar.mo3082a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            C0547b bVar = a[i2];
            File a2 = C7629k.m18575a(context);
            if (a2 == null) {
                return null;
            }
            try {
                if (!C7629k.m18580a(a2, resources, bVar.mo3084b())) {
                    a2.delete();
                    return null;
                } else if (!m18521a(b, a2.getPath(), bVar.mo3087e(), bVar.mo3088f())) {
                    return null;
                } else {
                    a2.delete();
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                a2.delete();
            }
        }
        return mo19732a(b);
    }
}
