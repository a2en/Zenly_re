package okhttp3.p418f0;

/* renamed from: okhttp3.f0.d */
public abstract class C13183d implements Runnable {

    /* renamed from: e */
    protected final String f33854e;

    public C13183d(String str, Object... objArr) {
        this.f33854e = C13184e.m34490a(str, objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo37873b();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f33854e);
        try {
            mo37873b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
