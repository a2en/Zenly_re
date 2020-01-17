package p389io.reactivex.p390h.p392c;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Callable;
import p389io.reactivex.C12286f;
import p389io.reactivex.p390h.p391b.C12294a;

/* renamed from: io.reactivex.h.c.a */
public final class C12295a {

    /* renamed from: a */
    private static final C12286f f31969a = C12294a.m32801b(new C12296a());

    /* renamed from: io.reactivex.h.c.a$a */
    static class C12296a implements Callable<C12286f> {
        C12296a() {
        }

        public C12286f call() throws Exception {
            return C12297b.f31970a;
        }
    }

    /* renamed from: io.reactivex.h.c.a$b */
    private static final class C12297b {

        /* renamed from: a */
        static final C12286f f31970a = new C12298b(new Handler(Looper.getMainLooper()), false);
    }

    /* renamed from: a */
    public static C12286f m32802a() {
        return C12294a.m32796a(f31969a);
    }

    /* renamed from: a */
    public static C12286f m32803a(Looper looper) {
        return m32804a(looper, false);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static C12286f m32804a(Looper looper, boolean z) {
        if (looper != null) {
            int i = VERSION.SDK_INT;
            if (i < 16) {
                z = false;
            } else if (z && i < 22) {
                Message obtain = Message.obtain();
                try {
                    obtain.setAsynchronous(true);
                } catch (NoSuchMethodError unused) {
                    z = false;
                }
                obtain.recycle();
            }
            return new C12298b(new Handler(looper), z);
        }
        throw new NullPointerException("looper == null");
    }
}
