package androidx.dynamicanimation.animation;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import java.util.ArrayList;
import p214e.p228e.C7584g;

/* renamed from: androidx.dynamicanimation.animation.a */
class C0717a {

    /* renamed from: g */
    public static final ThreadLocal<C0717a> f3002g = new ThreadLocal<>();

    /* renamed from: a */
    private final C7584g<C0719b, Long> f3003a = new C7584g<>();

    /* renamed from: b */
    final ArrayList<C0719b> f3004b = new ArrayList<>();

    /* renamed from: c */
    private final C0718a f3005c = new C0718a();

    /* renamed from: d */
    private C0720c f3006d;

    /* renamed from: e */
    long f3007e = 0;

    /* renamed from: f */
    private boolean f3008f = false;

    /* renamed from: androidx.dynamicanimation.animation.a$a */
    class C0718a {
        C0718a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3662a() {
            C0717a.this.f3007e = SystemClock.uptimeMillis();
            C0717a aVar = C0717a.this;
            aVar.mo3659a(aVar.f3007e);
            if (C0717a.this.f3004b.size() > 0) {
                C0717a.this.mo3658a().mo3663a();
            }
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.a$b */
    interface C0719b {
        /* renamed from: a */
        boolean mo3616a(long j);
    }

    /* renamed from: androidx.dynamicanimation.animation.a$c */
    static abstract class C0720c {

        /* renamed from: a */
        final C0718a f3010a;

        C0720c(C0718a aVar) {
            this.f3010a = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo3663a();
    }

    /* renamed from: androidx.dynamicanimation.animation.a$d */
    private static class C0721d extends C0720c {

        /* renamed from: b */
        private final Runnable f3011b = new C0722a();

        /* renamed from: c */
        private final Handler f3012c = new Handler(Looper.myLooper());

        /* renamed from: d */
        long f3013d = -1;

        /* renamed from: androidx.dynamicanimation.animation.a$d$a */
        class C0722a implements Runnable {
            C0722a() {
            }

            public void run() {
                C0721d.this.f3013d = SystemClock.uptimeMillis();
                C0721d.this.f3010a.mo3662a();
            }
        }

        C0721d(C0718a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3663a() {
            this.f3012c.postDelayed(this.f3011b, Math.max(10 - (SystemClock.uptimeMillis() - this.f3013d), 0));
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.a$e */
    private static class C0723e extends C0720c {

        /* renamed from: b */
        private final Choreographer f3015b = Choreographer.getInstance();

        /* renamed from: c */
        private final FrameCallback f3016c = new C0724a();

        /* renamed from: androidx.dynamicanimation.animation.a$e$a */
        class C0724a implements FrameCallback {
            C0724a() {
            }

            public void doFrame(long j) {
                C0723e.this.f3010a.mo3662a();
            }
        }

        C0723e(C0718a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3663a() {
            this.f3015b.postFrameCallback(this.f3016c);
        }
    }

    C0717a() {
    }

    /* renamed from: b */
    private boolean m3391b(C0719b bVar, long j) {
        Long l = (Long) this.f3003a.get(bVar);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.f3003a.remove(bVar);
        return true;
    }

    /* renamed from: c */
    public static C0717a m3392c() {
        if (f3002g.get() == null) {
            f3002g.set(new C0717a());
        }
        return (C0717a) f3002g.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0720c mo3658a() {
        if (this.f3006d == null) {
            if (VERSION.SDK_INT >= 16) {
                this.f3006d = new C0723e(this.f3005c);
            } else {
                this.f3006d = new C0721d(this.f3005c);
            }
        }
        return this.f3006d;
    }

    /* renamed from: b */
    private void m3390b() {
        if (this.f3008f) {
            for (int size = this.f3004b.size() - 1; size >= 0; size--) {
                if (this.f3004b.get(size) == null) {
                    this.f3004b.remove(size);
                }
            }
            this.f3008f = false;
        }
    }

    /* renamed from: a */
    public void mo3661a(C0719b bVar, long j) {
        if (this.f3004b.size() == 0) {
            mo3658a().mo3663a();
        }
        if (!this.f3004b.contains(bVar)) {
            this.f3004b.add(bVar);
        }
        if (j > 0) {
            this.f3003a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* renamed from: a */
    public void mo3660a(C0719b bVar) {
        this.f3003a.remove(bVar);
        int indexOf = this.f3004b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f3004b.set(indexOf, null);
            this.f3008f = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3659a(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f3004b.size(); i++) {
            C0719b bVar = (C0719b) this.f3004b.get(i);
            if (bVar != null && m3391b(bVar, uptimeMillis)) {
                bVar.mo3616a(j);
            }
        }
        m3390b();
    }
}
