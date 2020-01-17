package p389io.reactivex.p390h;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: io.reactivex.h.a */
public abstract class C12292a implements Disposable {

    /* renamed from: e */
    private final AtomicBoolean f31965e = new AtomicBoolean();

    /* renamed from: io.reactivex.h.a$a */
    class C12293a implements Runnable {
        C12293a() {
        }

        public void run() {
            C12292a.this.mo6944a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6944a();

    public final void dispose() {
        if (!this.f31965e.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mo6944a();
        } else {
            C12295a.m32802a().mo6570a(new C12293a());
        }
    }

    public final boolean isDisposed() {
        return this.f31965e.get();
    }
}
