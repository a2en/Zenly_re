package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: okio.t */
public class C13368t {

    /* renamed from: d */
    public static final C13368t f34674d = new C13369a();

    /* renamed from: a */
    private boolean f34675a;

    /* renamed from: b */
    private long f34676b;

    /* renamed from: c */
    private long f34677c;

    /* renamed from: okio.t$a */
    class C13369a extends C13368t {
        C13369a() {
        }

        /* renamed from: a */
        public C13368t mo38541a(long j) {
            return this;
        }

        /* renamed from: a */
        public C13368t mo38542a(long j, TimeUnit timeUnit) {
            return this;
        }

        /* renamed from: e */
        public void mo38546e() throws IOException {
        }
    }

    /* renamed from: a */
    public C13368t mo38542a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("timeout < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (timeUnit != null) {
            this.f34677c = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: b */
    public C13368t mo38543b() {
        this.f34677c = 0;
        return this;
    }

    /* renamed from: c */
    public long mo38544c() {
        if (this.f34675a) {
            return this.f34676b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: d */
    public boolean mo38545d() {
        return this.f34675a;
    }

    /* renamed from: e */
    public void mo38546e() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f34675a && this.f34676b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: f */
    public long mo38547f() {
        return this.f34677c;
    }

    /* renamed from: a */
    public C13368t mo38541a(long j) {
        this.f34675a = true;
        this.f34676b = j;
        return this;
    }

    /* renamed from: a */
    public C13368t mo38540a() {
        this.f34675a = false;
        return this;
    }
}
