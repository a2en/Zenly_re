package p214e.p234h.p235e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.FontResourcesParserCompat.C0546a;
import androidx.core.content.res.FontResourcesParserCompat.C0547b;
import androidx.core.provider.C0575b.C0581f;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: e.h.e.j */
class C7625j {

    /* renamed from: a */
    private ConcurrentHashMap<Long, C0546a> f19209a = new ConcurrentHashMap<>();

    /* renamed from: e.h.e.j$a */
    class C7626a implements C7628c<C0581f> {
        C7626a(C7625j jVar) {
        }

        /* renamed from: a */
        public int mo19745b(C0581f fVar) {
            return fVar.mo3199d();
        }

        /* renamed from: b */
        public boolean mo19744a(C0581f fVar) {
            return fVar.mo3200e();
        }
    }

    /* renamed from: e.h.e.j$b */
    class C7627b implements C7628c<C0547b> {
        C7627b(C7625j jVar) {
        }

        /* renamed from: a */
        public int mo19745b(C0547b bVar) {
            return bVar.mo3087e();
        }

        /* renamed from: b */
        public boolean mo19744a(C0547b bVar) {
            return bVar.mo3088f();
        }
    }

    /* renamed from: e.h.e.j$c */
    private interface C7628c<T> {
        /* renamed from: a */
        boolean mo19744a(T t);

        /* renamed from: b */
        int mo19745b(T t);
    }

    C7625j() {
    }

    /* renamed from: a */
    private static <T> T m18556a(T[] tArr, int i, C7628c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.mo19745b(t2) - i2) * 2) + (cVar.mo19744a(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: b */
    private static long m18558b(Typeface typeface) {
        String str = "Could not retrieve font from family.";
        String str2 = "TypefaceCompatBaseImpl";
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e(str2, str, e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e(str2, str, e2);
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0581f mo19741a(C0581f[] fVarArr, int i) {
        return (C0581f) m18556a(fVarArr, i, new C7626a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo19740a(Context context, InputStream inputStream) {
        File a = C7629k.m18575a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C7629k.m18581a(a, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    public Typeface mo19729a(Context context, CancellationSignal cancellationSignal, C0581f[] fVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo19741a(fVarArr, i).mo3198c());
            try {
                Typeface a = mo19740a(context, inputStream);
                C7629k.m18579a((Closeable) inputStream);
                return a;
            } catch (IOException unused) {
                C7629k.m18579a((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C7629k.m18579a((Closeable) inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C7629k.m18579a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C7629k.m18579a((Closeable) inputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    private C0547b m18555a(C0546a aVar, int i) {
        return (C0547b) m18556a(aVar.mo3082a(), i, new C7627b(this));
    }

    /* renamed from: a */
    public Typeface mo19730a(Context context, C0546a aVar, Resources resources, int i) {
        C0547b a = m18555a(aVar, i);
        if (a == null) {
            return null;
        }
        Typeface a2 = C7619d.m18511a(context, resources, a.mo3084b(), a.mo3083a(), i);
        m18557a(a2, aVar);
        return a2;
    }

    /* renamed from: a */
    public Typeface mo19731a(Context context, Resources resources, int i, String str, int i2) {
        File a = C7629k.m18575a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C7629k.m18580a(a, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0546a mo19742a(Typeface typeface) {
        long b = m18558b(typeface);
        if (b == 0) {
            return null;
        }
        return (C0546a) this.f19209a.get(Long.valueOf(b));
    }

    /* renamed from: a */
    private void m18557a(Typeface typeface, C0546a aVar) {
        long b = m18558b(typeface);
        if (b != 0) {
            this.f19209a.put(Long.valueOf(b), aVar);
        }
    }
}
