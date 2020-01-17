package p333g.p369e.p372c.p373b;

import android.os.Looper;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.C12276c;

/* renamed from: g.e.c.b.b */
public final class C12108b {
    /* renamed from: a */
    public static void m31969a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: a */
    public static boolean m31970a(Observer<?> observer) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        observer.onSubscribe(C12276c.m32595b());
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to be called on the main thread but was ");
        sb.append(Thread.currentThread().getName());
        observer.onError(new IllegalStateException(sb.toString()));
        return false;
    }
}
