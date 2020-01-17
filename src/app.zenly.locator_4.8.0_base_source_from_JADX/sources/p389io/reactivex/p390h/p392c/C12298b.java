package p389io.reactivex.p390h.p392c;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12286f.C12289c;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.h.c.b */
final class C12298b extends C12286f {

    /* renamed from: b */
    private final Handler f31971b;

    /* renamed from: c */
    private final boolean f31972c;

    /* renamed from: io.reactivex.h.c.b$a */
    private static final class C12299a extends C12289c {

        /* renamed from: e */
        private final Handler f31973e;

        /* renamed from: f */
        private final boolean f31974f;

        /* renamed from: g */
        private volatile boolean f31975g;

        C12299a(Handler handler, boolean z) {
            this.f31973e = handler;
            this.f31974f = z;
        }

        @SuppressLint({"NewApi"})
        /* renamed from: a */
        public Disposable mo6576a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.f31975g) {
                return C12276c.m32592a();
            } else {
                C12300b bVar = new C12300b(this.f31973e, C12768a.m33405a(runnable));
                Message obtain = Message.obtain(this.f31973e, bVar);
                obtain.obj = this;
                if (this.f31974f) {
                    obtain.setAsynchronous(true);
                }
                this.f31973e.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.f31975g) {
                    return bVar;
                }
                this.f31973e.removeCallbacks(bVar);
                return C12276c.m32592a();
            }
        }

        public void dispose() {
            this.f31975g = true;
            this.f31973e.removeCallbacksAndMessages(this);
        }

        public boolean isDisposed() {
            return this.f31975g;
        }
    }

    /* renamed from: io.reactivex.h.c.b$b */
    private static final class C12300b implements Runnable, Disposable {

        /* renamed from: e */
        private final Handler f31976e;

        /* renamed from: f */
        private final Runnable f31977f;

        /* renamed from: g */
        private volatile boolean f31978g;

        C12300b(Handler handler, Runnable runnable) {
            this.f31976e = handler;
            this.f31977f = runnable;
        }

        public void dispose() {
            this.f31976e.removeCallbacks(this);
            this.f31978g = true;
        }

        public boolean isDisposed() {
            return this.f31978g;
        }

        public void run() {
            try {
                this.f31977f.run();
            } catch (Throwable th) {
                C12768a.m33415b(th);
            }
        }
    }

    C12298b(Handler handler, boolean z) {
        this.f31971b = handler;
        this.f31972c = z;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public Disposable mo6572a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            C12300b bVar = new C12300b(this.f31971b, C12768a.m33405a(runnable));
            Message obtain = Message.obtain(this.f31971b, bVar);
            if (this.f31972c) {
                obtain.setAsynchronous(true);
            }
            this.f31971b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    /* renamed from: a */
    public C12289c mo6573a() {
        return new C12299a(this.f31971b, this.f31972c);
    }
}
