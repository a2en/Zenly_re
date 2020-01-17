package p214e.p222b.p223a.p224a;

import java.util.concurrent.Executor;

/* renamed from: e.b.a.a.a */
public class C7551a extends C7556c {

    /* renamed from: c */
    private static volatile C7551a f18967c;

    /* renamed from: d */
    private static final Executor f18968d = new C7552a();

    /* renamed from: e */
    private static final Executor f18969e = new C7553b();

    /* renamed from: a */
    private C7556c f18970a = this.f18971b;

    /* renamed from: b */
    private C7556c f18971b = new C7554b();

    /* renamed from: e.b.a.a.a$a */
    static class C7552a implements Executor {
        C7552a() {
        }

        public void execute(Runnable runnable) {
            C7551a.m18218c().mo19437c(runnable);
        }
    }

    /* renamed from: e.b.a.a.a$b */
    static class C7553b implements Executor {
        C7553b() {
        }

        public void execute(Runnable runnable) {
            C7551a.m18218c().mo19435a(runnable);
        }
    }

    private C7551a() {
    }

    /* renamed from: b */
    public static Executor m18217b() {
        return f18969e;
    }

    /* renamed from: c */
    public static C7551a m18218c() {
        if (f18967c != null) {
            return f18967c;
        }
        synchronized (C7551a.class) {
            if (f18967c == null) {
                f18967c = new C7551a();
            }
        }
        return f18967c;
    }

    /* renamed from: d */
    public static Executor m18219d() {
        return f18968d;
    }

    /* renamed from: a */
    public void mo19435a(Runnable runnable) {
        this.f18970a.mo19435a(runnable);
    }

    /* renamed from: a */
    public boolean mo19436a() {
        return this.f18970a.mo19436a();
    }

    /* renamed from: c */
    public void mo19437c(Runnable runnable) {
        this.f18970a.mo19437c(runnable);
    }
}
